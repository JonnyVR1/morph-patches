package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.knb0;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGreetingTip extends VFrame implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemGreetingTip f29439a;

    /* JADX INFO: renamed from: b */
    public VText f29440b;

    /* JADX INFO: renamed from: c */
    public boolean f29441c;

    /* JADX INFO: renamed from: d */
    public Message f29442d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemGreetingTip$a */
    public static class C8356a {
        /* JADX INFO: renamed from: b */
        public static void m45815b(ItemGreetingTip itemGreetingTip, View view) {
            itemGreetingTip.f29439a = (ItemGreetingTip) view;
            itemGreetingTip.f29440b = (VText) ((ViewGroup) view).getChildAt(0);
        }
    }

    public ItemGreetingTip(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f29442d = message;
        String str = "他";
        if (TEnum.equals(message.messageType, MessageType.local_meet_reply)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.localGreetingId);
            if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isFemale()) {
                str = "她";
            }
            setText(String.format("%1$s向你塞了一个小纸条，回复即可配对聊天", str));
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_reply)) {
            User userM169430Pa2 = CoreModule.f17545c.f19639e0.m169430Pa(message.localGreetingId);
            if (NullChecker.m81303a(userM169430Pa2) && userM169430Pa2.isFemale()) {
                str = "她";
            }
            setText(String.format("%1$s对你的「看看」动态做出了回应，回复%2$s 立即开始临时对话", str, str));
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_agreematch_notice)) {
            setText(CoreModule.m29935P().m94658i().mo158456v2());
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_match_success)) {
            setText("恭喜配对成功，你可以继续聊天了");
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_chat_greeting_tip)) {
            User userM169430Pa3 = CoreModule.f17545c.f19639e0.m169430Pa(message.cid);
            if (NullChecker.m81303a(userM169430Pa3) && userM169430Pa3.isFemale()) {
                str = "她";
            }
            setText(String.format("%s已经同意配对，可以继续聊天了", str));
            return;
        }
        if (!TEnum.equals(message.messageType, MessageType.local_greet_send_notice)) {
            if (TEnum.equals(message.messageType, MessageType.local_greet_receive_match_tip)) {
                User userM169430Pa4 = CoreModule.f17545c.f19639e0.m169430Pa(message.localGreetingId);
                if (NullChecker.m81303a(userM169430Pa4) && userM169430Pa4.isFemale()) {
                    str = "她";
                }
                setText(String.format("回复即可与%s配对", str));
                return;
            }
            return;
        }
        if (!this.f29441c) {
            zvf0.m220402x("e_send_message_tips", "p_kankan_chat_popup");
            this.f29441c = true;
        }
        if (!CoreModule.m29935P().m94658i().mo158345a2()) {
            setText("真诚聊天，更容易得到回复");
            return;
        }
        User userM169430Pa5 = CoreModule.f17545c.f19639e0.m169430Pa(message.localGreetingId);
        if (NullChecker.m81303a(userM169430Pa5) && userM169430Pa5.isFemale()) {
            str = "她";
        }
        m45813v(String.format("尊贵的黑金会员，你的消息已优先推送给%s", str));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45812u(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f29440b.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public void setText(CharSequence charSequence) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29440b.getLayoutParams();
        int i = t100.f167231F;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f29440b.setLayoutParams(layoutParams);
        VText vText = this.f29440b;
        int i2 = t100.f167261j;
        int i3 = t100.f167256e;
        vText.setPadding(i2, i3, i2, i3);
        this.f29440b.setTextColor(Color.parseColor("#4c000000"));
        this.f29440b.setBackgroundResource(0);
        xdl0.m208383k(this.f29440b, null);
        this.f29440b.setText(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public final void m45812u(View view) {
        C8356a.m45815b(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m45813v(String str) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29440b.getLayoutParams();
        int i = t100.f167268q;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f29440b.setLayoutParams(layoutParams);
        this.f29440b.setText(str);
        this.f29440b.setTextColor(Color.parseColor("#edd7a3"));
        VText vText = this.f29440b;
        int i2 = t100.f167264m;
        int i3 = t100.f167256e;
        vText.setPadding(i2, i3, i2, i3);
        this.f29440b.setBackgroundResource(c3c0.f78923z5);
        xdl0.m208383k(this.f29440b, act().drawable(c3c0.f78765i0));
    }

    public ItemGreetingTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetingTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
