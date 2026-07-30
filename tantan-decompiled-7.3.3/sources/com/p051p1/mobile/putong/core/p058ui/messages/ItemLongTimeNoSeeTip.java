package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.Date;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.n100;
import p153l.pf60;
import p153l.pzi0;
import p153l.v7q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLongTimeNoSeeTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLongTimeNoSeeTip f31947a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f31948b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f31949c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f31950d;

    /* JADX INFO: renamed from: e */
    public VText f31951e;

    /* JADX INFO: renamed from: f */
    public VText f31952f;

    /* JADX INFO: renamed from: g */
    public VText f31953g;

    public ItemLongTimeNoSeeTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49467a(View view) {
        v7q.m200255a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49468b(n100 n100Var, Message message, User user, Conversation conversation) {
        if (!n100Var.m161054a(message.f56859id)) {
            n100Var.m161055b(message.f56859id);
            i4g0.m138492A("e_longtimenosee_notice", OMSDialogPositon.p_chat_view, pf60.m172085a("pairing_type", conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"));
        }
        if (conversation.additional.reSwipe == null) {
            this.f31951e.setVisibility(8);
            return;
        }
        boolean zM49214d = ItemBase.m49214d(new Date((long) conversation.additional.reSwipe.swipedTime));
        VText vText = this.f31951e;
        if (zM49214d) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f31951e.setText(ItemBase.m49212b(conversation.additional.reSwipe.swipedTime));
        }
        this.f31952f.setVisibility(0);
        this.f31952f.setText(pzi0.f154861h.format(Double.valueOf(conversation.additional.reSwipe.swipedTime)));
        this.f31950d.setVisibility(0);
        this.f31949c.setVisibility(0);
        this.f31953g.setText(String.format("再相遇，别让缘分溜走，和%s聊聊吧", user.isFemale() ? "她" : "他"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49467a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31953g.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemLongTimeNoSeeTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLongTimeNoSeeTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
