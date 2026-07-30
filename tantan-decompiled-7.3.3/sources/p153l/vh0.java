package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes12.dex */
public class vh0 extends AbstractC19971s4 {
    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: h */
    public void mo184311h(lq60 lq60Var) {
        lq60Var.m155322e().m159474k(m184306c().getString(R$string.f28308h));
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: i */
    public void mo114832i(lq60 lq60Var) {
        String str;
        if (NullChecker.m82486a(m184309f())) {
            str = NumberFormat.getNumberInstance().format(m184313l() ? m184318q().getFirstCouponPrice() : m184318q().defaultStockKeepUnit.prices.price);
        } else {
            str = "";
        }
        lq60Var.m155322e().m159475l(m184307d(str));
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: s */
    public boolean mo184320s(lq60 lq60Var) {
        return !(CoreModule.m30933P().m143405a().mo180463f() && wib0.m206565i(lq60Var.m155323f())) && !wib0.m206571o(lq60Var.m155323f()) && m184314m() && m184315n();
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        return !(CoreModule.m30933P().m143405a().mo180463f() && wib0.m206565i(lq60Var.m155323f())) && !wib0.m206571o(lq60Var.m155323f()) && m184314m() && m184315n();
    }
}
