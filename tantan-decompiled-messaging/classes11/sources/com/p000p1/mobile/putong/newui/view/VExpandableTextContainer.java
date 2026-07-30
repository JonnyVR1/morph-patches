package com.p000p1.mobile.putong.newui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.d30;
import l.d9c0;
import l.j760;
import l.qkq0;
import l.t0g0;
import l.v0c0;
import p009l.k2l;
import p009l.r13;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VExpandableTextContainer extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f7782a;

    /* JADX INFO: renamed from: b */
    public VText f7783b;

    /* JADX INFO: renamed from: c */
    public VText f7784c;

    /* JADX INFO: renamed from: d */
    public boolean f7785d;

    /* JADX INFO: renamed from: e */
    public boolean f7786e;

    /* JADX INFO: renamed from: f */
    public boolean f7787f;

    /* JADX INFO: renamed from: g */
    public int f7788g;

    /* JADX INFO: renamed from: h */
    public long f7789h;

    /* JADX INFO: renamed from: i */
    public j760<Integer, Integer> f7790i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0492e f7791j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0493f f7792k;

    /* JADX INFO: renamed from: l */
    public boolean f7793l;

    /* JADX INFO: renamed from: m */
    public boolean f7794m;

    /* JADX INFO: renamed from: n */
    public boolean f7795n;

    /* JADX INFO: renamed from: o */
    public String f7796o;

    /* JADX INFO: renamed from: p */
    public String f7797p;

    /* JADX INFO: renamed from: q */
    public CharSequence f7798q;

    /* JADX INFO: renamed from: r */
    public CharSequence f7799r;

    /* JADX INFO: renamed from: s */
    public int f7800s;

    /* JADX INFO: renamed from: t */
    public d30 f7801t;

    /* JADX INFO: renamed from: u */
    public boolean f7802u;

    /* JADX INFO: renamed from: v */
    public k2l f7803v;

    /* JADX INFO: renamed from: w */
    public int f7804w;

    /* JADX INFO: renamed from: x */
    public int f7805x;

    /* JADX INFO: renamed from: y */
    public int f7806y;

    /* JADX INFO: renamed from: z */
    public CharSequence f7807z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$a */
    public class C0488a extends ClickableSpan {
        public C0488a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            boolean zA = NullChecker.a(VExpandableTextContainer.this.f7801t);
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            if (zA) {
                vExpandableTextContainer.f7801t.call();
            } else {
                vExpandableTextContainer.m9525R(((Integer) vExpandableTextContainer.f7790i.a).intValue(), ((Integer) VExpandableTextContainer.this.f7790i.b).intValue());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f7800s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$b */
    public class C0489b extends ClickableSpan {
        public C0489b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.m9525R(((Integer) vExpandableTextContainer.f7790i.a).intValue(), ((Integer) VExpandableTextContainer.this.f7790i.b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f7800s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$c */
    public class C0490c extends ClickableSpan {
        public C0490c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.m9525R(((Integer) vExpandableTextContainer.f7790i.a).intValue(), ((Integer) VExpandableTextContainer.this.f7790i.b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f7800s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$d */
    public class C0491d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f7811a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f7812b;

        public C0491d(int i, int i2) {
            this.f7811a = i;
            this.f7812b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VExpandableTextContainer.this.f7785d) {
                VExpandableTextContainer.this.m9526r(true);
            }
            VExpandableTextContainer.this.f7790i = new j760(Integer.valueOf(this.f7811a), Integer.valueOf(this.f7812b));
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.f7785d = true ^ vExpandableTextContainer.f7785d;
            if (NullChecker.a(VExpandableTextContainer.this.f7791j)) {
                VExpandableTextContainer.this.f7791j.m9535a(VExpandableTextContainer.this.f7785d);
            }
            boolean z = VExpandableTextContainer.this.f7787f;
            VExpandableTextContainer vExpandableTextContainer2 = VExpandableTextContainer.this;
            if (z) {
                vExpandableTextContainer2.m9516I(vExpandableTextContainer2.f7785d);
            } else {
                vExpandableTextContainer2.m9517J(vExpandableTextContainer2.f7785d);
            }
            VExpandableTextContainer.this.setExpandViewHeight(-2.0f);
            VExpandableTextContainer.this.f7793l = false;
            if (NullChecker.a(VExpandableTextContainer.this.f7792k)) {
                VExpandableTextContainer.this.f7792k.m9536a(VExpandableTextContainer.this.f7790i);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!VExpandableTextContainer.this.f7785d) {
                VExpandableTextContainer.this.m9526r(false);
            }
            VExpandableTextContainer.this.f7793l = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$e */
    public interface InterfaceC0492e {
        /* JADX INFO: renamed from: a */
        void m9535a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$f */
    public interface InterfaceC0493f {
        /* JADX INFO: renamed from: a */
        void m9536a(j760<Integer, Integer> j760Var);
    }

    public VExpandableTextContainer(@NonNull Context context) {
        super(context);
        this.f7786e = true;
        this.f7788g = 3;
        this.f7789h = 0L;
        this.f7800s = App.e.getResources().getColor(v0c0.h);
        this.f7804w = Integer.MAX_VALUE;
        this.f7805x = -1;
        this.f7806y = 0;
        m9531w(context, null);
    }

    private void getAnimMoveValue() {
        this.f7783b.post(new Runnable() { // from class: l.jok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15246a.m9513F();
            }
        });
    }

    private int getLimitLineCount() {
        int i = this.f7788g;
        return i == Integer.MAX_VALUE ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandViewHeight(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7783b.getLayoutParams();
        marginLayoutParams.height = (int) f;
        this.f7783b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A */
    public final CharSequence m9509A(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f7796o;
        String str4 = str + m9530v(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C0488a(), i2, length2, 17);
        if (this.f7802u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 17);
        }
        this.f7798q = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: C */
    public final void m9510C() {
        if (!m9528t()) {
            qkq0.a("FeedExpandableTextContainer文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f7783b = getChildAt(0);
        VText childAt = getChildAt(1);
        this.f7784c = childAt;
        childAt.setOnClickListener(this);
        if (this.f7794m) {
            this.f7783b.setOnClickListener(this);
        }
        this.f7784c.setVisibility(8);
    }

    /* JADX INFO: renamed from: D */
    public boolean m9511D() {
        return this.f7785d;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9512E(String str) {
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

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m9513F() {
        int height = this.f7783b.getHeight();
        boolean z = this.f7785d;
        VText vText = this.f7783b;
        if (z) {
            vText.setMaxLines(getLimitLineCount());
        } else {
            vText.setMaxLines(Integer.MAX_VALUE);
        }
        this.f7783b.measure(View.MeasureSpec.makeMeasureSpec(this.f7783b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f7783b.getMeasuredHeight();
        boolean z2 = this.f7785d;
        VText vText2 = this.f7783b;
        if (z2) {
            vText2.setMaxLines(Integer.MAX_VALUE);
        } else {
            vText2.setMaxLines(this.f7787f ? getLimitLineCount() : this.f7788g);
        }
        if (measuredHeight == height) {
            this.f7784c.setVisibility(8);
            return;
        }
        if (!this.f7787f) {
            this.f7784c.setVisibility(0);
        }
        if (this.f7785d) {
            this.f7790i = new j760<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f7790i = new j760<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m9517J(this.f7785d);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m9514G(ValueAnimator valueAnimator) {
        setExpandViewHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: H */
    public void m9515H() {
        if (this.f7786e) {
            getAnimMoveValue();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m9516I(boolean z) {
        this.f7803v.m17281a(this.f7783b, z ? this.f7799r : this.f7798q);
    }

    /* JADX INFO: renamed from: J */
    public final void m9517J(boolean z) {
        VText vText = this.f7784c;
        if (z) {
            vText.setText(this.f7797p);
        } else {
            vText.setText(this.f7796o);
        }
    }

    /* JADX INFO: renamed from: K */
    public VExpandableTextContainer m9518K(int i) {
        m9527s();
        this.f7800s = i;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public VExpandableTextContainer m9519L(boolean z) {
        this.f7785d = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public VExpandableTextContainer m9520M(CharSequence charSequence) {
        return m9521N(charSequence, new ArrayList());
    }

    /* JADX INFO: renamed from: N */
    public VExpandableTextContainer m9521N(CharSequence charSequence, List<HighlightData> list) {
        this.f7807z = charSequence;
        this.f7803v = new k2l();
        m9527s();
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return this;
        }
        this.f7803v.m17282b(this.f7783b, charSequence, list);
        if (this.f7787f) {
            m9532x();
            this.f7784c.setVisibility(8);
        } else if (this.f7786e) {
            boolean z = this.f7785d;
            VText vText = this.f7783b;
            if (z) {
                vText.setMaxLines(Integer.MAX_VALUE);
            } else {
                vText.setMaxLines(this.f7788g);
            }
        } else {
            this.f7783b.setMaxLines(Integer.MAX_VALUE);
            this.f7784c.setVisibility(8);
        }
        setVisibility(0);
        m9515H();
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final VExpandableTextContainer m9522O(CharSequence charSequence, HighlightData... highlightDataArr) {
        return (highlightDataArr == null || highlightDataArr.length == 0) ? m9520M(charSequence) : m9521N(charSequence, new ArrayList(Arrays.asList(highlightDataArr)));
    }

    /* JADX INFO: renamed from: P */
    public void m9523P(float f, float f2) {
        this.f7783b.setLineSpacing(f, f2);
    }

    /* JADX INFO: renamed from: Q */
    public VExpandableTextContainer m9524Q(InterfaceC0492e interfaceC0492e) {
        this.f7791j = interfaceC0492e;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final void m9525R(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kok0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f15786a.m9514G(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C0491d(i2, i));
        valueAnimatorOfFloat.setDuration(this.f7789h);
        valueAnimatorOfFloat.start();
    }

    @Nullable
    public VText getTextView() {
        return this.f7783b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7784c.getVisibility() == 0) {
            m9525R(((Integer) this.f7790i.a).intValue(), ((Integer) this.f7790i.b).intValue());
        } else {
            if (!this.f7795n || TextUtils.equals(this.f7807z, this.f7783b.getText())) {
                return;
            }
            m9525R(((Integer) this.f7790i.a).intValue(), ((Integer) this.f7790i.b).intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9510C();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7793l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f7783b.getWidth();
        if (this.f7806y != width) {
            this.f7806y = width;
            if (TextUtils.isEmpty(this.f7807z) || !this.f7787f) {
                return;
            }
            m9532x();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9526r(boolean z) {
        VText vText = this.f7783b;
        if (z) {
            vText.setMaxLines(this.f7787f ? getLimitLineCount() : this.f7788g);
        } else {
            vText.setMaxLines(Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9527s() {
        if (this.f7783b == null) {
            m9510C();
        }
    }

    public void setLineLimit(int i) {
        this.f7788g = i;
    }

    public void setNeedBoldExpand(boolean z) {
        this.f7802u = z;
    }

    public void setOnSizeChangeEndListener(InterfaceC0493f interfaceC0493f) {
        this.f7792k = interfaceC0493f;
    }

    /* JADX INFO: renamed from: t */
    public boolean m9528t() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: u */
    public final Layout m9529u(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f7783b.getPaint(), (this.f7806y - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f7783b.getLineSpacingMultiplier(), this.f7783b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: v */
    public final String m9530v(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f7796o;
        String strReplaceAll = str.replaceAll("\r|\n", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return str2;
        }
        if (this.f7802u) {
            f -= this.f7796o.length() * (textPaint.getTextSize() / 10.0f);
        }
        int length = strReplaceAll.length();
        String strConcat = null;
        while (length > 0) {
            strConcat = strReplaceAll.substring(0, length).concat(str2);
            if (textPaint.measureText(strConcat) <= f) {
                return strConcat;
            }
            if (m9512E(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: w */
    public final void m9531w(Context context, AttributeSet attributeSet) {
        this.f7782a = context;
        this.f7790i = new j760<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d9c0.V);
            this.f7788g = typedArrayObtainStyledAttributes.getInt(d9c0.e0, 3);
            this.f7789h = typedArrayObtainStyledAttributes.getInt(d9c0.W, 0);
            this.f7786e = typedArrayObtainStyledAttributes.getBoolean(d9c0.g0, true);
            this.f7794m = typedArrayObtainStyledAttributes.getBoolean(d9c0.c0, false);
            this.f7795n = typedArrayObtainStyledAttributes.getBoolean(d9c0.Y, false);
            this.f7787f = typedArrayObtainStyledAttributes.getBoolean(d9c0.d0, false);
            String string = typedArrayObtainStyledAttributes.getString(d9c0.a0);
            this.f7796o = string;
            if (TextUtils.isEmpty(string)) {
                this.f7796o = getContext().getResources().getString(R.string.e);
            }
            this.f7802u = typedArrayObtainStyledAttributes.getBoolean(d9c0.b0, false);
            this.f7797p = typedArrayObtainStyledAttributes.getString(d9c0.X);
            this.f7805x = typedArrayObtainStyledAttributes.getInt(d9c0.Z, -1);
            this.f7804w = typedArrayObtainStyledAttributes.getInt(d9c0.f0, Integer.MAX_VALUE);
            if (TextUtils.isEmpty(this.f7797p)) {
                this.f7797p = getContext().getResources().getString(R.string.c);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m9532x() {
        String str;
        if (this.f7806y <= 0) {
            return;
        }
        Layout layoutM9529u = m9529u(this.f7807z);
        int lineCount = layoutM9529u.getLineCount();
        String string = this.f7807z.toString();
        if (lineCount <= this.f7788g) {
            this.f7803v.m17281a(this.f7783b, this.f7807z);
            return;
        }
        String str2 = "";
        int i = 0;
        if (lineCount <= this.f7804w) {
            m9534z(string, this.f7783b.getPaint(), this.f7783b.getWidth());
            str = "";
        } else {
            String str3 = "";
            str = str3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f7804w) {
                int lineEnd = layoutM9529u.getLineEnd(i2);
                String strSubstring = string.substring(i3, lineEnd);
                if (i2 == this.f7804w - 1) {
                    str = strSubstring;
                } else {
                    str3 = str3 + strSubstring;
                }
                i2++;
                i3 = lineEnd;
            }
            m9533y(this.f7783b.getMeasuredWidth(), this.f7783b.getPaint(), str3, str);
        }
        int i4 = 0;
        while (true) {
            int i5 = this.f7805x;
            if (i5 == -1) {
                i5 = this.f7788g;
            }
            if (i >= i5) {
                break;
            }
            int lineEnd2 = layoutM9529u.getLineEnd(i);
            String strSubstring2 = string.substring(i4, lineEnd2);
            int i6 = this.f7805x;
            if (i6 == -1) {
                i6 = this.f7788g;
            }
            if (i == i6 - 1) {
                str = strSubstring2;
            } else {
                str2 = str2 + strSubstring2;
            }
            i++;
            i4 = lineEnd2;
        }
        m9509A(this.f7783b.getMeasuredWidth(), this.f7783b.getPaint(), str2, str);
        boolean z = this.f7785d;
        k2l k2lVar = this.f7803v;
        if (z) {
            k2lVar.m17281a(this.f7783b, this.f7799r);
        } else {
            k2lVar.m17281a(this.f7783b, this.f7798q);
        }
    }

    /* JADX INFO: renamed from: y */
    public final CharSequence m9533y(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f7797p;
        String str4 = str + m9530v(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C0489b(), i2, length2, 17);
        ImageSpan imageSpan = new ImageSpan(this.f7782a, r13.m21370c(str3, (int) textPaint.getTextSize(), i, this.f7800s, getResources().getColor(v0c0.o)));
        if (this.f7802u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 18);
        } else {
            spannableStringBuilder.setSpan(imageSpan, i2, length2, 33);
        }
        this.f7799r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public final CharSequence m9534z(String str, TextPaint textPaint, int i) {
        String str2 = this.f7797p;
        int length = str2.length();
        int length2 = str.length() + str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str2);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C0490c(), i2, length2, 17);
        ImageSpan imageSpan = new ImageSpan(this.f7782a, r13.m21370c(str2, (int) textPaint.getTextSize(), i, this.f7800s, getResources().getColor(v0c0.o)));
        if (this.f7802u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 18);
        } else {
            spannableStringBuilder.setSpan(imageSpan, i2, length2, 33);
        }
        this.f7799r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public VExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7786e = true;
        this.f7788g = 3;
        this.f7789h = 0L;
        this.f7800s = App.e.getResources().getColor(v0c0.h);
        this.f7804w = Integer.MAX_VALUE;
        this.f7805x = -1;
        this.f7806y = 0;
        m9531w(context, attributeSet);
    }

    public VExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7786e = true;
        this.f7788g = 3;
        this.f7789h = 0L;
        this.f7800s = App.e.getResources().getColor(v0c0.h);
        this.f7804w = Integer.MAX_VALUE;
        this.f7805x = -1;
        this.f7806y = 0;
        m9531w(context, attributeSet);
    }
}
