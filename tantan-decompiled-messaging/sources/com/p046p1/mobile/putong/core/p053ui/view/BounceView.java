package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BounceView extends View {

    /* JADX INFO: renamed from: a */
    public C8935a f36725a;

    public BounceView(Context context) {
        super(context);
        this.f36725a = new C8935a(this);
    }

    public C8935a getBounce() {
        return this.f36725a;
    }

    public abstract void setLongPressingListener(C8935a.d dVar);

    public abstract void setProgress(float f);

    public BounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36725a = new C8935a(this);
    }

    public BounceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36725a = new C8935a(this);
    }
}
