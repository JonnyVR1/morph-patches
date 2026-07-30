package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.GrowthConversationBlindBox;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.h1q;
import p149l.j2e0;
import p149l.knb0;
import p149l.qib0;
import p149l.qsz;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemBlindBoxGuideView extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemBlindBoxGuideView f30828a;

    /* JADX INFO: renamed from: b */
    public VText f30829b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f30830c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f30831d;

    /* JADX INFO: renamed from: e */
    public VText f30832e;

    /* JADX INFO: renamed from: f */
    public VText f30833f;

    /* JADX INFO: renamed from: g */
    public VText f30834g;

    public ItemBlindBoxGuideView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48037b(View view) {
        h1q.m129067a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m48038c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48039d(GrowthConversationBlindBox growthConversationBlindBox, View view) {
        String strM122571d3 = CoreModule.m29935P().m94656g().mo35035Wa() ? CoreModule.f17545c.f19647g2.m122571d3(growthConversationBlindBox.view.h5URL) : growthConversationBlindBox.view.h5URL;
        if (TextUtils.isEmpty(strM122571d3)) {
            return;
        }
        j2e0.m139446m(m48038c(), Uri.parse("tantan://webview?url=" + strM122571d3));
        zvf0.m220396r("e_chat_blindbox_receiver_h5", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public void m48040e(Conversation conversation, User user, qsz qszVar) {
        final GrowthConversationBlindBox growthConversationBlindBox;
        if (conversation == null || (growthConversationBlindBox = conversation.additional.blindbox) == null || qszVar == null) {
            return;
        }
        boolean z = growthConversationBlindBox.isActor;
        RelativeLayout relativeLayout = this.f30830c;
        if (z) {
            xdl0.m208344M(relativeLayout, false);
        } else {
            xdl0.m208344M(relativeLayout, true);
            this.f30832e.setText(growthConversationBlindBox.view.title);
            this.f30832e.setTypeface(null, 1);
            this.f30833f.setText(growthConversationBlindBox.view.subTitle);
            this.f30834g.setTypeface(null, 1);
            this.f30834g.setText(growthConversationBlindBox.view.buttonTxt);
            if (TextUtils.isEmpty(growthConversationBlindBox.view.icon)) {
                this.f30831d.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78604P1 : c3c0.f78595O1);
            } else {
                qib0.f154691G.m102331L0(this.f30831d, growthConversationBlindBox.view.icon);
            }
        }
        this.f30829b.setText(growthConversationBlindBox.tip);
        xdl0.m208329E0(this.f30834g, new View.OnClickListener() { // from class: l.g1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100193a.m48039d(growthConversationBlindBox, view);
            }
        });
        if (qszVar.m176377a("GROWTH_BLINDBOX_GUIDE_MV_KEY")) {
            return;
        }
        qszVar.m176378b("GROWTH_BLINDBOX_GUIDE_MV_KEY");
        if (growthConversationBlindBox.isActor) {
            zvf0.m220402x("e_chat_blindbox_initiator_tips", OMSDialogPositon.p_chat_view);
        } else {
            zvf0.m220402x("e_chat_blindbox_receiver_tips", OMSDialogPositon.p_chat_view);
            zvf0.m220402x("e_chat_blindbox_receiver_h5", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48037b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30831d.setImageResource(c3c0.f78604P1);
            this.f30829b.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30832e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30833f.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30834g.setBackgroundResource(c3c0.f78649U4);
        }
    }

    public ItemBlindBoxGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemBlindBoxGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
