package tech.sud.runtime.core;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import tech.sud.runtime.component.p148g.C22538a;
import tech.sud.runtime.p141a.InterfaceC22516b;

/* JADX INFO: renamed from: tech.sud.runtime.core.g */
/* JADX INFO: loaded from: classes3.dex */
public class C22563g {

    /* JADX INFO: renamed from: a */
    public static C22564h f208837a;

    /* JADX INFO: renamed from: f */
    private C22538a f208842f;

    /* JADX INFO: renamed from: d */
    private int f208840d = 0;

    /* JADX INFO: renamed from: e */
    private int f208841e = 0;

    /* JADX INFO: renamed from: b */
    private long f208838b = JNIShell.create(0);

    /* JADX INFO: renamed from: c */
    private long f208839c = 0;

    /* JADX INFO: renamed from: a */
    public static void m223227a(InterfaceC22516b interfaceC22516b) {
        if (f208837a != null) {
            JNIShell.setLogCallback(null);
            f208837a = null;
        }
        if (interfaceC22516b == null) {
            JNIShell.setLogCallback(null);
            return;
        }
        C22564h c22564h = new C22564h(interfaceC22516b);
        f208837a = c22564h;
        JNIShell.setLogCallback(c22564h);
    }

    /* JADX INFO: renamed from: i */
    private synchronized void m223228i() {
        if (this.f208839c == 0) {
            this.f208839c = JNIShell.create(this.f208838b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m223240b(int i, int i2) {
        m223232a(i, i2, 0, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public int m223241c() {
        return this.f208840d;
    }

    /* JADX INFO: renamed from: d */
    public int m223242d() {
        return this.f208841e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m223243e() {
        return JNIShell.gRender(this.f208839c);
    }

    /* JADX INFO: renamed from: f */
    public void m223244f() {
        JNIShell.gPause(this.f208839c);
    }

    /* JADX INFO: renamed from: g */
    public void m223245g() {
        JNIShell.gResume(this.f208839c);
    }

    /* JADX INFO: renamed from: h */
    public void m223246h() {
        JNIShell.gDestroy(this.f208839c);
        this.f208839c = 0L;
    }

    /* JADX INFO: renamed from: b */
    public C22538a m223239b() {
        return this.f208842f;
    }

    /* JADX INFO: renamed from: a */
    public void m223236a(String str, String str2) {
        JNIShell.setOption(this.f208838b, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m223235a(int i, int[] iArr, float[] fArr, float[] fArr2, double d) {
        JNIShell.onTouch(this.f208838b, i, iArr, fArr, fArr2, d);
    }

    /* JADX INFO: renamed from: a */
    public void m223237a(C22558b c22558b, AssetManager assetManager, String str) {
        this.f208842f = new C22538a(assetManager);
        JNIShell.setJNIContext(this.f208838b, c22558b, assetManager, str);
    }

    /* JADX INFO: renamed from: a */
    public void m223230a(int i, int i2) {
        JNIShell.setScreenSize(this.f208838b, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m223238a(boolean z, int i, int i2) {
        JNIShell.setNotchInfo(this.f208838b, z, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m223234a(int i, String str) {
        m223232a(i, 0, 0, str);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m223232a(int i, int i2, int i3, String str) {
        JNIShell.call(this.f208838b, i, i2, i3, str);
    }

    /* JADX INFO: renamed from: a */
    public void m223231a(int i, int i2, int i3, float f) {
        if (this.f208839c == 0) {
            m223228i();
        }
        this.f208840d = i;
        this.f208841e = i2;
        JNIShell.gInitOrResize(this.f208839c, i, i2, i3, f);
    }

    /* JADX INFO: renamed from: a */
    public void m223233a(int i, int i2, Bitmap bitmap, int i3, int i4) {
        JNIShell.gTextBitmap(this.f208839c, i, i2, bitmap, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m223229a() {
        long j = this.f208838b;
        if (j != 0) {
            JNIShell.destroy(j);
            this.f208838b = 0L;
        }
    }
}
