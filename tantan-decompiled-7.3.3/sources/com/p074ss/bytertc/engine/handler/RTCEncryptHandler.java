package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class RTCEncryptHandler {
    private static final String TAG = "RtcEngineEncryptHandler";
    private IRTCEncryptionHandler mCustomizeEncryptHandler;

    public RTCEncryptHandler(IRTCEncryptionHandler iRTCEncryptionHandler) {
        this.mCustomizeEncryptHandler = iRTCEncryptionHandler;
    }

    @CalledByNative
    public byte[] onDecryptData(byte[] bArr) {
        LogUtil.m82083d(TAG, "onDecryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onDecryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onDecryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }

    @CalledByNative
    public byte[] onEncryptData(byte[] bArr) {
        LogUtil.m82083d(TAG, "onEncryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onEncryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m82083d(TAG, "onEncryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }
}
