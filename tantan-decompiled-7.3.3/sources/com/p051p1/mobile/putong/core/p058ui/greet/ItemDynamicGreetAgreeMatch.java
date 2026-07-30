package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;

/* JADX INFO: loaded from: classes3.dex */
public class ItemDynamicGreetAgreeMatch extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f30279a;

    /* JADX INFO: renamed from: b */
    public VText f30280b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemDynamicGreetAgreeMatch$a */
    public static class C8516a {
        /* JADX INFO: renamed from: b */
        public static void m46962b(ItemDynamicGreetAgreeMatch itemDynamicGreetAgreeMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemDynamicGreetAgreeMatch.f30279a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemDynamicGreetAgreeMatch.f30280b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemDynamicGreetAgreeMatch(Context context) {
        super(context);
    }

    public static String getDefaultMsg() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("like_relation_fuction");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("greet_consent_auto_msg", "招呼收到了，我们可以开始聊天了") : "招呼收到了，我们可以开始聊天了";
        } catch (Exception unused) {
            return "招呼收到了，我们可以开始聊天了";
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46958v(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m46958v(View view) {
        C8516a.m46962b(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m46959w(GreetAct greetAct, View view) {
        i4g0.m138523u("e_greet_consent", "p_kankan_chat_popup", jyb.m147494Y("moments_user_id", ((GreetAct) getContext()).m46767e2().m47043R0()));
        greetAct.m46768g2().m46835R0(getDefaultMsg());
    }

    /* JADX INFO: renamed from: z */
    public void m46960z(Message message, final GreetAct greetAct, boolean z) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.localGreetingId);
        String str = (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isFemale()) ? "她" : "他";
        this.f30279a.setText(String.format("感觉%s还不错，同意%s跟我继续聊天？", str, str));
        if (TEnum.equals(message.messageType, MessageType.local_dynamic_greeting_agree_match) && z) {
            i4g0.m138492A("e_greet_consent", "p_kankan_chat_popup", jyb.m147494Y("moments_user_id", ((GreetAct) getContext()).m46767e2().m47043R0()));
        }
        bnl0.m105509E0(this.f30280b, new View.OnClickListener() { // from class: l.u4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177481a.m46959w(greetAct, view);
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
