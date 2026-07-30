package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorRes;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.ig3;
import l.jfd0;
import l.t100;
import p006l.u0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public String f444a;

    /* JADX INFO: renamed from: b */
    public int f445b;

    /* JADX INFO: renamed from: c */
    public int f446c;

    /* JADX INFO: renamed from: d */
    public StringBuilder f447d;

    /* JADX INFO: renamed from: e */
    public Paint f448e;

    /* JADX INFO: renamed from: f */
    public Paint f449f;

    /* JADX INFO: renamed from: g */
    public Paint f450g;

    /* JADX INFO: renamed from: h */
    public Typeface f451h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0053a f452i;

    /* JADX INFO: renamed from: j */
    public int f453j;

    /* JADX INFO: renamed from: k */
    public int f454k;

    /* JADX INFO: renamed from: l */
    public int f455l;

    /* JADX INFO: renamed from: m */
    public int f456m;

    /* JADX INFO: renamed from: n */
    public int f457n;

    /* JADX INFO: renamed from: o */
    public int f458o;

    /* JADX INFO: renamed from: p */
    public int f459p;

    /* JADX INFO: renamed from: q */
    public PointF[] f460q;

    /* JADX INFO: renamed from: r */
    public d30 f461r;

    /* JADX INFO: renamed from: s */
    public int f462s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.VerifyCodeView$a */
    public interface InterfaceC0053a {
        /* JADX INFO: renamed from: a */
        void mo426a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.VerifyCodeView$b */
    public class C0054b extends BaseInputConnection {

        /* JADX INFO: renamed from: a */
        public View f463a;

        public C0054b(View view, boolean z) {
            super(view, z);
            this.f463a = view;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            this.f463a.onKeyDown(67, new KeyEvent(2, 67));
            return super.deleteSurroundingText(i, i2);
        }
    }

    public VerifyCodeView(Context context) {
        super(context);
        this.f444a = "VerifyCodeView";
        this.f451h = Typeface.DEFAULT;
        this.f453j = getResources().getColor(u0c0.f22403j);
        this.f454k = Color.parseColor("#3d000000");
        this.f455l = getResources().getColor(u0c0.f22403j);
        this.f456m = 4;
        this.f459p = t100.d(3.0f);
        m425d(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m422a(int i) {
        this.f460q = new PointF[i];
        for (int i2 = 1; i2 <= i; i2++) {
            PointF[] pointFArr = this.f460q;
            int i3 = i2 - 1;
            int i4 = this.f457n;
            int i5 = this.f458o;
            pointFArr[i3] = new PointF((i3 * i4) + (i3 * i5), (i4 * i3) + (i5 * i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m423b(Canvas canvas) {
        StringBuilder sb = this.f447d;
        if (sb == null) {
            return;
        }
        int length = sb.length();
        Paint.FontMetricsInt fontMetricsInt = this.f450g.getFontMetricsInt();
        int i = this.f446c / 2;
        int i2 = fontMetricsInt.bottom;
        int i3 = (i + ((i2 - fontMetricsInt.top) / 2)) - i2;
        this.f462s = this.f459p + i3;
        for (int i4 = 0; i4 < this.f456m; i4++) {
            if (length > i4) {
                canvas.drawText(this.f447d.toString(), i4, i4 + 1, this.f460q[i4].y - (this.f458o / 2), i3 - 10, this.f450g);
            }
            if (i4 == this.f447d.length()) {
                PointF pointF = this.f460q[i4];
                canvas.drawRoundRect(pointF.x, 0.0f, pointF.y, this.f446c, t100.d(2.0f), t100.d(2.0f), this.f449f);
            }
            int length2 = this.f447d.length();
            Paint paint = this.f448e;
            if (i4 <= length2) {
                paint.setColor(this.f455l);
            } else {
                paint.setColor(this.f454k);
            }
            PointF pointF2 = this.f460q[i4];
            float f = pointF2.x;
            int i5 = this.f459p;
            float f2 = f + (i5 / 2);
            int i6 = this.f446c;
            canvas.drawLine(f2, i6 - (i5 / 2), pointF2.y - (i5 / 2), i6 - (i5 / 2), this.f448e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m424c() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getApplicationWindowToken(), 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m425d(Context context, AttributeSet attributeSet) {
        if (this.f447d == null) {
            this.f447d = new StringBuilder();
        }
        Paint paint = new Paint();
        this.f448e = paint;
        paint.setAntiAlias(true);
        this.f448e.setStrokeWidth(this.f459p);
        this.f448e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f449f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f449f.setColor(Color.parseColor("#14d2432e"));
        this.f449f.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f450g = paint3;
        paint3.setColor(this.f453j);
        this.f450g.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f450g.setTextAlign(Paint.Align.CENTER);
        this.f450g.setTypeface(this.f451h);
        setFocusableInTouchMode(true);
    }

    public int getNumberSize() {
        return this.f456m;
    }

    public String getText() {
        StringBuilder sb = this.f447d;
        return sb != null ? sb.toString() : "";
    }

    public int getTextColor() {
        return this.f453j;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C0054b c0054b = new C0054b(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        editorInfo.imeOptions = 5;
        return c0054b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m423b(canvas);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f447d == null) {
            this.f447d = new StringBuilder();
        }
        if (i == 67 && this.f447d.length() > 0) {
            StringBuilder sb = this.f447d;
            sb.deleteCharAt(sb.length() - 1);
            if (NullChecker.a(this.f452i)) {
                this.f452i.mo426a(this.f447d.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.f447d.length() < this.f456m) {
            this.f447d.append(i - 7);
            if (NullChecker.a(this.f452i)) {
                this.f452i.mo426a(this.f447d.toString());
            }
            invalidate();
        }
        if (this.f447d.length() >= this.f456m && i != 4 && NullChecker.a(this.f461r)) {
            this.f461r.call();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f445b = (t100.d(48.0f) * 4) + (t100.d(16.0f) * 3);
        this.f446c = t100.d(48.0f);
        int i3 = this.f445b;
        int i4 = this.f456m;
        this.f457n = i3 / ((i4 * 4) - 1);
        this.f458o = (i3 / ((i4 * 4) - 1)) * 3;
        if (NullChecker.c(this.f450g, "account", CrashHelper.ReportLevel.p9)) {
            this.f450g.setTextSize(t100.f(28));
        }
        m422a(this.f456m);
        setMeasuredDimension(this.f445b, this.f446c);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        requestFocus();
        if (motionEvent.getAction() != 0) {
            return true;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 2);
        return true;
    }

    public void setFont(String str) {
        this.f451h = Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    public void setListener(InterfaceC0053a interfaceC0053a) {
        this.f452i = interfaceC0053a;
    }

    public void setNumberSize(int i) {
        if (i >= 2) {
            this.f456m = i;
        } else {
            ig3.a("Text size must more than 1!");
        }
    }

    public void setOnCompleteAction(d30 d30Var) {
        this.f461r = d30Var;
    }

    public void setText(String str) {
        if (str == null) {
            jfd0.a("Code must not null!");
            return;
        }
        if (str.length() > 4) {
            ig3.a("Code must less than 4 letters!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f447d = sb;
        sb.append(str);
        invalidate();
        if (NullChecker.a(this.f452i)) {
            this.f452i.mo426a(this.f447d.toString());
        }
        if (str.length() == 4 && NullChecker.a(this.f461r)) {
            this.f461r.call();
        }
    }

    public void setTextColor(@ColorRes int i) {
        this.f453j = i;
    }

    public void setFont(Typeface typeface) {
        this.f451h = typeface;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f444a = "VerifyCodeView";
        this.f451h = Typeface.DEFAULT;
        this.f453j = getResources().getColor(u0c0.f22403j);
        this.f454k = Color.parseColor("#3d000000");
        this.f455l = getResources().getColor(u0c0.f22403j);
        this.f456m = 4;
        this.f459p = t100.d(3.0f);
        m425d(context, attributeSet);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f444a = "VerifyCodeView";
        this.f451h = Typeface.DEFAULT;
        this.f453j = getResources().getColor(u0c0.f22403j);
        this.f454k = Color.parseColor("#3d000000");
        this.f455l = getResources().getColor(u0c0.f22403j);
        this.f456m = 4;
        this.f459p = t100.d(3.0f);
        m425d(context, attributeSet);
    }

    @TargetApi(21)
    public VerifyCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f444a = "VerifyCodeView";
        this.f451h = Typeface.DEFAULT;
        this.f453j = getResources().getColor(u0c0.f22403j);
        this.f454k = Color.parseColor("#3d000000");
        this.f455l = getResources().getColor(u0c0.f22403j);
        this.f456m = 4;
        this.f459p = t100.d(3.0f);
        m425d(context, attributeSet);
    }
}
