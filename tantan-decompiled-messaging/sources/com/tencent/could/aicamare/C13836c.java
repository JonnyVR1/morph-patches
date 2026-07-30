package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.util.CameraLogger;

/* JADX INFO: renamed from: com.tencent.could.aicamare.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13836c implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Camera f57225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13837d f57226b;

    public C13836c(C13837d c13837d, Camera camera) {
        this.f57226b = c13837d;
        this.f57225a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera camera2 = this.f57225a;
        C13837d c13837d = this.f57226b;
        if (camera2 == null) {
            CameraLogger.m82191b("CameraHolderImp", "currentCamera is null!", c13837d.f57229c);
            return;
        }
        CameraEventListener cameraEventListener = c13837d.f57228b;
        if (cameraEventListener != null) {
            cameraEventListener.onDataFrameCallBack(bArr);
        }
        this.f57225a.addCallbackBuffer(bArr);
    }
}
