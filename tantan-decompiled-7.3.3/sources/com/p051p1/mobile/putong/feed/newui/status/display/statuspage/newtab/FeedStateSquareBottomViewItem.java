package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.r3i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateSquareBottomViewItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedStateSquareBottomViewItem f43656d;

    /* JADX INFO: renamed from: e */
    public VImage f43657e;

    /* JADX INFO: renamed from: f */
    public TextView f43658f;

    /* JADX INFO: renamed from: g */
    public VText f43659g;

    /* JADX INFO: renamed from: h */
    public View f43660h;

    public FeedStateSquareBottomViewItem(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66780p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m66780p(View view) {
        r3i.m179618a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m66781q(FeedStatusSquareTabFrag.C11505f c11505f, boolean z) {
        this.f43657e.setImageResource(c11505f.f43725a);
        this.f43658f.setText(c11505f.f43726b);
        this.f43659g.setText(c11505f.f43727c);
        bnl0.m105524M(this.f43660h, !z);
    }

    public FeedStateSquareBottomViewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
