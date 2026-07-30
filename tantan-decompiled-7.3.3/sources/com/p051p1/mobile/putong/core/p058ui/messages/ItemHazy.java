package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p153l.ibc0;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHazy extends FrameLayout implements InterfaceC8682a, View.OnClickListener {
    public ItemHazy(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        setBackground(getContext().getResources().getDrawable(ibc0.f114137s7));
        setOnClickListener(this);
        setOnLongClickListener(null);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m49376a() {
        return (MessagesAct) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CoreModule.m30933P().m143412i().showProofAgeDlg(m49376a(), "chat_page_hidden_message");
    }

    public ItemHazy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHazy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
