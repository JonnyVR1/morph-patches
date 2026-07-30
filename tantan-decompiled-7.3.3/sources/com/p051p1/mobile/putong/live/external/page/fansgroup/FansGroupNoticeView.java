package com.p051p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;
import p153l.jgg;

/* JADX INFO: loaded from: classes9.dex */
public class FansGroupNoticeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f46774c;

    /* JADX INFO: renamed from: d */
    public FansGroupNoticeListView f46775d;

    public FansGroupNoticeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m71681P(View view) {
        jgg.m144772a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71681P(this);
    }

    public FansGroupNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansGroupNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
