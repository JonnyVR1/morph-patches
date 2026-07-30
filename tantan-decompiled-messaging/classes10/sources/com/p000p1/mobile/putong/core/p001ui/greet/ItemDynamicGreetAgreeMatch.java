package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONObject;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemDynamicGreetAgreeMatch extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f1825a;

    /* JADX INFO: renamed from: b */
    public VText f1826b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemDynamicGreetAgreeMatch$a */
    public static class C3128a {
        /* JADX INFO: renamed from: b */
        public static void m3117b(ItemDynamicGreetAgreeMatch itemDynamicGreetAgreeMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemDynamicGreetAgreeMatch.f1825a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemDynamicGreetAgreeMatch.f1826b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemDynamicGreetAgreeMatch(Context context) {
        super(context);
    }

    public static String getDefaultMsg() {
        try {
            String strF = RemoteConfig.x().F("like_relation_fuction");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString("greet_consent_auto_msg", "招呼收到了，我们可以开始聊天了") : "招呼收到了，我们可以开始聊天了";
        } catch (Exception unused) {
            return "招呼收到了，我们可以开始聊天了";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3113v(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m3113v(View view) {
        C3128a.m3117b(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m3114w(GreetAct greetAct, View view) {
        zvf0.u("e_greet_consent", "p_kankan_chat_popup", new j760[]{vwb.Y("moments_user_id", ((GreetAct) getContext()).m2920d2().m3204R0())});
        greetAct.m2921e2().m2989R0(getDefaultMsg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m3115z(Message message, final GreetAct greetAct, boolean z) {
        User userPa = CoreModule.c.e0.Pa(message.localGreetingId);
        String str = (NullChecker.a(userPa) && userPa.isFemale()) ? "她" : "他";
        this.f1825a.setText(String.format("感觉%s还不错，同意%s跟我继续聊天？", str, str));
        if (TEnum.equals(message.messageType, MessageType.local_dynamic_greeting_agree_match) && z) {
            zvf0.A("e_greet_consent", "p_kankan_chat_popup", new j760[]{vwb.Y("moments_user_id", ((GreetAct) getContext()).m2920d2().m3204R0())});
        }
        xdl0.E0(this.f1826b, new View.OnClickListener() { // from class: l.u2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7653a.m3114w(greetAct, view);
            }
        });
    }

    public ItemDynamicGreetAgreeMatch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemDynamicGreetAgreeMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
