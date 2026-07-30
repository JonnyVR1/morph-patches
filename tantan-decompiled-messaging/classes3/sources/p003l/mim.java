package p003l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mim extends ydk implements q7m {

    /* JADX INFO: renamed from: d */
    lim f5663d;

    /* JADX INFO: renamed from: f */
    private String f5665f;

    /* JADX INFO: renamed from: g */
    private String f5666g;

    /* JADX INFO: renamed from: i */
    private String f5667i;

    /* JADX INFO: renamed from: k */
    private Bitmap f5669k;

    /* JADX INFO: renamed from: l */
    private Bitmap f5670l;

    /* JADX INFO: renamed from: m */
    private Bitmap f5671m;

    /* JADX INFO: renamed from: a */
    private boolean f5660a = false;

    /* JADX INFO: renamed from: b */
    private long f5661b = -1;

    /* JADX INFO: renamed from: c */
    private long f5662c = -1;

    /* JADX INFO: renamed from: j */
    private boolean f5668j = true;

    /* JADX INFO: renamed from: e */
    xem f5664e = new xem();

    public mim() {
        lim limVar = new lim();
        this.f5663d = limVar;
        this.f5664e.addTarget(limVar);
        this.f5663d.addTarget(this);
        registerInitialFilter(this.f5664e);
        registerTerminalFilter(this.f5663d);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m6402Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m6403R1() {
        this.f5661b = -1L;
        this.f5660a = true;
        this.f5663d.m6034R1(1.0f);
        this.f5664e.setLookupBitmap(null);
        this.f5664e.setIntensity(0.0f);
        this.f5668j = true;
    }

    @Override // p003l.ydk, p003l.mcj, p003l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            Bitmap bitmap = this.f5669k;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f5669k.recycle();
                this.f5669k = null;
            }
            Bitmap bitmap2 = this.f5670l;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f5670l.recycle();
                this.f5670l = null;
            }
            Bitmap bitmap3 = this.f5671m;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.f5671m.recycle();
                this.f5671m = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003l.ydk, p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this.f5661b == -1) {
            this.f5661b = this.f5662c;
        }
        if (this.f5660a) {
            long j = this.f5662c - this.f5661b;
            lim limVar = this.f5663d;
            if (j > 1000) {
                limVar.m6034R1(0.9259259f);
            } else {
                limVar.m6034R1(1.0f / (((j / 1000.0f) * 0.08f) + 1.0f));
            }
            if (j > 300 && this.f5668j && (bitmap3 = this.f5669k) != null) {
                this.f5664e.setLookupBitmap(bitmap3);
                this.f5664e.setIntensity(0.0f);
                this.f5668j = false;
            }
            if (j > 300 && j <= 1000 && !this.f5668j) {
                this.f5664e.setIntensity((j - 300) / 700.0f);
            }
            if (j > 1100 && (bitmap2 = this.f5670l) != null) {
                this.f5664e.setLookupBitmap(bitmap2);
                this.f5664e.setIntensity(1.0f);
            }
            if (j > 2000 && (bitmap = this.f5671m) != null) {
                this.f5664e.setLookupBitmap(bitmap);
                this.f5664e.setIntensity(1.0f);
            }
        }
        super.newTextureReady(i, mcjVar, z);
    }

    public synchronized void setLookupPath(String str) {
        try {
            this.f5665f = str + "/lookup1.jpg";
            this.f5666g = str + "/lookup2.jpg";
            this.f5667i = str + "/lookup3.jpg";
            if (m6402Q1(this.f5665f)) {
                this.f5669k = BitmapFactory.decodeFile(this.f5665f);
            }
            if (m6402Q1(this.f5666g)) {
                this.f5670l = BitmapFactory.decodeFile(this.f5666g);
            }
            if (m6402Q1(this.f5667i)) {
                this.f5671m = BitmapFactory.decodeFile(this.f5667i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        this.f5662c = j;
    }
}
