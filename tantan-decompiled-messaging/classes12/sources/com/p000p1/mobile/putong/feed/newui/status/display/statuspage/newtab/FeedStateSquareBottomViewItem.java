package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import l.xdl0;
import p007l.c2i;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateSquareBottomViewItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedStateSquareBottomViewItem f4269d;

    /* JADX INFO: renamed from: e */
    public VImage f4270e;

    /* JADX INFO: renamed from: f */
    public TextView f4271f;

    /* JADX INFO: renamed from: g */
    public VText f4272g;

    /* JADX INFO: renamed from: h */
    public View f4273h;

    public FeedStateSquareBottomViewItem(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6734p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m6734p(View view) {
        c2i.m9064a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m6735q(FeedStatusSquareTabFrag.C2186f c2186f, boolean z) {
        this.f4270e.setImageResource(c2186f.f4338a);
        this.f4271f.setText(c2186f.f4339b);
        this.f4272g.setText(c2186f.f4340c);
        xdl0.M(this.f4273h, !z);
    }

    public FeedStateSquareBottomViewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
