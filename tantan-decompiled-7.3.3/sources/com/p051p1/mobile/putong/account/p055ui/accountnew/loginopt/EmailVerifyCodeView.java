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
import p153l.gxe;
import p153l.i4g0;
import p153l.jyb;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public final int f17265a;

    /* JADX INFO: renamed from: b */
    public final int f17266b;

    /* JADX INFO: renamed from: c */
    public final int f17267c;

    /* JADX INFO: renamed from: d */
    public final int f17268d;

    /* JADX INFO: renamed from: e */
    public final int f17269e;

    /* JADX INFO: renamed from: f */
    public final int f17270f;

    /* JADX INFO: renamed from: g */
    public final int f17271g;

    /* JADX INFO: renamed from: h */
    public final Paint f17272h;

    /* JADX INFO: renamed from: i */
    public final Paint f17273i;

    /* JADX INFO: renamed from: j */
    public final Paint f17274j;

    /* JADX INFO: renamed from: k */
    public Drawable f17275k;

    /* JADX INFO: renamed from: l */
    public Choreographer f17276l;

    /* JADX INFO: renamed from: m */
    public Choreographer.FrameCallback f17277m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4787a f17278n;

    /* JADX INFO: renamed from: o */
    public long f17279o;

    /* JADX INFO: renamed from: p */
    public StringBuilder f17280p;

    /* JADX INFO: renamed from: q */
    public C4794c f17281q;

    /* JADX INFO: renamed from: r */
    public gxe f17282r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.EmailVerifyCodeView$a */
    public interface InterfaceC4787a {
        /* JADX INFO: renamed from: a */
        void mo29629a(String str);
    }

    public EmailVerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17265a = qa00.f156293F;
        this.f17266b = qa00.f156298K;
        this.f17267c = qa00.f156322i;
        this.f17268d = qa00.f156333t;
        this.f17269e = qa00.f156317d;
        int i2 = qa00.f156335v;
        this.f17270f = i2;
        this.f17271g = i2;
        this.f17272h = new Paint();
        this.f17273i = new Paint();
        this.f17274j = new Paint(1);
        this.f17276l = Choreographer.getInstance();
        this.f17280p = new StringBuilder();
        m29625e();
    }

    /* JADX INFO: renamed from: c */
    public final void m29623c(Canvas canvas) {
        int length = this.f17280p.length();
        Paint.FontMetricsInt fontMetricsInt = this.f17274j.getFontMetricsInt();
        int i = ((this.f17266b / 2) - (fontMetricsInt.ascent / 2)) - (fontMetricsInt.descent / 2);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = this.f17265a;
            int i4 = this.f17267c;
            int i5 = ((i3 + i4) * i2) + (i3 / 2);
            if (i2 < length) {
                float f = i5;
                int i6 = this.f17268d;
                canvas.drawLine(f, i6, f, this.f17266b - i6, this.f17272h);
                canvas.drawText(this.f17280p.toString(), i2, i2 + 1, f, i - qa00.f156316c, this.f17274j);
            } else {
                float f2 = (i3 + i4) * i2;
                float f3 = ((i4 + i3) * i2) + i3;
                float f4 = this.f17266b;
                int i7 = this.f17268d;
                canvas.drawRoundRect(f2, 0.0f, f3, f4, i7, i7, this.f17273i);
                if (i2 == length && isFocused() && m29628h()) {
                    int i8 = this.f17266b / 2;
                    Drawable drawable = this.f17275k;
                    int i9 = this.f17269e;
                    int i10 = this.f17270f;
                    drawable.setBounds(i5 - (i9 / 2), i8 - (i10 / 2), i5 + (i9 / 2), i8 + (i10 / 2));
                    this.f17275k.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputConnection m29624d(EditorInfo editorInfo, final boolean z) {
        if (NullChecker.m82486a(this.f17281q)) {
            return this.f17281q;
        }
        C4794c c4794c = new C4794c(this, false);
        this.f17281q = c4794c;
        c4794c.m29689a(new C4794c.a() { // from class: l.hxe
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.C4794c.a
            public final boolean commitText(CharSequence charSequence, int i) {
                return this.f111994a.m29626f(z, charSequence, i);
            }
        });
        return this.f17281q;
    }

    /* JADX INFO: renamed from: e */
    public final void m29625e() {
        this.f17272h.setColor(getResources().getColor(a9c0.f69025j));
        this.f17272h.setStrokeWidth(this.f17265a);
        this.f17272h.setAntiAlias(true);
        this.f17272h.setDither(true);
        this.f17272h.setStrokeCap(Paint.Cap.ROUND);
        this.f17273i.setColor(getResources().getColor(a9c0.f69024i));
        this.f17273i.setStrokeWidth(qa00.f156317d);
        this.f17273i.setAntiAlias(true);
        this.f17273i.setDither(true);
        this.f17273i.setStyle(Paint.Style.STROKE);
        this.f17274j.setColor(getResources().getColor(a9c0.f69027l));
        this.f17274j.setAntiAlias(true);
        this.f17274j.setDither(true);
        this.f17274j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17274j.setTextAlign(Paint.Align.CENTER);
        this.f17274j.setTextSize(this.f17271g);
        this.f17275k = getResources().getDrawable(bbc0.f75923v1);
        this.f17277m = new Choreographer.FrameCallback() { // from class: l.ixe
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f117394a.m29627g(j);
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m29626f(boolean z, CharSequence charSequence, int i) {
        if (!Pattern.matches("[0-9]", charSequence) && !Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            return true;
        }
        if (z && Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            if (this.f17282r.m132850j1()) {
                i4g0.m138495D("e_verification_code_auto_fill", "p_login_verification_code", jyb.m147494Y("verification_code_scene", "phone"));
            } else if (this.f17282r.m132851k1()) {
                i4g0.m138495D("e_verification_code_auto_fill", "p_new_device_passwordlogin_verify_view", jyb.m147494Y("verification_code_scene", "password_new_device"));
            } else {
                i4g0.m138495D("e_verification_code_auto_fill", "", jyb.m147494Y("verification_code_scene", "other"));
            }
        }
        this.f17280p.append(charSequence);
        if (NullChecker.m82486a(this.f17278n)) {
            this.f17278n.mo29629a(charSequence.toString());
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m29627g(long j) {
        invalidate();
        this.f17276l.postFrameCallback(this.f17277m);
    }

    public gxe getPresenter() {
        return this.f17282r;
    }

    public String getText() {
        return this.f17280p.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m29628h() {
        return (SystemClock.uptimeMillis() - this.f17279o) % 1000 < 500;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17276l.postFrameCallback(this.f17277m);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        return m29624d(editorInfo, true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f17276l.removeFrameCallback(this.f17277m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m29623c(canvas);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f17279o = SystemClock.uptimeMillis();
        Choreographer choreographer = this.f17276l;
        if (z) {
            choreographer.postFrameCallback(this.f17277m);
        } else {
            choreographer.removeFrameCallback(this.f17277m);
            invalidate();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            if (this.f17280p.length() > 0) {
                StringBuilder sb = this.f17280p;
                sb.deleteCharAt(sb.length() - 1);
                if (NullChecker.m82486a(this.f17278n)) {
                    this.f17278n.mo29629a(this.f17280p.toString());
                }
            }
        } else if (i >= 7 && i <= 16 && this.f17280p.length() < 4) {
            this.f17280p.append(i - 7);
            if (NullChecker.m82486a(this.f17278n)) {
                this.f17278n.mo29629a(this.f17280p.toString());
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

    public void setPresenter(gxe gxeVar) {
        this.f17282r = gxeVar;
    }

    public void setText(String str) {
        this.f17280p = new StringBuilder(str);
        if (NullChecker.m82486a(this.f17278n)) {
            this.f17278n.mo29629a(str);
        }
        invalidate();
    }

    public void setTextChangeListener(InterfaceC4787a interfaceC4787a) {
        this.f17278n = interfaceC4787a;
    }

    public EmailVerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmailVerifyCodeView(Context context) {
        this(context, null);
    }
}
