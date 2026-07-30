package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class edg {

    /* JADX INFO: renamed from: a */
    public static Pattern f90605a;

    /* JADX INFO: renamed from: a */
    public static final Pattern m115796a() {
        if (f90605a == null) {
            synchronized (edg.class) {
                try {
                    if (f90605a == null) {
                        f90605a = Pattern.compile("^[\\p{L}_/0-9\u0e00-\u0e7f]{1,50}$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f90605a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m115797b() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m115798c() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m115799d() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.oversea_chinese);
    }

    /* JADX INFO: renamed from: e */
    public static void m115800e(h4t h4tVar, boolean z) {
        h4tVar.m206028F2().FansClubEvent.showFansClubBigEventDialog().mo172463j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public static void m115801f(h4t h4tVar, int i) {
        String strM195895n4 = (m115798c() || m115799d()) ? ddv.f85660j : ypv.m215672k().m195895n4();
        if (TextUtils.isEmpty(strM195895n4)) {
            return;
        }
        h4tVar.m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7001).m142598B(strM195895n4).m142602s(t100.m186890d(10.0f)).m142597A(xdl0.m208412y0(), i).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142603t(80).m142600q());
    }

    /* JADX INFO: renamed from: g */
    public static void m115802g(h4t h4tVar, int i) {
        h4tVar.m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7001).m142598B(ddv.f85661k).m142597A(xdl0.m208412y0(), i).m142602s(t100.m186890d(10.0f)).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142603t(80).m142600q());
    }

    /* JADX INFO: renamed from: h */
    public static void m115803h(h4t h4tVar, String str, String str2) {
        HashMap map = new HashMap();
        map.put("source", str2);
        zvf0.m220403y("e_live_fanbase_accompany", str, map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public static void m115804i(h4t h4tVar) {
        HashMap map = new HashMap();
        map.put("liveFollow_from", "fanbase_accompany");
        map.put("receiver_user_id", h4tVar.m206027E2().m132146l0().f56011id);
        zvf0.m220397s(MatchScData.ModuleId.mid_e_follow, h4tVar.mo77274R2(), map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public static void m115805j(h4t h4tVar) {
        HashMap map = new HashMap();
        map.put("liveFollow_from", "fanbase_accompany");
        map.put("receiver_user_id", h4tVar.m206027E2().m132146l0().f56011id);
        zvf0.m220403y(MatchScData.ModuleId.mid_e_follow, h4tVar.mo77274R2(), map);
    }

    /* JADX INFO: renamed from: k */
    public static void m115806k(h4t h4tVar, String str, String str2, String str3, int i) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("giftId", str2);
        map.put("giftName", str3);
        map.put("giftUnitPrice", Integer.valueOf(i));
        zvf0.m220397s("e_live_fanbase_accompany_send_gift", h4tVar.mo77274R2(), map);
    }
}
