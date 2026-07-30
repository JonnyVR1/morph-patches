package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

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
import p149l.c9c0;
import p149l.e16;
import p149l.mqi0;
import p149l.t100;
import p149l.u0c0;
import p149l.yij0;

/* JADX INFO: loaded from: classes9.dex */
public class DateEditTextNew extends AppCompatEditText {

    /* JADX INFO: renamed from: F */
    public static int f16507F = -1;

    /* JADX INFO: renamed from: G */
    public static int f16508G = -1;

    /* JADX INFO: renamed from: H */
    public static int f16509H = -1;

    /* JADX INFO: renamed from: A */
    public C4642b f16510A;

    /* JADX INFO: renamed from: B */
    public int f16511B;

    /* JADX INFO: renamed from: C */
    public Date f16512C;

    /* JADX INFO: renamed from: D */
    public Date f16513D;

    /* JADX INFO: renamed from: E */
    public CharSequence f16514E;

    /* JADX INFO: renamed from: a */
    public Paint f16515a;

    /* JADX INFO: renamed from: b */
    public Paint f16516b;

    /* JADX INFO: renamed from: c */
    public Paint f16517c;

    /* JADX INFO: renamed from: d */
    public RectF f16518d;

    /* JADX INFO: renamed from: e */
    public RectF f16519e;

    /* JADX INFO: renamed from: f */
    public int f16520f;

    /* JADX INFO: renamed from: g */
    public int f16521g;

    /* JADX INFO: renamed from: h */
    public int f16522h;

    /* JADX INFO: renamed from: i */
    public int f16523i;

    /* JADX INFO: renamed from: j */
    public int f16524j;

    /* JADX INFO: renamed from: k */
    public boolean f16525k;

    /* JADX INFO: renamed from: l */
    public int f16526l;

    /* JADX INFO: renamed from: m */
    public int f16527m;

    /* JADX INFO: renamed from: n */
    public int f16528n;

    /* JADX INFO: renamed from: o */
    public int f16529o;

    /* JADX INFO: renamed from: p */
    public int f16530p;

    /* JADX INFO: renamed from: q */
    public int f16531q;

    /* JADX INFO: renamed from: r */
    public int f16532r;

    /* JADX INFO: renamed from: s */
    public boolean f16533s;

    /* JADX INFO: renamed from: t */
    public CharSequence f16534t;

    /* JADX INFO: renamed from: u */
    public CharSequence f16535u;

    /* JADX INFO: renamed from: v */
    public Timer f16536v;

    /* JADX INFO: renamed from: w */
    public boolean f16537w;

    /* JADX INFO: renamed from: x */
    public int f16538x;

    /* JADX INFO: renamed from: y */
    public int f16539y;

