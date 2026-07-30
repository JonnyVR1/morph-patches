package com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.bdc0;
import p153l.bnl0;
import p153l.eqx;
import p153l.haw;
import p153l.k8w;
import p153l.kcg0;
import p153l.mec0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class BuzzVoiceView extends FrameLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: l */
    public static int f30990l = 300;

    /* JADX INFO: renamed from: m */
    public static int f30991m;

    /* JADX INFO: renamed from: n */
    public static int f30992n;

    /* JADX INFO: renamed from: o */
    public static int f30993o;

    /* JADX INFO: renamed from: p */
    public static int f30994p;

    /* JADX INFO: renamed from: q */
    public static List<x20> f30995q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean f30996a;

    /* JADX INFO: renamed from: b */
    public int f30997b;

    /* JADX INFO: renamed from: c */
    public int f30998c;

    /* JADX INFO: renamed from: d */
    public int f30999d;

    /* JADX INFO: renamed from: e */
    public int f31000e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f31001f;

    /* JADX INFO: renamed from: g */
    public kcg0 f31002g;

    /* JADX INFO: renamed from: h */
    public TextView f31003h;

    /* JADX INFO: renamed from: i */
    public final String f31004i;

    /* JADX INFO: renamed from: j */
    public x20 f31005j;

    /* JADX INFO: renamed from: k */
    public GestureDetector f31006k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.voice.view.BuzzVoiceView$a */
    public class C8587a extends GestureDetector.SimpleOnGestureListener {
        public C8587a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (BuzzVoiceView.this.f30996a) {
                return true;
            }
            BuzzVoiceView.this.performClick();
            return true;
        }
    }

    public BuzzVoiceView(Context context) {
        super(context);
        this.f31004i = "countdown_voice_buzz_zoom_key" + pzi0.m174454o();
        this.f31005j = new x20() { // from class: l.rq3
            @Override // p153l.x20
            public final void call() {
                this.f164427a.m48276j();
            }
        };
        this.f31006k = new GestureDetector(getContext(), new C8587a());
        m48275f();
    }

    /* JADX INFO: renamed from: f */
    private void m48275f() {
        View.inflate(getContext(), mec0.f136479n, this);
        this.f31003h = (TextView) findViewById(bdc0.f76254k);
    }

    /* JADX INFO: renamed from: m */
    private void m48277m() {
        if (f30995q.isEmpty()) {
            return;
        }
        Iterator<x20> it = f30995q.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m48278n() {
        if (getLeft() == 0 || getLeft() == this.f30999d - getWidth()) {
            return;
        }
        if (getLeft() + (getWidth() / 2) < this.f30999d / 2) {
            this.f31001f = ValueAnimator.ofInt(getLeft(), 0);
        } else {
            this.f31001f = ValueAnimator.ofInt(getLeft(), this.f30999d - this.f30997b);
        }
        this.f31001f.setDuration(f30990l);
        this.f31001f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sq3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f170132a.m48283k(valueAnimator);
            }
        });
        this.f31001f.start();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m48276j() {
        if (f30993o == 0 && f30994p == 0) {
            return;
        }
        if (getLeft() == f30993o && getTop() == f30994p) {
            return;
        }
        if (NullChecker.m82486a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f30993o;
            marginLayoutParams.topMargin = f30994p;
        }
        int i = f30993o;
        layout(i, f30994p, getWidth() + i, f30994p + getHeight());
        m48277m();
    }

    /* JADX INFO: renamed from: g */
    public final void m48280g() {
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        if (eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            this.f31003h.setText(R$string.f20905F0);
            return;
        }
        CoreModule.f18264c.f20427t1.m32519u(this.f31004i);
        long jM122074c = eqxVarM134264B0.m122074c();
        this.f31003h.setText(k8w.INSTANCE.m148754c(jM122074c));
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g(this.f31004i).m32525f(jM122074c + pzi0.m174454o()).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m48281h() {
        this.f31002g = haw.INSTANCE.m134320a().m134266D0().subscribe(psd0.m173596G(new y20() { // from class: l.qq3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158949a.m48282i((pf60) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48282i(pf60 pf60Var) {
        String str = (String) pf60Var.f152156a;
        if ("voiceBuzz_like_relation".equals(str)) {
            if (haw.INSTANCE.m134320a().m134264B0().getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
                CoreModule.f18264c.f20427t1.m32519u(this.f31004i);
                this.f31003h.setText(R$string.f20905F0);
                return;
            }
            return;
        }
        if ("voiceBuzz_peer_report".equals(str)) {
            m48284l(-1);
        } else if ("voiceBuzz_prolong_time".equals(str)) {
            m48280g();
        } else if ("voiceBuzz_warn".equals(str)) {
            m48284l(-1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m48283k(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f30993o = iIntValue;
        layout(iIntValue, getTop(), this.f30997b + iIntValue, getBottom());
    }

    /* JADX INFO: renamed from: l */
    public void m48284l(@StringRes int i) {
        if (i != -1) {
            o1j0.m165649w(i);
        }
        CoreModule.f18264c.f20427t1.m32519u(this.f31004i);
        BuzzMediaCallManager.INSTANCE.m48141W();
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f30995q.add(this.f31005j);
        m48280g();
        m48281h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32519u(this.f31004i);
        f30995q.remove(this.f31005j);
        psd0.m173633z(this.f31002g);
        if (NullChecker.m82486a(this.f31001f)) {
            this.f31001f.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m48276j();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f30997b = i;
        this.f30998c = i2;
        this.f30999d = bnl0.m105592y0();
        this.f31000e = bnl0.m105588w0();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f31006k.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30996a = false;
            f30991m = (int) motionEvent.getX();
            f30992n = (int) motionEvent.getY();
        } else if (action == 1) {
            setPressed(false);
            m48278n();
            this.f30996a = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - f30991m;
            float y = motionEvent.getY() - f30992n;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.f30996a = true;
                int left = (int) (getLeft() + x);
                int i2 = this.f30997b + left;
                int top = (int) (getTop() + y);
                int i3 = this.f30998c;
                int i4 = top + i3;
                if (left < 0) {
                    i2 = this.f30997b;
                    left = 0;
                } else {
                    int i5 = this.f30999d;
                    if (i2 > i5) {
                        left = i5 - this.f30997b;
                        i2 = i5;
                    }
                }
                if (top >= 0) {
                    int i6 = this.f31000e;
                    if (i4 > i6) {
                        int i7 = i6 - i3;
                        i3 = i6;
                        i = i7;
                    } else {
                        i = top;
                        i3 = i4;
                    }
                }
                f30993o = left;
                f30994p = i;
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
            m48278n();
            this.f30996a = false;
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        long j5 = j3 - j;
        if (TextUtils.equals(str, this.f31004i)) {
            this.f31003h.setText(k8w.INSTANCE.m148754c(j5));
        }
        if (j5 <= 0) {
            m48284l(R$string.f21009z0);
        }
    }

    public BuzzVoiceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31004i = "countdown_voice_buzz_zoom_key" + pzi0.m174454o();
        this.f31005j = new x20() { // from class: l.rq3
            @Override // p153l.x20
            public final void call() {
                this.f164427a.m48276j();
            }
        };
        this.f31006k = new GestureDetector(getContext(), new C8587a());
        m48275f();
    }

    public BuzzVoiceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31004i = "countdown_voice_buzz_zoom_key" + pzi0.m174454o();
        this.f31005j = new x20() { // from class: l.rq3
            @Override // p153l.x20
            public final void call() {
                this.f164427a.m48276j();
            }
        };
        this.f31006k = new GestureDetector(getContext(), new C8587a());
        m48275f();
    }
}
