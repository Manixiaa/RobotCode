package frc.robot;

public final class Constants {
    
    public static class CANIds 
    {
        public static final int leftWheelMotor = 1;
        public static final int rightWheelMotor = 2;
    }

    public static class DIO 
    {
        public static int wheelLimitSwitch = 1;
    }

    public static class Wheels
    {
        public static int leftWheelMotor = CANIds.leftWheelMotor;
        public static int rightWheelMotor = CANIds.rightWheelMotor;

        public static double WheelForwardSpeed = 1;
        public static double WheelBackwardSpeed = -1;
    }
    
}



