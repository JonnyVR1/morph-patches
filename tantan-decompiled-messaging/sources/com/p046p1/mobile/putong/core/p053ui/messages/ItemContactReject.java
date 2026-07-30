package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.data.Message;
import p149l.dml;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemContactReject extends ItemBase {
    public ItemContactReject(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        super.mo48034g(dmlVar, message, message2, message3);
        ((TextView) findViewById(y4c0.f195933A4)).setText(message.value);
    }

    public ItemContactReject(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemContactReject(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
