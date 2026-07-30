package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.t4q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemDiceTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemDiceTip f31774a;

    /* JADX INFO: renamed from: b */
    public VText f31775b;

    /* JADX INFO: renamed from: c */
    public VText f31776c;

    public ItemDiceTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49309a(View view) {
        t4q.m189296a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49310b(Message message, User user) {
        if ((!User.isMatched(user) || user.unilateralBlock()) && !user.onlineMatchLocked()) {
            bnl0.m105524M(this, false);
            return;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(message.cid);
        if (conversationM33859Xe == null || TEnum.equals(conversationM33859Xe.status, "dismissed")) {
            bnl0.m105524M(this, false);
            return;
        }
        if (message.localCallStatus == 290) {
            this.f31775b.setText("好久没联系？从一局游戏开始叙叙旧吧~");
        }
        i4g0.m138526x("e_chat_start_dice_tip", OMSDialogPositon.p_chat_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49309a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31775b.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31776c.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemDiceTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemDiceTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
