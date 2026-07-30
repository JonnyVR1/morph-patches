package com.p046p1.mobile.putong.feed.p060ui.moments.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.nq50;
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
public class OperationArticleFeedView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f44007c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f44008d;

    public OperationArticleFeedView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m67086Q(View view) {
        nq50.m160584a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m67087R(String str, String str2, final d30 d30Var) {
        this.f44007c.setText(str);
        qib0.f154691G.m102331L0(this.f44008d, str2);
        setOnClickListener(new View.OnClickListener() { // from class: l.mq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67086Q(this);
    }

    public OperationArticleFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationArticleFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
