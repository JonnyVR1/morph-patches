package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e9i0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public static Map<String, Runnable> f92641h = new HashMap();

    public e9i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m119895K(Act act, final xc00 xc00Var, final String str) {
        String str2 = c7d0.m108301j0() ? "1000002" : "1000003";
        final JSONObject jSONObject = new JSONObject();
        act.duringCreated(CoreModule.f18264c.f20336P0.m114714e3(str2, "code", "user_mobile,user_profile", "", "")).subscribe(psd0.m173597H(new y20() { // from class: l.s8i0
            @Override // p153l.y20
            public final void call(Object obj) {
                e9i0.m119905U(jSONObject, xc00Var, str, (OpenSdkCodeAuth) obj);
            }
        }, new y20() { // from class: l.t8i0
            @Override // p153l.y20
            public final void call(Object obj) {
                xc00Var.mo99544d().mo97004b(str, jSONObject.toString().replace("\"", "\\\""));
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m119896L(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m119897M(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m119899O(Throwable th) {
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m119900P(Act act, Message message) {
        CoreModule.f18264c.f20384f0.m33788Re();
        act.m68056e2();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m119901Q(Act act, String str, String str2, User user) {
        if (user.isFemale()) {
            pci.m171661J(act, user);
        } else {
            act.startActivityWithCustomTransition(MatchAct.m48747h2(act, jyb.m147507f0(str), 0, new ArrayList(), str2), new MatchAct.C8617b());
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m119904T(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m119905U(JSONObject jSONObject, xc00 xc00Var, String str, OpenSdkCodeAuth openSdkCodeAuth) {
        if (NullChecker.m82486a(openSdkCodeAuth) && !TextUtils.isEmpty(openSdkCodeAuth.code)) {
            try {
                jSONObject.put("code", openSdkCodeAuth.code);
            } catch (JSONException unused) {
            }
        }
        xc00Var.mo99544d().mo97004b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m119907W(String str, Act act, uxj0 uxj0Var) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20384f0.m34219zp(str))) {
            act.startActivity(MessagesAct.m50126k2(act, str, true, false));
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m119909Y(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("otherId");
            final String string2 = jSONObject.getString("from");
            final PutongAct putongActMo99543c = xc00Var.mo99543c();
            putongActMo99543c.duringCreated(CoreModule.m30930K().userObsById(string)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.b9i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    e9i0.m119901Q(putongActMo99543c, string, string2, (User) obj);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m119910Z(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        final String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.y8i0
            @Override // java.lang.Runnable
            public final void run() {
                e9i0.m119895K(putongActMo99543c, xc00Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m119911a0(xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("datingMode", gra.m131596L3());
            m177463g(strOptString, jSONObject2.toString());
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m119912b0(xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("groupId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        putongActMo99543c.duringCreated(CoreModule.f18264c.f20387g0.m32812H6(strOptString).filter(new ui7()).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.w8i0
            @Override // p153l.y20
            public final void call(Object obj) {
                Act act = putongActMo99543c;
                act.startActivity(GroupProfileAct.m50290a2(act, strOptString, (ChatGroup) obj, true));
            }
        }, new y20() { // from class: l.x8i0
            @Override // p153l.y20
            public final void call(Object obj) {
                e9i0.m119899O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m119913c0(String str) {
        m205738F(str);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m119914d0(Act act, String str, String str2, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            m119916f0(act, str);
            return;
        }
        C8523d.a aVar = new C8523d.a(str, str2);
        aVar.m47100n("");
        C8523d.m47075a(act, aVar);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m119915e0(final String str, final String str2, final Act act, List list) {
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.u8i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178043a.m119914d0(act, str, str2, (Relationship) obj);
                }
            });
            return;
        }
        C8523d.a aVar = new C8523d.a(str, str2);
        aVar.m47100n("");
        C8523d.m47075a(act, aVar);
    }

    /* JADX INFO: renamed from: f0 */
    public void m119916f0(final Act act, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (NullChecker.m82486a(CoreModule.f18264c.f20384f0.m34219zp(str))) {
            act.startActivity(MessagesAct.m50126k2(act, str, true, false));
        } else {
            act.duringCreated(CoreModule.f18264c.f20384f0.m33905ap(str)).subscribe(psd0.m173597H(new y20() { // from class: l.c9i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    e9i0.m119907W(str, act, (uxj0) obj);
                }
            }, new y20() { // from class: l.d9i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    e9i0.m119904T((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m119917g0(xc00 xc00Var, JSONObject jSONObject) {
        try {
            if (TextUtils.equals(jSONObject.getString("biz"), "petGame")) {
                oki.m168023k(new File(CoreModule.f18263b.getFilesDir().getAbsolutePath() + "/cutPets"));
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m119918h0(xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("userId");
        String strOptString2 = jSONObject.optString("text");
        String strOptString3 = jSONObject.optString("libId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = strOptString2;
        putongActMo99543c.duringCreated(CoreModule.f18264c.f20417q0.m168803c3(strOptString, strOptString3)).subscribe(psd0.m173591B());
        putongActMo99543c.duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(strOptString, messageNew_, null)).subscribe(psd0.m173597H(new y20() { // from class: l.z8i0
            @Override // p153l.y20
            public final void call(Object obj) {
                e9i0.m119900P(putongActMo99543c, (Message) obj);
            }
        }, new y20() { // from class: l.a9i0
            @Override // p153l.y20
            public final void call(Object obj) {
                e9i0.m119896L((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m119919i0(xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("subscribeType");
        final String strOptString2 = jSONObject.optString("subscribeHandler");
        if (!strOptString.equals("onHomeOfflinePartyTabShow") && !strOptString.equals("onHomeOfflinePartyTabHide")) {
            return false;
        }
        f92641h.put(strOptString, new Runnable() { // from class: l.r8i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161712a.m119913c0(strOptString2);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public void m119920j0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("otherId");
            final String string2 = jSONObject.getString("from");
            final PutongAct putongActMo99543c = xc00Var.mo99543c();
            putongActMo99543c.duringCreated(CoreModule.f18264c.f20381e0.m116484L7(string)).subscribe(psd0.m173597H(new y20() { // from class: l.q8i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156129a.m119915e0(string, string2, putongActMo99543c, (List) obj);
                }
            }, new y20() { // from class: l.v8i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    e9i0.m119897M((Throwable) obj);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m119921k0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        try {
            m119916f0(xc00Var.mo99543c(), jSONObject.getString("otherId"));
        } catch (JSONException unused) {
        }
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getBusinessCodeAuth":
                m119910Z(xc00Var, jSONObject);
                return true;
            case "removeLocalResource":
                m119917g0(xc00Var, jSONObject);
                return true;
            case "hasDatingModeFeature":
                return m119911a0(xc00Var, jSONObject);
            case "joinChatGroup":
                m119912b0(xc00Var, jSONObject);
                return true;
            case "callMatchedPage":
                m119909Y(xc00Var, jSONObject);
                return true;
            case "subscribe":
                return m119919i0(xc00Var, jSONObject);
            case "sendMessage":
                m119918h0(xc00Var, jSONObject);
                return true;
            case "toChatOrGreetPage":
                m119920j0(xc00Var, jSONObject);
                return true;
            case "toChatPage":
                m119921k0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
