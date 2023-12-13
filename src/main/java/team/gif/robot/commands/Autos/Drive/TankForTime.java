package team.gif.robot.commands.Autos.Drive;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;

public class TankForTime extends CommandBase {

    double left;
    double right;
    double time;
    public TankForTime(double leftinput, double rightinput, double inputtime) {
        super();
        addRequirements(Robot.drivetrain); // uncomment
        left = leftinput;
        right = rightinput;
        time = Timer.getFPGATimestamp();
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.drivetrain.tankDrive(left,right);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {

        return (Timer.getFPGATimestamp() > time);
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.drivetrain.tankDrive(0,0);
    }
}
