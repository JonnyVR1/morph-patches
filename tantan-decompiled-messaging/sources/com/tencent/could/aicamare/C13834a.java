package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;

/* JADX INFO: renamed from: com.tencent.could.aicamare.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13834a implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13837d f57222a;

    public C13834a(C13837d c13837d) {
        this.f57222a = c13837d;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        this.f57222a.f57231e = false;
        this.f57222a.m82186a("cameraFocus focus: " + z);
        CameraEventListener cameraEventListener = this.f57222a.f57228b;
        if (cameraEventListener != null) {
            cameraEventListener.onAutoFocusSucceed();
        }
    }
}
