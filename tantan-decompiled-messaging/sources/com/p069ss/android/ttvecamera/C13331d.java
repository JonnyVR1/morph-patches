package com.p069ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.cjh0;
import p149l.wjh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.d */
/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class C13331d {

    /* JADX INFO: renamed from: a */
    protected TECameraSettings f55491a;

    /* JADX INFO: renamed from: b */
    protected b f55492b;

    /* JADX INFO: renamed from: c */
    protected e f55493c = null;

    /* JADX INFO: renamed from: d */
    protected Map<String, Bundle> f55494d = new HashMap();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.d$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.d$b */
    public interface b {
        void onCaptureStarted(int i, int i2);

        void onCaptureStopped(int i);

        void onError(int i, String str);

        void onInfo(int i, int i2, String str);
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.d$c */
    public static class c implements b {
        private static volatile c INSTANCE;

        /* JADX INFO: renamed from: a */
        public static c m80697a() {
            c cVar;
            synchronized (c.class) {
                try {
                    if (INSTANCE == null) {
                        synchronized (c.class) {
                            INSTANCE = new c();
                        }
                    }
                    cVar = INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cVar;
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onCaptureStarted(int i, int i2) {
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onCaptureStopped(int i) {
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onError(int i, String str) {
        }

        @Override // com.p069ss.android.ttvecamera.C13331d.b
        public void onInfo(int i, int i2, String str) {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.d$d */
    public interface d {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.d$e */
    public interface e {
        TEFrameSizei getPreviewSize(List<TEFrameSizei> list);
    }

    public C13331d(@NonNull b bVar, d dVar) {
        this.f55492b = c.m80697a();
        this.f55492b = bVar;
        wjh0.m203447c(false);
    }

    /* JADX INFO: renamed from: n */
    public static void m80675n(byte b2, C13341g.b bVar) {
        C13341g.m80821h(bVar);
        C13341g.m80822i("VESDK", b2);
    }

    /* JADX INFO: renamed from: a */
    public int m80676a(cjh0.C16167a c16167a) {
        return TECameraServer.INSTANCE.addCameraProvider(this, c16167a);
    }

    /* JADX INFO: renamed from: b */
    public int m80677b(TECameraSettings tECameraSettings) {
        return m80678c(tECameraSettings, null);
    }

    /* JADX INFO: renamed from: c */
    public int m80678c(TECameraSettings tECameraSettings, Cert cert) {
        this.f55491a = tECameraSettings;
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        tECameraServer.registerPreviewSizeListener(this.f55493c);
        return tECameraServer.connect(this, this.f55492b, this.f55491a, null, cert);
    }

    /* JADX INFO: renamed from: d */
    public int m80679d() {
        return m80680e(null);
    }

    /* JADX INFO: renamed from: e */
    public int m80680e(Cert cert) {
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        return tECameraServer.disConnect(this, cert);
    }

    /* JADX INFO: renamed from: f */
    public int m80681f(TEFocusSettings tEFocusSettings) {
        tEFocusSettings.m80530q();
        return TECameraServer.INSTANCE.focusAtPoint(this, tEFocusSettings);
    }

    /* JADX INFO: renamed from: g */
    public TECameraSettings.C13303d m80682g() {
        return TECameraServer.INSTANCE.getCameraECInfo(this);
    }

    /* JADX INFO: renamed from: h */
    public int m80683h(TECameraSettings.InterfaceC13306g interfaceC13306g) {
        return TECameraServer.INSTANCE.getISO(this, interfaceC13306g);
    }

    /* JADX INFO: renamed from: i */
    public boolean m80684i() {
        return TECameraServer.INSTANCE.isSupportedExposureCompensation(this);
    }

    /* JADX INFO: renamed from: j */
    public boolean m80685j() {
        return TECameraServer.INSTANCE.isTorchSupported(this);
    }

    /* JADX INFO: renamed from: k */
    public void m80686k(Bundle bundle) {
        TECameraSettings tECameraSettings = this.f55491a;
        if (tECameraSettings == null) {
            C13341g.m80815b("TECameraCapture", "query features failed, maybe not connet");
        } else {
            m80687l(tECameraSettings.f55308H, bundle);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m80687l(String str, Bundle bundle) {
        TECameraServer.INSTANCE.queryFeatures(str, bundle);
    }

    /* JADX INFO: renamed from: m */
    public int m80688m(TECameraSettings.InterfaceC13315p interfaceC13315p, boolean z) {
        return TECameraServer.INSTANCE.queryZoomAbility(this, interfaceC13315p, z);
    }

    /* JADX INFO: renamed from: o */
    public void m80689o(e eVar) {
        this.f55493c = eVar;
    }

    /* JADX INFO: renamed from: p */
    public int m80690p() {
        return TECameraServer.INSTANCE.removeCameraProvider(this);
    }

    /* JADX INFO: renamed from: q */
    public void m80691q(int i) {
        TECameraServer.INSTANCE.setExposureCompensation(this, i);
    }

    /* JADX INFO: renamed from: r */
    public int m80692r() {
        return TECameraServer.INSTANCE.start(this);
    }

    /* JADX INFO: renamed from: s */
    public int m80693s(float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        return TECameraServer.INSTANCE.startZoom(this, f, interfaceC13315p);
    }

    /* JADX INFO: renamed from: t */
    public int m80694t() {
        return m80695u(false);
    }

    /* JADX INFO: renamed from: u */
    public int m80695u(boolean z) {
        return TECameraServer.INSTANCE.stop(this, z);
    }

    /* JADX INFO: renamed from: v */
    public int m80696v(boolean z) {
        return TECameraServer.INSTANCE.toggleTorch(this, z);
    }
}
