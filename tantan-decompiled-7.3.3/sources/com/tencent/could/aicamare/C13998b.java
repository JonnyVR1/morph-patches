package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.util.CameraLogger;

/* JADX INFO: renamed from: com.tencent.could.aicamare.b */
/* JADX INFO: loaded from: classes12.dex */
public class C13998b implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Camera f58071a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14000d f58072b;

    public C13998b(C14000d c14000d, Camera camera) {
        this.f58072b = c14000d;
        this.f58071a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera camera2 = this.f58071a;
        C14000d c14000d = this.f58072b;
        if (camera2 == null) {
            CameraLogger.m83374b("CameraHolderImp", "currentCamera is null!", c14000d.f58077c);
            return;
        }
        CameraEventListener cameraEventListener = c14000d.f58076b;
        if (cameraEventListener != null) {
            cameraEventListener.onDataFrameCallBack(bArr);
        }
    }
}
