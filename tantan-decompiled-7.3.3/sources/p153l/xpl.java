package p153l;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
public interface xpl {

    /* JADX INFO: renamed from: l.xpl$a */
    public interface InterfaceC21407a {
        void onData(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.xpl$b */
    public interface InterfaceC21408b {
    }

    /* JADX INFO: renamed from: l.xpl$c */
    public interface InterfaceC21409c {
        void onFail(int i, String str);
    }

    /* JADX INFO: renamed from: l.xpl$d */
    public interface InterfaceC21410d {
        /* JADX INFO: renamed from: G */
        void mo139266G();

        /* JADX INFO: renamed from: V */
        void mo139267V(Camera camera);
    }

    /* JADX INFO: renamed from: E */
    boolean mo104552E(int i, row rowVar);

    /* JADX INFO: renamed from: F */
    boolean mo104553F(int i, row rowVar);

    /* JADX INFO: renamed from: G */
    boolean mo104554G(int i, row rowVar);

    /* JADX INFO: renamed from: H */
    void mo104555H();

    /* JADX INFO: renamed from: I */
    void mo104556I(InterfaceC21410d interfaceC21410d);

    /* JADX INFO: renamed from: J */
    void mo104557J(InterfaceC21409c interfaceC21409c);

    /* JADX INFO: renamed from: K */
    void mo104558K(InterfaceC21407a interfaceC21407a);

    /* JADX INFO: renamed from: L */
    void mo104559L();

    /* JADX INFO: renamed from: a */
    int mo104561a();

    /* JADX INFO: renamed from: b */
    void mo104562b(int i);

    /* JADX INFO: renamed from: c */
    int mo104563c();

    /* JADX INFO: renamed from: d */
    int mo104564d();

    /* JADX INFO: renamed from: e */
    void mo104565e(Camera.ErrorCallback errorCallback);

    /* JADX INFO: renamed from: g */
    int mo104566g();

    /* JADX INFO: renamed from: h */
    int mo104567h();

    /* JADX INFO: renamed from: i */
    boolean mo104568i();

    /* JADX INFO: renamed from: j */
    boolean mo104569j(SurfaceTexture surfaceTexture);

    /* JADX INFO: renamed from: k */
    void mo104570k(Rect rect, Camera.AutoFocusCallback autoFocusCallback);

    /* JADX INFO: renamed from: m */
    int mo104571m();

    void release();

    void setExposureCompensation(int i);
}
