package p028v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import p003l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VText_Tags extends VText {

    /* JADX INFO: renamed from: i */
    public int f13090i;

    /* JADX INFO: renamed from: j */
    public x9j<Integer, Boolean, SpannableStringBuilder> f13091j;

    public VText_Tags(Context context) {
        super(context);
        this.f13090i = 0;
        this.f13091j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private boolean m11774o() {
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
            if (this.f13090i != width) {
                this.f13090i = width;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m11775p(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private void m11776q(boolean z) {
        int i;
        x9j<Integer, Boolean, SpannableStringBuilder> x9jVar = this.f13091j;
        if (x9jVar == null || (i = this.f13090i) <= 0) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilderCall = x9jVar.call(Integer.valueOf(i), Boolean.TRUE);
        if (z) {
            post(new Runnable() { // from class: l.qqk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6670a.m11775p(spannableStringBuilderCall);
                }
            });
        } else {
            setText(spannableStringBuilderCall);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m11774o()) {
            m11776q(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTags(x9j<Integer, Boolean, SpannableStringBuilder> x9jVar) {
        this.f13091j = x9jVar;
        if (x9jVar == null) {
            setText(null);
            return;
        }
        SpannableStringBuilder spannableStringBuilderCall = x9jVar.call(0, Boolean.FALSE);
        setText(spannableStringBuilderCall);
        if (TextUtils.isEmpty(spannableStringBuilderCall)) {
            this.f13091j = null;
        } else {
            m11776q(false);
        }
    }

    public VText_Tags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13090i = 0;
        this.f13091j = null;
    }

    public VText_Tags(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13090i = 0;
        this.f13091j = null;
    }
}
