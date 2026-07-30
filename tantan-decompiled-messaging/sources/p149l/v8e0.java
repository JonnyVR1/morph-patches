package p149l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.TickerView;

/* JADX INFO: loaded from: classes3.dex */
public class v8e0 {

    /* JADX INFO: renamed from: a */
    public View f180478a;

    /* JADX INFO: renamed from: b */
    public View f180479b;

    /* JADX INFO: renamed from: c */
    public View f180480c;

    /* JADX INFO: renamed from: d */
    public View f180481d;

    /* JADX INFO: renamed from: e */
    public View f180482e;

    /* JADX INFO: renamed from: f */
    public View f180483f;

    /* JADX INFO: renamed from: g */
    public TickerView f180484g;

    /* JADX INFO: renamed from: h */
    public boolean f180485h;

    /* JADX INFO: renamed from: i */
    public Animator f180486i;

    /* JADX INFO: renamed from: j */
    public Animator f180487j;

    /* JADX INFO: renamed from: k */
    public hpd0 f180488k = new hpd0("see_entry_anim_first_show_" + qib0.f154713b0.f139230a.userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: l */
    public int f180489l = 99;

    public v8e0(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull TickerView tickerView) {
        this.f180478a = view;
        this.f180479b = view2;
        this.f180480c = view3;
        this.f180481d = view4;
        this.f180482e = view5;
        this.f180483f = view6;
        this.f180484g = tickerView;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m197418A() {
        m197421D(this.f180481d);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m197419B() {
        m197421D(this.f180481d);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m197420C() {
        this.f180485h = false;
    }

    /* JADX INFO: renamed from: D */
    public final void m197421D(View view) {
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        view.setAlpha(0.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: E */
    public void m197422E(int i, int i2) {
        if (m197431r()) {
            m197426I();
        }
        this.f180485h = true;
        m197425H(i, i2);
        if (this.f180488k.get().booleanValue()) {
            this.f180488k.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m197423F() {
        bt0.m103732e(this.f180480c);
        bt0.m103732e(this.f180481d);
        bt0.m103732e(this.f180482e);
        bt0.m103732e(this.f180483f);
        Animator animatorM103733f = bt0.m103733f(bt0.m103753z(bt0.m103734g(m197427n(this.f180480c, 400L), new Runnable() { // from class: l.m8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132566a.m197438y();
            }
        }, new Runnable() { // from class: l.n8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137637a.m197439z();
            }
        }), bt0.m103734g(m197428o(this.f180481d, 800L), new Runnable() { // from class: l.o8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142621a.m197418A();
            }
        }, new Runnable() { // from class: l.p8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147588a.m197419B();
            }
        }), bt0.m103734g(m197427n(this.f180482e, 1200L), new Runnable() { // from class: l.q8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153187a.m197433t();
            }
        }, new Runnable() { // from class: l.r8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158210a.m197434u();
            }
        }), bt0.m103734g(m197428o(this.f180483f, 1600L), new Runnable() { // from class: l.s8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163055a.m197435v();
            }
        }, new Runnable() { // from class: l.t8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168905a.m197436w();
            }
        })), new Runnable() { // from class: l.u8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f175119a.m197437x();
            }
        });
        this.f180486i = animatorM103733f;
        animatorM103733f.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m197424G(int i, int i2) {
        this.f180479b.setVisibility(0);
        this.f180479b.setBackgroundResource(x2c0.f189964Zt);
        this.f180478a.getBackground().setAlpha(0);
        int i3 = i2 - i;
        int i4 = 800 / i3;
        int i5 = i4 > 16 ? 720 : 1080;
        if (i4 <= 16) {
            i4 = 16;
        }
        long j = (i4 * i3) + 2000;
        Animator animatorM103733f = bt0.m103733f(bt0.m103753z(m197430q(j, i5, i2), m197429p(j)), new Runnable() { // from class: l.i8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112032a.m197420C();
            }
        });
        this.f180487j = animatorM103733f;
        animatorM103733f.start();
    }

    /* JADX INFO: renamed from: H */
    public final void m197425H(int i, int i2) {
        int iMax = this.f180488k.get().booleanValue() ? 0 : Math.max(i, 0);
        int iMin = Math.min(i2, this.f180489l);
        if (iMax >= 99) {
            this.f180484g.m222920n("99+");
            m197423F();
        } else {
            m197424G(iMax, iMin);
            this.f180484g.m222919m(iMax, i2, null, null);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m197426I() {
        this.f180485h = false;
        if (NullChecker.m81303a(this.f180486i)) {
            this.f180486i.end();
            this.f180486i = null;
        }
        if (NullChecker.m81303a(this.f180487j)) {
            this.f180487j.end();
            this.f180487j = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Animator m197427n(final View view, long j) {
        long j2 = j + 400;
        return bt0.m103749v(bt0.m103753z(bt0.m103743p(view, "translationX", j, 1600L, null, 0.0f, -t100.m186890d(7.0f), -t100.m186890d(10.5f), -t100.m186890d(9.1f), -t100.m186890d(5.6f)), bt0.m103743p(view, "translationY", j, 1600L, null, 0.0f, -t100.m186890d(7.0f), -t100.m186890d(14.0f), -t100.m186890d(21.0f), -t100.m186890d(28.0f)), bt0.m103743p(view, "scaleX", j2, 1200L, null, 0.5f, 0.8f, 1.0f), bt0.m103743p(view, "scaleY", j2, 1200L, null, 0.5f, 0.8f, 1.0f), bt0.m103743p(view, "alpha", j, 1600L, null, 0.0f, 1.0f, 1.0f, 0.5f, 0.0f), bt0.m103743p(view, BLiveGiftItem.TYPE_ROTATION, j, 1600L, null, 0.0f, -30.0f, -15.0f, -5.0f, 0.0f)), new Runnable() { // from class: l.j8e0
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final Animator m197428o(final View view, long j) {
        long j2 = j + 800;
        return bt0.m103749v(bt0.m103753z(bt0.m103743p(view, "translationX", j, 1200L, null, 0.0f, t100.m186890d(7.0f), t100.m186890d(10.5f), t100.m186890d(9.1f)), bt0.m103743p(view, "translationY", j, 1200L, null, 0.0f, -t100.m186890d(7.0f), -t100.m186890d(14.0f), -t100.m186890d(21.0f)), bt0.m103743p(view, "scaleX", j2, 400L, null, 0.5f, 0.8f), bt0.m103743p(view, "scaleY", j2, 400L, null, 0.5f, 0.8f), bt0.m103743p(view, "alpha", j, 1200L, null, 0.0f, 1.0f, 0.5f, 0.0f), bt0.m103743p(view, BLiveGiftItem.TYPE_ROTATION, j, 1200L, null, 0.0f, 30.0f)), new Runnable() { // from class: l.k8e0
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final Animator m197429p(long j) {
        return bt0.m103738k(ObjectAnimator.ofInt(this.f180478a.getBackground(), "alpha", 0, 255), null, j - 500, 500L);
    }

    /* JADX INFO: renamed from: q */
    public final Animator m197430q(long j, long j2, int i) {
        return bt0.m103733f(bt0.m103743p(this.f180479b, BLiveGiftItem.TYPE_ROTATION, 0L, j, null, 0.0f, j2), new Runnable() { // from class: l.l8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f126822a.m197432s();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public boolean m197431r() {
        return this.f180485h;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m197432s() {
        this.f180479b.setVisibility(8);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m197433t() {
        m197421D(this.f180482e);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m197434u() {
        m197421D(this.f180482e);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m197435v() {
        m197421D(this.f180483f);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m197436w() {
        m197421D(this.f180483f);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m197437x() {
        this.f180485h = false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m197438y() {
        m197421D(this.f180480c);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m197439z() {
        m197421D(this.f180480c);
    }
}
