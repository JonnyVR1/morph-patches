package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class xx10 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f196576a;

    /* JADX INFO: renamed from: b */
    public TextView f196577b;

    /* JADX INFO: renamed from: c */
    public ImageView f196578c;

    /* JADX INFO: renamed from: d */
    public ImageView f196579d;

    /* JADX INFO: renamed from: e */
    public ImageView f196580e;

    /* JADX INFO: renamed from: f */
    public ImageView f196581f;

    /* JADX INFO: renamed from: g */
    public c020 f196582g;

    /* JADX INFO: renamed from: h */
    public boolean f196583h;

    /* JADX INFO: renamed from: i */
    public View f196584i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f196585j;

    /* JADX INFO: renamed from: k */
    public View f196586k;

    /* JADX INFO: renamed from: l */
    public AppCompatSeekBar f196587l;

    /* JADX INFO: renamed from: m */
    public final Runnable f196588m = new Runnable() { // from class: l.nx10
        @Override // java.lang.Runnable
        public final void run() {
            this.f144061a.m213475m();
        }
    };

    /* JADX INFO: renamed from: n */
    public Animator f196589n;

    /* JADX INFO: renamed from: o */
    public Animator f196590o;

    /* JADX INFO: renamed from: p */
    public View f196591p;

    /* JADX INFO: renamed from: q */
    public View f196592q;

    /* JADX INFO: renamed from: l.xx10$a */
    public class C21470a implements SeekBar.OnSeekBarChangeListener {
        public C21470a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            xx10.this.f196582g.m107304C2(i / 100.0f);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.removeCallbacks(xx10.this.f196588m);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.postDelayed(xx10.this.f196588m, 1000L);
        }
    }

    public xx10(c020 c020Var, View view) {
        this.f196582g = c020Var;
        m213477o(view);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m213455a(View view) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m213463i(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m213467A() {
        it0.m142008B(this.f196585j);
        this.f196584i.setRotation(0.0f);
        this.f196576a.setRotation(0.0f);
    }

    /* JADX INFO: renamed from: B */
    public final void m213468B() {
        boolean z = this.f196583h;
        c020 c020Var = this.f196582g;
        if (z) {
            c020Var.m107303B2();
        } else {
            c020Var.m107316y2();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m213469C(List<IntlMusicBean> list) {
        if (jyb.m147479J(list)) {
            m213476n();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m213470D() {
        it0.m142008B(this.f196589n);
        it0.m142008B(this.f196590o);
        View view = this.f196586k;
        Property property = View.ALPHA;
        Animator duration = gt0.m132168n(view, property, 1.0f, 0.0f).setDuration(100L);
        Animator duration2 = gt0.m132168n(this.f196587l, property, 0.0f, 1.0f).setDuration(100L);
        duration2.setStartDelay(200L);
        Animator animatorM132180z = gt0.m132180z(duration, duration2);
        this.f196590o = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.wx10
            @Override // java.lang.Runnable
            public final void run() {
                this.f191356a.m213483u();
            }
        });
        this.f196590o.start();
        this.f196587l.removeCallbacks(this.f196588m);
        this.f196587l.postDelayed(this.f196588m, 1300L);
    }

    /* JADX INFO: renamed from: E */
    public void m213471E(boolean z) {
        bnl0.m105524M(this.f196591p, z);
        if (z) {
            bnl0.m105509E0(this.f196591p, new View.OnClickListener() { // from class: l.ox10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xx10.m213463i(view);
                }
            });
            it0.m142007A(this.f196590o);
            it0.m142007A(this.f196589n);
            bnl0.m105524M(this.f196587l, false);
            this.f196586k.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m213472F(IntlMusicBean intlMusicBean) {
        this.f196577b.setText(intlMusicBean.title);
        m120.m156551a(intlMusicBean.filePath, this.f196576a, nbc0.f141102G);
        this.f196579d.setImageResource(xz10.m213668f1().m213689m1() ? nbc0.f141120P : nbc0.f141116N);
        this.f196581f.setImageResource(nbc0.f141128T);
        this.f196580e.setImageResource(nbc0.f141110K);
    }

    /* JADX INFO: renamed from: G */
    public void m213473G(boolean z) {
        bnl0.m105524M(this.f196592q, !z);
        if (z) {
            return;
        }
        bnl0.m105509E0(this.f196592q, new View.OnClickListener() { // from class: l.vx10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx10.m213455a(view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m213474H() {
        final float rotation = this.f196584i.getRotation();
        it0.m142008B(this.f196585j);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f196585j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(10000L);
        this.f196585j.setRepeatCount(-1);
        this.f196585j.setRepeatMode(1);
        this.f196585j.setInterpolator(new LinearInterpolator());
        this.f196585j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ux10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f181332a.m213484v(rotation, valueAnimator);
            }
        });
        this.f196585j.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m213475m() {
        it0.m142008B(this.f196589n);
        it0.m142008B(this.f196590o);
        AppCompatSeekBar appCompatSeekBar = this.f196587l;
        Property property = View.ALPHA;
        Animator duration = gt0.m132168n(appCompatSeekBar, property, 1.0f, 0.0f).setDuration(100L);
        Animator duration2 = gt0.m132168n(this.f196586k, property, 0.0f, 1.0f).setDuration(100L);
        duration2.setStartDelay(200L);
        Animator animatorM132180z = gt0.m132180z(duration, duration2);
        this.f196589n = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.tx10
            @Override // java.lang.Runnable
            public final void run() {
                this.f176489a.m213478p();
            }
        });
        this.f196589n.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m213476n() {
        this.f196578c.setImageResource(nbc0.f141112L);
        this.f196579d.setImageResource(nbc0.f141106I);
        this.f196580e.setImageResource(nbc0.f141108J);
        this.f196581f.setImageResource(nbc0.f141126S);
        this.f196577b.setText(R$string.f45743d);
        this.f196576a.setImageResource(nbc0.f141102G);
    }

    /* JADX INFO: renamed from: o */
    public void m213477o(View view) {
        this.f196576a = (VDraweeView) view.findViewById(ldc0.f131498R);
        this.f196584i = view.findViewById(ldc0.f131495Q);
        this.f196577b = (TextView) view.findViewById(ldc0.f131523Z0);
        this.f196578c = (ImageView) view.findViewById(ldc0.f131551g1);
        this.f196579d = (ImageView) view.findViewById(ldc0.f131517X0);
        this.f196580e = (ImageView) view.findViewById(ldc0.f131543e1);
        this.f196581f = (ImageView) view.findViewById(ldc0.f131469I2);
        this.f196586k = view.findViewById(ldc0.f131465H2);
        this.f196587l = (AppCompatSeekBar) view.findViewById(ldc0.f131461G2);
        this.f196591p = view.findViewById(ldc0.f131511V0);
        this.f196592q = view.findViewById(ldc0.f131526a0);
        qnp0.m177261d1(this.f196576a, qa00.m175859d(16.0f));
        bnl0.m105509E0(this.f196580e, new View.OnClickListener() { // from class: l.px10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f154460a.m213479q(view2);
            }
        });
        bnl0.m105509E0(this.f196578c, new View.OnClickListener() { // from class: l.qx10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f159999a.m213480r(view2);
            }
        });
        bnl0.m105509E0(this.f196579d, new View.OnClickListener() { // from class: l.rx10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f165288a.m213481s(view2);
            }
        });
        bnl0.m105509E0(this.f196581f, new View.OnClickListener() { // from class: l.sx10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f171068a.m213482t(view2);
            }
        });
        m213476n();
        this.f196587l.setProgress(Math.round(xz10.m213668f1().m213680d() * 100.0f));
        this.f196587l.setOnSeekBarChangeListener(new C21470a());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m213478p() {
        bnl0.m105524M(this.f196587l, false);
        this.f196581f.setEnabled(true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m213479q(View view) {
        this.f196582g.m107302A2();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m213480r(View view) {
        m213468B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m213481s(View view) {
        m213485w();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m213482t(View view) {
        m213470D();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m213483u() {
        bnl0.m105524M(this.f196587l, true);
        this.f196587l.setAlpha(0.0f);
        this.f196581f.setEnabled(false);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m213484v(float f, ValueAnimator valueAnimator) {
        float fFloatValue = f + (((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f);
        this.f196584i.setRotation(fFloatValue);
        this.f196576a.setRotation(fFloatValue);
    }

    /* JADX INFO: renamed from: w */
    public final void m213485w() {
        boolean zM213689m1 = xz10.m213668f1().m213689m1();
        ImageView imageView = this.f196579d;
        if (zM213689m1) {
            imageView.setImageResource(nbc0.f141116N);
        } else {
            imageView.setImageResource(nbc0.f141120P);
        }
        this.f196582g.m107310r2();
    }

    /* JADX INFO: renamed from: x */
    public void m213486x(IntlMusicBean intlMusicBean) {
        this.f196578c.setImageResource(nbc0.f141114M);
        it0.m142007A(this.f196585j);
        fhw.m125605a(xz10.f196808s, "control panel onMusicPause");
        this.f196583h = true;
        this.f196577b.setText(intlMusicBean.author);
        m213472F(intlMusicBean);
    }

    /* JADX INFO: renamed from: y */
    public void m213487y(IntlMusicBean intlMusicBean) {
        this.f196578c.setImageResource(nbc0.f141118O);
        m213474H();
        this.f196583h = false;
    }

    /* JADX INFO: renamed from: z */
    public void m213488z(IntlMusicBean intlMusicBean) {
        this.f196583h = false;
        m213473G(true);
        m213474H();
        m213472F(intlMusicBean);
        this.f196578c.setImageResource(nbc0.f141118O);
    }
}
