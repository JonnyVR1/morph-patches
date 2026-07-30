package com.p051p1.mobile.putong.core.p058ui.superlikeopt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;

/* JADX INFO: loaded from: classes12.dex */
public class SelectedGrid extends GridLayout {

    /* JADX INFO: renamed from: a */
    public View f37233a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.SelectedGrid$a */
    public interface InterfaceC9060a {
    }

    public SelectedGrid(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.gme0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f104971a.m56943b(view2);
            }
        });
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m56943b(View view) {
        m56944c(view, indexOfChild(view), true);
    }

    /* JADX INFO: renamed from: c */
    public final void m56944c(View view, int i, boolean z) {
        View view2 = this.f37233a;
        if (view2 == view) {
            return;
        }
        if (NullChecker.m82486a(view2)) {
            this.f37233a.setSelected(false);
        }
        this.f37233a = view;
        view.setSelected(true);
        if (NullChecker.m82486a(null)) {
            throw null;
        }
    }

    public void setOnSelectChangeListener(InterfaceC9060a interfaceC9060a) {
    }

    public void setSelectChild(int i) {
        if (i < 0 || i >= getChildCount()) {
            return;
        }
        m56944c(getChildAt(i), i, false);
    }

    public SelectedGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectedGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
