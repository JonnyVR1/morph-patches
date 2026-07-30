package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

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
import l.e16;
import l.mqi0;
import l.t100;
import l.yij0;
import p006l.c9c0;
import p006l.u0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class DateEditTextNew extends AppCompatEditText {

    /* JADX INFO: renamed from: F */
    public static int f496F = -1;

    /* JADX INFO: renamed from: G */
    public static int f497G = -1;

    /* JADX INFO: renamed from: H */
    public static int f498H = -1;

    /* JADX INFO: renamed from: A */
    public C0068b f499A;

    /* JADX INFO: renamed from: B */
    public int f500B;

    /* JADX INFO: renamed from: C */
    public Date f501C;

    /* JADX INFO: renamed from: D */
    public Date f502D;

    /* JADX INFO: renamed from: E */
    public CharSequence f503E;

    /* JADX INFO: renamed from: a */
    public Paint f504a;

    /* JADX INFO: renamed from: b */
    public Paint f505b;

    /* JADX INFO: renamed from: c */
    public Paint f506c;

    /* JADX INFO: renamed from: d */
    public RectF f507d;

    /* JADX INFO: renamed from: e */
    public RectF f508e;

    /* JADX INFO: renamed from: f */
    public int f509f;

    /* JADX INFO: renamed from: g */
    public int f510g;

    /* JADX INFO: renamed from: h */
    public int f511h;

    /* JADX INFO: renamed from: i */
    public int f512i;

    /* JADX INFO: renamed from: j */
    public int f513j;

    /* JADX INFO: renamed from: k */
    public boolean f514k;

    /* JADX INFO: renamed from: l */
    public int f515l;

    /* JADX INFO: renamed from: m */
    public int f516m;

    /* JADX INFO: renamed from: n */
    public int f517n;

    /* JADX INFO: renamed from: o */
    public int f518o;

    /* JADX INFO: renamed from: p */
    public int f519p;

    /* JADX INFO: renamed from: q */
    public int f520q;

    /* JADX INFO: renamed from: r */
    public int f521r;

    /* JADX INFO: renamed from: s */
    public boolean f522s;

    /* JADX INFO: renamed from: t */
    public CharSequence f523t;

    /* JADX INFO: renamed from: u */
    public CharSequence f524u;

    /* JADX INFO: renamed from: v */
    public Timer f525v;

    /* JADX INFO: renamed from: w */
    public boolean f526w;

    /* JADX INFO: renamed from: x */
    public int f527x;

    /* JADX INFO: renamed from: y */
    public int f528y;

    /* JADX INFO: renamed from: z */
    public int f529z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$a */
    public class ActionModeCallbackC0058a implements ActionMode.Callback {
        public ActionModeCallbackC0058a() {
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$b */
    public class C0059b extends TimerTask {
        public C0059b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (DateEditTextNew.this.f526w) {
                return;
            }
            DateEditTextNew dateEditTextNew = DateEditTextNew.this;
            dateEditTextNew.f522s = !dateEditTextNew.f522s;
            DateEditTextNew.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$c */
    public interface InterfaceC0060c {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DateEditTextNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f523t = "";
        this.f524u = "";
        this.f526w = false;
        this.f527x = 0;
        this.f529z = t100.d(0.0f);
        this.f500B = -1;
        this.f501C = yij0.m(18);
        this.f502D = yij0.m(100);
        this.f503E = "";
        this.f499A = new C0068b(null, true);
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionModeCallbackC0058a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f9522a);
        this.f514k = typedArrayObtainStyledAttributes.getBoolean(c9c0.f9532k, true);
        this.f518o = typedArrayObtainStyledAttributes.getColor(c9c0.f9525d, e16.c(getContext(), u0c0.f22399f));
        this.f519p = typedArrayObtainStyledAttributes.getColor(c9c0.f9523b, e16.c(getContext(), u0c0.f22396c));
        this.f520q = typedArrayObtainStyledAttributes.getColor(c9c0.f9533l, e16.c(getContext(), u0c0.f22399f));
        this.f521r = typedArrayObtainStyledAttributes.getColor(c9c0.f9530i, e16.c(getContext(), u0c0.f22400g));
        this.f517n = typedArrayObtainStyledAttributes.getColor(c9c0.f9527f, e16.c(getContext(), u0c0.f22399f));
        this.f511h = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9524c, 0.0f);
        this.f512i = typedArrayObtainStyledAttributes.getInt(c9c0.f9531j, 6);
        this.f528y = typedArrayObtainStyledAttributes.getInt(c9c0.f9534m, 1);
        this.f515l = typedArrayObtainStyledAttributes.getInt(c9c0.f9528g, 500);
        this.f516m = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9529h, 2.0f);
        this.f513j = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9526e, 5.0f);
        typedArrayObtainStyledAttributes.recycle();
        m505l();
    }

    /* JADX INFO: renamed from: j */
    public static int m498j(int i, int i2) {
        if (i2 == 2) {
            if (i == -1) {
                return 29;
            }
        } else if (i2 == 0) {
            return 31;
        }
        return mqi0.r(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public final TimerTask m499e() {
        return new C0059b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m500f(int i, CharSequence charSequence) {
        f498H = -1;
        Date dateM = yij0.m(0);
        if (NullChecker.a((Object) null)) {
            int iM498j = m498j(f496F, f497G + 1);
            if (charSequence.length() == 2 && i > iM498j) {
                throw null;
            }
            if (charSequence.length() == 1 && i <= 3 && i > iM498j / 10) {
                throw null;
            }
            if (f496F > 1900 && f497G >= 0 && (charSequence.length() == 2 || (i > 3 && charSequence.length() == 1))) {
                dateM.setYear(f496F - 1900);
                dateM.setMonth(f497G);
                dateM.setDate(i);
                if (dateM.after(this.f501C) || dateM.before(this.f502D)) {
                    throw null;
                }
            }
            if (charSequence.length() == this.f512i) {
                f498H = i;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m501g(Canvas canvas) {
        int i;
        float fMeasureText;
        int length = this.f523t.length() + 1;
        for (int i2 = 0; i2 < this.f523t.length(); i2++) {
            if (m506m(this.f523t.charAt(i2))) {
                length = i2;
                break;
            }
        }
        int width = (getWidth() - (((int) this.f505b.measureText(String.valueOf(this.f523t))) + (this.f511h * (this.f523t.length() - 1)))) / 2;
        int i3 = this.f512i;
        int i4 = this.f511h;
        if (length > i3) {
            i = i4 * length;
            fMeasureText = this.f505b.measureText(String.valueOf(this.f523t));
        } else {
            i = i4 * length;
            fMeasureText = this.f505b.measureText(String.valueOf(this.f523t.subSequence(0, length)));
        }
        int i5 = width + i + ((int) fMeasureText);
        int i6 = this.f510g;
        int i7 = t100.i;
        int i8 = (i6 / 2) - i7;
        int i9 = (i6 / 2) + i7;
        if (this.f526w) {
            int i10 = this.f527x;
            if (i10 != 0) {
                float f = i5 + i10;
                canvas.drawLine(f, i8, f, i9, this.f506c);
                return;
            }
            return;
        }
        if (!this.f522s && this.f514k && hasFocus()) {
            float f2 = i5;
            canvas.drawLine(f2, i8, f2, i9, this.f506c);
        }
    }

    public int getFinalNum() {
        return this.f500B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m502h(Canvas canvas, CharSequence charSequence) {
        int width = (getWidth() - (((int) this.f505b.measureText(String.valueOf(charSequence))) + (this.f511h * (charSequence.length() - 1)))) / 2;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            boolean zM506m = m506m(cCharAt);
            Paint paint = this.f505b;
            if (zM506m) {
                paint.setColor(this.f521r);
                this.f505b.setStyle(Paint.Style.FILL);
            } else {
                paint.setColor(this.f520q);
                this.f505b.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            canvas.drawText(String.valueOf(cCharAt), width, (int) ((this.f510g / 2) - ((this.f505b.descent() + this.f505b.ascent()) / 2.0f)), this.f505b);
            width += this.f511h + ((int) this.f505b.measureText(String.valueOf(cCharAt)));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m503i(int i, CharSequence charSequence) {
        boolean z = charSequence.length() >= this.f503E.length();
        this.f503E = charSequence;
        if (z) {
            int i2 = this.f528y;
            if (i2 == 1) {
                return m511r(i, charSequence);
            }
            if (i2 == 2) {
                return m508o(i, charSequence);
            }
            if (i2 == 3) {
                return m500f(i, charSequence);
            }
        } else {
            m510q();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final String m504k(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < this.f512i; i2++) {
            if (i < charSequence.length()) {
                sb.append(charSequence.charAt(i));
                i++;
            } else {
                int i3 = this.f528y;
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
    /* JADX INFO: renamed from: l */
    public final void m505l() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f512i)});
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f519p);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f505b = paint2;
        paint2.setAntiAlias(true);
        this.f505b.setStrokeWidth(1.0f);
        this.f505b.setTextSize(t100.f(18));
        Paint paint3 = new Paint();
        this.f504a = paint3;
        paint3.setAntiAlias(true);
        this.f504a.setColor(this.f518o);
        this.f504a.setStrokeWidth(this.f513j);
        this.f504a.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f506c = paint4;
        paint4.setAntiAlias(true);
        this.f506c.setColor(this.f517n);
        this.f506c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f506c.setStrokeWidth(this.f516m);
        this.f506c.setStrokeCap(Paint.Cap.ROUND);
        this.f507d = new RectF();
        this.f508e = new RectF();
        this.f523t = m504k("");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m506m(char c) {
        return 'M' == c || 'D' == c || 'Y' == c;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m507n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m508o(int i, CharSequence charSequence) {
        f497G = -1;
        Date dateM = yij0.m(0);
        if (NullChecker.a((Object) null)) {
            if (i > 12) {
                throw null;
            }
            if (i > 1 || (i == 1 && charSequence.length() == 2)) {
                if (f498H > 0 && m498j(f496F, i) < f498H) {
                    throw null;
                }
                if (f496F == this.f501C.getYear() + 1900 && i > this.f501C.getMonth() + 1) {
                    throw null;
                }
                if (f496F == this.f502D.getYear() + 1900 && i < this.f502D.getMonth() + 1) {
                    throw null;
                }
            }
            if (f498H > 0 && f496F > 0 && (charSequence.length() == 2 || (i > 1 && charSequence.length() == 1))) {
                dateM.setYear(f496F - 1900);
                dateM.setMonth(i == 0 ? 0 : i - 1);
                dateM.setDate(f498H);
                if (dateM.after(this.f501C) || dateM.before(this.f502D)) {
                    throw null;
                }
            }
            if (charSequence.length() == this.f512i) {
                f497G = i != 0 ? i - 1 : 0;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (!NullChecker.a(this.f525v)) {
            this.f525v = new Timer("DateEditTextNew-Thread");
        }
        this.f525v.scheduleAtFixedRate(m499e(), 0L, this.f515l);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f499A.setTarget(super.onCreateInputConnection(editorInfo));
        this.f499A.m587a(new C0068b.a() { // from class: l.d7c
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.C0068b.a
            /* JADX INFO: renamed from: a */
            public final boolean mo588a() {
                return this.f10051a.m507n();
            }
        });
        return this.f499A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f525v.cancel();
        this.f525v = null;
    }

    public void onDraw(Canvas canvas) {
        m502h(canvas, this.f523t);
        m501g(canvas);
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
        int i5 = this.f511h;
        int i6 = this.f512i;
        this.f509f = ((i - (i5 * (i6 + 1))) - (this.f529z * 5)) / i6;
        this.f510g = i2;
        this.f507d.set(0.0f, 0.0f, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            this.f523t = m504k("");
            this.f524u = "";
            m510q();
            invalidate();
            return;
        }
        try {
            this.f500B = Integer.valueOf(charSequence.toString()).intValue();
        } catch (NumberFormatException unused) {
        }
        int i4 = this.f500B;
        if (i4 != -1) {
            if (!m503i(i4, charSequence) || "00".contentEquals(charSequence)) {
                if (!"00".contentEquals(charSequence)) {
                    throw null;
                }
                setText("0");
                throw null;
            }
            this.f524u = charSequence.toString();
            this.f523t = m504k(charSequence.toString());
            int i5 = this.f528y;
            if (i5 == 2) {
                if (this.f500B <= 1 || charSequence.length() != 1) {
                    invalidate();
                    return;
                }
                String str = "0" + this.f500B;
                this.f524u = str;
                setText(str);
                return;
            }
            if (i5 != 3) {
                invalidate();
                return;
            }
            if (this.f500B <= 3 || charSequence.length() != 1) {
                invalidate();
                return;
            }
            String str2 = "0" + this.f500B;
            this.f524u = str2;
            setText(str2);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m509p(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw null;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m510q() {
        int i = this.f528y;
        if (i == 1) {
            f496F = -1;
        } else if (i == 2) {
            f497G = -1;
        } else if (i == 3) {
            f498H = -1;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m511r(int i, CharSequence charSequence) {
        f496F = -1;
        Date dateM = yij0.m(0);
        if (!NullChecker.a((Object) null)) {
            return true;
        }
        if (i < 10) {
            return m509p(i, 1, 2);
        }
        if (i < 100) {
            return m509p(i, (this.f502D.getYear() + 1900) / 100, (this.f501C.getYear() + 1900) / 100);
        }
        if (i < 1000) {
            return m509p(i, (this.f502D.getYear() + 1900) / 10, (this.f501C.getYear() + 1900) / 10);
        }
        if ((f498H > 0 && m498j(i, f497G + 1) < f498H) || i < this.f502D.getYear() + 1900 || i > this.f501C.getYear() + 1900) {
            throw null;
        }
        if (f498H >= 0 && f497G >= 0) {
            dateM.setYear(i - 1900);
            dateM.setMonth(f497G);
            dateM.setDate(f498H);
            if (dateM.after(this.f501C) || dateM.before(this.f502D)) {
                throw null;
            }
        }
        if (charSequence.length() == this.f512i) {
            f496F = i;
        }
        return true;
    }

    public void setTextChangedListener(InterfaceC0060c interfaceC0060c) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        this.f520q = i;
        postInvalidate();
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateEditTextNew(Context context) {
        this(context, null);
    }
}
