package net.owexz.PaintedStone.Cobblestone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public OrangeCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Orange Cobblestone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1749389.png", 16));
    }
}