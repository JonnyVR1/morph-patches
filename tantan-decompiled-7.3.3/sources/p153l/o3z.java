package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class o3z {

    /* JADX INFO: renamed from: b */
    public static volatile o3z f144868b;

    /* JADX INFO: renamed from: a */
    public wyd0 f144869a = new wyd0("current_secret_message_user_id" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22421c m165897d(final String str) {
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
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return new ti20(new pcj() { // from class: l.l3z
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32373x2(str)).m209038l(z1d0VarCreate).m209028b();
            }
        }).filter(new qcj() { // from class: l.m3z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).conversations));
            }
        }).doOnNext(new y20() { // from class: l.n3z
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.m32495w3((Envelope) obj, null);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: g */
    public static o3z m165898g() {
        if (f144868b == null) {
            synchronized (o3z.class) {
                try {
                    if (f144868b == null) {
                        f144868b = new o3z();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f144868b;
    }

    /* JADX INFO: renamed from: l */
    public static void m165899l(Context context, VText vText, String str) {
        if (NullChecker.m82486a(context) && NullChecker.m82486a(vText)) {
            User userById = CoreModule.m30930K().getUserById(str);
            if (NullChecker.m82486a(userById)) {
                String string = context.getString(R$string.f21511H4, userById.name);
                String string2 = context.getString(R$string.f21519I4);
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
    public static void m165900p() {
        i4g0.m138526x("e_msg_limited_vip", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public boolean m165901e(String str) {
        return m165902f(str, null);
    }

    /* JADX INFO: renamed from: f */
    public boolean m165902f(String str, Conversation conversation) {
        if (IntlCountryCodeController.m29110g() && NullChecker.m82486a(str)) {
            if (conversation == null) {
                conversation = CoreModule.f18264c.f20384f0.m33859Xe(str);
            }
            if ((!CoreModule.m30933P().m143406b().mo36110Yg() || !CoreModule.f18273l.m143406b().mo36112Zm(conversation)) && NullChecker.m82486a(conversation) && !CoreModule.f18264c.f20381e0.m116600p9().isVIP() && TEnum.equals(conversation.property.chatInterrupt.stage, "locked")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m165903h(User user) {
        return (!NullChecker.m82486a(user) || user.isFemale() || user.isVIP() || user.isBanned() || !IntlCountryCodeController.m29110g()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m165904i(User user, User user2) {
        if (CoreModule.m30933P().m143412i().mo180336I1(user)) {
            return false;
        }
        return m165903h(user2);
    }

    /* JADX INFO: renamed from: j */
    public boolean m165905j(User user) {
        return NullChecker.m82486a(user) && !user.isFemale() && IntlCountryCodeController.m29110g();
    }

    /* JADX INFO: renamed from: k */
    public C22421c<Envelope> m165906k(final String str) {
        return CoreModule.f18264c.scheduled("postChatBlockStatus" + str, -1, new pcj() { // from class: l.k3z
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return o3z.m165897d(str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m165907m() {
        this.f144869a.put("");
        f144868b = null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m165908n(Message message, Message message2) {
        if (NullChecker.m82486a(message2)) {
            return false;
        }
        return m165901e(message.cid);
    }

    /* JADX INFO: renamed from: o */
    public boolean m165909o(Conversation conversation) {
        return NullChecker.m82486a(conversation) && m165904i(CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser), CoreModule.f18264c.f20381e0.m116600p9()) && TEnum.equals(conversation.property.chatInterrupt.stage, "locked");
    }
}
