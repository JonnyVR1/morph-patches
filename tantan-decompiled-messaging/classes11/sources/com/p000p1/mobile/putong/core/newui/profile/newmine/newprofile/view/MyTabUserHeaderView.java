package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import l.a120;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MyTabUserHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MyTabUserHeaderView f5474a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5475b;

    /* JADX INFO: renamed from: c */
    public PrivilegeEntranceView f5476c;

    public MyTabUserHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7716a(View view) {
        a120.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7716a(this);
    }

    public MyTabUserHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyTabUserHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
