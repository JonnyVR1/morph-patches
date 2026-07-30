package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.VerificationNetworkData;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class puk0 {

    /* JADX INFO: renamed from: d */
    public static volatile puk0 f151310d;

    /* JADX INFO: renamed from: a */
    public C22393b<VerificationNetworkData> f151311a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public String f151312b = "";

    /* JADX INFO: renamed from: c */
    public boolean f151313c = false;

    /* JADX INFO: renamed from: e */
    public static puk0 m171431e() {
        if (f151310d == null) {
            synchronized (vjf0.class) {
                try {
                    if (f151310d == null) {
                        f151310d = new puk0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151310d;
    }

    /* JADX INFO: renamed from: b */
    public C22393b<VerificationNetworkData> m171432b() {
        return this.f151311a;
    }

    /* JADX INFO: renamed from: c */
    public void m171433c(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final VerificationNetworkData verificationNetworkData = VerificationNetworkData.JSON_ADAPTER.parse(str);
        if (NullChecker.m81303a(verificationNetworkData) && NullChecker.m81303a(verificationNetworkData.meta) && NullChecker.m81303a(verificationNetworkData.data)) {
            int i = verificationNetworkData.meta.code;
            if (i == 400312 || i == 400314 || i == 400313) {
                e51.m114742G(new Runnable() { // from class: l.ouk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f145711a.m171436g(verificationNetworkData);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String m171434d() {
        return this.f151312b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m171435f() {
        return this.f151313c;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m171436g(VerificationNetworkData verificationNetworkData) {
        m171432b().onNext(verificationNetworkData);
    }

    /* JADX INFO: renamed from: h */
    public void m171437h(String str) {
        this.f151312b = str;
    }

    /* JADX INFO: renamed from: i */
    public void m171438i(boolean z) {
        this.f151313c = z;
    }
}
