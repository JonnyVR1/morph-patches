package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.data.Message;
import p153l.edc0;
import p153l.pol;

/* JADX INFO: loaded from: classes3.dex */
public class ItemContactReject extends ItemBase {
    public ItemContactReject(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        super.mo49217g(polVar, message, message2, message3);
        ((TextView) findViewById(edc0.f93168A4)).setText(message.value);
    }

    public ItemContactReject(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemContactReject(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
