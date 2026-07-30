package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ruy {

    /* JADX INFO: renamed from: b */
    public static volatile ruy f161149b;

    /* JADX INFO: renamed from: a */
    public uqd0 f161150a = new uqd0("current_secret_message_user_id" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22306c m181214d(final String str) {
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
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return new la20(new v9j() { // from class: l.ouy
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31370x2(str)).m185893l(utc0VarCreate).m185883b();
            }
        }).filter(new w9j() { // from class: l.puy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).conversations));
            }
        }).doOnNext(new e30() { // from class: l.quy
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.m31492w3((Envelope) obj, null);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: g */
    public static ruy m181215g() {
        if (f161149b == null) {
            synchronized (ruy.class) {
                try {
                    if (f161149b == null) {
                        f161149b = new ruy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161149b;
    }

    /* JADX INFO: renamed from: l */
    public static void m181216l(Context context, VText vText, String str) {
        if (NullChecker.m81303a(context) && NullChecker.m81303a(vText)) {
            User userById = CoreModule.m29932K().getUserById(str);
            if (NullChecker.m81303a(userById)) {
                String string = context.getString(R$string.f20769H4, userById.name);
                String string2 = context.getString(R$string.f20777I4);
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
    public static void m181217p() {
        zvf0.m220402x("e_msg_limited_vip", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public boolean m181218e(String str) {
        return m181219f(str, null);
    }

    /* JADX INFO: renamed from: f */
    public boolean m181219f(String str, Conversation conversation) {
        if (IntlCountryCodeController.m28111g() && NullChecker.m81303a(str)) {
            if (conversation == null) {
                conversation = CoreModule.f17545c.f19642f0.m32856Xe(str);
            }
            if ((!CoreModule.m29935P().m94652b().mo35107Yg() || !CoreModule.f17554l.m94652b().mo35109Zm(conversation)) && NullChecker.m81303a(conversation) && !CoreModule.f17545c.f19639e0.m169527p9().isVIP() && TEnum.equals(conversation.property.chatInterrupt.stage, "locked")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m181220h(User user) {
        return (!NullChecker.m81303a(user) || user.isFemale() || user.isVIP() || user.isBanned() || !IntlCountryCodeController.m28111g()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m181221i(User user, User user2) {
        if (CoreModule.m29935P().m94658i().mo158244I1(user)) {
            return false;
        }
        return m181220h(user2);
    }

    /* JADX INFO: renamed from: j */
    public boolean m181222j(User user) {
        return NullChecker.m81303a(user) && !user.isFemale() && IntlCountryCodeController.m28111g();
    }

    /* JADX INFO: renamed from: k */
    public C22306c<Envelope> m181223k(final String str) {
        return CoreModule.f17545c.scheduled("postChatBlockStatus" + str, -1, new v9j() { // from class: l.nuy
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ruy.m181214d(str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m181224m() {
        this.f161150a.put("");
        f161149b = null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m181225n(Message message, Message message2) {
        if (NullChecker.m81303a(message2)) {
            return false;
        }
        return m181218e(message.cid);
    }

    /* JADX INFO: renamed from: o */
    public boolean m181226o(Conversation conversation) {
        return NullChecker.m81303a(conversation) && m181221i(CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser), CoreModule.f17545c.f19639e0.m169527p9()) && TEnum.equals(conversation.property.chatInterrupt.stage, "locked");
    }
}
