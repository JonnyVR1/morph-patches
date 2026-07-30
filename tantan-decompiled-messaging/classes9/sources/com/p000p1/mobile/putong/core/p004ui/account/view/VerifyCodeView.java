package com.p000p1.mobile.putong.core.p004ui.account.view;

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
import com.tantanapp.common.utils.NullChecker;
import l.c1c0;
import l.d30;
import l.ig3;
import l.jfd0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public int f4344a;

    /* JADX INFO: renamed from: b */
    public int f4345b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f4346c;

    /* JADX INFO: renamed from: d */
    public Paint f4347d;

    /* JADX INFO: renamed from: e */
    public Paint f4348e;

    /* JADX INFO: renamed from: f */
    public Paint f4349f;

    /* JADX INFO: renamed from: g */
    public Typeface f4350g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0194a f4351h;

    /* JADX INFO: renamed from: i */
    public int f4352i;

    /* JADX INFO: renamed from: j */
    public int f4353j;

    /* JADX INFO: renamed from: k */
    public int f4354k;

    /* JADX INFO: renamed from: l */
    public int f4355l;

    /* JADX INFO: renamed from: m */
    public int f4356m;

    /* JADX INFO: renamed from: n */
    public int f4357n;

    /* JADX INFO: renamed from: o */
    public int f4358o;

    /* JADX INFO: renamed from: p */
    public PointF[] f4359p;

    /* JADX INFO: renamed from: q */
    public d30 f4360q;

    /* JADX INFO: renamed from: r */
    public int f4361r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.view.VerifyCodeView$a */
    public interface InterfaceC0194a {
        /* JADX INFO: renamed from: a */
        void m7161a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.view.VerifyCodeView$b */
    public class C0195b extends BaseInputConnection {

        /* JADX INFO: renamed from: a */
        public View f4362a;

        public C0195b(View view, boolean z) {
            super(view, z);
            this.f4362a = view;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            this.f4362a.onKeyDown(67, new KeyEvent(2, 67));
            return super.deleteSurroundingText(i, i2);
        }
    }

    public VerifyCodeView(Context context) {
        super(context);
        this.f4350g = Typeface.DEFAULT;
        this.f4352i = getResources().getColor(c1c0.f);
        this.f4353j = Color.parseColor("#3d000000");
        this.f4354k = getResources().getColor(c1c0.f);
        this.f4355l = 4;
        this.f4358o = t100.d(3.0f);
        m7160c(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m7158a(int i) {
        this.f4359p = new PointF[i];
        for (int i2 = 1; i2 <= i; i2++) {
            PointF[] pointFArr = this.f4359p;
            int i3 = i2 - 1;
            int i4 = this.f4356m;
            int i5 = this.f4357n;
            pointFArr[i3] = new PointF((i3 * i4) + (i3 * i5), (i4 * i3) + (i5 * i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7159b(Canvas canvas) {
        StringBuilder sb = this.f4346c;
        if (sb == null) {
            return;
        }
        int length = sb.length();
        Paint.FontMetricsInt fontMetricsInt = this.f4349f.getFontMetricsInt();
        int i = this.f4345b / 2;
        int i2 = fontMetricsInt.bottom;
        int i3 = (i + ((i2 - fontMetricsInt.top) / 2)) - i2;
        this.f4361r = this.f4358o + i3;
        for (int i4 = 0; i4 < this.f4355l; i4++) {
            if (length > i4) {
                canvas.drawText(this.f4346c.toString(), i4, i4 + 1, this.f4359p[i4].y - (this.f4357n / 2), i3 - 10, this.f4349f);
            }
            if (i4 == this.f4346c.length()) {
                PointF pointF = this.f4359p[i4];
                canvas.drawRoundRect(pointF.x, 0.0f, pointF.y, this.f4345b, t100.d(2.0f), t100.d(2.0f), this.f4348e);
            }
            int length2 = this.f4346c.length();
            Paint paint = this.f4347d;
            if (i4 <= length2) {
                paint.setColor(this.f4354k);
            } else {
                paint.setColor(this.f4353j);
            }
            PointF pointF2 = this.f4359p[i4];
            float f = pointF2.x;
            int i5 = this.f4358o;
            float f2 = f + (i5 / 2);
            int i6 = this.f4345b;
            canvas.drawLine(f2, i6 - (i5 / 2), pointF2.y - (i5 / 2), i6 - (i5 / 2), this.f4347d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7160c(Context context, AttributeSet attributeSet) {
        if (this.f4346c == null) {
            this.f4346c = new StringBuilder();
        }
        Paint paint = new Paint();
        this.f4347d = paint;
        paint.setAntiAlias(true);
        this.f4347d.setStrokeWidth(this.f4358o);
        this.f4347d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f4348e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f4348e.setColor(Color.parseColor("#14d2432e"));
        this.f4348e.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f4349f = paint3;
        paint3.setColor(this.f4352i);
        this.f4349f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f4349f.setTextAlign(Paint.Align.CENTER);
        this.f4349f.setTypeface(this.f4350g);
        setFocusableInTouchMode(true);
    }

    public int getNumberSize() {
        return this.f4355l;
    }

    public String getText() {
        StringBuilder sb = this.f4346c;
        return sb != null ? sb.toString() : "";
    }

    public int getTextColor() {
        return this.f4352i;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C0195b c0195b = new C0195b(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        editorInfo.imeOptions = 5;
        return c0195b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m7159b(canvas);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f4346c == null) {
            this.f4346c = new StringBuilder();
        }
        if (i == 67 && this.f4346c.length() > 0) {
            StringBuilder sb = this.f4346c;
            sb.deleteCharAt(sb.length() - 1);
            if (NullChecker.a(this.f4351h)) {
                this.f4351h.m7161a(this.f4346c.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.f4346c.length() < this.f4355l) {
            this.f4346c.append(i - 7);
            if (NullChecker.a(this.f4351h)) {
                this.f4351h.m7161a(this.f4346c.toString());
            }
            invalidate();
        }
        if (this.f4346c.length() >= this.f4355l && i != 4 && NullChecker.a(this.f4360q)) {
            this.f4360q.call();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4344a = (t100.d(48.0f) * 4) + (t100.d(16.0f) * 3);
        this.f4345b = t100.d(48.0f);
        int i3 = this.f4344a;
        int i4 = this.f4355l;
        this.f4356m = i3 / ((i4 * 4) - 1);
        this.f4357n = (i3 / ((i4 * 4) - 1)) * 3;
        if (NullChecker.b(this.f4349f)) {
            this.f4349f.setTextSize(t100.f(28));
        }
        m7158a(this.f4355l);
        setMeasuredDimension(this.f4344a, this.f4345b);
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
        this.f4350g = Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    public void setListener(InterfaceC0194a interfaceC0194a) {
        this.f4351h = interfaceC0194a;
    }

    public void setNumberSize(int i) {
        if (i >= 2) {
            this.f4355l = i;
        } else {
            ig3.a("Text size must more than 1!");
        }
    }

    public void setOnCompleteAction(d30 d30Var) {
        this.f4360q = d30Var;
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
        this.f4346c = sb;
        sb.append(str);
        invalidate();
        if (NullChecker.a(this.f4351h)) {
            this.f4351h.m7161a(this.f4346c.toString());
        }
        if (str.length() == 4 && NullChecker.a(this.f4360q)) {
            this.f4360q.call();
        }
    }

    public void setTextColor(@ColorRes int i) {
        this.f4352i = i;
    }

    public void setFont(Typeface typeface) {
        this.f4350g = typeface;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4350g = Typeface.DEFAULT;
        this.f4352i = getResources().getColor(c1c0.f);
        this.f4353j = Color.parseColor("#3d000000");
        this.f4354k = getResources().getColor(c1c0.f);
        this.f4355l = 4;
        this.f4358o = t100.d(3.0f);
        m7160c(context, attributeSet);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4350g = Typeface.DEFAULT;
        this.f4352i = getResources().getColor(c1c0.f);
        this.f4353j = Color.parseColor("#3d000000");
        this.f4354k = getResources().getColor(c1c0.f);
        this.f4355l = 4;
        this.f4358o = t100.d(3.0f);
        m7160c(context, attributeSet);
    }

    @TargetApi(21)
    public VerifyCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4350g = Typeface.DEFAULT;
        this.f4352i = getResources().getColor(c1c0.f);
        this.f4353j = Color.parseColor("#3d000000");
        this.f4354k = getResources().getColor(c1c0.f);
        this.f4355l = 4;
        this.f4358o = t100.d(3.0f);
        m7160c(context, attributeSet);
    }
}
