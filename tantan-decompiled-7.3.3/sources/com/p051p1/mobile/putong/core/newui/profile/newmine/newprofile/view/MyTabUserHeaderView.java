package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import p153l.i920;

/* JADX INFO: loaded from: classes11.dex */
public class MyTabUserHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MyTabUserHeaderView f27544a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f27545b;

    /* JADX INFO: renamed from: c */
    public PrivilegeEntranceView f27546c;

    public MyTabUserHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44656a(View view) {
        i920.m139064a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44656a(this);
    }

    public MyTabUserHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyTabUserHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
