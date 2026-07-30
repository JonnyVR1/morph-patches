package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class mpi0 extends ydk implements q7m {

    /* JADX INFO: renamed from: c */
    private lim f135052c;

    /* JADX INFO: renamed from: n */
    private String f135062n;

    /* JADX INFO: renamed from: p */
    private Bitmap f135064p;

    /* JADX INFO: renamed from: f */
    private boolean f135055f = false;

    /* JADX INFO: renamed from: g */
    private long f135056g = -1;

    /* JADX INFO: renamed from: i */
    private long f135057i = -1;

    /* JADX INFO: renamed from: j */
    private float f135058j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f135059k = 0.0f;

    /* JADX INFO: renamed from: l */
    private final float f135060l = 600.0f;

    /* JADX INFO: renamed from: m */
    private final float f135061m = 0.333f;

    /* JADX INFO: renamed from: o */
    private boolean f135063o = true;

    /* JADX INFO: renamed from: a */
    private m3j f135050a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f135051b = new m3j();

    /* JADX INFO: renamed from: e */
    private j9e f135054e = new j9e();

    /* JADX INFO: renamed from: d */
    private xem f135053d = new xem();

    public mpi0() {
        lim limVar = new lim();
        this.f135052c = limVar;
        this.f135050a.addTarget(limVar);
        this.f135052c.addTarget(this.f135053d);
        this.f135053d.addTarget(this.f135054e);
        this.f135051b.addTarget(this.f135054e);
        this.f135054e.registerFilterLocation(this.f135053d, 0);
        this.f135054e.registerFilterLocation(this.f135051b, 1);
        this.f135054e.addTarget(this);
        this.f135054e.m140548R1(0.2f);
        this.f135052c.m149919R1(0.9259259f);
        registerInitialFilter(this.f135050a);
        registerInitialFilter(this.f135051b);
        registerTerminalFilter(this.f135054e);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m155808Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: S1 */
    private synchronized void m155809S1() {
        this.f135056g = -1L;
        this.f135055f = true;
        this.f135054e.m140549S1(this.f135058j);
        this.f135054e.m140548R1(0.2f);
        this.f135054e.m140549S1(0.0f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m155810R1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f135050a;
        if (m3jVar != null && this.f135051b != null) {
            m3jVar.mo148397R1(bitmap);
            this.f135051b.mo148397R1(bitmap2);
        }
        m155809S1();
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
        Bitmap bitmap = this.f135064p;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f135064p.recycle();
            this.f135064p = null;
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            Bitmap bitmap = this.f135064p;
            if (bitmap != null && this.f135063o) {
                this.f135053d.setLookupBitmap(bitmap);
                this.f135053d.setIntensity(1.0f);
                this.f135063o = false;
            }
            if (this.f135056g == -1) {
                this.f135056g = this.f135057i;
            }
            if (this.f135055f) {
                long j = this.f135057i - this.f135056g;
                if (j < 1500) {
                    this.f135058j = j / 1500.0f;
                } else {
                    this.f135058j = 1.0f;
                }
                if (j < 200) {
                    this.f135059k = 0.2f;
                } else {
                    this.f135059k = ((j - 200) / 1500.0f) + 0.2f;
                }
                if (this.f135059k > 1.0f) {
                    this.f135059k = 1.0f;
                }
                this.f135054e.m140549S1(this.f135058j);
                this.f135054e.m140548R1(this.f135059k);
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setLookupPath(String str) {
        String str2 = str + "/lookup3.jpg";
        this.f135062n = str2;
        if (m155808Q1(str2)) {
            this.f135064p = BitmapFactory.decodeFile(this.f135062n);
        }
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        this.f135057i = j;
    }
}
