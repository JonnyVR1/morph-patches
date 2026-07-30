package com.p046p1.mobile.putong.core.view;

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
import com.p046p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.e9c0;
import p149l.j760;
import p149l.k2l;
import p149l.qkq0;
import p149l.t0g0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class VCoreExpandableTextContainerWithMaxHeight extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f38602a;

    /* JADX INFO: renamed from: b */
    public VText f38603b;

    /* JADX INFO: renamed from: c */
    public VText f38604c;

    /* JADX INFO: renamed from: d */
    public boolean f38605d;

    /* JADX INFO: renamed from: e */
    public int f38606e;

    /* JADX INFO: renamed from: f */
    public long f38607f;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f38608g;

    /* JADX INFO: renamed from: h */
    public boolean f38609h;

    /* JADX INFO: renamed from: i */
    public int f38610i;

    /* JADX INFO: renamed from: j */
    public CharSequence f38611j;

    /* JADX INFO: renamed from: k */
    public String f38612k;

    /* JADX INFO: renamed from: l */
    public String f38613l;

    /* JADX INFO: renamed from: m */
    public CharSequence f38614m;

    /* JADX INFO: renamed from: n */
    public CharSequence f38615n;

    /* JADX INFO: renamed from: o */
    public k2l f38616o;

    /* JADX INFO: renamed from: p */
    public int f38617p;

    /* JADX INFO: renamed from: q */
    public boolean f38618q;

    /* JADX INFO: renamed from: r */
    public MovementMethod f38619r;

    /* JADX INFO: renamed from: s */
    public CharSequence f38620s;

    /* JADX INFO: renamed from: t */
    public int f38621t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$a */
    public class C9164a extends ClickableSpan {
        public C9164a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (VCoreExpandableTextContainerWithMaxHeight.this.f38605d) {
                return;
            }
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight = VCoreExpandableTextContainerWithMaxHeight.this;
            vCoreExpandableTextContainerWithMaxHeight.m59573F(((Integer) vCoreExpandableTextContainerWithMaxHeight.f38608g.f116564a).intValue(), ((Integer) VCoreExpandableTextContainerWithMaxHeight.this.f38608g.f116565b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VCoreExpandableTextContainerWithMaxHeight.this.f38621t);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$b */
    public class C9165b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f38623a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f38624b;

        public C9165b(int i, int i2) {
            this.f38623a = i;
            this.f38624b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VCoreExpandableTextContainerWithMaxHeight.this.f38605d) {
                VCoreExpandableTextContainerWithMaxHeight.this.m59575r(true);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f38608g = new j760(Integer.valueOf(this.f38623a), Integer.valueOf(this.f38624b));
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight = VCoreExpandableTextContainerWithMaxHeight.this;
            vCoreExpandableTextContainerWithMaxHeight.f38605d = true ^ vCoreExpandableTextContainerWithMaxHeight.f38605d;
            VCoreExpandableTextContainerWithMaxHeight.m59559h(VCoreExpandableTextContainerWithMaxHeight.this);
            boolean zM81303a = NullChecker.m81303a(null);
            VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight2 = VCoreExpandableTextContainerWithMaxHeight.this;
            if (zM81303a) {
                VCoreExpandableTextContainerWithMaxHeight.m59559h(vCoreExpandableTextContainerWithMaxHeight2);
                boolean unused = VCoreExpandableTextContainerWithMaxHeight.this.f38605d;
                throw null;
            }
            vCoreExpandableTextContainerWithMaxHeight2.m59571D(vCoreExpandableTextContainerWithMaxHeight2.f38605d);
            if (!VCoreExpandableTextContainerWithMaxHeight.this.f38618q) {
                VCoreExpandableTextContainerWithMaxHeight.this.m59572E(-2.0f, false);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f38609h = false;
            if (VCoreExpandableTextContainerWithMaxHeight.this.f38617p > 0 && !VCoreExpandableTextContainerWithMaxHeight.this.f38605d) {
                VCoreExpandableTextContainerWithMaxHeight.this.f38603b.scrollTo(0, 0);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.m59574G();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!VCoreExpandableTextContainerWithMaxHeight.this.f38605d) {
                VCoreExpandableTextContainerWithMaxHeight.this.m59575r(false);
            }
            VCoreExpandableTextContainerWithMaxHeight.this.f38609h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.VCoreExpandableTextContainerWithMaxHeight$c */
    public interface InterfaceC9166c {
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context) {
        super(context);
        this.f38606e = 3;
        this.f38607f = 0L;
        this.f38610i = 0;
        this.f38614m = "";
        this.f38615n = "";
        this.f38621t = Color.parseColor("#80ffffff");
        m59579v(context, null);
    }

    private void getAnimMoveValue() {
        this.f38603b.post(new Runnable() { // from class: l.eok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92457a.m59569A();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC9166c m59559h(VCoreExpandableTextContainerWithMaxHeight vCoreExpandableTextContainerWithMaxHeight) {
        vCoreExpandableTextContainerWithMaxHeight.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m59569A() {
        int height = this.f38603b.getHeight();
        m59575r(this.f38605d);
        this.f38603b.measure(View.MeasureSpec.makeMeasureSpec(this.f38603b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f38603b.getMeasuredHeight();
        m59575r(!this.f38605d);
        if (this.f38605d) {
            this.f38608g = new j760<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f38608g = new j760<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m59571D(this.f38605d);
        if (TextUtils.isEmpty(this.f38614m)) {
            m59581x();
        }
        m59574G();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m59570C(ValueAnimator valueAnimator) {
        m59572E(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: D */
    public final void m59571D(boolean z) {
        VText vText = this.f38604c;
        if (z) {
            vText.setText(this.f38613l);
            xdl0.m208344M(this.f38604c, true);
        } else {
            vText.setText(this.f38612k);
            xdl0.m208344M(this.f38604c, false);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m59572E(float f, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f38603b.getLayoutParams();
        int i = (int) f;
        if (NullChecker.m81303a(this.f38619r)) {
            this.f38603b.setMovementMethod(this.f38619r);
        }
        int i2 = this.f38617p;
        if (i2 <= 0 || ((f <= i2 && f >= 0.0f) || !z)) {
            this.f38618q = false;
        } else {
            this.f38618q = true;
            this.f38603b.setMovementMethod(ScrollingMovementMethod.getInstance());
            i = i2;
        }
        marginLayoutParams.height = i;
        this.f38603b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: F */
    public final void m59573F(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fok0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f98577a.m59570C(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C9165b(i2, i));
        valueAnimatorOfFloat.setDuration(this.f38607f);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m59574G() {
        boolean z = this.f38605d;
        k2l k2lVar = this.f38616o;
        if (z) {
            k2lVar.m144306a(this.f38603b, this.f38615n);
        } else {
            k2lVar.m144306a(this.f38603b, this.f38614m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f38618q) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public VText getTextView() {
        return this.f38603b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f38604c.getVisibility() == 0) {
            m59573F(this.f38608g.f116564a.intValue(), this.f38608g.f116565b.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59582y();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f38609h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f38603b.getWidth();
        if (this.f38610i != width) {
            this.f38610i = width;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m59575r(boolean z) {
        VText vText = this.f38603b;
        if (z) {
            vText.setMaxLines(this.f38606e);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m59576s() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: t */
    public final Layout m59577t(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f38603b.getPaint(), (this.f38610i - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f38603b.getLineSpacingMultiplier(), this.f38603b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: u */
    public final String m59578u(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f38612k;
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
            if (m59583z(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: v */
    public final void m59579v(Context context, AttributeSet attributeSet) {
        this.f38602a = context;
        this.f38608g = new j760<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f89989Q1);
            this.f38606e = typedArrayObtainStyledAttributes.getInt(e9c0.f90004V1, 3);
            this.f38607f = typedArrayObtainStyledAttributes.getInt(e9c0.f89992R1, 0);
            String string = typedArrayObtainStyledAttributes.getString(e9c0.f89998T1);
            this.f38612k = string;
            if (TextUtils.isEmpty(string)) {
                this.f38612k = getContext().getResources().getString(R$string.f18684l);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(e9c0.f89995S1);
            this.f38613l = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f38613l = getContext().getResources().getString(R$string.f18531g);
            }
            this.f38617p = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90001U1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: w */
    public final CharSequence m59580w(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f38612k;
        String str4 = str + m59578u(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C9164a(), length2 - length, length2, 17);
        this.f38620s = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: x */
    public final void m59581x() {
        if (this.f38610i <= 0) {
            return;
        }
        Layout layoutM59577t = m59577t(this.f38611j);
        int lineCount = layoutM59577t.getLineCount();
        String string = this.f38611j.toString();
        if (lineCount <= this.f38606e) {
            CharSequence charSequence = this.f38611j;
            this.f38614m = charSequence;
            this.f38615n = charSequence;
            return;
        }
        xdl0.m208344M(this.f38604c, this.f38605d);
        int i = 0;
        String str = "";
        String str2 = null;
        int i2 = 0;
        while (i < this.f38606e) {
            int lineEnd = layoutM59577t.getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (i == this.f38606e - 1) {
                str2 = strSubstring;
            } else {
                str = str + strSubstring;
            }
            i++;
            i2 = lineEnd;
        }
        this.f38615n = this.f38611j;
        this.f38614m = m59580w(this.f38603b.getMeasuredWidth(), this.f38603b.getPaint(), str, str2);
    }

    /* JADX INFO: renamed from: y */
    public final void m59582y() {
        if (!m59576s()) {
            qkq0.m175383a("ExpandableTextContainerWithMaxHeight文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f38603b = (VText) getChildAt(0);
        VText vText = (VText) getChildAt(1);
        this.f38604c = vText;
        vText.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m59583z(String str) {
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

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38606e = 3;
        this.f38607f = 0L;
        this.f38610i = 0;
        this.f38614m = "";
        this.f38615n = "";
        this.f38621t = Color.parseColor("#80ffffff");
        m59579v(context, attributeSet);
    }

    public VCoreExpandableTextContainerWithMaxHeight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38606e = 3;
        this.f38607f = 0L;
        this.f38610i = 0;
        this.f38614m = "";
        this.f38615n = "";
        this.f38621t = Color.parseColor("#80ffffff");
        m59579v(context, attributeSet);
    }
}
