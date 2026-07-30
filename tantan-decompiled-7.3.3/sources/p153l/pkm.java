package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class pkm extends ogk implements gam {

    /* JADX INFO: renamed from: d */
    okm f152858d;

    /* JADX INFO: renamed from: f */
    private String f152860f;

    /* JADX INFO: renamed from: g */
    private String f152861g;

    /* JADX INFO: renamed from: i */
    private String f152862i;

    /* JADX INFO: renamed from: k */
    private Bitmap f152864k;

    /* JADX INFO: renamed from: l */
    private Bitmap f152865l;

    /* JADX INFO: renamed from: m */
    private Bitmap f152866m;

    /* JADX INFO: renamed from: a */
    private boolean f152855a = false;

    /* JADX INFO: renamed from: b */
    private long f152856b = -1;

    /* JADX INFO: renamed from: c */
    private long f152857c = -1;

    /* JADX INFO: renamed from: j */
    private boolean f152863j = true;

    /* JADX INFO: renamed from: e */
    nhm f152859e = new nhm();

    public pkm() {
        okm okmVar = new okm();
        this.f152858d = okmVar;
        this.f152859e.addTarget(okmVar);
        this.f152858d.addTarget(this);
        registerInitialFilter(this.f152859e);
        registerTerminalFilter(this.f152858d);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m172612Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m172613R1() {
        this.f152856b = -1L;
        this.f152855a = true;
        this.f152858d.m168041R1(1.0f);
        this.f152859e.setLookupBitmap(null);
        this.f152859e.setIntensity(0.0f);
        this.f152863j = true;
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            super.destroy();
            Bitmap bitmap = this.f152864k;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f152864k.recycle();
                this.f152864k = null;
            }
            Bitmap bitmap2 = this.f152865l;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f152865l.recycle();
                this.f152865l = null;
            }
            Bitmap bitmap3 = this.f152866m;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.f152866m.recycle();
                this.f152866m = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this.f152856b == -1) {
            this.f152856b = this.f152857c;
        }
        if (this.f152855a) {
            long j = this.f152857c - this.f152856b;
            okm okmVar = this.f152858d;
            if (j > 1000) {
                okmVar.m168041R1(0.9259259f);
            } else {
                okmVar.m168041R1(1.0f / (((j / 1000.0f) * 0.08f) + 1.0f));
            }
            if (j > 300 && this.f152863j && (bitmap3 = this.f152864k) != null) {
                this.f152859e.setLookupBitmap(bitmap3);
                this.f152859e.setIntensity(0.0f);
                this.f152863j = false;
            }
            if (j > 300 && j <= 1000 && !this.f152863j) {
                this.f152859e.setIntensity((j - 300) / 700.0f);
            }
            if (j > 1100 && (bitmap2 = this.f152865l) != null) {
                this.f152859e.setLookupBitmap(bitmap2);
                this.f152859e.setIntensity(1.0f);
            }
            if (j > 2000 && (bitmap = this.f152866m) != null) {
                this.f152859e.setLookupBitmap(bitmap);
                this.f152859e.setIntensity(1.0f);
            }
        }
        super.newTextureReady(i, gfjVar, z);
    }

    public synchronized void setLookupPath(String str) {
        try {
            this.f152860f = str + "/lookup1.jpg";
            this.f152861g = str + "/lookup2.jpg";
            this.f152862i = str + "/lookup3.jpg";
            if (m172612Q1(this.f152860f)) {
                this.f152864k = BitmapFactory.decodeFile(this.f152860f);
            }
            if (m172612Q1(this.f152861g)) {
                this.f152865l = BitmapFactory.decodeFile(this.f152861g);
            }
            if (m172612Q1(this.f152862i)) {
                this.f152866m = BitmapFactory.decodeFile(this.f152862i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        this.f152857c = j;
    }
}
