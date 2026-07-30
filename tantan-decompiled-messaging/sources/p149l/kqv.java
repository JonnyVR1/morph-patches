package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes5.dex */
public class kqv {
    /* JADX INFO: renamed from: a */
    public static h7d0.C17241a m146959a(h7d0.C17241a c17241a, ho2 ho2Var) {
        if (ho2Var == null) {
            return c17241a;
        }
        zgt.C21695a c21695aM132069I0 = ho2Var.m132069I0();
        c17241a.m129678q(c21695aM132069I0.m218717d());
        c17241a.m129671j(c21695aM132069I0.m218716c());
        BLiveAbsData bLiveAbsDataM132152n0 = ho2Var.m132152n0();
        if (bLiveAbsDataM132152n0 != null && !TextUtils.isEmpty(bLiveAbsDataM132152n0.f44323id)) {
            c17241a.m129670i(bLiveAbsDataM132152n0.f44323id);
        }
        User userM132146l0 = ho2Var.m132146l0();
        if (userM132146l0 != null && !TextUtils.isEmpty(userM132146l0.f56011id)) {
            c17241a.m129669h(userM132146l0.f56011id);
        }
        return c17241a;
    }
}
