package com.tencent.could.aicamare;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.aicamare.entity.C14001a;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.aicamare.util.CameraLogger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.aicamare.d */
/* JADX INFO: loaded from: classes12.dex */
public class C14000d {

    /* JADX INFO: renamed from: a */
    public C14001a f58075a = new C14001a();

    /* JADX INFO: renamed from: b */
    public CameraEventListener f58076b;

    /* JADX INFO: renamed from: c */
    public CameraLoggerCallBack f58077c;

    /* JADX INFO: renamed from: d */
    public CameraConfig f58078d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f58079e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Context> f58080f;

    /* JADX INFO: renamed from: a */
    public boolean m83370a(Camera camera) {
        if (!this.f58078d.isByteDataBuffer()) {
            camera.setPreviewCallback(new C13998b(this, camera));
            return true;
        }
        camera.setPreviewCallbackWithBuffer(new C13999c(this, camera));
        Camera.Size size = this.f58075a.f58084d;
        if (size != null) {
            camera.addCallbackBuffer(new byte[((size.width * size.height) * ImageFormat.getBitsPerPixel(17)) / 8]);
            return true;
        }
        m83367a(3, "current size is null");
        CameraLogger.m83374b("CameraHolderImp", "start Preview buffer happen error!", this.f58077c);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m83371b(String str) {
        CameraLogger.m83374b("CameraHolderImp", str, this.f58077c);
    }

    /* JADX INFO: renamed from: a */
    public void m83369a(String str) {
        CameraLogger.m83372a("CameraHolderImp", str, this.f58077c);
    }

    /* JADX INFO: renamed from: a */
    public void m83368a(Context context) {
        if (context == null) {
            CameraLogger.m83374b("CameraHolderImp", "set context input a null", this.f58077c);
            return;
        }
        WeakReference<Context> weakReference = this.f58080f;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            this.f58080f = new WeakReference<>(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m83367a(int i, String str) {
        CameraEventListener cameraEventListener = this.f58076b;
        if (cameraEventListener != null) {
            cameraEventListener.onEventError(i, str);
            return;
        }
        m83371b("sendEventError, code: " + i + " msg: " + str);
    }
}
