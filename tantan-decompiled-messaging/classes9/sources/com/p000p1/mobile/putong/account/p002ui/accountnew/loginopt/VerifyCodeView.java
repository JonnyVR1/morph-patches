package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

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
import l.j760;
import l.t100;
import l.vwb;
import l.zvf0;
import p006l.azk0;
import p006l.u0c0;
import p006l.v2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public final int f557a;

    /* JADX INFO: renamed from: b */
    public final int f558b;

    /* JADX INFO: renamed from: c */
    public final int f559c;

    /* JADX INFO: renamed from: d */
    public final int f560d;

    /* JADX INFO: renamed from: e */
    public final int f561e;

    /* JADX INFO: renamed from: f */
    public final int f562f;

    /* JADX INFO: renamed from: g */
    public final int f563g;

    /* JADX INFO: renamed from: h */
    public final Paint f564h;

    /* JADX INFO: renamed from: i */
    public final Paint f565i;

    /* JADX INFO: renamed from: j */
    public final Paint f566j;

    /* JADX INFO: renamed from: k */
    public Drawable f567k;

    /* JADX INFO: renamed from: l */
    public Choreographer f568l;

    /* JADX INFO: renamed from: m */
    public Choreographer.FrameCallback f569m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0065a f570n;

    /* JADX INFO: renamed from: o */
    public long f571o;

    /* JADX INFO: renamed from: p */
    public StringBuilder f572p;

    /* JADX INFO: renamed from: q */
    public C0069c f573q;

    /* JADX INFO: renamed from: r */
    public azk0 f574r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.VerifyCodeView$a */
    public interface InterfaceC0065a {
        /* JADX INFO: renamed from: a */
        void mo547a(String str);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f557a = t100.F;
        this.f558b = t100.K;
        this.f559c = t100.i;
        this.f560d = t100.t;
        this.f561e = t100.d;
        int i2 = t100.v;
        this.f562f = i2;
        this.f563g = i2;
        this.f564h = new Paint();
        this.f565i = new Paint();
        this.f566j = new Paint(1);
        this.f568l = Choreographer.getInstance();
        this.f572p = new StringBuilder();
        m543e();
    }

    /* JADX INFO: renamed from: c */
    public final void m541c(Canvas canvas) {
        int length = this.f572p.length();
        Paint.FontMetricsInt fontMetricsInt = this.f566j.getFontMetricsInt();
        int i = ((this.f558b / 2) - (fontMetricsInt.ascent / 2)) - (fontMetricsInt.descent / 2);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = this.f557a;
            int i4 = this.f559c;
            int i5 = ((i3 + i4) * i2) + (i3 / 2);
            if (i2 < length) {
                float f = i5;
                int i6 = this.f560d;
                canvas.drawLine(f, i6, f, this.f558b - i6, this.f564h);
                canvas.drawText(this.f572p.toString(), i2, i2 + 1, f, i - t100.c, this.f566j);
            } else {
                float f2 = (i3 + i4) * i2;
                float f3 = ((i4 + i3) * i2) + i3;
                float f4 = this.f558b;
                int i7 = this.f560d;
                canvas.drawRoundRect(f2, 0.0f, f3, f4, i7, i7, this.f565i);
                if (i2 == length && isFocused() && m546h()) {
                    int i8 = this.f558b / 2;
                    Drawable drawable = this.f567k;
                    int i9 = this.f561e;
                    int i10 = this.f562f;
                    drawable.setBounds(i5 - (i9 / 2), i8 - (i10 / 2), i5 + (i9 / 2), i8 + (i10 / 2));
                    this.f567k.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputConnection m542d(EditorInfo editorInfo, final boolean z) {
        if (NullChecker.a(this.f573q)) {
            return this.f573q;
        }
        C0069c c0069c = new C0069c(this, false);
        this.f573q = c0069c;
        c0069c.m589a(new C0069c.a() { // from class: l.czk0
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.C0069c.a
            public final boolean commitText(CharSequence charSequence, int i) {
                return this.f9948a.m544f(z, charSequence, i);
            }
        });
        return this.f573q;
    }

    /* JADX INFO: renamed from: e */
    public final void m543e() {
        this.f564h.setColor(getResources().getColor(u0c0.f22403j));
        this.f564h.setStrokeWidth(this.f557a);
        this.f564h.setAntiAlias(true);
        this.f564h.setDither(true);
        this.f564h.setStrokeCap(Paint.Cap.ROUND);
        this.f565i.setColor(getResources().getColor(u0c0.f22402i));
        this.f565i.setStrokeWidth(t100.d);
        this.f565i.setAntiAlias(true);
        this.f565i.setDither(true);
        this.f565i.setStyle(Paint.Style.STROKE);
        this.f566j.setColor(getResources().getColor(u0c0.f22405l));
        this.f566j.setAntiAlias(true);
        this.f566j.setDither(true);
        this.f566j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f566j.setTextAlign(Paint.Align.CENTER);
        this.f566j.setTextSize(this.f563g);
        this.f567k = getResources().getDrawable(v2c0.f24081v1);
        this.f569m = new Choreographer.FrameCallback() { // from class: l.bzk0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f9244a.m545g(j);
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m544f(boolean z, CharSequence charSequence, int i) {
        if (!Pattern.matches("[0-9]", charSequence) && !Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            return true;
        }
        if (z && Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            if (this.f574r.m12404o1()) {
                zvf0.D("e_verification_code_auto_fill", "p_login_verification_code", new j760[]{vwb.Y("verification_code_scene", "phone")});
            } else if (this.f574r.m12405p1()) {
                zvf0.D("e_verification_code_auto_fill", "p_new_device_passwordlogin_verify_view", new j760[]{vwb.Y("verification_code_scene", "password_new_device")});
            } else {
                zvf0.D("e_verification_code_auto_fill", "", new j760[]{vwb.Y("verification_code_scene", "other")});
            }
        }
        this.f572p.append(charSequence);
        if (NullChecker.a(this.f570n)) {
            this.f570n.mo547a(charSequence.toString());
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m545g(long j) {
        invalidate();
        this.f568l.postFrameCallback(this.f569m);
    }

    public azk0 getPresenter() {
        return this.f574r;
    }

    public String getText() {
        return this.f572p.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m546h() {
        return (SystemClock.uptimeMillis() - this.f571o) % 1000 < 500;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f568l.postFrameCallback(this.f569m);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        return m542d(editorInfo, false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f568l.removeFrameCallback(this.f569m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m541c(canvas);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f571o = SystemClock.uptimeMillis();
        Choreographer choreographer = this.f568l;
        if (z) {
            choreographer.postFrameCallback(this.f569m);
        } else {
            choreographer.removeFrameCallback(this.f569m);
            invalidate();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            if (this.f572p.length() > 0) {
                StringBuilder sb = this.f572p;
                sb.deleteCharAt(sb.length() - 1);
                if (NullChecker.a(this.f570n)) {
                    this.f570n.mo547a(this.f572p.toString());
                }
            }
        } else if (i >= 7 && i <= 16 && this.f572p.length() < 4) {
            this.f572p.append(i - 7);
            if (NullChecker.a(this.f570n)) {
                this.f570n.mo547a(this.f572p.toString());
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
        this.f574r = azk0Var;
    }

    public void setText(String str) {
        this.f572p = new StringBuilder(str);
        if (NullChecker.a(this.f570n)) {
            this.f570n.mo547a(str);
        }
        invalidate();
    }

    public void setTextChangeListener(InterfaceC0065a interfaceC0065a) {
        this.f570n = interfaceC0065a;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerifyCodeView(Context context) {
        this(context, null);
    }
}
