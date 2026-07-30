package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class pp10 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f150595a;

    /* JADX INFO: renamed from: b */
    public TextView f150596b;

    /* JADX INFO: renamed from: c */
    public ImageView f150597c;

    /* JADX INFO: renamed from: d */
    public ImageView f150598d;

    /* JADX INFO: renamed from: e */
    public ImageView f150599e;

    /* JADX INFO: renamed from: f */
    public ImageView f150600f;

    /* JADX INFO: renamed from: g */
    public ur10 f150601g;

    /* JADX INFO: renamed from: h */
    public boolean f150602h;

    /* JADX INFO: renamed from: i */
    public View f150603i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f150604j;

    /* JADX INFO: renamed from: k */
    public View f150605k;

    /* JADX INFO: renamed from: l */
    public AppCompatSeekBar f150606l;

    /* JADX INFO: renamed from: m */
    public final Runnable f150607m = new Runnable() { // from class: l.fp10
        @Override // java.lang.Runnable
        public final void run() {
            this.f98658a.m170683m();
        }
    };

    /* JADX INFO: renamed from: n */
    public Animator f150608n;

    /* JADX INFO: renamed from: o */
    public Animator f150609o;

    /* JADX INFO: renamed from: p */
    public View f150610p;

    /* JADX INFO: renamed from: q */
    public View f150611q;

    /* JADX INFO: renamed from: l.pp10$a */
    public class C19307a implements SeekBar.OnSeekBarChangeListener {
        public C19307a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            pp10.this.f150601g.m195029C2(i / 100.0f);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.removeCallbacks(pp10.this.f150607m);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.postDelayed(pp10.this.f150607m, 1000L);
        }
    }

    public pp10(ur10 ur10Var, View view) {
        this.f150601g = ur10Var;
        m170685o(view);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m170663a(View view) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m170671i(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m170675A() {
        dt0.m113502B(this.f150604j);
        this.f150603i.setRotation(0.0f);
        this.f150595a.setRotation(0.0f);
    }

    /* JADX INFO: renamed from: B */
    public final void m170676B() {
        boolean z = this.f150602h;
        ur10 ur10Var = this.f150601g;
        if (z) {
            ur10Var.m195028B2();
        } else {
            ur10Var.m195035y2();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m170677C(List<IntlMusicBean> list) {
        if (vwb.m200296J(list)) {
            m170684n();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m170678D() {
        dt0.m113502B(this.f150608n);
        dt0.m113502B(this.f150609o);
        View view = this.f150605k;
        Property property = View.ALPHA;
        Animator duration = bt0.m103741n(view, property, 1.0f, 0.0f).setDuration(100L);
        Animator duration2 = bt0.m103741n(this.f150606l, property, 0.0f, 1.0f).setDuration(100L);
        duration2.setStartDelay(200L);
        Animator animatorM103753z = bt0.m103753z(duration, duration2);
        this.f150609o = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.op10
            @Override // java.lang.Runnable
            public final void run() {
                this.f144944a.m170691u();
            }
        });
        this.f150609o.start();
        this.f150606l.removeCallbacks(this.f150607m);
        this.f150606l.postDelayed(this.f150607m, 1300L);
    }

    /* JADX INFO: renamed from: E */
    public void m170679E(boolean z) {
        xdl0.m208344M(this.f150610p, z);
        if (z) {
            xdl0.m208329E0(this.f150610p, new View.OnClickListener() { // from class: l.gp10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pp10.m170671i(view);
                }
            });
            dt0.m113501A(this.f150609o);
            dt0.m113501A(this.f150608n);
            xdl0.m208344M(this.f150606l, false);
            this.f150605k.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m170680F(IntlMusicBean intlMusicBean) {
        this.f150596b.setText(intlMusicBean.title);
        et10.m117969a(intlMusicBean.filePath, this.f150595a, h3c0.f105611G);
        this.f150598d.setImageResource(pr10.m170951f1().m170972m1() ? h3c0.f105629P : h3c0.f105625N);
        this.f150600f.setImageResource(h3c0.f105637T);
        this.f150599e.setImageResource(h3c0.f105619K);
    }

    /* JADX INFO: renamed from: G */
    public void m170681G(boolean z) {
        xdl0.m208344M(this.f150611q, !z);
        if (z) {
            return;
        }
        xdl0.m208329E0(this.f150611q, new View.OnClickListener() { // from class: l.np10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pp10.m170663a(view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m170682H() {
        final float rotation = this.f150603i.getRotation();
        dt0.m113502B(this.f150604j);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f150604j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(10000L);
        this.f150604j.setRepeatCount(-1);
        this.f150604j.setRepeatMode(1);
        this.f150604j.setInterpolator(new LinearInterpolator());
        this.f150604j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mp10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f135000a.m170692v(rotation, valueAnimator);
            }
        });
        this.f150604j.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m170683m() {
        dt0.m113502B(this.f150608n);
        dt0.m113502B(this.f150609o);
        AppCompatSeekBar appCompatSeekBar = this.f150606l;
        Property property = View.ALPHA;
        Animator duration = bt0.m103741n(appCompatSeekBar, property, 1.0f, 0.0f).setDuration(100L);
        Animator duration2 = bt0.m103741n(this.f150605k, property, 0.0f, 1.0f).setDuration(100L);
        duration2.setStartDelay(200L);
        Animator animatorM103753z = bt0.m103753z(duration, duration2);
        this.f150608n = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.lp10
            @Override // java.lang.Runnable
            public final void run() {
                this.f129153a.m170686p();
            }
        });
        this.f150608n.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m170684n() {
        this.f150597c.setImageResource(h3c0.f105621L);
        this.f150598d.setImageResource(h3c0.f105615I);
        this.f150599e.setImageResource(h3c0.f105617J);
        this.f150600f.setImageResource(h3c0.f105635S);
        this.f150596b.setText(R$string.f44895d);
        this.f150595a.setImageResource(h3c0.f105611G);
    }

    /* JADX INFO: renamed from: o */
    public void m170685o(View view) {
        this.f150595a = (VDraweeView) view.findViewById(f5c0.f95041R);
        this.f150603i = view.findViewById(f5c0.f95038Q);
        this.f150596b = (TextView) view.findViewById(f5c0.f95066Z0);
        this.f150597c = (ImageView) view.findViewById(f5c0.f95094g1);
        this.f150598d = (ImageView) view.findViewById(f5c0.f95060X0);
        this.f150599e = (ImageView) view.findViewById(f5c0.f95086e1);
        this.f150600f = (ImageView) view.findViewById(f5c0.f95012I2);
        this.f150605k = view.findViewById(f5c0.f95008H2);
        this.f150606l = (AppCompatSeekBar) view.findViewById(f5c0.f95004G2);
        this.f150610p = view.findViewById(f5c0.f95054V0);
        this.f150611q = view.findViewById(f5c0.f95069a0);
        mep0.m154302d1(this.f150595a, t100.m186890d(16.0f));
        xdl0.m208329E0(this.f150599e, new View.OnClickListener() { // from class: l.hp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f108886a.m170687q(view2);
            }
        });
        xdl0.m208329E0(this.f150597c, new View.OnClickListener() { // from class: l.ip10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114251a.m170688r(view2);
            }
        });
        xdl0.m208329E0(this.f150598d, new View.OnClickListener() { // from class: l.jp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f119048a.m170689s(view2);
            }
        });
        xdl0.m208329E0(this.f150600f, new View.OnClickListener() { // from class: l.kp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124091a.m170690t(view2);
            }
        });
        m170684n();
        this.f150606l.setProgress(Math.round(pr10.m170951f1().m170963d() * 100.0f));
        this.f150606l.setOnSeekBarChangeListener(new C19307a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m170686p() {
        xdl0.m208344M(this.f150606l, false);
        this.f150600f.setEnabled(true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m170687q(View view) {
        this.f150601g.m195027A2();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m170688r(View view) {
        m170676B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m170689s(View view) {
        m170693w();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m170690t(View view) {
        m170678D();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m170691u() {
        xdl0.m208344M(this.f150606l, true);
        this.f150606l.setAlpha(0.0f);
        this.f150600f.setEnabled(false);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m170692v(float f, ValueAnimator valueAnimator) {
        float fFloatValue = f + (((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f);
        this.f150603i.setRotation(fFloatValue);
        this.f150595a.setRotation(fFloatValue);
    }

    /* JADX INFO: renamed from: w */
    public final void m170693w() {
        boolean zM170972m1 = pr10.m170951f1().m170972m1();
        ImageView imageView = this.f150598d;
        if (zM170972m1) {
            imageView.setImageResource(h3c0.f105625N);
        } else {
            imageView.setImageResource(h3c0.f105629P);
        }
        this.f150601g.m195030r2();
    }

    /* JADX INFO: renamed from: x */
    public void m170694x(IntlMusicBean intlMusicBean) {
        this.f150597c.setImageResource(h3c0.f105623M);
        dt0.m113501A(this.f150604j);
        hfw.m130790a(pr10.f150828s, "control panel onMusicPause");
        this.f150602h = true;
        this.f150596b.setText(intlMusicBean.author);
        m170680F(intlMusicBean);
    }

    /* JADX INFO: renamed from: y */
    public void m170695y(IntlMusicBean intlMusicBean) {
        this.f150597c.setImageResource(h3c0.f105627O);
        m170682H();
        this.f150602h = false;
    }

    /* JADX INFO: renamed from: z */
    public void m170696z(IntlMusicBean intlMusicBean) {
        this.f150602h = false;
        m170681G(true);
        m170682H();
        m170680F(intlMusicBean);
        this.f150597c.setImageResource(h3c0.f105627O);
    }
}
