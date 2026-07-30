package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.jgh;
import p007l.u2h;
import v.VCheckBox;
import v.VListCell;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentVisibleRangeItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedMomentVisibleRangeItemView f3888d;

    /* JADX INFO: renamed from: e */
    public TextView f3889e;

    /* JADX INFO: renamed from: f */
    public TextView f3890f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f3891g;

    public FeedMomentVisibleRangeItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6255p(this);
        if (u2h.m14723h()) {
            this.f3891g.setBackgroundResource(f3c0.f7811h);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6255p(View view) {
        jgh.m11177a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m6256q(VListCell.a aVar, boolean z, boolean z2) {
        if (NullChecker.a(aVar)) {
            this.f3889e.setText(aVar.a);
            this.f3890f.setText(aVar.b);
            xdl0.M(this.f3890f, !TextUtils.isEmpty(aVar.b));
            xdl0.M(this.f3891g, z);
            this.f3889e.setTextColor(z2 ? getResources().getColor(e1c0.f7148k) : getResources().getColor(e1c0.f7113L));
        }
    }

    public FeedMomentVisibleRangeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentVisibleRangeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
