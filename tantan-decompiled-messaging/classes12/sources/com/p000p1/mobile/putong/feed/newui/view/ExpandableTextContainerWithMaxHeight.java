package com.p000p1.mobile.putong.feed.newui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.k2l;
import l.qkq0;
import l.t0g0;
import p007l.m9c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ExpandableTextContainerWithMaxHeight extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f4767a;

    /* JADX INFO: renamed from: b */
    public VText f4768b;

    /* JADX INFO: renamed from: c */
    public VText f4769c;

    /* JADX INFO: renamed from: d */
    public boolean f4770d;

    /* JADX INFO: renamed from: e */
    public int f4771e;

    /* JADX INFO: renamed from: f */
    public long f4772f;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f4773g;

    /* JADX INFO: renamed from: h */
    public boolean f4774h;

    /* JADX INFO: renamed from: i */
    public int f4775i;

    /* JADX INFO: renamed from: j */
    public CharSequence f4776j;

    /* JADX INFO: renamed from: k */
    public String f4777k;

    /* JADX INFO: renamed from: l */
    public String f4778l;

    /* JADX INFO: renamed from: m */
    public CharSequence f4779m;

    /* JADX INFO: renamed from: n */
    public CharSequence f4780n;

    /* JADX INFO: renamed from: o */
    public k2l f4781o;

    /* JADX INFO: renamed from: p */
    public int f4782p;

    /* JADX INFO: renamed from: q */
    public boolean f4783q;

    /* JADX INFO: renamed from: r */
    public MovementMethod f4784r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.ExpandableTextContainerWithMaxHeight$a */
    public class C2222a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4785a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4786b;

        public C2222a(int i, int i2) {
            this.f4785a = i;
            this.f4786b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (ExpandableTextContainerWithMaxHeight.this.f4770d) {
                ExpandableTextContainerWithMaxHeight.this.m7392o(true);
            }
            ExpandableTextContainerWithMaxHeight.this.f4773g = new j760(Integer.valueOf(this.f4785a), Integer.valueOf(this.f4786b));
            ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight = ExpandableTextContainerWithMaxHeight.this;
            expandableTextContainerWithMaxHeight.f4770d = true ^ expandableTextContainerWithMaxHeight.f4770d;
            ExpandableTextContainerWithMaxHeight.m7381g(ExpandableTextContainerWithMaxHeight.this);
            boolean zA = NullChecker.a((Object) null);
            ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight2 = ExpandableTextContainerWithMaxHeight.this;
            if (zA) {
                ExpandableTextContainerWithMaxHeight.m7381g(expandableTextContainerWithMaxHeight2);
                boolean unused = ExpandableTextContainerWithMaxHeight.this.f4770d;
                throw null;
            }
            expandableTextContainerWithMaxHeight2.m7403z(expandableTextContainerWithMaxHeight2.f4770d);
            if (!ExpandableTextContainerWithMaxHeight.this.f4783q) {
                ExpandableTextContainerWithMaxHeight.this.m7389A(-2.0f, false);
            }
            ExpandableTextContainerWithMaxHeight.this.f4774h = false;
            if (ExpandableTextContainerWithMaxHeight.this.f4782p > 0 && !ExpandableTextContainerWithMaxHeight.this.f4770d) {
                ExpandableTextContainerWithMaxHeight.this.f4768b.scrollTo(0, 0);
            }
            ExpandableTextContainerWithMaxHeight.this.m7391D();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!ExpandableTextContainerWithMaxHeight.this.f4770d) {
                ExpandableTextContainerWithMaxHeight.this.m7392o(false);
            }
            ExpandableTextContainerWithMaxHeight.this.f4774h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.ExpandableTextContainerWithMaxHeight$b */
    public interface InterfaceC2223b {
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context) {
        super(context);
        this.f4771e = 3;
        this.f4772f = 0L;
        this.f4775i = 0;
        this.f4779m = "";
        this.f4780n = "";
        m7396s(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ InterfaceC2223b m7381g(ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight) {
        expandableTextContainerWithMaxHeight.getClass();
        return null;
    }

    private void getAnimMoveValue() {
        this.f4768b.post(new Runnable() { // from class: l.ukf
            @Override // java.lang.Runnable
            public final void run() {
                this.f13847a.m7401x();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m7389A(float f, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4768b.getLayoutParams();
        int i = (int) f;
        if (NullChecker.a(this.f4784r)) {
            this.f4768b.setMovementMethod(this.f4784r);
        }
        int i2 = this.f4782p;
        if (i2 <= 0 || ((f <= i2 && f >= 0.0f) || !z)) {
            this.f4783q = false;
        } else {
            this.f4783q = true;
            this.f4768b.setMovementMethod(ScrollingMovementMethod.getInstance());
            i = i2;
        }
        marginLayoutParams.height = i;
        this.f4768b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: C */
    public final void m7390C(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13323a.m7402y(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C2222a(i2, i));
        valueAnimatorOfFloat.setDuration(this.f4772f);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: D */
    public final void m7391D() {
        boolean z = this.f4770d;
        k2l k2lVar = this.f4781o;
        if (z) {
            k2lVar.a(this.f4768b, this.f4780n);
        } else {
            k2lVar.a(this.f4768b, this.f4779m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4783q) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public VText getTextView() {
        return this.f4768b;
    }

    /* JADX INFO: renamed from: o */
    public final void m7392o(boolean z) {
        VText vText = this.f4768b;
        if (z) {
            vText.setMaxLines(this.f4771e);
        } else {
            vText.setMaxLines(Integer.MAX_VALUE);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f4769c.getVisibility() == 0) {
            m7390C(((Integer) this.f4773g.a).intValue(), ((Integer) this.f4773g.b).intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7399v();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4774h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f4768b.getWidth();
        if (this.f4775i != width) {
            this.f4775i = width;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m7393p() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: q */
    public final Layout m7394q(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f4768b.getPaint(), (this.f4775i - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f4768b.getLineSpacingMultiplier(), this.f4768b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: r */
    public final String m7395r(String str, TextPaint textPaint, float f) {
        String strReplaceAll = str.replaceAll("\r|\n", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return "...";
        }
        int length = strReplaceAll.length();
        String strConcat = null;
        while (length > 0) {
            strConcat = strReplaceAll.substring(0, length).concat("...");
            if (textPaint.measureText(strConcat) <= f) {
                return strConcat;
            }
            if (m7400w(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = "...";
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: s */
    public final void m7396s(Context context, AttributeSet attributeSet) {
        this.f4767a = context;
        this.f4773g = new j760<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m9c0.f10325i);
            this.f4771e = typedArrayObtainStyledAttributes.getInt(m9c0.f10335n, 3);
            this.f4772f = typedArrayObtainStyledAttributes.getInt(m9c0.f10327j, 0);
            String string = typedArrayObtainStyledAttributes.getString(m9c0.f10331l);
            this.f4777k = string;
            if (TextUtils.isEmpty(string)) {
                this.f4777k = getContext().getResources().getString(R$string.f541j);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(m9c0.f10329k);
            this.f4778l = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f4778l = getContext().getResources().getString(R$string.f492c);
            }
            this.f4782p = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10333m, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: t */
    public final CharSequence m7397t(int i, TextPaint textPaint, String str, String str2) {
        return str + m7395r(str2, textPaint, i);
    }

    /* JADX INFO: renamed from: u */
    public final void m7398u() {
        if (this.f4775i <= 0) {
            return;
        }
        Layout layoutM7394q = m7394q(this.f4776j);
        int lineCount = layoutM7394q.getLineCount();
        String string = this.f4776j.toString();
        if (lineCount <= this.f4771e) {
            CharSequence charSequence = this.f4776j;
            this.f4779m = charSequence;
            this.f4780n = charSequence;
            return;
        }
        int i = 0;
        this.f4769c.setVisibility(0);
        String str = null;
        String str2 = "";
        int i2 = 0;
        while (i < this.f4771e) {
            int lineEnd = layoutM7394q.getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (i == this.f4771e - 1) {
                str = strSubstring;
            } else {
                str2 = str2 + strSubstring;
            }
            i++;
            i2 = lineEnd;
        }
        this.f4780n = this.f4776j;
        this.f4779m = m7397t(this.f4768b.getMeasuredWidth(), this.f4768b.getPaint(), str2, str);
    }

    /* JADX INFO: renamed from: v */
    public final void m7399v() {
        if (!m7393p()) {
            qkq0.a("ExpandableTextContainerWithMaxHeight文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f4768b = getChildAt(0);
        VText childAt = getChildAt(1);
        this.f4769c = childAt;
        childAt.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7400w(String str) {
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

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7401x() {
        int height = this.f4768b.getHeight();
        m7392o(this.f4770d);
        this.f4768b.measure(View.MeasureSpec.makeMeasureSpec(this.f4768b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f4768b.getMeasuredHeight();
        m7392o(!this.f4770d);
        if (this.f4770d) {
            this.f4773g = new j760<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f4773g = new j760<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m7403z(this.f4770d);
        if (TextUtils.isEmpty(this.f4779m)) {
            m7398u();
        }
        m7391D();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7402y(ValueAnimator valueAnimator) {
        m7389A(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: z */
    public final void m7403z(boolean z) {
        VText vText = this.f4769c;
        if (z) {
            vText.setText(this.f4778l);
        } else {
            vText.setText(this.f4777k);
        }
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4771e = 3;
        this.f4772f = 0L;
        this.f4775i = 0;
        this.f4779m = "";
        this.f4780n = "";
        m7396s(context, attributeSet);
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4771e = 3;
        this.f4772f = 0L;
        this.f4775i = 0;
        this.f4779m = "";
        this.f4780n = "";
        m7396s(context, attributeSet);
    }
}
