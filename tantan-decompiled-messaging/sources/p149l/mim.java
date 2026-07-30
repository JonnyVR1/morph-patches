package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class mim extends ydk implements q7m {

    /* JADX INFO: renamed from: d */
    lim f134006d;

    /* JADX INFO: renamed from: f */
    private String f134008f;

    /* JADX INFO: renamed from: g */
    private String f134009g;

    /* JADX INFO: renamed from: i */
    private String f134010i;

    /* JADX INFO: renamed from: k */
    private Bitmap f134012k;

    /* JADX INFO: renamed from: l */
    private Bitmap f134013l;

    /* JADX INFO: renamed from: m */
    private Bitmap f134014m;

    /* JADX INFO: renamed from: a */
    private boolean f134003a = false;

    /* JADX INFO: renamed from: b */
    private long f134004b = -1;

    /* JADX INFO: renamed from: c */
    private long f134005c = -1;

    /* JADX INFO: renamed from: j */
    private boolean f134011j = true;

    /* JADX INFO: renamed from: e */
    xem f134007e = new xem();

    public mim() {
        lim limVar = new lim();
        this.f134006d = limVar;
        this.f134007e.addTarget(limVar);
        this.f134006d.addTarget(this);
        registerInitialFilter(this.f134007e);
        registerTerminalFilter(this.f134006d);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m154716Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m154717R1() {
        this.f134004b = -1L;
        this.f134003a = true;
        this.f134006d.m149919R1(1.0f);
        this.f134007e.setLookupBitmap(null);
        this.f134007e.setIntensity(0.0f);
        this.f134011j = true;
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            Bitmap bitmap = this.f134012k;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f134012k.recycle();
                this.f134012k = null;
            }
            Bitmap bitmap2 = this.f134013l;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f134013l.recycle();
                this.f134013l = null;
            }
            Bitmap bitmap3 = this.f134014m;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.f134014m.recycle();
                this.f134014m = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this.f134004b == -1) {
            this.f134004b = this.f134005c;
        }
        if (this.f134003a) {
            long j = this.f134005c - this.f134004b;
            lim limVar = this.f134006d;
            if (j > 1000) {
                limVar.m149919R1(0.9259259f);
            } else {
                limVar.m149919R1(1.0f / (((j / 1000.0f) * 0.08f) + 1.0f));
            }
            if (j > 300 && this.f134011j && (bitmap3 = this.f134012k) != null) {
                this.f134007e.setLookupBitmap(bitmap3);
                this.f134007e.setIntensity(0.0f);
                this.f134011j = false;
            }
            if (j > 300 && j <= 1000 && !this.f134011j) {
                this.f134007e.setIntensity((j - 300) / 700.0f);
            }
            if (j > 1100 && (bitmap2 = this.f134013l) != null) {
                this.f134007e.setLookupBitmap(bitmap2);
                this.f134007e.setIntensity(1.0f);
            }
            if (j > 2000 && (bitmap = this.f134014m) != null) {
                this.f134007e.setLookupBitmap(bitmap);
                this.f134007e.setIntensity(1.0f);
            }
        }
        super.newTextureReady(i, mcjVar, z);
    }

    public synchronized void setLookupPath(String str) {
        try {
            this.f134008f = str + "/lookup1.jpg";
            this.f134009g = str + "/lookup2.jpg";
            this.f134010i = str + "/lookup3.jpg";
            if (m154716Q1(this.f134008f)) {
                this.f134012k = BitmapFactory.decodeFile(this.f134008f);
            }
            if (m154716Q1(this.f134009g)) {
                this.f134013l = BitmapFactory.decodeFile(this.f134009g);
            }
            if (m154716Q1(this.f134010i)) {
                this.f134014m = BitmapFactory.decodeFile(this.f134010i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        this.f134005c = j;
    }
}