    /* JADX INFO: renamed from: z */
    public int f16540z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$a */
    public class ActionModeCallbackC4632a implements ActionMode.Callback {
        public ActionModeCallbackC4632a() {
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
    public class C4633b extends TimerTask {
        public C4633b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (DateEditTextNew.this.f16537w) {
                return;
            }
            DateEditTextNew dateEditTextNew = DateEditTextNew.this;
            dateEditTextNew.f16533s = !dateEditTextNew.f16533s;
            DateEditTextNew.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$c */
    public interface InterfaceC4634c {
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16534t = "";
        this.f16535u = "";
        this.f16537w = false;
        this.f16538x = 0;
        this.f16540z = t100.m186890d(0.0f);
        this.f16511B = -1;
        this.f16512C = yij0.m214957m(18);
        this.f16513D = yij0.m214957m(100);
        this.f16514E = "";
        this.f16510A = new C4642b(null, true);
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionModeCallbackC4632a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f79899a);
        this.f16525k = typedArrayObtainStyledAttributes.getBoolean(c9c0.f79909k, true);
        this.f16529o = typedArrayObtainStyledAttributes.getColor(c9c0.f79902d, e16.m114375c(getContext(), u0c0.f172885f));
        this.f16530p = typedArrayObtainStyledAttributes.getColor(c9c0.f79900b, e16.m114375c(getContext(), u0c0.f172882c));
        this.f16531q = typedArrayObtainStyledAttributes.getColor(c9c0.f79910l, e16.m114375c(getContext(), u0c0.f172885f));
        this.f16532r = typedArrayObtainStyledAttributes.getColor(c9c0.f79907i, e16.m114375c(getContext(), u0c0.f172886g));
        this.f16528n = typedArrayObtainStyledAttributes.getColor(c9c0.f79904f, e16.m114375c(getContext(), u0c0.f172885f));
        this.f16522h = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79901c, 0.0f);
        this.f16523i = typedArrayObtainStyledAttributes.getInt(c9c0.f79908j, 6);
        this.f16539y = typedArrayObtainStyledAttributes.getInt(c9c0.f79911m, 1);
        this.f16526l = typedArrayObtainStyledAttributes.getInt(c9c0.f79905g, 500);
        this.f16527m = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79906h, 2.0f);
        this.f16524j = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79903e, 5.0f);
        typedArrayObtainStyledAttributes.recycle();
        m28608l();
    }

    /* JADX INFO: renamed from: j */
    public static int m28601j(int i, int i2) {
        if (i2 == 2) {
            if (i == -1) {
                return 29;
            }
        } else if (i2 == 0) {
            return 31;
        }
        return mqi0.m155947r(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public final TimerTask m28602e() {
        return new C4633b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28603f(int i, CharSequence charSequence) {
        f16509H = -1;
        Date dateM214957m = yij0.m214957m(0);
        if (NullChecker.m81303a(null)) {
            int iM28601j = m28601j(f16507F, f16508G + 1);
            if (charSequence.length() == 2 && i > iM28601j) {
                throw null;
            }
            if (charSequence.length() == 1 && i <= 3 && i > iM28601j / 10) {
                throw null;
            }
            if (f16507F > 1900 && f16508G >= 0 && (charSequence.length() == 2 || (i > 3 && charSequence.length() == 1))) {
                dateM214957m.setYear(f16507F - Constants.UPNP_MULTICAST_PORT);
                dateM214957m.setMonth(f16508G);
                dateM214957m.setDate(i);
                if (dateM214957m.after(this.f16512C) || dateM214957m.before(this.f16513D)) {
                    throw null;
                }
            }
            if (charSequence.length() == this.f16523i) {
                f16509H = i;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m28604g(Canvas canvas) {
        int i;
        float fMeasureText;
        int length = this.f16534t.length() + 1;
        for (int i2 = 0; i2 < this.f16534t.length(); i2++) {
            if (m28609m(this.f16534t.charAt(i2))) {
                length = i2;
                break;
            }
        }
        int width = (getWidth() - (((int) this.f16516b.measureText(String.valueOf(this.f16534t))) + (this.f16522h * (this.f16534t.length() - 1)))) / 2;
        int i3 = this.f16523i;
        int i4 = this.f16522h;
        if (length > i3) {
            i = i4 * length;
            fMeasureText = this.f16516b.measureText(String.valueOf(this.f16534t));
        } else {
            i = i4 * length;
            fMeasureText = this.f16516b.measureText(String.valueOf(this.f16534t.subSequence(0, length)));
        }
        int i5 = width + i + ((int) fMeasureText);
        int i6 = this.f16521g;
        int i7 = t100.f167260i;
        int i8 = (i6 / 2) - i7;
        int i9 = (i6 / 2) + i7;
        if (this.f16537w) {
            int i10 = this.f16538x;
            if (i10 != 0) {
                float f = i5 + i10;
                canvas.drawLine(f, i8, f, i9, this.f16517c);
                return;
            }
            return;
        }
        if (!this.f16533s && this.f16525k && hasFocus()) {
            float f2 = i5;
            canvas.drawLine(f2, i8, f2, i9, this.f16517c);
        }
    }

    public int getFinalNum() {
        return this.f16511B;
    }

    /* JADX INFO: renamed from: h */
    public final void m28605h(Canvas canvas, CharSequence charSequence) {
        int width = (getWidth() - (((int) this.f16516b.measureText(String.valueOf(charSequence))) + (this.f16522h * (charSequence.length() - 1)))) / 2;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            boolean zM28609m = m28609m(cCharAt);
            Paint paint = this.f16516b;
            if (zM28609m) {
                paint.setColor(this.f16532r);
                this.f16516b.setStyle(Paint.Style.FILL);
            } else {
                paint.setColor(this.f16531q);
                this.f16516b.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            canvas.drawText(String.valueOf(cCharAt), width, (int) ((this.f16521g / 2) - ((this.f16516b.descent() + this.f16516b.ascent()) / 2.0f)), this.f16516b);
            width += this.f16522h + ((int) this.f16516b.measureText(String.valueOf(cCharAt)));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28606i(int i, CharSequence charSequence) {
        boolean z = charSequence.length() >= this.f16514E.length();
        this.f16514E = charSequence;
        if (z) {
            int i2 = this.f16539y;
            if (i2 == 1) {
                return m28614r(i, charSequence);
            }
            if (i2 == 2) {
                return m28611o(i, charSequence);
            }
            if (i2 == 3) {
                return m28603f(i, charSequence);
            }
        } else {
            m28613q();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final String m28607k(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < this.f16523i; i2++) {
            if (i < charSequence.length()) {
                sb.append(charSequence.charAt(i));
                i++;
            } else {
                int i3 = this.f16539y;
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

    /* JADX INFO: renamed from: l */
    public final void m28608l() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f16523i)});
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f16530p);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f16516b = paint2;
        paint2.setAntiAlias(true);
        this.f16516b.setStrokeWidth(1.0f);
        this.f16516b.setTextSize(t100.m186892f(18));
        Paint paint3 = new Paint();
        this.f16515a = paint3;
        paint3.setAntiAlias(true);
        this.f16515a.setColor(this.f16529o);
        this.f16515a.setStrokeWidth(this.f16524j);
        this.f16515a.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f16517c = paint4;
        paint4.setAntiAlias(true);
        this.f16517c.setColor(this.f16528n);
        this.f16517c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f16517c.setStrokeWidth(this.f16527m);
        this.f16517c.setStrokeCap(Paint.Cap.ROUND);
        this.f16518d = new RectF();
        this.f16519e = new RectF();
        this.f16534t = m28607k("");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m28609m(char c) {
        return 'M' == c || 'D' == c || 'Y' == c;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m28610n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m28611o(int i, CharSequence charSequence) {
        f16508G = -1;
        Date dateM214957m = yij0.m214957m(0);
        if (NullChecker.m81303a(null)) {
            if (i > 12) {
                throw null;
            }
            if (i > 1 || (i == 1 && charSequence.length() == 2)) {
                if (f16509H > 0 && m28601j(f16507F, i) < f16509H) {
                    throw null;
                }
                if (f16507F == this.f16512C.getYear() + Constants.UPNP_MULTICAST_PORT && i > this.f16512C.getMonth() + 1) {
                    throw null;
                }
                if (f16507F == this.f16513D.getYear() + Constants.UPNP_MULTICAST_PORT && i < this.f16513D.getMonth() + 1) {
                    throw null;
                }
            }
            if (f16509H > 0 && f16507F > 0 && (charSequence.length() == 2 || (i > 1 && charSequence.length() == 1))) {
                dateM214957m.setYear(f16507F - 1900);
                dateM214957m.setMonth(i == 0 ? 0 : i - 1);
                dateM214957m.setDate(f16509H);
                if (dateM214957m.after(this.f16512C) || dateM214957m.before(this.f16513D)) {
                    throw null;
                }
            }
            if (charSequence.length() == this.f16523i) {
                f16508G = i != 0 ? i - 1 : 0;
            }
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.m81303a(this.f16536v)) {
            this.f16536v = new Timer("DateEditTextNew-Thread");
        }
        this.f16536v.scheduleAtFixedRate(m28602e(), 0L, this.f16526l);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f16510A.setTarget(super.onCreateInputConnection(editorInfo));
        this.f16510A.m28688a(new C4642b.a() { // from class: l.d7c
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.C4642b.a
            /* JADX INFO: renamed from: a */
            public final boolean mo28689a() {
                return this.f84725a.m28610n();
            }
        });
        return this.f16510A;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16536v.cancel();
        this.f16536v = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        m28605h(canvas, this.f16534t);
        m28604g(canvas);
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
        int i5 = this.f16522h;
        int i6 = this.f16523i;
        this.f16520f = ((i - (i5 * (i6 + 1))) - (this.f16540z * 5)) / i6;
        this.f16521g = i2;
        this.f16518d.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            this.f16534t = m28607k("");
            this.f16535u = "";
            m28613q();
            invalidate();
            return;
        }
        try {
            this.f16511B = Integer.valueOf(charSequence.toString()).intValue();
        } catch (NumberFormatException unused) {
        }
        int i4 = this.f16511B;
        if (i4 != -1) {
            if (!m28606i(i4, charSequence) || "00".contentEquals(charSequence)) {
                if (!"00".contentEquals(charSequence)) {
                    throw null;
                }
                setText("0");
                throw null;
            }
            this.f16535u = charSequence.toString();
            this.f16534t = m28607k(charSequence.toString());
            int i5 = this.f16539y;
            if (i5 == 2) {
                if (this.f16511B <= 1 || charSequence.length() != 1) {
                    invalidate();
                    return;
                }
                String str = "0" + this.f16511B;
                this.f16535u = str;
                setText(str);
                return;
            }
            if (i5 != 3) {
                invalidate();
                return;
            }
            if (this.f16511B <= 3 || charSequence.length() != 1) {
                invalidate();
                return;
            }
            String str2 = "0" + this.f16511B;
            this.f16535u = str2;
            setText(str2);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m28612p(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw null;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m28613q() {
        int i = this.f16539y;
        if (i == 1) {
            f16507F = -1;
        } else if (i == 2) {
            f16508G = -1;
        } else if (i == 3) {
            f16509H = -1;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m28614r(int i, CharSequence charSequence) {
        f16507F = -1;
        Date dateM214957m = yij0.m214957m(0);
        if (!NullChecker.m81303a(null)) {
            return true;
        }
        if (i < 10) {
            return m28612p(i, 1, 2);
        }
        if (i < 100) {
            return m28612p(i, (this.f16513D.getYear() + Constants.UPNP_MULTICAST_PORT) / 100, (this.f16512C.getYear() + Constants.UPNP_MULTICAST_PORT) / 100);
        }
        if (i < 1000) {
            return m28612p(i, (this.f16513D.getYear() + Constants.UPNP_MULTICAST_PORT) / 10, (this.f16512C.getYear() + Constants.UPNP_MULTICAST_PORT) / 10);
        }
        if ((f16509H > 0 && m28601j(i, f16508G + 1) < f16509H) || i < this.f16513D.getYear() + Constants.UPNP_MULTICAST_PORT || i > this.f16512C.getYear() + Constants.UPNP_MULTICAST_PORT) {
            throw null;
        }
        if (f16509H >= 0 && f16508G >= 0) {
            dateM214957m.setYear(i - 1900);
            dateM214957m.setMonth(f16508G);
            dateM214957m.setDate(f16509H);
            if (dateM214957m.after(this.f16512C) || dateM214957m.before(this.f16513D)) {
                throw null;
            }
        }
        if (charSequence.length() == this.f16523i) {
            f16507F = i;
        }
        return true;
    }

    public void setTextChangedListener(InterfaceC4634c interfaceC4634c) {
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.f16531q = i;
        postInvalidate();
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateEditTextNew(Context context) {
        this(context, null);
    }
}
