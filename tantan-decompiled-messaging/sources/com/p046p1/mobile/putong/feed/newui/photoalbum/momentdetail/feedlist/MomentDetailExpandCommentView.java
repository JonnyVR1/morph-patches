package com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p147v.VText;
import p149l.v900;
import p149l.y900;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailExpandCommentView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public MomentDetailExpandCommentView f42105a;

    /* JADX INFO: renamed from: b */
    public TextView f42106b;

    /* JADX INFO: renamed from: c */
    public VText f42107c;

    /* JADX INFO: renamed from: d */
    public y900 f42108d;

    public MomentDetailExpandCommentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m64874a(View view) {
        v900.m197524a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m64875b(y900 y900Var) {
        this.f42108d = y900Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        y900 y900Var = this.f42108d;
        if (y900Var != null) {
            y900Var.m213526p0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64874a(this);
        setOnClickListener(this);
    }

    public MomentDetailExpandCommentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentDetailExpandCommentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
