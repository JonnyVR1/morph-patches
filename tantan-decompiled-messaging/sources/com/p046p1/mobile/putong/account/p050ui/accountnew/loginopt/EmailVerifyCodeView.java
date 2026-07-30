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
import p149l.cwe;
import p149l.t100;
import p149l.u0c0;
import p149l.v2c0;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyCodeView extends View {

    /* JADX INFO: renamed from: a */
    public final int f16546a;

    /* JADX INFO: renamed from: b */
    public final int f16547b;

    /* JADX INFO: renamed from: c */
    public final int f16548c;

    /* JADX INFO: renamed from: d */
    public final int f16549d;

    /* JADX INFO: renamed from: e */
    public final int f16550e;

    /* JADX INFO: renamed from: f */
    public final int f16551f;

    /* JADX INFO: renamed from: g */
    public final int f16552g;

    /* JADX INFO: renamed from: h */
    public final Paint f16553h;

    /* JADX INFO: renamed from: i */
    public final Paint f16554i;

    /* JADX INFO: renamed from: j */
    public final Paint f16555j;

    /* JADX INFO: renamed from: k */
    public Drawable f16556k;

    /* JADX INFO: renamed from: l */
    public Choreographer f16557l;

    /* JADX INFO: renamed from: m */
    public Choreographer.FrameCallback f16558m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4636a f16559n;

    /* JADX INFO: renamed from: o */
    public long f16560o;

    /* JADX INFO: renamed from: p */
    public StringBuilder f16561p;

    /* JADX INFO: renamed from: q */
    public C4643c f16562q;

    /* JADX INFO: renamed from: r */
    public cwe f16563r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.EmailVerifyCodeView$a */
    public interface InterfaceC4636a {
        /* JADX INFO: renamed from: a */
        void mo28630a(String str);
    }

    public EmailVerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16546a = t100.f167231F;
        this.f16547b = t100.f167236K;
        this.f16548c = t100.f167260i;
        this.f16549d = t100.f167271t;
        this.f16550e = t100.f167255d;
        int i2 = t100.f167273v;
        this.f16551f = i2;
        this.f16552g = i2;
        this.f16553h = new Paint();
        this.f16554i = new Paint();
        this.f16555j = new Paint(1);
        this.f16557l = Choreographer.getInstance();
        this.f16561p = new StringBuilder();
        m28626e();
    }

    /* JADX INFO: renamed from: c */
    public final void m28624c(Canvas canvas) {
        int length = this.f16561p.length();
        Paint.FontMetricsInt fontMetricsInt = this.f16555j.getFontMetricsInt();
        int i = ((this.f16547b / 2) - (fontMetricsInt.ascent / 2)) - (fontMetricsInt.descent / 2);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = this.f16546a;
            int i4 = this.f16548c;
            int i5 = ((i3 + i4) * i2) + (i3 / 2);
            if (i2 < length) {
                float f = i5;
                int i6 = this.f16549d;
                canvas.drawLine(f, i6, f, this.f16547b - i6, this.f16553h);
                canvas.drawText(this.f16561p.toString(), i2, i2 + 1, f, i - t100.f167254c, this.f16555j);
            } else {
                float f2 = (i3 + i4) * i2;
                float f3 = ((i4 + i3) * i2) + i3;
                float f4 = this.f16547b;
                int i7 = this.f16549d;
                canvas.drawRoundRect(f2, 0.0f, f3, f4, i7, i7, this.f16554i);
                if (i2 == length && isFocused() && m28629h()) {
                    int i8 = this.f16547b / 2;
                    Drawable drawable = this.f16556k;
                    int i9 = this.f16550e;
                    int i10 = this.f16551f;
                    drawable.setBounds(i5 - (i9 / 2), i8 - (i10 / 2), i5 + (i9 / 2), i8 + (i10 / 2));
                    this.f16556k.draw(canvas);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputConnection m28625d(EditorInfo editorInfo, final boolean z) {
        if (NullChecker.m81303a(this.f16562q)) {
            return this.f16562q;
        }
        C4643c c4643c = new C4643c(this, false);
        this.f16562q = c4643c;
        c4643c.m28690a(new C4643c.a() { // from class: l.dwe
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.C4643c.a
            public final boolean commitText(CharSequence charSequence, int i) {
                return this.f88166a.m28627f(z, charSequence, i);
            }
        });
        return this.f16562q;
    }

    /* JADX INFO: renamed from: e */
    public final void m28626e() {
        this.f16553h.setColor(getResources().getColor(u0c0.f172889j));
        this.f16553h.setStrokeWidth(this.f16546a);
        this.f16553h.setAntiAlias(true);
        this.f16553h.setDither(true);
        this.f16553h.setStrokeCap(Paint.Cap.ROUND);
        this.f16554i.setColor(getResources().getColor(u0c0.f172888i));
        this.f16554i.setStrokeWidth(t100.f167255d);
        this.f16554i.setAntiAlias(true);
        this.f16554i.setDither(true);
        this.f16554i.setStyle(Paint.Style.STROKE);
        this.f16555j.setColor(getResources().getColor(u0c0.f172891l));
        this.f16555j.setAntiAlias(true);
        this.f16555j.setDither(true);
        this.f16555j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f16555j.setTextAlign(Paint.Align.CENTER);
        this.f16555j.setTextSize(this.f16552g);
        this.f16556k = getResources().getDrawable(v2c0.f179517v1);
        this.f16558m = new Choreographer.FrameCallback() { // from class: l.ewe
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f93493a.m28628g(j);
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m28627f(boolean z, CharSequence charSequence, int i) {
        if (!Pattern.matches("[0-9]", charSequence) && !Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            return true;
        }
        if (z && Pattern.matches("[0-9][0-9][0-9][0-9]", charSequence)) {
            if (this.f16563r.m109012j1()) {
                zvf0.m220371D("e_verification_code_auto_fill", "p_login_verification_code", vwb.m200311Y("verification_code_scene", "phone"));
            } else if (this.f16563r.m109013k1()) {
                zvf0.m220371D("e_verification_code_auto_fill", "p_new_device_passwordlogin_verify_view", vwb.m200311Y("verification_code_scene", "password_new_device"));
            } else {
                zvf0.m220371D("e_verification_code_auto_fill", "", vwb.m200311Y("verification_code_scene", "other"));
            }
        }
        this.f16561p.append(charSequence);
        if (NullChecker.m81303a(this.f16559n)) {
            this.f16559n.mo28630a(charSequence.toString());
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m28628g(long j) {
        invalidate();
        this.f16557l.postFrameCallback(this.f16558m);
    }

    public cwe getPresenter() {
        return this.f16563r;
    }

    public String getText() {
        return this.f16561p.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28629h() {
        return (SystemClock.uptimeMillis() - this.f16560o) % 1000 < 500;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16557l.postFrameCallback(this.f16558m);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 2;
        return m28625d(editorInfo, true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f16557l.removeFrameCallback(this.f16558m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m28624c(canvas);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f16560o = SystemClock.uptimeMillis();
        Choreographer choreographer = this.f16557l;
        if (z) {
            choreographer.postFrameCallback(this.f16558m);
        } else {
            choreographer.removeFrameCallback(this.f16558m);
            invalidate();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67) {
            if (this.f16561p.length() > 0) {
                StringBuilder sb = this.f16561p;
                sb.deleteCharAt(sb.length() - 1);
                if (NullChecker.m81303a(this.f16559n)) {
                    this.f16559n.mo28630a(this.f16561p.toString());
                }
            }
        } else if (i >= 7 && i <= 16 && this.f16561p.length() < 4) {
            this.f16561p.append(i - 7);
            if (NullChecker.m81303a(this.f16559n)) {
                this.f16559n.mo28630a(this.f16561p.toString());
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
        this.f16563r = cweVar;
    }

    public void setText(String str) {
        this.f16561p = new StringBuilder(str);
        if (NullChecker.m81303a(this.f16559n)) {
            this.f16559n.mo28630a(str);
        }
        invalidate();
    }

    public void setTextChangeListener(InterfaceC4636a interfaceC4636a) {
        this.f16559n = interfaceC4636a;
    }

    public EmailVerifyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmailVerifyCodeView(Context context) {
        this(context, null);
    }
}
