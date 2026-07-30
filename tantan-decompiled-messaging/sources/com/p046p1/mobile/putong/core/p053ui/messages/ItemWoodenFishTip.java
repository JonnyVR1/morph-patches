package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.data.Message;
import p147v.VFrame;
import p147v.VText;
import p149l.a1c0;
import p149l.gz00;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemWoodenFishTip extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f31553a;

    public ItemWoodenFishTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m48784A(Message message) {
        this.f31553a.setTextColor(getResources().getColor(a1c0.f67125G));
        this.f31553a.setText(gz00.m128789a(message));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31553a = (VText) findViewById(y4c0.f196081Z);
    }

    public ItemWoodenFishTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemWoodenFishTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
