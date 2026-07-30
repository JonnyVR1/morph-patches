package com.p051p1.mobile.putong.account.p055ui.accountnew;

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
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.a9c0;
import p153l.mnd0;
import p153l.qa00;
import p153l.wg3;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public String f17174a;

    /* JADX INFO: renamed from: b */
    public int f17175b;

    /* JADX INFO: renamed from: c */
    public int f17176c;

    /* JADX INFO: renamed from: d */
    public StringBuilder f17177d;

    /* JADX INFO: renamed from: e */
    public Paint f17178e;

    /* JADX INFO: renamed from: f */
    public Paint f17179f;

    /* JADX INFO: renamed from: g */
    public Paint f17180g;

    /* JADX INFO: renamed from: h */
    public Typeface f17181h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4778a f17182i;

    /* JADX INFO: renamed from: j */
    public int f17183j;

    /* JADX INFO: renamed from: k */
    public int f17184k;

    /* JADX INFO: renamed from: l */
    public int f17185l;

    /* JADX INFO: renamed from: m */
    public int f17186m;

    /* JADX INFO: renamed from: n */
    public int f17187n;

    /* JADX INFO: renamed from: o */
    public int f17188o;

    /* JADX INFO: renamed from: p */
    public int f17189p;

    /* JADX INFO: renamed from: q */
    public PointF[] f17190q;

    /* JADX INFO: renamed from: r */
    public x20 f17191r;

    /* JADX INFO: renamed from: s */
    public int f17192s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.VerifyCodeView$a */
    public interface InterfaceC4778a {
        /* JADX INFO: renamed from: a */
        void mo29529a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.VerifyCodeView$b */
    public class C4779b extends BaseInputConnection {

        /* JADX INFO: renamed from: a */
        public View f17193a;

        public C4779b(View view, boolean z) {
            super(view, z);
            this.f17193a = view;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            this.f17193a.onKeyDown(67, new KeyEvent(2, 67));
            return super.deleteSurroundingText(i, i2);
        }
    }

    public VerifyCodeView(Context context) {
        super(context);
        this.f17174a = "VerifyCodeView";
        this.f17181h = Typeface.DEFAULT;
        this.f17183j = getResources().getColor(a9c0.f69025j);
        this.f17184k = Color.parseColor("#3d000000");
        this.f17185l = getResources().getColor(a9c0.f69025j);
        this.f17186m = 4;
        this.f17189p = qa00.m175859d(3.0f);
        m29528d(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m29525a(int i) {
        this.f17190q = new PointF[i];
        for (int i2 = 1; i2 <= i; i2++) {
            PointF[] pointFArr = this.f17190q;
            int i3 = i2 - 1;
            int i4 = this.f17187n;
            int i5 = this.f17188o;
            pointFArr[i3] = new PointF((i3 * i4) + (i3 * i5), (i4 * i3) + (i5 * i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m29526b(Canvas canvas) {
        StringBuilder sb = this.f17177d;
        if (sb == null) {
            return;
        }
        int length = sb.length();
        Paint.FontMetricsInt fontMetricsInt = this.f17180g.getFontMetricsInt();
        int i = this.f17176c / 2;
        int i2 = fontMetricsInt.bottom;
        int i3 = (i + ((i2 - fontMetricsInt.top) / 2)) - i2;
        this.f17192s = this.f17189p + i3;
        for (int i4 = 0; i4 < this.f17186m; i4++) {
            if (length > i4) {
                canvas.drawText(this.f17177d.toString(), i4, i4 + 1, this.f17190q[i4].y - (this.f17188o / 2), i3 - 10, this.f17180g);
            }
            if (i4 == this.f17177d.length()) {
                PointF pointF = this.f17190q[i4];
                canvas.drawRoundRect(pointF.x, 0.0f, pointF.y, this.f17176c, qa00.m175859d(2.0f), qa00.m175859d(2.0f), this.f17179f);
            }
            int length2 = this.f17177d.length();
            Paint paint = this.f17178e;
            if (i4 <= length2) {
                paint.setColor(this.f17185l);
            } else {
                paint.setColor(this.f17184k);
            }
            PointF pointF2 = this.f17190q[i4];
            float f = pointF2.x;
            int i5 = this.f17189p;
            float f2 = f + (i5 / 2);
            int i6 = this.f17176c;
            canvas.drawLine(f2, i6 - (i5 / 2), pointF2.y - (i5 / 2), i6 - (i5 / 2), this.f17178e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m29527c() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getApplicationWindowToken(), 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m29528d(Context context, AttributeSet attributeSet) {
        if (this.f17177d == null) {
            this.f17177d = new StringBuilder();
        }
        Paint paint = new Paint();
        this.f17178e = paint;
        paint.setAntiAlias(true);
        this.f17178e.setStrokeWidth(this.f17189p);
        this.f17178e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f17179f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f17179f.setColor(Color.parseColor("#14d2432e"));
        this.f17179f.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f17180g = paint3;
        paint3.setColor(this.f17183j);
        this.f17180g.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17180g.setTextAlign(Paint.Align.CENTER);
        this.f17180g.setTypeface(this.f17181h);
        setFocusableInTouchMode(true);
    }

    public int getNumberSize() {
        return this.f17186m;
    }

    public String getText() {
        StringBuilder sb = this.f17177d;
        return sb != null ? sb.toString() : "";
    }

    public int getTextColor() {
        return this.f17183j;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C4779b c4779b = new C4779b(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        editorInfo.imeOptions = 5;
        return c4779b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m29526b(canvas);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f17177d == null) {
            this.f17177d = new StringBuilder();
        }
        if (i == 67 && this.f17177d.length() > 0) {
            StringBuilder sb = this.f17177d;
            sb.deleteCharAt(sb.length() - 1);
            if (NullChecker.m82486a(this.f17182i)) {
                this.f17182i.mo29529a(this.f17177d.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.f17177d.length() < this.f17186m) {
            this.f17177d.append(i - 7);
            if (NullChecker.m82486a(this.f17182i)) {
                this.f17182i.mo29529a(this.f17177d.toString());
            }
            invalidate();
        }
        if (this.f17177d.length() >= this.f17186m && i != 4 && NullChecker.m82486a(this.f17191r)) {
            this.f17191r.call();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f17175b = (qa00.m175859d(48.0f) * 4) + (qa00.m175859d(16.0f) * 3);
        this.f17176c = qa00.m175859d(48.0f);
        int i3 = this.f17175b;
        int i4 = this.f17186m;
        this.f17187n = i3 / ((i4 * 4) - 1);
        this.f17188o = (i3 / ((i4 * 4) - 1)) * 3;
        if (NullChecker.m82488c(this.f17180g, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            this.f17180g.setTextSize(qa00.m175861f(28));
        }
        m29525a(this.f17186m);
        setMeasuredDimension(this.f17175b, this.f17176c);
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
        this.f17181h = Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    public void setListener(InterfaceC4778a interfaceC4778a) {
        this.f17182i = interfaceC4778a;
    }

    public void setNumberSize(int i) {
        if (i >= 2) {
            this.f17186m = i;
        } else {
            wg3.m206174a("Text size must more than 1!");
        }
    }

    public void setOnCompleteAction(x20 x20Var) {
        this.f17191r = x20Var;
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
        this.f17177d = sb;
        sb.append(str);
        invalidate();
        if (NullChecker.m82486a(this.f17182i)) {
            this.f17182i.mo29529a(this.f17177d.toString());
        }
        if (str.length() == 4 && NullChecker.m82486a(this.f17191r)) {
            this.f17191r.call();
        }
    }

    public void setTextColor(@ColorRes int i) {
        this.f17183j = i;
    }

    public void setFont(Typeface typeface) {
        this.f17181h = typeface;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17174a = "VerifyCodeView";
        this.f17181h = Typeface.DEFAULT;
        this.f17183j = getResources().getColor(a9c0.f69025j);
        this.f17184k = Color.parseColor("#3d000000");
        this.f17185l = getResources().getColor(a9c0.f69025j);
        this.f17186m = 4;
        this.f17189p = qa00.m175859d(3.0f);
        m29528d(context, attributeSet);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17174a = "VerifyCodeView";
        this.f17181h = Typeface.DEFAULT;
        this.f17183j = getResources().getColor(a9c0.f69025j);
        this.f17184k = Color.parseColor("#3d000000");
        this.f17185l = getResources().getColor(a9c0.f69025j);
        this.f17186m = 4;
        this.f17189p = qa00.m175859d(3.0f);
        m29528d(context, attributeSet);
    }

    @TargetApi(21)
    public VerifyCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f17174a = "VerifyCodeView";
        this.f17181h = Typeface.DEFAULT;
        this.f17183j = getResources().getColor(a9c0.f69025j);
        this.f17184k = Color.parseColor("#3d000000");
        this.f17185l = getResources().getColor(a9c0.f69025j);
        this.f17186m = 4;
        this.f17189p = qa00.m175859d(3.0f);
        m29528d(context, attributeSet);
    }
}
