package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class oae extends ogk implements gam {

    /* JADX INFO: renamed from: d */
    String f145693d;

    /* JADX INFO: renamed from: e */
    Bitmap f145694e;

    /* JADX INFO: renamed from: j */
    private nae f145698j;

    /* JADX INFO: renamed from: a */
    private boolean f145690a = false;

    /* JADX INFO: renamed from: b */
    private long f145691b = -1;

    /* JADX INFO: renamed from: c */
    private long f145692c = -1;

    /* JADX INFO: renamed from: f */
    private float f145695f = 0.0f;

    /* JADX INFO: renamed from: k */
    private nhm f145699k = new nhm();

    /* JADX INFO: renamed from: g */
    private h6j f145696g = new h6j();

    /* JADX INFO: renamed from: i */
    private h6j f145697i = new h6j();

    public oae() {
        nae naeVar = new nae();
        this.f145698j = naeVar;
        naeVar.m162068Q1(true);
        this.f145696g.addTarget(this.f145698j);
        this.f145697i.addTarget(this.f145699k);
        this.f145699k.addTarget(this.f145698j);
        this.f145698j.registerFilterLocation(this.f145696g, 0);
        this.f145698j.registerFilterLocation(this.f145699k, 1);
        this.f145698j.addTarget(this);
        registerInitialFilter(this.f145696g);
        registerInitialFilter(this.f145697i);
        registerTerminalFilter(this.f145698j);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m166829Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: S1 */
    private synchronized void m166830S1() {
        this.f145691b = -1L;
        this.f145690a = true;
        this.f145699k.setIntensity(0.0f);
        this.f145698j.m162070S1(0.0f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m166831R1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f145696g;
        if (h6jVar != null && this.f145697i != null) {
            h6jVar.mo129266R1(bitmap);
            this.f145697i.mo129266R1(bitmap2);
        }
        m166830S1();
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            Bitmap bitmap = this.f145694e;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f145694e.recycle();
            }
            super.destroy();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        try {
            if (this.f145691b == -1) {
                this.f145691b = this.f145692c;
            }
            if (this.f145690a) {
                long j = this.f145692c - this.f145691b;
                if (j < 500) {
                    this.f145695f = j / 500.0f;
                } else {
                    this.f145695f = 1.0f;
                }
                this.f145698j.m162070S1(this.f145695f);
                if (j < 1000) {
                    this.f145699k.setIntensity(0.0f);
                } else {
                    nhm nhmVar = this.f145699k;
                    if (j < 1500) {
                        nhmVar.setIntensity((j - 1000) / 500.0f);
                    } else {
                        nhmVar.setIntensity(1.0f);
                    }
                }
            }
            super.newTextureReady(i, gfjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setLookupPath(String str) {
        try {
            String str2 = str + "/lookup2.jpg";
            this.f145693d = str2;
            if (m166829Q1(str2)) {
                this.f145694e = BitmapFactory.decodeFile(this.f145693d);
            }
            Bitmap bitmap = this.f145694e;
            if (bitmap != null) {
                this.f145699k.setLookupBitmap(bitmap);
                this.f145699k.setIntensity(0.0f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        this.f145692c = j;
    }
}
