package com.p046p1.mobile.putong.account.p050ui.accountnew;

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
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.ig3;
import p149l.jfd0;
import p149l.t100;
import p149l.u0c0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public String f16455a;

    /* JADX INFO: renamed from: b */
    public int f16456b;

    /* JADX INFO: renamed from: c */
    public int f16457c;

    /* JADX INFO: renamed from: d */
    public StringBuilder f16458d;

    /* JADX INFO: renamed from: e */
    public Paint f16459e;

    /* JADX INFO: renamed from: f */
    public Paint f16460f;

    /* JADX INFO: renamed from: g */
    public Paint f16461g;

    /* JADX INFO: renamed from: h */
    public Typeface f16462h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4627a f16463i;

    /* JADX INFO: renamed from: j */
    public int f16464j;

    /* JADX INFO: renamed from: k */
    public int f16465k;

    /* JADX INFO: renamed from: l */
    public int f16466l;

    /* JADX INFO: renamed from: m */
    public int f16467m;

    /* JADX INFO: renamed from: n */
    public int f16468n;

    /* JADX INFO: renamed from: o */
    public int f16469o;

    /* JADX INFO: renamed from: p */
    public int f16470p;

    /* JADX INFO: renamed from: q */
    public PointF[] f16471q;

    /* JADX INFO: renamed from: r */
    public d30 f16472r;

    /* JADX INFO: renamed from: s */
    public int f16473s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.VerifyCodeView$a */
    public interface InterfaceC4627a {
        /* JADX INFO: renamed from: a */
        void mo28530a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.VerifyCodeView$b */
    public class C4628b extends BaseInputConnection {

        /* JADX INFO: renamed from: a */
        public View f16474a;

        public C4628b(View view, boolean z) {
            super(view, z);
            this.f16474a = view;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            this.f16474a.onKeyDown(67, new KeyEvent(2, 67));
            return super.deleteSurroundingText(i, i2);
        }
    }

    public VerifyCodeView(Context context) {
        super(context);
        this.f16455a = "VerifyCodeView";
        this.f16462h = Typeface.DEFAULT;
        this.f16464j = getResources().getColor(u0c0.f172889j);
        this.f16465k = Color.parseColor("#3d000000");
        this.f16466l = getResources().getColor(u0c0.f172889j);
        this.f16467m = 4;
        this.f16470p = t100.m186890d(3.0f);
        m28529d(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m28526a(int i) {
        this.f16471q = new PointF[i];
        for (int i2 = 1; i2 <= i; i2++) {
            PointF[] pointFArr = this.f16471q;
            int i3 = i2 - 1;
            int i4 = this.f16468n;
            int i5 = this.f16469o;
            pointFArr[i3] = new PointF((i3 * i4) + (i3 * i5), (i4 * i3) + (i5 * i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m28527b(Canvas canvas) {
        StringBuilder sb = this.f16458d;
        if (sb == null) {
            return;
        }
        int length = sb.length();
        Paint.FontMetricsInt fontMetricsInt = this.f16461g.getFontMetricsInt();
        int i = this.f16457c / 2;
        int i2 = fontMetricsInt.bottom;
        int i3 = (i + ((i2 - fontMetricsInt.top) / 2)) - i2;
        this.f16473s = this.f16470p + i3;
        for (int i4 = 0; i4 < this.f16467m; i4++) {
            if (length > i4) {
                canvas.drawText(this.f16458d.toString(), i4, i4 + 1, this.f16471q[i4].y - (this.f16469o / 2), i3 - 10, this.f16461g);
            }
            if (i4 == this.f16458d.length()) {
                PointF pointF = this.f16471q[i4];
                canvas.drawRoundRect(pointF.x, 0.0f, pointF.y, this.f16457c, t100.m186890d(2.0f), t100.m186890d(2.0f), this.f16460f);
            }
            int length2 = this.f16458d.length();
            Paint paint = this.f16459e;
            if (i4 <= length2) {
                paint.setColor(this.f16466l);
            } else {
                paint.setColor(this.f16465k);
            }
            PointF pointF2 = this.f16471q[i4];
            float f = pointF2.x;
            int i5 = this.f16470p;
            float f2 = f + (i5 / 2);
            int i6 = this.f16457c;
            canvas.drawLine(f2, i6 - (i5 / 2), pointF2.y - (i5 / 2), i6 - (i5 / 2), this.f16459e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m28528c() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getApplicationWindowToken(), 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m28529d(Context context, AttributeSet attributeSet) {
        if (this.f16458d == null) {
            this.f16458d = new StringBuilder();
        }
        Paint paint = new Paint();
        this.f16459e = paint;
        paint.setAntiAlias(true);
        this.f16459e.setStrokeWidth(this.f16470p);
        this.f16459e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f16460f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f16460f.setColor(Color.parseColor("#14d2432e"));
        this.f16460f.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f16461g = paint3;
        paint3.setColor(this.f16464j);
        this.f16461g.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f16461g.setTextAlign(Paint.Align.CENTER);
        this.f16461g.setTypeface(this.f16462h);
        setFocusableInTouchMode(true);
    }

    public int getNumberSize() {
        return this.f16467m;
    }

    public String getText() {
        StringBuilder sb = this.f16458d;
        return sb != null ? sb.toString() : "";
    }

    public int getTextColor() {
        return this.f16464j;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C4628b c4628b = new C4628b(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        editorInfo.imeOptions = 5;
        return c4628b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m28527b(canvas);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f16458d == null) {
            this.f16458d = new StringBuilder();
        }
        if (i == 67 && this.f16458d.length() > 0) {
            StringBuilder sb = this.f16458d;
            sb.deleteCharAt(sb.length() - 1);
            if (NullChecker.m81303a(this.f16463i)) {
                this.f16463i.mo28530a(this.f16458d.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.f16458d.length() < this.f16467m) {
            this.f16458d.append(i - 7);
            if (NullChecker.m81303a(this.f16463i)) {
                this.f16463i.mo28530a(this.f16458d.toString());
            }
            invalidate();
        }
        if (this.f16458d.length() >= this.f16467m && i != 4 && NullChecker.m81303a(this.f16472r)) {
            this.f16472r.call();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16456b = (t100.m186890d(48.0f) * 4) + (t100.m186890d(16.0f) * 3);
        this.f16457c = t100.m186890d(48.0f);
        int i3 = this.f16456b;
        int i4 = this.f16467m;
        this.f16468n = i3 / ((i4 * 4) - 1);
        this.f16469o = (i3 / ((i4 * 4) - 1)) * 3;
        if (NullChecker.m81305c(this.f16461g, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            this.f16461g.setTextSize(t100.m186892f(28));
        }
        m28526a(this.f16467m);
        setMeasuredDimension(this.f16456b, this.f16457c);
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
        this.f16462h = Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    public void setListener(InterfaceC4627a interfaceC4627a) {
        this.f16463i = interfaceC4627a;
    }

    public void setNumberSize(int i) {
        if (i >= 2) {
            this.f16467m = i;
        } else {
            ig3.m135964a("Text size must more than 1!");
        }
    }

    public void setOnCompleteAction(d30 d30Var) {
        this.f16472r = d30Var;
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
        this.f16458d = sb;
        sb.append(str);
        invalidate();
        if (NullChecker.m81303a(this.f16463i)) {
            this.f16463i.mo28530a(this.f16458d.toString());
        }
        if (str.length() == 4 && NullChecker.m81303a(this.f16472r)) {
            this.f16472r.call();
        }
    }

    public void setTextColor(@ColorRes int i) {
        this.f16464j = i;
    }

    public void setFont(Typeface typeface) {
        this.f16462h = typeface;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16455a = "VerifyCodeView";
        this.f16462h = Typeface.DEFAULT;
        this.f16464j = getResources().getColor(u0c0.f172889j);
        this.f16465k = Color.parseColor("#3d000000");
        this.f16466l = getResources().getColor(u0c0.f172889j);
        this.f16467m = 4;
        this.f16470p = t100.m186890d(3.0f);
        m28529d(context, attributeSet);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16455a = "VerifyCodeView";
        this.f16462h = Typeface.DEFAULT;
        this.f16464j = getResources().getColor(u0c0.f172889j);
        this.f16465k = Color.parseColor("#3d000000");
        this.f16466l = getResources().getColor(u0c0.f172889j);
        this.f16467m = 4;
        this.f16470p = t100.m186890d(3.0f);
        m28529d(context, attributeSet);
    }

    @TargetApi(21)
    public VerifyCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f16455a = "VerifyCodeView";
        this.f16462h = Typeface.DEFAULT;
        this.f16464j = getResources().getColor(u0c0.f172889j);
        this.f16465k = Color.parseColor("#3d000000");
        this.f16466l = getResources().getColor(u0c0.f172889j);
        this.f16467m = 4;
        this.f16470p = t100.m186890d(3.0f);
        m28529d(context, attributeSet);
    }
}
