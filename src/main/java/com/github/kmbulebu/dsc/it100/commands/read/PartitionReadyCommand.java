package com.github.kmbulebu.dsc.it100.commands.read;

import com.github.kmbulebu.dsc.it100.commands.ICommandHelp;

public class PartitionReadyCommand extends BasePartitionCommand implements
		ICommandHelp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6061154668565761211L;
	
	public static final String CODE = "650";

	public String getDescription() {
		return "This command indicates that the partition can now be armed (all zones restored, no troubles, etc). Also issued at the end of Bell Timeout if the par- tition was READY when an alarm occurred.";
	}

	@Override
	public String toString() {
		return "PartitionReadyCommand [toString()=" + super.toString() + "]";
	}

}
