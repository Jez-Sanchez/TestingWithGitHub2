// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {
  private double speed;
  private final DriveTrain DriveTrain;
  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(DriveTrain driveTrain, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.speed = speed;
    this.DriveTrain = driveTrain;
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double forward = RobotContainer.controller1.getLeftY() * speed;
    double turn = RobotContainer.controller1.getRightX() * speed;
    RobotContainer.driveTrain.ArcadeDrive(forward, turn);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.driveTrain.ArcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
