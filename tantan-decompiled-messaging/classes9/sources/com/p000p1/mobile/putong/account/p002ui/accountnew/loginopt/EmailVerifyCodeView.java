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
import p006l.cwe;
import p006l.u0c0;
import p006l.v2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailVerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public final int f535a;

    /* JADX INFO: renamed from: b */
    public final int f536b;

    /* JADX INFO: renamed from: c */
    public final int f537c;

    /* JADX INFO: renamed from: d */
    public final int f538d;

    /* JADX INFO: renamed from: e */
    public final int f539e;

    /* JADX INFO: renamed from: f */
    public final int f540f;

    /* JADX INFO: renamed from: g */
    public final int f541g;

    /* JADX INFO: renamed from: h */
    public final Paint f542h;

    /* JADX INFO: renamed from: i */
    public final Paint f543i;

    /* JADX INFO: renamed from: j */
    public final Paint f544j;

    /* JADX INFO: renamed from: k */
    public Drawable f545k;

    /* JADX INFO: renamed from: l */
    public Choreographer f546l;

    /* JADX INFO: renamed from: m */
    public Choreographer.FrameCallback f547m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0062a f548n;

    /* JADX INFO: renamed from: o */
    public long f549o;

    /* JADX INFO: renamed from: p */
    public StringBuilder f550p;

    /* JADX INFO: renamed from: q */
    public C0069c f551q;

    /* JADX INFO: renamed from: r */
    public cwe f552r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.EmailVerifyCodeView$a */
    public interface InterfaceC0062a {
        /* JADX INFO: renamed from: a */
        void mo527a(String str);
    }

    public EmailVerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f535a = t100.F;
        this.f536b = t100.K;
        this.f537c = t100.i;
        this.f538d = t100.t;
        this.f539e = t100.d;
        int i2 = t100.v;
        this.f540f = i2;
        this.f541g = i2;
        this.f542h = new Paint();
        this.f543i = new Paint();
        this.f544j = new Paint(1);
        this.f546l = Choreographer.getInstance();
        this.f550p = new StringBuilder();
        m523e();
    }

    /* JADX INFO: renamed from: c */
    public final void m521c(Canvas canvas) {
        int length = this.f550p.length();
        Paint.FontMetricsInt fontMetricsInt = this.f544j.getFontMetricsInt();
        int i = ((this.f536b / 2) - (fontMetricsInt.ascent / 2)) - (fontMetricsInt.descent / 2);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = this.f535a;
            int i4 = this.f537c;
            int i5 = ((i3 + i4) * i2) + (i3 / 2);
            if (i2 < length) {
                float f = i5;
                int i6 = this.f538d;
                canvas.drawLine(f, i6, f, this.f536b - i6, this.f542h);
                canvas.drawText(this.f550p.toString(), i2, i2 + 1, f, i - t100.c, this.f544j);
            } else {
                float f2 = (i3 + i4) * i2;
                float f3 = ((i4 + i3) * i2) + i3;
                float f4 = this.f536b;
                int i7 = this.f538d;
                canvas.drawRoundRect(f2, 0.0f, f3, f4, i7, i7, this.f543i);
                if (i2 == length && isFocused() && m526h()) {
                    int i8 = this.f536b / 2;
                    Drawable drawable = this.f545k;
                    int i9 = this.f539e;
                    int i10 = this.f540f;
                    drawable.setBounds(i5 - (i9 / 2), i8 - (i10 / 2), i5 + (i9 / 2), i8 + (i10 / 2));
                    this.f545k.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputConnection m522d(EditorInfo editorInfo, final boolean z) {
        if (NullChecker.a(this.f551q)) {
            return this.f551q;
        }
        C0069c c0069c = new C0069c(this, false);
        this.f551q = c0069c;
        c0069c.m589a(new C0069c.a() { // from class: l.dwe
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.C0069c.a
            public final boolean commitText(CharSequence charSequence, int i) {
                return this.f10626a.m524f(z, charSequence, i);
            }
        });
        return this.f551q;
    }

    /* JADX INFO: renamed from: e */
    public final void m523e() {
        this.f542h.setColor(getResources().getColor(u0c0.f22403j));
        this.f542h.setStrokeWidth(this.f535a);
        this.f542h.setAntiAlias(true);
        this.f542h.setDither(true);
        this.f542h.setStrokeCap(Paint.Cap.ROUND);
        this.f543i.setColor(getResources().getColor(u0c0.f22402i));
        this.f543i.setStrokeWidth(t100.d);
        this.f543i.setAntiAlias(true);
        this.f543i.setDither(true);
        this.f543i.setStyle(Paint.Style.STROKE);
        this.f544j.setColor(getResources().getColor(u0c0.f22405l));
        this.f544j.setAntiAlias(true);
        this.f544j.setDither(true);
        this.f544j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f544j.setTextAlign(Paint.Align.CENTER);
        this.f544j.setTextSize(this.f541g);
        this.f545k = getResources().getDrawable(v2c0.f24081v1);
        this.f547m = new Choreographer.FrameCallback() { // from class: l.ewe
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f11484a.m525g(j);
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m524f(boolean z, CharSequence charSequence, int i) {
        if (!Pattern.matches("[0-9]", charSequence) && !Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            return true;
        }
        if (z && Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            if (this.f552r.m13669j1()) {
                zvf0.D("e_verification_code_auto_fill", "p_login_verification_code", new j760[]{vwb.Y("verification_code_scene", "phone")});
            } else if (this.f552r.m13670k1()) {
                zvf0.D("e_verification_code_auto_fill", "p_new_device_passwordlogin_verify_view", new j760[]{vwb.Y("verification_code_scene", "password_new_device")});
            } else {
                zvf0.D("e_verification_code_auto_fill", "", new j760[]{vwb.Y("verification_code_scene", "other")});
            }
        }
        this.f550p.append(charSequence);
        if (NullChecker.a(this.f548n)) {
            this.f548n.mo527a(charSequence.toString());
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m525g(long j) {
        invalidate();
        this.f546l.postFrameCallback(this.f547m);
    }

    public cwe getPresenter() {
        return this.f552r;
    }

    public String getText() {
        return this.f550p.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m526h() {
        return (SystemClock.uptimeMillis() - this.f549o) % 1000 < 500;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f546l.postFrameCallback(this.f547m);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        return m522d(editorInfo, true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f546l.removeFrameCallback(this.f547m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m521c(canvas);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f549o = SystemClock.uptimeMillis();
        Choreographer choreographer = this.f546l;
        if (z) {
            choreographer.postFrameCallback(this.f547m);
        } else {
            choreographer.removeFrameCallback(this.f547m);
            invalidate();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            if (this.f550p.length() > 0) {
                StringBuilder sb = this.f550p;
                sb.deleteCharAt(sb.length() - 1);
                if (NullChecker.a(this.f548n)) {
                    this.f548n.mo527a(this.f550p.toString());
                }
            }
        } else if (i >= 7 && i <= 16 && this.f550p.length() < 4) {
            this.f550p.append(i - 7);
            if (NullChecker.a(this.f548n)) {
                this.f548n.mo527a(this.f550p.toString());
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

    public void setPresenter(cwe cweVar) {
        this.f552r = cweVar;
    }

    public void setText(String str) {
        this.f550p = new StringBuilder(str);
        if (NullChecker.a(this.f548n)) {
            this.f548n.mo527a(str);
        }
        invalidate();
    }

    public void setTextChangeListener(InterfaceC0062a interfaceC0062a) {
        this.f548n = interfaceC0062a;
    }

    public EmailVerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmailVerifyCodeView(Context context) {
        this(context, null);
    }
}
