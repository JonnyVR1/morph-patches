package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.Date;
import p147v.VText;
import p149l.a1c0;
import p149l.j760;
import p149l.mqi0;
import p149l.qsz;
import p149l.ura;
import p149l.v5q;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLongTimeNoSeeTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLongTimeNoSeeTip f31099a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f31100b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f31101c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f31102d;

    /* JADX INFO: renamed from: e */
    public VText f31103e;

    /* JADX INFO: renamed from: f */
    public VText f31104f;

    /* JADX INFO: renamed from: g */
    public VText f31105g;

    public ItemLongTimeNoSeeTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48284a(View view) {
        v5q.m197151a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m48285b(qsz qszVar, Message message, User user, Conversation conversation) {
        if (!qszVar.m176377a(message.f56011id)) {
            qszVar.m176378b(message.f56011id);
            zvf0.m220368A("e_longtimenosee_notice", OMSDialogPositon.p_chat_view, j760.m140076a("pairing_type", conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"));
        }
        if (conversation.additional.reSwipe == null) {
            this.f31103e.setVisibility(8);
            return;
        }
        boolean zM48031d = ItemBase.m48031d(new Date((long) conversation.additional.reSwipe.swipedTime));
        VText vText = this.f31103e;
        if (zM48031d) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f31103e.setText(ItemBase.m48029b(conversation.additional.reSwipe.swipedTime));
        }
        this.f31104f.setVisibility(0);
        this.f31104f.setText(mqi0.f135256h.format(Double.valueOf(conversation.additional.reSwipe.swipedTime)));
        this.f31102d.setVisibility(0);
        this.f31101c.setVisibility(0);
        this.f31105g.setText(String.format("再相遇，别让缘分溜走，和%s聊聊吧", user.isFemale() ? "她" : "他"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48284a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31105g.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemLongTimeNoSeeTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLongTimeNoSeeTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
