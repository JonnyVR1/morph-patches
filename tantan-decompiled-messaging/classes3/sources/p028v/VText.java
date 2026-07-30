package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;
import l.b9c0;
import p003l.eqh0;
import p003l.hqh0;
import p003l.kye;
import p003l.l4m;
import p003l.zt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VText extends AppCompatTextView implements l4m {

    /* JADX INFO: renamed from: f */
    public static int f13055f = 1;

    /* JADX INFO: renamed from: g */
    public static int f13056g = 16;

    /* JADX INFO: renamed from: h */
    public static int f13057h = 4096;

    /* JADX INFO: renamed from: a */
    public int f13058a;

    /* JADX INFO: renamed from: b */
    public boolean f13059b;

    /* JADX INFO: renamed from: c */
    public boolean f13060c;

    /* JADX INFO: renamed from: d */
    public boolean f13061d;

    /* JADX INFO: renamed from: e */
    public boolean f13062e;

    public VText(Context context) {
        super(context);
        this.f13058a = 0;
        this.f13059b = false;
        this.f13060c = false;
        m11747h(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m11747h(Context context, AttributeSet attributeSet, int i) {
        eqh0.m3922a(this, context, attributeSet, i);
        hqh0.m4994b(this, context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        if (!"th".equals(Locale.getDefault().getLanguage())) {
            setIncludeFontPadding(false);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.i5, i, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(b9c0.n5, false)) {
                this.f13058a |= f13055f;
            }
            if (typedArrayObtainStyledAttributes.getBoolean(b9c0.o5, false)) {
                this.f13058a |= f13056g;
            }
            if (typedArrayObtainStyledAttributes.getBoolean(b9c0.k5, false)) {
                this.f13058a |= f13057h;
            }
            this.f13062e = typedArrayObtainStyledAttributes.getBoolean(b9c0.l5, false);
            this.f13061d = typedArrayObtainStyledAttributes.getBoolean(b9c0.m5, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11748i() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text) || (this.f13058a & f13055f) == 0) {
            return;
        }
        zt0[] zt0VarArr = (zt0[]) new SpannableStringBuilder(text).getSpans(0, text.length(), zt0.class);
        if (zt0VarArr == null || zt0VarArr.length <= 0) {
            return;
        }
        for (zt0 zt0Var : zt0VarArr) {
            zt0Var.m9464d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.l4m
    /* JADX INFO: renamed from: f */
    public void mo5972f(int i) {
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextView getTextView() {
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m11749j() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text) || (this.f13058a & f13055f) == 0 || !this.f13061d) {
            return;
        }
        zt0[] zt0VarArr = (zt0[]) new SpannableStringBuilder(text).getSpans(0, text.length(), zt0.class);
        if (zt0VarArr == null || zt0VarArr.length <= 0) {
            return;
        }
        for (zt0 zt0Var : zt0VarArr) {
            zt0Var.m9461a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void m11750k(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        m11749j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m11748i();
    }

    public void setAutoEmojiSize(boolean z) {
        if (z) {
            this.f13058a |= f13057h;
        }
    }

    public void setEmojiEnable(boolean z) {
        if (z) {
            this.f13058a |= f13055f;
        }
    }

    public void setLargeEmojiEnable(boolean z) {
        if (z) {
            this.f13058a |= f13056g;
        }
    }

    public void setLargeEmojiForceDisabled(boolean z) {
        this.f13059b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if ((this.f13058a & f13055f) == 0 || charSequence == null) {
            m11750k(charSequence, bufferType);
            return;
        }
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(91);
        int iLastIndexOf = string.lastIndexOf(91);
        boolean z = iIndexOf == iLastIndexOf && iLastIndexOf == 0;
        int iIndexOf2 = string.indexOf(93);
        int iLastIndexOf2 = string.lastIndexOf(93);
        boolean z2 = iIndexOf2 == iLastIndexOf2 && iLastIndexOf2 == charSequence.length() - 1;
        int i = this.f13062e ? 2 : 0;
        m11748i();
        int i2 = this.f13058a;
        if ((f13057h & i2) != 0) {
            m11750k(kye.m5910g(getContext(), charSequence, getTextSize(), i, this, this.f13061d), bufferType);
            return;
        }
        if (!z || !z2 || (f13056g & i2) == 0 || this.f13059b) {
            m11750k(kye.m5909f(getContext(), charSequence, i, this, this.f13061d), bufferType);
        } else {
            m11750k(kye.m5911h(getContext(), charSequence, this, this.f13061d), bufferType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m3923b(this, context, i);
    }

    public void setTextWithoutEmoticonify(CharSequence charSequence) {
        m11750k(charSequence, TextView.BufferType.NORMAL);
    }

    public VText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13058a = 0;
        this.f13059b = false;
        this.f13060c = false;
        m11747h(context, attributeSet, 0);
    }

    public VText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13058a = 0;
        this.f13059b = false;
        this.f13060c = false;
        m11747h(context, attributeSet, i);
    }
}
