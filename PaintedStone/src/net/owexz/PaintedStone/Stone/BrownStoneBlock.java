package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownStoneBlock extends GenericCubeCustomBlock
{
 
    public BrownStoneBlock(Plugin plugin)
    {
        super(plugin, "Brown Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/9251445.png", 16));
    }
}