package com.p046p1.mobile.putong.core.p053ui.superlikeopt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.tantanapp.common.utils.NullChecker;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SelectedGrid extends GridLayout {

    /* JADX INFO: renamed from: a */
    public View f36385a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.SelectedGrid$a */
    public interface InterfaceC8897a {
    }

    public SelectedGrid(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.bee0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75154a.m55760b(view2);
            }
        });
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m55760b(View view) {
        m55761c(view, indexOfChild(view), true);
    }

    /* JADX INFO: renamed from: c */
    public final void m55761c(View view, int i, boolean z) {
        View view2 = this.f36385a;
        if (view2 == view) {
            return;
        }
        if (NullChecker.m81303a(view2)) {
            this.f36385a.setSelected(false);
        }
        this.f36385a = view;
        view.setSelected(true);
        if (NullChecker.m81303a(null)) {
            throw null;
        }
    }

    public void setOnSelectChangeListener(InterfaceC8897a interfaceC8897a) {
    }

    public void setSelectChild(int i) {
        if (i < 0 || i >= getChildCount()) {
            return;
        }
        m55761c(getChildAt(i), i, false);
    }

    public SelectedGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectedGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
