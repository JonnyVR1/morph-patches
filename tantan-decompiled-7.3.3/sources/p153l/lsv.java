package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes5.dex */
public class lsv {
    /* JADX INFO: renamed from: a */
    public static kfd0.C18147a m155732a(kfd0.C18147a c18147a, oo2 oo2Var) {
        if (oo2Var == null) {
            return c18147a;
        }
        ajt.C15728a c15728aM168458I0 = oo2Var.m168458I0();
        c18147a.m149408q(c15728aM168458I0.m98481d());
        c18147a.m149401j(c15728aM168458I0.m98480c());
        BLiveAbsData bLiveAbsDataM168538n0 = oo2Var.m168538n0();
        if (bLiveAbsDataM168538n0 != null && !TextUtils.isEmpty(bLiveAbsDataM168538n0.f45171id)) {
            c18147a.m149400i(bLiveAbsDataM168538n0.f45171id);
        }
        User userM168532l0 = oo2Var.m168532l0();
        if (userM168532l0 != null && !TextUtils.isEmpty(userM168532l0.f56859id)) {
            c18147a.m149399h(userM168532l0.f56859id);
        }
        return c18147a;
    }
}
