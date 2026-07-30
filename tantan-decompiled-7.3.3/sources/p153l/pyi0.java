package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class pyi0 extends ogk implements gam {

    /* JADX INFO: renamed from: c */
    private okm f154653c;

    /* JADX INFO: renamed from: n */
    private String f154663n;

    /* JADX INFO: renamed from: p */
    private Bitmap f154665p;

    /* JADX INFO: renamed from: f */
    private boolean f154656f = false;

    /* JADX INFO: renamed from: g */
    private long f154657g = -1;

    /* JADX INFO: renamed from: i */
    private long f154658i = -1;

    /* JADX INFO: renamed from: j */
    private float f154659j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f154660k = 0.0f;

    /* JADX INFO: renamed from: l */
    private final float f154661l = 600.0f;

    /* JADX INFO: renamed from: m */
    private final float f154662m = 0.333f;

    /* JADX INFO: renamed from: o */
    private boolean f154664o = true;

    /* JADX INFO: renamed from: a */
    private h6j f154651a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f154652b = new h6j();

    /* JADX INFO: renamed from: e */
    private nae f154655e = new nae();

    /* JADX INFO: renamed from: d */
    private nhm f154654d = new nhm();

    public pyi0() {
        okm okmVar = new okm();
        this.f154653c = okmVar;
        this.f154651a.addTarget(okmVar);
        this.f154653c.addTarget(this.f154654d);
        this.f154654d.addTarget(this.f154655e);
        this.f154652b.addTarget(this.f154655e);
        this.f154655e.registerFilterLocation(this.f154654d, 0);
        this.f154655e.registerFilterLocation(this.f154652b, 1);
        this.f154655e.addTarget(this);
        this.f154655e.m162069R1(0.2f);
        this.f154653c.m168041R1(0.9259259f);
        registerInitialFilter(this.f154651a);
        registerInitialFilter(this.f154652b);
        registerTerminalFilter(this.f154655e);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m174287Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: S1 */
    private synchronized void m174288S1() {
        this.f154657g = -1L;
        this.f154656f = true;
        this.f154655e.m162070S1(this.f154659j);
        this.f154655e.m162069R1(0.2f);
        this.f154655e.m162070S1(0.0f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m174289R1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f154651a;
        if (h6jVar != null && this.f154652b != null) {
            h6jVar.mo129266R1(bitmap);
            this.f154652b.mo129266R1(bitmap2);
        }
        m174288S1();
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
        Bitmap bitmap = this.f154665p;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f154665p.recycle();
            this.f154665p = null;
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        try {
            Bitmap bitmap = this.f154665p;
            if (bitmap != null && this.f154664o) {
                this.f154654d.setLookupBitmap(bitmap);
                this.f154654d.setIntensity(1.0f);
                this.f154664o = false;
            }
            if (this.f154657g == -1) {
                this.f154657g = this.f154658i;
            }
            if (this.f154656f) {
                long j = this.f154658i - this.f154657g;
                if (j < 1500) {
                    this.f154659j = j / 1500.0f;
                } else {
                    this.f154659j = 1.0f;
                }
                if (j < 200) {
                    this.f154660k = 0.2f;
                } else {
                    this.f154660k = ((j - 200) / 1500.0f) + 0.2f;
                }
                if (this.f154660k > 1.0f) {
                    this.f154660k = 1.0f;
                }
                this.f154655e.m162070S1(this.f154659j);
                this.f154655e.m162069R1(this.f154660k);
            }
            super.newTextureReady(i, gfjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setLookupPath(String str) {
        String str2 = str + "/lookup3.jpg";
        this.f154663n = str2;
        if (m174287Q1(str2)) {
            this.f154665p = BitmapFactory.decodeFile(this.f154663n);
        }
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        this.f154658i = j;
    }
}
