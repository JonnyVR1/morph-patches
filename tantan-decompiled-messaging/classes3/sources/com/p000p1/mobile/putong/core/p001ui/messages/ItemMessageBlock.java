package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.c3c0;
import l.k7q;
import l.knb0;
import org.spongycastle.i18n.TextBundle;
import p003l.ruy;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageBlock extends FrameLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemMessageBlock f1037a;

    /* JADX INFO: renamed from: b */
    public VImage f1038b;

    public ItemMessageBlock(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m1463d(Message message, View view) {
        if (ruy.m7381g().m7384e(message.cid)) {
            m1465c().m2060R2(TextBundle.TEXT_ENTRY, message.owner);
        } else {
            CoreModule.P().i().showProofAgeDlg(m1465c(), "chat_page_hidden_message");
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        boolean z = CoreModule.P().i().z(message.owner);
        VImage vImage = this.f1038b;
        if (z) {
            vImage.setImageResource(c3c0.k7);
        } else {
            vImage.setImageResource(c3c0.l7);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.j7q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4583a.m1463d(message, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1464b(View view) {
        k7q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m1465c() {
        return (MessagesAct) getContext();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1464b(this);
    }

    public ItemMessageBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
