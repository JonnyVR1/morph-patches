package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.fourthline.cling.model.Constants;
import p149l.c1c0;
import p149l.e16;
import p149l.k9c0;
import p149l.mqi0;
import p149l.t100;
import p149l.yij0;

/* JADX INFO: loaded from: classes4.dex */
public class DateEditTextNew extends AppCompatEditText {

    /* JADX INFO: renamed from: H */
    public static int f33462H = -1;

    /* JADX INFO: renamed from: I */
    public static int f33463I = -1;

    /* JADX INFO: renamed from: J */
    public static int f33464J = -1;

    /* JADX INFO: renamed from: A */
    public C8682a f33465A;

    /* JADX INFO: renamed from: B */
    public int f33466B;

    /* JADX INFO: renamed from: C */
    public Date f33467C;

    /* JADX INFO: renamed from: D */
    public Date f33468D;

    /* JADX INFO: renamed from: E */
    public CharSequence f33469E;

    /* JADX INFO: renamed from: F */
    public boolean f33470F;

    /* JADX INFO: renamed from: G */
    public float f33471G;

    /* JADX INFO: renamed from: a */
    public Paint f33472a;

    /* JADX INFO: renamed from: b */
    public Paint f33473b;

    /* JADX INFO: renamed from: c */
    public Paint f33474c;

    /* JADX INFO: renamed from: d */
    public RectF f33475d;

    /* JADX INFO: renamed from: e */
    public int f33476e;

    /* JADX INFO: renamed from: f */
    public int f33477f;

    /* JADX INFO: renamed from: g */
    public int f33478g;

    /* JADX INFO: renamed from: h */
    public int f33479h;

    /* JADX INFO: renamed from: i */
    public int f33480i;

    /* JADX INFO: renamed from: j */
    public boolean f33481j;

    /* JADX INFO: renamed from: k */
    public int f33482k;

    /* JADX INFO: renamed from: l */
    public int f33483l;

    /* JADX INFO: renamed from: m */
    public int f33484m;

    /* JADX INFO: renamed from: n */
    public int f33485n;

    /* JADX INFO: renamed from: o */
    public int f33486o;

    /* JADX INFO: renamed from: p */
    public int f33487p;

    /* JADX INFO: renamed from: q */
    public int f33488q;

    /* JADX INFO: renamed from: r */
    public boolean f33489r;

    /* JADX INFO: renamed from: s */
    public CharSequence f33490s;

    /* JADX INFO: renamed from: t */
    public CharSequence f33491t;

    /* JADX INFO: renamed from: u */
    public InterfaceC8676d f33492u;

    /* JADX INFO: renamed from: v */
    public Timer f33493v;

    /* JADX INFO: renamed from: w */
    public boolean f33494w;

    /* JADX INFO: renamed from: x */
    public int f33495x;

    /* JADX INFO: renamed from: y */
    public int f33496y;

    /* JADX INFO: renamed from: z */
    public int f33497z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$a */
    public class ActionModeCallbackC8673a implements ActionMode.Callback {
        public ActionModeCallbackC8673a() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$b */
    public class C8674b implements Animator.AnimatorListener {
        public C8674b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DateEditTextNew.this.f33494w = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$c */
    public class C8675c extends TimerTask {
        public C8675c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (DateEditTextNew.this.f33494w) {
                return;
            }
            DateEditTextNew dateEditTextNew = DateEditTextNew.this;
            dateEditTextNew.f33489r = !dateEditTextNew.f33489r;
            DateEditTextNew.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$d */
    public interface InterfaceC8676d {
        /* JADX INFO: renamed from: a */
        void mo51275a(int i);

        /* JADX INFO: renamed from: b */
        void mo51276b(int i);

        /* JADX INFO: renamed from: c */
        void mo51277c();

