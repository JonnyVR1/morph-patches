package com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.view;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.ui.lovebuzz.manager.LoveBuzzConstants;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.h6c0;
import l.hhx;
import l.j760;
import l.j8w;
import l.lsi0;
import l.m6w;
import l.mkd0;
import l.mqi0;
import l.v4c0;
import l.xdl0;
import p003l.c4g0;
import p003l.d30;
import p003l.e30;
import p003l.m250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BuzzVoiceView extends FrameLayout implements c0.c {

    /* JADX INFO: renamed from: l */
    public static int f33l = 300;

    /* JADX INFO: renamed from: m */
    public static int f34m;

    /* JADX INFO: renamed from: n */
    public static int f35n;

    /* JADX INFO: renamed from: o */
    public static int f36o;

    /* JADX INFO: renamed from: p */
    public static int f37p;

    /* JADX INFO: renamed from: q */
    public static List<d30> f38q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean f39a;

    /* JADX INFO: renamed from: b */
    public int f40b;

    /* JADX INFO: renamed from: c */
    public int f41c;

    /* JADX INFO: renamed from: d */
    public int f42d;

    /* JADX INFO: renamed from: e */
    public int f43e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f44f;

    /* JADX INFO: renamed from: g */
    public c4g0 f45g;

    /* JADX INFO: renamed from: h */
    public TextView f46h;

    /* JADX INFO: renamed from: i */
    public final String f47i;

    /* JADX INFO: renamed from: j */
    public d30 f48j;

    /* JADX INFO: renamed from: k */
    public GestureDetector f49k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.voice.view.BuzzVoiceView$a */
    public class C0007a extends GestureDetector.SimpleOnGestureListener {
        public C0007a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (BuzzVoiceView.this.f39a) {
                return true;
            }
            BuzzVoiceView.this.performClick();
            return true;
        }
    }

    public BuzzVoiceView(Context context) {
        super(context);
        this.f47i = "countdown_voice_buzz_zoom_key" + mqi0.o();
        this.f48j = new d30() { // from class: l.rp3
            @Override // p003l.d30
            public final void call() {
                this.f7033a.m117j();
            }
        };
        this.f49k = new GestureDetector(getContext(), new C0007a());
        m116f();
    }

    /* JADX INFO: renamed from: f */
    private void m116f() {
        View.inflate(getContext(), h6c0.n, this);
        this.f46h = (TextView) findViewById(v4c0.k);
    }

    /* JADX INFO: renamed from: m */
    private void m118m() {
        if (f38q.isEmpty()) {
            return;
        }
        Iterator<d30> it = f38q.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m119n() {
        if (getLeft() == 0 || getLeft() == this.f42d - getWidth()) {
            return;
        }
        if (getLeft() + (getWidth() / 2) < this.f42d / 2) {
            this.f44f = ValueAnimator.ofInt(getLeft(), 0);
        } else {
            this.f44f = ValueAnimator.ofInt(getLeft(), this.f42d - this.f40b);
        }
        this.f44f.setDuration(f33l);
        this.f44f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sp3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f7283a.m124k(valueAnimator);
            }
        });
        this.f44f.start();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m117j() {
        if (f36o == 0 && f37p == 0) {
            return;
        }
        if (getLeft() == f36o && getTop() == f37p) {
            return;
        }
        if (NullChecker.a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f36o;
            marginLayoutParams.topMargin = f37p;
        }
        int i = f36o;
        layout(i, f37p, getWidth() + i, f37p + getHeight());
        m118m();
    }

    /* JADX INFO: renamed from: g */
    public final void m121g() {
        hhx hhxVarB0 = j8w.Companion.a().B0();
        if (hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED) {
            this.f46h.setText(R.string.F0);
            return;
        }
        CoreModule.c.t1.u(this.f47i);
        long jC = hhxVarB0.c();
        this.f46h.setText(m6w.INSTANCE.c(jC));
        c0.a aVar = new c0.a();
        aVar.g(this.f47i).f(jC + mqi0.o()).d(this);
        CoreModule.c.t1.r(aVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m122h() {
        this.f45g = j8w.Companion.a().D0().subscribe((m250) mkd0.G(new e30() { // from class: l.qp3
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6664a.m123i((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m123i(j760 j760Var) {
        String str = (String) j760Var.a;
        if ("voiceBuzz_like_relation".equals(str)) {
            if (j8w.Companion.a().B0().f() == LoveBuzzConstants.MATCH.MATCHED) {
                CoreModule.c.t1.u(this.f47i);
                this.f46h.setText(R.string.F0);
                return;
            }
            return;
        }
        if ("voiceBuzz_peer_report".equals(str)) {
            m125l(-1);
        } else if ("voiceBuzz_prolong_time".equals(str)) {
            m121g();
        } else if ("voiceBuzz_warn".equals(str)) {
            m125l(-1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m124k(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f36o = iIntValue;
        layout(iIntValue, getTop(), this.f40b + iIntValue, getBottom());
    }

    /* JADX INFO: renamed from: l */
    public void m125l(@StringRes int i) {
        if (i != -1) {
            lsi0.w(i);
        }
        CoreModule.c.t1.u(this.f47i);
        BuzzMediaCallManager.INSTANCE.W();
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f38q.add(this.f48j);
        m121g();
        m122h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.u(this.f47i);
        f38q.remove(this.f48j);
        mkd0.z(this.f45g);
        if (NullChecker.a(this.f44f)) {
            this.f44f.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m117j();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f40b = i;
        this.f41c = i2;
        this.f42d = xdl0.y0();
        this.f43e = xdl0.w0();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f49k.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f39a = false;
            f34m = (int) motionEvent.getX();
            f35n = (int) motionEvent.getY();
        } else if (action == 1) {
            setPressed(false);
            m119n();
            this.f39a = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - f34m;
            float y = motionEvent.getY() - f35n;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.f39a = true;
                int left = (int) (getLeft() + x);
                int i2 = this.f40b + left;
                int top = (int) (getTop() + y);
                int i3 = this.f41c;
                int i4 = top + i3;
                if (left < 0) {
                    i2 = this.f40b;
                    left = 0;
                } else {
                    int i5 = this.f42d;
                    if (i2 > i5) {
                        left = i5 - this.f40b;
                        i2 = i5;
                    }
                }
                if (top >= 0) {
                    int i6 = this.f43e;
                    if (i4 > i6) {
                        int i7 = i6 - i3;
                        i3 = i6;
                        i = i7;
                    } else {
                        i = top;
                        i3 = i4;
                    }
                }
                f36o = left;
                f37p = i;
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
            m119n();
            this.f39a = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m126u(String str, long j, long j2, long j3, long j4) {
        long j5 = j3 - j;
        if (TextUtils.equals(str, this.f47i)) {
            this.f46h.setText(m6w.INSTANCE.c(j5));
        }
        if (j5 <= 0) {
            m125l(R.string.z0);
        }
    }

    public BuzzVoiceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47i = "countdown_voice_buzz_zoom_key" + mqi0.o();
        this.f48j = new d30() { // from class: l.rp3
            @Override // p003l.d30
            public final void call() {
                this.f7033a.m117j();
            }
        };
        this.f49k = new GestureDetector(getContext(), new C0007a());
        m116f();
    }

    public BuzzVoiceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47i = "countdown_voice_buzz_zoom_key" + mqi0.o();
        this.f48j = new d30() { // from class: l.rp3
            @Override // p003l.d30
            public final void call() {
                this.f7033a.m117j();
            }
        };
        this.f49k = new GestureDetector(getContext(), new C0007a());
        m116f();
    }
}
