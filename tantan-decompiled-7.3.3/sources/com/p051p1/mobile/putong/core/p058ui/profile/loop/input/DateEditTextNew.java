package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

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
import p153l.bsj0;
import p153l.j26;
import p153l.j9c0;
import p153l.pzi0;
import p153l.qa00;
import p153l.rhc0;

/* JADX INFO: loaded from: classes4.dex */
public class DateEditTextNew extends AppCompatEditText {

    /* JADX INFO: renamed from: H */
    public static int f34310H = -1;

    /* JADX INFO: renamed from: I */
    public static int f34311I = -1;

    /* JADX INFO: renamed from: J */
    public static int f34312J = -1;

    /* JADX INFO: renamed from: A */
    public C8845a f34313A;

    /* JADX INFO: renamed from: B */
    public int f34314B;

    /* JADX INFO: renamed from: C */
    public Date f34315C;

    /* JADX INFO: renamed from: D */
    public Date f34316D;

    /* JADX INFO: renamed from: E */
    public CharSequence f34317E;

    /* JADX INFO: renamed from: F */
    public boolean f34318F;

    /* JADX INFO: renamed from: G */
    public float f34319G;

    /* JADX INFO: renamed from: a */
    public Paint f34320a;

    /* JADX INFO: renamed from: b */
    public Paint f34321b;

    /* JADX INFO: renamed from: c */
    public Paint f34322c;

    /* JADX INFO: renamed from: d */
    public RectF f34323d;

    /* JADX INFO: renamed from: e */
    public int f34324e;

    /* JADX INFO: renamed from: f */
    public int f34325f;

    /* JADX INFO: renamed from: g */
    public int f34326g;

    /* JADX INFO: renamed from: h */
    public int f34327h;

    /* JADX INFO: renamed from: i */
    public int f34328i;

    /* JADX INFO: renamed from: j */
    public boolean f34329j;

    /* JADX INFO: renamed from: k */
    public int f34330k;

    /* JADX INFO: renamed from: l */
    public int f34331l;

    /* JADX INFO: renamed from: m */
    public int f34332m;

    /* JADX INFO: renamed from: n */
    public int f34333n;

    /* JADX INFO: renamed from: o */
    public int f34334o;

    /* JADX INFO: renamed from: p */
    public int f34335p;

    /* JADX INFO: renamed from: q */
    public int f34336q;

    /* JADX INFO: renamed from: r */
    public boolean f34337r;

    /* JADX INFO: renamed from: s */
    public CharSequence f34338s;

    /* JADX INFO: renamed from: t */
    public CharSequence f34339t;

    /* JADX INFO: renamed from: u */
    public InterfaceC8839d f34340u;

    /* JADX INFO: renamed from: v */
    public Timer f34341v;

    /* JADX INFO: renamed from: w */
    public boolean f34342w;

    /* JADX INFO: renamed from: x */
    public int f34343x;

    /* JADX INFO: renamed from: y */
    public int f34344y;

