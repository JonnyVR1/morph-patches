package p003l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mpi0 extends ydk implements q7m {

    /* JADX INFO: renamed from: c */
    private lim f5701c;

    /* JADX INFO: renamed from: n */
    private String f5711n;

    /* JADX INFO: renamed from: p */
    private Bitmap f5713p;

    /* JADX INFO: renamed from: f */
    private boolean f5704f = false;

    /* JADX INFO: renamed from: g */
    private long f5705g = -1;

    /* JADX INFO: renamed from: i */
    private long f5706i = -1;

    /* JADX INFO: renamed from: j */
    private float f5707j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f5708k = 0.0f;

    /* JADX INFO: renamed from: l */
    private final float f5709l = 600.0f;

    /* JADX INFO: renamed from: m */
    private final float f5710m = 0.333f;

    /* JADX INFO: renamed from: o */
    private boolean f5712o = true;

    /* JADX INFO: renamed from: a */
    private m3j f5699a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f5700b = new m3j();

    /* JADX INFO: renamed from: e */
    private j9e f5703e = new j9e();

    /* JADX INFO: renamed from: d */
    private xem f5702d = new xem();

    public mpi0() {
        lim limVar = new lim();
        this.f5701c = limVar;
        this.f5699a.addTarget(limVar);
        this.f5701c.addTarget(this.f5702d);
        this.f5702d.addTarget(this.f5703e);
        this.f5700b.addTarget(this.f5703e);
        this.f5703e.registerFilterLocation(this.f5702d, 0);
        this.f5703e.registerFilterLocation(this.f5700b, 1);
        this.f5703e.addTarget(this);
        this.f5703e.m5311R1(0.2f);
        this.f5701c.m6034R1(0.9259259f);
        registerInitialFilter(this.f5699a);
        registerInitialFilter(this.f5700b);
        registerTerminalFilter(this.f5703e);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m6418Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: S1 */
    private synchronized void m6419S1() {
        this.f5705g = -1L;
        this.f5704f = true;
        this.f5703e.m5312S1(this.f5707j);
        this.f5703e.m5311R1(0.2f);
        this.f5703e.m5312S1(0.0f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m6420R1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f5699a;
        if (m3jVar != null && this.f5700b != null) {
            m3jVar.mo5971R1(bitmap);
            this.f5700b.mo5971R1(bitmap2);
        }
        m6419S1();
    }

    @Override // p003l.ydk, p003l.mcj, p003l.ccj
    public synchronized void destroy() {
        super.destroy();
        Bitmap bitmap = this.f5713p;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f5713p.recycle();
            this.f5713p = null;
        }
    }

    @Override // p003l.ydk, p003l.ts2, p003l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            Bitmap bitmap = this.f5713p;
            if (bitmap != null && this.f5712o) {
                this.f5702d.setLookupBitmap(bitmap);
                this.f5702d.setIntensity(1.0f);
                this.f5712o = false;
            }
            if (this.f5705g == -1) {
                this.f5705g = this.f5706i;
            }
            if (this.f5704f) {
                long j = this.f5706i - this.f5705g;
                if (j < 1500) {
                    this.f5707j = j / 1500.0f;
                } else {
                    this.f5707j = 1.0f;
                }
                if (j < 200) {
                    this.f5708k = 0.2f;
                } else {
                    this.f5708k = ((j - 200) / 1500.0f) + 0.2f;
                }
                if (this.f5708k > 1.0f) {
                    this.f5708k = 1.0f;
                }
                this.f5703e.m5312S1(this.f5707j);
                this.f5703e.m5311R1(this.f5708k);
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setLookupPath(String str) {
        String str2 = str + "/lookup3.jpg";
        this.f5711n = str2;
        if (m6418Q1(str2)) {
            this.f5713p = BitmapFactory.decodeFile(this.f5711n);
        }
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        this.f5706i = j;
    }
}
