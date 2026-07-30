package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p149l.c3c0;
import p149l.knb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHazy extends FrameLayout implements InterfaceC8519a, View.OnClickListener {
    public ItemHazy(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        setBackground(getContext().getResources().getDrawable(c3c0.f78862s7));
        setOnClickListener(this);
        setOnLongClickListener(null);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m48193a() {
        return (MessagesAct) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CoreModule.m29935P().m94658i().showProofAgeDlg(m48193a(), "chat_page_hidden_message");
    }

    public ItemHazy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHazy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
