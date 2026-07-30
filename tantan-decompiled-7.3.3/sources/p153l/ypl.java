package p153l;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes7.dex */
public interface ypl {

    /* JADX INFO: renamed from: l.ypl$a */
    public interface InterfaceC21656a {
        void onData(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.ypl$b */
    public interface InterfaceC21657b {
        /* JADX INFO: renamed from: f */
        void mo139164f(int i, int i2, Rect rect, boolean z);
    }

    /* JADX INFO: renamed from: l.ypl$c */
    public interface InterfaceC21658c {
        /* JADX INFO: renamed from: a */
        void mo139160a(byte[] bArr);
    }

    /* JADX INFO: renamed from: l.ypl$d */
    public interface InterfaceC21659d {
    }

    /* JADX INFO: renamed from: l.ypl$e */
    public interface InterfaceC21660e {
        void onFail(int i, String str);
    }

    /* JADX INFO: renamed from: l.ypl$f */
    public interface InterfaceC21661f {
        /* JADX INFO: renamed from: G */
        void mo117612G();

        /* JADX INFO: renamed from: V */
        void mo117626V(Camera camera);
    }

    /* JADX INFO: renamed from: A */
    boolean mo98181A(int i, qow qowVar);

    /* JADX INFO: renamed from: C */
    boolean mo98182C(int i, qow qowVar);

    /* JADX INFO: renamed from: E */
    void mo98183E(String str);

    /* JADX INFO: renamed from: F */
    boolean mo98184F();

    /* JADX INFO: renamed from: a */
    int mo98187a();

    /* JADX INFO: renamed from: b */
    void mo98188b(int i);

    /* JADX INFO: renamed from: c */
    int mo98189c();

    /* JADX INFO: renamed from: d */
    int mo98190d();

    /* JADX INFO: renamed from: e */
    void mo98191e(Camera.ErrorCallback errorCallback);

    /* JADX INFO: renamed from: f */
    void mo98192f(int i, int i2, Rect rect, boolean z);

    crf0 getTextureSize();

    /* JADX INFO: renamed from: i */
    boolean mo98193i();

    /* JADX INFO: renamed from: j */
    boolean mo98194j(SurfaceTexture surfaceTexture);

    /* JADX INFO: renamed from: k */
    void mo98195k(Rect rect, Camera.AutoFocusCallback autoFocusCallback);

    /* JADX INFO: renamed from: l */
    void mo98196l(InterfaceC21661f interfaceC21661f);

    /* JADX INFO: renamed from: m */
    int mo98197m();

    /* JADX INFO: renamed from: n */
    int[] mo98198n();

    /* JADX INFO: renamed from: o */
    boolean mo98199o(SurfaceTexture surfaceTexture, uje ujeVar);

    /* JADX INFO: renamed from: p */
    void mo98200p(InterfaceC21660e interfaceC21660e);

    /* JADX INFO: renamed from: q */
    void mo98201q(InterfaceC21659d interfaceC21659d);

    /* JADX INFO: renamed from: r */
    void mo98202r(InterfaceC21658c interfaceC21658c);

    /* JADX INFO: renamed from: s */
    boolean mo98203s(int i);

    /* JADX INFO: renamed from: t */
    void mo98204t(String str);

    /* JADX INFO: renamed from: u */
    boolean mo98205u(int i, qow qowVar);

    /* JADX INFO: renamed from: v */
    boolean mo98206v();

    /* JADX INFO: renamed from: w */
    void mo98207w(InterfaceC21656a interfaceC21656a);

    /* JADX INFO: renamed from: x */
    crf0 mo98208x();

    /* JADX INFO: renamed from: y */
    boolean mo98209y();
}
