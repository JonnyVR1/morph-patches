package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

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
import p153l.a9c0;
import p153l.bsj0;
import p153l.ihc0;
import p153l.j26;
import p153l.pzi0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class DateEditTextNew extends AppCompatEditText {

    /* JADX INFO: renamed from: F */
    public static int f17226F = -1;

    /* JADX INFO: renamed from: G */
    public static int f17227G = -1;

    /* JADX INFO: renamed from: H */
    public static int f17228H = -1;

    /* JADX INFO: renamed from: A */
    public C4793b f17229A;

    /* JADX INFO: renamed from: B */
    public int f17230B;

    /* JADX INFO: renamed from: C */
    public Date f17231C;

    /* JADX INFO: renamed from: D */
    public Date f17232D;

    /* JADX INFO: renamed from: E */
    public CharSequence f17233E;

    /* JADX INFO: renamed from: a */
    public Paint f17234a;

    /* JADX INFO: renamed from: b */
    public Paint f17235b;

    /* JADX INFO: renamed from: c */
    public Paint f17236c;

    /* JADX INFO: renamed from: d */
    public RectF f17237d;

    /* JADX INFO: renamed from: e */
    public RectF f17238e;

    /* JADX INFO: renamed from: f */
    public int f17239f;

    /* JADX INFO: renamed from: g */
    public int f17240g;

    /* JADX INFO: renamed from: h */
    public int f17241h;

    /* JADX INFO: renamed from: i */
    public int f17242i;

    /* JADX INFO: renamed from: j */
    public int f17243j;

    /* JADX INFO: renamed from: k */
    public boolean f17244k;

    /* JADX INFO: renamed from: l */
    public int f17245l;

    /* JADX INFO: renamed from: m */
    public int f17246m;

    /* JADX INFO: renamed from: n */
    public int f17247n;

    /* JADX INFO: renamed from: o */
    public int f17248o;

    /* JADX INFO: renamed from: p */
    public int f17249p;

    /* JADX INFO: renamed from: q */
    public int f17250q;

    /* JADX INFO: renamed from: r */
    public int f17251r;

    /* JADX INFO: renamed from: s */
    public boolean f17252s;

    /* JADX INFO: renamed from: t */
    public CharSequence f17253t;

    /* JADX INFO: renamed from: u */
    public CharSequence f17254u;

    /* JADX INFO: renamed from: v */
    public Timer f17255v;

    /* JADX INFO: renamed from: w */
    public boolean f17256w;

    /* JADX INFO: renamed from: x */
    public int f17257x;

    /* JADX INFO: renamed from: y */
    public int f17258y;

    /* JADX INFO: renamed from: z */
    public int f17259z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$a */
    public class ActionModeCallbackC4783a implements ActionMode.Callback {
        public ActionModeCallbackC4783a() {
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
    public class C4784b extends TimerTask {
        public C4784b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (DateEditTextNew.this.f17256w) {
                return;
            }
            DateEditTextNew dateEditTextNew = DateEditTextNew.this;
            dateEditTextNew.f17252s = !dateEditTextNew.f17252s;
            DateEditTextNew.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.DateEditTextNew$c */
    public interface InterfaceC4785c {
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17253t = "";
        this.f17254u = "";
        this.f17256w = false;
        this.f17257x = 0;
        this.f17259z = qa00.m175859d(0.0f);
        this.f17230B = -1;
        this.f17231C = bsj0.m106277m(18);
        this.f17232D = bsj0.m106277m(100);
        this.f17233E = "";
        this.f17229A = new C4793b(null, true);
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new ActionModeCallbackC4783a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihc0.f114904a);
        this.f17244k = typedArrayObtainStyledAttributes.getBoolean(ihc0.f114914k, true);
        this.f17248o = typedArrayObtainStyledAttributes.getColor(ihc0.f114907d, j26.m143190c(getContext(), a9c0.f69021f));
        this.f17249p = typedArrayObtainStyledAttributes.getColor(ihc0.f114905b, j26.m143190c(getContext(), a9c0.f69018c));
        this.f17250q = typedArrayObtainStyledAttributes.getColor(ihc0.f114915l, j26.m143190c(getContext(), a9c0.f69021f));
        this.f17251r = typedArrayObtainStyledAttributes.getColor(ihc0.f114912i, j26.m143190c(getContext(), a9c0.f69022g));
        this.f17247n = typedArrayObtainStyledAttributes.getColor(ihc0.f114909f, j26.m143190c(getContext(), a9c0.f69021f));
        this.f17241h = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114906c, 0.0f);
        this.f17242i = typedArrayObtainStyledAttributes.getInt(ihc0.f114913j, 6);
        this.f17258y = typedArrayObtainStyledAttributes.getInt(ihc0.f114916m, 1);
        this.f17245l = typedArrayObtainStyledAttributes.getInt(ihc0.f114910g, 500);
        this.f17246m = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114911h, 2.0f);
        this.f17243j = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114908e, 5.0f);
        typedArrayObtainStyledAttributes.recycle();
        m29607l();
    }

    /* JADX INFO: renamed from: j */
    public static int m29600j(int i, int i2) {
        if (i2 == 2) {
            if (i == -1) {
                return 29;
            }
        } else if (i2 == 0) {
            return 31;
        }
        return pzi0.m174457r(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public final TimerTask m29601e() {
        return new C4784b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m29602f(int i, CharSequence charSequence) {
        f17228H = -1;
        Date dateM106277m = bsj0.m106277m(0);
        if (NullChecker.m82486a(null)) {
            int iM29600j = m29600j(f17226F, f17227G + 1);
            if (charSequence.length() == 2 && i > iM29600j) {
                throw null;
            }
            if (charSequence.length() == 1 && i <= 3 && i > iM29600j / 10) {
                throw null;
            }
            if (f17226F > 1900 && f17227G >= 0 && (charSequence.length() == 2 || (i > 3 && charSequence.length() == 1))) {
                dateM106277m.setYear(f17226F - Constants.UPNP_MULTICAST_PORT);
                dateM106277m.setMonth(f17227G);
                dateM106277m.setDate(i);
                if (dateM106277m.after(this.f17231C) || dateM106277m.before(this.f17232D)) {
                    throw null;
                }
            }
            if (charSequence.length() == this.f17242i) {
                f17228H = i;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m29603g(Canvas canvas) {
        int i;
        float fMeasureText;
        int length = this.f17253t.length() + 1;
        for (int i2 = 0; i2 < this.f17253t.length(); i2++) {
            if (m29608m(this.f17253t.charAt(i2))) {
                length = i2;
                break;
            }
        }
        int width = (getWidth() - (((int) this.f17235b.measureText(String.valueOf(this.f17253t))) + (this.f17241h * (this.f17253t.length() - 1)))) / 2;
        int i3 = this.f17242i;
        int i4 = this.f17241h;
        if (length > i3) {
            i = i4 * length;
            fMeasureText = this.f17235b.measureText(String.valueOf(this.f17253t));
        } else {
            i = i4 * length;
            fMeasureText = this.f17235b.measureText(String.valueOf(this.f17253t.subSequence(0, length)));
        }
        int i5 = width + i + ((int) fMeasureText);
        int i6 = this.f17240g;
        int i7 = qa00.f156322i;
        int i8 = (i6 / 2) - i7;
        int i9 = (i6 / 2) + i7;
        if (this.f17256w) {
            int i10 = this.f17257x;
            if (i10 != 0) {
                float f = i5 + i10;
                canvas.drawLine(f, i8, f, i9, this.f17236c);
                return;
            }
            return;
        }
        if (!this.f17252s && this.f17244k && hasFocus()) {
            float f2 = i5;
            canvas.drawLine(f2, i8, f2, i9, this.f17236c);
        }
    }

    public int getFinalNum() {
        return this.f17230B;
    }

    /* JADX INFO: renamed from: h */
    public final void m29604h(Canvas canvas, CharSequence charSequence) {
        int width = (getWidth() - (((int) this.f17235b.measureText(String.valueOf(charSequence))) + (this.f17241h * (charSequence.length() - 1)))) / 2;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            boolean zM29608m = m29608m(cCharAt);
            Paint paint = this.f17235b;
            if (zM29608m) {
                paint.setColor(this.f17251r);
                this.f17235b.setStyle(Paint.Style.FILL);
            } else {
                paint.setColor(this.f17250q);
                this.f17235b.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            canvas.drawText(String.valueOf(cCharAt), width, (int) ((this.f17240g / 2) - ((this.f17235b.descent() + this.f17235b.ascent()) / 2.0f)), this.f17235b);
            width += this.f17241h + ((int) this.f17235b.measureText(String.valueOf(cCharAt)));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m29605i(int i, CharSequence charSequence) {
        boolean z = charSequence.length() >= this.f17233E.length();
        this.f17233E = charSequence;
        if (z) {
            int i2 = this.f17258y;
            if (i2 == 1) {
                return m29613r(i, charSequence);
            }
            if (i2 == 2) {
                return m29610o(i, charSequence);
            }
            if (i2 == 3) {
                return m29602f(i, charSequence);
            }
        } else {
            m29612q();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final String m29606k(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < this.f17242i; i2++) {
            if (i < charSequence.length()) {
                sb.append(charSequence.charAt(i));
                i++;
            } else {
                int i3 = this.f17258y;
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
    public final void m29607l() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f17242i)});
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f17249p);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f17235b = paint2;
        paint2.setAntiAlias(true);
        this.f17235b.setStrokeWidth(1.0f);
        this.f17235b.setTextSize(qa00.m175861f(18));
        Paint paint3 = new Paint();
        this.f17234a = paint3;
        paint3.setAntiAlias(true);
        this.f17234a.setColor(this.f17248o);
        this.f17234a.setStrokeWidth(this.f17243j);
        this.f17234a.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f17236c = paint4;
        paint4.setAntiAlias(true);
        this.f17236c.setColor(this.f17247n);
        this.f17236c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17236c.setStrokeWidth(this.f17246m);
        this.f17236c.setStrokeCap(Paint.Cap.ROUND);
        this.f17237d = new RectF();
        this.f17238e = new RectF();
        this.f17253t = m29606k("");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m29608m(char c) {
        return 'M' == c || 'D' == c || 'Y' == c;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m29609n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m29610o(int i, CharSequence charSequence) {
        f17227G = -1;
        Date dateM106277m = bsj0.m106277m(0);
        if (NullChecker.m82486a(null)) {
            if (i > 12) {
                throw null;
            }
            if (i > 1 || (i == 1 && charSequence.length() == 2)) {
                if (f17228H > 0 && m29600j(f17226F, i) < f17228H) {
                    throw null;
                }
                if (f17226F == this.f17231C.getYear() + Constants.UPNP_MULTICAST_PORT && i > this.f17231C.getMonth() + 1) {
                    throw null;
                }
                if (f17226F == this.f17232D.getYear() + Constants.UPNP_MULTICAST_PORT && i < this.f17232D.getMonth() + 1) {
                    throw null;
                }
            }
            if (f17228H > 0 && f17226F > 0 && (charSequence.length() == 2 || (i > 1 && charSequence.length() == 1))) {
                dateM106277m.setYear(f17226F - 1900);
                dateM106277m.setMonth(i == 0 ? 0 : i - 1);
                dateM106277m.setDate(f17228H);
                if (dateM106277m.after(this.f17231C) || dateM106277m.before(this.f17232D)) {
                    throw null;
                }
            }
            if (charSequence.length() == this.f17242i) {
                f17227G = i != 0 ? i - 1 : 0;
            }
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.m82486a(this.f17255v)) {
            this.f17255v = new Timer("DateEditTextNew-Thread");
        }
        this.f17255v.scheduleAtFixedRate(m29601e(), 0L, this.f17245l);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f17229A.setTarget(super.onCreateInputConnection(editorInfo));
        this.f17229A.m29687a(new C4793b.a() { // from class: l.j8c
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.C4793b.a
            /* JADX INFO: renamed from: a */
            public final boolean mo29688a() {
                return this.f118768a.m29609n();
            }
        });
        return this.f17229A;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17255v.cancel();
        this.f17255v = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        m29604h(canvas, this.f17253t);
        m29603g(canvas);
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
        int i5 = this.f17241h;
        int i6 = this.f17242i;
        this.f17239f = ((i - (i5 * (i6 + 1))) - (this.f17259z * 5)) / i6;
        this.f17240g = i2;
        this.f17237d.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            this.f17253t = m29606k("");
            this.f17254u = "";
            m29612q();
            invalidate();
            return;
        }
        try {
            this.f17230B = Integer.valueOf(charSequence.toString()).intValue();
        } catch (NumberFormatException unused) {
        }
        int i4 = this.f17230B;
        if (i4 != -1) {
            if (!m29605i(i4, charSequence) || "00".contentEquals(charSequence)) {
                if (!"00".contentEquals(charSequence)) {
                    throw null;
                }
                setText("0");
                throw null;
            }
            this.f17254u = charSequence.toString();
            this.f17253t = m29606k(charSequence.toString());
            int i5 = this.f17258y;
            if (i5 == 2) {
                if (this.f17230B <= 1 || charSequence.length() != 1) {
                    invalidate();
                    return;
                }
                String str = "0" + this.f17230B;
                this.f17254u = str;
                setText(str);
                return;
            }
            if (i5 != 3) {
                invalidate();
                return;
            }
            if (this.f17230B <= 3 || charSequence.length() != 1) {
                invalidate();
                return;
            }
            String str2 = "0" + this.f17230B;
            this.f17254u = str2;
            setText(str2);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m29611p(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw null;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m29612q() {
        int i = this.f17258y;
        if (i == 1) {
            f17226F = -1;
        } else if (i == 2) {
            f17227G = -1;
        } else if (i == 3) {
            f17228H = -1;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m29613r(int i, CharSequence charSequence) {
        f17226F = -1;
        Date dateM106277m = bsj0.m106277m(0);
        if (!NullChecker.m82486a(null)) {
            return true;
        }
        if (i < 10) {
            return m29611p(i, 1, 2);
        }
        if (i < 100) {
            return m29611p(i, (this.f17232D.getYear() + Constants.UPNP_MULTICAST_PORT) / 100, (this.f17231C.getYear() + Constants.UPNP_MULTICAST_PORT) / 100);
        }
        if (i < 1000) {
            return m29611p(i, (this.f17232D.getYear() + Constants.UPNP_MULTICAST_PORT) / 10, (this.f17231C.getYear() + Constants.UPNP_MULTICAST_PORT) / 10);
        }
        if ((f17228H > 0 && m29600j(i, f17227G + 1) < f17228H) || i < this.f17232D.getYear() + Constants.UPNP_MULTICAST_PORT || i > this.f17231C.getYear() + Constants.UPNP_MULTICAST_PORT) {
            throw null;
        }
        if (f17228H >= 0 && f17227G >= 0) {
            dateM106277m.setYear(i - 1900);
            dateM106277m.setMonth(f17227G);
            dateM106277m.setDate(f17228H);
            if (dateM106277m.after(this.f17231C) || dateM106277m.before(this.f17232D)) {
                throw null;
            }
        }
        if (charSequence.length() == this.f17242i) {
            f17226F = i;
        }
        return true;
    }

    public void setTextChangedListener(InterfaceC4785c interfaceC4785c) {
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.f17250q = i;
        postInvalidate();
    }

    public DateEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DateEditTextNew(Context context) {
        this(context, null);
    }
}
