package p002l;

import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bgv;
import l.fld0;
import l.ygt;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zni extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("rechargeUrl");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        Uri uri = Uri.parse(strG);
        User userM14582l0 = c2e0Var.m25547E2().m14582l0();
        if (userM14582l0 == null) {
            return;
        }
        String str = strG + "&anchorId=" + ((DbObject) userM14582l0).id;
        List<Double> listM11382e = cuk.m11382e(uri, "0.86", "0.75");
        c2e0Var.m25548F2().OpenH5Event.open().j(jp50.m16064c(200).m16094B(str).m16105z(listM11382e.get(0).doubleValue(), listM11382e.get(1).doubleValue()).m16099t(17).m16096q());
        ((bgv) ypv.l(fld0.f)).x(true);
    }
}
