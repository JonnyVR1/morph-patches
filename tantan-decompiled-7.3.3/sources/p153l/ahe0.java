package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.TickerView;

/* JADX INFO: loaded from: classes3.dex */
public class ahe0 {

    /* JADX INFO: renamed from: a */
    public View f71341a;

    /* JADX INFO: renamed from: b */
    public View f71342b;

    /* JADX INFO: renamed from: c */
    public View f71343c;

    /* JADX INFO: renamed from: d */
    public View f71344d;

    /* JADX INFO: renamed from: e */
    public View f71345e;

    /* JADX INFO: renamed from: f */
    public View f71346f;

    /* JADX INFO: renamed from: g */
    public TickerView f71347g;

    /* JADX INFO: renamed from: h */
    public boolean f71348h;

    /* JADX INFO: renamed from: i */
    public Animator f71349i;

    /* JADX INFO: renamed from: j */
    public Animator f71350j;

    /* JADX INFO: renamed from: k */
    public jxd0 f71351k = new jxd0("see_entry_anim_first_show_" + uqb0.f180396b0.f170324a.userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: l */
    public int f71352l = 99;

    public ahe0(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull TickerView tickerView) {
        this.f71341a = view;
        this.f71342b = view2;
        this.f71343c = view3;
        this.f71344d = view4;
        this.f71345e = view5;
        this.f71346f = view6;
        this.f71347g = tickerView;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m97808A() {
        m97811D(this.f71344d);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m97809B() {
        m97811D(this.f71344d);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m97810C() {
        this.f71348h = false;
    }

    /* JADX INFO: renamed from: D */
    public final void m97811D(View view) {
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        view.setAlpha(0.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: E */
    public void m97812E(int i, int i2) {
        if (m97821r()) {
            m97816I();
        }
        this.f71348h = true;
        m97815H(i, i2);
        if (this.f71351k.get().booleanValue()) {
            this.f71351k.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m97813F() {
        gt0.m132159e(this.f71343c);
        gt0.m132159e(this.f71344d);
        gt0.m132159e(this.f71345e);
        gt0.m132159e(this.f71346f);
        Animator animatorM132160f = gt0.m132160f(gt0.m132180z(gt0.m132161g(m97817n(this.f71343c, 400L), new Runnable() { // from class: l.rge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163009a.m97828y();
            }
        }, new Runnable() { // from class: l.sge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167846a.m97829z();
            }
        }), gt0.m132161g(m97818o(this.f71344d, 800L), new Runnable() { // from class: l.tge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174075a.m97808A();
            }
        }, new Runnable() { // from class: l.uge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178888a.m97809B();
            }
        }), gt0.m132161g(m97817n(this.f71345e, 1200L), new Runnable() { // from class: l.vge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184022a.m97823t();
            }
        }, new Runnable() { // from class: l.wge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188969a.m97824u();
            }
        }), gt0.m132161g(m97818o(this.f71346f, 1600L), new Runnable() { // from class: l.xge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194184a.m97825v();
            }
        }, new Runnable() { // from class: l.yge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199824a.m97826w();
            }
        })), new Runnable() { // from class: l.zge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204293a.m97827x();
            }
        });
        this.f71349i = animatorM132160f;
        animatorM132160f.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m97814G(int i, int i2) {
        this.f71342b.setVisibility(0);
        this.f71342b.setBackgroundResource(dbc0.f86423Nu);
        this.f71341a.getBackground().setAlpha(0);
        int i3 = i2 - i;
        int i4 = 800 / i3;
        int i5 = i4 > 16 ? 720 : 1080;
        if (i4 <= 16) {
            i4 = 16;
        }
        long j = (i4 * i3) + 2000;
        Animator animatorM132160f = gt0.m132160f(gt0.m132180z(m97820q(j, i5, i2), m97819p(j)), new Runnable() { // from class: l.nge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141812a.m97810C();
            }
        });
        this.f71350j = animatorM132160f;
        animatorM132160f.start();
    }

    /* JADX INFO: renamed from: H */
    public final void m97815H(int i, int i2) {
        int iMax = this.f71351k.get().booleanValue() ? 0 : Math.max(i, 0);
        int iMin = Math.min(i2, this.f71352l);
        if (iMax >= 99) {
            this.f71347g.m224166n("99+");
            m97813F();
        } else {
            m97814G(iMax, iMin);
            this.f71347g.m224165m(iMax, i2, null, null);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m97816I() {
        this.f71348h = false;
        if (NullChecker.m82486a(this.f71349i)) {
            this.f71349i.end();
            this.f71349i = null;
        }
        if (NullChecker.m82486a(this.f71350j)) {
            this.f71350j.end();
            this.f71350j = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Animator m97817n(final View view, long j) {
        long j2 = j + 400;
        return gt0.m132176v(gt0.m132180z(gt0.m132170p(view, "translationX", j, 1600L, null, 0.0f, -qa00.m175859d(7.0f), -qa00.m175859d(10.5f), -qa00.m175859d(9.1f), -qa00.m175859d(5.6f)), gt0.m132170p(view, "translationY", j, 1600L, null, 0.0f, -qa00.m175859d(7.0f), -qa00.m175859d(14.0f), -qa00.m175859d(21.0f), -qa00.m175859d(28.0f)), gt0.m132170p(view, "scaleX", j2, 1200L, null, 0.5f, 0.8f, 1.0f), gt0.m132170p(view, "scaleY", j2, 1200L, null, 0.5f, 0.8f, 1.0f), gt0.m132170p(view, "alpha", j, 1600L, null, 0.0f, 1.0f, 1.0f, 0.5f, 0.0f), gt0.m132170p(view, BLiveGiftItem.TYPE_ROTATION, j, 1600L, null, 0.0f, -30.0f, -15.0f, -5.0f, 0.0f)), new Runnable() { // from class: l.oge0
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final Animator m97818o(final View view, long j) {
        long j2 = j + 800;
        return gt0.m132176v(gt0.m132180z(gt0.m132170p(view, "translationX", j, 1200L, null, 0.0f, qa00.m175859d(7.0f), qa00.m175859d(10.5f), qa00.m175859d(9.1f)), gt0.m132170p(view, "translationY", j, 1200L, null, 0.0f, -qa00.m175859d(7.0f), -qa00.m175859d(14.0f), -qa00.m175859d(21.0f)), gt0.m132170p(view, "scaleX", j2, 400L, null, 0.5f, 0.8f), gt0.m132170p(view, "scaleY", j2, 400L, null, 0.5f, 0.8f), gt0.m132170p(view, "alpha", j, 1200L, null, 0.0f, 1.0f, 0.5f, 0.0f), gt0.m132170p(view, BLiveGiftItem.TYPE_ROTATION, j, 1200L, null, 0.0f, 30.0f)), new Runnable() { // from class: l.pge0
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final Animator m97819p(long j) {
        return gt0.m132165k(ObjectAnimator.ofInt(this.f71341a.getBackground(), "alpha", 0, 255), null, j - 500, 500L);
    }

    /* JADX INFO: renamed from: q */
    public final Animator m97820q(long j, long j2, int i) {
        return gt0.m132160f(gt0.m132170p(this.f71342b, BLiveGiftItem.TYPE_ROTATION, 0L, j, null, 0.0f, j2), new Runnable() { // from class: l.qge0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157404a.m97822s();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public boolean m97821r() {
        return this.f71348h;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m97822s() {
        this.f71342b.setVisibility(8);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m97823t() {
        m97811D(this.f71345e);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m97824u() {
        m97811D(this.f71345e);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m97825v() {
        m97811D(this.f71346f);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m97826w() {
        m97811D(this.f71346f);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m97827x() {
        this.f71348h = false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m97828y() {
        m97811D(this.f71343c);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m97829z() {
        m97811D(this.f71343c);
    }
}