    /* JADX INFO: renamed from: z */
    public int f34345z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$a */
    public class ActionModeCallbackC8836a implements ActionMode.Callback {
        public ActionModeCallbackC8836a() {
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
    public class C8837b implements Animator.AnimatorListener {
        public C8837b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DateEditTextNew.this.f34342w = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$c */
    public class C8838c extends TimerTask {
        public C8838c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (DateEditTextNew.this.f34342w) {
                return;
            }
            DateEditTextNew dateEditTextNew = DateEditTextNew.this;
            dateEditTextNew.f34337r = !dateEditTextNew.f34337r;
            DateEditTextNew.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$d */
    public interface InterfaceC8839d {
        /* JADX INFO: renamed from: a */
        void mo52458a(int i);

        /* JADX INFO: renamed from: b */
        void mo52459b(int i);

        /* JADX INFO: renamed from: c */
        void mo52460c();

        /* JADX INFO: renamed from: d */
        void mo52461d(int i);
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34338s = "";
        this.f34339t = "";
        this.f34342w = false;
        this.f34343x = 0;
        this.f34345z = qa00.m175859d(0.0f);
        this.f34314B = -1;
        this.f34315C = bsj0.m106277m(18);
        this.f34316D = bsj0.m106277m(100);
        this.f34317E = "";
        this.f34318F = false;
        this.f34313A = new C8845a(null, true);
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionModeCallbackC8836a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhc0.f163124c);
        this.f34329j = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163141m, true);
        this.f34333n = typedArrayObtainStyledAttributes.getColor(rhc0.f163130f, j26.m143190c(getContext(), j9c0.f118866c));
        this.f34334o = typedArrayObtainStyledAttributes.getColor(rhc0.f163126d, j26.m143190c(getContext(), j9c0.f118864a));
        this.f34335p = typedArrayObtainStyledAttributes.getColor(rhc0.f163142n, j26.m143190c(getContext(), j9c0.f118866c));
        this.f34336q = typedArrayObtainStyledAttributes.getColor(rhc0.f163139k, j26.m143190c(getContext(), j9c0.f118867d));
        this.f34332m = typedArrayObtainStyledAttributes.getColor(rhc0.f163134h, j26.m143190c(getContext(), j9c0.f118866c));
        this.f34325f = (int) typedArrayObtainStyledAttributes.getDimension(rhc0.f163128e, 0.0f);
        this.f34326g = typedArrayObtainStyledAttributes.getInt(rhc0.f163140l, 6);
        this.f34344y = typedArrayObtainStyledAttributes.getInt(rhc0.f163144p, 1);
        this.f34330k = typedArrayObtainStyledAttributes.getInt(rhc0.f163136i, 500);
        this.f34331l = (int) typedArrayObtainStyledAttributes.getDimension(rhc0.f163138j, 2.0f);
        this.f34327h = (int) typedArrayObtainStyledAttributes.getDimension(rhc0.f163132g, 5.0f);
        this.f34328i = (int) typedArrayObtainStyledAttributes.getDimension(rhc0.f163143o, 28.0f);
        typedArrayObtainStyledAttributes.recycle();
        m52806n();
    }

    /* JADX INFO: renamed from: g */
    private TimerTask m52799g() {
        return new C8838c();
    }

    /* JADX INFO: renamed from: h */
    private boolean m52800h(int i, CharSequence charSequence) {
        Date dateM106277m = bsj0.m106277m(0);
        if (NullChecker.m82486a(this.f34340u)) {
            int iM52804l = m52804l(f34310H, f34311I + 1);
            if ((charSequence.length() == 2 && i > iM52804l) || (charSequence.length() == 1 && i <= 3 && i > iM52804l / 10)) {
                this.f34340u.mo52461d(5);
                return false;
            }
            if (f34310H > 1900 && f34311I >= 0 && (charSequence.length() == 2 || (i > 3 && charSequence.length() == 1))) {
                dateM106277m.setYear(f34310H - Constants.UPNP_MULTICAST_PORT);
                dateM106277m.setMonth(f34311I);
                dateM106277m.setDate(i);
                if (dateM106277m.after(this.f34315C)) {
                    this.f34340u.mo52461d(this.f34318F ? 6 : 1);
                    return false;
                }
                if (dateM106277m.before(this.f34316D)) {
                    this.f34340u.mo52461d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f34326g) {
                f34312J = i;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private void m52801i(Canvas canvas) {
        int iMeasureText;
        float f;
        int length = this.f34338s.length() + 1;
        for (int i = 0; i < this.f34338s.length(); i++) {
            if (m52808q(this.f34338s.charAt(i))) {
                length = i;
                break;
            }
        }
        int i2 = this.f34326g;
        int i3 = this.f34325f;
        if (length > i2) {
            iMeasureText = (i3 * length) + ((int) this.f34321b.measureText(String.valueOf(this.f34338s)));
            f = this.f34319G;
        } else {
            iMeasureText = (i3 * length) + ((int) this.f34321b.measureText(String.valueOf(this.f34338s.subSequence(0, length))));
            f = this.f34319G;
        }
        int i4 = iMeasureText + ((int) f);
        int i5 = this.f34324e;
        int i6 = qa00.f156322i;
        int i7 = (i5 / 2) - i6;
        int i8 = (i5 / 2) + i6;
        if (this.f34342w) {
            int i9 = this.f34343x;
            if (i9 != 0) {
                float f2 = i4 + i9;
                canvas.drawLine(f2, i7, f2, i8, this.f34322c);
                return;
            }
            return;
        }
        if (!this.f34337r && this.f34329j && hasFocus()) {
            float f3 = i4;
            canvas.drawLine(f3, i7, f3, i8, this.f34322c);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m52802j(Canvas canvas, CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            boolean zM52808q = m52808q(cCharAt);
            Paint paint = this.f34321b;
            if (zM52808q) {
                paint.setColor(this.f34336q);
                this.f34321b.setStyle(Paint.Style.FILL);
            } else {
                paint.setColor(this.f34335p);
                this.f34321b.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            int i2 = i + 1;
            canvas.drawText(String.valueOf(cCharAt), (this.f34325f * i2) + ((int) this.f34321b.measureText(String.valueOf(charSequence.subSequence(0, i)))) + ((int) this.f34319G), (int) ((this.f34324e / 2) - ((this.f34321b.descent() + this.f34321b.ascent()) / 2.0f)), this.f34321b);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m52803k(int i, CharSequence charSequence) {
        boolean z = charSequence.length() >= this.f34317E.length();
        this.f34317E = charSequence;
        if (z) {
            int i2 = this.f34344y;
            if (i2 == 1) {
                return m52815x(i, charSequence);
            }
            if (i2 == 2) {
                return m52811t(i, charSequence);
            }
            if (i2 == 3) {
                return m52800h(i, charSequence);
            }
        } else {
            m52813v();
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static int m52804l(int i, int i2) {
        if (i2 == 2) {
            if (i == -1) {
                return 29;
            }
        } else if (i2 == 0) {
            return 31;
        }
        return pzi0.m174457r(i, i2);
    }

    /* JADX INFO: renamed from: m */
    private String m52805m(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < this.f34326g; i2++) {
            if (i < charSequence.length()) {
                sb.append(charSequence.charAt(i));
                i++;
            } else {
                int i3 = this.f34344y;
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
    private void m52806n() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f34326g)});
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f34334o);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f34321b = paint2;
        paint2.setAntiAlias(true);
        this.f34321b.setStrokeWidth(1.0f);
        this.f34321b.setTextSize(this.f34328i);
        Paint paint3 = new Paint();
        this.f34320a = paint3;
        paint3.setAntiAlias(true);
        this.f34320a.setColor(this.f34333n);
        this.f34320a.setStrokeWidth(this.f34327h);
        this.f34320a.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f34322c = paint4;
        paint4.setAntiAlias(true);
        this.f34322c.setColor(this.f34332m);
        this.f34322c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f34322c.setStrokeWidth(this.f34331l);
        this.f34322c.setStrokeCap(Paint.Cap.ROUND);
        this.f34323d = new RectF();
        this.f34338s = m52805m("");
    }

    /* JADX INFO: renamed from: o */
    public static void m52807o(int i, int i2, int i3) {
        f34310H = i;
        f34311I = i2 - 1;
        f34312J = i3;
    }

    /* JADX INFO: renamed from: q */
    private boolean m52808q(char c) {
        return 'M' == c || 'D' == c || 'Y' == c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ boolean m52809r() {
        if (this.f34340u == null || getText() == null || getText().length() != 0) {
            return false;
        }
        this.f34340u.mo52460c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m52810s(ValueAnimator valueAnimator) {
        this.f34343x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    private boolean m52811t(int i, CharSequence charSequence) {
        Date dateM106277m = bsj0.m106277m(0);
        if (NullChecker.m82486a(this.f34340u)) {
            if (i > 12) {
                this.f34340u.mo52461d(5);
                return false;
            }
            if (i > 1 || (i == 1 && charSequence.length() == 2)) {
                if (f34312J > 0 && m52804l(f34310H, i) < f34312J) {
                    this.f34340u.mo52461d(5);
                    return false;
                }
                if (f34310H == this.f34315C.getYear() + Constants.UPNP_MULTICAST_PORT && i > this.f34315C.getMonth() + 1) {
                    this.f34340u.mo52461d(this.f34318F ? 6 : 1);
                    return false;
                }
                if (f34310H == this.f34316D.getYear() + Constants.UPNP_MULTICAST_PORT && i < this.f34316D.getMonth() + 1) {
                    this.f34340u.mo52461d(4);
                    return false;
                }
            }
            if (f34312J > 0 && f34310H > 0 && (charSequence.length() == 2 || (i > 1 && charSequence.length() == 1))) {
                dateM106277m.setYear(f34310H - 1900);
                dateM106277m.setMonth(i == 0 ? 0 : i - 1);
                dateM106277m.setDate(f34312J);
                if (dateM106277m.after(this.f34315C)) {
                    this.f34340u.mo52461d(this.f34318F ? 6 : 1);
                    return false;
                }
                if (dateM106277m.before(this.f34316D)) {
                    this.f34340u.mo52461d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f34326g) {
                f34311I = i != 0 ? i - 1 : 0;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    private boolean m52812u(int i, int i2, int i3) {
        if (i < i2) {
            this.f34340u.mo52461d(4);
            return false;
        }
        if (i <= i3) {
            return true;
        }
        this.f34340u.mo52461d(this.f34318F ? 6 : 1);
        return false;
    }

    /* JADX INFO: renamed from: v */
    private void m52813v() {
        int i = this.f34344y;
        if (i == 1) {
            f34310H = -1;
        } else if (i == 2) {
            f34311I = -1;
        } else if (i == 3) {
            f34312J = -1;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m52814w() {
        setText(this.f34339t);
        if (this.f34342w) {
            return;
        }
        this.f34342w = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-3, 0, 3);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.setRepeatCount(2);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k8c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124371a.m52810s(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C8837b());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: x */
    private boolean m52815x(int i, CharSequence charSequence) {
        Date dateM106277m = bsj0.m106277m(0);
        if (NullChecker.m82486a(this.f34340u)) {
            if (i < 10) {
                return m52812u(i, 1, 2);
            }
            if (i < 100) {
                return m52812u(i, (this.f34316D.getYear() + Constants.UPNP_MULTICAST_PORT) / 100, (this.f34315C.getYear() + Constants.UPNP_MULTICAST_PORT) / 100);
            }
            if (i < 1000) {
                return m52812u(i, (this.f34316D.getYear() + Constants.UPNP_MULTICAST_PORT) / 10, (this.f34315C.getYear() + Constants.UPNP_MULTICAST_PORT) / 10);
            }
            if (f34312J > 0 && m52804l(i, f34311I + 1) < f34312J) {
                this.f34340u.mo52461d(5);
                return false;
            }
            if (i < this.f34316D.getYear() + Constants.UPNP_MULTICAST_PORT) {
                this.f34340u.mo52461d(4);
                return false;
            }
            if (i > this.f34315C.getYear() + Constants.UPNP_MULTICAST_PORT) {
                this.f34340u.mo52461d(this.f34318F ? 6 : 1);
                return false;
            }
            if (f34312J >= 0 && f34311I >= 0) {
                dateM106277m.setYear(i - 1900);
                dateM106277m.setMonth(f34311I);
                dateM106277m.setDate(f34312J);
                if (dateM106277m.after(this.f34315C)) {
                    this.f34340u.mo52461d(this.f34318F ? 6 : 1);
                    return false;
                }
                if (dateM106277m.before(this.f34316D)) {
                    this.f34340u.mo52461d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f34326g) {
                f34310H = i;
            }
        }
        return true;
    }

    public int getFinalNum() {
        return this.f34314B;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.m82486a(this.f34341v)) {
            this.f34341v = new Timer("DateEditTextNew-Core-Thread");
        }
        this.f34341v.scheduleAtFixedRate(m52799g(), 0L, this.f34330k);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f34313A.setTarget(super.onCreateInputConnection(editorInfo));
        this.f34313A.m52891a(new C8845a.a() { // from class: l.i8c
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.input.C8845a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo52892a() {
                return this.f113332a.m52809r();
            }
        });
        return this.f34313A;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34341v.cancel();
        this.f34341v = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f34319G = (getMeasuredWidth() - this.f34321b.measureText(String.valueOf(this.f34338s))) / 2.0f;
        m52802j(canvas, this.f34338s);
        m52801i(canvas);
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
        this.f34324e = i2;
        this.f34323d.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            this.f34338s = m52805m("");
            this.f34339t = "";
            m52813v();
            invalidate();
            return;
        }
        try {
            this.f34314B = Integer.valueOf(charSequence.toString()).intValue();
        } catch (NumberFormatException unused) {
        }
        int i4 = this.f34314B;
        if (i4 != -1) {
            if (!m52803k(i4, charSequence) || "00".contentEquals(charSequence)) {
                if ("00".contentEquals(charSequence)) {
                    setText("0");
                    this.f34340u.mo52461d(5);
                } else {
                    this.f34340u.mo52461d(-1);
                }
                m52814w();
                return;
            }
            this.f34339t = charSequence.toString();
            this.f34338s = m52805m(charSequence.toString());
            int i5 = this.f34344y;
            if (i5 == 2) {
                if (this.f34314B <= 1 || charSequence.length() != 1) {
                    invalidate();
                } else {
                    String str = "0" + this.f34314B;
                    this.f34339t = str;
                    setText(str);
                }
            } else if (i5 == 3 && this.f34314B > 3 && charSequence.length() == 1) {
                String str2 = "0" + this.f34314B;
                this.f34339t = str2;
                setText(str2);
            } else {
                invalidate();
            }
            if (this.f34340u != null) {
                if (charSequence.length() == this.f34326g) {
                    this.f34340u.mo52459b(this.f34314B);
                }
                this.f34340u.mo52458a(this.f34314B);
            }
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m52816p() {
        return NullChecker.m82486a(getText()) && getText().length() == this.f34326g;
    }

    public void setNormalAge(int i) {
        this.f34318F = true;
        this.f34315C = bsj0.m106277m(i);
    }

    public void setTextChangedListener(InterfaceC8839d interfaceC8839d) {
        this.f34340u = interfaceC8839d;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.f34335p = i;
        postInvalidate();
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateEditTextNew(Context context) {
        this(context, null);
    }
}
