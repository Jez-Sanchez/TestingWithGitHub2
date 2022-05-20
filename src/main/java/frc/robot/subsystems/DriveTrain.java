// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  public final CANSparkMax leftMotor1 = new CANSparkMax(Constants.leftDriveMotor1, MotorType.kBrushless);
  public final CANSparkMax leftMotor2 = new CANSparkMax(Constants.leftDriveMotor2, MotorType.kBrushless);
  public final CANSparkMax rightMotor1 = new CANSparkMax(Constants.rightDriveMotor1, MotorType.kBrushless);
  public final CANSparkMax rightMotor2 = new CANSparkMax(Constants.rightDriveMotor2, MotorType.kBrushless);
  MotorControllerGroup left = new MotorControllerGroup(leftMotor1, leftMotor2);
  MotorControllerGroup right = new MotorControllerGroup(rightMotor1, rightMotor2);
  DifferentialDrive driver = new DifferentialDrive(left, right);
  public DriveTrain() {
    left.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void ArcadeDrive(double forward, double turn){
    driver.arcadeDrive(-forward, turn, false);
  }
}
