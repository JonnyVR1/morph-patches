package com.p074ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.bytedance.bpea.basics.Cert;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.dsh0;
import p153l.jrh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.d */
/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class C13494d {

    /* JADX INFO: renamed from: a */
    protected TECameraSettings f56339a;

    /* JADX INFO: renamed from: b */
    protected b f56340b;

    /* JADX INFO: renamed from: c */
    protected e f56341c = null;

    /* JADX INFO: renamed from: d */
    protected Map<String, Bundle> f56342d = new HashMap();

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
        public static c m81880a() {
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

        @Override // com.p074ss.android.ttvecamera.C13494d.b
        public void onCaptureStarted(int i, int i2) {
        }

        @Override // com.p074ss.android.ttvecamera.C13494d.b
        public void onCaptureStopped(int i) {
        }

        @Override // com.p074ss.android.ttvecamera.C13494d.b
        public void onError(int i, String str) {
        }

        @Override // com.p074ss.android.ttvecamera.C13494d.b
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

    public C13494d(@NonNull b bVar, d dVar) {
        this.f56340b = c.m81880a();
        this.f56340b = bVar;
        dsh0.m117760c(false);
    }

    /* JADX INFO: renamed from: n */
    public static void m81858n(byte b2, C13504g.b bVar) {
        C13504g.m82004h(bVar);
        C13504g.m82005i("VESDK", b2);
    }

    /* JADX INFO: renamed from: a */
    public int m81859a(jrh0.C18019a c18019a) {
        return TECameraServer.INSTANCE.addCameraProvider(this, c18019a);
    }

    /* JADX INFO: renamed from: b */
    public int m81860b(TECameraSettings tECameraSettings) {
        return m81861c(tECameraSettings, null);
    }

    /* JADX INFO: renamed from: c */
    public int m81861c(TECameraSettings tECameraSettings, Cert cert) {
        this.f56339a = tECameraSettings;
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        tECameraServer.registerPreviewSizeListener(this.f56341c);
        return tECameraServer.connect(this, this.f56340b, this.f56339a, null, cert);
    }

    /* JADX INFO: renamed from: d */
    public int m81862d() {
        return m81863e(null);
    }

    /* JADX INFO: renamed from: e */
    public int m81863e(Cert cert) {
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        return tECameraServer.disConnect(this, cert);
    }

    /* JADX INFO: renamed from: f */
    public int m81864f(TEFocusSettings tEFocusSettings) {
        tEFocusSettings.m81713q();
        return TECameraServer.INSTANCE.focusAtPoint(this, tEFocusSettings);
    }

    /* JADX INFO: renamed from: g */
    public TECameraSettings.C13466d m81865g() {
        return TECameraServer.INSTANCE.getCameraECInfo(this);
    }

    /* JADX INFO: renamed from: h */
    public int m81866h(TECameraSettings.InterfaceC13469g interfaceC13469g) {
        return TECameraServer.INSTANCE.getISO(this, interfaceC13469g);
    }

    /* JADX INFO: renamed from: i */
    public boolean m81867i() {
        return TECameraServer.INSTANCE.isSupportedExposureCompensation(this);
    }

    /* JADX INFO: renamed from: j */
    public boolean m81868j() {
        return TECameraServer.INSTANCE.isTorchSupported(this);
    }

    /* JADX INFO: renamed from: k */
    public void m81869k(Bundle bundle) {
        TECameraSettings tECameraSettings = this.f56339a;
        if (tECameraSettings == null) {
            C13504g.m81998b("TECameraCapture", "query features failed, maybe not connet");
        } else {
            m81870l(tECameraSettings.f56156H, bundle);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m81870l(String str, Bundle bundle) {
        TECameraServer.INSTANCE.queryFeatures(str, bundle);
    }

    /* JADX INFO: renamed from: m */
    public int m81871m(TECameraSettings.InterfaceC13478p interfaceC13478p, boolean z) {
        return TECameraServer.INSTANCE.queryZoomAbility(this, interfaceC13478p, z);
    }

    /* JADX INFO: renamed from: o */
    public void m81872o(e eVar) {
        this.f56341c = eVar;
    }

    /* JADX INFO: renamed from: p */
    public int m81873p() {
        return TECameraServer.INSTANCE.removeCameraProvider(this);
    }

    /* JADX INFO: renamed from: q */
    public void m81874q(int i) {
        TECameraServer.INSTANCE.setExposureCompensation(this, i);
    }

    /* JADX INFO: renamed from: r */
    public int m81875r() {
        return TECameraServer.INSTANCE.start(this);
    }

    /* JADX INFO: renamed from: s */
    public int m81876s(float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        return TECameraServer.INSTANCE.startZoom(this, f, interfaceC13478p);
    }

    /* JADX INFO: renamed from: t */
    public int m81877t() {
        return m81878u(false);
    }

    /* JADX INFO: renamed from: u */
    public int m81878u(boolean z) {
        return TECameraServer.INSTANCE.stop(this, z);
    }

    /* JADX INFO: renamed from: v */
    public int m81879v(boolean z) {
        return TECameraServer.INSTANCE.toggleTorch(this, z);
    }
}
