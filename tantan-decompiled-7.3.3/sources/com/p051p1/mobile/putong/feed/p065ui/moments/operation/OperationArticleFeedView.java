package com.p051p1.mobile.putong.feed.p065ui.moments.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.ty50;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class OperationArticleFeedView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f44855c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f44856d;

    public OperationArticleFeedView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m68269Q(View view) {
        ty50.m193558a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m68270R(String str, String str2, final x20 x20Var) {
        this.f44855c.setText(str);
        uqb0.f180374G.m127115L0(this.f44856d, str2);
        setOnClickListener(new View.OnClickListener() { // from class: l.sy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68269Q(this);
    }

    public OperationArticleFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationArticleFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
