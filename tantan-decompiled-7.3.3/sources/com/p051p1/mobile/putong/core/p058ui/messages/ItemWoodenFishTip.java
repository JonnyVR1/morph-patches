package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Message;
import p151v.VFrame;
import p151v.VText;
import p153l.edc0;
import p153l.g9c0;
import p153l.q710;

/* JADX INFO: loaded from: classes3.dex */
public class ItemWoodenFishTip extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f32401a;

    public ItemWoodenFishTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m49967A(Message message) {
        this.f32401a.setTextColor(getResources().getColor(g9c0.f102789G));
        this.f32401a.setText(q710.m175631a(message));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32401a = (VText) findViewById(edc0.f93316Z);
    }

    public ItemWoodenFishTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemWoodenFishTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
