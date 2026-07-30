package com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p151v.VText;
import p153l.ei00;
import p153l.hi00;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailExpandCommentView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public MomentDetailExpandCommentView f42953a;

    /* JADX INFO: renamed from: b */
    public TextView f42954b;

    /* JADX INFO: renamed from: c */
    public VText f42955c;

    /* JADX INFO: renamed from: d */
    public hi00 f42956d;

    public MomentDetailExpandCommentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m66057a(View view) {
        ei00.m120878a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m66058b(hi00 hi00Var) {
        this.f42956d = hi00Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        hi00 hi00Var = this.f42956d;
        if (hi00Var != null) {
            hi00Var.m135090p0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66057a(this);
        setOnClickListener(this);
    }

    public MomentDetailExpandCommentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentDetailExpandCommentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
