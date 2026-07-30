package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.dml;
import p149l.t100;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ItemCenterNotice extends ItemBase {

    /* JADX INFO: renamed from: v */
    public TextView f30850v;

    public ItemCenterNotice(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        super.mo48034g(dmlVar, message, message2, message3);
        this.f30850v.setText(message.value);
        this.f30850v.setTextColor(getResources().getColor(a1c0.f67126H));
        this.f30850v.setBackgroundColor(0);
        if ((((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1) {
            this.f30850v.setBackground(getResources().getDrawable(c3c0.f78625R4));
            this.f30850v.setTextColor(getResources().getColor(a1c0.f67146a0));
        }
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            setPadding(t100.m186890d(58.0f), 0, t100.m186890d(58.0f), t100.f167261j);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30850v = (TextView) findViewById(y4c0.f195933A4);
    }

    public ItemCenterNotice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCenterNotice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
