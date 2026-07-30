package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import p147v.VText;
import p149l.x9j;

/* JADX INFO: loaded from: classes11.dex */
public class ChatGroupTags extends VText {

    /* JADX INFO: renamed from: i */
    public int f21539i;

    /* JADX INFO: renamed from: j */
    public x9j<Integer, Boolean, SpannableStringBuilder> f21540j;

    public ChatGroupTags(Context context) {
        super(context);
        this.f21539i = 0;
        this.f21540j = null;
    }

    /* JADX INFO: renamed from: q */
    private void m36499q(boolean z) {
        int i;
        x9j<Integer, Boolean, SpannableStringBuilder> x9jVar = this.f21540j;
        if (x9jVar == null || (i = this.f21539i) <= 0) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilderCall = x9jVar.call(Integer.valueOf(i), Boolean.TRUE);
        if (z) {
            post(new Runnable() { // from class: l.bu4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77280a.m36501p(spannableStringBuilderCall);
                }
            });
        } else {
            setText(spannableStringBuilderCall);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m36500o() {
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
            if (this.f21539i != width) {
                this.f21539i = width;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m36500o()) {
            m36499q(getMaxLines() != 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m36501p(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
    }

    public void setTags(x9j<Integer, Boolean, SpannableStringBuilder> x9jVar) {
        this.f21540j = x9jVar;
        if (x9jVar == null) {
            setText((CharSequence) null);
            return;
        }
        SpannableStringBuilder spannableStringBuilderCall = x9jVar.call(0, Boolean.FALSE);
        setText(spannableStringBuilderCall);
        if (TextUtils.isEmpty(spannableStringBuilderCall)) {
            this.f21540j = null;
        } else {
            m36499q(false);
        }
    }

    public ChatGroupTags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21539i = 0;
        this.f21540j = null;
    }

    public ChatGroupTags(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21539i = 0;
        this.f21540j = null;
    }
}
