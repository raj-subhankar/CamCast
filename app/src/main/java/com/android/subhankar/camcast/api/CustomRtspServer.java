package com.android.subhankar.camcast.api;

import com.android.subhankar.camcast.streaming.Session;
import com.android.subhankar.camcast.streaming.rtsp.RtspServer;

public class CustomRtspServer extends RtspServer {
	public CustomRtspServer() {
		super();
		// RTSP server disabled by default
		mEnabled = false;
	}
}

