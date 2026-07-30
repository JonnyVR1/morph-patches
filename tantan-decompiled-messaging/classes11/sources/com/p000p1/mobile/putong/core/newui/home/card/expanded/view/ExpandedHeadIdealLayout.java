package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.view.CommonLabelShowView;
import l.smf;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedHeadIdealLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f1383a;

    /* JADX INFO: renamed from: b */
    public CommonLabelShowView f1384b;

    public ExpandedHeadIdealLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2296a(View view) {
        smf.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2296a(this);
        this.f1384b.setItemHeight(32);
    }

    public ExpandedHeadIdealLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedHeadIdealLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
