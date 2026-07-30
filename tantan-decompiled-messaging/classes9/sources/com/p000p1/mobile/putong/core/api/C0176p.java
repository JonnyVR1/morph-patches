package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.hpd0;
import l.jo0;
import l.juk;
import l.mkd0;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import rx.c;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.p */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0176p extends ax6 {

    /* JADX INFO: renamed from: Y */
    public static final String f4061Y;

    /* JADX INFO: renamed from: Z */
    public static final String f4062Z;

    /* JADX INFO: renamed from: a0 */
    public static final String f4063a0;

    /* JADX INFO: renamed from: b0 */
    public static final String f4064b0;

    /* JADX INFO: renamed from: c0 */
    public static final String f4065c0;

    /* JADX INFO: renamed from: d0 */
    public static final String f4066d0;

    /* JADX INFO: renamed from: e0 */
    public static final String f4067e0;

    /* JADX INFO: renamed from: f0 */
    public static a<roj0> f4068f0;

    /* JADX INFO: renamed from: g0 */
    public static a<roj0> f4069g0;

    /* JADX INFO: renamed from: R */
    public hpd0 f4070R;

    /* JADX INFO: renamed from: S */
    public tpd0 f4071S;

    /* JADX INFO: renamed from: T */
    public tpd0 f4072T;

    /* JADX INFO: renamed from: U */
    public tpd0 f4073U;

    /* JADX INFO: renamed from: V */
    public uqd0 f4074V;

    /* JADX INFO: renamed from: W */
    public zpd0 f4075W;

    /* JADX INFO: renamed from: X */
    public List<Literatures> f4076X;

    static {
        f4061Y = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&cardId=%1$s#/cardPage");
        f4062Z = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&userID=%1$s&lid=%2$s#/moviepeoplelist");
        f4063a0 = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1#/addMovie");
        f4064b0 = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&userID=%1$s&showChat=%2$s&from=%3$s#/movieProfile");
        f4065c0 = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/bookFilmTVSeries/index.html?speed=true&_bid=1005425&hideNavigationBar=1&hideNotch=1#/addMovie");
        f4066d0 = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/bookFilmTVSeries/index.html?speed=true&_bid=1005425&hideNavigationBar=1&hideNotch=1&userID=%1$s&showChat=%2$s&from=%3$s#/movieProfile");
        f4067e0 = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/tags-movies/index.html?speed=true&_bid=1003556&hideNavigationBar=1&hideNotch=1#/addMovie");
        f4068f0 = a.b();
        f4069g0 = a.b();
    }

    public C0176p(C0158c c0158c) {
        super(c0158c);
        this.f4070R = new hpd0("chat_bubble_show_" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f4071S = new tpd0("add_comment_number", 200);
        this.f4072T = new tpd0("core_add_artwork_click_number_" + CoreModule.m1850H().userId(), 0);
        this.f4073U = new tpd0("core_close_artwork_guide_number_" + CoreModule.m1850H().userId(), 0);
        this.f4074V = new uqd0("core_tag_artwork_show_" + CoreModule.m1850H().userId(), "");
        this.f4075W = new zpd0("core_artwork_guide_show_time" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: p3 */
    public static String m6300p3() {
        return CoreModule.m1854P().m11712h().sr() ? f4065c0 : f4063a0;
    }

    /* JADX INFO: renamed from: q3 */
    public static String m6301q3() {
        return CoreModule.m1854P().m11712h().sr() ? f4066d0 : f4064b0;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m6302m3(String str, CoreData coreData) {
        if (TextUtils.isEmpty(str) || coreData == null) {
            return;
        }
        List<Literatures> list = coreData.literatures;
        List<LiteraturesComments> list2 = coreData.literaturesComments;
        if (vwb.J(list2) || vwb.J(list)) {
            return;
        }
        for (Literatures literatures : list) {
            if (NullChecker.a(literatures) && !TextUtils.isEmpty(literatures.id)) {
                CoreModule.f1534c.f3628e0.m21380M9(literatures.id, literatures);
            }
        }
        for (LiteraturesComments literaturesComments : list2) {
            if (literaturesComments != null) {
                Literatures literaturesM21456h7 = CoreModule.f1534c.f3628e0.m21456h7(literaturesComments.literatureID);
                if (NullChecker.a(literaturesM21456h7)) {
                    literaturesComments.localLiteratures = literaturesM21456h7;
                }
            }
        }
        List<LiteraturesComments> listM21452g7 = CoreModule.f1534c.f3628e0.m21452g7(str);
        if (vwb.J(listM21452g7)) {
            CoreModule.f1534c.f3628e0.m21376L9(str, list2);
        } else {
            listM21452g7.addAll(0, list2);
            CoreModule.f1534c.f3628e0.m21376L9(str, listM21452g7);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public c<Boolean> m6303n3(final String str, final String str2, final String str3, final String str4) {
        final String str5 = C0154a.m3130G("/literatures/") + str + "/comments/" + str2 + "?method=" + str4;
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interest_level", str3);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return CoreModule.f1534c.scheduled("literatures/" + str + "/comments/" + str2, -1, new v9j() { // from class: l.yj9
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.rj9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.zj9
            public final Object call(Object obj) {
                return this.f28774a.m6307t3(str4, str2, str3, str, (Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: o3 */
    public void m6304o3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strUserId = CoreModule.m1850H().userId();
        List<LiteraturesComments> listM21452g7 = CoreModule.f1534c.f3628e0.m21452g7(strUserId);
        if (!vwb.J(listM21452g7)) {
            Iterator<LiteraturesComments> it = listM21452g7.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().id, str)) {
                    it.remove();
                }
            }
        }
        CoreModule.f1534c.f3628e0.m21376L9(strUserId, listM21452g7);
    }

    /* JADX INFO: renamed from: r3 */
    public c<CoreData> m6305r3(String str) {
        final String str2 = "/literature/" + str + "?user_id=" + CoreModule.m1850H().userId();
        return CoreModule.f1534c.scheduled(str2, 0, new v9j() { // from class: l.uj9
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.vj9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G(str)).f().b();
                    }
                }).map(new w9j() { // from class: l.wj9
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class);
                    }
                });
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: s3 */
    public c<List<Literatures>> m6306s3() {
        return CoreModule.f1534c.scheduled("oms/me/literatureConfigs", 0, new v9j() { // from class: l.pj9
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.tj9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/oms/me/literatureConfigs")).f().b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.sj9
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).literatureConfigInfo.suggestLiteratures;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m6307t3(String str, String str2, String str3, String str4, Envelope envelope) {
        if (envelope.meta.code != 200000) {
            return Boolean.FALSE;
        }
        if (TextUtils.equals("delete", str)) {
            m6304o3(str2);
        } else {
            m6311x3(str2, str3);
        }
        if ("delete".equals(str)) {
            CoreModule.f1543l.m11706a().m5354Th(str4);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m6308u3(String str, Envelope envelope) {
        if (envelope.meta.code != 200000) {
            return Boolean.FALSE;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.a(coreData)) {
            m6302m3(CoreModule.m1850H().userId(), coreData);
        }
        CoreModule.f1543l.m11706a().m5553wa(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ c m6309v3(final String str, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.ak9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G(String.format("/literatures/%s/comments", str))).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.qj9
            public final Object call(Object obj) {
                return this.f19850a.m6308u3(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public c<Boolean> m6310w3(final String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interest_level", str2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return scheduled("literature/id/comments/" + str, 0, new v9j() { // from class: l.xj9
            public final Object call() {
                return this.f27546a.m6309v3(str, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m6311x3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strUserId = CoreModule.m1850H().userId();
        List<LiteraturesComments> listM21452g7 = CoreModule.f1534c.f3628e0.m21452g7(strUserId);
        if (!vwb.J(listM21452g7)) {
            for (LiteraturesComments literaturesComments : listM21452g7) {
                if (TextUtils.equals(literaturesComments.id, str)) {
                    literaturesComments.interestLevel = str2;
                }
            }
        }
        CoreModule.f1534c.f3628e0.m21376L9(strUserId, listM21452g7);
    }
}