        /* JADX INFO: renamed from: d */
        void mo51278d(int i);
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33490s = "";
        this.f33491t = "";
        this.f33494w = false;
        this.f33495x = 0;
        this.f33497z = t100.m186890d(0.0f);
        this.f33466B = -1;
        this.f33467C = yij0.m214957m(18);
        this.f33468D = yij0.m214957m(100);
        this.f33469E = "";
        this.f33470F = false;
        this.f33465A = new C8682a(null, true);
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionModeCallbackC8673a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.f121963c);
        this.f33481j = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121980m, true);
        this.f33485n = typedArrayObtainStyledAttributes.getColor(k9c0.f121969f, e16.m114375c(getContext(), c1c0.f78246c));
        this.f33486o = typedArrayObtainStyledAttributes.getColor(k9c0.f121965d, e16.m114375c(getContext(), c1c0.f78244a));
        this.f33487p = typedArrayObtainStyledAttributes.getColor(k9c0.f121981n, e16.m114375c(getContext(), c1c0.f78246c));
        this.f33488q = typedArrayObtainStyledAttributes.getColor(k9c0.f121978k, e16.m114375c(getContext(), c1c0.f78247d));
        this.f33484m = typedArrayObtainStyledAttributes.getColor(k9c0.f121973h, e16.m114375c(getContext(), c1c0.f78246c));
        this.f33477f = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.f121967e, 0.0f);
        this.f33478g = typedArrayObtainStyledAttributes.getInt(k9c0.f121979l, 6);
        this.f33496y = typedArrayObtainStyledAttributes.getInt(k9c0.f121983p, 1);
        this.f33482k = typedArrayObtainStyledAttributes.getInt(k9c0.f121975i, 500);
        this.f33483l = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.f121977j, 2.0f);
        this.f33479h = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.f121971g, 5.0f);
        this.f33480i = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.f121982o, 28.0f);
        typedArrayObtainStyledAttributes.recycle();
        m51623n();
    }

    /* JADX INFO: renamed from: g */
    private TimerTask m51616g() {
        return new C8675c();
    }

    /* JADX INFO: renamed from: h */
    private boolean m51617h(int i, CharSequence charSequence) {
        Date dateM214957m = yij0.m214957m(0);
        if (NullChecker.m81303a(this.f33492u)) {
            int iM51621l = m51621l(f33462H, f33463I + 1);
            if ((charSequence.length() == 2 && i > iM51621l) || (charSequence.length() == 1 && i <= 3 && i > iM51621l / 10)) {
                this.f33492u.mo51278d(5);
                return false;
            }
            if (f33462H > 1900 && f33463I >= 0 && (charSequence.length() == 2 || (i > 3 && charSequence.length() == 1))) {
                dateM214957m.setYear(f33462H - Constants.UPNP_MULTICAST_PORT);
                dateM214957m.setMonth(f33463I);
                dateM214957m.setDate(i);
                if (dateM214957m.after(this.f33467C)) {
                    this.f33492u.mo51278d(this.f33470F ? 6 : 1);
                    return false;
                }
                if (dateM214957m.before(this.f33468D)) {
                    this.f33492u.mo51278d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f33478g) {
                f33464J = i;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private void m51618i(Canvas canvas) {
        int iMeasureText;
        float f;
        int length = this.f33490s.length() + 1;
        for (int i = 0; i < this.f33490s.length(); i++) {
            if (m51625q(this.f33490s.charAt(i))) {
                length = i;
                break;
            }
        }
        int i2 = this.f33478g;
        int i3 = this.f33477f;
        if (length > i2) {
            iMeasureText = (i3 * length) + ((int) this.f33473b.measureText(String.valueOf(this.f33490s)));
            f = this.f33471G;
        } else {
            iMeasureText = (i3 * length) + ((int) this.f33473b.measureText(String.valueOf(this.f33490s.subSequence(0, length))));
            f = this.f33471G;
        }
        int i4 = iMeasureText + ((int) f);
        int i5 = this.f33476e;
        int i6 = t100.f167260i;
        int i7 = (i5 / 2) - i6;
        int i8 = (i5 / 2) + i6;
        if (this.f33494w) {
            int i9 = this.f33495x;
            if (i9 != 0) {
                float f2 = i4 + i9;
                canvas.drawLine(f2, i7, f2, i8, this.f33474c);
                return;
            }
            return;
        }
        if (!this.f33489r && this.f33481j && hasFocus()) {
            float f3 = i4;
            canvas.drawLine(f3, i7, f3, i8, this.f33474c);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m51619j(Canvas canvas, CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            boolean zM51625q = m51625q(cCharAt);
            Paint paint = this.f33473b;
            if (zM51625q) {
                paint.setColor(this.f33488q);
                this.f33473b.setStyle(Paint.Style.FILL);
            } else {
                paint.setColor(this.f33487p);
                this.f33473b.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            int i2 = i + 1;
            canvas.drawText(String.valueOf(cCharAt), (this.f33477f * i2) + ((int) this.f33473b.measureText(String.valueOf(charSequence.subSequence(0, i)))) + ((int) this.f33471G), (int) ((this.f33476e / 2) - ((this.f33473b.descent() + this.f33473b.ascent()) / 2.0f)), this.f33473b);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m51620k(int i, CharSequence charSequence) {
        boolean z = charSequence.length() >= this.f33469E.length();
        this.f33469E = charSequence;
        if (z) {
            int i2 = this.f33496y;
            if (i2 == 1) {
                return m51632x(i, charSequence);
            }
            if (i2 == 2) {
                return m51628t(i, charSequence);
            }
            if (i2 == 3) {
                return m51617h(i, charSequence);
            }
        } else {
            m51630v();
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static int m51621l(int i, int i2) {
        if (i2 == 2) {
            if (i == -1) {
                return 29;
            }
        } else if (i2 == 0) {
            return 31;
        }
        return mqi0.m155947r(i, i2);
    }

    /* JADX INFO: renamed from: m */
    private String m51622m(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < this.f33478g; i2++) {
            if (i < charSequence.length()) {
                sb.append(charSequence.charAt(i));
                i++;
            } else {
                int i3 = this.f33496y;
                if (i3 == 1) {
                    sb.append("Y");
                } else if (i3 == 2) {
                    sb.append("M");
                } else if (i3 == 3) {
                    sb.append("D");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    private void m51623n() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f33478g)});
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f33486o);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f33473b = paint2;
        paint2.setAntiAlias(true);
        this.f33473b.setStrokeWidth(1.0f);
        this.f33473b.setTextSize(this.f33480i);
        Paint paint3 = new Paint();
        this.f33472a = paint3;
        paint3.setAntiAlias(true);
        this.f33472a.setColor(this.f33485n);
        this.f33472a.setStrokeWidth(this.f33479h);
        this.f33472a.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f33474c = paint4;
        paint4.setAntiAlias(true);
        this.f33474c.setColor(this.f33484m);
        this.f33474c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33474c.setStrokeWidth(this.f33483l);
        this.f33474c.setStrokeCap(Paint.Cap.ROUND);
        this.f33475d = new RectF();
        this.f33490s = m51622m("");
    }

    /* JADX INFO: renamed from: o */
    public static void m51624o(int i, int i2, int i3) {
        f33462H = i;
        f33463I = i2 - 1;
        f33464J = i3;
    }

    /* JADX INFO: renamed from: q */
    private boolean m51625q(char c) {
        return 'M' == c || 'D' == c || 'Y' == c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ boolean m51626r() {
        if (this.f33492u == null || getText() == null || getText().length() != 0) {
            return false;
        }
        this.f33492u.mo51277c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m51627s(ValueAnimator valueAnimator) {
        this.f33495x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    private boolean m51628t(int i, CharSequence charSequence) {
        Date dateM214957m = yij0.m214957m(0);
        if (NullChecker.m81303a(this.f33492u)) {
            if (i > 12) {
                this.f33492u.mo51278d(5);
                return false;
            }
            if (i > 1 || (i == 1 && charSequence.length() == 2)) {
                if (f33464J > 0 && m51621l(f33462H, i) < f33464J) {
                    this.f33492u.mo51278d(5);
                    return false;
                }
                if (f33462H == this.f33467C.getYear() + Constants.UPNP_MULTICAST_PORT && i > this.f33467C.getMonth() + 1) {
                    this.f33492u.mo51278d(this.f33470F ? 6 : 1);
                    return false;
                }
                if (f33462H == this.f33468D.getYear() + Constants.UPNP_MULTICAST_PORT && i < this.f33468D.getMonth() + 1) {
                    this.f33492u.mo51278d(4);
                    return false;
                }
            }
            if (f33464J > 0 && f33462H > 0 && (charSequence.length() == 2 || (i > 1 && charSequence.length() == 1))) {
                dateM214957m.setYear(f33462H - 1900);
                dateM214957m.setMonth(i == 0 ? 0 : i - 1);
                dateM214957m.setDate(f33464J);
                if (dateM214957m.after(this.f33467C)) {
                    this.f33492u.mo51278d(this.f33470F ? 6 : 1);
                    return false;
                }
                if (dateM214957m.before(this.f33468D)) {
                    this.f33492u.mo51278d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f33478g) {
                f33463I = i != 0 ? i - 1 : 0;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    private boolean m51629u(int i, int i2, int i3) {
        if (i < i2) {
            this.f33492u.mo51278d(4);
            return false;
        }
        if (i <= i3) {
            return true;
        }
        this.f33492u.mo51278d(this.f33470F ? 6 : 1);
        return false;
    }

    /* JADX INFO: renamed from: v */
    private void m51630v() {
        int i = this.f33496y;
        if (i == 1) {
            f33462H = -1;
        } else if (i == 2) {
            f33463I = -1;
        } else if (i == 3) {
            f33464J = -1;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m51631w() {
        setText(this.f33491t);
        if (this.f33494w) {
            return;
        }
        this.f33494w = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-3, 0, 3);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.setRepeatCount(2);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e7c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f89693a.m51627s(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C8674b());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: x */
    private boolean m51632x(int i, CharSequence charSequence) {
        Date dateM214957m = yij0.m214957m(0);
        if (NullChecker.m81303a(this.f33492u)) {
            if (i < 10) {
                return m51629u(i, 1, 2);
            }
            if (i < 100) {
                return m51629u(i, (this.f33468D.getYear() + Constants.UPNP_MULTICAST_PORT) / 100, (this.f33467C.getYear() + Constants.UPNP_MULTICAST_PORT) / 100);
            }
            if (i < 1000) {
                return m51629u(i, (this.f33468D.getYear() + Constants.UPNP_MULTICAST_PORT) / 10, (this.f33467C.getYear() + Constants.UPNP_MULTICAST_PORT) / 10);
            }
            if (f33464J > 0 && m51621l(i, f33463I + 1) < f33464J) {
                this.f33492u.mo51278d(5);
                return false;
            }
            if (i < this.f33468D.getYear() + Constants.UPNP_MULTICAST_PORT) {
                this.f33492u.mo51278d(4);
                return false;
            }
            if (i > this.f33467C.getYear() + Constants.UPNP_MULTICAST_PORT) {
                this.f33492u.mo51278d(this.f33470F ? 6 : 1);
                return false;
            }
            if (f33464J >= 0 && f33463I >= 0) {
                dateM214957m.setYear(i - 1900);
                dateM214957m.setMonth(f33463I);
                dateM214957m.setDate(f33464J);
                if (dateM214957m.after(this.f33467C)) {
                    this.f33492u.mo51278d(this.f33470F ? 6 : 1);
                    return false;
                }
                if (dateM214957m.before(this.f33468D)) {
                    this.f33492u.mo51278d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f33478g) {
                f33462H = i;
            }
        }
        return true;
    }

    public int getFinalNum() {
        return this.f33466B;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.m81303a(this.f33493v)) {
            this.f33493v = new Timer("DateEditTextNew-Core-Thread");
        }
        this.f33493v.scheduleAtFixedRate(m51616g(), 0L, this.f33482k);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f33465A.setTarget(super.onCreateInputConnection(editorInfo));
        this.f33465A.m51708a(new C8682a.a() { // from class: l.c7c
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.input.C8682a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo51709a() {
                return this.f79605a.m51626r();
            }
        });
        return this.f33465A;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33493v.cancel();
        this.f33493v = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f33471G = (getMeasuredWidth() - this.f33473b.measureText(String.valueOf(this.f33490s))) / 2.0f;
        m51619j(canvas, this.f33490s);
        m51618i(canvas);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (text == null || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f33476e = i2;
        this.f33475d.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            this.f33490s = m51622m("");
            this.f33491t = "";
            m51630v();
            invalidate();
            return;
        }
        try {
            this.f33466B = Integer.valueOf(charSequence.toString()).intValue();
        } catch (NumberFormatException unused) {
        }
        int i4 = this.f33466B;
        if (i4 != -1) {
            if (!m51620k(i4, charSequence) || "00".contentEquals(charSequence)) {
                if ("00".contentEquals(charSequence)) {
                    setText("0");
                    this.f33492u.mo51278d(5);
                } else {
                    this.f33492u.mo51278d(-1);
                }
                m51631w();
                return;
            }
            this.f33491t = charSequence.toString();
            this.f33490s = m51622m(charSequence.toString());
            int i5 = this.f33496y;
            if (i5 == 2) {
                if (this.f33466B <= 1 || charSequence.length() != 1) {
                    invalidate();
                } else {
                    String str = "0" + this.f33466B;
                    this.f33491t = str;
                    setText(str);
                }
            } else if (i5 == 3 && this.f33466B > 3 && charSequence.length() == 1) {
                String str2 = "0" + this.f33466B;
                this.f33491t = str2;
                setText(str2);
            } else {
                invalidate();
            }
            if (this.f33492u != null) {
                if (charSequence.length() == this.f33478g) {
                    this.f33492u.mo51276b(this.f33466B);
                }
                this.f33492u.mo51275a(this.f33466B);
            }
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m51633p() {
        return NullChecker.m81303a(getText()) && getText().length() == this.f33478g;
    }

    public void setNormalAge(int i) {
        this.f33470F = true;
        this.f33467C = yij0.m214957m(i);
    }

    public void setTextChangedListener(InterfaceC8676d interfaceC8676d) {
        this.f33492u = interfaceC8676d;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.f33487p = i;
        postInvalidate();
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateEditTextNew(Context context) {
        this(context, null);
    }
}
