package p007l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.LiteratureConfig;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSAdCardInfo;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.data.OmsLiteratureCardGuide;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.webview.HolidayMaskMkWebAct;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.Iterator;
import java.util.List;
import l.au2;
import l.b1c;
import l.d30;
import l.e30;
import l.e400;
import l.e51;
import l.f400;
import l.mkd0;
import l.opa0;
import l.osi0;
import l.roj0;
import l.vwb;
import l.vwx;
import l.w9j;
import l.xh0;
import l.xma;
import l.yij0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s8i0 extends e400 {

    /* JADX INFO: renamed from: i */
    public static b<Boolean> f12827i = b.b();

    /* JADX INFO: renamed from: j */
    public static a<Boolean> f12828j = a.b();

    /* JADX INFO: renamed from: k */
    public static a<roj0> f12829k = a.b();

    /* JADX INFO: renamed from: l */
    public static a<Boolean> f12830l = a.b();

    /* JADX INFO: renamed from: h */
    public User f12831h;

    public s8i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        f12829k = a.b();
        f12827i = b.b();
        f12830l.onNext(Boolean.FALSE);
        putongAct.duringCreated(f12827i).subscribe(mkd0.G(new e30() { // from class: l.d8i0
            public final void call(Object obj) {
                this.f6866a.m14091i0((Boolean) obj);
            }
        }));
        putongAct.duringCreated(f12829k).subscribe(mkd0.G(new e30() { // from class: l.k8i0
            public final void call(Object obj) {
                this.f9634a.m14092j0((roj0) obj);
            }
        }));
        if (CoreModule.c != null) {
            putongAct.runOnUiThread(new Runnable() { // from class: l.l8i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9943a.m14093k0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14054C(f400 f400Var, roj0 roj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "true");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        String strSubstring = strQuote.substring(1, strQuote.length() - 1);
        osi0.g("购买成功");
        f400Var.d().b("purchaseSuccessCallback", new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14056E(f400 f400Var, PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.d().b("purchaseSuccessCallback", new String[]{strQuote.substring(1, strQuote.length() - 1)});
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14060I(final JSONObject jSONObject, final f400 f400Var) {
        String string;
        if (xma.G3()) {
            m14080x0(f400Var, jSONObject);
            return;
        }
        if (b1c.e()) {
            try {
                string = jSONObject.getString("gender");
            } catch (JSONException unused) {
                string = "";
            }
            opa0 opa0Var = new opa0(f400Var.c(), "selected_users_card");
            opa0Var.J(string);
            opa0Var.K(3, new d30() { // from class: l.f8i0
                public final void call() {
                    s8i0.m14073V(f400Var, jSONObject);
                }
            });
            return;
        }
        if (b1c.g()) {
            new opa0(f400Var.c(), "other").K(4, (d30) null);
        } else if (b1c.f()) {
            m14080x0(f400Var, jSONObject);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Boolean m14063L(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_PICKS || purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14064M(JSONObject jSONObject, f400 f400Var) {
        boolean zB8 = CoreModule.c.e0.b8(false);
        f400Var.d().b(jSONObject.optString("callback"), new String[]{zB8 ? "true" : "false"});
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ PaymentResultWrapper m14066O(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m14067P(JSONObject jSONObject, f400 f400Var, List list) {
        OmsLiteratureCardGuide omsLiteratureCardGuide;
        String strOptString = jSONObject.optString("callback");
        String strOptString2 = jSONObject.optString("cardId");
        List list2 = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
        if (!vwb.J(list2)) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    omsLiteratureCardGuide = null;
                    break;
                }
                CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) it.next();
                if (NullChecker.a(userInfo)) {
                    Object obj = userInfo.extensionObject;
                    if ((obj instanceof OMSAdCardInfo) && TextUtils.equals(((OMSAdCardInfo) obj).identifier, strOptString2)) {
                        omsLiteratureCardGuide = ((OMSAdCardInfo) userInfo.extensionObject).content.literatureCardGuide;
                        break;
                    }
                }
            }
        } else {
            omsLiteratureCardGuide = null;
            break;
        }
        if (NullChecker.a(omsLiteratureCardGuide)) {
            try {
                List<LiteratureConfig> list3 = omsLiteratureCardGuide.literatureConfigs;
                Iterator<LiteratureConfig> it2 = list3.iterator();
                while (it2.hasNext()) {
                    LiteratureConfig next = it2.next();
                    if (NullChecker.a(next) && BookMoviesDramasHelper.i(next.f227id)) {
                        it2.remove();
                    }
                }
                omsLiteratureCardGuide.literatureConfigs = list3;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("literatureCardGuide", omsLiteratureCardGuide.toJson());
                jSONObject2.put("selected_count", vwb.J(list) ? 0 : list.size());
                String strQuote = JSONObject.quote(jSONObject2.toString());
                f400Var.d().b(strOptString, new String[]{strQuote.substring(1, strQuote.length() - 1)});
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m14068Q(f400 f400Var, String str, Relationship relationship) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m14072U(f400 f400Var, PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", purchaseType == PurchaseType.TYPE_PICKS ? "true" : "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.d().b("purchaseSuccessCallback", new String[]{strQuote.substring(1, strQuote.length() - 1)});
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m14073V(final f400 f400Var, final JSONObject jSONObject) {
        if (b1c.g()) {
            opa0 opa0Var = new opa0(f400Var.c(), "complete_profile");
            opa0Var.K(4, (d30) null);
            opa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g8i0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    s8i0.m14080x0(f400Var, jSONObject);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m14075X(f400 f400Var) {
        if (b1c.g()) {
            new opa0(f400Var.c(), "other").K(4, (d30) null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m14077Z(f400 f400Var, PaymentResultWrapper paymentResultWrapper) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        String strSubstring = strQuote.substring(1, strQuote.length() - 1);
        osi0.g("购买成功");
        f400Var.d().b("purchaseSuccessCallback", new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ c m14079b0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? c.just(paymentResultWrapper) : CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.a8i0
            public final Object call(Object obj) {
                return s8i0.m14066O(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static void m14080x0(@NonNull final f400 f400Var, JSONObject jSONObject) {
        int iOptInt;
        try {
            String string = jSONObject.getString("otherId");
            final String strOptString = jSONObject.optString("callback");
            try {
                iOptInt = jSONObject.optInt("isSuperLike", 0);
            } catch (Exception e) {
                CrashHelper.c(e);
                au2.w(e);
                iOptInt = 0;
            }
            final boolean z = iOptInt == 1;
            f400Var.c().duringCreated(CoreModule.c.e0.Ka(string).first()).subscribe(mkd0.G(new e30() { // from class: l.h8i0
                public final void call(Object obj) {
                    f400 f400Var2 = f400Var;
                    b1c.j(f400Var2.c(), (User) obj, true, z, "p_selected_users", new e30() { // from class: l.i8i0
                        public final void call(Object obj2) {
                            s8i0.m14068Q(f400Var2, str, (Relationship) obj2);
                        }
                    }, new d30() { // from class: l.j8i0
                        public final void call() {
                            osi0.g("发送失败，请稍后再试");
                        }
                    });
                }
            }));
        } catch (JSONException e2) {
            CrashHelper.c(e2);
            au2.w(e2);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m14081A0(f400 f400Var, JSONObject jSONObject) {
        new xh0.a(f400Var.c()).s("照片未加载完成").g(false).j("未加载完成的照片将不被保存").f("等待加载").r("放弃保存").o(new View.OnClickListener() { // from class: l.x7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14791a.m14098o0(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m14082B0(f400 f400Var, JSONObject jSONObject) {
        m14107y0(false);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m14083C0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m14107y0(false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m14084D0(f400 f400Var, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.getString("textContent");
        } catch (JSONException unused) {
            string = "";
        }
        String str = (String) yij0.j.call(new SpannableString(string));
        StringBuilder sb = new StringBuilder("");
        sb.append(!TextUtils.isEmpty(str));
        z(jSONObject, sb.toString());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14085c0(f400 f400Var, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.getString("isChange");
        } catch (JSONException unused) {
            string = "";
        }
        f12830l.onNext(Boolean.valueOf("true".equals(string)));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m14086d0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.c() == null) {
            return;
        }
        String strOptString = jSONObject.optString("id");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreModule.c.m0.c2.add(strOptString);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m14087e0(final f400 f400Var, final JSONObject jSONObject) {
        f400Var.c().duringCreated(c.just(BookMoviesDramasHelper.l(CoreModule.H().userId()))).subscribe(mkd0.G(new e30() { // from class: l.z7i0
            public final void call(Object obj) {
                s8i0.m14067P(jSONObject, f400Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public void m14088f0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        try {
            e51.M(new Runnable() { // from class: l.t7i0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.d().b(jSONObject.optString("callback"), new String[]{String.valueOf(b1c.c())});
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m14089g0(@NonNull f400 f400Var, JSONObject jSONObject) {
        if (this.f12831h == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            List<Media> list = this.f12831h.pictures;
            JSONArray jSONArray = new JSONArray();
            for (Media media : list) {
                if (!TextUtils.isEmpty(media.mediaType)) {
                    JSONObject jSONObject3 = new JSONObject();
                    if (media.mediaType.contains("video")) {
                        jSONObject3.put("imgUrl", media.cover().url);
                        jSONObject3.put("videoUrl", media.url);
                    } else if (media.mediaType.contains(OMSTemplateModeType.image)) {
                        jSONObject3.put("imgUrl", media.url);
                        jSONObject3.put("videoUrl", "");
                    }
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject2.put("userId", ((DbObject) this.f12831h).id);
            jSONObject2.put("pictures", jSONArray);
        } catch (JSONException unused) {
        }
        z(jSONObject, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: h0 */
    public void m14090h0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        try {
            e51.M(new Runnable() { // from class: l.s7i0
                @Override // java.lang.Runnable
                public final void run() {
                    s8i0.m14064M(jSONObject, f400Var);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m14091i0(Boolean bool) {
        p().d("tantan_swipe_showKeyboard", new String[]{bool + ""});
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m14092j0(roj0 roj0Var) {
        p().d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m14093k0() {
        this.f12831h = CoreModule.c.e0.p9();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m14094l0(JSONObject jSONObject, final f400 f400Var) {
        jSONObject.optString("otherId");
        String strOptString = jSONObject.optString("from");
        boolean zOptBoolean = jSONObject.optBoolean("hasVagueCards");
        if (!TextUtils.equals(strOptString, "rollingBottom")) {
            if (TextUtils.equals(strOptString, "clickMask")) {
                CoreModule.l.a().Sc(((e400) this).d, "p_picks_view,e_picks_card,click_like", new e30() { // from class: l.e8i0
                    public final void call(Object obj) {
                        s8i0.m14072U(f400Var, (PurchaseType) obj);
                    }
                });
            }
        } else if (!xma.G3() && b1c.e()) {
            new opa0(f400Var.c(), "selected_users_swipe_up").K(3, new d30() { // from class: l.b8i0
                public final void call() {
                    s8i0.m14075X(f400Var);
                }
            });
        } else {
            if ((xma.G3() || !b1c.f()) && !(xma.G3() && zOptBoolean)) {
                return;
            }
            CoreModule.l.a().Sc(((e400) this).d, "p_picks_view,pull", new e30() { // from class: l.c8i0
                public final void call(Object obj) {
                    s8i0.m14056E(f400Var, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m14095m0(View view) {
        p().d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: n */
    public boolean m14096n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "scrollCardRight":
                m14106w0(f400Var, jSONObject);
                return true;
            case "verifyWords":
                m14084D0(f400Var, jSONObject);
                return true;
            case "purchasePopup":
                m14103t0(f400Var, jSONObject);
                return true;
            case "travelIntroductCancel":
                m14083C0(f400Var, jSONObject);
                return true;
            case "getPicksViewButtonStyle":
                m14088f0(f400Var, jSONObject);
                return true;
            case "travelCompleteDialog":
                m14081A0(f400Var, jSONObject);
                return true;
            case "travelCancelDialog":
                m14108z0(f400Var, jSONObject);
                return true;
            case "clickLikeButton":
                m14099p0(f400Var, jSONObject);
                return true;
            case "completeInform":
                m14086d0(f400Var, jSONObject);
                return true;
            case "h5Loading":
                m14101r0(f400Var, jSONObject);
                return true;
            case "getLiteratureData":
                m14087e0(f400Var, jSONObject);
                return true;
            case "travelImageCancel":
                m14082B0(f400Var, jSONObject);
                return true;
            case "purchaseMonitoring":
                m14100q0(f400Var, jSONObject);
                return true;
            case "scrollCardLeft":
                m14105v0(f400Var, jSONObject);
                return true;
            case "pickUpImageDialog":
                m14102s0(f400Var, jSONObject);
                return true;
            case "saveLiteratureData":
                m14104u0(f400Var, jSONObject);
                return true;
            case "getUserInfo":
                m14089g0(f400Var, jSONObject);
                return true;
            case "androidTravelIsChange":
                m14085c0(f400Var, jSONObject);
                return true;
            case "getMarriageState":
                m14090h0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m14097n0(View view) {
        m14107y0(false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m14098o0(View view) {
        p().d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public void m14099p0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.v7i0
            @Override // java.lang.Runnable
            public final void run() {
                s8i0.m14060I(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m14100q0(final f400 f400Var, JSONObject jSONObject) {
        f400Var.c().duringCreated(CoreModule.c.k1.C3()).subscribe(mkd0.G(new e30() { // from class: l.o8i0
            public final void call(Object obj) {
                s8i0.m14054C(f400Var, (roj0) obj);
            }
        }));
        f400Var.c().duringCreated(CoreModule.l.g().On().filter(new w9j() { // from class: l.p8i0
            public final Object call(Object obj) {
                return s8i0.m14063L((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.q8i0
            public final Object call(Object obj) {
                return s8i0.m14079b0((PaymentResultWrapper) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.r8i0
            public final void call(Object obj) {
                s8i0.m14077Z(f400Var, (PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m14101r0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null) {
            return;
        }
        HolidayMaskMkWebAct holidayMaskMkWebActC = f400Var.c();
        if (holidayMaskMkWebActC instanceof HolidayMaskMkWebAct) {
            holidayMaskMkWebActC.b2();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m14102s0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new vwx(f400Var).e();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m14103t0(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.u7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13578a.m14094l0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m14104u0(@NonNull f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.w7i0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.e0.pa(CoreModule.H().userId(), (CoreData) CoreData.JSON_ADAPTER.parse(jSONObject.optString(Data.TYPE)));
            }
        });
        CoreModule.c.m0.c2.add("e_artowrk_multiple_choice_card");
    }

    /* JADX INFO: renamed from: v0 */
    public final void m14105v0(f400 f400Var, JSONObject jSONObject) {
        m14107y0(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m14106w0(f400 f400Var, JSONObject jSONObject) {
        m14107y0(true);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m14107y0(final boolean z) {
        ((e400) this).d.runOnUiThread(new Runnable() { // from class: l.y7i0
            @Override // java.lang.Runnable
            public final void run() {
                s8i0.f12828j.onNext(Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m14108z0(f400 f400Var, JSONObject jSONObject) {
        new xh0.a(f400Var.c()).s("修改未保存").g(false).j("是否保存已修改的内容？").f("不保存").r("保存").o(new View.OnClickListener() { // from class: l.m8i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10270a.m14095m0(view);
            }
        }).c(new View.OnClickListener() { // from class: l.n8i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10707a.m14097n0(view);
            }
        }).a().g();
    }
}
