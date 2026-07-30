package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

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
import l.c1c0;
import l.e16;
import l.k9c0;
import l.mqi0;
import l.t100;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DateEditTextNew extends AppCompatEditText {

    /* JADX INFO: renamed from: H */
    public static int f1284H = -1;

    /* JADX INFO: renamed from: I */
    public static int f1285I = -1;

    /* JADX INFO: renamed from: J */
    public static int f1286J = -1;

    /* JADX INFO: renamed from: A */
    public C0107a f1287A;

    /* JADX INFO: renamed from: B */
    public int f1288B;

    /* JADX INFO: renamed from: C */
    public Date f1289C;

    /* JADX INFO: renamed from: D */
    public Date f1290D;

    /* JADX INFO: renamed from: E */
    public CharSequence f1291E;

    /* JADX INFO: renamed from: F */
    public boolean f1292F;

    /* JADX INFO: renamed from: G */
    public float f1293G;

    /* JADX INFO: renamed from: a */
    public Paint f1294a;

    /* JADX INFO: renamed from: b */
    public Paint f1295b;

    /* JADX INFO: renamed from: c */
    public Paint f1296c;

    /* JADX INFO: renamed from: d */
    public RectF f1297d;

    /* JADX INFO: renamed from: e */
    public int f1298e;

    /* JADX INFO: renamed from: f */
    public int f1299f;

    /* JADX INFO: renamed from: g */
    public int f1300g;

    /* JADX INFO: renamed from: h */
    public int f1301h;

    /* JADX INFO: renamed from: i */
    public int f1302i;

    /* JADX INFO: renamed from: j */
    public boolean f1303j;

    /* JADX INFO: renamed from: k */
    public int f1304k;

    /* JADX INFO: renamed from: l */
    public int f1305l;

    /* JADX INFO: renamed from: m */
    public int f1306m;

    /* JADX INFO: renamed from: n */
    public int f1307n;

    /* JADX INFO: renamed from: o */
    public int f1308o;

    /* JADX INFO: renamed from: p */
    public int f1309p;

    /* JADX INFO: renamed from: q */
    public int f1310q;

    /* JADX INFO: renamed from: r */
    public boolean f1311r;

    /* JADX INFO: renamed from: s */
    public CharSequence f1312s;

    /* JADX INFO: renamed from: t */
    public CharSequence f1313t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0101d f1314u;

    /* JADX INFO: renamed from: v */
    public Timer f1315v;

    /* JADX INFO: renamed from: w */
    public boolean f1316w;

    /* JADX INFO: renamed from: x */
    public int f1317x;

    /* JADX INFO: renamed from: y */
    public int f1318y;

    /* JADX INFO: renamed from: z */
    public int f1319z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$a */
    public class ActionModeCallbackC0098a implements ActionMode.Callback {
        public ActionModeCallbackC0098a() {
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
    public class C0099b implements Animator.AnimatorListener {
        public C0099b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DateEditTextNew.this.f1316w = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$c */
    public class C0100c extends TimerTask {
        public C0100c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (DateEditTextNew.this.f1316w) {
                return;
            }
            DateEditTextNew dateEditTextNew = DateEditTextNew.this;
            dateEditTextNew.f1311r = !dateEditTextNew.f1311r;
            DateEditTextNew.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.DateEditTextNew$d */
    public interface InterfaceC0101d {
        /* JADX INFO: renamed from: a */
        void mo1733a(int i);

        /* JADX INFO: renamed from: b */
        void mo1734b(int i);

        /* JADX INFO: renamed from: c */
        void mo1735c();

        /* JADX INFO: renamed from: d */
        void mo1736d(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DateEditTextNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1312s = "";
        this.f1313t = "";
        this.f1316w = false;
        this.f1317x = 0;
        this.f1319z = t100.d(0.0f);
        this.f1288B = -1;
        this.f1289C = yij0.m(18);
        this.f1290D = yij0.m(100);
        this.f1291E = "";
        this.f1292F = false;
        this.f1287A = new C0107a(null, true);
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionModeCallbackC0098a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.c);
        this.f1303j = typedArrayObtainStyledAttributes.getBoolean(k9c0.m, true);
        this.f1307n = typedArrayObtainStyledAttributes.getColor(k9c0.f, e16.c(getContext(), c1c0.c));
        this.f1308o = typedArrayObtainStyledAttributes.getColor(k9c0.d, e16.c(getContext(), c1c0.a));
        this.f1309p = typedArrayObtainStyledAttributes.getColor(k9c0.n, e16.c(getContext(), c1c0.c));
        this.f1310q = typedArrayObtainStyledAttributes.getColor(k9c0.k, e16.c(getContext(), c1c0.d));
        this.f1306m = typedArrayObtainStyledAttributes.getColor(k9c0.h, e16.c(getContext(), c1c0.c));
        this.f1299f = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.e, 0.0f);
        this.f1300g = typedArrayObtainStyledAttributes.getInt(k9c0.l, 6);
        this.f1318y = typedArrayObtainStyledAttributes.getInt(k9c0.p, 1);
        this.f1304k = typedArrayObtainStyledAttributes.getInt(k9c0.i, 500);
        this.f1305l = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.j, 2.0f);
        this.f1301h = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.g, 5.0f);
        this.f1302i = (int) typedArrayObtainStyledAttributes.getDimension(k9c0.o, 28.0f);
        typedArrayObtainStyledAttributes.recycle();
        m2114n();
    }

    /* JADX INFO: renamed from: g */
    private TimerTask m2107g() {
        return new C0100c();
    }

    /* JADX INFO: renamed from: h */
    private boolean m2108h(int i, CharSequence charSequence) {
        Date dateM = yij0.m(0);
        if (NullChecker.a(this.f1314u)) {
            int iM2112l = m2112l(f1284H, f1285I + 1);
            if ((charSequence.length() == 2 && i > iM2112l) || (charSequence.length() == 1 && i <= 3 && i > iM2112l / 10)) {
                this.f1314u.mo1736d(5);
                return false;
            }
            if (f1284H > 1900 && f1285I >= 0 && (charSequence.length() == 2 || (i > 3 && charSequence.length() == 1))) {
                dateM.setYear(f1284H - 1900);
                dateM.setMonth(f1285I);
                dateM.setDate(i);
                if (dateM.after(this.f1289C)) {
                    this.f1314u.mo1736d(this.f1292F ? 6 : 1);
                    return false;
                }
                if (dateM.before(this.f1290D)) {
                    this.f1314u.mo1736d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f1300g) {
                f1286J = i;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    private void m2109i(Canvas canvas) {
        int iMeasureText;
        float f;
        int length = this.f1312s.length() + 1;
        for (int i = 0; i < this.f1312s.length(); i++) {
            if (m2116q(this.f1312s.charAt(i))) {
                length = i;
                break;
            }
        }
        int i2 = this.f1300g;
        int i3 = this.f1299f;
        if (length > i2) {
            iMeasureText = (i3 * length) + ((int) this.f1295b.measureText(String.valueOf(this.f1312s)));
            f = this.f1293G;
        } else {
            iMeasureText = (i3 * length) + ((int) this.f1295b.measureText(String.valueOf(this.f1312s.subSequence(0, length))));
            f = this.f1293G;
        }
        int i4 = iMeasureText + ((int) f);
        int i5 = this.f1298e;
        int i6 = t100.i;
        int i7 = (i5 / 2) - i6;
        int i8 = (i5 / 2) + i6;
        if (this.f1316w) {
            int i9 = this.f1317x;
            if (i9 != 0) {
                float f2 = i4 + i9;
                canvas.drawLine(f2, i7, f2, i8, this.f1296c);
                return;
            }
            return;
        }
        if (!this.f1311r && this.f1303j && hasFocus()) {
            float f3 = i4;
            canvas.drawLine(f3, i7, f3, i8, this.f1296c);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m2110j(Canvas canvas, CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            boolean zM2116q = m2116q(cCharAt);
            Paint paint = this.f1295b;
            if (zM2116q) {
                paint.setColor(this.f1310q);
                this.f1295b.setStyle(Paint.Style.FILL);
            } else {
                paint.setColor(this.f1309p);
                this.f1295b.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            int i2 = i + 1;
            canvas.drawText(String.valueOf(cCharAt), (this.f1299f * i2) + ((int) this.f1295b.measureText(String.valueOf(charSequence.subSequence(0, i)))) + ((int) this.f1293G), (int) ((this.f1298e / 2) - ((this.f1295b.descent() + this.f1295b.ascent()) / 2.0f)), this.f1295b);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m2111k(int i, CharSequence charSequence) {
        boolean z = charSequence.length() >= this.f1291E.length();
        this.f1291E = charSequence;
        if (z) {
            int i2 = this.f1318y;
            if (i2 == 1) {
                return m2123x(i, charSequence);
            }
            if (i2 == 2) {
                return m2119t(i, charSequence);
            }
            if (i2 == 3) {
                return m2108h(i, charSequence);
            }
        } else {
            m2121v();
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static int m2112l(int i, int i2) {
        if (i2 == 2) {
            if (i == -1) {
                return 29;
            }
        } else if (i2 == 0) {
            return 31;
        }
        return mqi0.r(i, i2);
    }

    /* JADX INFO: renamed from: m */
    private String m2113m(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < this.f1300g; i2++) {
            if (i < charSequence.length()) {
                sb.append(charSequence.charAt(i));
                i++;
            } else {
                int i3 = this.f1318y;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    private void m2114n() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f1300g)});
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f1308o);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f1295b = paint2;
        paint2.setAntiAlias(true);
        this.f1295b.setStrokeWidth(1.0f);
        this.f1295b.setTextSize(this.f1302i);
        Paint paint3 = new Paint();
        this.f1294a = paint3;
        paint3.setAntiAlias(true);
        this.f1294a.setColor(this.f1307n);
        this.f1294a.setStrokeWidth(this.f1301h);
        this.f1294a.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f1296c = paint4;
        paint4.setAntiAlias(true);
        this.f1296c.setColor(this.f1306m);
        this.f1296c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f1296c.setStrokeWidth(this.f1305l);
        this.f1296c.setStrokeCap(Paint.Cap.ROUND);
        this.f1297d = new RectF();
        this.f1312s = m2113m("");
    }

    /* JADX INFO: renamed from: o */
    public static void m2115o(int i, int i2, int i3) {
        f1284H = i;
        f1285I = i2 - 1;
        f1286J = i3;
    }

    /* JADX INFO: renamed from: q */
    private boolean m2116q(char c) {
        return 'M' == c || 'D' == c || 'Y' == c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ boolean m2117r() {
        if (this.f1314u == null || getText() == null || getText().length() != 0) {
            return false;
        }
        this.f1314u.mo1735c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m2118s(ValueAnimator valueAnimator) {
        this.f1317x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    private boolean m2119t(int i, CharSequence charSequence) {
        Date dateM = yij0.m(0);
        if (NullChecker.a(this.f1314u)) {
            if (i > 12) {
                this.f1314u.mo1736d(5);
                return false;
            }
            if (i > 1 || (i == 1 && charSequence.length() == 2)) {
                if (f1286J > 0 && m2112l(f1284H, i) < f1286J) {
                    this.f1314u.mo1736d(5);
                    return false;
                }
                if (f1284H == this.f1289C.getYear() + 1900 && i > this.f1289C.getMonth() + 1) {
                    this.f1314u.mo1736d(this.f1292F ? 6 : 1);
                    return false;
                }
                if (f1284H == this.f1290D.getYear() + 1900 && i < this.f1290D.getMonth() + 1) {
                    this.f1314u.mo1736d(4);
                    return false;
                }
            }
            if (f1286J > 0 && f1284H > 0 && (charSequence.length() == 2 || (i > 1 && charSequence.length() == 1))) {
                dateM.setYear(f1284H - 1900);
                dateM.setMonth(i == 0 ? 0 : i - 1);
                dateM.setDate(f1286J);
                if (dateM.after(this.f1289C)) {
                    this.f1314u.mo1736d(this.f1292F ? 6 : 1);
                    return false;
                }
                if (dateM.before(this.f1290D)) {
                    this.f1314u.mo1736d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f1300g) {
                f1285I = i != 0 ? i - 1 : 0;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    private boolean m2120u(int i, int i2, int i3) {
        if (i < i2) {
            this.f1314u.mo1736d(4);
            return false;
        }
        if (i <= i3) {
            return true;
        }
        this.f1314u.mo1736d(this.f1292F ? 6 : 1);
        return false;
    }

    /* JADX INFO: renamed from: v */
    private void m2121v() {
        int i = this.f1318y;
        if (i == 1) {
            f1284H = -1;
        } else if (i == 2) {
            f1285I = -1;
        } else if (i == 3) {
            f1286J = -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private void m2122w() {
        setText(this.f1313t);
        if (this.f1316w) {
            return;
        }
        this.f1316w = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-3, 0, 3);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.setRepeatCount(2);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e7c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9605a.m2118s(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C0099b());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: x */
    private boolean m2123x(int i, CharSequence charSequence) {
        Date dateM = yij0.m(0);
        if (NullChecker.a(this.f1314u)) {
            if (i < 10) {
                return m2120u(i, 1, 2);
            }
            if (i < 100) {
                return m2120u(i, (this.f1290D.getYear() + 1900) / 100, (this.f1289C.getYear() + 1900) / 100);
            }
            if (i < 1000) {
                return m2120u(i, (this.f1290D.getYear() + 1900) / 10, (this.f1289C.getYear() + 1900) / 10);
            }
            if (f1286J > 0 && m2112l(i, f1285I + 1) < f1286J) {
                this.f1314u.mo1736d(5);
                return false;
            }
            if (i < this.f1290D.getYear() + 1900) {
                this.f1314u.mo1736d(4);
                return false;
            }
            if (i > this.f1289C.getYear() + 1900) {
                this.f1314u.mo1736d(this.f1292F ? 6 : 1);
                return false;
            }
            if (f1286J >= 0 && f1285I >= 0) {
                dateM.setYear(i - 1900);
                dateM.setMonth(f1285I);
                dateM.setDate(f1286J);
                if (dateM.after(this.f1289C)) {
                    this.f1314u.mo1736d(this.f1292F ? 6 : 1);
                    return false;
                }
                if (dateM.before(this.f1290D)) {
                    this.f1314u.mo1736d(4);
                    return false;
                }
            }
            if (charSequence.length() == this.f1300g) {
                f1284H = i;
            }
        }
        return true;
    }

    public int getFinalNum() {
        return this.f1288B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (!NullChecker.a(this.f1315v)) {
            this.f1315v = new Timer("DateEditTextNew-Core-Thread");
        }
        this.f1315v.scheduleAtFixedRate(m2107g(), 0L, this.f1304k);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f1287A.setTarget(super.onCreateInputConnection(editorInfo));
        this.f1287A.m2230a(new C0107a.a() { // from class: l.c7c
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.input.C0107a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo2231a() {
                return this.f8519a.m2117r();
            }
        });
        return this.f1287A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f1315v.cancel();
        this.f1315v = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        this.f1293G = (getMeasuredWidth() - this.f1295b.measureText(String.valueOf(this.f1312s))) / 2.0f;
        m2110j(canvas, this.f1312s);
        m2109i(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (text == null || (i == text.length() && i2 == text.length())) {
            super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f1298e = i2;
        this.f1297d.set(0.0f, 0.0f, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            this.f1312s = m2113m("");
            this.f1313t = "";
            m2121v();
            invalidate();
            return;
        }
        try {
            this.f1288B = Integer.valueOf(charSequence.toString()).intValue();
        } catch (NumberFormatException unused) {
        }
        int i4 = this.f1288B;
        if (i4 != -1) {
            if (!m2111k(i4, charSequence) || "00".contentEquals(charSequence)) {
                if ("00".contentEquals(charSequence)) {
                    setText("0");
                    this.f1314u.mo1736d(5);
                } else {
                    this.f1314u.mo1736d(-1);
                }
                m2122w();
                return;
            }
            this.f1313t = charSequence.toString();
            this.f1312s = m2113m(charSequence.toString());
            int i5 = this.f1318y;
            if (i5 == 2) {
                if (this.f1288B <= 1 || charSequence.length() != 1) {
                    invalidate();
                } else {
                    String str = "0" + this.f1288B;
                    this.f1313t = str;
                    setText(str);
                }
            } else if (i5 == 3 && this.f1288B > 3 && charSequence.length() == 1) {
                String str2 = "0" + this.f1288B;
                this.f1313t = str2;
                setText(str2);
            } else {
                invalidate();
            }
            if (this.f1314u != null) {
                if (charSequence.length() == this.f1300g) {
                    this.f1314u.mo1734b(this.f1288B);
                }
                this.f1314u.mo1733a(this.f1288B);
            }
        }
    }

    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m2124p() {
        return NullChecker.a(getText()) && getText().length() == this.f1300g;
    }

    public void setNormalAge(int i) {
        this.f1292F = true;
        this.f1289C = yij0.m(i);
    }

    public void setTextChangedListener(InterfaceC0101d interfaceC0101d) {
        this.f1314u = interfaceC0101d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        this.f1309p = i;
        postInvalidate();
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateEditTextNew(Context context) {
        this(context, null);
    }
}
