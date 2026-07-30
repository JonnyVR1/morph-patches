package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class k9e extends ydk implements q7m {

    /* JADX INFO: renamed from: d */
    String f121998d;

    /* JADX INFO: renamed from: e */
    Bitmap f121999e;

    /* JADX INFO: renamed from: j */
    private j9e f122003j;

    /* JADX INFO: renamed from: a */
    private boolean f121995a = false;

    /* JADX INFO: renamed from: b */
    private long f121996b = -1;

    /* JADX INFO: renamed from: c */
    private long f121997c = -1;

    /* JADX INFO: renamed from: f */
    private float f122000f = 0.0f;

    /* JADX INFO: renamed from: k */
    private xem f122004k = new xem();

    /* JADX INFO: renamed from: g */
    private m3j f122001g = new m3j();

    /* JADX INFO: renamed from: i */
    private m3j f122002i = new m3j();

    public k9e() {
        j9e j9eVar = new j9e();
        this.f122003j = j9eVar;
        j9eVar.m140547Q1(true);
        this.f122001g.addTarget(this.f122003j);
        this.f122002i.addTarget(this.f122004k);
        this.f122004k.addTarget(this.f122003j);
        this.f122003j.registerFilterLocation(this.f122001g, 0);
        this.f122003j.registerFilterLocation(this.f122004k, 1);
        this.f122003j.addTarget(this);
        registerInitialFilter(this.f122001g);
        registerInitialFilter(this.f122002i);
        registerTerminalFilter(this.f122003j);
    }

    /* JADX INFO: renamed from: Q1 */
    private boolean m145041Q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: S1 */
    private synchronized void m145042S1() {
        this.f121996b = -1L;
        this.f121995a = true;
        this.f122004k.setIntensity(0.0f);
        this.f122003j.m140549S1(0.0f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m145043R1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f122001g;
        if (m3jVar != null && this.f122002i != null) {
            m3jVar.mo148397R1(bitmap);
            this.f122002i.mo148397R1(bitmap2);
        }
        m145042S1();
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            Bitmap bitmap = this.f121999e;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f121999e.recycle();
            }
            super.destroy();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            if (this.f121996b == -1) {
                this.f121996b = this.f121997c;
            }
            if (this.f121995a) {
                long j = this.f121997c - this.f121996b;
                if (j < 500) {
                    this.f122000f = j / 500.0f;
                } else {
                    this.f122000f = 1.0f;
                }
                this.f122003j.m140549S1(this.f122000f);
                if (j < 1000) {
                    this.f122004k.setIntensity(0.0f);
                } else {
                    xem xemVar = this.f122004k;
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
            this.f121998d = str2;
            if (m145041Q1(str2)) {
                this.f121999e = BitmapFactory.decodeFile(this.f121998d);
            }
            Bitmap bitmap = this.f121999e;
            if (bitmap != null) {
                this.f122004k.setLookupBitmap(bitmap);
                this.f122004k.setIntensity(0.0f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        this.f121997c = j;
    }
}
