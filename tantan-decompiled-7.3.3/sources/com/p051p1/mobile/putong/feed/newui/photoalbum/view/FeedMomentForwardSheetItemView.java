package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VListCell;
import p151v.VRelative;
import p153l.bnl0;
import p153l.k9c0;
import p153l.rgh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentForwardSheetItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedMomentForwardSheetItemView f43271d;

    /* JADX INFO: renamed from: e */
    public TextView f43272e;

    /* JADX INFO: renamed from: f */
    public TextView f43273f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f43274g;

    public FeedMomentForwardSheetItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66335p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m66335p(View view) {
        rgh.m181444a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m66336q(VListCell.C22660a c22660a, boolean z, boolean z2) {
        if (NullChecker.m82486a(c22660a)) {
            this.f43272e.setText(c22660a.f210081a);
            bnl0.m105524M(this.f43273f, false);
            bnl0.m105524M(this.f43274g, z);
            this.f43272e.setTextColor(z2 ? getResources().getColor(k9c0.f124515k) : getResources().getColor(k9c0.f124480L));
        }
    }

    public FeedMomentForwardSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentForwardSheetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
