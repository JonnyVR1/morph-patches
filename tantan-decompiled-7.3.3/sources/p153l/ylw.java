package p153l;

import com.hellogroup.p036mk.business.base.p037ui.MKWebView;

/* JADX INFO: loaded from: classes7.dex */
public class ylw {

    /* JADX INFO: renamed from: b */
    private static volatile ylw f200593b;

    /* JADX INFO: renamed from: a */
    private volatile int f200594a;

    private ylw() {
        this.f200594a = 0;
        this.f200594a = 0;
    }

    /* JADX INFO: renamed from: a */
    public static ylw m216640a() {
        if (f200593b == null) {
            synchronized (ylw.class) {
                try {
                    if (f200593b == null) {
                        f200593b = new ylw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f200593b;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m216641b(MKWebView mKWebView) {
        this.f200594a++;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m216642c(MKWebView mKWebView) {
        this.f200594a--;
    }
}
