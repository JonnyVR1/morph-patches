package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.edc0;
import p153l.pol;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSystemRemind extends ItemBase {

    /* JADX INFO: renamed from: v */
    public VDraweeView f32347v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f32348w;

    public ItemSystemRemind(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase
    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        super.mo49217g(polVar, message, message2, message3);
        this.f32348w.setText(message.value);
        if (!NullChecker.m82486a(message.additionalData) || !NullChecker.m82486a(message.additionalData.systemReminder) || TextUtils.isEmpty(message.additionalData.systemReminder.icon)) {
            bnl0.m105524M(this.f32347v, false);
        } else {
            uqb0.f180374G.m127115L0(this.f32347v, message.additionalData.systemReminder.icon);
            bnl0.m105524M(this.f32347v, true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemBase, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32347v = (VDraweeView) findViewById(edc0.f93394k1);
        this.f32348w = (VText_Bold) findViewById(edc0.f93168A4);
    }

    public ItemSystemRemind(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSystemRemind(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
