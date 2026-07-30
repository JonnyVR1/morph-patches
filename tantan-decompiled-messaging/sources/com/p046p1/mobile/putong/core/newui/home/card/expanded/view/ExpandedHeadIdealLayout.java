package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import p147v.VText;
import p149l.smf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedHeadIdealLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f22605a;

    /* JADX INFO: renamed from: b */
    public CommonLabelShowView f22606b;

    public ExpandedHeadIdealLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m38318a(View view) {
        smf.m184948a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38318a(this);
        this.f22606b.setItemHeight(32);
    }

    public ExpandedHeadIdealLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedHeadIdealLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
