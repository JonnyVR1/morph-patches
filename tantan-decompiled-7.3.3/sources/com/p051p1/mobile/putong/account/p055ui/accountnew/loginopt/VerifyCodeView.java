package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

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
import p153l.a9c0;
import p153l.bbc0;
import p153l.g8l0;
import p153l.i4g0;
import p153l.jyb;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public final int f17287a;

    /* JADX INFO: renamed from: b */
    public final int f17288b;

    /* JADX INFO: renamed from: c */
    public final int f17289c;

    /* JADX INFO: renamed from: d */
    public final int f17290d;

    /* JADX INFO: renamed from: e */
    public final int f17291e;

    /* JADX INFO: renamed from: f */
    public final int f17292f;

    /* JADX INFO: renamed from: g */
    public final int f17293g;

    /* JADX INFO: renamed from: h */
    public final Paint f17294h;

    /* JADX INFO: renamed from: i */
    public final Paint f17295i;

    /* JADX INFO: renamed from: j */
    public final Paint f17296j;

    /* JADX INFO: renamed from: k */
    public Drawable f17297k;

    /* JADX INFO: renamed from: l */
    public Choreographer f17298l;

    /* JADX INFO: renamed from: m */
    public Choreographer.FrameCallback f17299m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4790a f17300n;

    /* JADX INFO: renamed from: o */
    public long f17301o;

    /* JADX INFO: renamed from: p */
    public StringBuilder f17302p;

    /* JADX INFO: renamed from: q */
    public C4794c f17303q;

    /* JADX INFO: renamed from: r */
    public g8l0 f17304r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.VerifyCodeView$a */
    public interface InterfaceC4790a {
        /* JADX INFO: renamed from: a */
        void mo29647a(String str);
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17287a = qa00.f156293F;
        this.f17288b = qa00.f156298K;
        this.f17289c = qa00.f156322i;
        this.f17290d = qa00.f156333t;
        this.f17291e = qa00.f156317d;
        int i2 = qa00.f156335v;
        this.f17292f = i2;
        this.f17293g = i2;
        this.f17294h = new Paint();
        this.f17295i = new Paint();
        this.f17296j = new Paint(1);
        this.f17298l = Choreographer.getInstance();
        this.f17302p = new StringBuilder();
        m29643e();
    }

    /* JADX INFO: renamed from: c */
    public final void m29641c(Canvas canvas) {
        int length = this.f17302p.length();
        Paint.FontMetricsInt fontMetricsInt = this.f17296j.getFontMetricsInt();
        int i = ((this.f17288b / 2) - (fontMetricsInt.ascent / 2)) - (fontMetricsInt.descent / 2);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = this.f17287a;
            int i4 = this.f17289c;
            int i5 = ((i3 + i4) * i2) + (i3 / 2);
            if (i2 < length) {
                float f = i5;
                int i6 = this.f17290d;
                canvas.drawLine(f, i6, f, this.f17288b - i6, this.f17294h);
                canvas.drawText(this.f17302p.toString(), i2, i2 + 1, f, i - qa00.f156316c, this.f17296j);
            } else {
                float f2 = (i3 + i4) * i2;
                float f3 = ((i4 + i3) * i2) + i3;
                float f4 = this.f17288b;
                int i7 = this.f17290d;
                canvas.drawRoundRect(f2, 0.0f, f3, f4, i7, i7, this.f17295i);
                if (i2 == length && isFocused() && m29646h()) {
                    int i8 = this.f17288b / 2;
                    Drawable drawable = this.f17297k;
                    int i9 = this.f17291e;
                    int i10 = this.f17292f;
                    drawable.setBounds(i5 - (i9 / 2), i8 - (i10 / 2), i5 + (i9 / 2), i8 + (i10 / 2));
                    this.f17297k.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputConnection m29642d(EditorInfo editorInfo, final boolean z) {
        if (NullChecker.m82486a(this.f17303q)) {
            return this.f17303q;
        }
        C4794c c4794c = new C4794c(this, false);
        this.f17303q = c4794c;
        c4794c.m29689a(new C4794c.a() { // from class: l.i8l0
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.C4794c.a
            public final boolean commitText(CharSequence charSequence, int i) {
                return this.f113356a.m29644f(z, charSequence, i);
            }
        });
        return this.f17303q;
    }

    /* JADX INFO: renamed from: e */
    public final void m29643e() {
        this.f17294h.setColor(getResources().getColor(a9c0.f69025j));
        this.f17294h.setStrokeWidth(this.f17287a);
        this.f17294h.setAntiAlias(true);
        this.f17294h.setDither(true);
        this.f17294h.setStrokeCap(Paint.Cap.ROUND);
        this.f17295i.setColor(getResources().getColor(a9c0.f69024i));
        this.f17295i.setStrokeWidth(qa00.f156317d);
        this.f17295i.setAntiAlias(true);
        this.f17295i.setDither(true);
        this.f17295i.setStyle(Paint.Style.STROKE);
        this.f17296j.setColor(getResources().getColor(a9c0.f69027l));
        this.f17296j.setAntiAlias(true);
        this.f17296j.setDither(true);
        this.f17296j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17296j.setTextAlign(Paint.Align.CENTER);
        this.f17296j.setTextSize(this.f17293g);
        this.f17297k = getResources().getDrawable(bbc0.f75923v1);
        this.f17299m = new Choreographer.FrameCallback() { // from class: l.h8l0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f108250a.m29645g(j);
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m29644f(boolean z, CharSequence charSequence, int i) {
        if (!Pattern.matches("[0-9]", charSequence) && !Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            return true;
        }
        if (z && Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            if (this.f17304r.m129449o1()) {
                i4g0.m138495D("e_verification_code_auto_fill", "p_login_verification_code", jyb.m147494Y("verification_code_scene", "phone"));
            } else if (this.f17304r.m129450p1()) {
                i4g0.m138495D("e_verification_code_auto_fill", "p_new_device_passwordlogin_verify_view", jyb.m147494Y("verification_code_scene", "password_new_device"));
            } else {
                i4g0.m138495D("e_verification_code_auto_fill", "", jyb.m147494Y("verification_code_scene", "other"));
            }
        }
        this.f17302p.append(charSequence);
        if (NullChecker.m82486a(this.f17300n)) {
            this.f17300n.mo29647a(charSequence.toString());
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m29645g(long j) {
        invalidate();
        this.f17298l.postFrameCallback(this.f17299m);
    }

    public g8l0 getPresenter() {
        return this.f17304r;
    }

    public String getText() {
        return this.f17302p.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m29646h() {
        return (SystemClock.uptimeMillis() - this.f17301o) % 1000 < 500;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17298l.postFrameCallback(this.f17299m);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        return m29642d(editorInfo, false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f17298l.removeFrameCallback(this.f17299m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m29641c(canvas);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f17301o = SystemClock.uptimeMillis();
        Choreographer choreographer = this.f17298l;
        if (z) {
            choreographer.postFrameCallback(this.f17299m);
        } else {
            choreographer.removeFrameCallback(this.f17299m);
            invalidate();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            if (this.f17302p.length() > 0) {
                StringBuilder sb = this.f17302p;
                sb.deleteCharAt(sb.length() - 1);
                if (NullChecker.m82486a(this.f17300n)) {
                    this.f17300n.mo29647a(this.f17302p.toString());
                }
            }
        } else if (i >= 7 && i <= 16 && this.f17302p.length() < 4) {
            this.f17302p.append(i - 7);
            if (NullChecker.m82486a(this.f17300n)) {
                this.f17300n.mo29647a(this.f17302p.toString());
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

    public void setPresenter(g8l0 g8l0Var) {
        this.f17304r = g8l0Var;
    }

    public void setText(String str) {
        this.f17302p = new StringBuilder(str);
        if (NullChecker.m82486a(this.f17300n)) {
            this.f17300n.mo29647a(str);
        }
        invalidate();
    }

    public void setTextChangeListener(InterfaceC4790a interfaceC4790a) {
        this.f17300n = interfaceC4790a;
    }

    public VerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerifyCodeView(Context context) {
        this(context, null);
    }
}
