package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import p149l.azk0;
import p149l.t100;
import p149l.u0c0;
import p149l.v2c0;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public final int f16568a;

    /* JADX INFO: renamed from: b */
    public final int f16569b;

    /* JADX INFO: renamed from: c */
    public final int f16570c;

    /* JADX INFO: renamed from: d */
    public final int f16571d;

    /* JADX INFO: renamed from: e */
    public final int f16572e;

    /* JADX INFO: renamed from: f */
    public final int f16573f;

    /* JADX INFO: renamed from: g */
    public final int f16574g;

    /* JADX INFO: renamed from: h */
    public final Paint f16575h;

    /* JADX INFO: renamed from: i */
    public final Paint f16576i;

    /* JADX INFO: renamed from: j */
    public final Paint f16577j;

    /* JADX INFO: renamed from: k */
    public Drawable f16578k;

    /* JADX INFO: renamed from: l */
    public Choreographer f16579l;

    /* JADX INFO: renamed from: m */
    public Choreographer.FrameCallback f16580m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4639a f16581n;

    /* JADX INFO: renamed from: o */
    public long f16582o;

    /* JADX INFO: renamed from: p */
    public StringBuilder f16583p;

    /* JADX INFO: renamed from: q */
    public C4643c f16584q;

    /* JADX INFO: renamed from: r */
    public azk0 f16585r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.VerifyCodeView$a */
    public interface InterfaceC4639a {
        /* JADX INFO: renamed from: a */
        void mo28648a(String str);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16568a = t100.f167231F;
        this.f16569b = t100.f167236K;
        this.f16570c = t100.f167260i;
        this.f16571d = t100.f167271t;
        this.f16572e = t100.f167255d;
        int i2 = t100.f167273v;
        this.f16573f = i2;
        this.f16574g = i2;
        this.f16575h = new Paint();
        this.f16576i = new Paint();
        this.f16577j = new Paint(1);
        this.f16579l = Choreographer.getInstance();
        this.f16583p = new StringBuilder();
        m28644e();
    }

    /* JADX INFO: renamed from: c */
    public final void m28642c(Canvas canvas) {
        int length = this.f16583p.length();
        Paint.FontMetricsInt fontMetricsInt = this.f16577j.getFontMetricsInt();
        int i = ((this.f16569b / 2) - (fontMetricsInt.ascent / 2)) - (fontMetricsInt.descent / 2);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = this.f16568a;
            int i4 = this.f16570c;
            int i5 = ((i3 + i4) * i2) + (i3 / 2);
            if (i2 < length) {
                float f = i5;
                int i6 = this.f16571d;
                canvas.drawLine(f, i6, f, this.f16569b - i6, this.f16575h);
                canvas.drawText(this.f16583p.toString(), i2, i2 + 1, f, i - t100.f167254c, this.f16577j);
            } else {
                float f2 = (i3 + i4) * i2;
                float f3 = ((i4 + i3) * i2) + i3;
                float f4 = this.f16569b;
                int i7 = this.f16571d;
                canvas.drawRoundRect(f2, 0.0f, f3, f4, i7, i7, this.f16576i);
                if (i2 == length && isFocused() && m28647h()) {
                    int i8 = this.f16569b / 2;
                    Drawable drawable = this.f16578k;
                    int i9 = this.f16572e;
                    int i10 = this.f16573f;
                    drawable.setBounds(i5 - (i9 / 2), i8 - (i10 / 2), i5 + (i9 / 2), i8 + (i10 / 2));
                    this.f16578k.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputConnection m28643d(EditorInfo editorInfo, final boolean z) {
        if (NullChecker.m81303a(this.f16584q)) {
            return this.f16584q;
        }
        C4643c c4643c = new C4643c(this, false);
        this.f16584q = c4643c;
        c4643c.m28690a(new C4643c.a() { // from class: l.czk0
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.C4643c.a
            public final boolean commitText(CharSequence charSequence, int i) {
                return this.f83095a.m28645f(z, charSequence, i);
            }
        });
        return this.f16584q;
    }

    /* JADX INFO: renamed from: e */
    public final void m28644e() {
        this.f16575h.setColor(getResources().getColor(u0c0.f172889j));
        this.f16575h.setStrokeWidth(this.f16568a);
        this.f16575h.setAntiAlias(true);
        this.f16575h.setDither(true);
        this.f16575h.setStrokeCap(Paint.Cap.ROUND);
        this.f16576i.setColor(getResources().getColor(u0c0.f172888i));
        this.f16576i.setStrokeWidth(t100.f167255d);
        this.f16576i.setAntiAlias(true);
        this.f16576i.setDither(true);
        this.f16576i.setStyle(Paint.Style.STROKE);
        this.f16577j.setColor(getResources().getColor(u0c0.f172891l));
        this.f16577j.setAntiAlias(true);
        this.f16577j.setDither(true);
        this.f16577j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f16577j.setTextAlign(Paint.Align.CENTER);
        this.f16577j.setTextSize(this.f16574g);
        this.f16578k = getResources().getDrawable(v2c0.f179517v1);
        this.f16580m = new Choreographer.FrameCallback() { // from class: l.bzk0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f78042a.m28646g(j);
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m28645f(boolean z, CharSequence charSequence, int i) {
        if (!Pattern.matches("[0-9]", charSequence) && !Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            return true;
        }
        if (z && Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            if (this.f16585r.m99710o1()) {
                zvf0.m220371D("e_verification_code_auto_fill", "p_login_verification_code", vwb.m200311Y("verification_code_scene", "phone"));
            } else if (this.f16585r.m99711p1()) {
                zvf0.m220371D("e_verification_code_auto_fill", "p_new_device_passwordlogin_verify_view", vwb.m200311Y("verification_code_scene", "password_new_device"));
            } else {
                zvf0.m220371D("e_verification_code_auto_fill", "", vwb.m200311Y("verification_code_scene", "other"));
            }
        }
        this.f16583p.append(charSequence);
        if (NullChecker.m81303a(this.f16581n)) {
            this.f16581n.mo28648a(charSequence.toString());
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m28646g(long j) {
        invalidate();
        this.f16579l.postFrameCallback(this.f16580m);
    }

    public azk0 getPresenter() {
        return this.f16585r;
    }

    public String getText() {
        return this.f16583p.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28647h() {
        return (SystemClock.uptimeMillis() - this.f16582o) % 1000 < 500;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16579l.postFrameCallback(this.f16580m);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        return m28643d(editorInfo, false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f16579l.removeFrameCallback(this.f16580m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m28642c(canvas);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f16582o = SystemClock.uptimeMillis();
        Choreographer choreographer = this.f16579l;
        if (z) {
            choreographer.postFrameCallback(this.f16580m);
        } else {
            choreographer.removeFrameCallback(this.f16580m);
            invalidate();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            if (this.f16583p.length() > 0) {
                StringBuilder sb = this.f16583p;
                sb.deleteCharAt(sb.length() - 1);
                if (NullChecker.m81303a(this.f16581n)) {
                    this.f16581n.mo28648a(this.f16583p.toString());
                }
            }
        } else if (i >= 7 && i <= 16 && this.f16583p.length() < 4) {
            this.f16583p.append(i - 7);
            if (NullChecker.m81303a(this.f16581n)) {
                this.f16581n.mo28648a(this.f16583p.toString());
            }
        }
        if (i == 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 0) {
            return true;
        }
        requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 2);
        return true;
    }

    public void setPresenter(azk0 azk0Var) {
        this.f16585r = azk0Var;
    }

    public void setText(String str) {
        this.f16583p = new StringBuilder(str);
        if (NullChecker.m81303a(this.f16581n)) {
            this.f16581n.mo28648a(str);
        }
        invalidate();
    }

    public void setTextChangeListener(InterfaceC4639a interfaceC4639a) {
        this.f16581n = interfaceC4639a;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerifyCodeView(Context context) {
        this(context, null);
    }
}
