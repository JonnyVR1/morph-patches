package p151v;

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
import p137rx.C22421c;
import p153l.c7m;
import p153l.fu0;
import p153l.hhc0;
import p153l.kyh0;
import p153l.lyh0;
import p153l.oze;
import p153l.tgc0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VEditText extends EditText implements c7m {

    /* JADX INFO: renamed from: a */
    public boolean f210008a;

    /* JADX INFO: renamed from: b */
    public boolean f210009b;

    /* JADX INFO: renamed from: c */
    public int f210010c;

    public VEditText(Context context) {
        super(context);
        this.f210010c = 0;
        m224257b(context, null, tgc0.f174071q);
    }

    /* JADX INFO: renamed from: b */
    private void m224257b(Context context, AttributeSet attributeSet, int i) {
        lyh0.m156281a(this, context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        setIncludeFontPadding(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109756i5, i, 0);
            this.f210008a = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109791n5, false);
            this.f210009b = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109784m5, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m224258e() {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || !this.f210008a) {
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

    /* JADX INFO: renamed from: h */
    public C22421c<CharSequence> mo29616h() {
        return kyh0.m151971c(this, true);
    }

    /* JADX INFO: renamed from: i */
    public C22421c<CharSequence> mo29617i(boolean z) {
        return kyh0.m151971c(this, z);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m224258e();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f210008a) {
            if (charSequence.length() < this.f210010c) {
                this.f210010c = charSequence.length();
                return;
            }
            this.f210010c = charSequence.length();
            int i4 = i + i3;
            String string = charSequence.subSequence(i, i4).toString();
            if (string.length() <= 2) {
                return;
            }
            oze.m169921b(getContext(), getText(), string, i, i4, 0, this, this.f210009b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(e);
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
        lyh0.m156282b(this, context, i);
    }

    public VEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210010c = 0;
        m224257b(context, attributeSet, tgc0.f174071q);
    }

    public VEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210010c = 0;
        m224257b(context, attributeSet, i);
    }
}
