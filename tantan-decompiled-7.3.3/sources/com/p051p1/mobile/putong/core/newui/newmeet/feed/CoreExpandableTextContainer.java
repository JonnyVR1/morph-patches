package com.p051p1.mobile.putong.core.newui.newmeet.feed;

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
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.R$string;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.a9g0;
import p153l.f9c0;
import p153l.g23;
import p153l.nhc0;
import p153l.qa00;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreExpandableTextContainer extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f26882a;

    /* JADX INFO: renamed from: b */
    public VText f26883b;

    /* JADX INFO: renamed from: c */
    public VText f26884c;

    /* JADX INFO: renamed from: d */
    public boolean f26885d;

    /* JADX INFO: renamed from: e */
    public boolean f26886e;

    /* JADX INFO: renamed from: f */
    public boolean f26887f;

    /* JADX INFO: renamed from: g */
    public int f26888g;

    /* JADX INFO: renamed from: h */
    public long f26889h;

    /* JADX INFO: renamed from: i */
    public Pair<Integer, Integer> f26890i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8351d f26891j;

    /* JADX INFO: renamed from: k */
    public boolean f26892k;

    /* JADX INFO: renamed from: l */
    public boolean f26893l;

    /* JADX INFO: renamed from: m */
    public String f26894m;

    /* JADX INFO: renamed from: n */
    public CharSequence f26895n;

    /* JADX INFO: renamed from: o */
    public CharSequence f26896o;

    /* JADX INFO: renamed from: p */
    public int f26897p;

    /* JADX INFO: renamed from: q */
    public String f26898q;

    /* JADX INFO: renamed from: r */
    public CustomTypefaceSpan f26899r;

    /* JADX INFO: renamed from: s */
    public int f26900s;

    /* JADX INFO: renamed from: t */
    public CharSequence f26901t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$a */
    public class C8348a extends ClickableSpan {
        public C8348a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.m43797K(((Integer) coreExpandableTextContainer.f26890i.first).intValue(), ((Integer) CoreExpandableTextContainer.this.f26890i.second).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CoreExpandableTextContainer.this.f26897p);
            textPaint.setFlags(33);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$b */
    public class C8349b extends ClickableSpan {
        public C8349b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.m43797K(((Integer) coreExpandableTextContainer.f26890i.first).intValue(), ((Integer) CoreExpandableTextContainer.this.f26890i.second).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CoreExpandableTextContainer.this.f26897p);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$c */
    public class C8350c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26904a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f26905b;

        public C8350c(int i, int i2) {
            this.f26904a = i;
            this.f26905b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CoreExpandableTextContainer.this.f26885d) {
                CoreExpandableTextContainer.this.m43798q(true);
            }
            CoreExpandableTextContainer.this.f26890i = new Pair(Integer.valueOf(this.f26904a), Integer.valueOf(this.f26905b));
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.f26885d = true ^ coreExpandableTextContainer.f26885d;
            if (NullChecker.m82486a(CoreExpandableTextContainer.this.f26891j)) {
                CoreExpandableTextContainer.this.f26891j.mo43808a(CoreExpandableTextContainer.this.f26885d);
            }
            boolean z = CoreExpandableTextContainer.this.f26887f;
            CoreExpandableTextContainer coreExpandableTextContainer2 = CoreExpandableTextContainer.this;
            if (z) {
                coreExpandableTextContainer2.m43792F(coreExpandableTextContainer2.f26885d);
            } else {
                coreExpandableTextContainer2.m43793G(coreExpandableTextContainer2.f26885d);
            }
            CoreExpandableTextContainer.this.setExpandViewHeight(-2.0f);
            CoreExpandableTextContainer.this.f26892k = false;
            CoreExpandableTextContainer.m43778g(CoreExpandableTextContainer.this);
            if (NullChecker.m82486a(null)) {
                CoreExpandableTextContainer.m43778g(CoreExpandableTextContainer.this);
                Pair unused = CoreExpandableTextContainer.this.f26890i;
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!CoreExpandableTextContainer.this.f26885d) {
                CoreExpandableTextContainer.this.m43798q(false);
            }
            CoreExpandableTextContainer.this.f26892k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$d */
    public interface InterfaceC8351d {
        /* JADX INFO: renamed from: a */
        void mo43808a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$e */
    public interface InterfaceC8352e {
    }

    public CoreExpandableTextContainer(@NonNull Context context) {
        super(context);
        this.f26886e = true;
        this.f26888g = 3;
        this.f26889h = 0L;
        this.f26897p = CoreModule.f18263b.getResources().getColor(f9c0.f97859d);
        this.f26900s = 0;
        m43803v(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ InterfaceC8352e m43778g(CoreExpandableTextContainer coreExpandableTextContainer) {
        coreExpandableTextContainer.getClass();
        return null;
    }

    private void getAnimMoveValue() {
        this.f26883b.post(new Runnable() { // from class: l.cq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f83074a.m43789C();
            }
        });
    }

    private int getLimitLineCount() {
        int i = this.f26888g;
        return i == Integer.MAX_VALUE ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandViewHeight(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26883b.getLayoutParams();
        marginLayoutParams.height = (int) f;
        this.f26883b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m43788A(String str) {
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

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m43789C() {
        int height = this.f26883b.getHeight();
        boolean z = this.f26885d;
        VText vText = this.f26883b;
        if (z) {
            vText.setMaxLines(getLimitLineCount());
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        this.f26883b.measure(View.MeasureSpec.makeMeasureSpec(this.f26883b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f26883b.getMeasuredHeight();
        boolean z2 = this.f26885d;
        VText vText2 = this.f26883b;
        if (z2) {
            vText2.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            vText2.setMaxLines(this.f26887f ? getLimitLineCount() : this.f26888g);
        }
        if (measuredHeight == height) {
            this.f26884c.setVisibility(8);
            return;
        }
        if (!this.f26887f) {
            this.f26884c.setVisibility(0);
        }
        this.f26890i = new Pair<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        m43793G(this.f26885d);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m43790D(ValueAnimator valueAnimator) {
        setExpandViewHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: E */
    public void m43791E() {
        if (this.f26886e) {
            getAnimMoveValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m43792F(boolean z) {
        this.f26883b.setText(z ? this.f26896o : this.f26895n);
    }

    /* JADX INFO: renamed from: G */
    public final void m43793G(boolean z) {
        VText vText = this.f26884c;
        if (z) {
            vText.setText(this.f26882a.getResources().getString(R$string.f15765a));
        } else {
            vText.setText(this.f26894m);
        }
    }

    /* JADX INFO: renamed from: H */
    public CoreExpandableTextContainer m43794H(boolean z) {
        this.f26885d = z;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public CoreExpandableTextContainer m43795I(CharSequence charSequence, String str, CustomTypefaceSpan customTypefaceSpan) {
        this.f26898q = str;
        this.f26899r = customTypefaceSpan;
        m43799r();
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return this;
        }
        if (TextUtils.isEmpty(str)) {
            this.f26883b.setText(charSequence);
            this.f26901t = charSequence;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(customTypefaceSpan, charSequence.toString().indexOf(str), charSequence.toString().indexOf(str) + str.length(), 33);
            this.f26883b.setText(spannableStringBuilder);
            this.f26901t = spannableStringBuilder;
        }
        if (this.f26887f) {
            m43804w();
            this.f26884c.setVisibility(8);
        } else if (this.f26886e) {
            boolean z = this.f26885d;
            VText vText = this.f26883b;
            if (z) {
                vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                vText.setMaxLines(this.f26888g);
            }
        } else {
            this.f26883b.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f26884c.setVisibility(8);
        }
        setVisibility(0);
        m43791E();
        return this;
    }

    /* JADX INFO: renamed from: J */
    public CoreExpandableTextContainer m43796J(InterfaceC8351d interfaceC8351d) {
        this.f26891j = interfaceC8351d;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final void m43797K(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bq8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f77862a.m43790D(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C8350c(i2, i));
        valueAnimatorOfFloat.setDuration(this.f26889h);
        valueAnimatorOfFloat.start();
    }

    @Nullable
    public VText getTextView() {
        return this.f26883b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f26884c.getVisibility() == 0) {
            m43797K(((Integer) this.f26890i.first).intValue(), ((Integer) this.f26890i.second).intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43807z();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f26892k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f26883b.getWidth();
        if (this.f26900s != width) {
            this.f26900s = width;
            if (TextUtils.isEmpty(this.f26901t) || !this.f26887f) {
                return;
            }
            m43804w();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m43798q(boolean z) {
        VText vText = this.f26883b;
        if (z) {
            vText.setMaxLines(this.f26887f ? getLimitLineCount() : this.f26888g);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43799r() {
        if (this.f26883b == null) {
            m43807z();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m43800s() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    public void setLineLimit(int i) {
        this.f26888g = i;
    }

    public void setOnSizeChangeEndListener(InterfaceC8352e interfaceC8352e) {
    }

    /* JADX INFO: renamed from: t */
    public final Layout m43801t(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f26883b.getPaint(), (this.f26900s - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f26883b.getLineSpacingMultiplier(), this.f26883b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: u */
    public final String m43802u(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f26894m;
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
            if (m43788A(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: v */
    public final void m43803v(Context context, AttributeSet attributeSet) {
        this.f26882a = context;
        this.f26890i = new Pair<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nhc0.f141977q);
            this.f26888g = typedArrayObtainStyledAttributes.getInt(nhc0.f141982v, 3);
            this.f26889h = typedArrayObtainStyledAttributes.getInt(nhc0.f141978r, 0);
            this.f26886e = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141983w, true);
            this.f26893l = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141980t, false);
            this.f26887f = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141981u, false);
            String string = typedArrayObtainStyledAttributes.getString(nhc0.f141979s);
            this.f26894m = string;
            if (TextUtils.isEmpty(string)) {
                this.f26894m = getContext().getResources().getString(com.p051p1.mobile.putong.core.member.R$string.f21375c);
            }
            getContext().getResources().getString(R$string.f15765a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m43804w() {
        if (this.f26900s <= 0) {
            return;
        }
        Layout layoutM43801t = m43801t(this.f26901t);
        int lineCount = layoutM43801t.getLineCount();
        String string = this.f26901t.toString();
        int i = this.f26888g;
        VText vText = this.f26883b;
        if (lineCount <= i) {
            vText.setText(this.f26901t);
            return;
        }
        m43805x(string, vText.getPaint(), this.f26883b.getWidth());
        int i2 = 0;
        String str = "";
        String str2 = null;
        int i3 = 0;
        while (i2 < this.f26888g) {
            int lineEnd = layoutM43801t.getLineEnd(i2);
            String strSubstring = string.substring(i3, lineEnd);
            if (i2 == this.f26888g - 1) {
                str2 = strSubstring;
            } else {
                str = str + strSubstring;
            }
            i2++;
            i3 = lineEnd;
        }
        m43806y(this.f26883b.getMeasuredWidth(), this.f26883b.getPaint(), str, str2);
        boolean z = this.f26885d;
        VText vText2 = this.f26883b;
        if (z) {
            vText2.setText(this.f26896o);
        } else {
            vText2.setText(this.f26895n);
        }
    }

    /* JADX INFO: renamed from: x */
    public final CharSequence m43805x(String str, TextPaint textPaint, int i) {
        String string = getContext().getResources().getString(com.p051p1.mobile.putong.core.member.R$string.f21372b);
        int length = string.length();
        int length2 = str.length() + string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) string);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C8349b(), i2, length2, 17);
        spannableStringBuilder.setSpan(new ImageSpan(this.f26882a, g23.m128587d(string, (int) textPaint.getTextSize(), i, this.f26897p, getResources().getColor(f9c0.f97866k), Typeface.DEFAULT_BOLD)), i2, length2, 33);
        if (!TextUtils.isEmpty(this.f26898q)) {
            spannableStringBuilder.setSpan(this.f26899r, spannableStringBuilder.toString().indexOf(this.f26898q), spannableStringBuilder.toString().indexOf(this.f26898q) + this.f26898q.length(), 33);
        }
        this.f26896o = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: y */
    public final CharSequence m43806y(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f26894m;
        String str4 = str + m43802u(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C8348a(), length2 - length, length2, 17);
        if (!TextUtils.isEmpty(this.f26898q)) {
            spannableStringBuilder.setSpan(this.f26899r, spannableStringBuilder.toString().indexOf(this.f26898q), spannableStringBuilder.toString().indexOf(this.f26898q) + this.f26898q.length(), 33);
        }
        this.f26895n = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public final void m43807z() {
        if (!m43800s()) {
            wtq0.m207906a("FeedExpandableTextContainer文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f26883b = (VText) getChildAt(0);
        this.f26884c = (VText) getChildAt(1);
        this.f26883b.setLineHeight(qa00.m175859d(21.0f));
        this.f26884c.setOnClickListener(this);
        if (this.f26893l) {
            this.f26883b.setOnClickListener(this);
        }
        this.f26884c.setVisibility(8);
    }

    public CoreExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26886e = true;
        this.f26888g = 3;
        this.f26889h = 0L;
        this.f26897p = CoreModule.f18263b.getResources().getColor(f9c0.f97859d);
        this.f26900s = 0;
        m43803v(context, attributeSet);
    }

    public CoreExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26886e = true;
        this.f26888g = 3;
        this.f26889h = 0L;
        this.f26897p = CoreModule.f18263b.getResources().getColor(f9c0.f97859d);
        this.f26900s = 0;
        m43803v(context, attributeSet);
    }
}
