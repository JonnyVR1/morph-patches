package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.IWTNStreamEventHandler;
import com.p069ss.bytertc.engine.InternalRemoteAudioStats;
import com.p069ss.bytertc.engine.InternalRemoteVideoStats;
import com.p069ss.bytertc.engine.WTNStream;
import com.p069ss.bytertc.engine.data.DataMessageSourceType;
import com.p069ss.bytertc.engine.data.VideoFrameInfo;
import com.p069ss.bytertc.engine.data.WTNSubscribeState;
import com.p069ss.bytertc.engine.data.WTNSubscribeStateChangeReason;
import com.p069ss.bytertc.engine.type.RemoteAudioStats;
import com.p069ss.bytertc.engine.type.RemoteVideoStats;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class NativeWTNStreamEventHandler {
    private static final String TAG = "NativeWTNStreamEventHandler";
    private WeakReference<WTNStream> mWTNStream;

    public NativeWTNStreamEventHandler(WTNStream wTNStream) {
        this.mWTNStream = new WeakReference<>(wTNStream);
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @CalledByNative
    public void onWTNAudioSubscribeStateChanged(String str, WTNSubscribeState wTNSubscribeState, WTNSubscribeStateChangeReason wTNSubscribeStateChangeReason) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        LogUtil.m80900d(TAG, "onWTNAudioSubscribeStateChanged state(" + wTNSubscribeState + ") state(" + wTNSubscribeStateChangeReason + ") streamId:" + str);
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNAudioSubscribeStateChanged(str, wTNSubscribeState, wTNSubscribeStateChangeReason);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNAudioSubscribeStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNDataMessageReceived(String str, ByteBuffer byteBuffer, int i) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNDataMessageReceived(str, byteBuffer, DataMessageSourceType.fromId(i));
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNDataMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNFirstRemoteAudioFrame(String str) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        LogUtil.m80900d(TAG, "onWTNFirstRemoteAudioFrame...streamid: " + str);
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNFirstRemoteAudioFrame(str);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNFirstRemoteVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        LogUtil.m80900d(TAG, "onWTNFirstRemoteVideoFrameDecoded...streamid: " + str + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNFirstRemoteVideoFrameDecoded(str, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNFirstRemoteVideoFrameDecoded callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNRemoteAudioStats(String str, InternalRemoteAudioStats internalRemoteAudioStats) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        LogUtil.m80900d(TAG, "onWTNRemoteAudioStats, streamid" + str);
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNRemoteAudioStats(str, new RemoteAudioStats(internalRemoteAudioStats));
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNRemoteAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNRemoteVideoStats(String str, InternalRemoteVideoStats internalRemoteVideoStats) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        LogUtil.m80900d(TAG, "onWTNRemoteVideoStats, streamid" + str);
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNRemoteVideoStats(str, new RemoteVideoStats(internalRemoteVideoStats));
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNRemoteVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNSEIMessageReceived(String str, int i, ByteBuffer byteBuffer) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNSEIMessageReceived(str, i, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNSEIMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onWTNVideoSubscribeStateChanged(String str, WTNSubscribeState wTNSubscribeState, WTNSubscribeStateChangeReason wTNSubscribeStateChangeReason) {
        IWTNStreamEventHandler wTNStreamEventHandler;
        LogUtil.m80900d(TAG, "onWTNVideoSubscribeStateChanged state(" + wTNSubscribeState + ") state(" + wTNSubscribeStateChangeReason + ") streamId:" + str);
        try {
            WTNStream wTNStream = this.mWTNStream.get();
            if (wTNStream == null || (wTNStreamEventHandler = wTNStream.getWTNStreamEventHandler()) == null) {
                return;
            }
            wTNStreamEventHandler.onWTNVideoSubscribeStateChanged(str, wTNSubscribeState, wTNSubscribeStateChangeReason);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWTNVideoSubscribeStateChanged callback catch exception.\n" + e.getMessage());
        }
    }
}
