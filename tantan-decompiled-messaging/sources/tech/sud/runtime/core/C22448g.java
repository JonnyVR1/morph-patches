package tech.sud.runtime.core;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import tech.sud.runtime.component.p144g.C22423a;
import tech.sud.runtime.p137a.InterfaceC22401b;

/* JADX INFO: renamed from: tech.sud.runtime.core.g */
/* JADX INFO: loaded from: classes3.dex */
public class C22448g {

    /* JADX INFO: renamed from: a */
    public static C22449h f207915a;

    /* JADX INFO: renamed from: f */
    private C22423a f207920f;

    /* JADX INFO: renamed from: d */
    private int f207918d = 0;

    /* JADX INFO: renamed from: e */
    private int f207919e = 0;

    /* JADX INFO: renamed from: b */
    private long f207916b = JNIShell.create(0);

    /* JADX INFO: renamed from: c */
    private long f207917c = 0;

    /* JADX INFO: renamed from: a */
    public static void m221981a(InterfaceC22401b interfaceC22401b) {
        if (f207915a != null) {
            JNIShell.setLogCallback(null);
            f207915a = null;
        }
        if (interfaceC22401b == null) {
            JNIShell.setLogCallback(null);
            return;
        }
        C22449h c22449h = new C22449h(interfaceC22401b);
        f207915a = c22449h;
        JNIShell.setLogCallback(c22449h);
    }

    /* JADX INFO: renamed from: i */
    private synchronized void m221982i() {
        if (this.f207917c == 0) {
            this.f207917c = JNIShell.create(this.f207916b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m221994b(int i, int i2) {
        m221986a(i, i2, 0, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public int m221995c() {
        return this.f207918d;
    }

    /* JADX INFO: renamed from: d */
    public int m221996d() {
        return this.f207919e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m221997e() {
        return JNIShell.gRender(this.f207917c);
    }

    /* JADX INFO: renamed from: f */
    public void m221998f() {
        JNIShell.gPause(this.f207917c);
    }

    /* JADX INFO: renamed from: g */
    public void m221999g() {
        JNIShell.gResume(this.f207917c);
    }

    /* JADX INFO: renamed from: h */
    public void m222000h() {
        JNIShell.gDestroy(this.f207917c);
        this.f207917c = 0L;
    }

    /* JADX INFO: renamed from: b */
    public C22423a m221993b() {
        return this.f207920f;
    }

    /* JADX INFO: renamed from: a */
    public void m221990a(String str, String str2) {
        JNIShell.setOption(this.f207916b, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m221989a(int i, int[] iArr, float[] fArr, float[] fArr2, double d) {
        JNIShell.onTouch(this.f207916b, i, iArr, fArr, fArr2, d);
    }

    /* JADX INFO: renamed from: a */
    public void m221991a(C22443b c22443b, AssetManager assetManager, String str) {
        this.f207920f = new C22423a(assetManager);
        JNIShell.setJNIContext(this.f207916b, c22443b, assetManager, str);
    }

    /* JADX INFO: renamed from: a */
    public void m221984a(int i, int i2) {
        JNIShell.setScreenSize(this.f207916b, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m221992a(boolean z, int i, int i2) {
        JNIShell.setNotchInfo(this.f207916b, z, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m221988a(int i, String str) {
        m221986a(i, 0, 0, str);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m221986a(int i, int i2, int i3, String str) {
        JNIShell.call(this.f207916b, i, i2, i3, str);
    }

    /* JADX INFO: renamed from: a */
    public void m221985a(int i, int i2, int i3, float f) {
        if (this.f207917c == 0) {
            m221982i();
        }
        this.f207918d = i;
        this.f207919e = i2;
        JNIShell.gInitOrResize(this.f207917c, i, i2, i3, f);
    }

    /* JADX INFO: renamed from: a */
    public void m221987a(int i, int i2, Bitmap bitmap, int i3, int i4) {
        JNIShell.gTextBitmap(this.f207917c, i, i2, bitmap, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m221983a() {
        long j = this.f207916b;
        if (j != 0) {
            JNIShell.destroy(j);
            this.f207916b = 0L;
        }
    }
}
