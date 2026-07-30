package com.p051p1.mobile.putong.feed.newui.view;

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
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.a5l;
import p153l.a9g0;
import p153l.pf60;
import p153l.shc0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes13.dex */
public class ExpandableTextContainerWithMaxHeight extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f44154a;

    /* JADX INFO: renamed from: b */
    public VText f44155b;

    /* JADX INFO: renamed from: c */
    public VText f44156c;

    /* JADX INFO: renamed from: d */
    public boolean f44157d;

    /* JADX INFO: renamed from: e */
    public int f44158e;

    /* JADX INFO: renamed from: f */
    public long f44159f;

    /* JADX INFO: renamed from: g */
    public pf60<Integer, Integer> f44160g;

    /* JADX INFO: renamed from: h */
    public boolean f44161h;

    /* JADX INFO: renamed from: i */
    public int f44162i;

    /* JADX INFO: renamed from: j */
    public CharSequence f44163j;

    /* JADX INFO: renamed from: k */
    public String f44164k;

    /* JADX INFO: renamed from: l */
    public String f44165l;

    /* JADX INFO: renamed from: m */
    public CharSequence f44166m;

    /* JADX INFO: renamed from: n */
    public CharSequence f44167n;

    /* JADX INFO: renamed from: o */
    public a5l f44168o;

    /* JADX INFO: renamed from: p */
    public int f44169p;

    /* JADX INFO: renamed from: q */
    public boolean f44170q;

    /* JADX INFO: renamed from: r */
    public MovementMethod f44171r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.ExpandableTextContainerWithMaxHeight$a */
    public class C11541a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f44172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f44173b;

        public C11541a(int i, int i2) {
            this.f44172a = i;
            this.f44173b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (ExpandableTextContainerWithMaxHeight.this.f44157d) {
                ExpandableTextContainerWithMaxHeight.this.m67415o(true);
            }
            ExpandableTextContainerWithMaxHeight.this.f44160g = new pf60(Integer.valueOf(this.f44172a), Integer.valueOf(this.f44173b));
            ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight = ExpandableTextContainerWithMaxHeight.this;
            expandableTextContainerWithMaxHeight.f44157d = true ^ expandableTextContainerWithMaxHeight.f44157d;
            ExpandableTextContainerWithMaxHeight.m67404g(ExpandableTextContainerWithMaxHeight.this);
            boolean zM82486a = NullChecker.m82486a(null);
            ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight2 = ExpandableTextContainerWithMaxHeight.this;
            if (zM82486a) {
                ExpandableTextContainerWithMaxHeight.m67404g(expandableTextContainerWithMaxHeight2);
                boolean unused = ExpandableTextContainerWithMaxHeight.this.f44157d;
                throw null;
            }
            expandableTextContainerWithMaxHeight2.m67426z(expandableTextContainerWithMaxHeight2.f44157d);
            if (!ExpandableTextContainerWithMaxHeight.this.f44170q) {
                ExpandableTextContainerWithMaxHeight.this.m67412A(-2.0f, false);
            }
            ExpandableTextContainerWithMaxHeight.this.f44161h = false;
            if (ExpandableTextContainerWithMaxHeight.this.f44169p > 0 && !ExpandableTextContainerWithMaxHeight.this.f44157d) {
                ExpandableTextContainerWithMaxHeight.this.f44155b.scrollTo(0, 0);
            }
            ExpandableTextContainerWithMaxHeight.this.m67414D();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!ExpandableTextContainerWithMaxHeight.this.f44157d) {
                ExpandableTextContainerWithMaxHeight.this.m67415o(false);
            }
            ExpandableTextContainerWithMaxHeight.this.f44161h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.ExpandableTextContainerWithMaxHeight$b */
    public interface InterfaceC11542b {
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context) {
        super(context);
        this.f44158e = 3;
        this.f44159f = 0L;
        this.f44162i = 0;
        this.f44166m = "";
        this.f44167n = "";
        m67419s(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ InterfaceC11542b m67404g(ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight) {
        expandableTextContainerWithMaxHeight.getClass();
        return null;
    }

    private void getAnimMoveValue() {
        this.f44155b.post(new Runnable() { // from class: l.amf
            @Override // java.lang.Runnable
            public final void run() {
                this.f72221a.m67424x();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m67412A(float f, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f44155b.getLayoutParams();
        int i = (int) f;
        if (NullChecker.m82486a(this.f44171r)) {
            this.f44155b.setMovementMethod(this.f44171r);
        }
        int i2 = this.f44169p;
        if (i2 <= 0 || ((f <= i2 && f >= 0.0f) || !z)) {
            this.f44170q = false;
        } else {
            this.f44170q = true;
            this.f44155b.setMovementMethod(ScrollingMovementMethod.getInstance());
            i = i2;
        }
        marginLayoutParams.height = i;
        this.f44155b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: C */
    public final void m67413C(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zlf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f204916a.m67425y(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C11541a(i2, i));
        valueAnimatorOfFloat.setDuration(this.f44159f);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: D */
    public final void m67414D() {
        boolean z = this.f44157d;
        a5l a5lVar = this.f44168o;
        if (z) {
            a5lVar.m96236a(this.f44155b, this.f44167n);
        } else {
            a5lVar.m96236a(this.f44155b, this.f44166m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f44170q) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public VText getTextView() {
        return this.f44155b;
    }

    /* JADX INFO: renamed from: o */
    public final void m67415o(boolean z) {
        VText vText = this.f44155b;
        if (z) {
            vText.setMaxLines(this.f44158e);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f44156c.getVisibility() == 0) {
            m67413C(this.f44160g.f152156a.intValue(), this.f44160g.f152157b.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67422v();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f44161h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f44155b.getWidth();
        if (this.f44162i != width) {
            this.f44162i = width;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m67416p() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: q */
    public final Layout m67417q(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f44155b.getPaint(), (this.f44162i - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f44155b.getLineSpacingMultiplier(), this.f44155b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: r */
    public final String m67418r(String str, TextPaint textPaint, float f) {
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
            if (m67423w(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = "...";
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: s */
    public final void m67419s(Context context, AttributeSet attributeSet) {
        this.f44154a = context;
        this.f44160g = new pf60<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, shc0.f168656i);
            this.f44158e = typedArrayObtainStyledAttributes.getInt(shc0.f168666n, 3);
            this.f44159f = typedArrayObtainStyledAttributes.getInt(shc0.f168658j, 0);
            String string = typedArrayObtainStyledAttributes.getString(shc0.f168662l);
            this.f44164k = string;
            if (TextUtils.isEmpty(string)) {
                this.f44164k = getContext().getResources().getString(R$string.f39928j);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(shc0.f168660k);
            this.f44165l = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f44165l = getContext().getResources().getString(R$string.f39879c);
            }
            this.f44169p = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168664m, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: t */
    public final CharSequence m67420t(int i, TextPaint textPaint, String str, String str2) {
        return str + m67418r(str2, textPaint, i);
    }

    /* JADX INFO: renamed from: u */
    public final void m67421u() {
        if (this.f44162i <= 0) {
            return;
        }
        Layout layoutM67417q = m67417q(this.f44163j);
        int lineCount = layoutM67417q.getLineCount();
        String string = this.f44163j.toString();
        if (lineCount <= this.f44158e) {
            CharSequence charSequence = this.f44163j;
            this.f44166m = charSequence;
            this.f44167n = charSequence;
            return;
        }
        int i = 0;
        this.f44156c.setVisibility(0);
        String str = null;
        String str2 = "";
        int i2 = 0;
        while (i < this.f44158e) {
            int lineEnd = layoutM67417q.getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (i == this.f44158e - 1) {
                str = strSubstring;
            } else {
                str2 = str2 + strSubstring;
            }
            i++;
            i2 = lineEnd;
        }
        this.f44167n = this.f44163j;
        this.f44166m = m67420t(this.f44155b.getMeasuredWidth(), this.f44155b.getPaint(), str2, str);
    }

    /* JADX INFO: renamed from: v */
    public final void m67422v() {
        if (!m67416p()) {
            wtq0.m207906a("ExpandableTextContainerWithMaxHeight文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f44155b = (VText) getChildAt(0);
        VText vText = (VText) getChildAt(1);
        this.f44156c = vText;
        vText.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m67423w(String str) {
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

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m67424x() {
        int height = this.f44155b.getHeight();
        m67415o(this.f44157d);
        this.f44155b.measure(View.MeasureSpec.makeMeasureSpec(this.f44155b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f44155b.getMeasuredHeight();
        m67415o(!this.f44157d);
        if (this.f44157d) {
            this.f44160g = new pf60<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f44160g = new pf60<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m67426z(this.f44157d);
        if (TextUtils.isEmpty(this.f44166m)) {
            m67421u();
        }
        m67414D();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m67425y(ValueAnimator valueAnimator) {
        m67412A(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: z */
    public final void m67426z(boolean z) {
        VText vText = this.f44156c;
        if (z) {
            vText.setText(this.f44165l);
        } else {
            vText.setText(this.f44164k);
        }
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44158e = 3;
        this.f44159f = 0L;
        this.f44162i = 0;
        this.f44166m = "";
        this.f44167n = "";
        m67419s(context, attributeSet);
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44158e = 3;
        this.f44159f = 0L;
        this.f44162i = 0;
        this.f44166m = "";
        this.f44167n = "";
        m67419s(context, attributeSet);
    }
}
