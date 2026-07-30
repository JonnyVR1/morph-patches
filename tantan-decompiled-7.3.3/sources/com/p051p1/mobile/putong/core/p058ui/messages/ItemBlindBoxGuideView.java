package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.GrowthConversationBlindBox;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.h3q;
import p153l.i4g0;
import p153l.ibc0;
import p153l.n100;
import p153l.nae0;
import p153l.ovb0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemBlindBoxGuideView extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemBlindBoxGuideView f31676a;

    /* JADX INFO: renamed from: b */
    public VText f31677b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f31678c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31679d;

    /* JADX INFO: renamed from: e */
    public VText f31680e;

    /* JADX INFO: renamed from: f */
    public VText f31681f;

    /* JADX INFO: renamed from: g */
    public VText f31682g;

    public ItemBlindBoxGuideView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49220b(View view) {
        h3q.m133517a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m49221c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49222d(GrowthConversationBlindBox growthConversationBlindBox, View view) {
        String strM192261d3 = CoreModule.m30933P().m143410g().mo36038Wa() ? CoreModule.f18264c.f20389g2.m192261d3(growthConversationBlindBox.view.h5URL) : growthConversationBlindBox.view.h5URL;
        if (TextUtils.isEmpty(strM192261d3)) {
            return;
        }
        nae0.m162083m(m49221c(), Uri.parse("tantan://webview?url=" + strM192261d3));
        i4g0.m138520r("e_chat_blindbox_receiver_h5", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public void m49223e(Conversation conversation, User user, n100 n100Var) {
        final GrowthConversationBlindBox growthConversationBlindBox;
        if (conversation == null || (growthConversationBlindBox = conversation.additional.blindbox) == null || n100Var == null) {
            return;
        }
        boolean z = growthConversationBlindBox.isActor;
        RelativeLayout relativeLayout = this.f31678c;
        if (z) {
            bnl0.m105524M(relativeLayout, false);
        } else {
            bnl0.m105524M(relativeLayout, true);
            this.f31680e.setText(growthConversationBlindBox.view.title);
            this.f31680e.setTypeface(null, 1);
            this.f31681f.setText(growthConversationBlindBox.view.subTitle);
            this.f31682g.setTypeface(null, 1);
            this.f31682g.setText(growthConversationBlindBox.view.buttonTxt);
            if (TextUtils.isEmpty(growthConversationBlindBox.view.icon)) {
                this.f31679d.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113879P1 : ibc0.f113870O1);
            } else {
                uqb0.f180374G.m127115L0(this.f31679d, growthConversationBlindBox.view.icon);
            }
        }
        this.f31677b.setText(growthConversationBlindBox.tip);
        bnl0.m105509E0(this.f31682g, new View.OnClickListener() { // from class: l.g3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102016a.m49222d(growthConversationBlindBox, view);
            }
        });
        if (n100Var.m161054a("GROWTH_BLINDBOX_GUIDE_MV_KEY")) {
            return;
        }
        n100Var.m161055b("GROWTH_BLINDBOX_GUIDE_MV_KEY");
        if (growthConversationBlindBox.isActor) {
            i4g0.m138526x("e_chat_blindbox_initiator_tips", OMSDialogPositon.p_chat_view);
        } else {
            i4g0.m138526x("e_chat_blindbox_receiver_tips", OMSDialogPositon.p_chat_view);
            i4g0.m138526x("e_chat_blindbox_receiver_h5", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49220b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31679d.setImageResource(ibc0.f113879P1);
            this.f31677b.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31680e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31681f.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31682g.setBackgroundResource(ibc0.f113924U4);
        }
    }

    public ItemBlindBoxGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemBlindBoxGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
