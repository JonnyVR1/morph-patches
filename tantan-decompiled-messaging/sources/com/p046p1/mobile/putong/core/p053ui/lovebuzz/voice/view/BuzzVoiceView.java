package com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.h6c0;
import p149l.hhx;
import p149l.j760;
import p149l.j8w;
import p149l.lsi0;
import p149l.m6w;
import p149l.mkd0;
import p149l.mqi0;
import p149l.v4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class BuzzVoiceView extends FrameLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: l */
    public static int f30142l = 300;

    /* JADX INFO: renamed from: m */
    public static int f30143m;

    /* JADX INFO: renamed from: n */
    public static int f30144n;

    /* JADX INFO: renamed from: o */
    public static int f30145o;

    /* JADX INFO: renamed from: p */
    public static int f30146p;

    /* JADX INFO: renamed from: q */
    public static List<d30> f30147q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean f30148a;

    /* JADX INFO: renamed from: b */
    public int f30149b;

    /* JADX INFO: renamed from: c */
    public int f30150c;

    /* JADX INFO: renamed from: d */
    public int f30151d;

    /* JADX INFO: renamed from: e */
    public int f30152e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f30153f;

    /* JADX INFO: renamed from: g */
    public c4g0 f30154g;

    /* JADX INFO: renamed from: h */
    public TextView f30155h;

    /* JADX INFO: renamed from: i */
    public final String f30156i;

    /* JADX INFO: renamed from: j */
    public d30 f30157j;

    /* JADX INFO: renamed from: k */
    public GestureDetector f30158k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.voice.view.BuzzVoiceView$a */
    public class C8424a extends GestureDetector.SimpleOnGestureListener {
        public C8424a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (BuzzVoiceView.this.f30148a) {
                return true;
            }
            BuzzVoiceView.this.performClick();
            return true;
        }
    }

    public BuzzVoiceView(Context context) {
        super(context);
        this.f30156i = "countdown_voice_buzz_zoom_key" + mqi0.m155944o();
        this.f30157j = new d30() { // from class: l.rp3
            @Override // p149l.d30
            public final void call() {
                this.f160471a.m47093j();
            }
        };
        this.f30158k = new GestureDetector(getContext(), new C8424a());
        m47092f();
    }

    /* JADX INFO: renamed from: f */
    private void m47092f() {
        View.inflate(getContext(), h6c0.f106037n, this);
        this.f30155h = (TextView) findViewById(v4c0.f179904k);
    }

    /* JADX INFO: renamed from: m */
    private void m47094m() {
        if (f30147q.isEmpty()) {
            return;
        }
        Iterator<d30> it = f30147q.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m47095n() {
        if (getLeft() == 0 || getLeft() == this.f30151d - getWidth()) {
            return;
        }
        if (getLeft() + (getWidth() / 2) < this.f30151d / 2) {
            this.f30153f = ValueAnimator.ofInt(getLeft(), 0);
        } else {
            this.f30153f = ValueAnimator.ofInt(getLeft(), this.f30151d - this.f30149b);
        }
        this.f30153f.setDuration(f30142l);
        this.f30153f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sp3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f165747a.m47100k(valueAnimator);
            }
        });
        this.f30153f.start();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m47093j() {
        if (f30145o == 0 && f30146p == 0) {
            return;
        }
        if (getLeft() == f30145o && getTop() == f30146p) {
            return;
        }
        if (NullChecker.m81303a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f30145o;
            marginLayoutParams.topMargin = f30146p;
        }
        int i = f30145o;
        layout(i, f30146p, getWidth() + i, f30146p + getHeight());
        m47094m();
    }

    /* JADX INFO: renamed from: g */
    public final void m47097g() {
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        if (hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            this.f30155h.setText(R$string.f20163F0);
            return;
        }
        CoreModule.f17545c.f19685t1.m31516u(this.f30156i);
        long jM131177c = hhxVarM140417B0.m131177c();
        this.f30155h.setText(m6w.INSTANCE.m153298c(jM131177c));
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g(this.f30156i).m31522f(jM131177c + mqi0.m155944o()).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m47098h() {
        this.f30154g = j8w.INSTANCE.m140473a().m140419D0().subscribe(mkd0.m154955G(new e30() { // from class: l.qp3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155667a.m47099i((j760) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m47099i(j760 j760Var) {
        String str = (String) j760Var.f116564a;
        if ("voiceBuzz_like_relation".equals(str)) {
            if (j8w.INSTANCE.m140473a().m140417B0().getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
                CoreModule.f17545c.f19685t1.m31516u(this.f30156i);
                this.f30155h.setText(R$string.f20163F0);
                return;
            }
            return;
        }
        if ("voiceBuzz_peer_report".equals(str)) {
            m47101l(-1);
        } else if ("voiceBuzz_prolong_time".equals(str)) {
            m47097g();
        } else if ("voiceBuzz_warn".equals(str)) {
            m47101l(-1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m47100k(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f30145o = iIntValue;
        layout(iIntValue, getTop(), this.f30149b + iIntValue, getBottom());
    }

    /* JADX INFO: renamed from: l */
    public void m47101l(@StringRes int i) {
        if (i != -1) {
            lsi0.m151593w(i);
        }
        CoreModule.f17545c.f19685t1.m31516u(this.f30156i);
        BuzzMediaCallManager.INSTANCE.m46958W();
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f30147q.add(this.f30157j);
        m47097g();
        m47098h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31516u(this.f30156i);
        f30147q.remove(this.f30157j);
        mkd0.m154992z(this.f30154g);
        if (NullChecker.m81303a(this.f30153f)) {
            this.f30153f.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m47093j();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f30149b = i;
        this.f30150c = i2;
        this.f30151d = xdl0.m208412y0();
        this.f30152e = xdl0.m208408w0();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f30158k.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30148a = false;
            f30143m = (int) motionEvent.getX();
            f30144n = (int) motionEvent.getY();
        } else if (action == 1) {
            setPressed(false);
            m47095n();
            this.f30148a = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - f30143m;
            float y = motionEvent.getY() - f30144n;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.f30148a = true;
                int left = (int) (getLeft() + x);
                int i2 = this.f30149b + left;
                int top = (int) (getTop() + y);
                int i3 = this.f30150c;
                int i4 = top + i3;
                if (left < 0) {
                    i2 = this.f30149b;
                    left = 0;
                } else {
                    int i5 = this.f30151d;
                    if (i2 > i5) {
                        left = i5 - this.f30149b;
                        i2 = i5;
                    }
                }
                if (top >= 0) {
                    int i6 = this.f30152e;
                    if (i4 > i6) {
                        int i7 = i6 - i3;
                        i3 = i6;
                        i = i7;
                    } else {
                        i = top;
                        i3 = i4;
                    }
                }
                f30145o = left;
                f30146p = i;
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
            m47095n();
            this.f30148a = false;
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        long j5 = j3 - j;
        if (TextUtils.equals(str, this.f30156i)) {
            this.f30155h.setText(m6w.INSTANCE.m153298c(j5));
        }
        if (j5 <= 0) {
            m47101l(R$string.f20267z0);
        }
    }

    public BuzzVoiceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30156i = "countdown_voice_buzz_zoom_key" + mqi0.m155944o();
        this.f30157j = new d30() { // from class: l.rp3
            @Override // p149l.d30
            public final void call() {
                this.f160471a.m47093j();
            }
        };
        this.f30158k = new GestureDetector(getContext(), new C8424a());
        m47092f();
    }

    public BuzzVoiceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30156i = "countdown_voice_buzz_zoom_key" + mqi0.m155944o();
        this.f30157j = new d30() { // from class: l.rp3
            @Override // p149l.d30
            public final void call() {
                this.f160471a.m47093j();
            }
        };
        this.f30158k = new GestureDetector(getContext(), new C8424a());
        m47092f();
    }
}
