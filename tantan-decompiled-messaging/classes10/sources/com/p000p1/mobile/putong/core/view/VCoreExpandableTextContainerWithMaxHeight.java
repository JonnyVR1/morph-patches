package com.p000p1.mobile.putong.core.view;

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
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import l.e9c0;
import l.j760;
import l.k2l;
import l.qkq0;
import l.t0g0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VCoreExpandableTextContainerWithMaxHeight extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f2544a;

    /* JADX INFO: renamed from: b */
    public VText f2545b;

    /* JADX INFO: renamed from: c */
    public VText f2546c;

    /* JADX INFO: renamed from: d */
    public boolean f2547d;

    /* JADX INFO: renamed from: e */
    public int f2548e;

    /* JADX INFO: renamed from: f */
    public long f2549f;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f2550g;

    /* JADX INFO: renamed from: h */
    public boolean f2551h;

    /* JADX INFO: renamed from: i */
    public int f2552i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2553j;

    /* JADX INFO: renamed from: k */
    public String f2554k;

    /* JADX INFO: renamed from: l */
    public String f2555l;

    /* JADX INFO: renamed from: m */
    public CharSequence f2556m;

    /* JADX INFO: renamed from: n */
    public CharSequence f2557n;

    /* JADX INFO: renamed from: o */
    public k2l f2558o;

    /* JADX INFO: renamed from: p */
    public int f2559p;

    /* JADX INFO: renamed from: q */
    public boolean f2560q;

    /* JADX INFO: renamed from: r */
    public MovementMethod f2561r;

    /* JADX INFO: renamed from: s */
    public CharSequence f2562s;

    /* JADX INFO: renamed from: t */
    public int f2563t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$a */
    public class C3262a extends ClickableSpan {
        public C3262a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (VCoreExpandableTextContainerWithMaxHeight.this.f2547d) {
                return;
            }
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight = VCoreExpandableTextContainerWithMaxHeight.this;
            vCoreExpandableTextContainerWithMaxHeight.m4982F(((Integer) vCoreExpandableTextContainerWithMaxHeight.f2550g.a).intValue(), ((Integer) VCoreExpandableTextContainerWithMaxHeight.this.f2550g.b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VCoreExpandableTextContainerWithMaxHeight.this.f2563t);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$b */
    public class C3263b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2565a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2566b;

        public C3263b(int i, int i2) {
            this.f2565a = i;
            this.f2566b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VCoreExpandableTextContainerWithMaxHeight.this.f2547d) {
                VCoreExpandableTextContainerWithMaxHeight.this.m4984r(true);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f2550g = new j760(Integer.valueOf(this.f2565a), Integer.valueOf(this.f2566b));
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight = VCoreExpandableTextContainerWithMaxHeight.this;
            vCoreExpandableTextContainerWithMaxHeight.f2547d = true ^ vCoreExpandableTextContainerWithMaxHeight.f2547d;
            VCoreExpandableTextContainerWithMaxHeight.m4968h(VCoreExpandableTextContainerWithMaxHeight.this);
            boolean zA = NullChecker.a((Object) null);
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight2 = VCoreExpandableTextContainerWithMaxHeight.this;
            if (zA) {
                VCoreExpandableTextContainerWithMaxHeight.m4968h(vCoreExpandableTextContainerWithMaxHeight2);
                boolean unused = VCoreExpandableTextContainerWithMaxHeight.this.f2547d;
                throw null;
            }
            vCoreExpandableTextContainerWithMaxHeight2.m4980D(vCoreExpandableTextContainerWithMaxHeight2.f2547d);
            if (!VCoreExpandableTextContainerWithMaxHeight.this.f2560q) {
                VCoreExpandableTextContainerWithMaxHeight.this.m4981E(-2.0f, false);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f2551h = false;
            if (VCoreExpandableTextContainerWithMaxHeight.this.f2559p > 0 && !VCoreExpandableTextContainerWithMaxHeight.this.f2547d) {
                VCoreExpandableTextContainerWithMaxHeight.this.f2545b.scrollTo(0, 0);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.m4983G();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!VCoreExpandableTextContainerWithMaxHeight.this.f2547d) {
                VCoreExpandableTextContainerWithMaxHeight.this.m4984r(false);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f2551h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$c */
    public interface InterfaceC3264c {
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context) {
        super(context);
        this.f2548e = 3;
        this.f2549f = 0L;
        this.f2552i = 0;
        this.f2556m = "";
        this.f2557n = "";
        this.f2563t = Color.parseColor("#80ffffff");
        m4988v(context, null);
    }

    private void getAnimMoveValue() {
        this.f2545b.post(new Runnable() { // from class: l.eok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4327a.m4978A();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC3264c m4968h(VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight) {
        vCoreExpandableTextContainerWithMaxHeight.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m4978A() {
        int height = this.f2545b.getHeight();
        m4984r(this.f2547d);
        this.f2545b.measure(View.MeasureSpec.makeMeasureSpec(this.f2545b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f2545b.getMeasuredHeight();
        m4984r(!this.f2547d);
        if (this.f2547d) {
            this.f2550g = new j760<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f2550g = new j760<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m4980D(this.f2547d);
        if (TextUtils.isEmpty(this.f2556m)) {
            m4990x();
        }
        m4983G();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m4979C(ValueAnimator valueAnimator) {
        m4981E(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: D */
    public final void m4980D(boolean z) {
        VText vText = this.f2546c;
        if (z) {
            vText.setText(this.f2555l);
            xdl0.M(this.f2546c, true);
        } else {
            vText.setText(this.f2554k);
            xdl0.M(this.f2546c, false);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4981E(float f, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2545b.getLayoutParams();
        int i = (int) f;
        if (NullChecker.a(this.f2561r)) {
            this.f2545b.setMovementMethod(this.f2561r);
        }
        int i2 = this.f2559p;
        if (i2 <= 0 || ((f <= i2 && f >= 0.0f) || !z)) {
            this.f2560q = false;
        } else {
            this.f2560q = true;
            this.f2545b.setMovementMethod(ScrollingMovementMethod.getInstance());
            i = i2;
        }
        marginLayoutParams.height = i;
        this.f2545b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: F */
    public final void m4982F(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fok0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4481a.m4979C(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C3263b(i2, i));
        valueAnimatorOfFloat.setDuration(this.f2549f);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m4983G() {
        boolean z = this.f2547d;
        k2l k2lVar = this.f2558o;
        if (z) {
            k2lVar.a(this.f2545b, this.f2557n);
        } else {
            k2lVar.a(this.f2545b, this.f2556m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f2560q) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public VText getTextView() {
        return this.f2545b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f2546c.getVisibility() == 0) {
            m4982F(((Integer) this.f2550g.a).intValue(), ((Integer) this.f2550g.b).intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4991y();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2551h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f2545b.getWidth();
        if (this.f2552i != width) {
            this.f2552i = width;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4984r(boolean z) {
        VText vText = this.f2545b;
        if (z) {
            vText.setMaxLines(this.f2548e);
        } else {
            vText.setMaxLines(Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m4985s() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: t */
    public final Layout m4986t(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f2545b.getPaint(), (this.f2552i - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f2545b.getLineSpacingMultiplier(), this.f2545b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: u */
    public final String m4987u(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f2554k;
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
            if (m4992z(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: v */
    public final void m4988v(Context context, AttributeSet attributeSet) {
        this.f2544a = context;
        this.f2550g = new j760<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.Q1);
            this.f2548e = typedArrayObtainStyledAttributes.getInt(e9c0.V1, 3);
            this.f2549f = typedArrayObtainStyledAttributes.getInt(e9c0.R1, 0);
            String string = typedArrayObtainStyledAttributes.getString(e9c0.T1);
            this.f2554k = string;
            if (TextUtils.isEmpty(string)) {
                this.f2554k = getContext().getResources().getString(R.string.l);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(e9c0.S1);
            this.f2555l = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f2555l = getContext().getResources().getString(R.string.g);
            }
            this.f2559p = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.U1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: w */
    public final CharSequence m4989w(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f2554k;
        String str4 = str + m4987u(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C3262a(), length2 - length, length2, 17);
        this.f2562s = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: x */
    public final void m4990x() {
        if (this.f2552i <= 0) {
            return;
        }
        Layout layoutM4986t = m4986t(this.f2553j);
        int lineCount = layoutM4986t.getLineCount();
        String string = this.f2553j.toString();
        if (lineCount <= this.f2548e) {
            CharSequence charSequence = this.f2553j;
            this.f2556m = charSequence;
            this.f2557n = charSequence;
            return;
        }
        xdl0.M(this.f2546c, this.f2547d);
        int i = 0;
        String str = "";
        String str2 = null;
        int i2 = 0;
        while (i < this.f2548e) {
            int lineEnd = layoutM4986t.getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (i == this.f2548e - 1) {
                str2 = strSubstring;
            } else {
                str = str + strSubstring;
            }
            i++;
            i2 = lineEnd;
        }
        this.f2557n = this.f2553j;
        this.f2556m = m4989w(this.f2545b.getMeasuredWidth(), this.f2545b.getPaint(), str, str2);
    }

    /* JADX INFO: renamed from: y */
    public final void m4991y() {
        if (!m4985s()) {
            qkq0.a("ExpandableTextContainerWithMaxHeight文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f2545b = getChildAt(0);
        VText childAt = getChildAt(1);
        this.f2546c = childAt;
        childAt.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m4992z(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (t0g0.i(c)) {
                return true;
            }
        }
        return false;
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2548e = 3;
        this.f2549f = 0L;
        this.f2552i = 0;
        this.f2556m = "";
        this.f2557n = "";
        this.f2563t = Color.parseColor("#80ffffff");
        m4988v(context, attributeSet);
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2548e = 3;
        this.f2549f = 0L;
        this.f2552i = 0;
        this.f2556m = "";
        this.f2557n = "";
        this.f2563t = Color.parseColor("#80ffffff");
        m4988v(context, attributeSet);
    }
}
