package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.byd0;
import p153l.dy6;
import p153l.fo0;
import p153l.jxd0;
import p153l.jyb;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.qi20;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wyd0;
import p153l.zwk;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.p */
/* JADX INFO: loaded from: classes9.dex */
public class C4901p extends dy6 {

    /* JADX INFO: renamed from: Y */
    public static final String f20814Y;

    /* JADX INFO: renamed from: Z */
    public static final String f20815Z;

    /* JADX INFO: renamed from: a0 */
    public static final String f20816a0;

    /* JADX INFO: renamed from: b0 */
    public static final String f20817b0;

    /* JADX INFO: renamed from: c0 */
    public static final String f20818c0;

    /* JADX INFO: renamed from: d0 */
    public static final String f20819d0;

    /* JADX INFO: renamed from: e0 */
    public static final String f20820e0;

    /* JADX INFO: renamed from: f0 */
    public static C22507a<uxj0> f20821f0;

    /* JADX INFO: renamed from: g0 */
    public static C22507a<uxj0> f20822g0;

    /* JADX INFO: renamed from: R */
    public jxd0 f20823R;

    /* JADX INFO: renamed from: S */
    public vxd0 f20824S;

    /* JADX INFO: renamed from: T */
    public vxd0 f20825T;

    /* JADX INFO: renamed from: U */
    public vxd0 f20826U;

    /* JADX INFO: renamed from: V */
    public wyd0 f20827V;

    /* JADX INFO: renamed from: W */
    public byd0 f20828W;

    /* JADX INFO: renamed from: X */
    public List<Literatures> f20829X;

    static {
        f20814Y = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&cardId=%1$s#/cardPage");
        f20815Z = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&userID=%1$s&lid=%2$s#/moviepeoplelist");
        f20816a0 = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1#/addMovie");
        f20817b0 = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/movie-moment/index.html?speed=true&_bid=1002786&hideNavigationBar=1&hideNotch=1&userID=%1$s&showChat=%2$s&from=%3$s#/movieProfile");
        f20818c0 = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/bookFilmTVSeries/index.html?speed=true&_bid=1005425&hideNavigationBar=1&hideNotch=1#/addMovie");
        f20819d0 = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/bookFilmTVSeries/index.html?speed=true&_bid=1005425&hideNavigationBar=1&hideNotch=1&userID=%1$s&showChat=%2$s&from=%3$s#/movieProfile");
        f20820e0 = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/tags-movies/index.html?speed=true&_bid=1003556&hideNavigationBar=1&hideNotch=1#/addMovie");
        f20821f0 = C22507a.m222758b();
        f20822g0 = C22507a.m222758b();
    }

