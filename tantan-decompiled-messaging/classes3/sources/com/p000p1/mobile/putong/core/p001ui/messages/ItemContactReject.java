package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p1.mobile.putong.core.data.Message;
import l.y4c0;
import p003l.dml;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemContactReject extends ItemBase {
    public ItemContactReject(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        super.mo1114g(dmlVar, message, message2, message3);
        ((TextView) findViewById(y4c0.A4)).setText(message.value);
    }

    public ItemContactReject(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemContactReject(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
