package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p147v.VFrame;
import p147v.VText;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class ItemDynamicGreetAgreeMatch extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f29431a;

    /* JADX INFO: renamed from: b */
    public VText f29432b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemDynamicGreetAgreeMatch$a */
    public static class C8353a {
        /* JADX INFO: renamed from: b */
        public static void m45779b(ItemDynamicGreetAgreeMatch itemDynamicGreetAgreeMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemDynamicGreetAgreeMatch.f29431a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemDynamicGreetAgreeMatch.f29432b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemDynamicGreetAgreeMatch(Context context) {
        super(context);
    }

    public static String getDefaultMsg() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("like_relation_fuction");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("greet_consent_auto_msg", "招呼收到了，我们可以开始聊天了") : "招呼收到了，我们可以开始聊天了";
        } catch (Exception unused) {
            return "招呼收到了，我们可以开始聊天了";
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45775v(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m45775v(View view) {
        C8353a.m45779b(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m45776w(GreetAct greetAct, View view) {
        zvf0.m220399u("e_greet_consent", "p_kankan_chat_popup", vwb.m200311Y("moments_user_id", ((GreetAct) getContext()).m45584d2().m45860R0()));
        greetAct.m45585e2().m45652R0(getDefaultMsg());
    }

    /* JADX INFO: renamed from: z */
    public void m45777z(Message message, final GreetAct greetAct, boolean z) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.localGreetingId);
        String str = (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isFemale()) ? "她" : "他";
        this.f29431a.setText(String.format("感觉%s还不错，同意%s跟我继续聊天？", str, str));
        if (TEnum.equals(message.messageType, MessageType.local_dynamic_greeting_agree_match) && z) {
            zvf0.m220368A("e_greet_consent", "p_kankan_chat_popup", vwb.m200311Y("moments_user_id", ((GreetAct) getContext()).m45584d2().m45860R0()));
        }
        xdl0.m208329E0(this.f29432b, new View.OnClickListener() { // from class: l.u2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173509a.m45776w(greetAct, view);
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
