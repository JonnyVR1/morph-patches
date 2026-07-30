package com.p046p1.mobile.putong.feed.newui.view;

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
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.j760;
import p149l.k2l;
import p149l.m9c0;
import p149l.qkq0;
import p149l.t0g0;

/* JADX INFO: loaded from: classes12.dex */
public class ExpandableTextContainerWithMaxHeight extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f43306a;

    /* JADX INFO: renamed from: b */
    public VText f43307b;

    /* JADX INFO: renamed from: c */
    public VText f43308c;

    /* JADX INFO: renamed from: d */
    public boolean f43309d;

    /* JADX INFO: renamed from: e */
    public int f43310e;

    /* JADX INFO: renamed from: f */
    public long f43311f;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f43312g;

    /* JADX INFO: renamed from: h */
    public boolean f43313h;

    /* JADX INFO: renamed from: i */
    public int f43314i;

    /* JADX INFO: renamed from: j */
    public CharSequence f43315j;

    /* JADX INFO: renamed from: k */
    public String f43316k;

    /* JADX INFO: renamed from: l */
    public String f43317l;

    /* JADX INFO: renamed from: m */
    public CharSequence f43318m;

    /* JADX INFO: renamed from: n */
    public CharSequence f43319n;

    /* JADX INFO: renamed from: o */
    public k2l f43320o;

    /* JADX INFO: renamed from: p */
    public int f43321p;

    /* JADX INFO: renamed from: q */
    public boolean f43322q;

    /* JADX INFO: renamed from: r */
    public MovementMethod f43323r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.ExpandableTextContainerWithMaxHeight$a */
    public class C11378a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f43324a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f43325b;

        public C11378a(int i, int i2) {
            this.f43324a = i;
            this.f43325b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (ExpandableTextContainerWithMaxHeight.this.f43309d) {
                ExpandableTextContainerWithMaxHeight.this.m66232o(true);
            }
            ExpandableTextContainerWithMaxHeight.this.f43312g = new j760(Integer.valueOf(this.f43324a), Integer.valueOf(this.f43325b));
            ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight = ExpandableTextContainerWithMaxHeight.this;
            expandableTextContainerWithMaxHeight.f43309d = true ^ expandableTextContainerWithMaxHeight.f43309d;
            ExpandableTextContainerWithMaxHeight.m66221g(ExpandableTextContainerWithMaxHeight.this);
            boolean zM81303a = NullChecker.m81303a(null);
            ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight2 = ExpandableTextContainerWithMaxHeight.this;
            if (zM81303a) {
                ExpandableTextContainerWithMaxHeight.m66221g(expandableTextContainerWithMaxHeight2);
                boolean unused = ExpandableTextContainerWithMaxHeight.this.f43309d;
                throw null;
            }
            expandableTextContainerWithMaxHeight2.m66243z(expandableTextContainerWithMaxHeight2.f43309d);
            if (!ExpandableTextContainerWithMaxHeight.this.f43322q) {
                ExpandableTextContainerWithMaxHeight.this.m66229A(-2.0f, false);
            }
            ExpandableTextContainerWithMaxHeight.this.f43313h = false;
            if (ExpandableTextContainerWithMaxHeight.this.f43321p > 0 && !ExpandableTextContainerWithMaxHeight.this.f43309d) {
                ExpandableTextContainerWithMaxHeight.this.f43307b.scrollTo(0, 0);
            }
            ExpandableTextContainerWithMaxHeight.this.m66231D();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!ExpandableTextContainerWithMaxHeight.this.f43309d) {
                ExpandableTextContainerWithMaxHeight.this.m66232o(false);
            }
            ExpandableTextContainerWithMaxHeight.this.f43313h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.ExpandableTextContainerWithMaxHeight$b */
    public interface InterfaceC11379b {
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context) {
        super(context);
        this.f43310e = 3;
        this.f43311f = 0L;
        this.f43314i = 0;
        this.f43318m = "";
        this.f43319n = "";
        m66236s(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ InterfaceC11379b m66221g(ExpandableTextContainerWithMaxHeight expandableTextContainerWithMaxHeight) {
        expandableTextContainerWithMaxHeight.getClass();
        return null;
    }

    private void getAnimMoveValue() {
        this.f43307b.post(new Runnable() { // from class: l.ukf
            @Override // java.lang.Runnable
            public final void run() {
                this.f176920a.m66241x();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m66229A(float f, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43307b.getLayoutParams();
        int i = (int) f;
        if (NullChecker.m81303a(this.f43323r)) {
            this.f43307b.setMovementMethod(this.f43323r);
        }
        int i2 = this.f43321p;
        if (i2 <= 0 || ((f <= i2 && f >= 0.0f) || !z)) {
            this.f43322q = false;
        } else {
            this.f43322q = true;
            this.f43307b.setMovementMethod(ScrollingMovementMethod.getInstance());
            i = i2;
        }
        marginLayoutParams.height = i;
        this.f43307b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: C */
    public final void m66230C(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tkf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f170862a.m66242y(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C11378a(i2, i));
        valueAnimatorOfFloat.setDuration(this.f43311f);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: D */
    public final void m66231D() {
        boolean z = this.f43309d;
        k2l k2lVar = this.f43320o;
        if (z) {
            k2lVar.m144306a(this.f43307b, this.f43319n);
        } else {
            k2lVar.m144306a(this.f43307b, this.f43318m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f43322q) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public VText getTextView() {
        return this.f43307b;
    }

    /* JADX INFO: renamed from: o */
    public final void m66232o(boolean z) {
        VText vText = this.f43307b;
        if (z) {
            vText.setMaxLines(this.f43310e);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f43308c.getVisibility() == 0) {
            m66230C(this.f43312g.f116564a.intValue(), this.f43312g.f116565b.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66239v();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f43313h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f43307b.getWidth();
        if (this.f43314i != width) {
            this.f43314i = width;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m66233p() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: q */
    public final Layout m66234q(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f43307b.getPaint(), (this.f43314i - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f43307b.getLineSpacingMultiplier(), this.f43307b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: r */
    public final String m66235r(String str, TextPaint textPaint, float f) {
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
            if (m66240w(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = "...";
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: s */
    public final void m66236s(Context context, AttributeSet attributeSet) {
        this.f43306a = context;
        this.f43312g = new j760<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m9c0.f132734i);
            this.f43310e = typedArrayObtainStyledAttributes.getInt(m9c0.f132744n, 3);
            this.f43311f = typedArrayObtainStyledAttributes.getInt(m9c0.f132736j, 0);
            String string = typedArrayObtainStyledAttributes.getString(m9c0.f132740l);
            this.f43316k = string;
            if (TextUtils.isEmpty(string)) {
                this.f43316k = getContext().getResources().getString(R$string.f39080j);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(m9c0.f132738k);
            this.f43317l = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f43317l = getContext().getResources().getString(R$string.f39031c);
            }
            this.f43321p = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132742m, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: t */
    public final CharSequence m66237t(int i, TextPaint textPaint, String str, String str2) {
        return str + m66235r(str2, textPaint, i);
    }

    /* JADX INFO: renamed from: u */
    public final void m66238u() {
        if (this.f43314i <= 0) {
            return;
        }
        Layout layoutM66234q = m66234q(this.f43315j);
        int lineCount = layoutM66234q.getLineCount();
        String string = this.f43315j.toString();
        if (lineCount <= this.f43310e) {
            CharSequence charSequence = this.f43315j;
            this.f43318m = charSequence;
            this.f43319n = charSequence;
            return;
        }
        int i = 0;
        this.f43308c.setVisibility(0);
        String str = null;
        String str2 = "";
        int i2 = 0;
        while (i < this.f43310e) {
            int lineEnd = layoutM66234q.getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (i == this.f43310e - 1) {
                str = strSubstring;
            } else {
                str2 = str2 + strSubstring;
            }
            i++;
            i2 = lineEnd;
        }
        this.f43319n = this.f43315j;
        this.f43318m = m66237t(this.f43307b.getMeasuredWidth(), this.f43307b.getPaint(), str2, str);
    }

    /* JADX INFO: renamed from: v */
    public final void m66239v() {
        if (!m66233p()) {
            qkq0.m175383a("ExpandableTextContainerWithMaxHeight文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f43307b = (VText) getChildAt(0);
        VText vText = (VText) getChildAt(1);
        this.f43308c = vText;
        vText.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m66240w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (t0g0.m186868i(c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m66241x() {
        int height = this.f43307b.getHeight();
        m66232o(this.f43309d);
        this.f43307b.measure(View.MeasureSpec.makeMeasureSpec(this.f43307b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f43307b.getMeasuredHeight();
        m66232o(!this.f43309d);
        if (this.f43309d) {
            this.f43312g = new j760<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f43312g = new j760<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m66243z(this.f43309d);
        if (TextUtils.isEmpty(this.f43318m)) {
            m66238u();
        }
        m66231D();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m66242y(ValueAnimator valueAnimator) {
        m66229A(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: z */
    public final void m66243z(boolean z) {
        VText vText = this.f43308c;
        if (z) {
            vText.setText(this.f43317l);
        } else {
            vText.setText(this.f43316k);
        }
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43310e = 3;
        this.f43311f = 0L;
        this.f43314i = 0;
        this.f43318m = "";
        this.f43319n = "";
        m66236s(context, attributeSet);
    }

    public ExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43310e = 3;
        this.f43311f = 0L;
        this.f43314i = 0;
        this.f43318m = "";
        this.f43319n = "";
        m66236s(context, attributeSet);
    }
}
