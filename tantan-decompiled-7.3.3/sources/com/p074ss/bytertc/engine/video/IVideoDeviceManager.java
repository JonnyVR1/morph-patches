package com.p074ss.bytertc.engine.video;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IVideoDeviceManager {
    List<VideoDeviceInfo> enumerateVideoCaptureDevices();

    int setVideoCaptureDevice(String str);
}
