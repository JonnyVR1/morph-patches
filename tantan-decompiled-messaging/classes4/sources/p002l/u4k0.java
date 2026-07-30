package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.e30;
import l.ffw;
import l.mu5;
import l.t100;
import l.xdl0;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u4k0 extends kud0<ygt> {

    /* JADX INFO: renamed from: a */
    public static final String f20487a;

    /* JADX INFO: renamed from: b */
    public static final String f20488b;

    /* JADX INFO: renamed from: c */
    public static final String f20489c;

    static {
        String strA = mu5.a("live-activity");
        f20487a = strA;
        f20488b = strA + "/permanentActivity/turboCouponTask/userTask";
        f20489c = strA + "/permanentActivity/turboCouponTask/anchorTask";
    }

    /* JADX INFO: renamed from: c */
    public final void m23285c(final c2e0 c2e0Var) {
        LivingNormalApiProvider.m4784b4(c2e0Var.m25552L2()).subscribe(ffw.d(new e30() { // from class: l.t4k0
            public final void call(Object obj) {
                c2e0Var.m25548F2().BottomEvent.setUserAnchorTaskRedPotShow().m(Boolean.FALSE);
            }
        }));
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String str;
        String strG = ygtVar.g("support_source");
        if (TextUtils.isEmpty(strG)) {
            strG = ygtVar.g("supportSource");
        }
        if (TextUtils.isEmpty(strG)) {
            str = "?supportSource=unknown";
        } else {
            str = "?supportSource=" + strG;
        }
        m23285c(c2e0Var);
        jp50.C0638a c0638aM16064c = jp50.m16064c(200);
        StringBuilder sb = new StringBuilder();
        sb.append(c2e0Var.m25552L2() ? f20489c : f20488b);
        sb.append(str);
        c2e0Var.m25548F2().OpenH5Event.open().j(c0638aM16064c.m16094B(sb.toString()).m16093A(xdl0.y0(), t100.d(555.0f)).m16095p(CommonH5Builder.BgType.TRAN_BG).m16099t(80).m16096q());
    }
}
