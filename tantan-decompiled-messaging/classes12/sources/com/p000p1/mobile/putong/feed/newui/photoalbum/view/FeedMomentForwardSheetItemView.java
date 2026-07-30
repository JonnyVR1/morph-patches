package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import p007l.cfh;
import p007l.e1c0;
import v.VCheckBox;
import v.VListCell;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentForwardSheetItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedMomentForwardSheetItemView f3884d;

    /* JADX INFO: renamed from: e */
    public TextView f3885e;

    /* JADX INFO: renamed from: f */
    public TextView f3886f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f3887g;

    public FeedMomentForwardSheetItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6253p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m6253p(View view) {
        cfh.m9130a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m6254q(VListCell.a aVar, boolean z, boolean z2) {
        if (NullChecker.a(aVar)) {
            this.f3885e.setText(aVar.a);
            xdl0.M(this.f3886f, false);
            xdl0.M(this.f3887g, z);
            this.f3885e.setTextColor(z2 ? getResources().getColor(e1c0.f7148k) : getResources().getColor(e1c0.f7113L));
        }
    }

    public FeedMomentForwardSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentForwardSheetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
