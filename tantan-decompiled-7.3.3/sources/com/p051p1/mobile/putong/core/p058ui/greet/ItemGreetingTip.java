package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.ovb0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGreetingTip extends VFrame implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemGreetingTip f30287a;

    /* JADX INFO: renamed from: b */
    public VText f30288b;

    /* JADX INFO: renamed from: c */
    public boolean f30289c;

    /* JADX INFO: renamed from: d */
    public Message f30290d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemGreetingTip$a */
    public static class C8519a {
        /* JADX INFO: renamed from: b */
        public static void m46998b(ItemGreetingTip itemGreetingTip, View view) {
            itemGreetingTip.f30287a = (ItemGreetingTip) view;
            itemGreetingTip.f30288b = (VText) ((ViewGroup) view).getChildAt(0);
        }
    }

    public ItemGreetingTip(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f30290d = message;
        String str = "他";
        if (TEnum.equals(message.messageType, MessageType.local_meet_reply)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.localGreetingId);
            if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isFemale()) {
                str = "她";
            }
            setText(String.format("%1$s向你塞了一个小纸条，回复即可配对聊天", str));
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_reply)) {
            User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(message.localGreetingId);
            if (NullChecker.m82486a(userM116503Pa2) && userM116503Pa2.isFemale()) {
                str = "她";
            }
            setText(String.format("%1$s对你的「看看」动态做出了回应，回复%2$s 立即开始临时对话", str, str));
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_agreematch_notice)) {
            setText(CoreModule.m30933P().m143412i().mo180548v2());
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_match_success)) {
            setText("恭喜配对成功，你可以继续聊天了");
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_chat_greeting_tip)) {
            User userM116503Pa3 = CoreModule.f18264c.f20381e0.m116503Pa(message.cid);
            if (NullChecker.m82486a(userM116503Pa3) && userM116503Pa3.isFemale()) {
                str = "她";
            }
            setText(String.format("%s已经同意配对，可以继续聊天了", str));
            return;
        }
        if (!TEnum.equals(message.messageType, MessageType.local_greet_send_notice)) {
            if (TEnum.equals(message.messageType, MessageType.local_greet_receive_match_tip)) {
                User userM116503Pa4 = CoreModule.f18264c.f20381e0.m116503Pa(message.localGreetingId);
                if (NullChecker.m82486a(userM116503Pa4) && userM116503Pa4.isFemale()) {
                    str = "她";
                }
                setText(String.format("回复即可与%s配对", str));
                return;
            }
            return;
        }
        if (!this.f30289c) {
            i4g0.m138526x("e_send_message_tips", "p_kankan_chat_popup");
            this.f30289c = true;
        }
        if (!CoreModule.m30933P().m143412i().mo180437a2()) {
            setText("真诚聊天，更容易得到回复");
            return;
        }
        User userM116503Pa5 = CoreModule.f18264c.f20381e0.m116503Pa(message.localGreetingId);
        if (NullChecker.m82486a(userM116503Pa5) && userM116503Pa5.isFemale()) {
            str = "她";
        }
        m46996v(String.format("尊贵的黑金会员，你的消息已优先推送给%s", str));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46995u(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f30288b.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public void setText(CharSequence charSequence) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30288b.getLayoutParams();
        int i = qa00.f156293F;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f30288b.setLayoutParams(layoutParams);
        VText vText = this.f30288b;
        int i2 = qa00.f156323j;
        int i3 = qa00.f156318e;
        vText.setPadding(i2, i3, i2, i3);
        this.f30288b.setTextColor(Color.parseColor("#4c000000"));
        this.f30288b.setBackgroundResource(0);
        bnl0.m105563k(this.f30288b, null);
        this.f30288b.setText(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public final void m46995u(View view) {
        C8519a.m46998b(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m46996v(String str) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30288b.getLayoutParams();
        int i = qa00.f156330q;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f30288b.setLayoutParams(layoutParams);
        this.f30288b.setText(str);
        this.f30288b.setTextColor(Color.parseColor("#edd7a3"));
        VText vText = this.f30288b;
        int i2 = qa00.f156326m;
        int i3 = qa00.f156318e;
        vText.setPadding(i2, i3, i2, i3);
        this.f30288b.setBackgroundResource(ibc0.f114198z5);
        bnl0.m105563k(this.f30288b, act().drawable(ibc0.f114040i0));
    }

    public ItemGreetingTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetingTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
