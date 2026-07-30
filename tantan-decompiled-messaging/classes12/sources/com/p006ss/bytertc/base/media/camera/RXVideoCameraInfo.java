package com.p006ss.bytertc.base.media.camera;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RXVideoCameraInfo {
    private static final int CAMERA_BACK = 1;
    private static final int CAMERA_EXTERNAL = 2;
    private static final int CAMERA_FRONT = 0;
    private static final int CAMERA_INVALID = 3;
    private static final String TAG = "RXVideoCameraInfo";
    private ArrayList<DeviceInfo> deviceInfos;

    public class DeviceInfo {
        int cameraId;
        String name;

        public DeviceInfo() {
        }
    }

    @CalledByNative
    public RXVideoCameraInfo() {
        RXLogging.i(TAG, "RXVideoCameraInfo Created...");
        this.deviceInfos = new ArrayList<>();
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true, false);
            for (String str : camera1Enumerator.getDeviceNames()) {
                DeviceInfo deviceInfo = new DeviceInfo();
                deviceInfo.name = str;
                if (camera1Enumerator.isFrontFacing(str)) {
                    deviceInfo.cameraId = 0;
                } else if (camera1Enumerator.isBackFacing(str)) {
                    deviceInfo.cameraId = 1;
                } else {
                    deviceInfo.cameraId = 2;
                }
                this.deviceInfos.add(deviceInfo);
            }
        } catch (IllegalArgumentException e) {
            RXLogging.i(TAG, "Create VideoCapture failed : " + e.getMessage());
        }
    }

    @CalledByNative
    public int getCameraId(int i) {
        if (i >= this.deviceInfos.size()) {
            return 3;
        }
        return this.deviceInfos.get(i).cameraId;
    }

    @CalledByNative
    public String getDeviceName(int i) {
        if (i >= this.deviceInfos.size()) {
            return null;
        }
        return this.deviceInfos.get(i).name;
    }

    @CalledByNative
    public int getDeviceNumbers() {
        return this.deviceInfos.size();
    }
}
