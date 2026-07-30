package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class aek0 extends o2e0<zit> {

    /* JADX INFO: renamed from: a */
    public static final String f70807a;

    /* JADX INFO: renamed from: b */
    public static final String f70808b;

    /* JADX INFO: renamed from: c */
    public static final String f70809c;

    static {
        String strM178247a = qv5.m178247a("live-activity");
        f70807a = strM178247a;
        f70808b = strM178247a + "/permanentActivity/turboCouponTask/userTask";
        f70809c = strM178247a + "/permanentActivity/turboCouponTask/anchorTask";
    }

    /* JADX INFO: renamed from: c */
    public final void m97255c(final gae0 gae0Var) {
        LivingNormalApiProvider.m72601b4(gae0Var.m213815L2()).subscribe(dhw.m115825d(new y20() { // from class: l.zdk0
            @Override // p153l.y20
            public final void call(Object obj) {
                gae0Var.m213811F2().BottomEvent.setUserAnchorTaskRedPotShow().mo199274m(Boolean.FALSE);
            }
        }));
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String str;
        String strM219937g = zitVar.m219937g("support_source");
        if (TextUtils.isEmpty(strM219937g)) {
            strM219937g = zitVar.m219937g("supportSource");
        }
        if (TextUtils.isEmpty(strM219937g)) {
            str = "?supportSource=unknown";
        } else {
            str = "?supportSource=" + strM219937g;
        }
        m97255c(gae0Var);
        px50.C19461a c19461aM174112c = px50.m174112c(200);
        StringBuilder sb = new StringBuilder();
        sb.append(gae0Var.m213815L2() ? f70809c : f70808b);
        sb.append(str);
        gae0Var.m213811F2().OpenH5Event.open().mo199273j(c19461aM174112c.m174141B(sb.toString()).m174140A(bnl0.m105592y0(), qa00.m175859d(555.0f)).m174142p(CommonH5Builder.BgType.TRAN_BG).m174146t(80).m174143q());
    }
}
