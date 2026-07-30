package com.p069ss.bytertc.engine.video;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface IVideoDeviceManager {
    List<VideoDeviceInfo> enumerateVideoCaptureDevices();

    int setVideoCaptureDevice(String str);
}
