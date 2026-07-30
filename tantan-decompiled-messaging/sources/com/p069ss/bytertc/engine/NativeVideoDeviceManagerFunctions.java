package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.video.VideoDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class NativeVideoDeviceManagerFunctions {
    public static native List<VideoDeviceInfo> nativeEnumerateVideoCaptureDevices(long j);

    public static native int nativeSetVideoCaptureDevice(long j, String str);
}
