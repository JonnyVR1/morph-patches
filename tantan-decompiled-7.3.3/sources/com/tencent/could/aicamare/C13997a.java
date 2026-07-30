package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;

/* JADX INFO: renamed from: com.tencent.could.aicamare.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13997a implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14000d f58070a;

    public C13997a(C14000d c14000d) {
        this.f58070a = c14000d;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        this.f58070a.f58079e = false;
        this.f58070a.m83369a("cameraFocus focus: " + z);
        CameraEventListener cameraEventListener = this.f58070a.f58076b;
        if (cameraEventListener != null) {
            cameraEventListener.onAutoFocusSucceed();
        }
    }
}
