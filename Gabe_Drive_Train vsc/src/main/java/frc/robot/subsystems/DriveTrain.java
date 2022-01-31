// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  WPI_TalonFX frontLeftController, frontRightController, backLeftController, backRightController;
  /** Creates a new DriveTrain. */
  public DriveTrain() 
  {
    frontLeftController = new WPI_TalonFX(Constants.LEFT_FRONT_MOTOR);
    frontRightController = new WPI_TalonFX(Constants.RIGHT_FRONT_MOTOR);
    backLeftController = new WPI_TalonFX(Constants.LEFT_BACK_MOTOR);
    backRightController = new WPI_TalonFX(Constants.RIGHT_BACK_MOTOR);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
