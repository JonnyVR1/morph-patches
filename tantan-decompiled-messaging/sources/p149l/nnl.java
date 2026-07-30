package p149l;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes7.dex */
public interface nnl {

    /* JADX INFO: renamed from: l.nnl$a */
    public interface InterfaceC18736a {
        void onData(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.nnl$b */
    public interface InterfaceC18737b {
        /* JADX INFO: renamed from: f */
        void mo140505f(int i, int i2, Rect rect, boolean z);
    }

    /* JADX INFO: renamed from: l.nnl$c */
    public interface InterfaceC18738c {
        /* JADX INFO: renamed from: a */
        void mo140501a(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.nnl$d */
    public interface InterfaceC18739d {
    }

    /* JADX INFO: renamed from: l.nnl$e */
    public interface InterfaceC18740e {
        void onFail(int i, String str);
    }

    /* JADX INFO: renamed from: l.nnl$f */
    public interface InterfaceC18741f {
        /* JADX INFO: renamed from: G */
        void mo142887G();

        /* JADX INFO: renamed from: V */
        void mo142893V(Camera camera);
    }

    /* JADX INFO: renamed from: A */
    boolean mo106810A(int i, rlw rlwVar);

    /* JADX INFO: renamed from: C */
    boolean mo106811C(int i, rlw rlwVar);

    /* JADX INFO: renamed from: E */
    void mo106812E(String str);

    /* JADX INFO: renamed from: F */
    boolean mo106813F();

    /* JADX INFO: renamed from: a */
    int mo106816a();

    /* JADX INFO: renamed from: b */
    void mo106817b(int i);

    /* JADX INFO: renamed from: c */
    int mo106818c();

    /* JADX INFO: renamed from: d */
    int mo106819d();

    /* JADX INFO: renamed from: e */
    void mo106820e(Camera.ErrorCallback errorCallback);

    /* JADX INFO: renamed from: f */
    void mo106821f(int i, int i2, Rect rect, boolean z);

    tif0 getTextureSize();

    /* JADX INFO: renamed from: i */
    boolean mo106822i();

    /* JADX INFO: renamed from: j */
    boolean mo106823j(SurfaceTexture surfaceTexture);

    /* JADX INFO: renamed from: k */
    void mo106824k(Rect rect, Camera.AutoFocusCallback autoFocusCallback);

    /* JADX INFO: renamed from: l */
    void mo106825l(InterfaceC18741f interfaceC18741f);

    /* JADX INFO: renamed from: m */
    int mo106826m();

    /* JADX INFO: renamed from: n */
    int[] mo106827n();

    /* JADX INFO: renamed from: o */
    boolean mo106828o(SurfaceTexture surfaceTexture, qie qieVar);

    /* JADX INFO: renamed from: p */
    void mo106829p(InterfaceC18740e interfaceC18740e);

    /* JADX INFO: renamed from: q */
    void mo106830q(InterfaceC18739d interfaceC18739d);

    /* JADX INFO: renamed from: r */
    void mo106831r(InterfaceC18738c interfaceC18738c);

    /* JADX INFO: renamed from: s */
    boolean mo106832s(int i);

    /* JADX INFO: renamed from: t */
    void mo106833t(String str);

    /* JADX INFO: renamed from: u */
    boolean mo106834u(int i, rlw rlwVar);

    /* JADX INFO: renamed from: v */
    boolean mo106835v();

    /* JADX INFO: renamed from: w */
    void mo106836w(InterfaceC18736a interfaceC18736a);

    /* JADX INFO: renamed from: x */
    tif0 mo106837x();

    /* JADX INFO: renamed from: y */
    boolean mo106838y();
}
