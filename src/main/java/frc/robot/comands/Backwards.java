package frc.robot.comands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Wheels;

public class Backwards extends CommandBase{
    
    public Backwards()
    {
        this.addRequirements(Robot.wheels);
    }

    public void execute()
    {
        if(Robot.wheels.getLeftWheelMotorPosition() >= -10)
        {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.REVERSED);
            Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.REVERSED);
        }
        else
        {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.OFF);
            Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.OFF);
        }
    }

    public void end(boolean interrupted)
    {
        Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.OFF);
        Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.OFF);
    }



}
