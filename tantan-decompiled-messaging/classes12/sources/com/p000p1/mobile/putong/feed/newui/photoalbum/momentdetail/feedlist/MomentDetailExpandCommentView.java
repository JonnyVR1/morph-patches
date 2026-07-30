package com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p007l.v900;
import p007l.y900;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailExpandCommentView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public MomentDetailExpandCommentView f3566a;

    /* JADX INFO: renamed from: b */
    public TextView f3567b;

    /* JADX INFO: renamed from: c */
    public VText f3568c;

    /* JADX INFO: renamed from: d */
    public y900 f3569d;

    public MomentDetailExpandCommentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5973a(View view) {
        v900.m15368a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5974b(y900 y900Var) {
        this.f3569d = y900Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        y900 y900Var = this.f3569d;
        if (y900Var != null) {
            y900Var.m16998p0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5973a(this);
        setOnClickListener(this);
    }

    public MomentDetailExpandCommentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentDetailExpandCommentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
