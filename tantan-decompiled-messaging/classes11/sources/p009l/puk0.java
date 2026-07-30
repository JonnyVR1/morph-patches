package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.VerificationNetworkData;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.e51;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class puk0 {

    /* JADX INFO: renamed from: d */
    public static volatile puk0 f18925d;

    /* JADX INFO: renamed from: a */
    public b<VerificationNetworkData> f18926a = b.b();

    /* JADX INFO: renamed from: b */
    public String f18927b = "";

    /* JADX INFO: renamed from: c */
    public boolean f18928c = false;

    /* JADX INFO: renamed from: e */
    public static puk0 m20720e() {
        if (f18925d == null) {
            synchronized (vjf0.class) {
                try {
                    if (f18925d == null) {
                        f18925d = new puk0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18925d;
    }

    /* JADX INFO: renamed from: b */
    public b<VerificationNetworkData> m20721b() {
        return this.f18926a;
    }

    /* JADX INFO: renamed from: c */
    public void m20722c(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final VerificationNetworkData verificationNetworkData = (VerificationNetworkData) VerificationNetworkData.JSON_ADAPTER.parse(str);
        if (NullChecker.a(verificationNetworkData) && NullChecker.a(verificationNetworkData.meta) && NullChecker.a(verificationNetworkData.data)) {
            int i = verificationNetworkData.meta.code;
            if (i == 400312 || i == 400314 || i == 400313) {
                e51.G(new Runnable() { // from class: l.ouk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18255a.m20725g(verificationNetworkData);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String m20723d() {
        return this.f18927b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20724f() {
        return this.f18928c;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m20725g(VerificationNetworkData verificationNetworkData) {
        m20721b().onNext(verificationNetworkData);
    }

    /* JADX INFO: renamed from: h */
    public void m20726h(String str) {
        this.f18927b = str;
    }

    /* JADX INFO: renamed from: i */
    public void m20727i(boolean z) {
        this.f18928c = z;
    }
}
