package com.p046p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;
import p149l.veg;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupNoticeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f45926c;

    /* JADX INFO: renamed from: d */
    public FansGroupNoticeListView f45927d;

    public FansGroupNoticeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m70498P(View view) {
        veg.m198180a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70498P(this);
    }

    public FansGroupNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansGroupNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
