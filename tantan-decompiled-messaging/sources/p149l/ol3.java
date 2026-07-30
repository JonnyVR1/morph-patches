package p149l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.data.ThirdPartyInfo;
import p133rx.C22306c;
import p149l.sl3;

/* JADX INFO: loaded from: classes11.dex */
public class ol3<T extends sl3> extends jq2<T> {
    public ol3(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m164910e0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static String m164916k0(ThirdPartyInfo thirdPartyInfo) {
        return CoreModule.f17545c.f19661l1.m34347j3(thirdPartyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m164917m0(Bundle bundle) {
        ((sl3) this.viewModel).m184752w();
        ((sl3) this.viewModel).m184738G();
        ((sl3) this.viewModel).m184753x(null);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.il3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113767a.m164917m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m164918l0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m164919n0(String str, String str2) {
        ((sl3) this.viewModel).m184742j("window.$$notifyPaySuccess$$", str);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m164920o0(String str) {
        ((sl3) this.viewModel).m184742j("window.$$abortPay$$", str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m164921p0(String str, String str2) {
        String query = Uri.parse(str).getQuery();
        if (!TextUtils.isEmpty(query)) {
            str2 = str2 + "&" + query;
        }
        ((sl3) this.viewModel).m184737F(str2);
    }

    /* JADX INFO: renamed from: q0 */
    public void m164922q0(long j, String str) {
        final String strM34341l3 = C4749o.m34341l3(str);
        z8y.m217651i(act(), j, str, new e30() { // from class: l.ml3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134404a.m164919n0(strM34341l3, (String) obj);
            }
        }, new d30() { // from class: l.nl3
            @Override // p149l.d30
            public final void call() {
                this.f139503a.m164920o0(strM34341l3);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m164923r0(final String str) {
        duringCreated((C22306c<T>) CoreModule.f17545c.f19661l1.m34350q3()).map(new w9j() { // from class: l.jl3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ol3.m164916k0((ThirdPartyInfo) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.kl3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123636a.m164921p0(str, (String) obj);
            }
        }, new e30() { // from class: l.ll3
            @Override // p149l.e30
            public final void call(Object obj) {
                ol3.m164910e0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
