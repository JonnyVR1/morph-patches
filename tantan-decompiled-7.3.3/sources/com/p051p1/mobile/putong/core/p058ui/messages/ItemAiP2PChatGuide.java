package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.k2q;
import p153l.lyh0;
import p153l.n100;
import p153l.nae0;
import p153l.ovb0;
import p153l.r1j0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiP2PChatGuide extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemAiP2PChatGuide f31612a;

    /* JADX INFO: renamed from: b */
    public VImage f31613b;

    /* JADX INFO: renamed from: c */
    public VText f31614c;

    /* JADX INFO: renamed from: d */
    public VText f31615d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f31616e;

    public ItemAiP2PChatGuide(Context context) {
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
    public final void m49164b(View view) {
        k2q.m147991a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m49165c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49166d(User user, View view) {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(user.f56859id);
        if (conversationM34219zp == null || TEnum.equals(conversationM34219zp.status, "dismissed")) {
            r1j0.m179420g("已解除配对，无法查看");
            return;
        }
        nae0.m162083m(m49165c(), Uri.parse("tantan://create_ai_avatar?uid=" + user.f56859id + "&from=other"));
        i4g0.m138520r("e_paip_chat_quick", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: e */
    public void m49167e(final User user, n100 n100Var) {
        if (user == null || n100Var == null) {
            return;
        }
        this.f31614c.setTypeface(lyh0.m156283c(3), 1);
        this.f31614c.setText(String.format("送%s魔法美照", TEnum.equals(user.gender, "female") ? "她" : "他"));
        this.f31615d.setText(String.format("为%s的头像施加魔法", TEnum.equals(user.gender, "female") ? "她" : "他"));
        bnl0.m105509E0(this.f31616e, new View.OnClickListener() { // from class: l.j2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118078a.m49166d(user, view);
            }
        });
        if (n100Var.m161054a("AI_P2P_CHAT_GUIDE_MV_KEY")) {
            return;
        }
        n100Var.m161055b("AI_P2P_CHAT_GUIDE_MV_KEY");
        i4g0.m138526x("e_paip_chat_quick", OMSDialogPositon.p_chat_view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49164b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31613b, ibc0.f113762C1);
            this.f31614c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31615d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31616e.setBackgroundResource(ibc0.f114138t);
        }
    }

    public ItemAiP2PChatGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemAiP2PChatGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
