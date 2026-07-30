package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import p151v.VText;
import p153l.rcj;

/* JADX INFO: loaded from: classes11.dex */
public class ChatGroupTags extends VText {

    /* JADX INFO: renamed from: i */
    public int f22281i;

    /* JADX INFO: renamed from: j */
    public rcj<Integer, Boolean, SpannableStringBuilder> f22282j;

    public ChatGroupTags(Context context) {
        super(context);
        this.f22281i = 0;
        this.f22282j = null;
    }

    /* JADX INFO: renamed from: q */
    private void m37502q(boolean z) {
        int i;
        rcj<Integer, Boolean, SpannableStringBuilder> rcjVar = this.f22282j;
        if (rcjVar == null || (i = this.f22281i) <= 0) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilderCall = rcjVar.call(Integer.valueOf(i), Boolean.TRUE);
        if (z) {
            post(new Runnable() { // from class: l.av4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73582a.m37504p(spannableStringBuilderCall);
                }
            });
        } else {
            setText(spannableStringBuilderCall);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m37503o() {
        Drawable drawable;
        Drawable drawable2;
        if (getWidth() != 0) {
            int width = ((getWidth() - getPaddingRight()) - getPaddingLeft()) - getCompoundDrawablePadding();
            Drawable[] compoundDrawables = getCompoundDrawables();
            if (compoundDrawables != null) {
                if (compoundDrawables.length > 0 && (drawable2 = compoundDrawables[0]) != null) {
                    width -= drawable2.getIntrinsicWidth();
                }
                if (compoundDrawables.length > 2 && (drawable = compoundDrawables[2]) != null) {
                    width -= drawable.getIntrinsicWidth();
                }
            }
            if (this.f22281i != width) {
                this.f22281i = width;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m37503o()) {
            m37502q(getMaxLines() != 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m37504p(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
    }

    public void setTags(rcj<Integer, Boolean, SpannableStringBuilder> rcjVar) {
        this.f22282j = rcjVar;
        if (rcjVar == null) {
            setText((CharSequence) null);
            return;
        }
        SpannableStringBuilder spannableStringBuilderCall = rcjVar.call(0, Boolean.FALSE);
        setText(spannableStringBuilderCall);
        if (TextUtils.isEmpty(spannableStringBuilderCall)) {
            this.f22282j = null;
        } else {
            m37502q(false);
        }
    }

    public ChatGroupTags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22281i = 0;
        this.f22282j = null;
    }

    public ChatGroupTags(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22281i = 0;
        this.f22282j = null;
    }
}
