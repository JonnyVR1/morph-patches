package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.dml;
import p149l.qib0;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSystemRemind extends ItemBase {

    /* JADX INFO: renamed from: v */
    public VDraweeView f31499v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f31500w;

    public ItemSystemRemind(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        super.mo48034g(dmlVar, message, message2, message3);
        this.f31500w.setText(message.value);
        if (!NullChecker.m81303a(message.additionalData) || !NullChecker.m81303a(message.additionalData.systemReminder) || TextUtils.isEmpty(message.additionalData.systemReminder.icon)) {
            xdl0.m208344M(this.f31499v, false);
        } else {
            qib0.f154691G.m102331L0(this.f31499v, message.additionalData.systemReminder.icon);
            xdl0.m208344M(this.f31499v, true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31499v = (VDraweeView) findViewById(y4c0.f196159k1);
        this.f31500w = (VText_Bold) findViewById(y4c0.f195933A4);
    }

    public ItemSystemRemind(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSystemRemind(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
