package com.p008ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p009l.cjh0;
import p009l.wjh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class C0733d {

    /* JADX INFO: renamed from: a */
    protected TECameraSettings f9097a;

    /* JADX INFO: renamed from: b */
    protected b f9098b;

    /* JADX INFO: renamed from: c */
    protected e f9099c = null;

    /* JADX INFO: renamed from: d */
    protected Map<String, Bundle> f9100d = new HashMap();

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
        public static c m11048a() {
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

        @Override // com.p008ss.android.ttvecamera.C0733d.b
        public void onCaptureStarted(int i, int i2) {
        }

        @Override // com.p008ss.android.ttvecamera.C0733d.b
        public void onCaptureStopped(int i) {
        }

        @Override // com.p008ss.android.ttvecamera.C0733d.b
        public void onError(int i, String str) {
        }

        @Override // com.p008ss.android.ttvecamera.C0733d.b
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

    public C0733d(@NonNull b bVar, d dVar) {
        this.f9098b = c.m11048a();
        this.f9098b = bVar;
        wjh0.m24291c(false);
    }

    /* JADX INFO: renamed from: n */
    public static void m11026n(byte b2, C0743g.b bVar) {
        C0743g.m11172h(bVar);
        C0743g.m11173i("VESDK", b2);
    }

    /* JADX INFO: renamed from: a */
    public int m11027a(cjh0.C0813a c0813a) {
        return TECameraServer.INSTANCE.addCameraProvider(this, c0813a);
    }

    /* JADX INFO: renamed from: b */
    public int m11028b(TECameraSettings tECameraSettings) {
        return m11029c(tECameraSettings, null);
    }

    /* JADX INFO: renamed from: c */
    public int m11029c(TECameraSettings tECameraSettings, Cert cert) {
        this.f9097a = tECameraSettings;
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        tECameraServer.registerPreviewSizeListener(this.f9099c);
        return tECameraServer.connect(this, this.f9098b, this.f9097a, null, cert);
    }

    /* JADX INFO: renamed from: d */
    public int m11030d() {
        return m11031e(null);
    }

    /* JADX INFO: renamed from: e */
    public int m11031e(Cert cert) {
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        return tECameraServer.disConnect(this, cert);
    }

    /* JADX INFO: renamed from: f */
    public int m11032f(TEFocusSettings tEFocusSettings) {
        tEFocusSettings.m10881q();
        return TECameraServer.INSTANCE.focusAtPoint(this, tEFocusSettings);
    }

    /* JADX INFO: renamed from: g */
    public TECameraSettings.C0705d m11033g() {
        return TECameraServer.INSTANCE.getCameraECInfo(this);
    }

    /* JADX INFO: renamed from: h */
    public int m11034h(TECameraSettings.InterfaceC0708g interfaceC0708g) {
        return TECameraServer.INSTANCE.getISO(this, interfaceC0708g);
    }

    /* JADX INFO: renamed from: i */
    public boolean m11035i() {
        return TECameraServer.INSTANCE.isSupportedExposureCompensation(this);
    }

    /* JADX INFO: renamed from: j */
    public boolean m11036j() {
        return TECameraServer.INSTANCE.isTorchSupported(this);
    }

    /* JADX INFO: renamed from: k */
    public void m11037k(Bundle bundle) {
        TECameraSettings tECameraSettings = this.f9097a;
        if (tECameraSettings == null) {
            C0743g.m11166b("TECameraCapture", "query features failed, maybe not connet");
        } else {
            m11038l(tECameraSettings.f8914H, bundle);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11038l(String str, Bundle bundle) {
        TECameraServer.INSTANCE.queryFeatures(str, bundle);
    }

    /* JADX INFO: renamed from: m */
    public int m11039m(TECameraSettings.InterfaceC0717p interfaceC0717p, boolean z) {
        return TECameraServer.INSTANCE.queryZoomAbility(this, interfaceC0717p, z);
    }

    /* JADX INFO: renamed from: o */
    public void m11040o(e eVar) {
        this.f9099c = eVar;
    }

    /* JADX INFO: renamed from: p */
    public int m11041p() {
        return TECameraServer.INSTANCE.removeCameraProvider(this);
    }

    /* JADX INFO: renamed from: q */
    public void m11042q(int i) {
        TECameraServer.INSTANCE.setExposureCompensation(this, i);
    }

    /* JADX INFO: renamed from: r */
    public int m11043r() {
        return TECameraServer.INSTANCE.start(this);
    }

    /* JADX INFO: renamed from: s */
    public int m11044s(float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        return TECameraServer.INSTANCE.startZoom(this, f, interfaceC0717p);
    }

    /* JADX INFO: renamed from: t */
    public int m11045t() {
        return m11046u(false);
    }

    /* JADX INFO: renamed from: u */
    public int m11046u(boolean z) {
        return TECameraServer.INSTANCE.stop(this, z);
    }

    /* JADX INFO: renamed from: v */
    public int m11047v(boolean z) {
        return TECameraServer.INSTANCE.toggleTorch(this, z);
    }
}
