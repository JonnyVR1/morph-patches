package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibleDateAnimator extends ViewAnimator {

    /* JADX INFO: renamed from: a */
    private long f61183a;

    public AccessibleDateAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f61183a, 22));
        return true;
    }

    public void setDateMillis(long j) {
        this.f61183a = j;
    }
}
