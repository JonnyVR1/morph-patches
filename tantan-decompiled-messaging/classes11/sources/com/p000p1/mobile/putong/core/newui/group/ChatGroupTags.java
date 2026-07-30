package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import l.x9j;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ChatGroupTags extends VText {

    /* JADX INFO: renamed from: i */
    public int f317i;

    /* JADX INFO: renamed from: j */
    public x9j<Integer, Boolean, SpannableStringBuilder> f318j;

    public ChatGroupTags(Context context) {
        super(context);
        this.f317i = 0;
        this.f318j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private void m428q(boolean z) {
        int i;
        x9j<Integer, Boolean, SpannableStringBuilder> x9jVar = this.f318j;
        if (x9jVar == null || (i = this.f317i) <= 0) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x9jVar.call(Integer.valueOf(i), Boolean.TRUE);
        if (z) {
            post(new Runnable() { // from class: l.bu4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10312a.m430p(spannableStringBuilder);
                }
            });
        } else {
            setText(spannableStringBuilder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final boolean m429o() {
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
            if (this.f317i != width) {
                this.f317i = width;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onLayout(z, i, i2, i3, i4);
        if (m429o()) {
            m428q(getMaxLines() != 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m430p(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTags(x9j<Integer, Boolean, SpannableStringBuilder> x9jVar) {
        this.f318j = x9jVar;
        if (x9jVar == null) {
            setText(null);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x9jVar.call(0, Boolean.FALSE);
        setText(spannableStringBuilder);
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            this.f318j = null;
        } else {
            m428q(false);
        }
    }

    public ChatGroupTags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f317i = 0;
        this.f318j = null;
    }

    public ChatGroupTags(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f317i = 0;
        this.f318j = null;
    }
}
