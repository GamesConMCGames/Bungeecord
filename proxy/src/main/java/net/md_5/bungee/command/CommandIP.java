package net.md_5.bungee.command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class CommandIP extends PlayerCommand
{

    public CommandIP()
    {
        super( "seen", "command.ip" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        if ( args.length < 1 )
        {
            sender.sendMessage( ChatColor.BLUE + "Please follow this command by a user name" );
            return;
        }
        ProxiedPlayer user = ProxyServer.getInstance().getPlayer( args[0] );
        if ( user == null )
        {
            sender.sendMessage( ChatColor.GREEN + "That user is not online" );
        } else
        {
            sender.sendMessage( ChatColor.BLUE + "The internet protocol (IP) of" + args[0] + " is " + user.getAddress() );
        }
    }
}
