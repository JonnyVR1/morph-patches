package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class RTCEncryptHandler {
    private static final String TAG = "RtcEngineEncryptHandler";
    private IRTCEncryptionHandler mCustomizeEncryptHandler;

    public RTCEncryptHandler(IRTCEncryptionHandler iRTCEncryptionHandler) {
        this.mCustomizeEncryptHandler = iRTCEncryptionHandler;
    }

    @CalledByNative
    public byte[] onDecryptData(byte[] bArr) {
        LogUtil.m80900d(TAG, "onDecryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onDecryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onDecryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }

    @CalledByNative
    public byte[] onEncryptData(byte[] bArr) {
        LogUtil.m80900d(TAG, "onEncryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onEncryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onEncryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }
}
