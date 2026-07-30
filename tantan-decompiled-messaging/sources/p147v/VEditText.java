package p147v;

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
import p133rx.C22306c;
import p149l.b9c0;
import p149l.dqh0;
import p149l.eqh0;
import p149l.kye;
import p149l.l4m;
import p149l.n8c0;
import p149l.zt0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VEditText extends EditText implements l4m {

    /* JADX INFO: renamed from: a */
    public boolean f209086a;

    /* JADX INFO: renamed from: b */
    public boolean f209087b;

    /* JADX INFO: renamed from: c */
    public int f209088c;

    public VEditText(Context context) {
        super(context);
        this.f209088c = 0;
        m223011b(context, null, n8c0.f137633q);
    }

    /* JADX INFO: renamed from: b */
    private void m223011b(Context context, AttributeSet attributeSet, int i) {
        eqh0.m117750a(this, context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        setIncludeFontPadding(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74447i5, i, 0);
            this.f209086a = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74482n5, false);
            this.f209087b = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74475m5, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m223012e() {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || !this.f209086a) {
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

    /* JADX INFO: renamed from: h */
    public C22306c<CharSequence> mo28617h() {
        return dqh0.m113070c(this, true);
    }

    /* JADX INFO: renamed from: i */
    public C22306c<CharSequence> mo28618i(boolean z) {
        return dqh0.m113070c(this, z);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m223012e();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f209086a) {
            if (charSequence.length() < this.f209088c) {
                this.f209088c = charSequence.length();
                return;
            }
            this.f209088c = charSequence.length();
            int i4 = i + i3;
            String string = charSequence.subSequence(i, i4).toString();
            if (string.length() <= 2) {
                return;
            }
            kye.m147856b(getContext(), getText(), string, i, i4, 0, this, this.f209087b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(e);
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
        eqh0.m117751b(this, context, i);
    }

    public VEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209088c = 0;
        m223011b(context, attributeSet, n8c0.f137633q);
    }

    public VEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209088c = 0;
        m223011b(context, attributeSet, i);
    }
}
