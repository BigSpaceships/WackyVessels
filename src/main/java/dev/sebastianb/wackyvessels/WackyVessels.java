package dev.sebastianb.wackyvessels;

import dev.sebastianb.wackyvessels.entity.WackyVesselsEntityTypes;
import net.fabricmc.api.ModInitializer;

public class WackyVessels implements ModInitializer {

    @Override
    public void onInitialize() {
        WackyVesselsEntityTypes.register();
    }

}
