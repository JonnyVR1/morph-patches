package com.p046p1.mobile.putong.core.p053ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.fuh0;
import p149l.guh0;

/* JADX INFO: loaded from: classes9.dex */
public class TagNorItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f36064a;

    /* JADX INFO: renamed from: b */
    public d30 f36065b;

    public TagNorItem(Context context) {
        super(context);
        m55367b();
    }

    /* JADX INFO: renamed from: a */
    public View m55366a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return guh0.m128033b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m55367b() {
        m55366a(LayoutInflater.from(getContext()), this);
    }

    public fuh0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!NullChecker.m81303a(this.f36064a.getCompoundDrawables()[2]) || motionEvent.getX() <= this.f36064a.getWidth() - this.f36064a.getCompoundDrawables()[2].getBounds().width()) {
            performClick();
            return false;
        }
        if (NullChecker.m81303a(this.f36065b)) {
            this.f36065b.call();
        }
        return false;
    }

    public void setOnRightDrawableClicked(d30 d30Var) {
        this.f36065b = d30Var;
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
        m55367b();
    }

    public TagNorItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m55367b();
    }

    public void setData(fuh0 fuh0Var) {
    }
}
