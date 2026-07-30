package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class w0i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public static Map<String, Runnable> f183922h = new HashMap();

    public w0i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m200867C(Act act, final f400 f400Var, final String str) {
        String str2 = zyc0.m220918j0() ? "1000002" : "1000003";
        final JSONObject jSONObject = new JSONObject();
        act.duringCreated(CoreModule.f17545c.f19594P0.m177886e3(str2, "code", "user_mobile,user_profile", "", "")).subscribe(mkd0.m154956H(new e30() { // from class: l.k0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                w0i0.m200877M(jSONObject, f400Var, str, (OpenSdkCodeAuth) obj);
            }
        }, new e30() { // from class: l.l0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                f400Var.mo102962d().mo127285b(str, jSONObject.toString().replace("\"", "\\\""));
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m200868D(Throwable th) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m200869E(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m200871G(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m200872H(Act act, Message message) {
        CoreModule.f17545c.f19642f0.m32785Re();
        act.m66873d2();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m200873I(Act act, String str, String str2, User user) {
        if (user.isFemale()) {
            abi.m95622J(act, user);
        } else {
            act.startActivityWithCustomTransition(MatchAct.m47564g2(act, vwb.m200324f0(str), 0, new ArrayList(), str2), new MatchAct.C8454b());
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m200876L(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m200877M(JSONObject jSONObject, f400 f400Var, String str, OpenSdkCodeAuth openSdkCodeAuth) {
        if (NullChecker.m81303a(openSdkCodeAuth) && !TextUtils.isEmpty(openSdkCodeAuth.code)) {
            try {
                jSONObject.put("code", openSdkCodeAuth.code);
            } catch (JSONException unused) {
            }
        }
        f400Var.mo102962d().mo127285b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m200879O(String str, Act act, roj0 roj0Var) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19642f0.m33216zp(str))) {
            act.startActivity(MessagesAct.m48943i2(act, str, true, false));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m200881Q(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("otherId");
            final String string2 = jSONObject.getString("from");
            final PutongAct putongActMo102961c = f400Var.mo102961c();
            putongActMo102961c.duringCreated(CoreModule.m29932K().userObsById(string)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.t0i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w0i0.m200873I(putongActMo102961c, string, string2, (User) obj);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: R */
    public void m200882R(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        final String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.q0i0
            @Override // java.lang.Runnable
            public final void run() {
                w0i0.m200867C(putongActMo102961c, f400Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final boolean m200883S(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("datingMode", upa.m194665L3());
            m122324c(strOptString, jSONObject2.toString());
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m200884T(f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("groupId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        putongActMo102961c.duringCreated(CoreModule.f17545c.f19645g0.m31809H6(strOptString).filter(new qh7()).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.o0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                Act act = putongActMo102961c;
                act.startActivity(GroupProfileAct.m49107Z1(act, strOptString, (ChatGroup) obj, true));
            }
        }, new e30() { // from class: l.p0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                w0i0.m200871G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m200885U(String str) {
        m114659x(str);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m200886V(Act act, String str, String str2, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            m200888X(act, str);
            return;
        }
        C8360d.a aVar = new C8360d.a(str, str2);
        aVar.m45917n("");
        C8360d.m45892a(act, aVar);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m200887W(final String str, final String str2, final Act act, List list) {
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.m0i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130737a.m200886V(act, str, str2, (Relationship) obj);
                }
            });
            return;
        }
        C8360d.a aVar = new C8360d.a(str, str2);
        aVar.m45917n("");
        C8360d.m45892a(act, aVar);
    }

    /* JADX INFO: renamed from: X */
    public void m200888X(final Act act, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (NullChecker.m81303a(CoreModule.f17545c.f19642f0.m33216zp(str))) {
            act.startActivity(MessagesAct.m48943i2(act, str, true, false));
        } else {
            act.duringCreated(CoreModule.f17545c.f19642f0.m32902ap(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.u0i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w0i0.m200879O(str, act, (roj0) obj);
                }
            }, new e30() { // from class: l.v0i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w0i0.m200876L((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m200889Y(f400 f400Var, JSONObject jSONObject) {
        try {
            if (TextUtils.equals(jSONObject.getString("biz"), "petGame")) {
                rhi.m179367k(new File(CoreModule.f17544b.getFilesDir().getAbsolutePath() + "/cutPets"));
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m200890Z(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("userId");
        String strOptString2 = jSONObject.optString("text");
        String strOptString3 = jSONObject.optString("libId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = strOptString2;
        putongActMo102961c.duringCreated(CoreModule.f17545c.f19675q0.m98087c3(strOptString, strOptString3)).subscribe(mkd0.m154950B());
        putongActMo102961c.duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(strOptString, messageNew_, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.r0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                w0i0.m200872H(putongActMo102961c, (Message) obj);
            }
        }, new e30() { // from class: l.s0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                w0i0.m200868D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m200891a0(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("subscribeType");
        final String strOptString2 = jSONObject.optString("subscribeHandler");
        if (!strOptString.equals("onHomeOfflinePartyTabShow") && !strOptString.equals("onHomeOfflinePartyTabHide")) {
            return false;
        }
        f183922h.put(strOptString, new Runnable() { // from class: l.j0i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f115677a.m200885U(strOptString2);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m200892b0(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("otherId");
            final String string2 = jSONObject.getString("from");
            final PutongAct putongActMo102961c = f400Var.mo102961c();
            putongActMo102961c.duringCreated(CoreModule.f17545c.f19639e0.m169411L7(string)).subscribe(mkd0.m154956H(new e30() { // from class: l.i0i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110346a.m200887W(string, string2, putongActMo102961c, (List) obj);
                }
            }, new e30() { // from class: l.n0i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w0i0.m200869E((Throwable) obj);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m200893c0(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            m200888X(f400Var.mo102961c(), jSONObject.getString("otherId"));
        } catch (JSONException unused) {
        }
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getBusinessCodeAuth":
                m200882R(f400Var, jSONObject);
                return true;
            case "removeLocalResource":
                m200889Y(f400Var, jSONObject);
                return true;
            case "hasDatingModeFeature":
                return m200883S(f400Var, jSONObject);
            case "joinChatGroup":
                m200884T(f400Var, jSONObject);
                return true;
            case "callMatchedPage":
                m200881Q(f400Var, jSONObject);
                return true;
            case "subscribe":
                return m200891a0(f400Var, jSONObject);
            case "sendMessage":
                m200890Z(f400Var, jSONObject);
                return true;
            case "toChatOrGreetPage":
                m200892b0(f400Var, jSONObject);
                return true;
            case "toChatPage":
                m200893c0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
