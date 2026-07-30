package p003l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class k9e extends ydk implements q7m {

    /* JADX INFO: renamed from: d */
    String f4870d;

    /* JADX INFO: renamed from: e */
    Bitmap f4871e;

    /* JADX INFO: renamed from: j */
    private j9e f4875j;

    /* JADX INFO: renamed from: a */
    private boolean f4867a = false;

    /* JADX INFO: renamed from: b */
    private long f4868b = -1;

    /* JADX INFO: renamed from: c */
    private long f4869c = -1;

    /* JADX INFO: renamed from: f */
    private float f4872f = 0.0f;

    /* JADX INFO: renamed from: k */
    private xem f4876k = new xem();

    /* JADX INFO: renamed from: g */
    private m3j f4873g = new m3j();

    /* JADX INFO: renamed from: i */
    private m3j f4874i = new m3j();

    public k9e() {
        j9e j9eVar = new j9e();
        this.f4875j = j9eVar;
        j9eVar.m5310Q1(true);
        this.f4873g.addTarget(this.f4875j);
        this.f4874i.addTarget(this.f4876k);
        this.f4876k.addTarget(this.f4875j);
        this.f4875j.registerFilterLocation(this.f4873g, 0);
        this.f4875j.registerFilterLocation(this.f4876k, 1);
        this.f4875j.addTarget(this);
        registerInitialFilter(this.f4873g);
        registerInitialFilter(this.f4874i);
        registerTerminalFilter(this.f4875j);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m5628Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: S1 */
    private synchronized void m5629S1() {
        this.f4868b = -1L;
        this.f4867a = true;
        this.f4876k.setIntensity(0.0f);
        this.f4875j.m5312S1(0.0f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m5630R1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f4873g;
        if (m3jVar != null && this.f4874i != null) {
            m3jVar.mo5971R1(bitmap);
            this.f4874i.mo5971R1(bitmap2);
        }
        m5629S1();
    }

    @Override // p003l.ydk, p003l.mcj, p003l.ccj
    public synchronized void destroy() {
        try {
            Bitmap bitmap = this.f4871e;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f4871e.recycle();
            }
            super.destroy();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003l.ydk, p003l.ts2, p003l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            if (this.f4868b == -1) {
                this.f4868b = this.f4869c;
            }
            if (this.f4867a) {
                long j = this.f4869c - this.f4868b;
                if (j < 500) {
                    this.f4872f = j / 500.0f;
                } else {
                    this.f4872f = 1.0f;
                }
                this.f4875j.m5312S1(this.f4872f);
                if (j < 1000) {
                    this.f4876k.setIntensity(0.0f);
                } else {
                    xem xemVar = this.f4876k;
                    if (j < 1500) {
                        xemVar.setIntensity((j - 1000) / 500.0f);
                    } else {
                        xemVar.setIntensity(1.0f);
                    }
                }
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setLookupPath(String str) {
        try {
            String str2 = str + "/lookup2.jpg";
            this.f4870d = str2;
            if (m5628Q1(str2)) {
                this.f4871e = BitmapFactory.decodeFile(this.f4870d);
            }
            Bitmap bitmap = this.f4871e;
            if (bitmap != null) {
                this.f4876k.setLookupBitmap(bitmap);
                this.f4876k.setIntensity(0.0f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        this.f4869c = j;
    }
}
