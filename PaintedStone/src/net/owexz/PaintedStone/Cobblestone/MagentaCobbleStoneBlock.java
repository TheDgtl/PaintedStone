package net.owexz.PaintedStone.Cobblestone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public MagentaCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Magenta Cobblestone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1755093.png", 16));
    }
}