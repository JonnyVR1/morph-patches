package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.hpd0;
import p149l.ia20;
import p149l.jo0;
import p149l.juk;
import p149l.mkd0;
import p149l.roj0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.p */
/* JADX INFO: loaded from: classes9.dex */
public class C4750p extends ax6 {

    /* JADX INFO: renamed from: Y */
    public static final String f20072Y;

    /* JADX INFO: renamed from: Z */
    public static final String f20073Z;

    /* JADX INFO: renamed from: a0 */
    public static final String f20074a0;

    /* JADX INFO: renamed from: b0 */
    public static final String f20075b0;

    /* JADX INFO: renamed from: c0 */
    public static final String f20076c0;

    /* JADX INFO: renamed from: d0 */
    public static final String f20077d0;

    /* JADX INFO: renamed from: e0 */
    public static final String f20078e0;

    /* JADX INFO: renamed from: f0 */
    public static C22392a<roj0> f20079f0;

    /* JADX INFO: renamed from: g0 */
    public static C22392a<roj0> f20080g0;

    /* JADX INFO: renamed from: R */
    public hpd0 f20081R;

    /* JADX INFO: renamed from: S */
    public tpd0 f20082S;

    /* JADX INFO: renamed from: T */
    public tpd0 f20083T;

    /* JADX INFO: renamed from: U */
    public tpd0 f20084U;

    /* JADX INFO: renamed from: V */
    public uqd0 f20085V;

    /* JADX INFO: renamed from: W */
    public zpd0 f20086W;

    /* JADX INFO: renamed from: X */
    public List<Literatures> f20087X;

    static {
        f20072Y = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&cardId=%1$s#/cardPage");
        f20073Z = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&userID=%1$s&lid=%2$s#/moviepeoplelist");
        f20074a0 = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1#/addMovie");
        f20075b0 = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&userID=%1$s&showChat=%2$s&from=%3$s#/movieProfile");
        f20076c0 = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/bookFilmTVSeries/index.html?speed=true&_bid=1005425&hideNavigationBar=1&hideNotch=1#/addMovie");
        f20077d0 = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/bookFilmTVSeries/index.html?speed=true&_bid=1005425&hideNavigationBar=1&hideNotch=1&userID=%1$s&showChat=%2$s&from=%3$s#/movieProfile");
        f20078e0 = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/tags-movies/index.html?speed=true&_bid=1003556&hideNavigationBar=1&hideNotch=1#/addMovie");
        f20079f0 = C22392a.m221512b();
        f20080g0 = C22392a.m221512b();
    }

