package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.util.CameraLogger;

/* JADX INFO: renamed from: com.tencent.could.aicamare.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13835b implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Camera f57223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13837d f57224b;

    public C13835b(C13837d c13837d, Camera camera) {
        this.f57224b = c13837d;
        this.f57223a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera camera2 = this.f57223a;
        C13837d c13837d = this.f57224b;
        if (camera2 == null) {
            CameraLogger.m82191b("CameraHolderImp", "currentCamera is null!", c13837d.f57229c);
            return;
        }
        CameraEventListener cameraEventListener = c13837d.f57228b;
        if (cameraEventListener != null) {
            cameraEventListener.onDataFrameCallBack(bArr);
        }
    }
}
