package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class seg {

    /* JADX INFO: renamed from: a */
    public static Pattern f167612a;

    /* JADX INFO: renamed from: a */
    public static final Pattern m185533a() {
        if (f167612a == null) {
            synchronized (seg.class) {
                try {
                    if (f167612a == null) {
                        f167612a = Pattern.compile("^[\\p{L}_/0-9\u0e00-\u0e7f]{1,50}$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f167612a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m185534b() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m185535c() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m185536d() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.oversea_chinese);
    }

    /* JADX INFO: renamed from: e */
    public static void m185537e(i6t i6tVar, boolean z) {
        i6tVar.m213811F2().FansClubEvent.showFansClubBigEventDialog().mo199273j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public static void m185538f(i6t i6tVar, int i) {
        String strM203682n4 = (m185535c() || m185536d()) ? efv.f93853j : zrv.m221193k().m203682n4();
        if (TextUtils.isEmpty(strM203682n4)) {
            return;
        }
        i6tVar.m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7001).m174141B(strM203682n4).m174145s(qa00.m175859d(10.0f)).m174140A(bnl0.m105592y0(), i).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174146t(80).m174143q());
    }

    /* JADX INFO: renamed from: g */
    public static void m185539g(i6t i6tVar, int i) {
        i6tVar.m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7001).m174141B(efv.f93854k).m174140A(bnl0.m105592y0(), i).m174145s(qa00.m175859d(10.0f)).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174146t(80).m174143q());
    }

    /* JADX INFO: renamed from: h */
    public static void m185540h(i6t i6tVar, String str, String str2) {
        HashMap map = new HashMap();
        map.put("source", str2);
        i4g0.m138527y("e_live_fanbase_accompany", str, map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: i */
    public static void m185541i(i6t i6tVar) {
        HashMap map = new HashMap();
        map.put("liveFollow_from", "fanbase_accompany");
        map.put("receiver_user_id", i6tVar.m213810E2().m168532l0().f56859id);
        i4g0.m138521s(MatchScData.ModuleId.mid_e_follow, i6tVar.mo78457R2(), map);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: j */
    public static void m185542j(i6t i6tVar) {
        HashMap map = new HashMap();
        map.put("liveFollow_from", "fanbase_accompany");
        map.put("receiver_user_id", i6tVar.m213810E2().m168532l0().f56859id);
        i4g0.m138527y(MatchScData.ModuleId.mid_e_follow, i6tVar.mo78457R2(), map);
    }

    /* JADX INFO: renamed from: k */
    public static void m185543k(i6t i6tVar, String str, String str2, String str3, int i) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("giftId", str2);
        map.put("giftName", str3);
        map.put("giftUnitPrice", Integer.valueOf(i));
        i4g0.m138521s("e_live_fanbase_accompany_send_gift", i6tVar.mo78457R2(), map);
    }
}
