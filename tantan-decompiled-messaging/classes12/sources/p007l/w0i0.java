package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.abi;
import l.e30;
import l.e400;
import l.e51;
import l.f400;
import l.mkd0;
import l.qh7;
import l.rhi;
import l.roj0;
import l.upa;
import l.vwb;
import l.zyc0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w0i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public static Map<String, Runnable> f14357h = new HashMap();

    public w0i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m15642C(Act act, final f400 f400Var, final String str) {
        String str2 = zyc0.j0() ? "1000002" : "1000003";
        final JSONObject jSONObject = new JSONObject();
        act.duringCreated(CoreModule.c.P0.e3(str2, "code", "user_mobile,user_profile", "", "")).subscribe(mkd0.H(new e30() { // from class: l.k0i0
            public final void call(Object obj) {
                w0i0.m15652M(jSONObject, f400Var, str, (OpenSdkCodeAuth) obj);
            }
        }, new e30() { // from class: l.l0i0
            public final void call(Object obj) {
                f400Var.d().b(str, new String[]{jSONObject.toString().replace("\"", "\\\"")});
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m15643D(Throwable th) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m15644E(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m15646G(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m15647H(Act act, Message message) {
        CoreModule.c.f0.Re();
        act.finish();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m15648I(Act act, String str, String str2, User user) {
        if (user.isFemale()) {
            abi.J(act, user);
        } else {
            act.startActivityWithCustomTransition(MatchAct.g2(act, vwb.f0(new String[]{str}), 0, new ArrayList(), str2), new MatchAct.b());
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m15651L(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m15652M(JSONObject jSONObject, f400 f400Var, String str, OpenSdkCodeAuth openSdkCodeAuth) {
        if (NullChecker.a(openSdkCodeAuth) && !TextUtils.isEmpty(openSdkCodeAuth.code)) {
            try {
                jSONObject.put("code", openSdkCodeAuth.code);
            } catch (JSONException unused) {
            }
        }
        f400Var.d().b(str, new String[]{jSONObject.toString().replace("\"", "\\\"")});
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m15654O(String str, Act act, roj0 roj0Var) {
        if (NullChecker.a(CoreModule.c.f0.zp(str))) {
            act.startActivity(MessagesAct.i2(act, str, true, false));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m15656Q(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("otherId");
            final String string2 = jSONObject.getString("from");
            final PutongAct putongActC = f400Var.c();
            putongActC.duringCreated(CoreModule.K().userObsById(string)).take(1).subscribe(mkd0.G(new e30() { // from class: l.t0i0
                public final void call(Object obj) {
                    w0i0.m15648I(putongActC, string, string2, (User) obj);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: R */
    public void m15657R(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final PutongAct putongActC = f400Var.c();
        final String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        e51.M(new Runnable() { // from class: l.q0i0
            @Override // java.lang.Runnable
            public final void run() {
                w0i0.m15642C(putongActC, f400Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final boolean m15658S(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("datingMode", upa.L3());
            c(strOptString, jSONObject2.toString());
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m15659T(f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("groupId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        final PutongAct putongActC = f400Var.c();
        putongActC.duringCreated(CoreModule.c.g0.H6(strOptString).filter(new qh7()).take(1)).subscribe(mkd0.H(new e30() { // from class: l.o0i0
            public final void call(Object obj) {
                Act act = putongActC;
                act.startActivity(GroupProfileAct.Z1(act, strOptString, (ChatGroup) obj, true));
            }
        }, new e30() { // from class: l.p0i0
            public final void call(Object obj) {
                w0i0.m15646G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m15660U(String str) {
        x(str);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m15661V(Act act, String str, String str2, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            m15663X(act, str);
            return;
        }
        d.a aVar = new d.a(str, str2);
        aVar.n("");
        d.a(act, aVar);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m15662W(final String str, final String str2, final Act act, List list) {
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.m0i0
                public final void call(Object obj) {
                    this.f10176a.m15661V(act, str, str2, (Relationship) obj);
                }
            });
            return;
        }
        d.a aVar = new d.a(str, str2);
        aVar.n("");
        d.a(act, aVar);
    }

    /* JADX INFO: renamed from: X */
    public void m15663X(final Act act, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (NullChecker.a(CoreModule.c.f0.zp(str))) {
            act.startActivity(MessagesAct.i2(act, str, true, false));
        } else {
            act.duringCreated(CoreModule.c.f0.ap(str)).subscribe(mkd0.H(new e30() { // from class: l.u0i0
                public final void call(Object obj) {
                    w0i0.m15654O(str, act, (roj0) obj);
                }
            }, new e30() { // from class: l.v0i0
                public final void call(Object obj) {
                    w0i0.m15651L((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m15664Y(f400 f400Var, JSONObject jSONObject) {
        try {
            if (TextUtils.equals(jSONObject.getString("biz"), "petGame")) {
                rhi.k(new File(CoreModule.b.getFilesDir().getAbsolutePath() + "/cutPets"));
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m15665Z(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("userId");
        String strOptString2 = jSONObject.optString("text");
        String strOptString3 = jSONObject.optString("libId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        final PutongAct putongActC = f400Var.c();
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = strOptString2;
        putongActC.duringCreated(CoreModule.c.q0.c3(strOptString, strOptString3)).subscribe(mkd0.B());
        putongActC.duringCreated(CoreModule.c.f0.Dn(strOptString, messageNew_, (Sticker) null)).subscribe(mkd0.H(new e30() { // from class: l.r0i0
            public final void call(Object obj) {
                w0i0.m15647H(putongActC, (Message) obj);
            }
        }, new e30() { // from class: l.s0i0
            public final void call(Object obj) {
                w0i0.m15643D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m15666a0(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("subscribeType");
        final String strOptString2 = jSONObject.optString("subscribeHandler");
        if (!strOptString.equals("onHomeOfflinePartyTabShow") && !strOptString.equals("onHomeOfflinePartyTabHide")) {
            return false;
        }
        f14357h.put(strOptString, new Runnable() { // from class: l.j0i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9175a.m15660U(strOptString2);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m15667b0(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("otherId");
            final String string2 = jSONObject.getString("from");
            final PutongAct putongActC = f400Var.c();
            putongActC.duringCreated(CoreModule.c.e0.L7(string)).subscribe(mkd0.H(new e30() { // from class: l.i0i0
                public final void call(Object obj) {
                    this.f8855a.m15662W(string, string2, putongActC, (List) obj);
                }
            }, new e30() { // from class: l.n0i0
                public final void call(Object obj) {
                    w0i0.m15644E((Throwable) obj);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m15668c0(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            m15663X(f400Var.c(), jSONObject.getString("otherId"));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m15669n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getBusinessCodeAuth":
                m15657R(f400Var, jSONObject);
                return true;
            case "removeLocalResource":
                m15664Y(f400Var, jSONObject);
                return true;
            case "hasDatingModeFeature":
                return m15658S(f400Var, jSONObject);
            case "joinChatGroup":
                m15659T(f400Var, jSONObject);
                return true;
            case "callMatchedPage":
                m15656Q(f400Var, jSONObject);
                return true;
            case "subscribe":
                return m15666a0(f400Var, jSONObject);
            case "sendMessage":
                m15665Z(f400Var, jSONObject);
                return true;
            case "toChatOrGreetPage":
                m15667b0(f400Var, jSONObject);
                return true;
            case "toChatPage":
                m15668c0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
