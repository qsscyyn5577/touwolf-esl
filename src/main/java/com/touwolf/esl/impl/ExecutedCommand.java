
package com.touwolf.esl.impl;

public class ExecutedCommand
{
    private String name;

    private String command;

    public ExecutedCommand(String name, String command)
    {
        this.name = name;
        this.command = command;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }
}
