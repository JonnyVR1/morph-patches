package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import p153l.edc0;
import p153l.g9c0;
import p153l.ibc0;
import p153l.pol;
import p153l.qa00;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ItemCenterNotice extends ItemBase {

    /* JADX INFO: renamed from: v */
    public TextView f31698v;

    public ItemCenterNotice(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        super.mo49217g(polVar, message, message2, message3);
        this.f31698v.setText(message.value);
        this.f31698v.setTextColor(getResources().getColor(g9c0.f102790H));
        this.f31698v.setBackgroundColor(0);
        if ((((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz) && ((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1) {
            this.f31698v.setBackground(getResources().getDrawable(ibc0.f113900R4));
            this.f31698v.setTextColor(getResources().getColor(g9c0.f102810a0));
        }
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            setPadding(qa00.m175859d(58.0f), 0, qa00.m175859d(58.0f), qa00.f156323j);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31698v = (TextView) findViewById(edc0.f93168A4);
    }

    public ItemCenterNotice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCenterNotice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
