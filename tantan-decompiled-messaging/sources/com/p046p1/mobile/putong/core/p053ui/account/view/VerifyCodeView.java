package com.p046p1.mobile.putong.core.p053ui.account.view;

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
import p149l.c1c0;
import p149l.d30;
import p149l.ig3;
import p149l.jfd0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public int f28277a;

    /* JADX INFO: renamed from: b */
    public int f28278b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f28279c;

    /* JADX INFO: renamed from: d */
    public Paint f28280d;

    /* JADX INFO: renamed from: e */
    public Paint f28281e;

    /* JADX INFO: renamed from: f */
    public Paint f28282f;

    /* JADX INFO: renamed from: g */
    public Typeface f28283g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8278a f28284h;

    /* JADX INFO: renamed from: i */
    public int f28285i;

    /* JADX INFO: renamed from: j */
    public int f28286j;

    /* JADX INFO: renamed from: k */
    public int f28287k;

    /* JADX INFO: renamed from: l */
    public int f28288l;

    /* JADX INFO: renamed from: m */
    public int f28289m;

    /* JADX INFO: renamed from: n */
    public int f28290n;

    /* JADX INFO: renamed from: o */
    public int f28291o;

    /* JADX INFO: renamed from: p */
    public PointF[] f28292p;

    /* JADX INFO: renamed from: q */
    public d30 f28293q;

    /* JADX INFO: renamed from: r */
    public int f28294r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.view.VerifyCodeView$a */
    public interface InterfaceC8278a {
        /* JADX INFO: renamed from: a */
        void mo44213a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.view.VerifyCodeView$b */
    public class C8279b extends BaseInputConnection {

        /* JADX INFO: renamed from: a */
        public View f28295a;

        public C8279b(View view, boolean z) {
            super(view, z);
            this.f28295a = view;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            this.f28295a.onKeyDown(67, new KeyEvent(2, 67));
            return super.deleteSurroundingText(i, i2);
        }
    }

    public VerifyCodeView(Context context) {
        super(context);
        this.f28283g = Typeface.DEFAULT;
        this.f28285i = getResources().getColor(c1c0.f78249f);
        this.f28286j = Color.parseColor("#3d000000");
        this.f28287k = getResources().getColor(c1c0.f78249f);
        this.f28288l = 4;
        this.f28291o = t100.m186890d(3.0f);
        m44212c(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m44210a(int i) {
        this.f28292p = new PointF[i];
        for (int i2 = 1; i2 <= i; i2++) {
            PointF[] pointFArr = this.f28292p;
            int i3 = i2 - 1;
            int i4 = this.f28289m;
            int i5 = this.f28290n;
            pointFArr[i3] = new PointF((i3 * i4) + (i3 * i5), (i4 * i3) + (i5 * i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m44211b(Canvas canvas) {
        StringBuilder sb = this.f28279c;
        if (sb == null) {
            return;
        }
        int length = sb.length();
        Paint.FontMetricsInt fontMetricsInt = this.f28282f.getFontMetricsInt();
        int i = this.f28278b / 2;
        int i2 = fontMetricsInt.bottom;
        int i3 = (i + ((i2 - fontMetricsInt.top) / 2)) - i2;
        this.f28294r = this.f28291o + i3;
        for (int i4 = 0; i4 < this.f28288l; i4++) {
            if (length > i4) {
                canvas.drawText(this.f28279c.toString(), i4, i4 + 1, this.f28292p[i4].y - (this.f28290n / 2), i3 - 10, this.f28282f);
            }
            if (i4 == this.f28279c.length()) {
                PointF pointF = this.f28292p[i4];
                canvas.drawRoundRect(pointF.x, 0.0f, pointF.y, this.f28278b, t100.m186890d(2.0f), t100.m186890d(2.0f), this.f28281e);
            }
            int length2 = this.f28279c.length();
            Paint paint = this.f28280d;
            if (i4 <= length2) {
                paint.setColor(this.f28287k);
            } else {
                paint.setColor(this.f28286j);
            }
            PointF pointF2 = this.f28292p[i4];
            float f = pointF2.x;
            int i5 = this.f28291o;
            float f2 = f + (i5 / 2);
            int i6 = this.f28278b;
            canvas.drawLine(f2, i6 - (i5 / 2), pointF2.y - (i5 / 2), i6 - (i5 / 2), this.f28280d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44212c(Context context, AttributeSet attributeSet) {
        if (this.f28279c == null) {
            this.f28279c = new StringBuilder();
        }
        Paint paint = new Paint();
        this.f28280d = paint;
        paint.setAntiAlias(true);
        this.f28280d.setStrokeWidth(this.f28291o);
        this.f28280d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f28281e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f28281e.setColor(Color.parseColor("#14d2432e"));
        this.f28281e.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f28282f = paint3;
        paint3.setColor(this.f28285i);
        this.f28282f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f28282f.setTextAlign(Paint.Align.CENTER);
        this.f28282f.setTypeface(this.f28283g);
        setFocusableInTouchMode(true);
    }

    public int getNumberSize() {
        return this.f28288l;
    }

    public String getText() {
        StringBuilder sb = this.f28279c;
        return sb != null ? sb.toString() : "";
    }

    public int getTextColor() {
        return this.f28285i;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C8279b c8279b = new C8279b(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        editorInfo.imeOptions = 5;
        return c8279b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m44211b(canvas);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f28279c == null) {
            this.f28279c = new StringBuilder();
        }
        if (i == 67 && this.f28279c.length() > 0) {
            StringBuilder sb = this.f28279c;
            sb.deleteCharAt(sb.length() - 1);
            if (NullChecker.m81303a(this.f28284h)) {
                this.f28284h.mo44213a(this.f28279c.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.f28279c.length() < this.f28288l) {
            this.f28279c.append(i - 7);
            if (NullChecker.m81303a(this.f28284h)) {
                this.f28284h.mo44213a(this.f28279c.toString());
            }
            invalidate();
        }
        if (this.f28279c.length() >= this.f28288l && i != 4 && NullChecker.m81303a(this.f28293q)) {
            this.f28293q.call();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f28277a = (t100.m186890d(48.0f) * 4) + (t100.m186890d(16.0f) * 3);
        this.f28278b = t100.m186890d(48.0f);
        int i3 = this.f28277a;
        int i4 = this.f28288l;
        this.f28289m = i3 / ((i4 * 4) - 1);
        this.f28290n = (i3 / ((i4 * 4) - 1)) * 3;
        if (NullChecker.m81304b(this.f28282f)) {
            this.f28282f.setTextSize(t100.m186892f(28));
        }
        m44210a(this.f28288l);
        setMeasuredDimension(this.f28277a, this.f28278b);
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
        this.f28283g = Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    public void setListener(InterfaceC8278a interfaceC8278a) {
        this.f28284h = interfaceC8278a;
    }

    public void setNumberSize(int i) {
        if (i >= 2) {
            this.f28288l = i;
        } else {
            ig3.m135964a("Text size must more than 1!");
        }
    }

    public void setOnCompleteAction(d30 d30Var) {
        this.f28293q = d30Var;
    }

    public void setText(String str) {
        if (str == null) {
            jfd0.m141176a("Code must not null!");
            return;
        }
        if (str.length() > 4) {
            ig3.m135964a("Code must less than 4 letters!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f28279c = sb;
        sb.append(str);
        invalidate();
        if (NullChecker.m81303a(this.f28284h)) {
            this.f28284h.mo44213a(this.f28279c.toString());
        }
        if (str.length() == 4 && NullChecker.m81303a(this.f28293q)) {
            this.f28293q.call();
        }
    }

    public void setTextColor(@ColorRes int i) {
        this.f28285i = i;
    }

    public void setFont(Typeface typeface) {
        this.f28283g = typeface;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28283g = Typeface.DEFAULT;
        this.f28285i = getResources().getColor(c1c0.f78249f);
        this.f28286j = Color.parseColor("#3d000000");
        this.f28287k = getResources().getColor(c1c0.f78249f);
        this.f28288l = 4;
        this.f28291o = t100.m186890d(3.0f);
        m44212c(context, attributeSet);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28283g = Typeface.DEFAULT;
        this.f28285i = getResources().getColor(c1c0.f78249f);
        this.f28286j = Color.parseColor("#3d000000");
        this.f28287k = getResources().getColor(c1c0.f78249f);
        this.f28288l = 4;
        this.f28291o = t100.m186890d(3.0f);
        m44212c(context, attributeSet);
    }

    @TargetApi(21)
    public VerifyCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f28283g = Typeface.DEFAULT;
        this.f28285i = getResources().getColor(c1c0.f78249f);
        this.f28286j = Color.parseColor("#3d000000");
        this.f28287k = getResources().getColor(c1c0.f78249f);
        this.f28288l = 4;
        this.f28291o = t100.m186890d(3.0f);
        m44212c(context, attributeSet);
    }
}
