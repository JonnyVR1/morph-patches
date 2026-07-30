package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.xdl0;
import l.y4c0;
import p003l.dml;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemSystemRemind extends ItemBase {

    /* JADX INFO: renamed from: v */
    public VDraweeView f1390v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f1391w;

    public ItemSystemRemind(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        super.mo1114g(dmlVar, message, message2, message3);
        this.f1391w.setText(message.value);
        if (!NullChecker.a(message.additionalData) || !NullChecker.a(message.additionalData.systemReminder) || TextUtils.isEmpty(message.additionalData.systemReminder.icon)) {
            xdl0.M(this.f1390v, false);
        } else {
            qib0.G.L0(this.f1390v, message.additionalData.systemReminder.icon);
            xdl0.M(this.f1390v, true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1390v = (VDraweeView) findViewById(y4c0.k1);
        this.f1391w = findViewById(y4c0.A4);
    }

    public ItemSystemRemind(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSystemRemind(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
