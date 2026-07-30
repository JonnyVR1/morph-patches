package p003l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.hpd0;
import l.qib0;
import l.t100;
import l.x2c0;
import p028v.TickerView;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class v8e0 {

    /* JADX INFO: renamed from: a */
    public View f8236a;

    /* JADX INFO: renamed from: b */
    public View f8237b;

    /* JADX INFO: renamed from: c */
    public View f8238c;

    /* JADX INFO: renamed from: d */
    public View f8239d;

    /* JADX INFO: renamed from: e */
    public View f8240e;

    /* JADX INFO: renamed from: f */
    public View f8241f;

    /* JADX INFO: renamed from: g */
    public TickerView f8242g;

    /* JADX INFO: renamed from: h */
    public boolean f8243h;

    /* JADX INFO: renamed from: i */
    public Animator f8244i;

    /* JADX INFO: renamed from: j */
    public Animator f8245j;

    /* JADX INFO: renamed from: k */
    public hpd0 f8246k = new hpd0("see_entry_anim_first_show_" + qib0.b0.a.userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: l */
    public int f8247l = 99;

    public v8e0(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull TickerView tickerView) {
        this.f8236a = view;
        this.f8237b = view2;
        this.f8238c = view3;
        this.f8239d = view4;
        this.f8240e = view5;
        this.f8241f = view6;
        this.f8242g = tickerView;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8317A() {
        m8320D(this.f8239d);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m8318B() {
        m8320D(this.f8239d);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m8319C() {
        this.f8243h = false;
    }

    /* JADX INFO: renamed from: D */
    public final void m8320D(View view) {
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        view.setAlpha(0.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: E */
    public void m8321E(int i, int i2) {
        if (m8330r()) {
            m8325I();
        }
        this.f8243h = true;
        m8324H(i, i2);
        if (((Boolean) this.f8246k.get()).booleanValue()) {
            this.f8246k.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8322F() {
        bt0.e(this.f8238c);
        bt0.e(this.f8239d);
        bt0.e(this.f8240e);
        bt0.e(this.f8241f);
        Animator animatorF = bt0.f(bt0.z(new Animator[]{bt0.g(m8326n(this.f8238c, 400L), new Runnable() { // from class: l.m8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5565a.m8337y();
            }
        }, new Runnable() { // from class: l.n8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5843a.m8338z();
            }
        }), bt0.g(m8327o(this.f8239d, 800L), new Runnable() { // from class: l.o8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6060a.m8317A();
            }
        }, new Runnable() { // from class: l.p8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6330a.m8318B();
            }
        }), bt0.g(m8326n(this.f8240e, 1200L), new Runnable() { // from class: l.q8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6604a.m8332t();
            }
        }, new Runnable() { // from class: l.r8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6803a.m8333u();
            }
        }), bt0.g(m8327o(this.f8241f, 1600L), new Runnable() { // from class: l.s8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7153a.m8334v();
            }
        }, new Runnable() { // from class: l.t8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7419a.m8335w();
            }
        })}), new Runnable() { // from class: l.u8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7934a.m8336x();
            }
        });
        this.f8244i = animatorF;
        animatorF.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m8323G(int i, int i2) {
        this.f8237b.setVisibility(0);
        this.f8237b.setBackgroundResource(x2c0.Zt);
        this.f8236a.getBackground().setAlpha(0);
        int i3 = i2 - i;
        int i4 = 800 / i3;
        int i5 = i4 > 16 ? 720 : 1080;
        if (i4 <= 16) {
            i4 = 16;
        }
        long j = (i4 * i3) + ijkMediaStreamer.MEDIA_RECORDER_TRACK_INFO_LIST_END;
        Animator animatorF = bt0.f(bt0.z(new Animator[]{m8329q(j, i5, i2), m8328p(j)}), new Runnable() { // from class: l.i8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4380a.m8319C();
            }
        });
        this.f8245j = animatorF;
        animatorF.start();
    }

    /* JADX INFO: renamed from: H */
    public final void m8324H(int i, int i2) {
        int iMax = ((Boolean) this.f8246k.get()).booleanValue() ? 0 : Math.max(i, 0);
        int iMin = Math.min(i2, this.f8247l);
        if (iMax >= 99) {
            this.f8242g.m11393n("99+");
            m8322F();
        } else {
            m8323G(iMax, iMin);
            this.f8242g.m11392m(iMax, i2, null, null);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m8325I() {
        this.f8243h = false;
        if (NullChecker.a(this.f8244i)) {
            this.f8244i.end();
            this.f8244i = null;
        }
        if (NullChecker.a(this.f8245j)) {
            this.f8245j.end();
            this.f8245j = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Animator m8326n(final View view, long j) {
        long j2 = j + 400;
        return bt0.v(bt0.z(new Animator[]{bt0.p(view, "translationX", j, 1600L, (Interpolator) null, new float[]{0.0f, -t100.d(7.0f), -t100.d(10.5f), -t100.d(9.1f), -t100.d(5.6f)}), bt0.p(view, "translationY", j, 1600L, (Interpolator) null, new float[]{0.0f, -t100.d(7.0f), -t100.d(14.0f), -t100.d(21.0f), -t100.d(28.0f)}), bt0.p(view, "scaleX", j2, 1200L, (Interpolator) null, new float[]{0.5f, 0.8f, 1.0f}), bt0.p(view, "scaleY", j2, 1200L, (Interpolator) null, new float[]{0.5f, 0.8f, 1.0f}), bt0.p(view, "alpha", j, 1600L, (Interpolator) null, new float[]{0.0f, 1.0f, 1.0f, 0.5f, 0.0f}), bt0.p(view, "rotation", j, 1600L, (Interpolator) null, new float[]{0.0f, -30.0f, -15.0f, -5.0f, 0.0f})}), new Runnable() { // from class: l.j8e0
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final Animator m8327o(final View view, long j) {
        long j2 = j + 800;
        return bt0.v(bt0.z(new Animator[]{bt0.p(view, "translationX", j, 1200L, (Interpolator) null, new float[]{0.0f, t100.d(7.0f), t100.d(10.5f), t100.d(9.1f)}), bt0.p(view, "translationY", j, 1200L, (Interpolator) null, new float[]{0.0f, -t100.d(7.0f), -t100.d(14.0f), -t100.d(21.0f)}), bt0.p(view, "scaleX", j2, 400L, (Interpolator) null, new float[]{0.5f, 0.8f}), bt0.p(view, "scaleY", j2, 400L, (Interpolator) null, new float[]{0.5f, 0.8f}), bt0.p(view, "alpha", j, 1200L, (Interpolator) null, new float[]{0.0f, 1.0f, 0.5f, 0.0f}), bt0.p(view, "rotation", j, 1200L, (Interpolator) null, new float[]{0.0f, 30.0f})}), new Runnable() { // from class: l.k8e0
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final Animator m8328p(long j) {
        return bt0.k(ObjectAnimator.ofInt(this.f8236a.getBackground(), "alpha", 0, 255), (Interpolator) null, j - 500, 500L);
    }

    /* JADX INFO: renamed from: q */
    public final Animator m8329q(long j, long j2, int i) {
        return bt0.f(bt0.p(this.f8237b, "rotation", 0L, j, (Interpolator) null, new float[]{0.0f, j2}), new Runnable() { // from class: l.l8e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5230a.m8331s();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public boolean m8330r() {
        return this.f8243h;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8331s() {
        this.f8237b.setVisibility(8);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8332t() {
        m8320D(this.f8240e);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8333u() {
        m8320D(this.f8240e);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8334v() {
        m8320D(this.f8241f);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8335w() {
        m8320D(this.f8241f);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8336x() {
        this.f8243h = false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8337y() {
        m8320D(this.f8238c);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8338z() {
        m8320D(this.f8238c);
    }
}
