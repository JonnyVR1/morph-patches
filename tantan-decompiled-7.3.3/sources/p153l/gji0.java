package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.UserCenterBridgeImplementation;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class gji0 extends wc00 {
    public gji0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m130468K(JSONObject jSONObject, xc00 xc00Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        try {
            jSONObject2.put(KnowMyselfShareParams.TYPE_INTRODUCE, userM116593na.description);
            jSONObject2.put("pictureNum", userM116593na.pictures.size());
            jSONObject2.put("answerNum", userM116593na.profile.answers.size());
            jSONObject2.put(ProfileLikeType.mbti, aw90.m100564Q(userM116593na));
            User userM116593na2 = CoreModule.f18264c.f20381e0.m116593na();
            String userInfoForMarryStatus = userM116593na2.getUserInfoForMarryStatus();
            jSONObject2.put("reviewStatus", !(userM116593na2.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus)));
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            strSubstring = "";
        }
        xc00Var.mo99544d().mo97004b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m130469L(final xc00 xc00Var, JSONObject jSONObject) {
        if (!joa.m146361M3()) {
            CoreModule.m30933P().m143405a().mo34568pr(xc00Var.mo99543c(), "p_suggest_user_profile_info_view,e_profile_comment_button,click", Privilege.see_who_likes_me);
            return;
        }
        String strOptString = jSONObject.optString("otherId");
        final String strOptString2 = jSONObject.optString("callback");
        final String strOptString3 = jSONObject.optString("likeProfileId");
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(strOptString).first()).subscribe(psd0.m173596G(new y20() { // from class: l.sii0
            @Override // p153l.y20
            public final void call(Object obj) {
                xc00 xc00Var2 = xc00Var;
                b1a0.m101463f(xc00Var2.mo99543c(), (User) obj, strOptString3, true, false, "p_received_profile_like", new y20() { // from class: l.vii0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        gji0.m130470M(xc00Var2, str, (Relationship) obj2);
                    }
                }, new x20() { // from class: l.xii0
                    @Override // p153l.x20
                    public final void call() {
                        r1j0.m179420g("发送失败，请稍后再试");
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m130470M(xc00 xc00Var, String str, Relationship relationship) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", relationship.state.toString());
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        xc00Var.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m130472O(String str, xc00 xc00Var, Boolean bool) {
        if (TextUtils.equals(str, "home_card") && bool.booleanValue()) {
            xc00Var.mo99543c().m68056e2();
            C4901p.f20822g0.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m130475R(Literatures literatures, LiteraturesComments literaturesComments, final xc00 xc00Var, final String str, List list) {
        bkj0<String, String, String> bkj0VarM60624g = BookMoviesDramasHelper.m60624g(list, literatures, literaturesComments);
        ArrayList arrayList = new ArrayList();
        literaturesComments.localLiteratures = literatures;
        arrayList.add(literaturesComments);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bkj0VarM60624g.f77083c);
        w53.C21023d c21023d = new w53.C21023d("added_artwork", bkj0VarM60624g.f77082b);
        CoreModule.f18264c.f20381e0.m116503Pa(literaturesComments.userID);
        w53 w53Var = new w53();
        PutongAct putongActMo99543c = xc00Var.mo99543c();
        String str2 = literaturesComments.userID;
        w53Var.m204943F(putongActMo99543c, str2, OMSDialogPositon.p_suggest_user_profile_info_view, epc0.m121848c(str2), arrayList, arrayList2, c21023d, new y20() { // from class: l.uii0
            @Override // p153l.y20
            public final void call(Object obj) {
                gji0.m130472O(str, xc00Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m130477T(JSONObject jSONObject, xc00 xc00Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        List<LiteraturesComments> listM60629l = BookMoviesDramasHelper.m60629l(CoreModule.m30929H().userId());
        if (jyb.m147479J(listM60629l)) {
            strSubstring = WeJson.EMPTY_MAP;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("literaturesComments", new JSONArray(LiteraturesComments.JSON_ADAPTER.ARRAY_ADAPTER().serialize(listM60629l)));
                String strQuote = JSONObject.quote(jSONObject2.toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            } catch (JSONException unused) {
                strSubstring = "";
            }
        }
        xc00Var.mo99544d().mo97004b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m130479V(JSONObject jSONObject, final xc00 xc00Var) {
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
        if (!NullChecker.m82486a(coreData) || jyb.m147479J(coreData.literatures) || jyb.m147479J(coreData.literaturesComments)) {
            return;
        }
        final Literatures literatures = coreData.literatures.get(0);
        final LiteraturesComments literaturesComments = coreData.literaturesComments.get(0);
        xc00Var.mo99543c().duringCreated(C22421c.just(BookMoviesDramasHelper.m60631n(CoreModule.m30929H().userId(), literatures.f21175id))).subscribe(psd0.m173596G(new y20() { // from class: l.qii0
            @Override // p153l.y20
            public final void call(Object obj) {
                gji0.m130475R(literatures, literaturesComments, xc00Var, strOptString, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m130480W(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("mbtiResult");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (aw90.m100564Q(userM116600p9) && TextUtils.equals(userM116600p9.profile.extensions.basic.mbti.get(0), strOptString)) {
            return;
        }
        aw90.m100562F().f73703c = true;
        User userMo225055clone = userM116600p9.mo225055clone();
        userMo225055clone.profile.extensions.basic.mbti = new ArrayList();
        userMo225055clone.profile.extensions.basic.mbti.add(0, strOptString);
        CoreModule.f18264c.f20381e0.m116620u9(userMo225055clone.subtract(userM116600p9)).subscribe(psd0.m173597H(new y20() { // from class: l.oii0
            @Override // p153l.y20
            public final void call(Object obj) {
                gji0.m130484a0((uxj0) obj);
            }
        }, new y20() { // from class: l.pii0
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("结果提交失败，请稍后再试");
            }
        }));
        if (aw90.m100562F().f73701a != null) {
            aw90.m100562F().f73701a.profile.extensions.basic.mbti = new ArrayList();
            aw90.m100562F().f73701a.profile.extensions.basic.mbti.add(0, strOptString);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m130481X(JSONObject jSONObject, xc00 xc00Var) {
        String str;
        String strOptString = jSONObject.optString("from");
        if (joa.m146361M3()) {
            r1j0.m179420g("您已是svip用户");
            return;
        }
        if (TextUtils.equals(strOptString, "swipe_like_max")) {
            str = "p_home,today_like_receive";
        } else {
            str = TextUtils.equals(strOptString, "me_like_max") ? "p_navigation,today_like_receive" : "";
        }
        CoreModule.m30933P().m143405a().mo34568pr(xc00Var.mo99543c(), str, Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m130482Y(JSONArray jSONArray, IdealTag idealTag) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", idealTag.f39608id);
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, idealTag.name);
        } catch (JSONException unused) {
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m130484a0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m130485b0(JSONObject jSONObject, final xc00 xc00Var) {
        final String strOptString = jSONObject.optString("callback");
        BookMoviesDramasHelper.m60627j(xc00Var.mo99543c(), jSONObject.optString("literatureID"), jSONObject.optString("category"), new z20() { // from class: l.tii0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                gji0.m130486c0(xc00Var, strOptString, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m130486c0(xc00 xc00Var, String str, Boolean bool, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (bool.booleanValue()) {
                C4901p.f20821f0.m137019l(uxj0.f181467a);
            }
            jSONObject.put("succeeded", bool.booleanValue() ? "1" : "0");
            if (TextUtils.equals(str2, RequestParameters.SUBRESOURCE_DELETE)) {
                str2 = "";
            }
            jSONObject.put("interestLevel", str2);
            String strQuote = JSONObject.quote(jSONObject.toString());
            xc00Var.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m130487d0(JSONObject jSONObject, xc00 xc00Var) {
        String strSubstring;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String strOptString = jSONObject.optString("callback");
        if (tr90.m192431s(userM116600p9)) {
            JSONObject jSONObject2 = new JSONObject();
            final JSONArray jSONArray = new JSONArray();
            jyb.m147537z(userM116600p9.profile.extensions.basic.ideal, new y20() { // from class: l.rii0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gji0.m130482Y(jSONArray, (IdealTag) obj);
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
        xc00Var.mo99544d().mo97004b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: u0 */
    private void m130489u0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47910H0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m130490A0(xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47938j1(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m130491B0(xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.wii0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130480W(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m130492C0(xc00 xc00Var, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z ? "true" : "false");
        } catch (JSONException unused) {
        }
        String strQuote = JSONObject.quote(jSONObject.toString());
        xc00Var.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m130493D0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.lii0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130479V(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final void m130494E0(@NonNull xc00 xc00Var) {
        new UserCenterBridgeImplementation().safeQuitH5(xc00Var);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m130495F0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveExploreTagData(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m130496G0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveSelectedTagData(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m130497H0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().saveTagData(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m130498I0(xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47944p1(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m130499J0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47946q1(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m130500f0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47947r0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m130501g0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.eji0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130481X(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m130502h0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.zii0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130485b0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m130503i0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().createUserTag(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m130504j0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130468K(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m130505k0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47953w0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m130506l0(final xc00 xc00Var, final JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("idealTraits");
        if (jSONArrayOptJSONArray != null) {
            try {
                final List<IdealTag> list = IdealTag.JSON_ADAPTER.ARRAY_ADAPTER().parse(jSONArrayOptJSONArray.toString());
                l51.m152893M(new Runnable() { // from class: l.aji0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f71826a.m130517x0(jSONObject, xc00Var, list);
                    }
                });
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m130507m0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.yii0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200087a.m130518y0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m130508n0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47955y0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m130509o0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47904B0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m130510p0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.dji0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130487d0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m130511q0(xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47906D0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m130512r0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.bji0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130477T(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m130513s0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47907E0(xc00Var, jSONObject);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m130514t0(xc00 xc00Var, JSONObject jSONObject) {
        new UserCenterBridgeImplementation().m47909G0(xc00Var, jSONObject);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull @NotNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
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
                m130503i0(xc00Var, jSONObject);
                return true;
            case 1:
                m130504j0(xc00Var, jSONObject);
                return true;
            case 2:
                m130493D0(xc00Var, jSONObject);
                return true;
            case 3:
                new UserCenterBridgeImplementation().m47952v0(xc00Var, jSONObject, true);
                return true;
            case 4:
                m130511q0(xc00Var, jSONObject);
                return true;
            case 5:
                m130500f0(xc00Var, jSONObject);
                return true;
            case 6:
                m130519z0(xc00Var, jSONObject);
                return true;
            case 7:
                m130494E0(xc00Var);
                return true;
            case 8:
                new UserCenterBridgeImplementation().m47952v0(xc00Var, jSONObject, false);
                return true;
            case 9:
                m130497H0(xc00Var, jSONObject);
                return true;
            case 10:
                m130502h0(xc00Var, jSONObject);
                return true;
            case 11:
                m130501g0(xc00Var, jSONObject);
                return true;
            case 12:
                m130508n0(xc00Var, jSONObject);
                return true;
            case 13:
                m130491B0(xc00Var, jSONObject);
                return true;
            case 14:
                m130499J0(xc00Var, jSONObject);
                return true;
            case 15:
                m130514t0(xc00Var, jSONObject);
                return true;
            case 16:
                m130498I0(xc00Var, jSONObject);
                return true;
            case 17:
                m130505k0(xc00Var, jSONObject);
                return true;
            case 18:
                m130510p0(xc00Var, jSONObject);
                return true;
            case 19:
                m130509o0(xc00Var, jSONObject);
                return true;
            case 20:
                m130495F0(xc00Var, jSONObject);
                return true;
            case 21:
                m130495F0(xc00Var, jSONObject);
                return true;
            case 22:
                m130495F0(xc00Var, jSONObject);
                return true;
            case 23:
                m130490A0(xc00Var, jSONObject);
                return true;
            case 24:
                m130512r0(xc00Var, jSONObject);
                return true;
            case 25:
                m130489u0(xc00Var, jSONObject);
                return true;
            case 26:
                m130506l0(xc00Var, jSONObject);
                return true;
            case 27:
                m130496G0(xc00Var, jSONObject);
                return true;
            case 28:
                m130513s0(xc00Var, jSONObject);
                return true;
            case 29:
                m130507m0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m130515v0(xc00 xc00Var, String str, List list, Boolean bool) {
        r1j0.m179420g("保存成功");
        m130492C0(xc00Var, str, true);
        if (!bool.booleanValue() || CoreModule.f18264c.f20381e0.f89245h7 || jyb.m147479J(list)) {
            return;
        }
        CoreModule.f18264c.f20405m0.m32136o8();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m130516w0(xc00 xc00Var, String str, Throwable th) {
        m130492C0(xc00Var, str, false);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m130517x0(JSONObject jSONObject, final xc00 xc00Var, final List list) {
        final String strOptString = jSONObject.optString("callback");
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116617ta(list)).subscribe(psd0.m173597H(new y20() { // from class: l.mii0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136980a.m130515v0(xc00Var, strOptString, list, (Boolean) obj);
            }
        }, new y20() { // from class: l.nii0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142133a.m130516w0(xc00Var, strOptString, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m130518y0(JSONObject jSONObject, xc00 xc00Var) {
        String strSubstring;
        String strOptString = jSONObject.optString("callback");
        JSONObject jSONObject2 = new JSONObject();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        try {
            jSONObject2.put("completeness", aw90.m100562F().m100594B(this.f188308d, userM116593na));
            jSONObject2.put("picCount", userM116593na.pictures.size());
            jSONObject2.put("signatureWordCount", userM116593na.description.length());
            jSONObject2.put("dataDone", "tantan://profile/edit");
            jSONObject2.put("certification", userM116593na.isPicVerificationVerified() || userM116593na.isIdCardVerified());
            String strQuote = JSONObject.quote(jSONObject2.toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            strSubstring = "";
        }
        xc00Var.mo99544d().mo97004b(strOptString, strSubstring);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m130519z0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.cji0
            @Override // java.lang.Runnable
            public final void run() {
                gji0.m130469L(xc00Var, jSONObject);
            }
        });
    }
}
