package p028v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.tantanapp.common.utils.CrashHelper;
import l.b9c0;
import l.n8c0;
import p003l.dqh0;
import p003l.eqh0;
import p003l.kye;
import p003l.l4m;
import p003l.zt0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VEditText extends EditText implements l4m {

    /* JADX INFO: renamed from: a */
    public boolean f12711a;

    /* JADX INFO: renamed from: b */
    public boolean f12712b;

    /* JADX INFO: renamed from: c */
    public int f12713c;

    public VEditText(Context context) {
        super(context);
        this.f12713c = 0;
        m11486b(context, null, n8c0.q);
    }

    /* JADX INFO: renamed from: b */
    private void m11486b(Context context, AttributeSet attributeSet, int i) {
        eqh0.m3922a(this, context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        setIncludeFontPadding(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.i5, i, 0);
            this.f12711a = typedArrayObtainStyledAttributes.getBoolean(b9c0.n5, false);
            this.f12712b = typedArrayObtainStyledAttributes.getBoolean(b9c0.m5, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11487e() {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || !this.f12711a) {
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

    @Override // p003l.l4m
    /* JADX INFO: renamed from: f */
    public void mo5972f(int i) {
        invalidate();
    }

    public TextView getTextView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C1099c<CharSequence> m11488h() {
        return dqh0.m3631c(this, true);
    }

    /* JADX INFO: renamed from: i */
    public C1099c<CharSequence> m11489i(boolean z) {
        return dqh0.m3631c(this, z);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11487e();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f12711a) {
            if (charSequence.length() < this.f12713c) {
                this.f12713c = charSequence.length();
                return;
            }
            this.f12713c = charSequence.length();
            int i4 = i + i3;
            String string = charSequence.subSequence(i, i4).toString();
            if (string.length() <= 2) {
                return;
            }
            kye.m5905b(getContext(), getText(), string, i, i4, 0, this, this.f12712b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    public void setMaxLength(int i) {
        if (i > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            setFilters(new InputFilter[0]);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m3923b(this, context, i);
    }

    public VEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12713c = 0;
        m11486b(context, attributeSet, n8c0.q);
    }

    public VEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12713c = 0;
        m11486b(context, attributeSet, i);
    }
}
