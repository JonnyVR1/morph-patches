package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import p149l.a120;

/* JADX INFO: loaded from: classes11.dex */
public class MyTabUserHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MyTabUserHeaderView f26696a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f26697b;

    /* JADX INFO: renamed from: c */
    public PrivilegeEntranceView f26698c;

    public MyTabUserHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43470a(View view) {
        a120.m94505a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43470a(this);
    }

    public MyTabUserHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyTabUserHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
