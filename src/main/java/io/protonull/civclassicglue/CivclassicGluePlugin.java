package io.protonull.civclassicglue;

import vg.civcraft.mc.civmodcore.ACivMod;

public final class CivclassicGluePlugin extends ACivMod {

	@Override
	public void onEnable() {
		this.useNewCommandHandler = false;
		super.onEnable();
	}

	@Override
	public void onDisable() {
		super.onDisable();
	}

}
