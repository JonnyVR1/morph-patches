package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;
import p153l.c7m;
import p153l.fu0;
import p153l.hhc0;
import p153l.lyh0;
import p153l.oyh0;
import p153l.oze;

/* JADX INFO: loaded from: classes3.dex */
public class VText extends AppCompatTextView implements c7m {

    /* JADX INFO: renamed from: f */
    public static int f210352f = 1;

    /* JADX INFO: renamed from: g */
    public static int f210353g = 16;

    /* JADX INFO: renamed from: h */
    public static int f210354h = 4096;

    /* JADX INFO: renamed from: a */
    public int f210355a;

    /* JADX INFO: renamed from: b */
    public boolean f210356b;

    /* JADX INFO: renamed from: c */
    public boolean f210357c;

    /* JADX INFO: renamed from: d */
    public boolean f210358d;

    /* JADX INFO: renamed from: e */
    public boolean f210359e;

    public VText(Context context) {
        super(context);
        this.f210355a = 0;
        this.f210356b = false;
        this.f210357c = false;
        m224507h(context, null, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m224507h(Context context, AttributeSet attributeSet, int i) {
        lyh0.m156281a(this, context, attributeSet, i);
        oyh0.m169867b(this, context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        if (!"th".equals(Locale.getDefault().getLanguage())) {
            setIncludeFontPadding(false);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109756i5, i, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(hhc0.f109791n5, false)) {
                this.f210355a |= f210352f;
            }
            if (typedArrayObtainStyledAttributes.getBoolean(hhc0.f109798o5, false)) {
                this.f210355a |= f210353g;
            }
            if (typedArrayObtainStyledAttributes.getBoolean(hhc0.f109770k5, false)) {
                this.f210355a |= f210354h;
            }
            this.f210359e = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109777l5, false);
            this.f210358d = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109784m5, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m224508i() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text) || (this.f210355a & f210352f) == 0) {
            return;
        }
        fu0[] fu0VarArr = (fu0[]) new SpannableStringBuilder(text).getSpans(0, text.length(), fu0.class);
        if (fu0VarArr == null || fu0VarArr.length <= 0) {
            return;
        }
        for (fu0 fu0Var : fu0VarArr) {
            fu0Var.m127410d();
        }
    }

    @Override // p153l.c7m
    /* JADX INFO: renamed from: f */
    public void mo108308f(int i) {
        invalidate();
    }

    public TextView getTextView() {
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m224509j() {
        CharSequence text = getText();
        if (TextUtils.isEmpty(text) || (this.f210355a & f210352f) == 0 || !this.f210358d) {
            return;
        }
        fu0[] fu0VarArr = (fu0[]) new SpannableStringBuilder(text).getSpans(0, text.length(), fu0.class);
        if (fu0VarArr == null || fu0VarArr.length <= 0) {
            return;
        }
        for (fu0 fu0Var : fu0VarArr) {
            fu0Var.m127407a();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m224510k(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m224509j();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m224508i();
    }

    public void setAutoEmojiSize(boolean z) {
        if (z) {
            this.f210355a |= f210354h;
        }
    }

    public void setEmojiEnable(boolean z) {
        if (z) {
            this.f210355a |= f210352f;
        }
    }

    public void setLargeEmojiEnable(boolean z) {
        if (z) {
            this.f210355a |= f210353g;
        }
    }

    public void setLargeEmojiForceDisabled(boolean z) {
        this.f210356b = z;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if ((this.f210355a & f210352f) == 0 || charSequence == null) {
            m224510k(charSequence, bufferType);
            return;
        }
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(91);
        int iLastIndexOf = string.lastIndexOf(91);
        boolean z = iIndexOf == iLastIndexOf && iLastIndexOf == 0;
        int iIndexOf2 = string.indexOf(93);
        int iLastIndexOf2 = string.lastIndexOf(93);
        boolean z2 = iIndexOf2 == iLastIndexOf2 && iLastIndexOf2 == charSequence.length() - 1;
        int i = this.f210359e ? 2 : 0;
        m224508i();
        int i2 = this.f210355a;
        if ((f210354h & i2) != 0) {
            m224510k(oze.m169926g(getContext(), charSequence, getTextSize(), i, this, this.f210358d), bufferType);
            return;
        }
        if (!z || !z2 || (f210353g & i2) == 0 || this.f210356b) {
            m224510k(oze.m169925f(getContext(), charSequence, i, this, this.f210358d), bufferType);
        } else {
            m224510k(oze.m169927h(getContext(), charSequence, this, this.f210358d), bufferType);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lyh0.m156282b(this, context, i);
    }

    public void setTextWithoutEmoticonify(CharSequence charSequence) {
        m224510k(charSequence, TextView.BufferType.NORMAL);
    }

    public VText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210355a = 0;
        this.f210356b = false;
        this.f210357c = false;
        m224507h(context, attributeSet, 0);
    }

    public VText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210355a = 0;
        this.f210356b = false;
        this.f210357c = false;
        m224507h(context, attributeSet, i);
    }
}
