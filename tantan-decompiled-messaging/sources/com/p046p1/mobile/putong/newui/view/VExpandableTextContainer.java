package com.p046p1.mobile.putong.newui.view;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p147v.VText;
import p149l.d30;
import p149l.d9c0;
import p149l.j760;
import p149l.k2l;
import p149l.qkq0;
import p149l.r13;
import p149l.t0g0;
import p149l.v0c0;

/* JADX INFO: loaded from: classes11.dex */
public class VExpandableTextContainer extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public Context f54176a;

    /* JADX INFO: renamed from: b */
    public VText f54177b;

    /* JADX INFO: renamed from: c */
    public VText f54178c;

    /* JADX INFO: renamed from: d */
    public boolean f54179d;

    /* JADX INFO: renamed from: e */
    public boolean f54180e;

    /* JADX INFO: renamed from: f */
    public boolean f54181f;

    /* JADX INFO: renamed from: g */
    public int f54182g;

    /* JADX INFO: renamed from: h */
    public long f54183h;

    /* JADX INFO: renamed from: i */
    public j760<Integer, Integer> f54184i;

    /* JADX INFO: renamed from: j */
    public InterfaceC13090e f54185j;

    /* JADX INFO: renamed from: k */
    public InterfaceC13091f f54186k;

    /* JADX INFO: renamed from: l */
    public boolean f54187l;

    /* JADX INFO: renamed from: m */
    public boolean f54188m;

    /* JADX INFO: renamed from: n */
    public boolean f54189n;

    /* JADX INFO: renamed from: o */
    public String f54190o;

    /* JADX INFO: renamed from: p */
    public String f54191p;

    /* JADX INFO: renamed from: q */
    public CharSequence f54192q;

    /* JADX INFO: renamed from: r */
    public CharSequence f54193r;

    /* JADX INFO: renamed from: s */
    public int f54194s;

    /* JADX INFO: renamed from: t */
    public d30 f54195t;

    /* JADX INFO: renamed from: u */
    public boolean f54196u;

    /* JADX INFO: renamed from: v */
    public k2l f54197v;

    /* JADX INFO: renamed from: w */
    public int f54198w;

    /* JADX INFO: renamed from: x */
    public int f54199x;

    /* JADX INFO: renamed from: y */
    public int f54200y;

    /* JADX INFO: renamed from: z */
    public CharSequence f54201z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$a */
    public class C13086a extends ClickableSpan {
        public C13086a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            boolean zM81303a = NullChecker.m81303a(VExpandableTextContainer.this.f54195t);
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            if (zM81303a) {
                vExpandableTextContainer.f54195t.call();
            } else {
                vExpandableTextContainer.m79206R(((Integer) vExpandableTextContainer.f54184i.f116564a).intValue(), ((Integer) VExpandableTextContainer.this.f54184i.f116565b).intValue());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f54194s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$b */
    public class C13087b extends ClickableSpan {
        public C13087b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.m79206R(((Integer) vExpandableTextContainer.f54184i.f116564a).intValue(), ((Integer) VExpandableTextContainer.this.f54184i.f116565b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f54194s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$c */
    public class C13088c extends ClickableSpan {
        public C13088c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.m79206R(((Integer) vExpandableTextContainer.f54184i.f116564a).intValue(), ((Integer) VExpandableTextContainer.this.f54184i.f116565b).intValue());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(VExpandableTextContainer.this.f54194s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$d */
    public class C13089d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f54205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54206b;

        public C13089d(int i, int i2) {
            this.f54205a = i;
            this.f54206b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VExpandableTextContainer.this.f54179d) {
                VExpandableTextContainer.this.m79207r(true);
            }
            VExpandableTextContainer.this.f54184i = new j760(Integer.valueOf(this.f54205a), Integer.valueOf(this.f54206b));
            VExpandableTextContainer vExpandableTextContainer = VExpandableTextContainer.this;
            vExpandableTextContainer.f54179d = true ^ vExpandableTextContainer.f54179d;
            if (NullChecker.m81303a(VExpandableTextContainer.this.f54185j)) {
                VExpandableTextContainer.this.f54185j.mo79216a(VExpandableTextContainer.this.f54179d);
            }
            boolean z = VExpandableTextContainer.this.f54181f;
            VExpandableTextContainer vExpandableTextContainer2 = VExpandableTextContainer.this;
            if (z) {
                vExpandableTextContainer2.m79197I(vExpandableTextContainer2.f54179d);
            } else {
                vExpandableTextContainer2.m79198J(vExpandableTextContainer2.f54179d);
            }
            VExpandableTextContainer.this.setExpandViewHeight(-2.0f);
            VExpandableTextContainer.this.f54187l = false;
            if (NullChecker.m81303a(VExpandableTextContainer.this.f54186k)) {
                VExpandableTextContainer.this.f54186k.mo79217a(VExpandableTextContainer.this.f54184i);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (!VExpandableTextContainer.this.f54179d) {
                VExpandableTextContainer.this.m79207r(false);
            }
            VExpandableTextContainer.this.f54187l = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$e */
    public interface InterfaceC13090e {
        /* JADX INFO: renamed from: a */
        void mo79216a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.VExpandableTextContainer$f */
    public interface InterfaceC13091f {
        /* JADX INFO: renamed from: a */
        void mo79217a(j760<Integer, Integer> j760Var);
    }

    public VExpandableTextContainer(@NonNull Context context) {
        super(context);
        this.f54180e = true;
        this.f54182g = 3;
        this.f54183h = 0L;
        this.f54194s = App.f15369e.getResources().getColor(v0c0.f179101h);
        this.f54198w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f54199x = -1;
        this.f54200y = 0;
        m79212w(context, null);
    }

    private void getAnimMoveValue() {
        this.f54177b.post(new Runnable() { // from class: l.jok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118995a.m79194F();
            }
        });
    }

    private int getLimitLineCount() {
        int i = this.f54182g;
        return i == Integer.MAX_VALUE ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandViewHeight(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f54177b.getLayoutParams();
        marginLayoutParams.height = (int) f;
        this.f54177b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A */
    public final CharSequence m79190A(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f54190o;
        String str4 = str + m79211v(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C13086a(), i2, length2, 17);
        if (this.f54196u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 17);
        }
        this.f54192q = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: C */
    public final void m79191C() {
        if (!m79209t()) {
            qkq0.m175383a("FeedExpandableTextContainer文本伸缩控件的子view不合法。需要子View数量大于两个，并且都是TextView。");
            return;
        }
        this.f54177b = (VText) getChildAt(0);
        VText vText = (VText) getChildAt(1);
        this.f54178c = vText;
        vText.setOnClickListener(this);
        if (this.f54188m) {
            this.f54177b.setOnClickListener(this);
        }
        this.f54178c.setVisibility(8);
    }

    /* JADX INFO: renamed from: D */
    public boolean m79192D() {
        return this.f54179d;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m79193E(String str) {
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

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m79194F() {
        int height = this.f54177b.getHeight();
        boolean z = this.f54179d;
        VText vText = this.f54177b;
        if (z) {
            vText.setMaxLines(getLimitLineCount());
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        this.f54177b.measure(View.MeasureSpec.makeMeasureSpec(this.f54177b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f54177b.getMeasuredHeight();
        boolean z2 = this.f54179d;
        VText vText2 = this.f54177b;
        if (z2) {
            vText2.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            vText2.setMaxLines(this.f54181f ? getLimitLineCount() : this.f54182g);
        }
        if (measuredHeight == height) {
            this.f54178c.setVisibility(8);
            return;
        }
        if (!this.f54181f) {
            this.f54178c.setVisibility(0);
        }
        if (this.f54179d) {
            this.f54184i = new j760<>(Integer.valueOf(height), Integer.valueOf(measuredHeight));
        } else {
            this.f54184i = new j760<>(Integer.valueOf(Math.min(height, measuredHeight)), Integer.valueOf(Math.max(height, measuredHeight) + 5));
        }
        m79198J(this.f54179d);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m79195G(ValueAnimator valueAnimator) {
        setExpandViewHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: H */
    public void m79196H() {
        if (this.f54180e) {
            getAnimMoveValue();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m79197I(boolean z) {
        this.f54197v.m144306a(this.f54177b, z ? this.f54193r : this.f54192q);
    }

    /* JADX INFO: renamed from: J */
    public final void m79198J(boolean z) {
        VText vText = this.f54178c;
        if (z) {
            vText.setText(this.f54191p);
        } else {
            vText.setText(this.f54190o);
        }
    }

    /* JADX INFO: renamed from: K */
    public VExpandableTextContainer m79199K(int i) {
        m79208s();
        this.f54194s = i;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public VExpandableTextContainer m79200L(boolean z) {
        this.f54179d = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public VExpandableTextContainer m79201M(CharSequence charSequence) {
        return m79202N(charSequence, new ArrayList());
    }

    /* JADX INFO: renamed from: N */
    public VExpandableTextContainer m79202N(CharSequence charSequence, List<HighlightData> list) {
        this.f54201z = charSequence;
        this.f54197v = new k2l();
        m79208s();
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return this;
        }
        this.f54197v.m144307b(this.f54177b, charSequence, list);
        if (this.f54181f) {
            m79213x();
            this.f54178c.setVisibility(8);
        } else if (this.f54180e) {
            boolean z = this.f54179d;
            VText vText = this.f54177b;
            if (z) {
                vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                vText.setMaxLines(this.f54182g);
            }
        } else {
            this.f54177b.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f54178c.setVisibility(8);
        }
        setVisibility(0);
        m79196H();
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final VExpandableTextContainer m79203O(CharSequence charSequence, HighlightData... highlightDataArr) {
        return (highlightDataArr == null || highlightDataArr.length == 0) ? m79201M(charSequence) : m79202N(charSequence, new ArrayList(Arrays.asList(highlightDataArr)));
    }

    /* JADX INFO: renamed from: P */
    public void m79204P(float f, float f2) {
        this.f54177b.setLineSpacing(f, f2);
    }

    /* JADX INFO: renamed from: Q */
    public VExpandableTextContainer m79205Q(InterfaceC13090e interfaceC13090e) {
        this.f54185j = interfaceC13090e;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final void m79206R(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kok0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124047a.m79195G(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C13089d(i2, i));
        valueAnimatorOfFloat.setDuration(this.f54183h);
        valueAnimatorOfFloat.start();
    }

    @Nullable
    public VText getTextView() {
        return this.f54177b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f54178c.getVisibility() == 0) {
            m79206R(this.f54184i.f116564a.intValue(), this.f54184i.f116565b.intValue());
        } else {
            if (!this.f54189n || TextUtils.equals(this.f54201z, this.f54177b.getText())) {
                return;
            }
            m79206R(this.f54184i.f116564a.intValue(), this.f54184i.f116565b.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79191C();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f54187l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = this.f54177b.getWidth();
        if (this.f54200y != width) {
            this.f54200y = width;
            if (TextUtils.isEmpty(this.f54201z) || !this.f54181f) {
                return;
            }
            m79213x();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m79207r(boolean z) {
        VText vText = this.f54177b;
        if (z) {
            vText.setMaxLines(this.f54181f ? getLimitLineCount() : this.f54182g);
        } else {
            vText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m79208s() {
        if (this.f54177b == null) {
            m79191C();
        }
    }

    public void setLineLimit(int i) {
        this.f54182g = i;
    }

    public void setNeedBoldExpand(boolean z) {
        this.f54196u = z;
    }

    public void setOnSizeChangeEndListener(InterfaceC13091f interfaceC13091f) {
        this.f54186k = interfaceC13091f;
    }

    /* JADX INFO: renamed from: t */
    public boolean m79209t() {
        return getChildCount() > 1 && (getChildAt(0) instanceof VText) && (getChildAt(1) instanceof VText);
    }

    /* JADX INFO: renamed from: u */
    public final Layout m79210u(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f54177b.getPaint(), (this.f54200y - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f54177b.getLineSpacingMultiplier(), this.f54177b.getLineSpacingExtra(), false);
    }

    /* JADX INFO: renamed from: v */
    public final String m79211v(String str, TextPaint textPaint, float f) {
        String str2 = "..." + this.f54190o;
        String strReplaceAll = str.replaceAll("\r|\n", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return str2;
        }
        if (this.f54196u) {
            f -= this.f54190o.length() * (textPaint.getTextSize() / 10.0f);
        }
        int length = strReplaceAll.length();
        String strConcat = null;
        while (length > 0) {
            strConcat = strReplaceAll.substring(0, length).concat(str2);
            if (textPaint.measureText(strConcat) <= f) {
                return strConcat;
            }
            if (m79193E(strReplaceAll.substring(length - 1, length)) && (length = length - 1) == 1) {
                strConcat = str2;
            }
            length--;
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: w */
    public final void m79212w(Context context, AttributeSet attributeSet) {
        this.f54176a = context;
        this.f54184i = new j760<>(-1, -1);
        setOrientation(1);
        setVisibility(8);
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d9c0.f85024V);
            this.f54182g = typedArrayObtainStyledAttributes.getInt(d9c0.f85047e0, 3);
            this.f54183h = typedArrayObtainStyledAttributes.getInt(d9c0.f85026W, 0);
            this.f54180e = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85053g0, true);
            this.f54188m = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85041c0, false);
            this.f54189n = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85030Y, false);
            this.f54181f = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85044d0, false);
            String string = typedArrayObtainStyledAttributes.getString(d9c0.f85035a0);
            this.f54190o = string;
            if (TextUtils.isEmpty(string)) {
                this.f54190o = getContext().getResources().getString(R$string.f17425e);
            }
            this.f54196u = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85038b0, false);
            this.f54191p = typedArrayObtainStyledAttributes.getString(d9c0.f85028X);
            this.f54199x = typedArrayObtainStyledAttributes.getInt(d9c0.f85032Z, -1);
            this.f54198w = typedArrayObtainStyledAttributes.getInt(d9c0.f85050f0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (TextUtils.isEmpty(this.f54191p)) {
                this.f54191p = getContext().getResources().getString(R$string.f17415c);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m79213x() {
        String str;
        if (this.f54200y <= 0) {
            return;
        }
        Layout layoutM79210u = m79210u(this.f54201z);
        int lineCount = layoutM79210u.getLineCount();
        String string = this.f54201z.toString();
        if (lineCount <= this.f54182g) {
            this.f54197v.m144306a(this.f54177b, this.f54201z);
            return;
        }
        String str2 = "";
        int i = 0;
        if (lineCount <= this.f54198w) {
            m79215z(string, this.f54177b.getPaint(), this.f54177b.getWidth());
            str = "";
        } else {
            String str3 = "";
            str = str3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f54198w) {
                int lineEnd = layoutM79210u.getLineEnd(i2);
                String strSubstring = string.substring(i3, lineEnd);
                if (i2 == this.f54198w - 1) {
                    str = strSubstring;
                } else {
                    str3 = str3 + strSubstring;
                }
                i2++;
                i3 = lineEnd;
            }
            m79214y(this.f54177b.getMeasuredWidth(), this.f54177b.getPaint(), str3, str);
        }
        int i4 = 0;
        while (true) {
            int i5 = this.f54199x;
            if (i5 == -1) {
                i5 = this.f54182g;
            }
            if (i >= i5) {
                break;
            }
            int lineEnd2 = layoutM79210u.getLineEnd(i);
            String strSubstring2 = string.substring(i4, lineEnd2);
            int i6 = this.f54199x;
            if (i6 == -1) {
                i6 = this.f54182g;
            }
            if (i == i6 - 1) {
                str = strSubstring2;
            } else {
                str2 = str2 + strSubstring2;
            }
            i++;
            i4 = lineEnd2;
        }
        m79190A(this.f54177b.getMeasuredWidth(), this.f54177b.getPaint(), str2, str);
        boolean z = this.f54179d;
        k2l k2lVar = this.f54197v;
        if (z) {
            k2lVar.m144306a(this.f54177b, this.f54193r);
        } else {
            k2lVar.m144306a(this.f54177b, this.f54192q);
        }
    }

    /* JADX INFO: renamed from: y */
    public final CharSequence m79214y(int i, TextPaint textPaint, String str, String str2) {
        String str3 = this.f54191p;
        String str4 = str + m79211v(str2, textPaint, i);
        String strSubstring = str4.substring(0, (str4.length() - 3) - str3.length());
        int length = str3.length();
        int length2 = strSubstring.length() + 3 + str3.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strSubstring);
        spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilder.append((CharSequence) str3);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C13087b(), i2, length2, 17);
        ImageSpan imageSpan = new ImageSpan(this.f54176a, r13.m177438c(str3, (int) textPaint.getTextSize(), i, this.f54194s, getResources().getColor(v0c0.f179108o)));
        if (this.f54196u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 18);
        } else {
            spannableStringBuilder.setSpan(imageSpan, i2, length2, 33);
        }
        this.f54193r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public final CharSequence m79215z(String str, TextPaint textPaint, int i) {
        String str2 = this.f54191p;
        int length = str2.length();
        int length2 = str.length() + str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str2);
        int i2 = length2 - length;
        spannableStringBuilder.setSpan(new C13088c(), i2, length2, 17);
        ImageSpan imageSpan = new ImageSpan(this.f54176a, r13.m177438c(str2, (int) textPaint.getTextSize(), i, this.f54194s, getResources().getColor(v0c0.f179108o)));
        if (this.f54196u) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length2, 18);
        } else {
            spannableStringBuilder.setSpan(imageSpan, i2, length2, 33);
        }
        this.f54193r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public VExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54180e = true;
        this.f54182g = 3;
        this.f54183h = 0L;
        this.f54194s = App.f15369e.getResources().getColor(v0c0.f179101h);
        this.f54198w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f54199x = -1;
        this.f54200y = 0;
        m79212w(context, attributeSet);
    }

    public VExpandableTextContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54180e = true;
        this.f54182g = 3;
        this.f54183h = 0L;
        this.f54194s = App.f15369e.getResources().getColor(v0c0.f179101h);
        this.f54198w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f54199x = -1;
        this.f54200y = 0;
        m79212w(context, attributeSet);
    }
}
