package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vqi extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r7v1, types: [l.oo2] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("rechargeUrl");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        Uri uri = Uri.parse(strM219937g);
        User userM168532l0 = gae0Var.m213810E2().m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        String str = strM219937g + "&anchorId=" + userM168532l0.f56859id;
        List<Double> listM188329e = swk.m188329e(uri, "0.86", "0.75");
        gae0Var.m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(200).m174141B(str).m174152z(listM188329e.get(0).doubleValue(), listM188329e.get(1).doubleValue()).m174146t(17).m174143q());
        ((civ) zrv.m221194l(htd0.f111524f)).m109980x(true);
    }
}
