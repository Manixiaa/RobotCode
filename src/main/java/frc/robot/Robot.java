package frc.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.Wheels;

public class Robot extends TimedRobot 
{
  
  //Container
  public static RobotContainer m_robotContainer;

  //Subsystems
  

  //Navx
  public static AHRS m_ahrs;


  public Robot() 
  {

    //Subsystems
    Wheels wheels = new Wheels();
    
    //Container
    m_robotContainer = new RobotContainer();

  }
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {}

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}