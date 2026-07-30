package com.p069ss.bytertc.engine.meeting;

import android.view.Surface;
import com.p069ss.bytertc.engine.InternalVideoEncoderConfig;
import com.p069ss.bytertc.engine.NativeRTCVideoFunctions;
import com.p069ss.bytertc.engine.RTCEngine;
import com.p069ss.bytertc.engine.RTCRoom;
import com.p069ss.bytertc.engine.RTCRoomImpl;
import com.p069ss.bytertc.engine.SubscribeVideoBaseline;
import com.p069ss.bytertc.engine.VideoEncoderConfig;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p069ss.bytertc.engine.type.SubscribeMode;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.engine.video.IAmazingEffect;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class MeetingAdvance {
    protected static final String TAG = "MeetingAdvance";
    private static Method mGetAmazingEffectMethod;
    private static Method mGetNativeMethod;
    private static Method mGetNativeVideoMethod;

    public static int enableAutoSubscribe(RTCRoom rTCRoom, SubscribeMode subscribeMode, SubscribeMode subscribeMode2) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle > 0) {
            return NativeRTCVideoFunctions.nativeEnableAutoSubscribe(nativeRoomHandle, subscribeMode.value(), subscribeMode2.value());
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, enableAutoSubscribe failed.");
        return -1;
    }

    public static int enableRescaleAudioVolume(RTCRoom rTCRoom, boolean z) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeEenableRescaleAudioVolume(nativeRoomHandle, z);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, enableRescaleAudioVolume failed.");
        return -1;
    }

    public static int enableSimulcastMode(RTCEngine rTCEngine, boolean z) {
        long nativeVideoHandle = getNativeVideoHandle(rTCEngine);
        if (nativeVideoHandle != 0) {
            return NativeRTCVideoFunctions.nativeEnableSimulcastMode(nativeVideoHandle, z);
        }
        LogUtil.m80901e(TAG, "video native handle is invalid, enableSimulcastMode failed.");
        return -1;
    }

    public static IAmazingEffect getAmazingEffectInterface(RTCEngine rTCEngine) {
        if (mGetAmazingEffectMethod == null) {
            try {
                int i = RTCEngineImpl.f55631a;
                mGetAmazingEffectMethod = RTCEngineImpl.class.getMethod("getAmazingEffectInterface", null);
            } catch (Exception unused) {
                LogUtil.m80901e(TAG, "fail to find method getAmazingEffectInterface");
            }
        }
        Method method = mGetAmazingEffectMethod;
        if (method == null) {
            return null;
        }
        try {
            return (IAmazingEffect) method.invoke(rTCEngine, null);
        } catch (Exception unused2) {
            LogUtil.m80901e(TAG, "fail to invoke method getAmazingEffectInterface");
            return null;
        }
    }

    public static int getDownlinkNetworkBandwidthEstimationStatus(RTCRoom rTCRoom) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle > 0) {
            return NativeRTCVideoFunctions.nativeGetDownlinkNetworkBandwidthEstimationStatus(nativeRoomHandle);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, getUplinkNetworkBandwidthEstimationStatus failed.");
        return -1;
    }

    private static long getNativeRoomHandle(RTCRoom rTCRoom) {
        if (mGetNativeMethod == null) {
            try {
                mGetNativeMethod = RTCRoomImpl.class.getMethod("getNativeHandle", null);
            } catch (Exception unused) {
                LogUtil.m80901e(TAG, "fail to find method getNativeHandle");
            }
        }
        Method method = mGetNativeMethod;
        if (method == null) {
            return 0L;
        }
        try {
            return ((Long) method.invoke(rTCRoom, null)).longValue();
        } catch (Exception unused2) {
            LogUtil.m80901e(TAG, "fail to invoke method getNativeHandle");
            return 0L;
        }
    }

    private static long getNativeVideoHandle(RTCEngine rTCEngine) {
        if (mGetNativeVideoMethod == null) {
            try {
                int i = RTCEngineImpl.f55631a;
                mGetNativeVideoMethod = RTCEngineImpl.class.getMethod("getNativeHandle", null);
            } catch (Exception unused) {
                LogUtil.m80901e(TAG, "fail to find method getNativeHandle");
            }
        }
        Method method = mGetNativeVideoMethod;
        if (method == null) {
            return 0L;
        }
        try {
            return ((Long) method.invoke(rTCEngine, null)).longValue();
        } catch (Exception unused2) {
            LogUtil.m80901e(TAG, "fail to invoke method getNativeHandle");
            return 0L;
        }
    }

    public static int getUplinkNetworkBandwidthEstimationStatus(RTCRoom rTCRoom) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle > 0) {
            return NativeRTCVideoFunctions.nativeGetUplinkNetworkBandwidthEstimationStatus(nativeRoomHandle);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, getUplinkNetworkBandwidthEstimationStatus failed.");
        return -1;
    }

    public static boolean isStreamUnpublished(RTCRoom rTCRoom, int i) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeIsStreamUnpublished(nativeRoomHandle, i);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, isStreamUnpublished failed.");
        return false;
    }

    public static void resetScreenVideoConfigs(RTCEngine rTCEngine) {
        long nativeVideoHandle = getNativeVideoHandle(rTCEngine);
        if (nativeVideoHandle == 0) {
            LogUtil.m80901e(TAG, "video native handle is invalid, resetScreenVideoConfigs failed.");
        } else {
            NativeRTCVideoFunctions.nativeResetScreenVideoConfigs(nativeVideoHandle);
        }
    }

    public static void setExternalSurface(RTCEngine rTCEngine, RemoteStreamKey remoteStreamKey, Surface surface) {
        long nativeVideoHandle = getNativeVideoHandle(rTCEngine);
        if (nativeVideoHandle == 0) {
            LogUtil.m80901e(TAG, "room native handle is invalid, setExternalSurface failed.");
            return;
        }
        LogUtil.m80903i(TAG, "setExternalSurface, roomId:" + remoteStreamKey.roomId + ", userId: " + remoteStreamKey.userId + ", index: " + remoteStreamKey.streamIndex + ", externalSurface:" + surface);
        NativeRTCVideoFunctions.nativeSetExternalSurface(nativeVideoHandle, remoteStreamKey.roomId, remoteStreamKey.userId, remoteStreamKey.streamIndex.value(), surface);
    }

    public static int setPublishChannel(RTCRoom rTCRoom, String str) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetPublishChannel(nativeRoomHandle, str);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, setPublishChannel failed.");
        return -1;
    }

    public static int setPublishSpecialStream(RTCRoom rTCRoom, StreamIndex streamIndex, int i) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetPublishSpecialStreamWithStreamIndex(nativeRoomHandle, streamIndex.value(), i);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, setPublishSpecialStream failed.");
        return -1;
    }

    public static void setScreenVideoConfigs(RTCEngine rTCEngine) {
        long nativeVideoHandle = getNativeVideoHandle(rTCEngine);
        if (nativeVideoHandle == 0) {
            LogUtil.m80901e(TAG, "video native handle is invalid, setScreenVideoConfigs failed.");
        } else {
            NativeRTCVideoFunctions.nativeSetScreenVideoConfigs(nativeVideoHandle);
        }
    }

    public static void setSubscribeBaselineData(RTCRoom rTCRoom, String str, boolean z, SubscribeVideoBaseline subscribeVideoBaseline) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle == 0) {
            LogUtil.m80901e(TAG, "room native handle is invalid, setSubscribeBaselineData failed.");
        } else {
            NativeRTCVideoFunctions.nativeSetSubscribeBaselineData(nativeRoomHandle, str, z, subscribeVideoBaseline);
        }
    }

    public static int setSubscribeChannels(RTCRoom rTCRoom, String[] strArr, boolean z) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetSubscribeChannels(nativeRoomHandle, strArr, z);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, setSubscribeChannels failed.");
        return -1;
    }

    public static int setSubscribeSpecialStream(RTCRoom rTCRoom, int[] iArr) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetSubscribeSpecialStream(nativeRoomHandle, iArr);
        }
        LogUtil.m80901e(TAG, "room native handle is invalid, setSubscribeSpecialStream failed.");
        return -1;
    }

    public static int setVideoEncoderConfig(RTCEngine rTCEngine, List<VideoEncoderConfig> list, List<VideoEncoderConfig> list2) {
        LogUtil.m80900d(TAG, "setVideoEncoderConfig ");
        long nativeVideoHandle = getNativeVideoHandle(rTCEngine);
        if (nativeVideoHandle == 0) {
            LogUtil.m80901e(TAG, "room native handle is invalid, isMuteLocalVideo failed.");
            return -1;
        }
        if (list == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoEncoderConfig videoEncoderConfig : list) {
            if (!videoEncoderConfig.isValid()) {
                LogUtil.m80901e(TAG, "setVideoEncoderConfig with illegal params");
                return -1;
            }
            arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
        }
        if (list2 == null) {
            return NativeRTCVideoFunctions.nativeSetVideoEncoderConfigWithMain(nativeVideoHandle, arrayList, null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (VideoEncoderConfig videoEncoderConfig2 : list2) {
            if (!videoEncoderConfig2.isValid()) {
                LogUtil.m80901e(TAG, "setVideoEncoderConfig with illegal params");
                return -1;
            }
            arrayList2.add(new InternalVideoEncoderConfig(videoEncoderConfig2));
        }
        return NativeRTCVideoFunctions.nativeSetVideoEncoderConfigWithMain(nativeVideoHandle, arrayList, arrayList2);
    }

    public static void writeLog(String str, int i, String str2, String str3, String str4) {
        NativeRTCVideoFunctions.nativeWriteLog(str, i, str2, str3, str4);
    }

    @Deprecated
    public static int setPublishSpecialStream(RTCRoom rTCRoom, int i) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle == 0) {
            LogUtil.m80901e(TAG, "room native handle is invalid, setPublishSpecialStream failed.");
            return -1;
        }
        return NativeRTCVideoFunctions.nativeSetPublishSpecialStream(nativeRoomHandle, i);
    }
}
