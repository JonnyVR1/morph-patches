package com.p046p1.mobile.putong.core.newui.newmeet.feed;

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
import com.p046p1.mobile.android.R$string;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.h9c0;
import p149l.qkq0;
import p149l.r13;
import p149l.t0g0;
import p149l.t100;
import p149l.z0c0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreExpandableTextContainer extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f26140a;

    /* JADX INFO: renamed from: b */
    public VText f26141b;

    /* JADX INFO: renamed from: c */
    public VText f26142c;

    /* JADX INFO: renamed from: d */
    public boolean f26143d;

    /* JADX INFO: renamed from: e */
    public boolean f26144e;

    /* JADX INFO: renamed from: f */
    public boolean f26145f;

    /* JADX INFO: renamed from: g */
    public int f26146g;

    /* JADX INFO: renamed from: h */
    public long f26147h;

    /* JADX INFO: renamed from: i */
    public Pair<Integer, Integer> f26148i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8200d f26149j;

    /* JADX INFO: renamed from: k */
    public boolean f26150k;

    /* JADX INFO: renamed from: l */
    public boolean f26151l;

    /* JADX INFO: renamed from: m */
    public String f26152m;

    /* JADX INFO: renamed from: n */
    public CharSequence f26153n;

    /* JADX INFO: renamed from: o */
    public CharSequence f26154o;

    /* JADX INFO: renamed from: p */
    public int f26155p;

    /* JADX INFO: renamed from: q */
    public String f26156q;

    /* JADX INFO: renamed from: r */
    public CustomTypefaceSpan f26157r;

    /* JADX INFO: renamed from: s */
    public int f26158s;

    /* JADX INFO: renamed from: t */
    public CharSequence f26159t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$a */
    public class C8197a extends ClickableSpan {
        public C8197a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.m42786K(((Integer) coreExpandableTextContainer.f26148i.first).intValue(), ((Integer) CoreExpandableTextContainer.this.f26148i.second).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CoreExpandableTextContainer.this.f26155p);
            textPaint.setFlags(33);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$b */
    public class C8198b extends ClickableSpan {
        public C8198b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.m42786K(((Integer) coreExpandableTextContainer.f26148i.first).intValue(), ((Integer) CoreExpandableTextContainer.this.f26148i.second).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CoreExpandableTextContainer.this.f26155p);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$c */
    public class C8199c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26162a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f26163b;

        public C8199c(int i, int i2) {
            this.f26162a = i;
            this.f26163b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (CoreExpandableTextContainer.this.f26143d) {
                CoreExpandableTextContainer.this.m42787q(true);
            }
            CoreExpandableTextContainer.this.f26148i = new Pair(Integer.valueOf(this.f26162a), Integer.valueOf(this.f26163b));
            CoreExpandableTextContainer coreExpandableTextContainer = CoreExpandableTextContainer.this;
            coreExpandableTextContainer.f26143d = true ^ coreExpandableTextContainer.f26143d;
            if (NullChecker.m81303a(CoreExpandableTextContainer.this.f26149j)) {
                CoreExpandableTextContainer.this.f26149j.mo42797a(CoreExpandableTextContainer.this.f26143d);
            }
            boolean z = CoreExpandableTextContainer.this.f26145f;
            CoreExpandableTextContainer coreExpandableTextContainer2 = CoreExpandableTextContainer.this;
            if (z) {
                coreExpandableTextContainer2.m42781F(coreExpandableTextContainer2.f26143d);
            } else {
                coreExpandableTextContainer2.m42782G(coreExpandableTextContainer2.f26143d);
            }
            CoreExpandableTextContainer.this.setExpandViewHeight(-2.0f);
            CoreExpandableTextContainer.this.f26150k = false;
            CoreExpandableTextContainer.m42767g(CoreExpandableTextContainer.this);
            if (NullChecker.m81303a(null)) {
                CoreExpandableTextContainer.m42767g(CoreExpandableTextContainer.this);
                Pair unused = CoreExpandableTextContainer.this.f26148i;
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!CoreExpandableTextContainer.this.f26143d) {
                CoreExpandableTextContainer.this.m42787q(false);
            }
            CoreExpandableTextContainer.this.f26150k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$d */
    public interface InterfaceC8200d {
        /* JADX INFO: renamed from: a */
        void mo42797a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer$e */
    public interface InterfaceC8201e {
    }

    public CoreExpandableTextContainer(@NonNull Context context) {
        super(context);
        this.f26144e = true;
        this.f26146g = 3;
        this.f26147h = 0L;
        this.f26155p = CoreModule.f17544b.getResources().getColor(z0c0.f200976d);
        this.f26158s = 0;
        m42792v(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ InterfaceC8201e m42767g(CoreExpandableTextContainer coreExpandableTextContainer) {
        coreExpandableTextContainer.getClass();
        return null;
    }

    private void getAnimMoveValue() {
        this.f26141b.post(new Runnable() { // from class: l.xo8
            @Override // java.lang.Runnable
            public final void run() {
                this.f193789a.m42778C();
            }
        });
    }

    private int getLimitLineCount() {
        int i = this.f26146g;
        return i == Integer.MAX_VALUE ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandViewHeight(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26141b.getLayoutParams();
        marginLayoutParams.height = (int) f;
        this.f26141b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m42777A(String str) {
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

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m42778C() {
        int height = this.f26141b.getHeight();
        boolean z = this.f26143d;
        VText vText = this.f26141b;
        if (z) {
            vText.setMaxLines(getLimitLineCount());
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        this.f26141b.measure(View.MeasureSpec.makeMeasureSpec(this.f26141b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f26141b.getMeasuredHeight();
        boolean z2 = this.f26143d;
        VText vText2 = this.f26141b;
        if (z2) {
            vText2.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            vText2.setMaxLines(this.f26145f ? getLimitLineCount() : this.f26146g);
        }
        if (measuredHeight == height) {
            this.f26142c.setVisibility(8);
            return;
        }
        if (!this.f26145f) {
            this.f26142c.setVisibility(0);
        }
        this.f26148i = new Pair<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        m42782G(this.f26143d);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m42779D(ValueAnimator valueAnimator) {
        setExpandViewHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: E */
    public void m42780E() {
        if (this.f26144e) {
            getAnimMoveValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m42781F(boolean z) {
        this.f26141b.setText(z ? this.f26154o : this.f26153n);
    }

    /* JADX INFO: renamed from: G */
    public final void m42782G(boolean z) {
        VText vText = this.f26142c;
        if (z) {
            vText.setText(this.f26140a.getResources().getString(R$string.f15046a));
        } else {
            vText.setText(this.f26152m);
        }
    }

    /* JADX INFO: renamed from: H */
    public CoreExpandableTextContainer m42783H(boolean z) {
        this.f26143d = z;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public CoreExpandableTextContainer m42784I(CharSequence charSequence, String str, CustomTypefaceSpan customTypefaceSpan) {
        this.f26156q = str;
        this.f26157r = customTypefaceSpan;
        m42788r();
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return this;
        }
        if (TextUtils.isEmpty(str)) {
            this.f26141b.setText(charSequence);
            this.f26159t = charSequence;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(customTypefaceSpan, charSequence.toString().indexOf(str), charSequence.toString().indexOf(str) + str.length(), 33);
            this.f26141b.setText(spannableStringBuilder);
            this.f26159t = spannableStringBuilder;
        }
        if (this.f26145f) {
            m42793w();
            this.f26142c.setVisibility(8);
        } else if (this.f26144e) {
            boolean z = this.f26143d;
            VText vText = this.f26141b;
            if (z) {
                vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                vText.setMaxLines(this.f26146g);
            }
        } else {
            this.f26141b.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f26142c.setVisibility(8);
        }
        setVisibility(0);
        m42780E();
        return this;
    }

    /* JADX INFO: renamed from: J */
    public CoreExpandableTextContainer m42785J(InterfaceC8200d interfaceC8200d) {
        this.f26149j = interfaceC8200d;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final void m42786K(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wo8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f187386a.m42779D(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C8199c(i2, i));
        valueAnimatorOfFloat.setDuration(this.f26147h);
        valueAnimatorOfFloat.start();
    }

    @Nullable
    public VText getTextView() {
        return this.f26141b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f26142c.getVisibility() == 0) {
            m42786K(((Integer) this.f26148i.first).intValue(), ((Integer) this.f26148i.second).intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42796z();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f26150k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f26141b.getWidth();
        if (this.f26158s != width) {
            this.f26158s = width;
            if (TextUtils.isEmpty(this.f26159t) || !this.f26145f) {
                return;
            }
            m42793w();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m42787q(boolean z) {
        VText vText = this.f26141b;
        if (z) {
            vText.setMaxLines(this.f26145f ? getLimitLineCount() : this.f26146g);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m42788r() {
        if (this.f26141b == null) {
            m42796z();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m42789s() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    public void setLineLimit(int i) {
        this.f26146g = i;
    }

    public void setOnSizeChangeEndListener(InterfaceC8201e interfaceC8201e) {
    }

    /* JADX INFO: renamed from: t */
    public final Layout m42790t(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f26141b.getPaint(), (this.f26158s - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f26141b.getLineSpacingMultiplier(), this.f26141b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: u */
    public final String m42791u(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f26152m;
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
            if (m42777A(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: v */
    public final void m42792v(Context context, AttributeSet attributeSet) {
        this.f26140a = context;
        this.f26148i = new Pair<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h9c0.f106560q);
            this.f26146g = typedArrayObtainStyledAttributes.getInt(h9c0.f106565v, 3);
            this.f26147h = typedArrayObtainStyledAttributes.getInt(h9c0.f106561r, 0);
            this.f26144e = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106566w, true);
            this.f26151l = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106563t, false);
            this.f26145f = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106564u, false);
            String string = typedArrayObtainStyledAttributes.getString(h9c0.f106562s);
            this.f26152m = string;
            if (TextUtils.isEmpty(string)) {
                this.f26152m = getContext().getResources().getString(com.p046p1.mobile.putong.core.member.R$string.f20633c);
            }
            getContext().getResources().getString(R$string.f15046a);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m42793w() {
        if (this.f26158s <= 0) {
            return;
        }
        Layout layoutM42790t = m42790t(this.f26159t);
        int lineCount = layoutM42790t.getLineCount();
        String string = this.f26159t.toString();
        int i = this.f26146g;
        VText vText = this.f26141b;
        if (lineCount <= i) {
            vText.setText(this.f26159t);
            return;
        }
        m42794x(string, vText.getPaint(), this.f26141b.getWidth());
        int i2 = 0;
        String str = "";
        String str2 = null;
        int i3 = 0;
        while (i2 < this.f26146g) {
            int lineEnd = layoutM42790t.getLineEnd(i2);
            String strSubstring = string.substring(i3, lineEnd);
            if (i2 == this.f26146g - 1) {
                str2 = strSubstring;
            } else {
                str = str + strSubstring;
            }
            i2++;
            i3 = lineEnd;
        }
        m42795y(this.f26141b.getMeasuredWidth(), this.f26141b.getPaint(), str, str2);
        boolean z = this.f26143d;
        VText vText2 = this.f26141b;
        if (z) {
            vText2.setText(this.f26154o);
        } else {
            vText2.setText(this.f26153n);
        }
    }

    /* JADX INFO: renamed from: x */
    public final CharSequence m42794x(String str, TextPaint textPaint, int i) {
        String string = getContext().getResources().getString(com.p046p1.mobile.putong.core.member.R$string.f20630b);
        int length = string.length();
        int length2 = str.length() + string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) string);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C8198b(), i2, length2, 17);
        spannableStringBuilder.setSpan(new ImageSpan(this.f26140a, r13.m177439d(string, (int) textPaint.getTextSize(), i, this.f26155p, getResources().getColor(z0c0.f200983k), Typeface.DEFAULT_BOLD)), i2, length2, 33);
        if (!TextUtils.isEmpty(this.f26156q)) {
            spannableStringBuilder.setSpan(this.f26157r, spannableStringBuilder.toString().indexOf(this.f26156q), spannableStringBuilder.toString().indexOf(this.f26156q) + this.f26156q.length(), 33);
        }
        this.f26154o = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: y */
    public final CharSequence m42795y(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f26152m;
        String str4 = str + m42791u(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C8197a(), length2 - length, length2, 17);
        if (!TextUtils.isEmpty(this.f26156q)) {
            spannableStringBuilder.setSpan(this.f26157r, spannableStringBuilder.toString().indexOf(this.f26156q), spannableStringBuilder.toString().indexOf(this.f26156q) + this.f26156q.length(), 33);
        }
        this.f26153n = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public final void m42796z() {
        if (!m42789s()) {
            qkq0.m175383a("FeedExpandableTextContainer文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f26141b = (VText) getChildAt(0);
        this.f26142c = (VText) getChildAt(1);
        this.f26141b.setLineHeight(t100.m186890d(21.0f));
        this.f26142c.setOnClickListener(this);
        if (this.f26151l) {
            this.f26141b.setOnClickListener(this);
        }
        this.f26142c.setVisibility(8);
    }

    public CoreExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26144e = true;
        this.f26146g = 3;
        this.f26147h = 0L;
        this.f26155p = CoreModule.f17544b.getResources().getColor(z0c0.f200976d);
        this.f26158s = 0;
        m42792v(context, attributeSet);
    }

    public CoreExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26144e = true;
        this.f26146g = 3;
        this.f26147h = 0L;
        this.f26155p = CoreModule.f17544b.getResources().getColor(z0c0.f200976d);
        this.f26158s = 0;
        m42792v(context, attributeSet);
    }
}
