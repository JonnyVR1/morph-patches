package p009l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.o;
import com.p1.mobile.putong.core.data.ThirdPartyInfo;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;
import l.z8y;
import p009l.sl3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ol3<T extends sl3> extends jq2<T> {
    public ol3(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m19917e0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static String m19923k0(ThirdPartyInfo thirdPartyInfo) {
        return CoreModule.c.l1.j3(thirdPartyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m19924m0(Bundle bundle) {
        ((sl3) ((jq2) this).viewModel).m22254w();
        ((sl3) ((jq2) this).viewModel).m22239G();
        ((sl3) ((jq2) this).viewModel).m22255x(null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m19925a0() {
        super.a0();
        creates(new e30() { // from class: l.il3
            public final void call(Object obj) {
                this.f14684a.m19924m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m19926l0() {
        act().finish();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m19927n0(String str, String str2) {
        ((sl3) ((jq2) this).viewModel).m22244j("window.$$notifyPaySuccess$$", str);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m19928o0(String str) {
        ((sl3) ((jq2) this).viewModel).m22244j("window.$$abortPay$$", str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m19929p0(String str, String str2) {
        String query = Uri.parse(str).getQuery();
        if (!TextUtils.isEmpty(query)) {
            str2 = str2 + "&" + query;
        }
        ((sl3) ((jq2) this).viewModel).m22238F(str2);
    }

    /* JADX INFO: renamed from: q0 */
    public void m19930q0(long j, String str) {
        final String strL3 = o.l3(str);
        z8y.i(act(), j, str, new e30() { // from class: l.ml3
            public final void call(Object obj) {
                this.f16989a.m19927n0(strL3, (String) obj);
            }
        }, new d30() { // from class: l.nl3
            public final void call() {
                this.f17568a.m19928o0(strL3);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m19931r0(final String str) {
        duringCreated(CoreModule.c.l1.q3()).map(new w9j() { // from class: l.jl3
            public final Object call(Object obj) {
                return ol3.m19923k0((ThirdPartyInfo) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.kl3
            public final void call(Object obj) {
                this.f15757a.m19929p0(str, (String) obj);
            }
        }, new e30() { // from class: l.ll3
            public final void call(Object obj) {
                ol3.m19917e0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
