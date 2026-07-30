package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import l.a1c0;
import l.c3c0;
import l.t100;
import l.y4c0;
import p003l.bpz;
import p003l.dml;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Deprecated
public class ItemCenterNotice extends ItemBase {

    /* JADX INFO: renamed from: v */
    public TextView f741v;

    public ItemCenterNotice(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        super.mo1114g(dmlVar, message, message2, message3);
        this.f741v.setText(message.value);
        this.f741v.setTextColor(getResources().getColor(a1c0.H));
        this.f741v.setBackgroundColor(0);
        if ((((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1) {
            this.f741v.setBackground(getResources().getDrawable(c3c0.R4));
            this.f741v.setTextColor(getResources().getColor(a1c0.a0));
        }
        if (CoreModule.P().i().G1()) {
            setPadding(t100.d(58.0f), 0, t100.d(58.0f), t100.j);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f741v = (TextView) findViewById(y4c0.A4);
    }

    public ItemCenterNotice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCenterNotice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
