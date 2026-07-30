package p153l;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.zzflg;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class b3v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f74825a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f74826b;

    public b3v0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f74825a = kqx0Var;
        this.f74826b = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        lcw0 lcw0Var = (lcw0) this.f74825a.zzb();
        final CookieManager cookieManagerMo109050a = bxy0.m106935s().mo109050a((Context) this.f74826b.zzb());
        dcw0 dcw0VarM115311i = rbw0.m180765a(new Callable() { // from class: l.y2v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerMo109050a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) jas0.m144075c().m176505a(sgs0.f168072N0));
            }
        }, zzflg.WEBVIEW_COOKIE, lcw0Var).m115311i(1L, TimeUnit.SECONDS);
        final z2v0 z2v0Var = new kbw0() { // from class: l.z2v0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                return "";
            }
        };
        return dcw0VarM115311i.m115305c(Exception.class, new xuw0() { // from class: l.sbw0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h("");
            }
        }).m115303a();
    }
}
