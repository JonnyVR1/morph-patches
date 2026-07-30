package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class BounceView extends View {

    /* JADX INFO: renamed from: a */
    public C8438a f28819a;

    public BounceView(Context context) {
        super(context);
        this.f28819a = new C8438a(this);
    }

    public C8438a getBounce() {
        return this.f28819a;
    }

    public abstract void setLongPressingListener(C8438a.d dVar);

    public abstract void setProgress(float f);

    public BounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28819a = new C8438a(this);
    }

    public BounceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28819a = new C8438a(this);
    }
}
