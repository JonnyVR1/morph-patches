package com.p046p1.mobile.putong.core.p053ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BounceView extends View {

    /* JADX INFO: renamed from: a */
    public C8275a f27971a;

    public BounceView(Context context) {
        super(context);
        this.f27971a = new C8275a(this);
    }

    public C8275a getBounce() {
        return this.f27971a;
    }

    public abstract void setLongPressingListener(C8275a.d dVar);

    public abstract void setProgress(float f);

    public BounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27971a = new C8275a(this);
    }

    public BounceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27971a = new C8275a(this);
    }
}
