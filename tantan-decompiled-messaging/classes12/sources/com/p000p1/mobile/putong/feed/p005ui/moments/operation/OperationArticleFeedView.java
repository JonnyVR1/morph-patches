package com.p000p1.mobile.putong.feed.p005ui.moments.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.d30;
import l.qib0;
import p007l.nq50;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OperationArticleFeedView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f5468c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f5469d;

    public OperationArticleFeedView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m8293Q(View view) {
        nq50.m12302a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m8294R(String str, String str2, final d30 d30Var) {
        this.f5468c.setText(str);
        qib0.G.L0(this.f5469d, str2);
        setOnClickListener(new View.OnClickListener() { // from class: l.mq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8293Q(this);
    }

    public OperationArticleFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationArticleFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
