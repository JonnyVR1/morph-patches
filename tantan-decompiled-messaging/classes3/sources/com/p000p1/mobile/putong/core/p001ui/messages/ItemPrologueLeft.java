package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.j760;
import l.knb0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.dml;
import p003l.j000;
import p003l.qsz;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPrologueLeft extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemEmojiText f1299c;

    /* JADX INFO: renamed from: d */
    public VText f1300d;

    public ItemPrologueLeft(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        PrologueMessageAdditional prologueMessageAdditional;
        this.f1299c.mo1056A(message);
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (prologueMessageAdditional = messageAdditionalData.prologue) == null || TextUtils.isEmpty(prologueMessageAdditional.receiverTip)) {
            xdl0.M(this.f1300d, false);
        } else {
            xdl0.M(this.f1300d, true);
            this.f1300d.setText(message.additionalData.prologue.receiverTip);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return this.f1299c.mo1057J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, Message message, InterfaceC0102a.a aVar) {
        mo1056A(message);
        if (dmlVar instanceof j000) {
            qsz qszVar = ((j000) dmlVar).f4538r;
            if (qszVar.m7030a(((DbObject) message).id)) {
                return;
            }
            qszVar.m7031b(((DbObject) message).id);
            zvf0.A("e_opening_message", "p_chat_view", new j760[]{vwb.Y("opening_content", message.value), vwb.Y("opening_message_type", xdl0.O0(this.f1300d) ? "receiver_show_tips" : "receiver_no_tips")});
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1299c = (ItemEmojiText) findViewById(y4c0.T2);
        this.f1300d = (VText) findViewById(y4c0.v3);
    }

    public ItemPrologueLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrologueLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
