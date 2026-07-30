package p003l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p001ui.mediapreview.CommonMediaPreviewAct;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import com.p1.mobile.putong.core.ui.PlayerView;
import com.p1.mobile.putong.data.Media;
import java.util.Locale;
import l.c680;
import l.w660;
import l.xdl0;
import l.zpd;
import p028v.VFrame;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ypd implements vk80 {

    /* JADX INFO: renamed from: a */
    public VFrame f9095a;

    /* JADX INFO: renamed from: b */
    public View f9096b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f9097c;

    /* JADX INFO: renamed from: d */
    public VImage f9098d;

    /* JADX INFO: renamed from: e */
    public VText f9099e;

    /* JADX INFO: renamed from: f */
    public VImage f9100f;

    /* JADX INFO: renamed from: g */
    public VImage f9101g;

    /* JADX INFO: renamed from: h */
    public final CommonMediaPreviewAct f9102h;

    /* JADX INFO: renamed from: i */
    public boolean f9103i = true;

    /* JADX INFO: renamed from: j */
    public float f9104j;

    /* JADX INFO: renamed from: k */
    public float f9105k;

    /* JADX INFO: renamed from: l.ypd$a */
    public class C0663a extends AnimatorListenerAdapter {
        public C0663a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ypd.this.m9216w();
        }
    }

    public ypd(CommonMediaPreviewAct commonMediaPreviewAct) {
        this.f9102h = commonMediaPreviewAct;
    }

    @Override // p003l.li80
    /* JADX INFO: renamed from: b */
    public void mo6026b(w660 w660Var) {
        if (w660Var instanceof ck5) {
            ((ck5) w660Var).m3368x(m9211r());
        }
    }

    @Override // p003l.li80
    /* JADX INFO: renamed from: e */
    public c680.c mo6028e() {
        return null;
    }

    @Override // p003l.li80
    /* JADX INFO: renamed from: f */
    public void mo6029f(ViewPager viewPager, int i, int i2) {
        this.f9099e.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i2 + 1), Integer.valueOf(this.f9102h.f540g.m4979m0().source().size())));
    }

    @Override // p003l.li80
    /* JADX INFO: renamed from: g */
    public void mo6030g() {
        m9212s();
    }

    /* JADX INFO: renamed from: o */
    public View m9208o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zpd.b(this, layoutInflater, viewGroup);
    }

    @Override // p003l.uk80
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo8154c(View view, Media media) {
        View viewM9213t = m9213t();
        if (viewM9213t != null) {
            ((ViewGroup) view).addView(viewM9213t);
        }
        m9210q(media);
    }

    /* JADX INFO: renamed from: q */
    public final void m9210q(Media media) {
        xdl0.E0(this.f9098d, new View.OnClickListener() { // from class: l.wpd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8589a.m9214u(view);
            }
        });
        xdl0.M(this.f9101g, false);
    }

    /* JADX INFO: renamed from: r */
    public final n9e m9211r() {
        return new C0664b();
    }

    /* JADX INFO: renamed from: s */
    public void m9212s() {
        boolean z = this.f9103i;
        View view = this.f9096b;
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, view.getHeight()) : ValueAnimator.ofFloat(view.getHeight(), 0.0f);
        valueAnimatorOfFloat.addListener(new C0663a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xpd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8812a.m9215v(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: t */
    public final View m9213t() {
        return m9208o(this.f9102h.inflater(), null);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m9214u(View view) {
        this.f9102h.finish();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m9215v(ValueAnimator valueAnimator) {
        float f = -((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9097c.setTranslationY(f);
        this.f9096b.setTranslationY(f);
    }

    /* JADX INFO: renamed from: w */
    public final void m9216w() {
        this.f9103i = !this.f9103i;
        this.f9104j = this.f9097c.getTranslationY();
        this.f9105k = this.f9096b.getTranslationY();
    }

    /* JADX INFO: renamed from: l.ypd$b */
    public class C0664b implements n9e {

        /* JADX INFO: renamed from: a */
        public boolean f9107a = false;

        public C0664b() {
        }

        @Override // p003l.n9e
        /* JADX INFO: renamed from: b */
        public void mo6530b(float f, float f2) {
            ypd ypdVar;
            LinearLayout linearLayout;
            if (this.f9107a || (linearLayout = (ypdVar = ypd.this).f9097c) == null || f2 < 0.0f) {
                return;
            }
            linearLayout.setTranslationY(ypdVar.f9104j - f2);
            ypd ypdVar2 = ypd.this;
            ypdVar2.f9096b.setTranslationY(ypdVar2.f9105k - f2);
        }

        @Override // p003l.td50
        /* JADX INFO: renamed from: d */
        public void mo930d() {
            this.f9107a = true;
        }

        @Override // p003l.n9e
        /* JADX INFO: renamed from: a */
        public void mo6529a() {
        }

        @Override // p003l.td50
        /* JADX INFO: renamed from: c */
        public void mo929c(float f, float f2) {
        }
    }

    @Override // p003l.uk80
    public void onDestroy() {
    }

    @Override // p003l.uk80
    /* JADX INFO: renamed from: a */
    public void mo8153a(boolean z) {
    }

    @Override // p003l.li80
    /* JADX INFO: renamed from: h */
    public void mo6031h(int i, PhotoPreviewView photoPreviewView) {
    }

    @Override // p003l.li80
    /* JADX INFO: renamed from: i */
    public void mo6032i(int i, PlayerView playerView) {
    }
}
