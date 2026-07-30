package p147v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import p149l.x9j;

/* JADX INFO: loaded from: classes3.dex */
public class VText_Tags extends VText {

    /* JADX INFO: renamed from: i */
    public int f209465i;

    /* JADX INFO: renamed from: j */
    public x9j<Integer, Boolean, SpannableStringBuilder> f209466j;

    public VText_Tags(Context context) {
        super(context);
        this.f209465i = 0;
        this.f209466j = null;
    }

    /* JADX INFO: renamed from: o */
    private boolean m223287o() {
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
            if (this.f209465i != width) {
                this.f209465i = width;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m223288p(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: q */
    private void m223289q(boolean z) {
        int i;
        x9j<Integer, Boolean, SpannableStringBuilder> x9jVar = this.f209466j;
        if (x9jVar == null || (i = this.f209465i) <= 0) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilderCall = x9jVar.call(Integer.valueOf(i), Boolean.TRUE);
        if (z) {
            post(new Runnable() { // from class: l.qqk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155912a.m223288p(spannableStringBuilderCall);
                }
            });
        } else {
            setText(spannableStringBuilderCall);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m223287o()) {
            m223289q(true);
        }
    }

    public void setTags(x9j<Integer, Boolean, SpannableStringBuilder> x9jVar) {
        this.f209466j = x9jVar;
        if (x9jVar == null) {
            setText((CharSequence) null);
            return;
        }
        SpannableStringBuilder spannableStringBuilderCall = x9jVar.call(0, Boolean.FALSE);
        setText(spannableStringBuilderCall);
        if (TextUtils.isEmpty(spannableStringBuilderCall)) {
            this.f209466j = null;
        } else {
            m223289q(false);
        }
    }

    public VText_Tags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209465i = 0;
        this.f209466j = null;
    }

    public VText_Tags(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209465i = 0;
        this.f209466j = null;
    }
}
