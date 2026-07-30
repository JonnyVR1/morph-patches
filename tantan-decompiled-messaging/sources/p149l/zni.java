package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zni extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("rechargeUrl");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        Uri uri = Uri.parse(strM214763g);
        User userM132146l0 = c2e0Var.m206027E2().m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        String str = strM214763g + "&anchorId=" + userM132146l0.f56011id;
        List<Double> listM108787e = cuk.m108787e(uri, "0.86", "0.75");
        c2e0Var.m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(200).m142598B(str).m142609z(listM108787e.get(0).doubleValue(), listM108787e.get(1).doubleValue()).m142603t(17).m142600q());
        ((bgv) ypv.m215673l(fld0.f98151f)).m101744x(true);
    }
}