    public C4750p(C4732c c4732c) {
        super(c4732c);
        this.f20081R = new hpd0("chat_bubble_show_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f20082S = new tpd0("add_comment_number", 200);
        this.f20083T = new tpd0("core_add_artwork_click_number_" + CoreModule.m29931H().userId(), 0);
        this.f20084U = new tpd0("core_close_artwork_guide_number_" + CoreModule.m29931H().userId(), 0);
        this.f20085V = new uqd0("core_tag_artwork_show_" + CoreModule.m29931H().userId(), "");
        this.f20086W = new zpd0("core_artwork_guide_show_time" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ CoreData m34358h3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: p3 */
    public static String m34363p3() {
        return CoreModule.m29935P().m94657h().mo43888sr() ? f20076c0 : f20074a0;
    }

    /* JADX INFO: renamed from: q3 */
    public static String m34364q3() {
        return CoreModule.m29935P().m94657h().mo43888sr() ? f20077d0 : f20075b0;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m34365m3(String str, CoreData coreData) {
        if (TextUtils.isEmpty(str) || coreData == null) {
            return;
        }
        List<Literatures> list = coreData.literatures;
        List<LiteraturesComments> list2 = coreData.literaturesComments;
        if (vwb.m200296J(list2) || vwb.m200296J(list)) {
            return;
        }
        for (Literatures literatures : list) {
            if (NullChecker.m81303a(literatures) && !TextUtils.isEmpty(literatures.f20433id)) {
                CoreModule.f17545c.f19639e0.m169417M9(literatures.f20433id, literatures);
            }
        }
        for (LiteraturesComments literaturesComments : list2) {
            if (literaturesComments != null) {
                Literatures literaturesM169493h7 = CoreModule.f17545c.f19639e0.m169493h7(literaturesComments.literatureID);
                if (NullChecker.m81303a(literaturesM169493h7)) {
                    literaturesComments.localLiteratures = literaturesM169493h7;
                }
            }
        }
        List<LiteraturesComments> listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(str);
        if (vwb.m200296J(listM169489g7)) {
            CoreModule.f17545c.f19639e0.m169413L9(str, list2);
        } else {
            listM169489g7.addAll(0, list2);
            CoreModule.f17545c.f19639e0.m169413L9(str, listM169489g7);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<Boolean> m34366n3(final String str, final String str2, final String str3, final String str4) {
        final String str5 = C4728a.m31200G("/literatures/") + str + "/comments/" + str2 + "?method=" + str4;
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interest_level", str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return CoreModule.f17545c.scheduled("literatures/" + str + "/comments/" + str2, -1, new v9j() { // from class: l.yj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.rj9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.zj9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203389a.m34370t3(str4, str2, str3, str, (Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: o3 */
    public void m34367o3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strUserId = CoreModule.m29931H().userId();
        List<LiteraturesComments> listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(strUserId);
        if (!vwb.m200296J(listM169489g7)) {
            Iterator<LiteraturesComments> it = listM169489g7.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().f20434id, str)) {
                    it.remove();
                }
            }
        }
        CoreModule.f17545c.f19639e0.m169413L9(strUserId, listM169489g7);
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<CoreData> m34368r3(String str) {
        final String str2 = "/literature/" + str + "?user_id=" + CoreModule.m29931H().userId();
        return CoreModule.f17545c.scheduled(str2, 0, new v9j() { // from class: l.uj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.vj9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G(str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.wj9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4750p.m34358h3((Envelope) obj);
                    }
                });
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<List<Literatures>> m34369s3() {
        return CoreModule.f17545c.scheduled("oms/me/literatureConfigs", 0, new v9j() { // from class: l.pj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.tj9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/oms/me/literatureConfigs")).m185887f().m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.sj9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).literatureConfigInfo.suggestLiteratures;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m34370t3(String str, String str2, String str3, String str4, Envelope envelope) {
        if (envelope.meta.code != 200000) {
            return Boolean.FALSE;
        }
        if (TextUtils.equals(RequestParameters.SUBRESOURCE_DELETE, str)) {
            m34367o3(str2);
        } else {
            m34374x3(str2, str3);
        }
        if (RequestParameters.SUBRESOURCE_DELETE.equals(str)) {
            CoreModule.f17554l.m94651a().mo33417Th(str4);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m34371u3(String str, Envelope envelope) {
        if (envelope.meta.code != 200000) {
            return Boolean.FALSE;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData)) {
            m34365m3(CoreModule.m29931H().userId(), coreData);
        }
        CoreModule.f17554l.m94651a().mo33616wa(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ C22306c m34372v3(final String str, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.ak9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G(String.format("/literatures/%s/comments", str))).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.qj9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154906a.m34371u3(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<Boolean> m34373w3(final String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interest_level", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return scheduled("literature/id/comments/" + str, 0, new v9j() { // from class: l.xj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193188a.m34372v3(str, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m34374x3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strUserId = CoreModule.m29931H().userId();
        List<LiteraturesComments> listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(strUserId);
        if (!vwb.m200296J(listM169489g7)) {
            for (LiteraturesComments literaturesComments : listM169489g7) {
                if (TextUtils.equals(literaturesComments.f20434id, str)) {
                    literaturesComments.interestLevel = str2;
                }
            }
        }
        CoreModule.f17545c.f19639e0.m169413L9(strUserId, listM169489g7);
    }
}
