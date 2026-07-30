package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VListCell;
import p147v.VRelative;
import p149l.cfh;
import p149l.e1c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentForwardSheetItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedMomentForwardSheetItemView f42423d;

    /* JADX INFO: renamed from: e */
    public TextView f42424e;

    /* JADX INFO: renamed from: f */
    public TextView f42425f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f42426g;

    public FeedMomentForwardSheetItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65152p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m65152p(View view) {
        cfh.m106551a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m65153q(VListCell.C22545a c22545a, boolean z, boolean z2) {
        if (NullChecker.m81303a(c22545a)) {
            this.f42424e.setText(c22545a.f209159a);
            xdl0.m208344M(this.f42425f, false);
            xdl0.m208344M(this.f42426g, z);
            this.f42424e.setTextColor(z2 ? getResources().getColor(e1c0.f88792k) : getResources().getColor(e1c0.f88757L));
        }
    }

    public FeedMomentForwardSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentForwardSheetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
