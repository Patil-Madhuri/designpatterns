package com.bridgelabz.designpattern.proxypattern;

import java.io.IOException;

public interface CommandExecutor 
{
	public void runCommand(String command) throws IOException, Exception;
}
