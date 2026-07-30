package com.p051p1.mobile.putong.live.external.intl.feedback.upload;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p153l.ldc0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlFeedbackCategoryItemView extends ConstraintLayout {
    private TextView nameView;

    public IntlFeedbackCategoryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m71140h0(C12702a c12702a) {
        this.nameView.setText(c12702a.title);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.nameView = (TextView) findViewById(ldc0.f131531b1);
    }

    public IntlFeedbackCategoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlFeedbackCategoryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
