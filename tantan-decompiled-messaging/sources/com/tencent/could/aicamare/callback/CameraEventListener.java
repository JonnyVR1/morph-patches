package com.tencent.could.aicamare.callback;

/* JADX INFO: loaded from: classes2.dex */
public interface CameraEventListener {
    void onAutoFocusSucceed();

    void onCameraClosed();

    void onCameraSucceed();

    void onDataFrameCallBack(byte[] bArr);

    void onEventError(int i, String str);

    void onPreviewSucceed();
}
