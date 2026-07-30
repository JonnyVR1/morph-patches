package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.g900;
import p153l.i4g0;
import p153l.jyb;
import p153l.n100;
import p153l.ovb0;
import p153l.pol;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPrologueLeft extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemEmojiText f32256c;

    /* JADX INFO: renamed from: d */
    public VText f32257d;

    public ItemPrologueLeft(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        PrologueMessageAdditional prologueMessageAdditional;
        this.f32256c.mo43399A(message);
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (prologueMessageAdditional = messageAdditionalData.prologue) == null || TextUtils.isEmpty(prologueMessageAdditional.receiverTip)) {
            bnl0.m105524M(this.f32257d, false);
        } else {
            bnl0.m105524M(this.f32257d, true);
            this.f32257d.setText(message.additionalData.prologue.receiverTip);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return this.f32256c.mo43400J();
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
            i4g0.m138492A("e_opening_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("opening_content", message.value), jyb.m147494Y("opening_message_type", bnl0.m105529O0(this.f32257d) ? "receiver_show_tips" : "receiver_no_tips"));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32256c = (ItemEmojiText) findViewById(edc0.f93283T2);
        this.f32257d = (VText) findViewById(edc0.f93473v3);
    }

    public ItemPrologueLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrologueLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
