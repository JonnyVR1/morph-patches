package p149l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.webview.HolidayMaskMkWebAct;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.LiteratureConfig;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OmsLiteratureCardGuide;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
public class s8i0 extends e400 {

    /* JADX INFO: renamed from: i */
    public static C22393b<Boolean> f163068i = C22393b.m221521b();

    /* JADX INFO: renamed from: j */
    public static C22392a<Boolean> f163069j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public static C22392a<roj0> f163070k = C22392a.m221512b();

    /* JADX INFO: renamed from: l */
    public static C22392a<Boolean> f163071l = C22392a.m221512b();

    /* JADX INFO: renamed from: h */
    public User f163072h;

    public s8i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        f163070k = C22392a.m221512b();
        f163068i = C22393b.m221521b();
        f163071l.m132487l(Boolean.FALSE);
        putongAct.duringCreated(f163068i).subscribe(mkd0.m154955G(new e30() { // from class: l.d8i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84872a.m182632i0((Boolean) obj);
            }
        }));
        putongAct.duringCreated(f163070k).subscribe(mkd0.m154955G(new e30() { // from class: l.k8i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121833a.m182633j0((roj0) obj);
            }
        }));
        if (CoreModule.f17545c != null) {
            putongAct.runOnUiThread(new Runnable() { // from class: l.l8i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126830a.m182634k0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m182595C(f400 f400Var, roj0 roj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "true");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        String strSubstring = strQuote.substring(1, strQuote.length() - 1);
        osi0.m165783g("购买成功");
        f400Var.mo102962d().mo127285b("purchaseSuccessCallback", strSubstring);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m182597E(f400 f400Var, PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.mo102962d().mo127285b("purchaseSuccessCallback", strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m182601I(final JSONObject jSONObject, final f400 f400Var) {
        String string;
        if (xma.m210044G3()) {
            m182621x0(f400Var, jSONObject);
            return;
        }
        if (b1c.m99816e()) {
            try {
                string = jSONObject.getString("gender");
            } catch (JSONException unused) {
                string = "";
            }
            opa0 opa0Var = new opa0(f400Var.mo102961c(), "selected_users_card");
            opa0Var.m165326J(string);
            opa0Var.m165327K(3, new d30() { // from class: l.f8i0
                @Override // p149l.d30
                public final void call() {
                    s8i0.m182614V(f400Var, jSONObject);
                }
            });
            return;
        }
        if (b1c.m99818g()) {
            new opa0(f400Var.mo102961c(), "other").m165327K(4, null);
        } else if (b1c.m99817f()) {
            m182621x0(f400Var, jSONObject);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Boolean m182604L(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_PICKS || purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m182605M(JSONObject jSONObject, f400 f400Var) {
        boolean zM169472b8 = CoreModule.f17545c.f19639e0.m169472b8(false);
        f400Var.mo102962d().mo127285b(jSONObject.optString("callback"), zM169472b8 ? "true" : "false");
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ PaymentResultWrapper m182607O(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m182608P(JSONObject jSONObject, f400 f400Var, List list) {
        OmsLiteratureCardGuide omsLiteratureCardGuide;
        String strOptString = jSONObject.optString("callback");
        String strOptString2 = jSONObject.optString("cardId");
        List<CoreSuggested.UserInfo> list2 = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
        if (!vwb.m200296J(list2)) {
            Iterator<CoreSuggested.UserInfo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    omsLiteratureCardGuide = null;
                    break;
                }
                CoreSuggested.UserInfo next = it.next();
                if (NullChecker.m81303a(next)) {
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
        if (NullChecker.m81303a(omsLiteratureCardGuide)) {
            try {
                List<LiteratureConfig> list3 = omsLiteratureCardGuide.literatureConfigs;
                Iterator<LiteratureConfig> it2 = list3.iterator();
                while (it2.hasNext()) {
                    LiteratureConfig next2 = it2.next();
                    if (NullChecker.m81303a(next2) && BookMoviesDramasHelper.m59442i(next2.f38766id)) {
                        it2.remove();
                    }
                }
                omsLiteratureCardGuide.literatureConfigs = list3;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("literatureCardGuide", omsLiteratureCardGuide.toJson());
                jSONObject2.put("selected_count", vwb.m200296J(list) ? 0 : list.size());
                String strQuote = JSONObject.quote(jSONObject2.toString());
                f400Var.mo102962d().mo127285b(strOptString, strQuote.substring(1, strQuote.length() - 1));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m182609Q(f400 f400Var, String str, Relationship relationship) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m182613U(f400 f400Var, PurchaseType purchaseType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", purchaseType == PurchaseType.TYPE_PICKS ? "true" : "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.mo102962d().mo127285b("purchaseSuccessCallback", strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m182614V(final f400 f400Var, final JSONObject jSONObject) {
        if (b1c.m99818g()) {
            opa0 opa0Var = new opa0(f400Var.mo102961c(), "complete_profile");
            opa0Var.m165327K(4, null);
            opa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g8i0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    s8i0.m182621x0(f400Var, jSONObject);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m182616X(f400 f400Var) {
        if (b1c.m99818g()) {
            new opa0(f400Var.mo102961c(), "other").m165327K(4, null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m182618Z(f400 f400Var, PaymentResultWrapper paymentResultWrapper) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSingle", "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        String strSubstring = strQuote.substring(1, strQuote.length() - 1);
        osi0.m165783g("购买成功");
        f400Var.mo102962d().mo127285b("purchaseSuccessCallback", strSubstring);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ C22306c m182620b0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22306c.just(paymentResultWrapper) : CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.a8i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s8i0.m182607O(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static void m182621x0(@NonNull final f400 f400Var, JSONObject jSONObject) {
        int iOptInt;
        try {
            String string = jSONObject.getString("otherId");
            final String strOptString = jSONObject.optString("callback");
            try {
                iOptInt = jSONObject.optInt("isSuperLike", 0);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                au2.m98935w(e);
                iOptInt = 0;
            }
            final boolean z = iOptInt == 1;
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(string).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.h8i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400 f400Var2 = f400Var;
                    b1c.m99821j(f400Var2.mo102961c(), (User) obj, true, z, "p_selected_users", new e30() { // from class: l.i8i0
                        @Override // p149l.e30
                        public final void call(Object obj2) {
                            s8i0.m182609Q(f400Var2, str, (Relationship) obj2);
                        }
                    }, new d30() { // from class: l.j8i0
                        @Override // p149l.d30
                        public final void call() {
                            osi0.m165783g("发送失败，请稍后再试");
                        }
                    });
                }
            }));
        } catch (JSONException e2) {
            CrashHelper.m81296c(e2);
            au2.m98935w(e2);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m182622A0(f400 f400Var, JSONObject jSONObject) {
        new xh0.C21150a(f400Var.mo102961c()).m208740s("照片未加载完成").m208728g(false).m208731j("未加载完成的照片将不被保存").m208727f("等待加载").m208739r("放弃保存").m208736o(new View.OnClickListener() { // from class: l.x7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191365a.m182638o0(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m182623B0(f400 f400Var, JSONObject jSONObject) {
        m182647y0(false);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m182624C0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m182647y0(false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m182625D0(f400 f400Var, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.getString("textContent");
        } catch (JSONException unused) {
            string = "";
        }
        String strCall = yij0.f198513j.call(new SpannableString(string));
        StringBuilder sb = new StringBuilder("");
        sb.append(!TextUtils.isEmpty(strCall));
        m114661z(jSONObject, sb.toString());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m182626c0(f400 f400Var, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.getString("isChange");
        } catch (JSONException unused) {
            string = "";
        }
        f163071l.m132487l(Boolean.valueOf("true".equals(string)));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m182627d0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.mo102961c() == null) {
            return;
        }
        String strOptString = jSONObject.optString("id");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreModule.f17545c.f19663m0.f19402c2.add(strOptString);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m182628e0(final f400 f400Var, final JSONObject jSONObject) {
        f400Var.mo102961c().duringCreated(C22306c.just(BookMoviesDramasHelper.m59445l(CoreModule.m29931H().userId()))).subscribe(mkd0.m154955G(new e30() { // from class: l.z7i0
            @Override // p149l.e30
            public final void call(Object obj) {
                s8i0.m182608P(jSONObject, f400Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public void m182629f0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        try {
            e51.m114748M(new Runnable() { // from class: l.t7i0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.mo102962d().mo127285b(jSONObject.optString("callback"), String.valueOf(b1c.m99814c()));
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m182630g0(@NonNull f400 f400Var, JSONObject jSONObject) {
        if (this.f163072h == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            List<Media> list = this.f163072h.pictures;
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
            jSONObject2.put("userId", this.f163072h.f56011id);
            jSONObject2.put("pictures", jSONArray);
        } catch (JSONException unused) {
        }
        m114661z(jSONObject, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: h0 */
    public void m182631h0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        try {
            e51.m114748M(new Runnable() { // from class: l.s7i0
                @Override // java.lang.Runnable
                public final void run() {
                    s8i0.m182605M(jSONObject, f400Var);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m182632i0(Boolean bool) {
        m114651p().m134312d("tantan_swipe_showKeyboard", bool + "");
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m182633j0(roj0 roj0Var) {
        m114651p().m134312d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m182634k0() {
        this.f163072h = CoreModule.f17545c.f19639e0.m169527p9();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m182635l0(JSONObject jSONObject, final f400 f400Var) {
        jSONObject.optString("otherId");
        String strOptString = jSONObject.optString("from");
        boolean zOptBoolean = jSONObject.optBoolean("hasVagueCards");
        if (!TextUtils.equals(strOptString, "rollingBottom")) {
            if (TextUtils.equals(strOptString, "clickMask")) {
                CoreModule.f17554l.m94651a().mo33404Sc(this.f89239d, "p_picks_view,e_picks_card,click_like", new e30() { // from class: l.e8i0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        s8i0.m182613U(f400Var, (PurchaseType) obj);
                    }
                });
            }
        } else if (!xma.m210044G3() && b1c.m99816e()) {
            new opa0(f400Var.mo102961c(), "selected_users_swipe_up").m165327K(3, new d30() { // from class: l.b8i0
                @Override // p149l.d30
                public final void call() {
                    s8i0.m182616X(f400Var);
                }
            });
        } else {
            if ((xma.m210044G3() || !b1c.m99817f()) && !(xma.m210044G3() && zOptBoolean)) {
                return;
            }
            CoreModule.f17554l.m94651a().mo33404Sc(this.f89239d, "p_picks_view,pull", new e30() { // from class: l.c8i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    s8i0.m182597E(f400Var, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m182636m0(View view) {
        m114651p().m134312d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
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
                m182646w0(f400Var, jSONObject);
                return true;
            case 1:
                m182625D0(f400Var, jSONObject);
                return true;
            case 2:
                m182643t0(f400Var, jSONObject);
                return true;
            case 3:
                m182624C0(f400Var, jSONObject);
                return true;
            case 4:
                m182629f0(f400Var, jSONObject);
                return true;
            case 5:
                m182622A0(f400Var, jSONObject);
                return true;
            case 6:
                m182648z0(f400Var, jSONObject);
                return true;
            case 7:
                m182639p0(f400Var, jSONObject);
                return true;
            case 8:
                m182627d0(f400Var, jSONObject);
                return true;
            case 9:
                m182641r0(f400Var, jSONObject);
                return true;
            case 10:
                m182628e0(f400Var, jSONObject);
                return true;
            case 11:
                m182623B0(f400Var, jSONObject);
                return true;
            case 12:
                m182640q0(f400Var, jSONObject);
                return true;
            case 13:
                m182645v0(f400Var, jSONObject);
                return true;
            case 14:
                m182642s0(f400Var, jSONObject);
                return true;
            case 15:
                m182644u0(f400Var, jSONObject);
                return true;
            case 16:
                m182630g0(f400Var, jSONObject);
                return true;
            case 17:
                m182626c0(f400Var, jSONObject);
                return true;
            case 18:
                m182631h0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m182637n0(View view) {
        m182647y0(false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m182638o0(View view) {
        m114651p().m134312d("tantan_swipe_travelDialogSave", new String[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public void m182639p0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.v7i0
            @Override // java.lang.Runnable
            public final void run() {
                s8i0.m182601I(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m182640q0(final f400 f400Var, JSONObject jSONObject) {
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19658k1.m184463C3()).subscribe(mkd0.m154955G(new e30() { // from class: l.o8i0
            @Override // p149l.e30
            public final void call(Object obj) {
                s8i0.m182595C(f400Var, (roj0) obj);
            }
        }));
        f400Var.mo102961c().duringCreated((C22306c) CoreModule.f17554l.m94656g().mo35022On().filter(new w9j() { // from class: l.p8i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s8i0.m182604L((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.q8i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return s8i0.m182620b0((PaymentResultWrapper) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.r8i0
            @Override // p149l.e30
            public final void call(Object obj) {
                s8i0.m182618Z(f400Var, (PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m182641r0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null) {
            return;
        }
        PutongAct putongActMo102961c = f400Var.mo102961c();
        if (putongActMo102961c instanceof HolidayMaskMkWebAct) {
            ((HolidayMaskMkWebAct) putongActMo102961c).m58140b2();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m182642s0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new vwx(f400Var).m200464e();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m182643t0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.u7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f175009a.m182635l0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m182644u0(@NonNull f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.w7i0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19639e0.m169528pa(CoreModule.m29931H().userId(), CoreData.JSON_ADAPTER.parse(jSONObject.optString("data")));
            }
        });
        CoreModule.f17545c.f19663m0.f19402c2.add("e_artowrk_multiple_choice_card");
    }

    /* JADX INFO: renamed from: v0 */
    public final void m182645v0(f400 f400Var, JSONObject jSONObject) {
        m182647y0(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m182646w0(f400 f400Var, JSONObject jSONObject) {
        m182647y0(true);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m182647y0(final boolean z) {
        this.f89239d.runOnUiThread(new Runnable() { // from class: l.y7i0
            @Override // java.lang.Runnable
            public final void run() {
                s8i0.f163069j.m132487l(Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m182648z0(f400 f400Var, JSONObject jSONObject) {
        new xh0.C21150a(f400Var.mo102961c()).m208740s("修改未保存").m208728g(false).m208731j("是否保存已修改的内容？").m208727f("不保存").m208739r("保存").m208736o(new View.OnClickListener() { // from class: l.m8i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132579a.m182636m0(view);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.n8i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137653a.m182637n0(view);
            }
        }).m208722a().m208721g();
    }
}
