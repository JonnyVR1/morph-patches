package com.p051p1.mobile.putong.core.p058ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p153l.n2i0;
import p153l.o2i0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class TagNorItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f36912a;

    /* JADX INFO: renamed from: b */
    public x20 f36913b;

    public TagNorItem(Context context) {
        super(context);
        m56550b();
    }

    /* JADX INFO: renamed from: a */
    public View m56549a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2i0.m165724b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m56550b() {
        m56549a(LayoutInflater.from(getContext()), this);
    }

    public n2i0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!NullChecker.m82486a(this.f36912a.getCompoundDrawables()[2]) || motionEvent.getX() <= this.f36912a.getWidth() - this.f36912a.getCompoundDrawables()[2].getBounds().width()) {
            performClick();
            return false;
        }
        if (NullChecker.m82486a(this.f36913b)) {
            this.f36913b.call();
        }
        return false;
    }

    public void setOnRightDrawableClicked(x20 x20Var) {
        this.f36913b = x20Var;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (!z) {
            throw null;
        }
        throw null;
    }

    public TagNorItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56550b();
    }

    public TagNorItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56550b();
    }

    public void setData(n2i0 n2i0Var) {
    }
}
