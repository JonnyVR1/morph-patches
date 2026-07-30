package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.c2i;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateSquareBottomViewItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public FeedStateSquareBottomViewItem f42808d;

    /* JADX INFO: renamed from: e */
    public VImage f42809e;

    /* JADX INFO: renamed from: f */
    public TextView f42810f;

    /* JADX INFO: renamed from: g */
    public VText f42811g;

    /* JADX INFO: renamed from: h */
    public View f42812h;

    public FeedStateSquareBottomViewItem(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65597p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m65597p(View view) {
        c2i.m104916a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m65598q(FeedStatusSquareTabFrag.C11342f c11342f, boolean z) {
        this.f42809e.setImageResource(c11342f.f42877a);
        this.f42810f.setText(c11342f.f42878b);
        this.f42811g.setText(c11342f.f42879c);
        xdl0.m208344M(this.f42812h, !z);
    }

    public FeedStateSquareBottomViewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
