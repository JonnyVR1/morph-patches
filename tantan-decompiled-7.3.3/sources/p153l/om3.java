package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.data.ThirdPartyInfo;
import p137rx.C22421c;
import p153l.sm3;

/* JADX INFO: loaded from: classes11.dex */
public class om3<T extends sm3> extends ar2<T> {
    public om3(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m168181e0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static String m168187k0(ThirdPartyInfo thirdPartyInfo) {
        return CoreModule.f18264c.f20403l1.m35350j3(thirdPartyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m168188m0(Bundle bundle) {
        ((sm3) this.viewModel).m186756w();
        ((sm3) this.viewModel).m186742G();
        ((sm3) this.viewModel).m186757x(null);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.im3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115648a.m168188m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m168189l0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m168190n0(String str, String str2) {
        ((sm3) this.viewModel).m186746j("window.$$notifyPaySuccess$$", str);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m168191o0(String str) {
        ((sm3) this.viewModel).m186746j("window.$$abortPay$$", str);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m168192p0(String str, String str2) {
        String query = Uri.parse(str).getQuery();
        if (!TextUtils.isEmpty(query)) {
            str2 = str2 + "&" + query;
        }
        ((sm3) this.viewModel).m186741F(str2);
    }

    /* JADX INFO: renamed from: q0 */
    public void m168193q0(long j, String str) {
        final String strM35344l3 = C4900o.m35344l3(str);
        why.m206536i(act(), j, str, new y20() { // from class: l.mm3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137466a.m168190n0(strM35344l3, (String) obj);
            }
        }, new x20() { // from class: l.nm3
            @Override // p153l.x20
            public final void call() {
                this.f142615a.m168191o0(strM35344l3);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m168194r0(final String str) {
        duringCreated((C22421c<T>) CoreModule.f18264c.f20403l1.m35353q3()).map(new qcj() { // from class: l.jm3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return om3.m168187k0((ThirdPartyInfo) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.km3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127433a.m168192p0(str, (String) obj);
            }
        }, new y20() { // from class: l.lm3
            @Override // p153l.y20
            public final void call(Object obj) {
                om3.m168181e0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
