package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.dml;
import p149l.j000;
import p149l.knb0;
import p149l.qsz;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPrologueLeft extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemEmojiText f31408c;

    /* JADX INFO: renamed from: d */
    public VText f31409d;

    public ItemPrologueLeft(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        PrologueMessageAdditional prologueMessageAdditional;
        this.f31408c.mo42388A(message);
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (prologueMessageAdditional = messageAdditionalData.prologue) == null || TextUtils.isEmpty(prologueMessageAdditional.receiverTip)) {
            xdl0.m208344M(this.f31409d, false);
        } else {
            xdl0.m208344M(this.f31409d, true);
            this.f31409d.setText(message.additionalData.prologue.receiverTip);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return this.f31408c.mo42389J();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, Message message, InterfaceC8519a.a aVar) {
        mo42388A(message);
        if (dmlVar instanceof j000) {
            qsz qszVar = ((j000) dmlVar).f115625r;
            if (qszVar.m176377a(message.f56011id)) {
                return;
            }
            qszVar.m176378b(message.f56011id);
            zvf0.m220368A("e_opening_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("opening_content", message.value), vwb.m200311Y("opening_message_type", xdl0.m208349O0(this.f31409d) ? "receiver_show_tips" : "receiver_no_tips"));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31408c = (ItemEmojiText) findViewById(y4c0.f196048T2);
        this.f31409d = (VText) findViewById(y4c0.f196238v3);
    }

    public ItemPrologueLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrologueLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
