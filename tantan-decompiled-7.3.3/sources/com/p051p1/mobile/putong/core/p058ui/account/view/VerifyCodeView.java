package com.p051p1.mobile.putong.core.p058ui.account.view;

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
import p153l.j9c0;
import p153l.mnd0;
import p153l.qa00;
import p153l.wg3;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public int f29125a;

    /* JADX INFO: renamed from: b */
    public int f29126b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f29127c;

    /* JADX INFO: renamed from: d */
    public Paint f29128d;

    /* JADX INFO: renamed from: e */
    public Paint f29129e;

    /* JADX INFO: renamed from: f */
    public Paint f29130f;

    /* JADX INFO: renamed from: g */
    public Typeface f29131g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8441a f29132h;

    /* JADX INFO: renamed from: i */
    public int f29133i;

    /* JADX INFO: renamed from: j */
    public int f29134j;

    /* JADX INFO: renamed from: k */
    public int f29135k;

    /* JADX INFO: renamed from: l */
    public int f29136l;

    /* JADX INFO: renamed from: m */
    public int f29137m;

    /* JADX INFO: renamed from: n */
    public int f29138n;

    /* JADX INFO: renamed from: o */
    public int f29139o;

    /* JADX INFO: renamed from: p */
    public PointF[] f29140p;

    /* JADX INFO: renamed from: q */
    public x20 f29141q;

    /* JADX INFO: renamed from: r */
    public int f29142r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.view.VerifyCodeView$a */
    public interface InterfaceC8441a {
        /* JADX INFO: renamed from: a */
        void mo45396a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.view.VerifyCodeView$b */
    public class C8442b extends BaseInputConnection {

        /* JADX INFO: renamed from: a */
        public View f29143a;

        public C8442b(View view, boolean z) {
            super(view, z);
            this.f29143a = view;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            this.f29143a.onKeyDown(67, new KeyEvent(2, 67));
            return super.deleteSurroundingText(i, i2);
        }
    }

    public VerifyCodeView(Context context) {
        super(context);
        this.f29131g = Typeface.DEFAULT;
        this.f29133i = getResources().getColor(j9c0.f118869f);
        this.f29134j = Color.parseColor("#3d000000");
        this.f29135k = getResources().getColor(j9c0.f118869f);
        this.f29136l = 4;
        this.f29139o = qa00.m175859d(3.0f);
        m45395c(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m45393a(int i) {
        this.f29140p = new PointF[i];
        for (int i2 = 1; i2 <= i; i2++) {
            PointF[] pointFArr = this.f29140p;
            int i3 = i2 - 1;
            int i4 = this.f29137m;
            int i5 = this.f29138n;
            pointFArr[i3] = new PointF((i3 * i4) + (i3 * i5), (i4 * i3) + (i5 * i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m45394b(Canvas canvas) {
        StringBuilder sb = this.f29127c;
        if (sb == null) {
            return;
        }
        int length = sb.length();
        Paint.FontMetricsInt fontMetricsInt = this.f29130f.getFontMetricsInt();
        int i = this.f29126b / 2;
        int i2 = fontMetricsInt.bottom;
        int i3 = (i + ((i2 - fontMetricsInt.top) / 2)) - i2;
        this.f29142r = this.f29139o + i3;
        for (int i4 = 0; i4 < this.f29136l; i4++) {
            if (length > i4) {
                canvas.drawText(this.f29127c.toString(), i4, i4 + 1, this.f29140p[i4].y - (this.f29138n / 2), i3 - 10, this.f29130f);
            }
            if (i4 == this.f29127c.length()) {
                PointF pointF = this.f29140p[i4];
                canvas.drawRoundRect(pointF.x, 0.0f, pointF.y, this.f29126b, qa00.m175859d(2.0f), qa00.m175859d(2.0f), this.f29129e);
            }
            int length2 = this.f29127c.length();
            Paint paint = this.f29128d;
            if (i4 <= length2) {
                paint.setColor(this.f29135k);
            } else {
                paint.setColor(this.f29134j);
            }
            PointF pointF2 = this.f29140p[i4];
            float f = pointF2.x;
            int i5 = this.f29139o;
            float f2 = f + (i5 / 2);
            int i6 = this.f29126b;
            canvas.drawLine(f2, i6 - (i5 / 2), pointF2.y - (i5 / 2), i6 - (i5 / 2), this.f29128d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m45395c(Context context, AttributeSet attributeSet) {
        if (this.f29127c == null) {
            this.f29127c = new StringBuilder();
        }
        Paint paint = new Paint();
        this.f29128d = paint;
        paint.setAntiAlias(true);
        this.f29128d.setStrokeWidth(this.f29139o);
        this.f29128d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f29129e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f29129e.setColor(Color.parseColor("#14d2432e"));
        this.f29129e.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f29130f = paint3;
        paint3.setColor(this.f29133i);
        this.f29130f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f29130f.setTextAlign(Paint.Align.CENTER);
        this.f29130f.setTypeface(this.f29131g);
        setFocusableInTouchMode(true);
    }

    public int getNumberSize() {
        return this.f29136l;
    }

    public String getText() {
        StringBuilder sb = this.f29127c;
        return sb != null ? sb.toString() : "";
    }

    public int getTextColor() {
        return this.f29133i;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C8442b c8442b = new C8442b(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        editorInfo.imeOptions = 5;
        return c8442b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m45394b(canvas);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f29127c == null) {
            this.f29127c = new StringBuilder();
        }
        if (i == 67 && this.f29127c.length() > 0) {
            StringBuilder sb = this.f29127c;
            sb.deleteCharAt(sb.length() - 1);
            if (NullChecker.m82486a(this.f29132h)) {
                this.f29132h.mo45396a(this.f29127c.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.f29127c.length() < this.f29136l) {
            this.f29127c.append(i - 7);
            if (NullChecker.m82486a(this.f29132h)) {
                this.f29132h.mo45396a(this.f29127c.toString());
            }
            invalidate();
        }
        if (this.f29127c.length() >= this.f29136l && i != 4 && NullChecker.m82486a(this.f29141q)) {
            this.f29141q.call();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f29125a = (qa00.m175859d(48.0f) * 4) + (qa00.m175859d(16.0f) * 3);
        this.f29126b = qa00.m175859d(48.0f);
        int i3 = this.f29125a;
        int i4 = this.f29136l;
        this.f29137m = i3 / ((i4 * 4) - 1);
        this.f29138n = (i3 / ((i4 * 4) - 1)) * 3;
        if (NullChecker.m82487b(this.f29130f)) {
            this.f29130f.setTextSize(qa00.m175861f(28));
        }
        m45393a(this.f29136l);
        setMeasuredDimension(this.f29125a, this.f29126b);
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
        this.f29131g = Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    public void setListener(InterfaceC8441a interfaceC8441a) {
        this.f29132h = interfaceC8441a;
    }

    public void setNumberSize(int i) {
        if (i >= 2) {
            this.f29136l = i;
        } else {
            wg3.m206174a("Text size must more than 1!");
        }
    }

    public void setOnCompleteAction(x20 x20Var) {
        this.f29141q = x20Var;
    }

    public void setText(String str) {
        if (str == null) {
            mnd0.m159157a("Code must not null!");
            return;
        }
        if (str.length() > 4) {
            wg3.m206174a("Code must less than 4 letters!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f29127c = sb;
        sb.append(str);
        invalidate();
        if (NullChecker.m82486a(this.f29132h)) {
            this.f29132h.mo45396a(this.f29127c.toString());
        }
        if (str.length() == 4 && NullChecker.m82486a(this.f29141q)) {
            this.f29141q.call();
        }
    }

    public void setTextColor(@ColorRes int i) {
        this.f29133i = i;
    }

    public void setFont(Typeface typeface) {
        this.f29131g = typeface;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29131g = Typeface.DEFAULT;
        this.f29133i = getResources().getColor(j9c0.f118869f);
        this.f29134j = Color.parseColor("#3d000000");
        this.f29135k = getResources().getColor(j9c0.f118869f);
        this.f29136l = 4;
        this.f29139o = qa00.m175859d(3.0f);
        m45395c(context, attributeSet);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29131g = Typeface.DEFAULT;
        this.f29133i = getResources().getColor(j9c0.f118869f);
        this.f29134j = Color.parseColor("#3d000000");
        this.f29135k = getResources().getColor(j9c0.f118869f);
        this.f29136l = 4;
        this.f29139o = qa00.m175859d(3.0f);
        m45395c(context, attributeSet);
    }

    @TargetApi(21)
    public VerifyCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f29131g = Typeface.DEFAULT;
        this.f29133i = getResources().getColor(j9c0.f118869f);
        this.f29134j = Color.parseColor("#3d000000");
        this.f29135k = getResources().getColor(j9c0.f118869f);
        this.f29136l = 4;
        this.f29139o = qa00.m175859d(3.0f);
        m45395c(context, attributeSet);
    }
}
