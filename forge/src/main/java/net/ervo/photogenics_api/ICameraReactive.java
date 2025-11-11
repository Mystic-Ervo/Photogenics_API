package net.ervo.photogenics_api;

import io.github.mortuusars.exposure.forge.api.event.ShutterOpeningEvent;

public interface ICameraReactive {

	public void onShutterOpen(ShutterOpeningEvent event);

	public void onShutterClose();
}
