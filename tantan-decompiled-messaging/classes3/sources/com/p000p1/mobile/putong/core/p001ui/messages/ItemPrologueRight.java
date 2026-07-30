package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.os.ResultReceiver;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.j760;
import l.knb0;
import l.vwb;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.zvf0;
import p003l.dml;
import p003l.j000;
import p003l.qsz;
import p003l.r9m;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPrologueRight extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemEmojiText f1301c;

    /* JADX INFO: renamed from: d */
    public VText f1302d;

    public ItemPrologueRight(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m1673Q(View view) {
        zvf0.u("e_opening_message", "p_chat_view", new j760[]{vwb.Y("opening_message_type", "sender")});
        xdl0.E(this).startActivity(MkWebViewAct.e2(getContext(), "", r9m.m7148p(!((Boolean) CoreModule.c.f0.G1.get()).booleanValue()), true, true, true, true, (ResultReceiver) null));
        CoreModule.c.f0.G1.put(Boolean.TRUE);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        MessageAdditionalData messageAdditionalData;
        PrologueMessageAdditional prologueMessageAdditional;
        this.f1301c.mo1056A(message);
        if (!y19.J() || (messageAdditionalData = message.additionalData) == null || (prologueMessageAdditional = messageAdditionalData.prologue) == null || !prologueMessageAdditional.enableEdit) {
            return;
        }
        xdl0.M(this.f1302d, true);
        xdl0.E0(this.f1302d, new View.OnClickListener() { // from class: l.lcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5259a.m1673Q(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return this.f1301c.mo1057J();
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
            zvf0.A("e_opening_message", "p_chat_view", new j760[]{vwb.Y("opening_content", message.value), vwb.Y("opening_message_type", "sender")});
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1301c = (ItemEmojiText) findViewById(y4c0.T2);
        this.f1302d = (VText) findViewById(y4c0.F0);
    }

    public ItemPrologueRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrologueRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
