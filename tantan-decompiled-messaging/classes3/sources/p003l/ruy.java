package p003l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.la20;
import l.mkd0;
import l.uqd0;
import l.utc0;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p014rx.C1099c;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ruy {

    /* JADX INFO: renamed from: b */
    public static volatile ruy f7083b;

    /* JADX INFO: renamed from: a */
    public uqd0 f7084a = new uqd0("current_secret_message_user_id" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C1099c m7380d(final String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("stage", (Object) null);
            jSONObject2.put("chatInterrupt", jSONObject3);
            jSONObject.put("property", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return new la20(new v9j() { // from class: l.ouy
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return a.P.auth().q(a.x2(str)).l(utc0VarCreate).b();
            }
        }).filter(new w9j() { // from class: l.puy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((Envelope) obj).getModuleData(CoreData.class).conversations));
            }
        }).doOnNext(new e30() { // from class: l.quy
            @Override // p003l.e30
            public final void call(Object obj) {
                CoreModule.c.w3((Envelope) obj, (d30) null);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: g */
    public static ruy m7381g() {
        if (f7083b == null) {
            synchronized (ruy.class) {
                try {
                    if (f7083b == null) {
                        f7083b = new ruy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7083b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static void m7382l(Context context, VText vText, String str) {
        if (NullChecker.a(context) && NullChecker.a(vText)) {
            User userById = CoreModule.K().getUserById(str);
            if (NullChecker.a(userById)) {
                String string = context.getString(R.string.H4, userById.name);
                String string2 = context.getString(R.string.I4);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf(string2);
                if (iIndexOf != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, string2.length() + iIndexOf, 33);
                    spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, string2.length() + iIndexOf, 33);
                }
                vText.setText(spannableStringBuilder);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m7383p() {
        zvf0.x("e_msg_limited_vip", "p_chat_view");
    }

    /* JADX INFO: renamed from: e */
    public boolean m7384e(String str) {
        return m7385f(str, null);
    }

    /* JADX INFO: renamed from: f */
    public boolean m7385f(String str, Conversation conversation) {
        if (IntlCountryCodeController.g() && NullChecker.a(str)) {
            if (conversation == null) {
                conversation = CoreModule.c.f0.Xe(str);
            }
            if ((!CoreModule.P().b().Yg() || !CoreModule.l.b().Zm(conversation)) && NullChecker.a(conversation) && !CoreModule.c.e0.p9().isVIP() && TEnum.equals(conversation.property.chatInterrupt.stage, "locked")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m7386h(User user) {
        return (!NullChecker.a(user) || user.isFemale() || user.isVIP() || user.isBanned() || !IntlCountryCodeController.g()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7387i(User user, User user2) {
        if (CoreModule.P().i().I1(user)) {
            return false;
        }
        return m7386h(user2);
    }

    /* JADX INFO: renamed from: j */
    public boolean m7388j(User user) {
        return NullChecker.a(user) && !user.isFemale() && IntlCountryCodeController.g();
    }

    /* JADX INFO: renamed from: k */
    public C1099c<Envelope> m7389k(final String str) {
        return CoreModule.c.scheduled("postChatBlockStatus" + str, -1, new v9j() { // from class: l.nuy
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ruy.m7380d(str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m7390m() {
        this.f7084a.put("");
        f7083b = null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m7391n(Message message, Message message2) {
        if (NullChecker.a(message2)) {
            return false;
        }
        return m7384e(message.cid);
    }

    /* JADX INFO: renamed from: o */
    public boolean m7392o(Conversation conversation) {
        return NullChecker.a(conversation) && m7387i(CoreModule.c.e0.Pa(conversation.otherUser), CoreModule.c.e0.p9()) && TEnum.equals(conversation.property.chatInterrupt.stage, "locked");
    }
}
