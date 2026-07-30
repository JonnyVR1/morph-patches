package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import p151v.VText;
import p153l.ynf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedHeadIdealLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f23347a;

    /* JADX INFO: renamed from: b */
    public CommonLabelShowView f23348b;

    public ExpandedHeadIdealLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39321a(View view) {
        ynf.m216833a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39321a(this);
        this.f23348b.setItemHeight(32);
    }

    public ExpandedHeadIdealLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedHeadIdealLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
