package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VListCell;
import p147v.VRelative;
import p149l.e1c0;
import p149l.f3c0;
import p149l.jgh;
import p149l.u2h;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentVisibleRangeItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedMomentVisibleRangeItemView f42427d;

    /* JADX INFO: renamed from: e */
    public TextView f42428e;

    /* JADX INFO: renamed from: f */
    public TextView f42429f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f42430g;

    public FeedMomentVisibleRangeItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65154p(this);
        if (u2h.m191499h()) {
            this.f42430g.setBackgroundResource(f3c0.f94528h);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m65154p(View view) {
        jgh.m141291a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m65155q(VListCell.C22545a c22545a, boolean z, boolean z2) {
        if (NullChecker.m81303a(c22545a)) {
            this.f42428e.setText(c22545a.f209159a);
            this.f42429f.setText(c22545a.f209160b);
            xdl0.m208344M(this.f42429f, !TextUtils.isEmpty(c22545a.f209160b));
            xdl0.m208344M(this.f42430g, z);
            this.f42428e.setTextColor(z2 ? getResources().getColor(e1c0.f88792k) : getResources().getColor(e1c0.f88757L));
        }
    }

    public FeedMomentVisibleRangeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentVisibleRangeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
