package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p149l.dml;
import p149l.e30;
import p149l.knb0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageFakeLockItem extends VFrame implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemText f31166a;

    /* JADX INFO: renamed from: b */
    public VImage f31167b;

    /* JADX INFO: renamed from: c */
    public int f31168c;

    public ItemMessageFakeLockItem(Context context) {
        super(context);
    }

    private Act getAct() {
        return (Act) xdl0.m208328E(this);
    }

    private String getSafeSourceFrom() {
        if (!(getAct() instanceof MessagesAct)) {
            return "";
        }
        Conversation conversationM120788j3 = ((MessagesAct) getAct()).f31640f.m120788j3();
        if (!NullChecker.m81303a(conversationM120788j3)) {
            return "";
        }
        if (conversationM120788j3.isFakeHeartbeatConv()) {
            return "love_signal";
        }
        return conversationM120788j3.isFakeQuickChatConv() ? "quickchat" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m48398u(View view) {
        o6j0.m162859c("e_im_fake_to_good", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("source_from", getSafeSourceFrom()));
        CoreModule.m29935P().m94658i().mo158218D1(getAct());
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

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, final Message message, InterfaceC8519a.a aVar) {
        xdl0.m208329E0(this, null);
        dmlVar.mo67374c(getAct(), CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.o7q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142530a.m48399v(message, (User) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31166a = (ItemText) findViewById(y4c0.f196077Y1);
        this.f31167b = (VImage) findViewById(y4c0.f196071X1);
        this.f31168c = this.f31166a.getCurrentTextColor();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m48399v(Message message, User user) {
        xdl0.m208329E0(this, null);
        xdl0.m208344M(this.f31167b, true);
        if (user.isRiskAuditAvatar()) {
            this.f31166a.setTextColor(-98787);
            this.f31166a.setText("资料审核中");
            return;
        }
        boolean zMo158299S0 = CoreModule.m29935P().m94658i().mo158299S0();
        ItemText itemText = this.f31166a;
        if (zMo158299S0) {
            itemText.setTextColor(-98787);
            this.f31166a.setText("点击上传头像后解锁");
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.p7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147533a.m48398u(view);
                }
            });
        } else {
            itemText.setTextColor(this.f31168c);
            this.f31166a.setText(message.value);
            xdl0.m208344M(this.f31167b, false);
        }
    }

    public ItemMessageFakeLockItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageFakeLockItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
