package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;
import p149l.b9c0;
import p149l.eqh0;
import p149l.hqh0;
import p149l.kye;
import p149l.l4m;
import p149l.zt0;

/* JADX INFO: loaded from: classes3.dex */
public class VText extends AppCompatTextView implements l4m {

    /* JADX INFO: renamed from: f */
    public static int f209430f = 1;

    /* JADX INFO: renamed from: g */
    public static int f209431g = 16;

    /* JADX INFO: renamed from: h */
    public static int f209432h = 4096;

    /* JADX INFO: renamed from: a */
    public int f209433a;

    /* JADX INFO: renamed from: b */
    public boolean f209434b;

    /* JADX INFO: renamed from: c */
    public boolean f209435c;

    /* JADX INFO: renamed from: d */
    public boolean f209436d;

    /* JADX INFO: renamed from: e */
    public boolean f209437e;

    public VText(Context context) {
        super(context);
        this.f209433a = 0;
        this.f209434b = false;
        this.f209435c = false;
        m223261h(context, null, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m223261h(Context context, AttributeSet attributeSet, int i) {
        eqh0.m117750a(this, context, attributeSet, i);
        hqh0.m132454b(this, context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        if (!"th".equals(Locale.getDefault().getLanguage())) {
            setIncludeFontPadding(false);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74447i5, i, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(b9c0.f74482n5, false)) {
                this.f209433a |= f209430f;
            }
            if (typedArrayObtainStyledAttributes.getBoolean(b9c0.f74489o5, false)) {
                this.f209433a |= f209431g;
            }
            if (typedArrayObtainStyledAttributes.getBoolean(b9c0.f74461k5, false)) {
                this.f209433a |= f209432h;
            }
            this.f209437e = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74468l5, false);
            this.f209436d = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74475m5, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m223262i() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text) || (this.f209433a & f209430f) == 0) {
            return;
        }
        zt0[] zt0VarArr = (zt0[]) new SpannableStringBuilder(text).getSpans(0, text.length(), zt0.class);
        if (zt0VarArr == null || zt0VarArr.length <= 0) {
            return;
        }
        for (zt0 zt0Var : zt0VarArr) {
            zt0Var.m220086d();
        }
    }

    @Override // p149l.l4m
    /* JADX INFO: renamed from: f */
    public void mo148450f(int i) {
        invalidate();
    }

    public TextView getTextView() {
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m223263j() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text) || (this.f209433a & f209430f) == 0 || !this.f209436d) {
            return;
        }
        zt0[] zt0VarArr = (zt0[]) new SpannableStringBuilder(text).getSpans(0, text.length(), zt0.class);
        if (zt0VarArr == null || zt0VarArr.length <= 0) {
            return;
        }
        for (zt0 zt0Var : zt0VarArr) {
            zt0Var.m220083a();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m223264k(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m223263j();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m223262i();
    }

    public void setAutoEmojiSize(boolean z) {
        if (z) {
            this.f209433a |= f209432h;
        }
    }

    public void setEmojiEnable(boolean z) {
        if (z) {
            this.f209433a |= f209430f;
        }
    }

    public void setLargeEmojiEnable(boolean z) {
        if (z) {
            this.f209433a |= f209431g;
        }
    }

    public void setLargeEmojiForceDisabled(boolean z) {
        this.f209434b = z;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if ((this.f209433a & f209430f) == 0 || charSequence == null) {
            m223264k(charSequence, bufferType);
            return;
        }
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(91);
        int iLastIndexOf = string.lastIndexOf(91);
        boolean z = iIndexOf == iLastIndexOf && iLastIndexOf == 0;
        int iIndexOf2 = string.indexOf(93);
        int iLastIndexOf2 = string.lastIndexOf(93);
        boolean z2 = iIndexOf2 == iLastIndexOf2 && iLastIndexOf2 == charSequence.length() - 1;
        int i = this.f209437e ? 2 : 0;
        m223262i();
        int i2 = this.f209433a;
        if ((f209432h & i2) != 0) {
            m223264k(kye.m147861g(getContext(), charSequence, getTextSize(), i, this, this.f209436d), bufferType);
            return;
        }
        if (!z || !z2 || (f209431g & i2) == 0 || this.f209434b) {
            m223264k(kye.m147860f(getContext(), charSequence, i, this, this.f209436d), bufferType);
        } else {
            m223264k(kye.m147862h(getContext(), charSequence, this, this.f209436d), bufferType);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m117751b(this, context, i);
    }

    public void setTextWithoutEmoticonify(CharSequence charSequence) {
        m223264k(charSequence, TextView.BufferType.NORMAL);
    }

    public VText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209433a = 0;
        this.f209434b = false;
        this.f209435c = false;
        m223261h(context, attributeSet, 0);
    }

    public VText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209433a = 0;
        this.f209434b = false;
        this.f209435c = false;
        m223261h(context, attributeSet, i);
    }
}
