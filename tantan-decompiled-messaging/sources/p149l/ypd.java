package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.CommonMediaPreviewAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.Locale;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ypd implements vk80 {

    /* JADX INFO: renamed from: a */
    public VFrame f199426a;

    /* JADX INFO: renamed from: b */
    public View f199427b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f199428c;

    /* JADX INFO: renamed from: d */
    public VImage f199429d;

    /* JADX INFO: renamed from: e */
    public VText f199430e;

    /* JADX INFO: renamed from: f */
    public VImage f199431f;

    /* JADX INFO: renamed from: g */
    public VImage f199432g;

    /* JADX INFO: renamed from: h */
    public final CommonMediaPreviewAct f199433h;

    /* JADX INFO: renamed from: i */
    public boolean f199434i = true;

    /* JADX INFO: renamed from: j */
    public float f199435j;

    /* JADX INFO: renamed from: k */
    public float f199436k;

    /* JADX INFO: renamed from: l.ypd$a */
    public class C21462a extends AnimatorListenerAdapter {
        public C21462a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ypd.this.m215601w();
        }
    }

    public ypd(CommonMediaPreviewAct commonMediaPreviewAct) {
        this.f199433h = commonMediaPreviewAct;
    }

    @Override // p149l.li80
    /* JADX INFO: renamed from: b */
    public void mo149880b(w660 w660Var) {
        if (w660Var instanceof ck5) {
            ((ck5) w660Var).m107384x(m215596r());
        }
    }

    @Override // p149l.li80
    /* JADX INFO: renamed from: e */
    public c680.C16085c mo149882e() {
        return null;
    }

    @Override // p149l.li80
    /* JADX INFO: renamed from: f */
    public void mo149883f(ViewPager viewPager, int i, int i2) {
        this.f199430e.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i2 + 1), Integer.valueOf(this.f199433h.f30649g.m131457m0().source().size())));
    }

    @Override // p149l.li80
    /* JADX INFO: renamed from: g */
    public void mo149884g() {
        m215597s();
    }

    /* JADX INFO: renamed from: o */
    public View m215593o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zpd.m219669b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.uk80
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo194148c(View view, Media media) {
        View viewM215598t = m215598t();
        if (viewM215598t != null) {
            ((ViewGroup) view).addView(viewM215598t);
        }
        m215595q(media);
    }

    /* JADX INFO: renamed from: q */
    public final void m215595q(Media media) {
        xdl0.m208329E0(this.f199429d, new View.OnClickListener() { // from class: l.wpd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187504a.m215599u(view);
            }
        });
        xdl0.m208344M(this.f199432g, false);
    }

    /* JADX INFO: renamed from: r */
    public final n9e m215596r() {
        return new C21463b();
    }

    /* JADX INFO: renamed from: s */
    public void m215597s() {
        boolean z = this.f199434i;
        View view = this.f199427b;
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, view.getHeight()) : ValueAnimator.ofFloat(view.getHeight(), 0.0f);
        valueAnimatorOfFloat.addListener(new C21462a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xpd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f193911a.m215600v(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: t */
    public final View m215598t() {
        return m215593o(this.f199433h.inflater(), null);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m215599u(View view) {
        this.f199433h.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m215600v(ValueAnimator valueAnimator) {
        float f = -((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f199428c.setTranslationY(f);
        this.f199427b.setTranslationY(f);
    }

    /* JADX INFO: renamed from: w */
    public final void m215601w() {
        this.f199434i = !this.f199434i;
        this.f199435j = this.f199428c.getTranslationY();
        this.f199436k = this.f199427b.getTranslationY();
    }

    /* JADX INFO: renamed from: l.ypd$b */
    public class C21463b implements n9e {

        /* JADX INFO: renamed from: a */
        public boolean f199438a = false;

        public C21463b() {
        }

        @Override // p149l.n9e
        /* JADX INFO: renamed from: b */
        public void mo158539b(float f, float f2) {
            ypd ypdVar;
            LinearLayout linearLayout;
            if (this.f199438a || (linearLayout = (ypdVar = ypd.this).f199428c) == null || f2 < 0.0f) {
                return;
            }
            linearLayout.setTranslationY(ypdVar.f199435j - f2);
            ypd ypdVar2 = ypd.this;
            ypdVar2.f199427b.setTranslationY(ypdVar2.f199436k - f2);
        }

        @Override // p149l.td50
        /* JADX INFO: renamed from: d */
        public void mo44484d() {
            this.f199438a = true;
        }

        @Override // p149l.n9e
        /* JADX INFO: renamed from: a */
        public void mo158538a() {
        }

        @Override // p149l.td50
        /* JADX INFO: renamed from: c */
        public void mo44483c(float f, float f2) {
        }
    }

    @Override // p149l.uk80
    public void onDestroy() {
    }

    @Override // p149l.uk80
    /* JADX INFO: renamed from: a */
    public void mo194147a(boolean z) {
    }

    @Override // p149l.li80
    /* JADX INFO: renamed from: h */
    public void mo149885h(int i, PhotoPreviewView photoPreviewView) {
    }

    @Override // p149l.li80
    /* JADX INFO: renamed from: i */
    public void mo149886i(int i, PlayerView playerView) {
    }
}
