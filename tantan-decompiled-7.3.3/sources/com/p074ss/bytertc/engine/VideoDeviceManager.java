package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.IVideoDeviceManager;
import com.p074ss.bytertc.engine.video.VideoDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class VideoDeviceManager implements IVideoDeviceManager {
    private static final String TAG = "VideoDeviceManager";
    private long mVideoDevicemanager;

    public VideoDeviceManager(long j) {
        this.mVideoDevicemanager = j;
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoDeviceManager
    public List<VideoDeviceInfo> enumerateVideoCaptureDevices() {
        long j = this.mVideoDevicemanager;
        if (j != 0) {
            return NativeVideoDeviceManagerFunctions.nativeEnumerateVideoCaptureDevices(j);
        }
        LogUtil.m82084e(TAG, "native VideoDeviceManager is invalid, enumerateVideoCaptureDevices failed.");
        return null;
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoDeviceManager
    public int setVideoCaptureDevice(String str) {
        long j = this.mVideoDevicemanager;
        if (j != 0) {
            return NativeVideoDeviceManagerFunctions.nativeSetVideoCaptureDevice(j, str);
        }
        LogUtil.m82084e(TAG, "native VideoDeviceManager is invalid, setVideoCaptureDevice failed.");
        return -1;
    }
}
