package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.eqh0;
import p149l.j2e0;
import p149l.k0q;
import p149l.knb0;
import p149l.osi0;
import p149l.qsz;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiP2PChatGuide extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemAiP2PChatGuide f30764a;

    /* JADX INFO: renamed from: b */
    public VImage f30765b;

    /* JADX INFO: renamed from: c */
    public VText f30766c;

    /* JADX INFO: renamed from: d */
    public VText f30767d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f30768e;

    public ItemAiP2PChatGuide(Context context) {
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
    public final void m47981b(View view) {
        k0q.m144123a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m47982c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m47983d(User user, View view) {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(user.f56011id);
        if (conversationM33216zp == null || TEnum.equals(conversationM33216zp.status, "dismissed")) {
            osi0.m165783g("已解除配对，无法查看");
            return;
        }
        j2e0.m139446m(m47982c(), Uri.parse("tantan://create_ai_avatar?uid=" + user.f56011id + "&from=other"));
        zvf0.m220396r("e_paip_chat_quick", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public void m47984e(final User user, qsz qszVar) {
        if (user == null || qszVar == null) {
            return;
        }
        this.f30766c.setTypeface(eqh0.m117752c(3), 1);
        this.f30766c.setText(String.format("送%s魔法美照", TEnum.equals(user.gender, "female") ? "她" : "他"));
        this.f30767d.setText(String.format("为%s的头像施加魔法", TEnum.equals(user.gender, "female") ? "她" : "他"));
        xdl0.m208329E0(this.f30768e, new View.OnClickListener() { // from class: l.j0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115700a.m47983d(user, view);
            }
        });
        if (qszVar.m176377a("AI_P2P_CHAT_GUIDE_MV_KEY")) {
            return;
        }
        qszVar.m176378b("AI_P2P_CHAT_GUIDE_MV_KEY");
        zvf0.m220402x("e_paip_chat_quick", OMSDialogPositon.p_chat_view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47981b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f30765b, c3c0.f78487C1);
            this.f30766c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30767d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30768e.setBackgroundResource(c3c0.f78863t);
        }
    }

    public ItemAiP2PChatGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemAiP2PChatGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
