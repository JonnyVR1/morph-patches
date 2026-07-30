package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BounceView extends View {

    /* JADX INFO: renamed from: a */
    public C9098a f37573a;

    public BounceView(Context context) {
        super(context);
        this.f37573a = new C9098a(this);
    }

    public C9098a getBounce() {
        return this.f37573a;
    }

    public abstract void setLongPressingListener(C9098a.d dVar);

    public abstract void setProgress(float f);

    public BounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37573a = new C9098a(this);
    }

    public BounceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37573a = new C9098a(this);
    }
}
