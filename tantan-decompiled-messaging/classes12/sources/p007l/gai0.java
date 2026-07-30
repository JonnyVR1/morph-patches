package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.jsbridge.UserCenterBridgeImplementation;
import com.p000p1.mobile.putong.data.IdealTag;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.e400;
import l.e51;
import l.f30;
import l.f400;
import l.g53;
import l.mkd0;
import l.osi0;
import l.pj90;
import l.roj0;
import l.vwb;
import l.wn90;
import l.xaj0;
import l.xgc0;
import l.xma;
import l.xs90;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gai0 extends e400 {
    public gai0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m10436C(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        User userNa = CoreModule.c.e0.na();
        try {
            jSONObject2.put("introduce", userNa.description);
            jSONObject2.put("pictureNum", userNa.pictures.size());
            jSONObject2.put("answerNum", userNa.profile.answers.size());
            jSONObject2.put("mbti", wn90.Q(userNa));
            User userNa2 = CoreModule.c.e0.na();
            String userInfoForMarryStatus = userNa2.getUserInfoForMarryStatus();
            jSONObject2.put("reviewStatus", !(userNa2.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus)));
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            strSubstring = "";
        }
        f400Var.d().b(strOptString, new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m10437D(final f400 f400Var, JSONObject jSONObject) {
        if (!xma.L3()) {
            CoreModule.P().a().pr(f400Var.c(), "p_suggest_user_profile_info_view,e_profile_comment_button,click", Privilege.see_who_likes_me);
            return;
        }
        String strOptString = jSONObject.optString("otherId");
        final String strOptString2 = jSONObject.optString("callback");
        final String strOptString3 = jSONObject.optString("likeProfileId");
        f400Var.c().duringCreated(CoreModule.c.e0.Ka(strOptString).first()).subscribe(mkd0.G(new e30() { // from class: l.s9i0
            public final void call(Object obj) {
                f400 f400Var2 = f400Var;
                xs90.f(f400Var2.c(), (User) obj, strOptString3, true, false, "p_received_profile_like", new e30() { // from class: l.v9i0
                    public final void call(Object obj2) {
                        gai0.m10438E(f400Var2, str, (Relationship) obj2);
                    }
                }, new d30() { // from class: l.x9i0
                    public final void call() {
                        osi0.g("发送失败，请稍后再试");
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m10438E(f400 f400Var, String str, Relationship relationship) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", relationship.state.toString());
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m10440G(String str, f400 f400Var, Boolean bool) {
        if (TextUtils.equals(str, "home_card") && bool.booleanValue()) {
            f400Var.c().finish();
            p.g0.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m10443J(Literatures literatures, LiteraturesComments literaturesComments, final f400 f400Var, final String str, List list) {
        xaj0 xaj0VarG = BookMoviesDramasHelper.g(list, literatures, literaturesComments);
        ArrayList arrayList = new ArrayList();
        literaturesComments.localLiteratures = literatures;
        arrayList.add(literaturesComments);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((String) xaj0VarG.c);
        g53.d dVar = new g53.d("added_artwork", (String) xaj0VarG.b);
        CoreModule.c.e0.Pa(literaturesComments.userID);
        g53 g53Var = new g53();
        PutongAct putongActC = f400Var.c();
        String str2 = literaturesComments.userID;
        g53Var.F(putongActC, str2, OMSDialogPositon.p_suggest_user_profile_info_view, xgc0.c(str2), arrayList, arrayList2, dVar, new e30() { // from class: l.u9i0
            public final void call(Object obj) {
                gai0.m10440G(str, f400Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m10445L(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        List listL = BookMoviesDramasHelper.l(CoreModule.H().userId());
        if (vwb.J(listL)) {
            strSubstring = "{}";
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("literaturesComments", new JSONArray(LiteraturesComments.JSON_ADAPTER.ARRAY_ADAPTER().serialize(listL)));
                String strQuote = JSONObject.quote(jSONObject2.toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            } catch (JSONException unused) {
                strSubstring = "";
            }
        }
        f400Var.d().b(strOptString, new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m10447N(JSONObject jSONObject, final f400 f400Var) {
        CoreData coreData;
        final String strOptString = null;
        try {
            coreData = (CoreData) CoreData.JSON_ADAPTER.parse(jSONObject.toString());
            try {
                strOptString = jSONObject.optString("from");
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            coreData = null;
        }
        if (!NullChecker.a(coreData) || vwb.J(coreData.literatures) || vwb.J(coreData.literaturesComments)) {
            return;
        }
        final Literatures literatures = (Literatures) coreData.literatures.get(0);
        final LiteraturesComments literaturesComments = (LiteraturesComments) coreData.literaturesComments.get(0);
        f400Var.c().duringCreated(c.just(BookMoviesDramasHelper.n(CoreModule.H().userId(), literatures.id))).subscribe(mkd0.G(new e30() { // from class: l.q9i0
            public final void call(Object obj) {
                gai0.m10443J(literatures, literaturesComments, f400Var, strOptString, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m10448O(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("mbtiResult");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (wn90.Q(userP9) && TextUtils.equals(userP9.profile.extensions.basic.mbti.get(0), strOptString)) {
            return;
        }
        wn90.F().c = true;
        User userM19150clone = userP9.m19150clone();
        userM19150clone.profile.extensions.basic.mbti = new ArrayList();
        userM19150clone.profile.extensions.basic.mbti.add(0, strOptString);
        CoreModule.c.e0.u9(userM19150clone.subtract(userP9)).subscribe(mkd0.H(new e30() { // from class: l.o9i0
            public final void call(Object obj) {
                gai0.m10452S((roj0) obj);
            }
        }, new e30() { // from class: l.p9i0
            public final void call(Object obj) {
                osi0.g("结果提交失败，请稍后再试");
            }
        }));
        if (wn90.F().a != null) {
            wn90.F().a.profile.extensions.basic.mbti = new ArrayList();
            wn90.F().a.profile.extensions.basic.mbti.add(0, strOptString);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m10449P(JSONObject jSONObject, f400 f400Var) {
        String str;
        String strOptString = jSONObject.optString("from");
        if (xma.L3()) {
            osi0.g("您已是svip用户");
            return;
        }
        if (TextUtils.equals(strOptString, "swipe_like_max")) {
            str = "p_home,today_like_receive";
        } else {
            str = TextUtils.equals(strOptString, "me_like_max") ? "p_navigation,today_like_receive" : "";
        }
        CoreModule.P().a().pr(f400Var.c(), str, Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m10450Q(JSONArray jSONArray, IdealTag idealTag) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", idealTag.f221id);
            jSONObject.put("name", idealTag.name);
        } catch (JSONException unused) {
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m10452S(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m10453T(JSONObject jSONObject, final f400 f400Var) {
        final String strOptString = jSONObject.optString("callback");
        BookMoviesDramasHelper.j(f400Var.c(), jSONObject.optString("literatureID"), jSONObject.optString("category"), new f30() { // from class: l.t9i0
            public final void call(Object obj, Object obj2) {
                gai0.m10454U(f400Var, strOptString, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m10454U(f400 f400Var, String str, Boolean bool, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (bool.booleanValue()) {
                p.f0.onNext(roj0.a);
            }
            jSONObject.put("succeeded", bool.booleanValue() ? "1" : "0");
            if (TextUtils.equals(str2, "delete")) {
                str2 = "";
            }
            jSONObject.put("interestLevel", str2);
            String strQuote = JSONObject.quote(jSONObject.toString());
            f400Var.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m10455V(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        User userP9 = CoreModule.c.e0.p9();
        String strOptString = jSONObject.optString("callback");
        if (pj90.s(userP9)) {
            JSONObject jSONObject2 = new JSONObject();
            final JSONArray jSONArray = new JSONArray();
            vwb.z(userP9.profile.extensions.basic.ideal, new e30() { // from class: l.r9i0
                public final void call(Object obj) {
                    gai0.m10450Q(jSONArray, (IdealTag) obj);
                }
            });
            try {
                jSONObject2.put("idealTraits", jSONArray);
            } catch (JSONException unused) {
            }
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } else {
            strSubstring = "";
        }
        f400Var.d().b(strOptString, new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: m0 */
    private void m10457m0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m399H0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m10458A0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m433p1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m10459B0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m435q1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: X */
    public final void m10460X(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m436r0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: Y */
    public final void m10461Y(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.eai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10449P(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m10462Z(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.z9i0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10453T(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10463a0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().createUserTag(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m10464b0(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.fai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10436C(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m10465c0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m442w0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m10466d0(final f400 f400Var, final JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("idealTraits");
        if (jSONArrayOptJSONArray != null) {
            try {
                final List list = (List) IdealTag.JSON_ADAPTER.ARRAY_ADAPTER().parse(jSONArrayOptJSONArray.toString());
                e51.M(new Runnable() { // from class: l.aai0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5684a.m10478p0(jSONObject, f400Var, list);
                    }
                });
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m10467e0(final f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.y9i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15329a.m10479q0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m10468f0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m444y0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m10469g0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m393B0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m10470h0(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.dai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10455V(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10471i0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m395D0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m10472j0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.bai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10445L(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m10473k0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m396E0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10474l0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m398G0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: n */
    public boolean m10475n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "createUserPictureTag":
            case "createUserTag":
                m10463a0(f400Var, jSONObject);
                return true;
            case "datingEditConditions":
                m10464b0(f400Var, jSONObject);
                return true;
            case "openLiteratureGreetPage":
                m10484v0(f400Var, jSONObject);
                return true;
            case "datingLikesReceivedToProfile":
                new UserCenterBridgeImplementation().m441v0(f400Var, jSONObject, true);
                return true;
            case "getUserAvatars":
                m10471i0(f400Var, jSONObject);
                return true;
            case "action":
                m10460X(f400Var, jSONObject);
                return true;
            case "datingLikeBtn":
                m10480r0(f400Var, jSONObject);
                return true;
            case "safeQuitH5":
                m10485w0(f400Var);
                return true;
            case "datingTagAggregationToProfile":
                new UserCenterBridgeImplementation().m441v0(f400Var, jSONObject, false);
                return true;
            case "saveTagData":
                m10488z0(f400Var, jSONObject);
                return true;
            case "clickLiteratureButton":
                m10462Z(f400Var, jSONObject);
                return true;
            case "certSegSvip":
                m10461Y(f400Var, jSONObject);
                return true;
            case "getEditTagData":
                m10468f0(f400Var, jSONObject);
                return true;
            case "mbtiEndOfAnsweringQuestions":
                m10482t0(f400Var, jSONObject);
                return true;
            case "updateTagState":
                m10459B0(f400Var, jSONObject);
                return true;
            case "isNextBtnLast":
                m10474l0(f400Var, jSONObject);
                return true;
            case "updateProfileFacialFeature":
                m10458A0(f400Var, jSONObject);
                return true;
            case "didBindTagsToPics":
                m10465c0(f400Var, jSONObject);
                return true;
            case "getSelectedIdealTraits":
                m10470h0(f400Var, jSONObject);
                return true;
            case "getPicBindableTagData":
                m10469g0(f400Var, jSONObject);
                return true;
            case "saveProfileGameNameTagData":
                m10486x0(f400Var, jSONObject);
                return true;
            case "saveExploreFoodTagData":
                m10486x0(f400Var, jSONObject);
                return true;
            case "saveExploreGameCpTagData":
                m10486x0(f400Var, jSONObject);
                return true;
            case "nextBtnClick":
                m10481s0(f400Var, jSONObject);
                return true;
            case "getUserLiteratureComments":
                m10472j0(f400Var, jSONObject);
                return true;
            case "jumpToProfileAct":
                m10457m0(f400Var, jSONObject);
                return true;
            case "didSaveIdealTraits":
                m10466d0(f400Var, jSONObject);
                return true;
            case "saveSelectedTagData":
                m10487y0(f400Var, jSONObject);
                return true;
            case "getUserTagData":
                m10473k0(f400Var, jSONObject);
                return true;
            case "getDataCompleteness":
                m10467e0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m10476n0(f400 f400Var, String str, List list, Boolean bool) {
        osi0.g("保存成功");
        m10483u0(f400Var, str, true);
        if (!bool.booleanValue() || CoreModule.c.e0.h7 || vwb.J(list)) {
            return;
        }
        CoreModule.c.m0.o8();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m10477o0(f400 f400Var, String str, Throwable th) {
        m10483u0(f400Var, str, false);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m10478p0(JSONObject jSONObject, final f400 f400Var, final List list) {
        final String strOptString = jSONObject.optString("callback");
        f400Var.c().duringCreated(CoreModule.c.e0.ta(list)).subscribe(mkd0.H(new e30() { // from class: l.m9i0
            public final void call(Object obj) {
                this.f10364a.m10476n0(f400Var, strOptString, list, (Boolean) obj);
            }
        }, new e30() { // from class: l.n9i0
            public final void call(Object obj) {
                this.f10718a.m10477o0(f400Var, strOptString, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m10479q0(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        User userNa = CoreModule.c.e0.na();
        try {
            jSONObject2.put("completeness", wn90.F().B(((e400) this).d, userNa));
            jSONObject2.put("picCount", userNa.pictures.size());
            jSONObject2.put("signatureWordCount", userNa.description.length());
            jSONObject2.put("dataDone", "tantan://profile/edit");
            jSONObject2.put("certification", userNa.isPicVerificationVerified() || userNa.isIdCardVerified());
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            strSubstring = "";
        }
        f400Var.d().b(strOptString, new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10480r0(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.cai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10437D(f400Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m10481s0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m427j1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10482t0(f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.w9i0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10448O(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m10483u0(f400 f400Var, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z ? "true" : "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
    }

    /* JADX INFO: renamed from: v0 */
    public final void m10484v0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.l9i0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m10447N(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10485w0(@NonNull f400 f400Var) {
        new UserCenterBridgeImplementation().safeQuitH5(f400Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m10486x0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveExploreTagData(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m10487y0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveSelectedTagData(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m10488z0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveTagData(f400Var, jSONObject);
    }
}
