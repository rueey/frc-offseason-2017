package org.usfirst.frc.team6135.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6135.robot.Robot;

/**
 *
 */
public class StopClimber extends Command {

    public StopClimber() {
        requires(Robot.climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.climber.isOn = true;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climber.set(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climber.isOn = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
