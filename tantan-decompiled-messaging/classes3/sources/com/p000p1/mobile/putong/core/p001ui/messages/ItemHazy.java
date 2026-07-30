package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.c3c0;
import l.knb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemHazy extends FrameLayout implements InterfaceC0102a, View.OnClickListener {
    public ItemHazy(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        setBackground(getContext().getResources().getDrawable(c3c0.s7));
        setOnClickListener(this);
        setOnLongClickListener(null);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m1273a() {
        return (MessagesAct) getContext();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CoreModule.P().i().showProofAgeDlg(m1273a(), "chat_page_hidden_message");
    }

    public ItemHazy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHazy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
