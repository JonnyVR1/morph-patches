package com.p046p1.mobile.putong.live.external.intl.feedback.upload;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p149l.f5c0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlFeedbackCategoryItemView extends ConstraintLayout {
    private TextView nameView;

    public IntlFeedbackCategoryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m69957h0(C12539a c12539a) {
        this.nameView.setText(c12539a.title);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.nameView = (TextView) findViewById(f5c0.f95074b1);
    }

    public IntlFeedbackCategoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlFeedbackCategoryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
