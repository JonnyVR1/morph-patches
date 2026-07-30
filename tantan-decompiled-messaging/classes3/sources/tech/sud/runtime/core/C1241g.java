package tech.sud.runtime.core;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import tech.sud.runtime.component.p025g.C1216a;
import tech.sud.runtime.p018a.InterfaceC1194b;

/* JADX INFO: renamed from: tech.sud.runtime.core.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1241g {

    /* JADX INFO: renamed from: a */
    public static C1242h f11540a;

    /* JADX INFO: renamed from: f */
    private C1216a f11545f;

    /* JADX INFO: renamed from: d */
    private int f11543d = 0;

    /* JADX INFO: renamed from: e */
    private int f11544e = 0;

    /* JADX INFO: renamed from: b */
    private long f11541b = JNIShell.create(0);

    /* JADX INFO: renamed from: c */
    private long f11542c = 0;

    /* JADX INFO: renamed from: a */
    public static void m10452a(InterfaceC1194b interfaceC1194b) {
        if (f11540a != null) {
            JNIShell.setLogCallback(null);
            f11540a = null;
        }
        if (interfaceC1194b == null) {
            JNIShell.setLogCallback(null);
            return;
        }
        C1242h c1242h = new C1242h(interfaceC1194b);
        f11540a = c1242h;
        JNIShell.setLogCallback(c1242h);
    }

    /* JADX INFO: renamed from: i */
    private synchronized void m10453i() {
        if (this.f11542c == 0) {
            this.f11542c = JNIShell.create(this.f11541b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10465b(int i, int i2) {
        m10457a(i, i2, 0, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public int m10466c() {
        return this.f11543d;
    }

    /* JADX INFO: renamed from: d */
    public int m10467d() {
        return this.f11544e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m10468e() {
        return JNIShell.gRender(this.f11542c);
    }

    /* JADX INFO: renamed from: f */
    public void m10469f() {
        JNIShell.gPause(this.f11542c);
    }

    /* JADX INFO: renamed from: g */
    public void m10470g() {
        JNIShell.gResume(this.f11542c);
    }

    /* JADX INFO: renamed from: h */
    public void m10471h() {
        JNIShell.gDestroy(this.f11542c);
        this.f11542c = 0L;
    }

    /* JADX INFO: renamed from: b */
    public C1216a m10464b() {
        return this.f11545f;
    }

    /* JADX INFO: renamed from: a */
    public void m10461a(String str, String str2) {
        JNIShell.setOption(this.f11541b, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m10460a(int i, int[] iArr, float[] fArr, float[] fArr2, double d) {
        JNIShell.onTouch(this.f11541b, i, iArr, fArr, fArr2, d);
    }

    /* JADX INFO: renamed from: a */
    public void m10462a(C1236b c1236b, AssetManager assetManager, String str) {
        this.f11545f = new C1216a(assetManager);
        JNIShell.setJNIContext(this.f11541b, c1236b, assetManager, str);
    }

    /* JADX INFO: renamed from: a */
    public void m10455a(int i, int i2) {
        JNIShell.setScreenSize(this.f11541b, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m10463a(boolean z, int i, int i2) {
        JNIShell.setNotchInfo(this.f11541b, z, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m10459a(int i, String str) {
        m10457a(i, 0, 0, str);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m10457a(int i, int i2, int i3, String str) {
        JNIShell.call(this.f11541b, i, i2, i3, str);
    }

    /* JADX INFO: renamed from: a */
    public void m10456a(int i, int i2, int i3, float f) {
        if (this.f11542c == 0) {
            m10453i();
        }
        this.f11543d = i;
        this.f11544e = i2;
        JNIShell.gInitOrResize(this.f11542c, i, i2, i3, f);
    }

    /* JADX INFO: renamed from: a */
    public void m10458a(int i, int i2, Bitmap bitmap, int i3, int i4) {
        JNIShell.gTextBitmap(this.f11542c, i, i2, bitmap, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m10454a() {
        long j = this.f11541b;
        if (j != 0) {
            JNIShell.destroy(j);
            this.f11541b = 0L;
        }
    }
}
