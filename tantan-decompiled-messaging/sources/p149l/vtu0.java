package p149l;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.zzflg;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class vtu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f183011a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f183012b;

    public vtu0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f183011a = ehx0Var;
        this.f183012b = ehx0Var2;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        f3w0 f3w0Var = (f3w0) this.f183011a.zzb();
        final CookieManager cookieManagerMo112967a = vny0.m199081s().mo112967a((Context) this.f183012b.zzb());
        x2w0 x2w0VarM206881i = l2w0.m148321a(new Callable() { // from class: l.stu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerMo112967a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) d1s0.m109677c().m144697a(m7s0.f132001N0));
            }
        }, zzflg.WEBVIEW_COOKIE, f3w0Var).m206881i(1L, TimeUnit.SECONDS);
        final ttu0 ttu0Var = new e2w0() { // from class: l.ttu0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                return "";
            }
        };
        return x2w0VarM206881i.m206875c(Exception.class, new rlw0() { // from class: l.m2w0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h("");
            }
        }).m206873a();
    }
}
