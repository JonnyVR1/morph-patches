package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.a;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.knb0;
import l.t100;
import l.ura;
import l.xdl0;
import l.zvf0;
import p003l.a1c0;
import p003l.c3c0;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGreetingTip extends VFrame implements a {

    /* JADX INFO: renamed from: a */
    public ItemGreetingTip f1833a;

    /* JADX INFO: renamed from: b */
    public VText f1834b;

    /* JADX INFO: renamed from: c */
    public boolean f1835c;

    /* JADX INFO: renamed from: d */
    public Message f1836d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemGreetingTip$a */
    public static class C3131a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m3159b(ItemGreetingTip itemGreetingTip, View view) {
            itemGreetingTip.f1833a = (ItemGreetingTip) view;
            itemGreetingTip.f1834b = ((ViewGroup) view).getChildAt(0);
        }
    }

    public ItemGreetingTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m3153A(Message message) {
        this.f1836d = message;
        String str = "他";
        if (TEnum.equals(message.messageType, MessageType.local_meet_reply)) {
            User userPa = CoreModule.c.e0.Pa(message.localGreetingId);
            if (NullChecker.a(userPa) && userPa.isFemale()) {
                str = "她";
            }
            setText(String.format("%1$s向你塞了一个小纸条，回复即可配对聊天", str));
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_reply)) {
            User userPa2 = CoreModule.c.e0.Pa(message.localGreetingId);
            if (NullChecker.a(userPa2) && userPa2.isFemale()) {
                str = "她";
            }
            setText(String.format("%1$s对你的「看看」动态做出了回应，回复%2$s 立即开始临时对话", str, str));
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_agreematch_notice)) {
            setText(CoreModule.P().i().v2());
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_match_success)) {
            setText("恭喜配对成功，你可以继续聊天了");
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_chat_greeting_tip)) {
            User userPa3 = CoreModule.c.e0.Pa(message.cid);
            if (NullChecker.a(userPa3) && userPa3.isFemale()) {
                str = "她";
            }
            setText(String.format("%s已经同意配对，可以继续聊天了", str));
            return;
        }
        if (!TEnum.equals(message.messageType, MessageType.local_greet_send_notice)) {
            if (TEnum.equals(message.messageType, MessageType.local_greet_receive_match_tip)) {
                User userPa4 = CoreModule.c.e0.Pa(message.localGreetingId);
                if (NullChecker.a(userPa4) && userPa4.isFemale()) {
                    str = "她";
                }
                setText(String.format("回复即可与%s配对", str));
                return;
            }
            return;
        }
        if (!this.f1835c) {
            zvf0.x("e_send_message_tips", "p_kankan_chat_popup");
            this.f1835c = true;
        }
        if (!CoreModule.P().i().a2()) {
            setText("真诚聊天，更容易得到回复");
            return;
        }
        User userPa5 = CoreModule.c.e0.Pa(message.localGreetingId);
        if (NullChecker.a(userPa5) && userPa5.isFemale()) {
            str = "她";
        }
        m3157v(String.format("尊贵的黑金会员，你的消息已优先推送给%s", str));
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> m3154J() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: m */
    public void m3155m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3156u(this);
        if (ura.e().d().I4()) {
            this.f1834b.setTextColor(getResources().getColor(a1c0.f2701i));
        }
    }

    public void setText(CharSequence charSequence) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1834b.getLayoutParams();
        int i = t100.F;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f1834b.setLayoutParams(layoutParams);
        VText vText = this.f1834b;
        int i2 = t100.j;
        int i3 = t100.e;
        vText.setPadding(i2, i3, i2, i3);
        this.f1834b.setTextColor(Color.parseColor("#4c000000"));
        this.f1834b.setBackgroundResource(0);
        xdl0.k(this.f1834b, (Drawable) null);
        this.f1834b.setText(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public final void m3156u(View view) {
        C3131a.m3159b(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m3157v(String str) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1834b.getLayoutParams();
        int i = t100.q;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f1834b.setLayoutParams(layoutParams);
        this.f1834b.setText(str);
        this.f1834b.setTextColor(Color.parseColor("#edd7a3"));
        VText vText = this.f1834b;
        int i2 = t100.m;
        int i3 = t100.e;
        vText.setPadding(i2, i3, i2, i3);
        this.f1834b.setBackgroundResource(c3c0.f3960z5);
        xdl0.k(this.f1834b, act().drawable(c3c0.f3802i0));
    }

    public ItemGreetingTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetingTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
