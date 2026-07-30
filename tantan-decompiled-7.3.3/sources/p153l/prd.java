package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.CommonMediaPreviewAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.Locale;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class prd implements zs80 {

    /* JADX INFO: renamed from: a */
    public VFrame f153752a;

    /* JADX INFO: renamed from: b */
    public View f153753b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f153754c;

    /* JADX INFO: renamed from: d */
    public VImage f153755d;

    /* JADX INFO: renamed from: e */
    public VText f153756e;

    /* JADX INFO: renamed from: f */
    public VImage f153757f;

    /* JADX INFO: renamed from: g */
    public VImage f153758g;

    /* JADX INFO: renamed from: h */
    public final CommonMediaPreviewAct f153759h;

    /* JADX INFO: renamed from: i */
    public boolean f153760i = true;

    /* JADX INFO: renamed from: j */
    public float f153761j;

    /* JADX INFO: renamed from: k */
    public float f153762k;

    /* JADX INFO: renamed from: l.prd$a */
    public class C19423a extends AnimatorListenerAdapter {
        public C19423a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            prd.this.m173451w();
        }
    }

    public prd(CommonMediaPreviewAct commonMediaPreviewAct) {
        this.f153759h = commonMediaPreviewAct;
    }

    @Override // p153l.pq80
    /* JADX INFO: renamed from: b */
    public void mo173326b(cf60 cf60Var) {
        if (cf60Var instanceof dl5) {
            ((dl5) cf60Var).m116737x(m173446r());
        }
    }

    @Override // p153l.pq80
    /* JADX INFO: renamed from: e */
    public ie80.C17711c mo173328e() {
        return null;
    }

    @Override // p153l.pq80
    /* JADX INFO: renamed from: f */
    public void mo173329f(ViewPager viewPager, int i, int i2) {
        this.f153756e.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i2 + 1), Integer.valueOf(this.f153759h.f31497g.m140587m0().source().size())));
    }

    @Override // p153l.pq80
    /* JADX INFO: renamed from: g */
    public void mo173330g() {
        m173447s();
    }

    /* JADX INFO: renamed from: o */
    public View m173443o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qrd.m177537b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.ys80
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo173442c(View view, Media media) {
        View viewM173448t = m173448t();
        if (viewM173448t != null) {
            ((ViewGroup) view).addView(viewM173448t);
        }
        m173445q(media);
    }

    /* JADX INFO: renamed from: q */
    public final void m173445q(Media media) {
        bnl0.m105509E0(this.f153755d, new View.OnClickListener() { // from class: l.nrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143397a.m173449u(view);
            }
        });
        bnl0.m105524M(this.f153758g, false);
    }

    /* JADX INFO: renamed from: r */
    public final rae m173446r() {
        return new C19424b();
    }

    /* JADX INFO: renamed from: s */
    public void m173447s() {
        boolean z = this.f153760i;
        View view = this.f153753b;
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, view.getHeight()) : ValueAnimator.ofFloat(view.getHeight(), 0.0f);
        valueAnimatorOfFloat.addListener(new C19423a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ord
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f148697a.m173450v(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: t */
    public final View m173448t() {
        return m173443o(this.f153759h.inflater(), null);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m173449u(View view) {
        this.f153759h.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m173450v(ValueAnimator valueAnimator) {
        float f = -((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f153754c.setTranslationY(f);
        this.f153753b.setTranslationY(f);
    }

    /* JADX INFO: renamed from: w */
    public final void m173451w() {
        this.f153760i = !this.f153760i;
        this.f153761j = this.f153754c.getTranslationY();
        this.f153762k = this.f153753b.getTranslationY();
    }

    /* JADX INFO: renamed from: l.prd$b */
    public class C19424b implements rae {

        /* JADX INFO: renamed from: a */
        public boolean f153764a = false;

        public C19424b() {
        }

        @Override // p153l.rae
        /* JADX INFO: renamed from: b */
        public void mo173453b(float f, float f2) {
            prd prdVar;
            LinearLayout linearLayout;
            if (this.f153764a || (linearLayout = (prdVar = prd.this).f153754c) == null || f2 < 0.0f) {
                return;
            }
            linearLayout.setTranslationY(prdVar.f153761j - f2);
            prd prdVar2 = prd.this;
            prdVar2.f153753b.setTranslationY(prdVar2.f153762k - f2);
        }

        @Override // p153l.am50
        /* JADX INFO: renamed from: d */
        public void mo45667d() {
            this.f153764a = true;
        }

        @Override // p153l.rae
        /* JADX INFO: renamed from: a */
        public void mo173452a() {
        }

        @Override // p153l.am50
        /* JADX INFO: renamed from: c */
        public void mo45666c(float f, float f2) {
        }
    }

    @Override // p153l.ys80
    public void onDestroy() {
    }

    @Override // p153l.ys80
    /* JADX INFO: renamed from: a */
    public void mo173441a(boolean z) {
    }

    @Override // p153l.pq80
    /* JADX INFO: renamed from: h */
    public void mo173331h(int i, PhotoPreviewView photoPreviewView) {
    }

    @Override // p153l.pq80
    /* JADX INFO: renamed from: i */
    public void mo173332i(int i, PlayerView playerView) {
    }
}
