package com.p051p1.mobile.putong.newui.view;

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
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p151v.VText;
import p153l.a5l;
import p153l.a9g0;
import p153l.b9c0;
import p153l.g23;
import p153l.jhc0;
import p153l.pf60;
import p153l.wtq0;
import p153l.x20;

/* JADX INFO: loaded from: classes10.dex */
public class VExpandableTextContainer extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f55024a;

    /* JADX INFO: renamed from: b */
    public VText f55025b;

    /* JADX INFO: renamed from: c */
    public VText f55026c;

    /* JADX INFO: renamed from: d */
    public boolean f55027d;

    /* JADX INFO: renamed from: e */
    public boolean f55028e;

    /* JADX INFO: renamed from: f */
    public boolean f55029f;

    /* JADX INFO: renamed from: g */
    public int f55030g;

    /* JADX INFO: renamed from: h */
    public long f55031h;

    /* JADX INFO: renamed from: i */
    public pf60<Integer, Integer> f55032i;

    /* JADX INFO: renamed from: j */
    public InterfaceC13253e f55033j;

    /* JADX INFO: renamed from: k */
    public InterfaceC13254f f55034k;

    /* JADX INFO: renamed from: l */
    public boolean f55035l;

    /* JADX INFO: renamed from: m */
    public boolean f55036m;

    /* JADX INFO: renamed from: n */
    public boolean f55037n;

    /* JADX INFO: renamed from: o */
    public String f55038o;

    /* JADX INFO: renamed from: p */
    public String f55039p;

    /* JADX INFO: renamed from: q */
    public CharSequence f55040q;

    /* JADX INFO: renamed from: r */
    public CharSequence f55041r;

    /* JADX INFO: renamed from: s */
    public int f55042s;

    /* JADX INFO: renamed from: t */
    public x20 f55043t;

    /* JADX INFO: renamed from: u */
    public boolean f55044u;

    /* JADX INFO: renamed from: v */
    public a5l f55045v;

    /* JADX INFO: renamed from: w */
    public int f55046w;

    /* JADX INFO: renamed from: x */
    public int f55047x;

    /* JADX INFO: renamed from: y */
    public int f55048y;

    /* JADX INFO: renamed from: z */
    public CharSequence f55049z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$a */
    public class C13249a extends ClickableSpan {
        public C13249a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            boolean zM82486a = NullChecker.m82486a(VExpandableTextContainer.this.f55043t);
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            if (zM82486a) {
                vExpandableTextContainer.f55043t.call();
            } else {
                vExpandableTextContainer.m80389R(((Integer) vExpandableTextContainer.f55032i.f152156a).intValue(), ((Integer) VExpandableTextContainer.this.f55032i.f152157b).intValue());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f55042s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$b */
    public class C13250b extends ClickableSpan {
        public C13250b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.m80389R(((Integer) vExpandableTextContainer.f55032i.f152156a).intValue(), ((Integer) VExpandableTextContainer.this.f55032i.f152157b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f55042s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$c */
    public class C13251c extends ClickableSpan {
        public C13251c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.m80389R(((Integer) vExpandableTextContainer.f55032i.f152156a).intValue(), ((Integer) VExpandableTextContainer.this.f55032i.f152157b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f55042s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$d */
    public class C13252d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f55053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f55054b;

        public C13252d(int i, int i2) {
            this.f55053a = i;
            this.f55054b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VExpandableTextContainer.this.f55027d) {
                VExpandableTextContainer.this.m80390r(true);
            }
            VExpandableTextContainer.this.f55032i = new pf60(Integer.valueOf(this.f55053a), Integer.valueOf(this.f55054b));
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.f55027d = true ^ vExpandableTextContainer.f55027d;
            if (NullChecker.m82486a(VExpandableTextContainer.this.f55033j)) {
                VExpandableTextContainer.this.f55033j.mo80399a(VExpandableTextContainer.this.f55027d);
            }
            boolean z = VExpandableTextContainer.this.f55029f;
            VExpandableTextContainer vExpandableTextContainer2 = VExpandableTextContainer.this;
            if (z) {
                vExpandableTextContainer2.m80380I(vExpandableTextContainer2.f55027d);
            } else {
                vExpandableTextContainer2.m80381J(vExpandableTextContainer2.f55027d);
            }
            VExpandableTextContainer.this.setExpandViewHeight(-2.0f);
            VExpandableTextContainer.this.f55035l = false;
            if (NullChecker.m82486a(VExpandableTextContainer.this.f55034k)) {
                VExpandableTextContainer.this.f55034k.mo80400a(VExpandableTextContainer.this.f55032i);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!VExpandableTextContainer.this.f55027d) {
                VExpandableTextContainer.this.m80390r(false);
            }
            VExpandableTextContainer.this.f55035l = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$e */
    public interface InterfaceC13253e {
        /* JADX INFO: renamed from: a */
        void mo80399a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$f */
    public interface InterfaceC13254f {
        /* JADX INFO: renamed from: a */
        void mo80400a(pf60<Integer, Integer> pf60Var);
    }

    public VExpandableTextContainer(@NonNull Context context) {
        super(context);
        this.f55028e = true;
        this.f55030g = 3;
        this.f55031h = 0L;
        this.f55042s = App.f16088e.getResources().getColor(b9c0.f75562h);
        this.f55046w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f55047x = -1;
        this.f55048y = 0;
        m80395w(context, null);
    }

    private void getAnimMoveValue() {
        this.f55025b.post(new Runnable() { // from class: l.pxk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f154578a.m80377F();
            }
        });
    }

    private int getLimitLineCount() {
        int i = this.f55030g;
        return i == Integer.MAX_VALUE ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandViewHeight(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f55025b.getLayoutParams();
        marginLayoutParams.height = (int) f;
        this.f55025b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A */
    public final CharSequence m80373A(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f55038o;
        String str4 = str + m80394v(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C13249a(), i2, length2, 17);
        if (this.f55044u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 17);
        }
        this.f55040q = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: C */
    public final void m80374C() {
        if (!m80392t()) {
            wtq0.m207906a("FeedExpandableTextContainer文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f55025b = (VText) getChildAt(0);
        VText vText = (VText) getChildAt(1);
        this.f55026c = vText;
        vText.setOnClickListener(this);
        if (this.f55036m) {
            this.f55025b.setOnClickListener(this);
        }
        this.f55026c.setVisibility(8);
    }

    /* JADX INFO: renamed from: D */
    public boolean m80375D() {
        return this.f55027d;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m80376E(String str) {
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

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m80377F() {
        int height = this.f55025b.getHeight();
        boolean z = this.f55027d;
        VText vText = this.f55025b;
        if (z) {
            vText.setMaxLines(getLimitLineCount());
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        this.f55025b.measure(View.MeasureSpec.makeMeasureSpec(this.f55025b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f55025b.getMeasuredHeight();
        boolean z2 = this.f55027d;
        VText vText2 = this.f55025b;
        if (z2) {
            vText2.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            vText2.setMaxLines(this.f55029f ? getLimitLineCount() : this.f55030g);
        }
        if (measuredHeight == height) {
            this.f55026c.setVisibility(8);
            return;
        }
        if (!this.f55029f) {
            this.f55026c.setVisibility(0);
        }
        if (this.f55027d) {
            this.f55032i = new pf60<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f55032i = new pf60<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m80381J(this.f55027d);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m80378G(ValueAnimator valueAnimator) {
        setExpandViewHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: H */
    public void m80379H() {
        if (this.f55028e) {
            getAnimMoveValue();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m80380I(boolean z) {
        this.f55045v.m96236a(this.f55025b, z ? this.f55041r : this.f55040q);
    }

    /* JADX INFO: renamed from: J */
    public final void m80381J(boolean z) {
        VText vText = this.f55026c;
        if (z) {
            vText.setText(this.f55039p);
        } else {
            vText.setText(this.f55038o);
        }
    }

    /* JADX INFO: renamed from: K */
    public VExpandableTextContainer m80382K(int i) {
        m80391s();
        this.f55042s = i;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public VExpandableTextContainer m80383L(boolean z) {
        this.f55027d = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public VExpandableTextContainer m80384M(CharSequence charSequence) {
        return m80385N(charSequence, new ArrayList());
    }

    /* JADX INFO: renamed from: N */
    public VExpandableTextContainer m80385N(CharSequence charSequence, List<HighlightData> list) {
        this.f55049z = charSequence;
        this.f55045v = new a5l();
        m80391s();
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return this;
        }
        this.f55045v.m96237b(this.f55025b, charSequence, list);
        if (this.f55029f) {
            m80396x();
            this.f55026c.setVisibility(8);
        } else if (this.f55028e) {
            boolean z = this.f55027d;
            VText vText = this.f55025b;
            if (z) {
                vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                vText.setMaxLines(this.f55030g);
            }
        } else {
            this.f55025b.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f55026c.setVisibility(8);
        }
        setVisibility(0);
        m80379H();
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final VExpandableTextContainer m80386O(CharSequence charSequence, HighlightData... highlightDataArr) {
        return (highlightDataArr == null || highlightDataArr.length == 0) ? m80384M(charSequence) : m80385N(charSequence, new ArrayList(Arrays.asList(highlightDataArr)));
    }

    /* JADX INFO: renamed from: P */
    public void m80387P(float f, float f2) {
        this.f55025b.setLineSpacing(f, f2);
    }

    /* JADX INFO: renamed from: Q */
    public VExpandableTextContainer m80388Q(InterfaceC13253e interfaceC13253e) {
        this.f55033j = interfaceC13253e;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final void m80389R(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qxk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f160053a.m80378G(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C13252d(i2, i));
        valueAnimatorOfFloat.setDuration(this.f55031h);
        valueAnimatorOfFloat.start();
    }

    @Nullable
    public VText getTextView() {
        return this.f55025b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f55026c.getVisibility() == 0) {
            m80389R(this.f55032i.f152156a.intValue(), this.f55032i.f152157b.intValue());
        } else {
            if (!this.f55037n || TextUtils.equals(this.f55049z, this.f55025b.getText())) {
                return;
            }
            m80389R(this.f55032i.f152156a.intValue(), this.f55032i.f152157b.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80374C();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f55035l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f55025b.getWidth();
        if (this.f55048y != width) {
            this.f55048y = width;
            if (TextUtils.isEmpty(this.f55049z) || !this.f55029f) {
                return;
            }
            m80396x();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m80390r(boolean z) {
        VText vText = this.f55025b;
        if (z) {
            vText.setMaxLines(this.f55029f ? getLimitLineCount() : this.f55030g);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m80391s() {
        if (this.f55025b == null) {
            m80374C();
        }
    }

    public void setLineLimit(int i) {
        this.f55030g = i;
    }

    public void setNeedBoldExpand(boolean z) {
        this.f55044u = z;
    }

    public void setOnSizeChangeEndListener(InterfaceC13254f interfaceC13254f) {
        this.f55034k = interfaceC13254f;
    }

    /* JADX INFO: renamed from: t */
    public boolean m80392t() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: u */
    public final Layout m80393u(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f55025b.getPaint(), (this.f55048y - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f55025b.getLineSpacingMultiplier(), this.f55025b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: v */
    public final String m80394v(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f55038o;
        String strReplaceAll = str.replaceAll("\r|\n", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return str2;
        }
        if (this.f55044u) {
            f -= this.f55038o.length() * (textPaint.getTextSize() / 10.0f);
        }
        int length = strReplaceAll.length();
        String strConcat = null;
        while (length > 0) {
            strConcat = strReplaceAll.substring(0, length).concat(str2);
            if (textPaint.measureText(strConcat) <= f) {
                return strConcat;
            }
            if (m80376E(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: w */
    public final void m80395w(Context context, AttributeSet attributeSet) {
        this.f55024a = context;
        this.f55032i = new pf60<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jhc0.f120878V);
            this.f55030g = typedArrayObtainStyledAttributes.getInt(jhc0.f120901e0, 3);
            this.f55031h = typedArrayObtainStyledAttributes.getInt(jhc0.f120880W, 0);
            this.f55028e = typedArrayObtainStyledAttributes.getBoolean(jhc0.f120907g0, true);
            this.f55036m = typedArrayObtainStyledAttributes.getBoolean(jhc0.f120895c0, false);
            this.f55037n = typedArrayObtainStyledAttributes.getBoolean(jhc0.f120884Y, false);
            this.f55029f = typedArrayObtainStyledAttributes.getBoolean(jhc0.f120898d0, false);
            String string = typedArrayObtainStyledAttributes.getString(jhc0.f120889a0);
            this.f55038o = string;
            if (TextUtils.isEmpty(string)) {
                this.f55038o = getContext().getResources().getString(R$string.f18144e);
            }
            this.f55044u = typedArrayObtainStyledAttributes.getBoolean(jhc0.f120892b0, false);
            this.f55039p = typedArrayObtainStyledAttributes.getString(jhc0.f120882X);
            this.f55047x = typedArrayObtainStyledAttributes.getInt(jhc0.f120886Z, -1);
            this.f55046w = typedArrayObtainStyledAttributes.getInt(jhc0.f120904f0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (TextUtils.isEmpty(this.f55039p)) {
                this.f55039p = getContext().getResources().getString(R$string.f18134c);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m80396x() {
        String str;
        if (this.f55048y <= 0) {
            return;
        }
        Layout layoutM80393u = m80393u(this.f55049z);
        int lineCount = layoutM80393u.getLineCount();
        String string = this.f55049z.toString();
        if (lineCount <= this.f55030g) {
            this.f55045v.m96236a(this.f55025b, this.f55049z);
            return;
        }
        String str2 = "";
        int i = 0;
        if (lineCount <= this.f55046w) {
            m80398z(string, this.f55025b.getPaint(), this.f55025b.getWidth());
            str = "";
        } else {
            String str3 = "";
            str = str3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f55046w) {
                int lineEnd = layoutM80393u.getLineEnd(i2);
                String strSubstring = string.substring(i3, lineEnd);
                if (i2 == this.f55046w - 1) {
                    str = strSubstring;
                } else {
                    str3 = str3 + strSubstring;
                }
                i2++;
                i3 = lineEnd;
            }
            m80397y(this.f55025b.getMeasuredWidth(), this.f55025b.getPaint(), str3, str);
        }
        int i4 = 0;
        while (true) {
            int i5 = this.f55047x;
            if (i5 == -1) {
                i5 = this.f55030g;
            }
            if (i >= i5) {
                break;
            }
            int lineEnd2 = layoutM80393u.getLineEnd(i);
            String strSubstring2 = string.substring(i4, lineEnd2);
            int i6 = this.f55047x;
            if (i6 == -1) {
                i6 = this.f55030g;
            }
            if (i == i6 - 1) {
                str = strSubstring2;
            } else {
                str2 = str2 + strSubstring2;
            }
            i++;
            i4 = lineEnd2;
        }
        m80373A(this.f55025b.getMeasuredWidth(), this.f55025b.getPaint(), str2, str);
        boolean z = this.f55027d;
        a5l a5lVar = this.f55045v;
        if (z) {
            a5lVar.m96236a(this.f55025b, this.f55041r);
        } else {
            a5lVar.m96236a(this.f55025b, this.f55040q);
        }
    }

    /* JADX INFO: renamed from: y */
    public final CharSequence m80397y(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f55039p;
        String str4 = str + m80394v(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C13250b(), i2, length2, 17);
        ImageSpan imageSpan = new ImageSpan(this.f55024a, g23.m128586c(str3, (int) textPaint.getTextSize(), i, this.f55042s, getResources().getColor(b9c0.f75569o)));
        if (this.f55044u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 18);
        } else {
            spannableStringBuilder.setSpan(imageSpan, i2, length2, 33);
        }
        this.f55041r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public final CharSequence m80398z(String str, TextPaint textPaint, int i) {
        String str2 = this.f55039p;
        int length = str2.length();
        int length2 = str.length() + str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str2);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C13251c(), i2, length2, 17);
        ImageSpan imageSpan = new ImageSpan(this.f55024a, g23.m128586c(str2, (int) textPaint.getTextSize(), i, this.f55042s, getResources().getColor(b9c0.f75569o)));
        if (this.f55044u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 18);
        } else {
            spannableStringBuilder.setSpan(imageSpan, i2, length2, 33);
        }
        this.f55041r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public VExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55028e = true;
        this.f55030g = 3;
        this.f55031h = 0L;
        this.f55042s = App.f16088e.getResources().getColor(b9c0.f75562h);
        this.f55046w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f55047x = -1;
        this.f55048y = 0;
        m80395w(context, attributeSet);
    }

    public VExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55028e = true;
        this.f55030g = 3;
        this.f55031h = 0L;
        this.f55042s = App.f16088e.getResources().getColor(b9c0.f75562h);
        this.f55046w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f55047x = -1;
        this.f55048y = 0;
        m80395w(context, attributeSet);
    }
}
