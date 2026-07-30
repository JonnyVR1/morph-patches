package p151v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import p153l.rcj;

/* JADX INFO: loaded from: classes3.dex */
public class VText_Tags extends VText {

    /* JADX INFO: renamed from: i */
    public int f210387i;

    /* JADX INFO: renamed from: j */
    public rcj<Integer, Boolean, SpannableStringBuilder> f210388j;

    public VText_Tags(Context context) {
        super(context);
        this.f210387i = 0;
        this.f210388j = null;
    }

    /* JADX INFO: renamed from: o */
    private boolean m224533o() {
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
            if (this.f210387i != width) {
                this.f210387i = width;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m224534p(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: q */
    private void m224535q(boolean z) {
        int i;
        rcj<Integer, Boolean, SpannableStringBuilder> rcjVar = this.f210388j;
        if (rcjVar == null || (i = this.f210387i) <= 0) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilderCall = rcjVar.call(Integer.valueOf(i), Boolean.TRUE);
        if (z) {
            post(new Runnable() { // from class: l.wzk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191806a.m224534p(spannableStringBuilderCall);
                }
            });
        } else {
            setText(spannableStringBuilderCall);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m224533o()) {
            m224535q(true);
        }
    }

    public void setTags(rcj<Integer, Boolean, SpannableStringBuilder> rcjVar) {
        this.f210388j = rcjVar;
        if (rcjVar == null) {
            setText((CharSequence) null);
            return;
        }
        SpannableStringBuilder spannableStringBuilderCall = rcjVar.call(0, Boolean.FALSE);
        setText(spannableStringBuilderCall);
        if (TextUtils.isEmpty(spannableStringBuilderCall)) {
            this.f210388j = null;
        } else {
            m224535q(false);
        }
    }

    public VText_Tags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210387i = 0;
        this.f210388j = null;
    }

    public VText_Tags(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210387i = 0;
        this.f210388j = null;
    }
}
