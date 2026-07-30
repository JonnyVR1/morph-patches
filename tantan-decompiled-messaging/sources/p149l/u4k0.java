package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class u4k0 extends kud0<ygt> {

    /* JADX INFO: renamed from: a */
    public static final String f174604a;

    /* JADX INFO: renamed from: b */
    public static final String f174605b;

    /* JADX INFO: renamed from: c */
    public static final String f174606c;

    static {
        String strM156376a = mu5.m156376a("live-activity");
        f174604a = strM156376a;
        f174605b = strM156376a + "/permanentActivity/turboCouponTask/userTask";
        f174606c = strM156376a + "/permanentActivity/turboCouponTask/anchorTask";
    }

    /* JADX INFO: renamed from: c */
    public final void m191740c(final c2e0 c2e0Var) {
        LivingNormalApiProvider.m71418b4(c2e0Var.m206032L2()).subscribe(ffw.m121193d(new e30() { // from class: l.t4k0
            @Override // p149l.e30
            public final void call(Object obj) {
                c2e0Var.m206028F2().BottomEvent.setUserAnchorTaskRedPotShow().mo172464m(Boolean.FALSE);
            }
        }));
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String str;
        String strM214763g = ygtVar.m214763g("support_source");
        if (TextUtils.isEmpty(strM214763g)) {
            strM214763g = ygtVar.m214763g("supportSource");
        }
        if (TextUtils.isEmpty(strM214763g)) {
            str = "?supportSource=unknown";
        } else {
            str = "?supportSource=" + strM214763g;
        }
        m191740c(c2e0Var);
        jp50.C17834a c17834aM142568c = jp50.m142568c(200);
        StringBuilder sb = new StringBuilder();
        sb.append(c2e0Var.m206032L2() ? f174606c : f174605b);
        sb.append(str);
        c2e0Var.m206028F2().OpenH5Event.open().mo172463j(c17834aM142568c.m142598B(sb.toString()).m142597A(xdl0.m208412y0(), t100.m186890d(555.0f)).m142599p(CommonH5Builder.BgType.TRAN_BG).m142603t(80).m142600q());
    }
}
