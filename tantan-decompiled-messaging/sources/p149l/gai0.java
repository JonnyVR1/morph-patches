package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.UserCenterBridgeImplementation;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class gai0 extends e400 {
    public gai0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m124947C(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        try {
            jSONObject2.put(KnowMyselfShareParams.TYPE_INTRODUCE, userM169520na.description);
            jSONObject2.put("pictureNum", userM169520na.pictures.size());
            jSONObject2.put("answerNum", userM169520na.profile.answers.size());
            jSONObject2.put(ProfileLikeType.mbti, wn90.m204604Q(userM169520na));
            User userM169520na2 = CoreModule.f17545c.f19639e0.m169520na();
            String userInfoForMarryStatus = userM169520na2.getUserInfoForMarryStatus();
            jSONObject2.put("reviewStatus", !(userM169520na2.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus)));
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            strSubstring = "";
        }
        f400Var.mo102962d().mo127285b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m124948D(final f400 f400Var, JSONObject jSONObject) {
        if (!xma.m210047L3()) {
            CoreModule.m29935P().m94651a().mo33565pr(f400Var.mo102961c(), "p_suggest_user_profile_info_view,e_profile_comment_button,click", Privilege.see_who_likes_me);
            return;
        }
        String strOptString = jSONObject.optString("otherId");
        final String strOptString2 = jSONObject.optString("callback");
        final String strOptString3 = jSONObject.optString("likeProfileId");
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(strOptString).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.s9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                f400 f400Var2 = f400Var;
                xs90.m210737f(f400Var2.mo102961c(), (User) obj, strOptString3, true, false, "p_received_profile_like", new e30() { // from class: l.v9i0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        gai0.m124949E(f400Var2, str, (Relationship) obj2);
                    }
                }, new d30() { // from class: l.x9i0
                    @Override // p149l.d30
                    public final void call() {
                        osi0.m165783g("发送失败，请稍后再试");
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m124949E(f400 f400Var, String str, Relationship relationship) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", relationship.state.toString());
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m124951G(String str, f400 f400Var, Boolean bool) {
        if (TextUtils.equals(str, "home_card") && bool.booleanValue()) {
            f400Var.mo102961c().m66873d2();
            C4750p.f20080g0.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m124954J(Literatures literatures, LiteraturesComments literaturesComments, final f400 f400Var, final String str, List list) {
        xaj0<String, String, String> xaj0VarM59440g = BookMoviesDramasHelper.m59440g(list, literatures, literaturesComments);
        ArrayList arrayList = new ArrayList();
        literaturesComments.localLiteratures = literatures;
        arrayList.add(literaturesComments);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(xaj0VarM59440g.f191753c);
        g53.C17002d c17002d = new g53.C17002d("added_artwork", xaj0VarM59440g.f191752b);
        CoreModule.f17545c.f19639e0.m169430Pa(literaturesComments.userID);
        g53 g53Var = new g53();
        PutongAct putongActMo102961c = f400Var.mo102961c();
        String str2 = literaturesComments.userID;
        g53Var.m124460F(putongActMo102961c, str2, OMSDialogPositon.p_suggest_user_profile_info_view, xgc0.m208625c(str2), arrayList, arrayList2, c17002d, new e30() { // from class: l.u9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                gai0.m124951G(str, f400Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m124956L(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        List<LiteraturesComments> listM59445l = BookMoviesDramasHelper.m59445l(CoreModule.m29931H().userId());
        if (vwb.m200296J(listM59445l)) {
            strSubstring = WeJson.EMPTY_MAP;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("literaturesComments", new JSONArray(LiteraturesComments.JSON_ADAPTER.ARRAY_ADAPTER().serialize(listM59445l)));
                String strQuote = JSONObject.quote(jSONObject2.toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            } catch (JSONException unused) {
                strSubstring = "";
            }
        }
        f400Var.mo102962d().mo127285b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m124958N(JSONObject jSONObject, final f400 f400Var) {
        CoreData coreData;
        final String strOptString = null;
        try {
            coreData = CoreData.JSON_ADAPTER.parse(jSONObject.toString());
            try {
                strOptString = jSONObject.optString("from");
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            coreData = null;
        }
        if (!NullChecker.m81303a(coreData) || vwb.m200296J(coreData.literatures) || vwb.m200296J(coreData.literaturesComments)) {
            return;
        }
        final Literatures literatures = coreData.literatures.get(0);
        final LiteraturesComments literaturesComments = coreData.literaturesComments.get(0);
        f400Var.mo102961c().duringCreated(C22306c.just(BookMoviesDramasHelper.m59447n(CoreModule.m29931H().userId(), literatures.f20433id))).subscribe(mkd0.m154955G(new e30() { // from class: l.q9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                gai0.m124954J(literatures, literaturesComments, f400Var, strOptString, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m124959O(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("mbtiResult");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (wn90.m204604Q(userM169527p9) && TextUtils.equals(userM169527p9.profile.extensions.basic.mbti.get(0), strOptString)) {
            return;
        }
        wn90.m204602F().f187271c = true;
        User userMo223809clone = userM169527p9.mo223809clone();
        userMo223809clone.profile.extensions.basic.mbti = new ArrayList();
        userMo223809clone.profile.extensions.basic.mbti.add(0, strOptString);
        CoreModule.f17545c.f19639e0.m169547u9(userMo223809clone.subtract(userM169527p9)).subscribe(mkd0.m154956H(new e30() { // from class: l.o9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                gai0.m124963S((roj0) obj);
            }
        }, new e30() { // from class: l.p9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("结果提交失败，请稍后再试");
            }
        }));
        if (wn90.m204602F().f187269a != null) {
            wn90.m204602F().f187269a.profile.extensions.basic.mbti = new ArrayList();
            wn90.m204602F().f187269a.profile.extensions.basic.mbti.add(0, strOptString);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m124960P(JSONObject jSONObject, f400 f400Var) {
        String str;
        String strOptString = jSONObject.optString("from");
        if (xma.m210047L3()) {
            osi0.m165783g("您已是svip用户");
            return;
        }
        if (TextUtils.equals(strOptString, "swipe_like_max")) {
            str = "p_home,today_like_receive";
        } else {
            str = TextUtils.equals(strOptString, "me_like_max") ? "p_navigation,today_like_receive" : "";
        }
        CoreModule.m29935P().m94651a().mo33565pr(f400Var.mo102961c(), str, Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m124961Q(JSONArray jSONArray, IdealTag idealTag) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", idealTag.f38760id);
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, idealTag.name);
        } catch (JSONException unused) {
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m124963S(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m124964T(JSONObject jSONObject, final f400 f400Var) {
        final String strOptString = jSONObject.optString("callback");
        BookMoviesDramasHelper.m59443j(f400Var.mo102961c(), jSONObject.optString("literatureID"), jSONObject.optString("category"), new f30() { // from class: l.t9i0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                gai0.m124965U(f400Var, strOptString, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m124965U(f400 f400Var, String str, Boolean bool, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (bool.booleanValue()) {
                C4750p.f20079f0.m132487l(roj0.f160388a);
            }
            jSONObject.put("succeeded", bool.booleanValue() ? "1" : "0");
            if (TextUtils.equals(str2, RequestParameters.SUBRESOURCE_DELETE)) {
                str2 = "";
            }
            jSONObject.put("interestLevel", str2);
            String strQuote = JSONObject.quote(jSONObject.toString());
            f400Var.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m124966V(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String strOptString = jSONObject.optString("callback");
        if (pj90.m169806s(userM169527p9)) {
            JSONObject jSONObject2 = new JSONObject();
            final JSONArray jSONArray = new JSONArray();
            vwb.m200354z(userM169527p9.profile.extensions.basic.ideal, new e30() { // from class: l.r9i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    gai0.m124961Q(jSONArray, (IdealTag) obj);
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
        f400Var.mo102962d().mo127285b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: m0 */
    private void m124968m0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46727H0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m124969A0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46761p1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m124970B0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46763q1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: X */
    public final void m124971X(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46764r0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: Y */
    public final void m124972Y(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.eai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124960P(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m124973Z(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.z9i0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124964T(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m124974a0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().createUserTag(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m124975b0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.fai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124947C(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m124976c0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46770w0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m124977d0(final f400 f400Var, final JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("idealTraits");
        if (jSONArrayOptJSONArray != null) {
            try {
                final List<IdealTag> list = IdealTag.JSON_ADAPTER.ARRAY_ADAPTER().parse(jSONArrayOptJSONArray.toString());
                e51.m114748M(new Runnable() { // from class: l.aai0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f68566a.m124988p0(jSONObject, f400Var, list);
                    }
                });
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m124978e0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.y9i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196972a.m124989q0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m124979f0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46772y0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m124980g0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46721B0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m124981h0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.dai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124966V(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m124982i0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46723D0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m124983j0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.bai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124956L(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m124984k0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46724E0(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m124985l0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46726G0(f400Var, jSONObject);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        byte b = -1;
        switch (str2.hashCode()) {
            case -2063553533:
                if (str2.equals("createUserPictureTag")) {
                    b = 0;
                }
                break;
            case -1890833875:
                if (str2.equals("datingEditConditions")) {
                    b = 1;
                }
                break;
            case -1846704067:
                if (str2.equals("openLiteratureGreetPage")) {
                    b = 2;
                }
                break;
            case -1797897156:
                if (str2.equals("datingLikesReceivedToProfile")) {
                    b = 3;
                }
                break;
            case -1577217351:
                if (str2.equals("getUserAvatars")) {
                    b = 4;
                }
                break;
            case -1422950858:
                if (str2.equals("action")) {
                    b = 5;
                }
                break;
            case -1378317350:
                if (str2.equals("datingLikeBtn")) {
                    b = 6;
                }
                break;
            case -1101799063:
                if (str2.equals("safeQuitH5")) {
                    b = 7;
                }
                break;
            case -1043250373:
                if (str2.equals("datingTagAggregationToProfile")) {
                    b = 8;
                }
                break;
            case -858823129:
                if (str2.equals("saveTagData")) {
                    b = 9;
                }
                break;
            case -689249909:
                if (str2.equals("clickLiteratureButton")) {
                    b = 10;
                }
                break;
            case -423745029:
                if (str2.equals("certSegSvip")) {
                    b = 11;
                }
                break;
            case -306694204:
                if (str2.equals("getEditTagData")) {
                    b = 12;
                }
                break;
            case -68106287:
                if (str2.equals("mbtiEndOfAnsweringQuestions")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 95258880:
                if (str2.equals("updateTagState")) {
                    b = 14;
                }
                break;
            case 147781909:
                if (str2.equals("isNextBtnLast")) {
                    b = 15;
                }
                break;
            case 462448202:
                if (str2.equals("updateProfileFacialFeature")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 572577081:
                if (str2.equals("didBindTagsToPics")) {
                    b = 17;
                }
                break;
            case 655555593:
                if (str2.equals("getSelectedIdealTraits")) {
                    b = 18;
                }
                break;
            case 785815129:
                if (str2.equals("getPicBindableTagData")) {
                    b = 19;
                }
                break;
            case 794221307:
                if (str2.equals("saveProfileGameNameTagData")) {
                    b = 20;
                }
                break;
            case 900114416:
                if (str2.equals("saveExploreFoodTagData")) {
                    b = 21;
                }
                break;
            case 909353647:
                if (str2.equals("saveExploreGameCpTagData")) {
                    b = 22;
                }
                break;
            case 1039613087:
                if (str2.equals("nextBtnClick")) {
                    b = 23;
                }
                break;
            case 1175787654:
                if (str2.equals("getUserLiteratureComments")) {
                    b = 24;
                }
                break;
            case 1190881874:
                if (str2.equals("jumpToProfileAct")) {
                    b = 25;
                }
                break;
            case 1349538974:
                if (str2.equals("didSaveIdealTraits")) {
                    b = 26;
                }
                break;
            case 1379238924:
                if (str2.equals("saveSelectedTagData")) {
                    b = 27;
                }
                break;
            case 1803349731:
                if (str2.equals("getUserTagData")) {
                    b = 28;
                }
                break;
            case 2055336784:
                if (str2.equals("getDataCompleteness")) {
                    b = 29;
                }
                break;
            case 2099373875:
                if (str2.equals("createUserTag")) {
                    b = 30;
                }
                break;
        }
        switch (b) {
            case 0:
            case 30:
                m124974a0(f400Var, jSONObject);
                return true;
            case 1:
                m124975b0(f400Var, jSONObject);
                return true;
            case 2:
                m124994v0(f400Var, jSONObject);
                return true;
            case 3:
                new UserCenterBridgeImplementation().m46769v0(f400Var, jSONObject, true);
                return true;
            case 4:
                m124982i0(f400Var, jSONObject);
                return true;
            case 5:
                m124971X(f400Var, jSONObject);
                return true;
            case 6:
                m124990r0(f400Var, jSONObject);
                return true;
            case 7:
                m124995w0(f400Var);
                return true;
            case 8:
                new UserCenterBridgeImplementation().m46769v0(f400Var, jSONObject, false);
                return true;
            case 9:
                m124998z0(f400Var, jSONObject);
                return true;
            case 10:
                m124973Z(f400Var, jSONObject);
                return true;
            case 11:
                m124972Y(f400Var, jSONObject);
                return true;
            case 12:
                m124979f0(f400Var, jSONObject);
                return true;
            case 13:
                m124992t0(f400Var, jSONObject);
                return true;
            case 14:
                m124970B0(f400Var, jSONObject);
                return true;
            case 15:
                m124985l0(f400Var, jSONObject);
                return true;
            case 16:
                m124969A0(f400Var, jSONObject);
                return true;
            case 17:
                m124976c0(f400Var, jSONObject);
                return true;
            case 18:
                m124981h0(f400Var, jSONObject);
                return true;
            case 19:
                m124980g0(f400Var, jSONObject);
                return true;
            case 20:
                m124996x0(f400Var, jSONObject);
                return true;
            case 21:
                m124996x0(f400Var, jSONObject);
                return true;
            case 22:
                m124996x0(f400Var, jSONObject);
                return true;
            case 23:
                m124991s0(f400Var, jSONObject);
                return true;
            case 24:
                m124983j0(f400Var, jSONObject);
                return true;
            case 25:
                m124968m0(f400Var, jSONObject);
                return true;
            case 26:
                m124977d0(f400Var, jSONObject);
                return true;
            case 27:
                m124997y0(f400Var, jSONObject);
                return true;
            case 28:
                m124984k0(f400Var, jSONObject);
                return true;
            case 29:
                m124978e0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m124986n0(f400 f400Var, String str, List list, Boolean bool) {
        osi0.m165783g("保存成功");
        m124993u0(f400Var, str, true);
        if (!bool.booleanValue() || CoreModule.f17545c.f19639e0.f149388h7 || vwb.m200296J(list)) {
            return;
        }
        CoreModule.f17545c.f19663m0.m31133o8();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m124987o0(f400 f400Var, String str, Throwable th) {
        m124993u0(f400Var, str, false);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m124988p0(JSONObject jSONObject, final f400 f400Var, final List list) {
        final String strOptString = jSONObject.optString("callback");
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169544ta(list)).subscribe(mkd0.m154956H(new e30() { // from class: l.m9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132780a.m124986n0(f400Var, strOptString, list, (Boolean) obj);
            }
        }, new e30() { // from class: l.n9i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137809a.m124987o0(f400Var, strOptString, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m124989q0(JSONObject jSONObject, f400 f400Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        try {
            jSONObject2.put("completeness", wn90.m204602F().m204634B(this.f89239d, userM169520na));
            jSONObject2.put("picCount", userM169520na.pictures.size());
            jSONObject2.put("signatureWordCount", userM169520na.description.length());
            jSONObject2.put("dataDone", "tantan://profile/edit");
            jSONObject2.put("certification", userM169520na.isPicVerificationVerified() || userM169520na.isIdCardVerified());
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            strSubstring = "";
        }
        f400Var.mo102962d().mo127285b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m124990r0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.cai0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124948D(f400Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m124991s0(f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m46755j1(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m124992t0(f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.w9i0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124959O(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m124993u0(f400 f400Var, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z ? "true" : "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        f400Var.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m124994v0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.l9i0
            @Override // java.lang.Runnable
            public final void run() {
                gai0.m124958N(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m124995w0(@NonNull f400 f400Var) {
        new UserCenterBridgeImplementation().safeQuitH5(f400Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m124996x0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveExploreTagData(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m124997y0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveSelectedTagData(f400Var, jSONObject);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m124998z0(@NonNull f400 f400Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveTagData(f400Var, jSONObject);
    }
}
