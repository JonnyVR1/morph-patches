package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.video.VideoDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class NativeVideoDeviceManagerFunctions {
    public static native List<VideoDeviceInfo> nativeEnumerateVideoCaptureDevices(long j);

    public static native int nativeSetVideoCaptureDevice(long j, String str);
}
