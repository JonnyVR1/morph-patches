package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p051p1.mobile.putong.core.data.Shows;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.g900;
import p153l.h39;
import p153l.hcm;
import p153l.i4g0;
import p153l.jyb;
import p153l.n100;
import p153l.ovb0;
import p153l.pol;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPrologueRight extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemEmojiText f32258c;

    /* JADX INFO: renamed from: d */
    public VText f32259d;

    public ItemPrologueRight(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m49772Q(View view) {
        i4g0.m138523u("e_opening_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("opening_message_type", Shows.sender));
        bnl0.m105508E(this).startActivity(MkWebViewAct.m81423g2(getContext(), "", hcm.m134471p(!CoreModule.f18264c.f20384f0.f20602G1.get().booleanValue()), true, true, true, true, null));
        CoreModule.f18264c.f20384f0.f20602G1.put(Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        MessageAdditionalData messageAdditionalData;
        PrologueMessageAdditional prologueMessageAdditional;
        this.f32258c.mo43399A(message);
        if (!h39.m133421J() || (messageAdditionalData = message.additionalData) == null || (prologueMessageAdditional = messageAdditionalData.prologue) == null || !prologueMessageAdditional.enableEdit) {
            return;
        }
        bnl0.m105524M(this.f32259d, true);
        bnl0.m105509E0(this.f32259d, new View.OnClickListener() { // from class: l.leq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131774a.m49772Q(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return this.f32258c.mo43400J();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, Message message, InterfaceC8682a.a aVar) {
        mo43399A(message);
        if (polVar instanceof g900) {
            n100 n100Var = ((g900) polVar).f102745r;
            if (n100Var.m161054a(message.f56859id)) {
                return;
            }
            n100Var.m161055b(message.f56859id);
            i4g0.m138492A("e_opening_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("opening_content", message.value), jyb.m147494Y("opening_message_type", Shows.sender));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32258c = (ItemEmojiText) findViewById(edc0.f93283T2);
        this.f32259d = (VText) findViewById(edc0.f93197F0);
    }

    public ItemPrologueRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrologueRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
