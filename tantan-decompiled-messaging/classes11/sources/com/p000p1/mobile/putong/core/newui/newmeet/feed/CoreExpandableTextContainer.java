package com.p000p1.mobile.putong.core.newui.newmeet.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.R;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.h9c0;
import l.qkq0;
import l.t0g0;
import l.t100;
import l.z0c0;
import p009l.r13;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreExpandableTextContainer extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f4918a;

    /* JADX INFO: renamed from: b */
    public VText f4919b;

    /* JADX INFO: renamed from: c */
    public VText f4920c;

    /* JADX INFO: renamed from: d */
    public boolean f4921d;

    /* JADX INFO: renamed from: e */
    public boolean f4922e;

    /* JADX INFO: renamed from: f */
    public boolean f4923f;

    /* JADX INFO: renamed from: g */
    public int f4924g;

    /* JADX INFO: renamed from: h */
    public long f4925h;

    /* JADX INFO: renamed from: i */
    public Pair<Integer, Integer> f4926i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0364d f4927j;

    /* JADX INFO: renamed from: k */
    public boolean f4928k;

    /* JADX INFO: renamed from: l */
    public boolean f4929l;

    /* JADX INFO: renamed from: m */
    public String f4930m;

    /* JADX INFO: renamed from: n */
    public CharSequence f4931n;

    /* JADX INFO: renamed from: o */
    public CharSequence f4932o;

    /* JADX INFO: renamed from: p */
    public int f4933p;

    /* JADX INFO: renamed from: q */
    public String f4934q;

    /* JADX INFO: renamed from: r */
    public CustomTypefaceSpan f4935r;

    /* JADX INFO: renamed from: s */
    public int f4936s;

    /* JADX INFO: renamed from: t */
    public CharSequence f4937t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$a */
    public class C0361a extends ClickableSpan {
        public C0361a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.m6960K(((Integer) coreExpandableTextContainer.f4926i.first).intValue(), ((Integer) CoreExpandableTextContainer.this.f4926i.second).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CoreExpandableTextContainer.this.f4933p);
            textPaint.setFlags(33);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$b */
    public class C0362b extends ClickableSpan {
        public C0362b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.m6960K(((Integer) coreExpandableTextContainer.f4926i.first).intValue(), ((Integer) CoreExpandableTextContainer.this.f4926i.second).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CoreExpandableTextContainer.this.f4933p);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$c */
    public class C0363c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4940a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4941b;

        public C0363c(int i, int i2) {
            this.f4940a = i;
            this.f4941b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CoreExpandableTextContainer.this.f4921d) {
                CoreExpandableTextContainer.this.m6961q(true);
            }
            CoreExpandableTextContainer.this.f4926i = new Pair(Integer.valueOf(this.f4940a), Integer.valueOf(this.f4941b));
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.f4921d = true ^ coreExpandableTextContainer.f4921d;
            if (NullChecker.a(CoreExpandableTextContainer.this.f4927j)) {
                CoreExpandableTextContainer.this.f4927j.mo6971a(CoreExpandableTextContainer.this.f4921d);
            }
            boolean z = CoreExpandableTextContainer.this.f4923f;
            CoreExpandableTextContainer coreExpandableTextContainer2 = CoreExpandableTextContainer.this;
            if (z) {
                coreExpandableTextContainer2.m6955F(coreExpandableTextContainer2.f4921d);
            } else {
                coreExpandableTextContainer2.m6956G(coreExpandableTextContainer2.f4921d);
            }
            CoreExpandableTextContainer.this.setExpandViewHeight(-2.0f);
            CoreExpandableTextContainer.this.f4928k = false;
            CoreExpandableTextContainer.m6941g(CoreExpandableTextContainer.this);
            if (NullChecker.a((Object) null)) {
                CoreExpandableTextContainer.m6941g(CoreExpandableTextContainer.this);
                Pair unused = CoreExpandableTextContainer.this.f4926i;
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!CoreExpandableTextContainer.this.f4921d) {
                CoreExpandableTextContainer.this.m6961q(false);
            }
            CoreExpandableTextContainer.this.f4928k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$d */
    public interface InterfaceC0364d {
        /* JADX INFO: renamed from: a */
        void mo6971a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$e */
    public interface InterfaceC0365e {
    }

    public CoreExpandableTextContainer(@NonNull Context context) {
        super(context);
        this.f4922e = true;
        this.f4924g = 3;
        this.f4925h = 0L;
        this.f4933p = CoreModule.b.getResources().getColor(z0c0.d);
        this.f4936s = 0;
        m6966v(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ InterfaceC0365e m6941g(CoreExpandableTextContainer coreExpandableTextContainer) {
        coreExpandableTextContainer.getClass();
        return null;
    }

    private void getAnimMoveValue() {
        this.f4919b.post(new Runnable() { // from class: l.xo8
            @Override // java.lang.Runnable
            public final void run() {
                this.f22679a.m6952C();
            }
        });
    }

    private int getLimitLineCount() {
        int i = this.f4924g;
        return i == Integer.MAX_VALUE ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandViewHeight(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4919b.getLayoutParams();
        marginLayoutParams.height = (int) f;
        this.f4919b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m6951A(String str) {
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

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m6952C() {
        int height = this.f4919b.getHeight();
        boolean z = this.f4921d;
        VText vText = this.f4919b;
        if (z) {
            vText.setMaxLines(getLimitLineCount());
        } else {
            vText.setMaxLines(Integer.MAX_VALUE);
        }
        this.f4919b.measure(View.MeasureSpec.makeMeasureSpec(this.f4919b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f4919b.getMeasuredHeight();
        boolean z2 = this.f4921d;
        VText vText2 = this.f4919b;
        if (z2) {
            vText2.setMaxLines(Integer.MAX_VALUE);
        } else {
            vText2.setMaxLines(this.f4923f ? getLimitLineCount() : this.f4924g);
        }
        if (measuredHeight == height) {
            this.f4920c.setVisibility(8);
            return;
        }
        if (!this.f4923f) {
            this.f4920c.setVisibility(0);
        }
        this.f4926i = new Pair<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        m6956G(this.f4921d);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m6953D(ValueAnimator valueAnimator) {
        setExpandViewHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: E */
    public void m6954E() {
        if (this.f4922e) {
            getAnimMoveValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m6955F(boolean z) {
        this.f4919b.setText(z ? this.f4932o : this.f4931n);
    }

    /* JADX INFO: renamed from: G */
    public final void m6956G(boolean z) {
        VText vText = this.f4920c;
        if (z) {
            vText.setText(this.f4918a.getResources().getString(R.string.a));
        } else {
            vText.setText(this.f4930m);
        }
    }

    /* JADX INFO: renamed from: H */
    public CoreExpandableTextContainer m6957H(boolean z) {
        this.f4921d = z;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public CoreExpandableTextContainer m6958I(CharSequence charSequence, String str, CustomTypefaceSpan customTypefaceSpan) {
        this.f4934q = str;
        this.f4935r = customTypefaceSpan;
        m6962r();
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return this;
        }
        if (TextUtils.isEmpty(str)) {
            this.f4919b.setText(charSequence);
            this.f4937t = charSequence;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(customTypefaceSpan, charSequence.toString().indexOf(str), charSequence.toString().indexOf(str) + str.length(), 33);
            this.f4919b.setText(spannableStringBuilder);
            this.f4937t = spannableStringBuilder;
        }
        if (this.f4923f) {
            m6967w();
            this.f4920c.setVisibility(8);
        } else if (this.f4922e) {
            boolean z = this.f4921d;
            VText vText = this.f4919b;
            if (z) {
                vText.setMaxLines(Integer.MAX_VALUE);
            } else {
                vText.setMaxLines(this.f4924g);
            }
        } else {
            this.f4919b.setMaxLines(Integer.MAX_VALUE);
            this.f4920c.setVisibility(8);
        }
        setVisibility(0);
        m6954E();
        return this;
    }

    /* JADX INFO: renamed from: J */
    public CoreExpandableTextContainer m6959J(InterfaceC0364d interfaceC0364d) {
        this.f4927j = interfaceC0364d;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final void m6960K(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wo8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22233a.m6953D(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C0363c(i2, i));
        valueAnimatorOfFloat.setDuration(this.f4925h);
        valueAnimatorOfFloat.start();
    }

    @Nullable
    public VText getTextView() {
        return this.f4919b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f4920c.getVisibility() == 0) {
            m6960K(((Integer) this.f4926i.first).intValue(), ((Integer) this.f4926i.second).intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6970z();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4928k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f4919b.getWidth();
        if (this.f4936s != width) {
            this.f4936s = width;
            if (TextUtils.isEmpty(this.f4937t) || !this.f4923f) {
                return;
            }
            m6967w();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m6961q(boolean z) {
        VText vText = this.f4919b;
        if (z) {
            vText.setMaxLines(this.f4923f ? getLimitLineCount() : this.f4924g);
        } else {
            vText.setMaxLines(Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6962r() {
        if (this.f4919b == null) {
            m6970z();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m6963s() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    public void setLineLimit(int i) {
        this.f4924g = i;
    }

    public void setOnSizeChangeEndListener(InterfaceC0365e interfaceC0365e) {
    }

    /* JADX INFO: renamed from: t */
    public final Layout m6964t(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f4919b.getPaint(), (this.f4936s - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f4919b.getLineSpacingMultiplier(), this.f4919b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: u */
    public final String m6965u(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f4930m;
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
            if (m6951A(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: v */
    public final void m6966v(Context context, AttributeSet attributeSet) {
        this.f4918a = context;
        this.f4926i = new Pair<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h9c0.q);
            this.f4924g = typedArrayObtainStyledAttributes.getInt(h9c0.v, 3);
            this.f4925h = typedArrayObtainStyledAttributes.getInt(h9c0.r, 0);
            this.f4922e = typedArrayObtainStyledAttributes.getBoolean(h9c0.w, true);
            this.f4929l = typedArrayObtainStyledAttributes.getBoolean(h9c0.t, false);
            this.f4923f = typedArrayObtainStyledAttributes.getBoolean(h9c0.u, false);
            String string = typedArrayObtainStyledAttributes.getString(h9c0.s);
            this.f4930m = string;
            if (TextUtils.isEmpty(string)) {
                this.f4930m = getContext().getResources().getString(com.p1.mobile.putong.core.member.R.string.c);
            }
            getContext().getResources().getString(R.string.a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6967w() {
        if (this.f4936s <= 0) {
            return;
        }
        Layout layoutM6964t = m6964t(this.f4937t);
        int lineCount = layoutM6964t.getLineCount();
        String string = this.f4937t.toString();
        int i = this.f4924g;
        VText vText = this.f4919b;
        if (lineCount <= i) {
            vText.setText(this.f4937t);
            return;
        }
        m6968x(string, vText.getPaint(), this.f4919b.getWidth());
        int i2 = 0;
        String str = "";
        String str2 = null;
        int i3 = 0;
        while (i2 < this.f4924g) {
            int lineEnd = layoutM6964t.getLineEnd(i2);
            String strSubstring = string.substring(i3, lineEnd);
            if (i2 == this.f4924g - 1) {
                str2 = strSubstring;
            } else {
                str = str + strSubstring;
            }
            i2++;
            i3 = lineEnd;
        }
        m6969y(this.f4919b.getMeasuredWidth(), this.f4919b.getPaint(), str, str2);
        boolean z = this.f4921d;
        VText vText2 = this.f4919b;
        if (z) {
            vText2.setText(this.f4932o);
        } else {
            vText2.setText(this.f4931n);
        }
    }

    /* JADX INFO: renamed from: x */
    public final CharSequence m6968x(String str, TextPaint textPaint, int i) {
        String string = getContext().getResources().getString(com.p1.mobile.putong.core.member.R.string.b);
        int length = string.length();
        int length2 = str.length() + string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) string);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C0362b(), i2, length2, 17);
        spannableStringBuilder.setSpan(new ImageSpan(this.f4918a, r13.m21371d(string, (int) textPaint.getTextSize(), i, this.f4933p, getResources().getColor(z0c0.k), Typeface.DEFAULT_BOLD)), i2, length2, 33);
        if (!TextUtils.isEmpty(this.f4934q)) {
            spannableStringBuilder.setSpan(this.f4935r, spannableStringBuilder.toString().indexOf(this.f4934q), spannableStringBuilder.toString().indexOf(this.f4934q) + this.f4934q.length(), 33);
        }
        this.f4932o = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: y */
    public final CharSequence m6969y(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f4930m;
        String str4 = str + m6965u(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C0361a(), length2 - length, length2, 17);
        if (!TextUtils.isEmpty(this.f4934q)) {
            spannableStringBuilder.setSpan(this.f4935r, spannableStringBuilder.toString().indexOf(this.f4934q), spannableStringBuilder.toString().indexOf(this.f4934q) + this.f4934q.length(), 33);
        }
        this.f4931n = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public final void m6970z() {
        if (!m6963s()) {
            qkq0.a("FeedExpandableTextContainer文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f4919b = getChildAt(0);
        this.f4920c = getChildAt(1);
        this.f4919b.setLineHeight(t100.d(21.0f));
        this.f4920c.setOnClickListener(this);
        if (this.f4929l) {
            this.f4919b.setOnClickListener(this);
        }
        this.f4920c.setVisibility(8);
    }

    public CoreExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4922e = true;
        this.f4924g = 3;
        this.f4925h = 0L;
        this.f4933p = CoreModule.b.getResources().getColor(z0c0.d);
        this.f4936s = 0;
        m6966v(context, attributeSet);
    }

    public CoreExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4922e = true;
        this.f4924g = 3;
        this.f4925h = 0L;
        this.f4933p = CoreModule.b.getResources().getColor(z0c0.d);
        this.f4936s = 0;
        m6966v(context, attributeSet);
    }
}
