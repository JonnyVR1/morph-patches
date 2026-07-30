package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VText;
import p149l.a1c0;
import p149l.t2q;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemDiceTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemDiceTip f30926a;

    /* JADX INFO: renamed from: b */
    public VText f30927b;

    /* JADX INFO: renamed from: c */
    public VText f30928c;

    public ItemDiceTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48126a(View view) {
        t2q.m187057a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m48127b(Message message, User user) {
        if ((!User.isMatched(user) || user.unilateralBlock()) && !user.onlineMatchLocked()) {
            xdl0.m208344M(this, false);
            return;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(message.cid);
        if (conversationM32856Xe == null || TEnum.equals(conversationM32856Xe.status, "dismissed")) {
            xdl0.m208344M(this, false);
            return;
        }
        if (message.localCallStatus == 290) {
            this.f30927b.setText("好久没联系？从一局游戏开始叙叙旧吧~");
        }
        zvf0.m220402x("e_chat_start_dice_tip", OMSDialogPositon.p_chat_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48126a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30927b.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30928c.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemDiceTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemDiceTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
