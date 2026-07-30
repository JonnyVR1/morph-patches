package com.tencent.could.aicamare;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.aicamare.entity.C13838a;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.aicamare.util.CameraLogger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.aicamare.d */
/* JADX INFO: loaded from: classes2.dex */
public class C13837d {

    /* JADX INFO: renamed from: a */
    public C13838a f57227a = new C13838a();

    /* JADX INFO: renamed from: b */
    public CameraEventListener f57228b;

    /* JADX INFO: renamed from: c */
    public CameraLoggerCallBack f57229c;

    /* JADX INFO: renamed from: d */
    public CameraConfig f57230d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f57231e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Context> f57232f;

    /* JADX INFO: renamed from: a */
    public boolean m82187a(Camera camera) {
        if (!this.f57230d.isByteDataBuffer()) {
            camera.setPreviewCallback(new C13835b(this, camera));
            return true;
        }
        camera.setPreviewCallbackWithBuffer(new C13836c(this, camera));
        Camera.Size size = this.f57227a.f57236d;
        if (size != null) {
            camera.addCallbackBuffer(new byte[((size.width * size.height) * ImageFormat.getBitsPerPixel(17)) / 8]);
            return true;
        }
        m82184a(3, "current size is null");
        CameraLogger.m82191b("CameraHolderImp", "start Preview buffer happen error!", this.f57229c);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m82188b(String str) {
        CameraLogger.m82191b("CameraHolderImp", str, this.f57229c);
    }

    /* JADX INFO: renamed from: a */
    public void m82186a(String str) {
        CameraLogger.m82189a("CameraHolderImp", str, this.f57229c);
    }

    /* JADX INFO: renamed from: a */
    public void m82185a(Context context) {
        if (context == null) {
            CameraLogger.m82191b("CameraHolderImp", "set context input a null", this.f57229c);
            return;
        }
        WeakReference<Context> weakReference = this.f57232f;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            this.f57232f = new WeakReference<>(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m82184a(int i, String str) {
        CameraEventListener cameraEventListener = this.f57228b;
        if (cameraEventListener != null) {
            cameraEventListener.onEventError(i, str);
            return;
        }
        m82188b("sendEventError, code: " + i + " msg: " + str);
    }
}
