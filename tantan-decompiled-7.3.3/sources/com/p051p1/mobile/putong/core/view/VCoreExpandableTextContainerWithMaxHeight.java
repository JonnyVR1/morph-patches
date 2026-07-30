package com.p051p1.mobile.putong.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.a5l;
import p153l.a9g0;
import p153l.bnl0;
import p153l.khc0;
import p153l.pf60;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
public class VCoreExpandableTextContainerWithMaxHeight extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f39450a;

    /* JADX INFO: renamed from: b */
    public VText f39451b;

    /* JADX INFO: renamed from: c */
    public VText f39452c;

    /* JADX INFO: renamed from: d */
    public boolean f39453d;

    /* JADX INFO: renamed from: e */
    public int f39454e;

    /* JADX INFO: renamed from: f */
    public long f39455f;

    /* JADX INFO: renamed from: g */
    public pf60<Integer, Integer> f39456g;

    /* JADX INFO: renamed from: h */
    public boolean f39457h;

    /* JADX INFO: renamed from: i */
    public int f39458i;

    /* JADX INFO: renamed from: j */
    public CharSequence f39459j;

    /* JADX INFO: renamed from: k */
    public String f39460k;

    /* JADX INFO: renamed from: l */
    public String f39461l;

    /* JADX INFO: renamed from: m */
    public CharSequence f39462m;

    /* JADX INFO: renamed from: n */
    public CharSequence f39463n;

    /* JADX INFO: renamed from: o */
    public a5l f39464o;

    /* JADX INFO: renamed from: p */
    public int f39465p;

    /* JADX INFO: renamed from: q */
    public boolean f39466q;

    /* JADX INFO: renamed from: r */
    public MovementMethod f39467r;

    /* JADX INFO: renamed from: s */
    public CharSequence f39468s;

    /* JADX INFO: renamed from: t */
    public int f39469t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$a */
    public class C9327a extends ClickableSpan {
        public C9327a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (VCoreExpandableTextContainerWithMaxHeight.this.f39453d) {
                return;
            }
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight = VCoreExpandableTextContainerWithMaxHeight.this;
            vCoreExpandableTextContainerWithMaxHeight.m60757F(((Integer) vCoreExpandableTextContainerWithMaxHeight.f39456g.f152156a).intValue(), ((Integer) VCoreExpandableTextContainerWithMaxHeight.this.f39456g.f152157b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VCoreExpandableTextContainerWithMaxHeight.this.f39469t);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$b */
    public class C9328b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f39471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f39472b;

        public C9328b(int i, int i2) {
            this.f39471a = i;
            this.f39472b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VCoreExpandableTextContainerWithMaxHeight.this.f39453d) {
                VCoreExpandableTextContainerWithMaxHeight.this.m60759r(true);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f39456g = new pf60(Integer.valueOf(this.f39471a), Integer.valueOf(this.f39472b));
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight = VCoreExpandableTextContainerWithMaxHeight.this;
            vCoreExpandableTextContainerWithMaxHeight.f39453d = true ^ vCoreExpandableTextContainerWithMaxHeight.f39453d;
            VCoreExpandableTextContainerWithMaxHeight.m60743h(VCoreExpandableTextContainerWithMaxHeight.this);
            boolean zM82486a = NullChecker.m82486a(null);
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight2 = VCoreExpandableTextContainerWithMaxHeight.this;
            if (zM82486a) {
                VCoreExpandableTextContainerWithMaxHeight.m60743h(vCoreExpandableTextContainerWithMaxHeight2);
                boolean unused = VCoreExpandableTextContainerWithMaxHeight.this.f39453d;
                throw null;
            }
            vCoreExpandableTextContainerWithMaxHeight2.m60755D(vCoreExpandableTextContainerWithMaxHeight2.f39453d);
            if (!VCoreExpandableTextContainerWithMaxHeight.this.f39466q) {
                VCoreExpandableTextContainerWithMaxHeight.this.m60756E(-2.0f, false);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f39457h = false;
            if (VCoreExpandableTextContainerWithMaxHeight.this.f39465p > 0 && !VCoreExpandableTextContainerWithMaxHeight.this.f39453d) {
                VCoreExpandableTextContainerWithMaxHeight.this.f39451b.scrollTo(0, 0);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.m60758G();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!VCoreExpandableTextContainerWithMaxHeight.this.f39453d) {
                VCoreExpandableTextContainerWithMaxHeight.this.m60759r(false);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f39457h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$c */
    public interface InterfaceC9329c {
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context) {
        super(context);
        this.f39454e = 3;
        this.f39455f = 0L;
        this.f39458i = 0;
        this.f39462m = "";
        this.f39463n = "";
        this.f39469t = Color.parseColor("#80ffffff");
        m60763v(context, null);
    }

    private void getAnimMoveValue() {
        this.f39451b.post(new Runnable() { // from class: l.kxk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129215a.m60753A();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC9329c m60743h(VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight) {
        vCoreExpandableTextContainerWithMaxHeight.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m60753A() {
        int height = this.f39451b.getHeight();
        m60759r(this.f39453d);
        this.f39451b.measure(View.MeasureSpec.makeMeasureSpec(this.f39451b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f39451b.getMeasuredHeight();
        m60759r(!this.f39453d);
        if (this.f39453d) {
            this.f39456g = new pf60<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f39456g = new pf60<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m60755D(this.f39453d);
        if (TextUtils.isEmpty(this.f39462m)) {
            m60765x();
        }
        m60758G();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m60754C(ValueAnimator valueAnimator) {
        m60756E(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: D */
    public final void m60755D(boolean z) {
        VText vText = this.f39452c;
        if (z) {
            vText.setText(this.f39461l);
            bnl0.m105524M(this.f39452c, true);
        } else {
            vText.setText(this.f39460k);
            bnl0.m105524M(this.f39452c, false);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m60756E(float f, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39451b.getLayoutParams();
        int i = (int) f;
        if (NullChecker.m82486a(this.f39467r)) {
            this.f39451b.setMovementMethod(this.f39467r);
        }
        int i2 = this.f39465p;
        if (i2 <= 0 || ((f <= i2 && f >= 0.0f) || !z)) {
            this.f39466q = false;
        } else {
            this.f39466q = true;
            this.f39451b.setMovementMethod(ScrollingMovementMethod.getInstance());
            i = i2;
        }
        marginLayoutParams.height = i;
        this.f39451b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: F */
    public final void m60757F(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lxk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f133967a.m60754C(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C9328b(i2, i));
        valueAnimatorOfFloat.setDuration(this.f39455f);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m60758G() {
        boolean z = this.f39453d;
        a5l a5lVar = this.f39464o;
        if (z) {
            a5lVar.m96236a(this.f39451b, this.f39463n);
        } else {
            a5lVar.m96236a(this.f39451b, this.f39462m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f39466q) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public VText getTextView() {
        return this.f39451b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f39452c.getVisibility() == 0) {
            m60757F(this.f39456g.f152156a.intValue(), this.f39456g.f152157b.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60766y();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f39457h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f39451b.getWidth();
        if (this.f39458i != width) {
            this.f39458i = width;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m60759r(boolean z) {
        VText vText = this.f39451b;
        if (z) {
            vText.setMaxLines(this.f39454e);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m60760s() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: t */
    public final Layout m60761t(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f39451b.getPaint(), (this.f39458i - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f39451b.getLineSpacingMultiplier(), this.f39451b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: u */
    public final String m60762u(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f39460k;
        String strReplaceAll = str.replaceAll("\r|\n", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return str2;
        }
        int length = strReplaceAll.length();
        String strConcat = null;
        while (length > 0) {
            strConcat = strReplaceAll.substring(0, length).concat(str2);
            if (textPaint.measureText(strConcat) <= f) {
                return strConcat;
            }
            if (m60767z(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: v */
    public final void m60763v(Context context, AttributeSet attributeSet) {
        this.f39450a = context;
        this.f39456g = new pf60<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126759Q1);
            this.f39454e = typedArrayObtainStyledAttributes.getInt(khc0.f126774V1, 3);
            this.f39455f = typedArrayObtainStyledAttributes.getInt(khc0.f126762R1, 0);
            String string = typedArrayObtainStyledAttributes.getString(khc0.f126768T1);
            this.f39460k = string;
            if (TextUtils.isEmpty(string)) {
                this.f39460k = getContext().getResources().getString(R$string.f19414l);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(khc0.f126765S1);
            this.f39461l = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f39461l = getContext().getResources().getString(R$string.f19261g);
            }
            this.f39465p = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126771U1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: w */
    public final CharSequence m60764w(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f39460k;
        String str4 = str + m60762u(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C9327a(), length2 - length, length2, 17);
        this.f39468s = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: x */
    public final void m60765x() {
        if (this.f39458i <= 0) {
            return;
        }
        Layout layoutM60761t = m60761t(this.f39459j);
        int lineCount = layoutM60761t.getLineCount();
        String string = this.f39459j.toString();
        if (lineCount <= this.f39454e) {
            CharSequence charSequence = this.f39459j;
            this.f39462m = charSequence;
            this.f39463n = charSequence;
            return;
        }
        bnl0.m105524M(this.f39452c, this.f39453d);
        int i = 0;
        String str = "";
        String str2 = null;
        int i2 = 0;
        while (i < this.f39454e) {
            int lineEnd = layoutM60761t.getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (i == this.f39454e - 1) {
                str2 = strSubstring;
            } else {
                str = str + strSubstring;
            }
            i++;
            i2 = lineEnd;
        }
        this.f39463n = this.f39459j;
        this.f39462m = m60764w(this.f39451b.getMeasuredWidth(), this.f39451b.getPaint(), str, str2);
    }

    /* JADX INFO: renamed from: y */
    public final void m60766y() {
        if (!m60760s()) {
            wtq0.m207906a("ExpandableTextContainerWithMaxHeight文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f39451b = (VText) getChildAt(0);
        VText vText = (VText) getChildAt(1);
        this.f39452c = vText;
        vText.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m60767z(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (a9g0.m96574i(c)) {
                return true;
            }
        }
        return false;
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39454e = 3;
        this.f39455f = 0L;
        this.f39458i = 0;
        this.f39462m = "";
        this.f39463n = "";
        this.f39469t = Color.parseColor("#80ffffff");
        m60763v(context, attributeSet);
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39454e = 3;
        this.f39455f = 0L;
        this.f39458i = 0;
        this.f39462m = "";
        this.f39463n = "";
        this.f39469t = Color.parseColor("#80ffffff");
        m60763v(context, attributeSet);
    }
}
