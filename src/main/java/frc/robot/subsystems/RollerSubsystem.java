// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;
import frc.robot.RobotContainer;

public class RollerSubsystem extends SubsystemBase {
  public static final CANSparkMax RollerMotor = new CANSparkMax(Constants.rollerMotor, MotorType.kBrushed);
  /** Creates a new ExampleSubsystem. */
  public RollerSubsystem() {
    //public final CANSparkMax RollerMotor = new CANSparkMax(Constants.rollerMotor)
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void setRollerMotors(double speed){
    RollerSubsystem.RollerMotor.set(speed);
  }
}
