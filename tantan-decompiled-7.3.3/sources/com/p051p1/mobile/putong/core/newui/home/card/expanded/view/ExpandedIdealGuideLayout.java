package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VText;
import p153l.znf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedIdealGuideLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f23349a;

    /* JADX INFO: renamed from: b */
    public VText f23350b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f23351c;

    public ExpandedIdealGuideLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39322a(View view) {
        znf.m220595a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39322a(this);
    }

    public ExpandedIdealGuideLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedIdealGuideLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
