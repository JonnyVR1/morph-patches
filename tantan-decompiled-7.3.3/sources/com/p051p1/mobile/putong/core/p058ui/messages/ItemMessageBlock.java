package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.VImage;
import p153l.ibc0;
import p153l.k9q;
import p153l.o3z;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageBlock extends FrameLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemMessageBlock f31994a;

    /* JADX INFO: renamed from: b */
    public VImage f31995b;

    public ItemMessageBlock(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m49562d(Message message, View view) {
        if (o3z.m165898g().m165901e(message.cid)) {
            m49564c().m50152S2("text", message.owner);
        } else {
            CoreModule.m30933P().m143412i().showProofAgeDlg(m49564c(), "chat_page_hidden_message");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        boolean zMo180570z = CoreModule.m30933P().m143412i().mo180570z(message.owner);
        VImage vImage = this.f31995b;
        if (zMo180570z) {
            vImage.setImageResource(ibc0.f114065k7);
        } else {
            vImage.setImageResource(ibc0.f114074l7);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.j9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118897a.m49562d(message, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49563b(View view) {
        k9q.m148885a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m49564c() {
        return (MessagesAct) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49563b(this);
    }

    public ItemMessageBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
