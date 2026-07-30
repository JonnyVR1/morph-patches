package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class BounceView extends View {

    /* JADX INFO: renamed from: a */
    public C0371a f6506a;

    public BounceView(Context context) {
        super(context);
        this.f6506a = new C0371a(this);
    }

    public C0371a getBounce() {
        return this.f6506a;
    }

    public abstract void setLongPressingListener(C0371a.d dVar);

    public abstract void setProgress(float f);

    public BounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6506a = new C0371a(this);
    }

    public BounceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6506a = new C0371a(this);
    }
}
