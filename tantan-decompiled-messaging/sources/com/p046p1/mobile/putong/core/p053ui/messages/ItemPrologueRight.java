package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p046p1.mobile.putong.core.data.Shows;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.dml;
import p149l.j000;
import p149l.knb0;
import p149l.qsz;
import p149l.r9m;
import p149l.vwb;
import p149l.xdl0;
import p149l.y19;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPrologueRight extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemEmojiText f31410c;

    /* JADX INFO: renamed from: d */
    public VText f31411d;

    public ItemPrologueRight(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m48589Q(View view) {
        zvf0.m220399u("e_opening_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("opening_message_type", Shows.sender));
        xdl0.m208328E(this).startActivity(MkWebViewAct.m80240e2(getContext(), "", r9m.m178394p(!CoreModule.f17545c.f19642f0.f19860G1.get().booleanValue()), true, true, true, true, null));
        CoreModule.f17545c.f19642f0.f19860G1.put(Boolean.TRUE);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        MessageAdditionalData messageAdditionalData;
        PrologueMessageAdditional prologueMessageAdditional;
        this.f31410c.mo42388A(message);
        if (!y19.m212150J() || (messageAdditionalData = message.additionalData) == null || (prologueMessageAdditional = messageAdditionalData.prologue) == null || !prologueMessageAdditional.enableEdit) {
            return;
        }
        xdl0.m208344M(this.f31411d, true);
        xdl0.m208329E0(this.f31411d, new View.OnClickListener() { // from class: l.lcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127441a.m48589Q(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return this.f31410c.mo42389J();
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
            zvf0.m220368A("e_opening_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("opening_content", message.value), vwb.m200311Y("opening_message_type", Shows.sender));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31410c = (ItemEmojiText) findViewById(y4c0.f196048T2);
        this.f31411d = (VText) findViewById(y4c0.f195962F0);
    }

    public ItemPrologueRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrologueRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
