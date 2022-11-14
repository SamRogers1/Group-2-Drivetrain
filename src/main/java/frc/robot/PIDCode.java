package frc.robot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.Drivetrain;

public class PIDCode {}

// public class PIDCode extends PIDCommand{
//     public PIDCode(Drivetrain drive, double meters){
//         super(
//             new PIDController( 0.001, 0, 0),
//             () -> {
//             return drive.getPose().getX();
//             },
//             meters + drive.getPose().getX(),
//             output -> {
//                 drive.arcadeDrive(output, 0, false);
//             },
//             drive
//             );
//         }
//     }





