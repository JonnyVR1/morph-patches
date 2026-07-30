package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.VImage;
import p149l.c3c0;
import p149l.k7q;
import p149l.knb0;
import p149l.ruy;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageBlock extends FrameLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemMessageBlock f31146a;

    /* JADX INFO: renamed from: b */
    public VImage f31147b;

    public ItemMessageBlock(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m48379d(Message message, View view) {
        if (ruy.m181215g().m181218e(message.cid)) {
            m48381c().m48968R2("text", message.owner);
        } else {
            CoreModule.m29935P().m94658i().showProofAgeDlg(m48381c(), "chat_page_hidden_message");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        boolean zMo158478z = CoreModule.m29935P().m94658i().mo158478z(message.owner);
        VImage vImage = this.f31147b;
        if (zMo158478z) {
            vImage.setImageResource(c3c0.f78790k7);
        } else {
            vImage.setImageResource(c3c0.f78799l7);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.j7q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116625a.m48379d(message, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48380b(View view) {
        k7q.m144694a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m48381c() {
        return (MessagesAct) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48380b(this);
    }

    public ItemMessageBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
