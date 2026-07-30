package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import java.util.regex.Pattern;
import l.ddv;
import l.qib0;
import l.t100;
import l.xdl0;
import l.ypv;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class edg {

    /* JADX INFO: renamed from: a */
    public static Pattern f9680a;

    /* JADX INFO: renamed from: a */
    public static final Pattern m12317a() {
        if (f9680a == null) {
            synchronized (edg.class) {
                try {
                    if (f9680a == null) {
                        f9680a = Pattern.compile("^[\\p{L}_/0-9\u0e00-\u0e7f]{1,50}$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9680a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12318b() {
        return TEnum.equals(qib0.h0, "indonesia");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12319c() {
        return TEnum.equals(qib0.h0, "mainland");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12320d() {
        return TEnum.equals(qib0.h0, "oversea_chinese");
    }

    /* JADX INFO: renamed from: e */
    public static void m12321e(h4t h4tVar, boolean z) {
        h4tVar.m25548F2().FansClubEvent.showFansClubBigEventDialog().j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public static void m12322f(h4t h4tVar, int i) {
        String strN4 = (m12319c() || m12320d()) ? ddv.j : ypv.k().n4();
        if (TextUtils.isEmpty(strN4)) {
            return;
        }
        h4tVar.m25548F2().OpenH5Event.open().j(jp50.m16064c(7001).m16094B(strN4).m16098s(t100.d(10.0f)).m16093A(xdl0.y0(), i).m16095p(CommonH5Builder.BgType.DEFAULT_BG).m16099t(80).m16096q());
    }

    /* JADX INFO: renamed from: g */
    public static void m12323g(h4t h4tVar, int i) {
        h4tVar.m25548F2().OpenH5Event.open().j(jp50.m16064c(7001).m16094B(ddv.k).m16093A(xdl0.y0(), i).m16098s(t100.d(10.0f)).m16095p(CommonH5Builder.BgType.DEFAULT_BG).m16099t(80).m16096q());
    }

    /* JADX INFO: renamed from: h */
    public static void m12324h(h4t h4tVar, String str, String str2) {
        HashMap map = new HashMap();
        map.put("source", str2);
        zvf0.y("e_live_fanbase_accompany", str, map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public static void m12325i(h4t h4tVar) {
        HashMap map = new HashMap();
        map.put("liveFollow_from", "fanbase_accompany");
        map.put("receiver_user_id", ((DbObject) h4tVar.m25547E2().m14582l0()).id);
        zvf0.s("e_follow", h4tVar.mo21430R2(), map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public static void m12326j(h4t h4tVar) {
        HashMap map = new HashMap();
        map.put("liveFollow_from", "fanbase_accompany");
        map.put("receiver_user_id", ((DbObject) h4tVar.m25547E2().m14582l0()).id);
        zvf0.y("e_follow", h4tVar.mo21430R2(), map);
    }

    /* JADX INFO: renamed from: k */
    public static void m12327k(h4t h4tVar, String str, String str2, String str3, int i) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("giftId", str2);
        map.put("giftName", str3);
        map.put("giftUnitPrice", Integer.valueOf(i));
        zvf0.s("e_live_fanbase_accompany_send_gift", h4tVar.mo21430R2(), map);
    }
}
