package p149l;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
public interface mnl {

    /* JADX INFO: renamed from: l.mnl$a */
    public interface InterfaceC18510a {
        void onData(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.mnl$b */
    public interface InterfaceC18511b {
    }

    /* JADX INFO: renamed from: l.mnl$c */
    public interface InterfaceC18512c {
        void onFail(int i, String str);
    }

    /* JADX INFO: renamed from: l.mnl$d */
    public interface InterfaceC18513d {
        /* JADX INFO: renamed from: G */
        void mo140642G();

        /* JADX INFO: renamed from: V */
        void mo140652V(Camera camera);
    }

    /* JADX INFO: renamed from: E */
    boolean mo111755E(int i, slw slwVar);

    /* JADX INFO: renamed from: F */
    boolean mo111756F(int i, slw slwVar);

    /* JADX INFO: renamed from: G */
    boolean mo111757G(int i, slw slwVar);

    /* JADX INFO: renamed from: H */
    void mo111758H();

    /* JADX INFO: renamed from: I */
    void mo111759I(InterfaceC18513d interfaceC18513d);

    /* JADX INFO: renamed from: J */
    void mo111760J(InterfaceC18512c interfaceC18512c);

    /* JADX INFO: renamed from: K */
    void mo111761K(InterfaceC18510a interfaceC18510a);

    /* JADX INFO: renamed from: L */
    void mo111762L();

    /* JADX INFO: renamed from: a */
    int mo111764a();

    /* JADX INFO: renamed from: b */
    void mo111765b(int i);

    /* JADX INFO: renamed from: c */
    int mo111766c();

    /* JADX INFO: renamed from: d */
    int mo111767d();

    /* JADX INFO: renamed from: e */
    void mo111768e(Camera.ErrorCallback errorCallback);

    /* JADX INFO: renamed from: g */
    int mo111769g();

    /* JADX INFO: renamed from: h */
    int mo111770h();

    /* JADX INFO: renamed from: i */
    boolean mo111771i();

    /* JADX INFO: renamed from: j */
    boolean mo111772j(SurfaceTexture surfaceTexture);

    /* JADX INFO: renamed from: k */
    void mo111773k(Rect rect, Camera.AutoFocusCallback autoFocusCallback);

    /* JADX INFO: renamed from: m */
    int mo111774m();

    void release();

    void setExposureCompensation(int i);
}
