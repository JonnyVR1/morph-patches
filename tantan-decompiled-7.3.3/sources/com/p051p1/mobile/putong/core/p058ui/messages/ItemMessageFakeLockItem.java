package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p153l.bnl0;
import p153l.edc0;
import p153l.ovb0;
import p153l.pol;
import p153l.psd0;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageFakeLockItem extends VFrame implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemText f32014a;

    /* JADX INFO: renamed from: b */
    public VImage f32015b;

    /* JADX INFO: renamed from: c */
    public int f32016c;

    public ItemMessageFakeLockItem(Context context) {
        super(context);
    }

    private Act getAct() {
        return (Act) bnl0.m105508E(this);
    }

    private String getSafeSourceFrom() {
        if (!(getAct() instanceof MessagesAct)) {
            return "";
        }
        Conversation conversationM110994j3 = ((MessagesAct) getAct()).f32488f.m110994j3();
        if (!NullChecker.m82486a(conversationM110994j3)) {
            return "";
        }
        if (conversationM110994j3.isFakeHeartbeatConv()) {
            return "love_signal";
        }
        return conversationM110994j3.isFakeQuickChatConv() ? "quickchat" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m49581u(View view) {
        sfj0.m185596c("e_im_fake_to_good", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("source_from", getSafeSourceFrom()));
        CoreModule.m30933P().m143412i().mo180310D1(getAct());
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

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, final Message message, InterfaceC8682a.a aVar) {
        bnl0.m105509E0(this, null);
        polVar.mo68557c(getAct(), CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.o9q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145622a.m49582v(message, (User) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32014a = (ItemText) findViewById(edc0.f93312Y1);
        this.f32015b = (VImage) findViewById(edc0.f93306X1);
        this.f32016c = this.f32014a.getCurrentTextColor();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m49582v(Message message, User user) {
        bnl0.m105509E0(this, null);
        bnl0.m105524M(this.f32015b, true);
        if (user.isRiskAuditAvatar()) {
            this.f32014a.setTextColor(-98787);
            this.f32014a.setText("资料审核中");
            return;
        }
        boolean zMo180391S0 = CoreModule.m30933P().m143412i().mo180391S0();
        ItemText itemText = this.f32014a;
        if (zMo180391S0) {
            itemText.setTextColor(-98787);
            this.f32014a.setText("点击上传头像后解锁");
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.p9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151176a.m49581u(view);
                }
            });
        } else {
            itemText.setTextColor(this.f32016c);
            this.f32014a.setText(message.value);
            bnl0.m105524M(this.f32015b, false);
        }
    }

    public ItemMessageFakeLockItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageFakeLockItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
