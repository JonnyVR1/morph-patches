package com.p000p1.mobile.putong.core.p004ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.guh0;
import p006l.fuh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TagNorItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f5845a;

    /* JADX INFO: renamed from: b */
    public d30 f5846b;

    public TagNorItem(Context context) {
        super(context);
        m8740b();
    }

    /* JADX INFO: renamed from: a */
    public View m8739a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return guh0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m8740b() {
        m8739a(LayoutInflater.from(getContext()), this);
    }

    public fuh0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!NullChecker.a(this.f5845a.getCompoundDrawables()[2]) || motionEvent.getX() <= this.f5845a.getWidth() - this.f5845a.getCompoundDrawables()[2].getBounds().width()) {
            performClick();
            return false;
        }
        if (NullChecker.a(this.f5846b)) {
            this.f5846b.call();
        }
        return false;
    }

    public void setOnRightDrawableClicked(d30 d30Var) {
        this.f5846b = d30Var;
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
        m8740b();
    }

    public TagNorItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8740b();
    }

    public void setData(fuh0 fuh0Var) {
    }
}
