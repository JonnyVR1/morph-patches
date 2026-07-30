package p153l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.webview.HolidayMaskMkWebAct;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.LiteratureConfig;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OmsLiteratureCardGuide;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public class shi0 extends wc00 {

    /* JADX INFO: renamed from: i */
    public static C22508b<Boolean> f168711i = C22508b.m222767b();

    /* JADX INFO: renamed from: j */
    public static C22507a<Boolean> f168712j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public static C22507a<uxj0> f168713k = C22507a.m222758b();

    /* JADX INFO: renamed from: l */
    public static C22507a<Boolean> f168714l = C22507a.m222758b();

    /* JADX INFO: renamed from: h */
    public User f168715h;

    public shi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        f168713k = C22507a.m222758b();
        f168711i = C22508b.m222767b();
        f168714l.m137019l(Boolean.FALSE);
        putongAct.duringCreated(f168711i).subscribe(psd0.m173596G(new y20() { // from class: l.tgi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174094a.m185913q0((Boolean) obj);
            }
        }));
        putongAct.duringCreated(f168713k).subscribe(psd0.m173596G(new y20() { // from class: l.ugi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178900a.m185914r0((uxj0) obj);
            }
        }));
        if (CoreModule.f18264c != null) {
            putongAct.runOnUiThread(new Runnable() { // from class: l.vgi0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184038a.m185915s0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static void m185869F0(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        int iOptInt;
        try {
            String string = jSONObject.getString("otherId");
            final String strOptString = jSONObject.optString("callback");
            try {
                iOptInt = jSONObject.optInt("isSuperLike", 0);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                qu2.m178128w(e);
                iOptInt = 0;
            }
            final boolean z = iOptInt == 1;
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(string).first()).subscribe(psd0.m173596G(new y20() { // from class: l.hhi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00 xc00Var2 = xc00Var;
                    o2c.m165712j(xc00Var2.mo99543c(), (User) obj, true, z, "p_selected_users", new y20() { // from class: l.ihi0
                        @Override // p153l.y20
                        public final void call(Object obj2) {
                            shi0.m185884Y(xc00Var2, str, (Relationship) obj2);
                        }
                    }, new x20() { // from class: l.jhi0
                        @Override // p153l.x20
                        public final void call() {
                            r1j0.m179420g("发送失败，请稍后再试");
                        }
                    });
                }
            }));
        } catch (JSONException e2) {
            CrashHelper.m82479c(e2);
            qu2.m178128w(e2);
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m185870K(xc00 xc00Var, uxj0 uxj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "true");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        String strSubstring = strQuote.substring(1, strQuote.length() - 1);
        r1j0.m179420g("购买成功");
        xc00Var.mo99544d().mo97004b("purchaseSuccessCallback", strSubstring);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m185872M(xc00 xc00Var, PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        xc00Var.mo99544d().mo97004b("purchaseSuccessCallback", strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m185876Q(final JSONObject jSONObject, final xc00 xc00Var) {
        String string;
        if (joa.m146358H3()) {
            m185869F0(xc00Var, jSONObject);
            return;
        }
        if (o2c.m165707e()) {
            try {
                string = jSONObject.getString("gender");
            } catch (JSONException unused) {
                string = "";
            }
            sxa0 sxa0Var = new sxa0(xc00Var.mo99543c(), "selected_users_card");
            sxa0Var.m188473J(string);
            sxa0Var.m188474K(3, new x20() { // from class: l.fhi0
                @Override // p153l.x20
                public final void call() {
                    shi0.m185889d0(xc00Var, jSONObject);
                }
            });
            return;
        }
        if (o2c.m165709g()) {
            new sxa0(xc00Var.mo99543c(), "other").m188474K(4, null);
        } else if (o2c.m165708f()) {
            m185869F0(xc00Var, jSONObject);
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ Boolean m185879T(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_PICKS || purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m185880U(JSONObject jSONObject, xc00 xc00Var) {
        boolean zM116545b8 = CoreModule.f18264c.f20381e0.m116545b8(false);
        xc00Var.mo99544d().mo97004b(jSONObject.optString("callback"), zM116545b8 ? "true" : "false");
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ PaymentResultWrapper m185882W(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m185883X(JSONObject jSONObject, xc00 xc00Var, List list) {
        OmsLiteratureCardGuide omsLiteratureCardGuide;
        String strOptString = jSONObject.optString("callback");
        String strOptString2 = jSONObject.optString("cardId");
        List<CoreSuggested.UserInfo> list2 = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
        if (!jyb.m147479J(list2)) {
            Iterator<CoreSuggested.UserInfo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    omsLiteratureCardGuide = null;
                    break;
                }
                CoreSuggested.UserInfo next = it.next();
                if (NullChecker.m82486a(next)) {
                    Object obj = next.extensionObject;
                    if ((obj instanceof OMSAdCardInfo) && TextUtils.equals(((OMSAdCardInfo) obj).identifier, strOptString2)) {
                        omsLiteratureCardGuide = ((OMSAdCardInfo) next.extensionObject).content.literatureCardGuide;
                        break;
                    }
                }
            }
        } else {
            omsLiteratureCardGuide = null;
            break;
        }
        if (NullChecker.m82486a(omsLiteratureCardGuide)) {
            try {
                List<LiteratureConfig> list3 = omsLiteratureCardGuide.literatureConfigs;
                Iterator<LiteratureConfig> it2 = list3.iterator();
                while (it2.hasNext()) {
                    LiteratureConfig next2 = it2.next();
                    if (NullChecker.m82486a(next2) && BookMoviesDramasHelper.m60626i(next2.f39614id)) {
                        it2.remove();
                    }
                }
                omsLiteratureCardGuide.literatureConfigs = list3;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("literatureCardGuide", omsLiteratureCardGuide.toJson());
                jSONObject2.put("selected_count", jyb.m147479J(list) ? 0 : list.size());
                String strQuote = JSONObject.quote(jSONObject2.toString());
                xc00Var.mo99544d().mo97004b(strOptString, strQuote.substring(1, strQuote.length() - 1));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m185884Y(xc00 xc00Var, String str, Relationship relationship) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        xc00Var.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m185888c0(xc00 xc00Var, PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", purchaseType == PurchaseType.TYPE_PICKS ? "true" : "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        xc00Var.mo99544d().mo97004b("purchaseSuccessCallback", strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m185889d0(final xc00 xc00Var, final JSONObject jSONObject) {
        if (o2c.m165709g()) {
            sxa0 sxa0Var = new sxa0(xc00Var.mo99543c(), "complete_profile");
            sxa0Var.m188474K(4, null);
            sxa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ghi0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    shi0.m185869F0(xc00Var, jSONObject);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m185891f0(xc00 xc00Var) {
        if (o2c.m165709g()) {
            new sxa0(xc00Var.mo99543c(), "other").m188474K(4, null);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m185893h0(xc00 xc00Var, PaymentResultWrapper paymentResultWrapper) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        String strSubstring = strQuote.substring(1, strQuote.length() - 1);
        r1j0.m179420g("购买成功");
        xc00Var.mo99544d().mo97004b("purchaseSuccessCallback", strSubstring);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ C22421c m185895j0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22421c.just(paymentResultWrapper) : CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.ahi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return shi0.m185882W(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final void m185896A0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new s5y(xc00Var).m184824e();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m185897B0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.qhi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157714a.m185916t0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m185898C0(@NonNull xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.wgi0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20381e0.m116601pa(CoreModule.m30929H().userId(), CoreData.JSON_ADAPTER.parse(jSONObject.optString("data")));
            }
        });
        CoreModule.f18264c.f20405m0.f20144c2.add("e_artowrk_multiple_choice_card");
    }

    /* JADX INFO: renamed from: D0 */
    public final void m185899D0(xc00 xc00Var, JSONObject jSONObject) {
        m185901G0(false);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m185900E0(xc00 xc00Var, JSONObject jSONObject) {
        m185901G0(true);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m185901G0(final boolean z) {
        this.f188308d.runOnUiThread(new Runnable() { // from class: l.ygi0
            @Override // java.lang.Runnable
            public final void run() {
                shi0.f168712j.m137019l(Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final void m185902H0(xc00 xc00Var, JSONObject jSONObject) {
        new th0.C20312a(xc00Var.mo99543c()).m191160s("修改未保存").m191148g(false).m191151j("是否保存已修改的内容？").m191147f("不保存").m191159r("保存").m191156o(new View.OnClickListener() { // from class: l.dhi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88529a.m185917u0(view);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.khi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126879a.m185918v0(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m185903I0(xc00 xc00Var, JSONObject jSONObject) {
        new th0.C20312a(xc00Var.mo99543c()).m191160s("照片未加载完成").m191148g(false).m191151j("未加载完成的照片将不被保存").m191147f("等待加载").m191159r("放弃保存").m191156o(new View.OnClickListener() { // from class: l.xgi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194198a.m185919w0(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m185904J0(xc00 xc00Var, JSONObject jSONObject) {
        m185901G0(false);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m185905K0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m185901G0(false);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m185906L0(xc00 xc00Var, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.getString("textContent");
        } catch (JSONException unused) {
            string = "";
        }
        String strCall = bsj0.f78170j.call(new SpannableString(string));
        StringBuilder sb = new StringBuilder("");
        sb.append(!TextUtils.isEmpty(strCall));
        m205740H(jSONObject, sb.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m185907k0(xc00 xc00Var, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.getString("isChange");
        } catch (JSONException unused) {
            string = "";
        }
        f168714l.m137019l(Boolean.valueOf("true".equals(string)));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m185908l0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || xc00Var.mo99543c() == null) {
            return;
        }
        String strOptString = jSONObject.optString("id");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreModule.f18264c.f20405m0.f20144c2.add(strOptString);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m185909m0(final xc00 xc00Var, final JSONObject jSONObject) {
        xc00Var.mo99543c().duringCreated(C22421c.just(BookMoviesDramasHelper.m60629l(CoreModule.m30929H().userId()))).subscribe(psd0.m173596G(new y20() { // from class: l.zgi0
            @Override // p153l.y20
            public final void call(Object obj) {
                shi0.m185883X(jSONObject, xc00Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m185910n0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        try {
            l51.m152893M(new Runnable() { // from class: l.phi0
                @Override // java.lang.Runnable
                public final void run() {
                    xc00Var.mo99544d().mo97004b(jSONObject.optString("callback"), String.valueOf(o2c.m165705c()));
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m185911o0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        if (this.f168715h == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            List<Media> list = this.f168715h.pictures;
            JSONArray jSONArray = new JSONArray();
            for (Media media : list) {
                if (!TextUtils.isEmpty(media.mediaType)) {
                    JSONObject jSONObject3 = new JSONObject();
                    if (media.mediaType.contains("video")) {
                        jSONObject3.put("imgUrl", media.cover().url);
                        jSONObject3.put("videoUrl", media.url);
                    } else if (media.mediaType.contains("image")) {
                        jSONObject3.put("imgUrl", media.url);
                        jSONObject3.put("videoUrl", "");
                    }
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject2.put("userId", this.f168715h.f56859id);
            jSONObject2.put("pictures", jSONArray);
        } catch (JSONException unused) {
        }
        m205740H(jSONObject, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: p0 */
    public void m185912p0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        try {
            l51.m152893M(new Runnable() { // from class: l.sgi0
                @Override // java.lang.Runnable
                public final void run() {
                    shi0.m185880U(jSONObject, xc00Var);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m185913q0(Boolean bool) {
        m205747x().m97006d("tantan_swipe_showKeyboard", bool + "");
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m185914r0(uxj0 uxj0Var) {
        m205747x().m97006d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m185915s0() {
        this.f168715h = CoreModule.f18264c.f20381e0.m116600p9();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m185916t0(JSONObject jSONObject, final xc00 xc00Var) {
        jSONObject.optString("otherId");
        String strOptString = jSONObject.optString("from");
        boolean zOptBoolean = jSONObject.optBoolean("hasVagueCards");
        if (!TextUtils.equals(strOptString, "rollingBottom")) {
            if (TextUtils.equals(strOptString, "clickMask")) {
                CoreModule.f18273l.m143405a().mo34407Sc(this.f188308d, "p_picks_view,e_picks_card,click_like", new y20() { // from class: l.ehi0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        shi0.m185888c0(xc00Var, (PurchaseType) obj);
                    }
                });
            }
        } else if (!joa.m146358H3() && o2c.m165707e()) {
            new sxa0(xc00Var.mo99543c(), "selected_users_swipe_up").m188474K(3, new x20() { // from class: l.bhi0
                @Override // p153l.x20
                public final void call() {
                    shi0.m185891f0(xc00Var);
                }
            });
        } else {
            if ((joa.m146358H3() || !o2c.m165708f()) && !(joa.m146358H3() && zOptBoolean)) {
                return;
            }
            CoreModule.f18273l.m143405a().mo34407Sc(this.f188308d, "p_picks_view,pull", new y20() { // from class: l.chi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    shi0.m185872M(xc00Var, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m185917u0(View view) {
        m205747x().m97006d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        byte b = -1;
        switch (str2.hashCode()) {
            case -1975037793:
                if (str2.equals("scrollCardRight")) {
                    b = 0;
                }
                break;
            case -1955789392:
                if (str2.equals("verifyWords")) {
                    b = 1;
                }
                break;
            case -1337822165:
                if (str2.equals("purchasePopup")) {
                    b = 2;
                }
                break;
            case -377787698:
                if (str2.equals("travelIntroductCancel")) {
                    b = 3;
                }
                break;
            case -364791970:
                if (str2.equals("getPicksViewButtonStyle")) {
                    b = 4;
                }
                break;
            case 122315163:
                if (str2.equals("travelCompleteDialog")) {
                    b = 5;
                }
                break;
            case 537972892:
                if (str2.equals("travelCancelDialog")) {
                    b = 6;
                }
                break;
            case 697027921:
                if (str2.equals("clickLikeButton")) {
                    b = 7;
                }
                break;
            case 804228610:
                if (str2.equals("completeInform")) {
                    b = 8;
                }
                break;
            case 884267951:
                if (str2.equals("h5Loading")) {
                    b = 9;
                }
                break;
            case 1153168785:
                if (str2.equals("getLiteratureData")) {
                    b = 10;
                }
                break;
            case 1235658811:
                if (str2.equals("travelImageCancel")) {
                    b = 11;
                }
                break;
            case 1245837353:
                if (str2.equals("purchaseMonitoring")) {
                    b = 12;
                }
                break;
            case 1321579812:
                if (str2.equals("scrollCardLeft")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1354992199:
                if (str2.equals("pickUpImageDialog")) {
                    b = 14;
                }
                break;
            case 1696454520:
                if (str2.equals("saveLiteratureData")) {
                    b = 15;
                }
                break;
            case 1811096719:
                if (str2.equals("getUserInfo")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1824834307:
                if (str2.equals("androidTravelIsChange")) {
                    b = 17;
                }
                break;
            case 1915473457:
                if (str2.equals("getMarriageState")) {
                    b = 18;
                }
                break;
        }
        switch (b) {
            case 0:
                m185900E0(xc00Var, jSONObject);
                return true;
            case 1:
                m185906L0(xc00Var, jSONObject);
                return true;
            case 2:
                m185897B0(xc00Var, jSONObject);
                return true;
            case 3:
                m185905K0(xc00Var, jSONObject);
                return true;
            case 4:
                m185910n0(xc00Var, jSONObject);
                return true;
            case 5:
                m185903I0(xc00Var, jSONObject);
                return true;
            case 6:
                m185902H0(xc00Var, jSONObject);
                return true;
            case 7:
                m185920x0(xc00Var, jSONObject);
                return true;
            case 8:
                m185908l0(xc00Var, jSONObject);
                return true;
            case 9:
                m185922z0(xc00Var, jSONObject);
                return true;
            case 10:
                m185909m0(xc00Var, jSONObject);
                return true;
            case 11:
                m185904J0(xc00Var, jSONObject);
                return true;
            case 12:
                m185921y0(xc00Var, jSONObject);
                return true;
            case 13:
                m185899D0(xc00Var, jSONObject);
                return true;
            case 14:
                m185896A0(xc00Var, jSONObject);
                return true;
            case 15:
                m185898C0(xc00Var, jSONObject);
                return true;
            case 16:
                m185911o0(xc00Var, jSONObject);
                return true;
            case 17:
                m185907k0(xc00Var, jSONObject);
                return true;
            case 18:
                m185912p0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m185918v0(View view) {
        m185901G0(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m185919w0(View view) {
        m205747x().m97006d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public void m185920x0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.rhi0
            @Override // java.lang.Runnable
            public final void run() {
                shi0.m185876Q(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m185921y0(final xc00 xc00Var, JSONObject jSONObject) {
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20400k1.m121124C3()).subscribe(psd0.m173596G(new y20() { // from class: l.lhi0
            @Override // p153l.y20
            public final void call(Object obj) {
                shi0.m185870K(xc00Var, (uxj0) obj);
            }
        }));
        xc00Var.mo99543c().duringCreated((C22421c) CoreModule.f18273l.m143410g().mo36025On().filter(new qcj() { // from class: l.mhi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return shi0.m185879T((PaymentResultWrapper) obj);
            }
        }).switchMap(new qcj() { // from class: l.nhi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return shi0.m185895j0((PaymentResultWrapper) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ohi0
            @Override // p153l.y20
            public final void call(Object obj) {
                shi0.m185893h0(xc00Var, (PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m185922z0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null) {
            return;
        }
        PutongAct putongActMo99543c = xc00Var.mo99543c();
        if (putongActMo99543c instanceof HolidayMaskMkWebAct) {
            ((HolidayMaskMkWebAct) putongActMo99543c).m59323c2();
        }
    }
}
