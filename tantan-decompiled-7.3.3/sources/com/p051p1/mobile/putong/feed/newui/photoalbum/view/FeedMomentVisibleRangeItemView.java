package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VListCell;
import p151v.VRelative;
import p153l.bnl0;
import p153l.j4h;
import p153l.k9c0;
import p153l.lbc0;
import p153l.yhh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentVisibleRangeItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedMomentVisibleRangeItemView f43275d;

    /* JADX INFO: renamed from: e */
    public TextView f43276e;

    /* JADX INFO: renamed from: f */
    public TextView f43277f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f43278g;

    public FeedMomentVisibleRangeItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66337p(this);
        if (j4h.m143424h()) {
            this.f43278g.setBackgroundResource(lbc0.f131046h);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m66337p(View view) {
        yhh.m215961a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m66338q(VListCell.C22660a c22660a, boolean z, boolean z2) {
        if (NullChecker.m82486a(c22660a)) {
            this.f43276e.setText(c22660a.f210081a);
            this.f43277f.setText(c22660a.f210082b);
            bnl0.m105524M(this.f43277f, !TextUtils.isEmpty(c22660a.f210082b));
            bnl0.m105524M(this.f43278g, z);
            this.f43276e.setTextColor(z2 ? getResources().getColor(k9c0.f124515k) : getResources().getColor(k9c0.f124480L));
        }
    }

    public FeedMomentVisibleRangeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentVisibleRangeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
