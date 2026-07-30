package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import l.tmf;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedIdealGuideLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f1385a;

    /* JADX INFO: renamed from: b */
    public VText f1386b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f1387c;

    public ExpandedIdealGuideLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2297a(View view) {
        tmf.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2297a(this);
    }

    public ExpandedIdealGuideLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedIdealGuideLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
