package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Wheels extends SubsystemBase {
    
    public enum LeftWheelMotorState
    {
        ON,
        OFF,
        REVERSED,
    }
    
    public enum RightWheelMotorState
    {
        ON,
        OFF,
        REVERSED,
    }

    public CANSparkMax LeftWheelMotor = new CANSparkMax(Constants.Wheels.leftWheelMotor, MotorType.kBrushless);
    public CANSparkMax RightWheelMotor = new CANSparkMax(Constants.Wheels.rightWheelMotor, MotorType.kBrushless);

    public DigitalInput wheelLimitSwitch = new DigitalInput(Constants.DIO.wheelLimitSwitch);

    public LeftWheelMotorState leftwheelMotor = LeftWheelMotorState.OFF;
    public RightWheelMotorState rightwheelMotor = RightWheelMotorState.OFF;

    public Wheels()
    {
        this.LeftWheelMotor.setIdleMode(IdleMode.kBrake);
        this.RightWheelMotor.setIdleMode(IdleMode.kBrake);

        this.LeftWheelMotor.setSmartCurrentLimit(40);
        this.RightWheelMotor.setSmartCurrentLimit(40);
    }

    public void setLeftWheelMotorState(LeftWheelMotorState state)
    {
        this.leftwheelMotor = state;

        switch(state)
        {
            case ON:

            this.LeftWheelMotor.set(Constants.Wheels.WheelForwardSpeed);
            break;
        case OFF:
            this.LeftWheelMotor.set(Constants.Wheels.WheelBackwardSpeed);
            break;
        case REVERSED:
            this.LeftWheelMotor.set(Constants.Wheels.WheelBackwardSpeed);
            break;
        default:
            this.setLeftWheelMotorState(LeftWheelMotorState.OFF);

        }
    }

    public void setRightWheelMotorState(RightWheelMotorState state)
    {
        this.rightwheelMotor = state;

        switch(state)
        {
            case ON:

            this.RightWheelMotor.set(Constants.Wheels.WheelForwardSpeed);
            break;
        case OFF:
            this.RightWheelMotor.set(Constants.Wheels.WheelBackwardSpeed);
            break;
        case REVERSED:
            this.RightWheelMotor.set(Constants.Wheels.WheelBackwardSpeed);
            break;
        default:
            this.setRightWheelMotorState(RightWheelMotorState.OFF);

        }

    
    }

    public double getLeftWheelMotorPosition()
    {
        return this.LeftWheelMotor.getEncoder().getPosition();
    }

    public double getRightWheelMotorPosition()
    {
        return this.RightWheelMotor.getEncoder().getPosition();
    }

    public boolean getWheelSwitch()
    {
        return this.wheelLimitSwitch.get();
    }


}