    public C4901p(C4883c c4883c) {
        super(c4883c);
        this.f20823R = new jxd0("chat_bubble_show_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f20824S = new vxd0("add_comment_number", 200);
        this.f20825T = new vxd0("core_add_artwork_click_number_" + CoreModule.m30929H().userId(), 0);
        this.f20826U = new vxd0("core_close_artwork_guide_number_" + CoreModule.m30929H().userId(), 0);
        this.f20827V = new wyd0("core_tag_artwork_show_" + CoreModule.m30929H().userId(), "");
        this.f20828W = new byd0("core_artwork_guide_show_time" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ CoreData m35361h3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: p3 */
    public static String m35366p3() {
        return CoreModule.m30933P().m143411h().mo45074sr() ? f20818c0 : f20816a0;
    }

    /* JADX INFO: renamed from: q3 */
    public static String m35367q3() {
        return CoreModule.m30933P().m143411h().mo45074sr() ? f20819d0 : f20817b0;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m35368m3(String str, CoreData coreData) {
        if (TextUtils.isEmpty(str) || coreData == null) {
            return;
        }
        List<Literatures> list = coreData.literatures;
        List<LiteraturesComments> list2 = coreData.literaturesComments;
        if (jyb.m147479J(list2) || jyb.m147479J(list)) {
            return;
        }
        for (Literatures literatures : list) {
            if (NullChecker.m82486a(literatures) && !TextUtils.isEmpty(literatures.f21175id)) {
                CoreModule.f18264c.f20381e0.m116490M9(literatures.f21175id, literatures);
            }
        }
        for (LiteraturesComments literaturesComments : list2) {
            if (literaturesComments != null) {
                Literatures literaturesM116566h7 = CoreModule.f18264c.f20381e0.m116566h7(literaturesComments.literatureID);
                if (NullChecker.m82486a(literaturesM116566h7)) {
                    literaturesComments.localLiteratures = literaturesM116566h7;
                }
            }
        }
        List<LiteraturesComments> listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(str);
        if (jyb.m147479J(listM116562g7)) {
            CoreModule.f18264c.f20381e0.m116486L9(str, list2);
        } else {
            listM116562g7.addAll(0, list2);
            CoreModule.f18264c.f20381e0.m116486L9(str, listM116562g7);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<Boolean> m35369n3(final String str, final String str2, final String str3, final String str4) {
        final String str5 = C4879a.m32203G("/literatures/") + str + "/comments/" + str2 + "?method=" + str4;
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interest_level", str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return CoreModule.f18264c.scheduled("literatures/" + str + "/comments/" + str2, -1, new pcj() { // from class: l.hl9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.al9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.il9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115554a.m35373t3(str4, str2, str3, str, (Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: o3 */
    public void m35370o3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strUserId = CoreModule.m30929H().userId();
        List<LiteraturesComments> listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(strUserId);
        if (!jyb.m147479J(listM116562g7)) {
            Iterator<LiteraturesComments> it = listM116562g7.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().f21176id, str)) {
                    it.remove();
                }
            }
        }
        CoreModule.f18264c.f20381e0.m116486L9(strUserId, listM116562g7);
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<CoreData> m35371r3(String str) {
        final String str2 = "/literature/" + str + "?user_id=" + CoreModule.m30929H().userId();
        return CoreModule.f18264c.scheduled(str2, 0, new pcj() { // from class: l.dl9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.el9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G(str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.fl9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4901p.m35361h3((Envelope) obj);
                    }
                });
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<List<Literatures>> m35372s3() {
        return CoreModule.f18264c.scheduled("oms/me/literatureConfigs", 0, new pcj() { // from class: l.yk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.cl9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/oms/me/literatureConfigs")).m209032f().m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.bl9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).literatureConfigInfo.suggestLiteratures;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m35373t3(String str, String str2, String str3, String str4, Envelope envelope) {
        if (envelope.meta.code != 200000) {
            return Boolean.FALSE;
        }
        if (TextUtils.equals(RequestParameters.SUBRESOURCE_DELETE, str)) {
            m35370o3(str2);
        } else {
            m35377x3(str2, str3);
        }
        if (RequestParameters.SUBRESOURCE_DELETE.equals(str)) {
            CoreModule.f18273l.m143405a().mo34420Th(str4);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m35374u3(String str, Envelope envelope) {
        if (envelope.meta.code != 200000) {
            return Boolean.FALSE;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData)) {
            m35368m3(CoreModule.m30929H().userId(), coreData);
        }
        CoreModule.f18273l.m143405a().mo34619wa(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ C22421c m35375v3(final String str, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.jl9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G(String.format("/literatures/%s/comments", str))).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.zk9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204754a.m35374u3(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<Boolean> m35376w3(final String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interest_level", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return scheduled("literature/id/comments/" + str, 0, new pcj() { // from class: l.gl9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104828a.m35375v3(str, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m35377x3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strUserId = CoreModule.m30929H().userId();
        List<LiteraturesComments> listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(strUserId);
        if (!jyb.m147479J(listM116562g7)) {
            for (LiteraturesComments literaturesComments : listM116562g7) {
                if (TextUtils.equals(literaturesComments.f21176id, str)) {
                    literaturesComments.interestLevel = str2;
                }
            }
        }
        CoreModule.f18264c.f20381e0.m116486L9(strUserId, listM116562g7);
    }
}
