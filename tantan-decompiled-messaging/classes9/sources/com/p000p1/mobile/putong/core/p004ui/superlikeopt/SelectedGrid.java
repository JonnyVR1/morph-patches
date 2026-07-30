package com.p000p1.mobile.putong.core.p004ui.superlikeopt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SelectedGrid extends GridLayout {

    /* JADX INFO: renamed from: a */
    public View f6166a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.SelectedGrid$a */
    public interface InterfaceC0333a {
    }

    public SelectedGrid(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.bee0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8847a.m9158b(view2);
            }
        });
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m9158b(View view) {
        m9159c(view, indexOfChild(view), true);
    }

    /* JADX INFO: renamed from: c */
    public final void m9159c(View view, int i, boolean z) {
        View view2 = this.f6166a;
        if (view2 == view) {
            return;
        }
        if (NullChecker.a(view2)) {
            this.f6166a.setSelected(false);
        }
        this.f6166a = view;
        view.setSelected(true);
        if (NullChecker.a((Object) null)) {
            throw null;
        }
    }

    public void setOnSelectChangeListener(InterfaceC0333a interfaceC0333a) {
    }

    public void setSelectChild(int i) {
        if (i < 0 || i >= getChildCount()) {
            return;
        }
        m9159c(getChildAt(i), i, false);
    }

    public SelectedGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectedGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
