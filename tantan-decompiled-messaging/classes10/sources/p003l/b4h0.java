package p003l;

import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.bt0;
import l.d30;
import l.e51;
import l.qib0;
import l.szd;
import l.v7c0;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b4h0 extends szd {

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f3312j;

    /* JADX INFO: renamed from: k */
    public SimpleDraweeView f3313k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f3314l;

    /* JADX INFO: renamed from: m */
    public VText f3315m;

    /* JADX INFO: renamed from: n */
    public VImage f3316n;

    /* JADX INFO: renamed from: o */
    public final Act f3317o;

    /* JADX INFO: renamed from: p */
    public d30 f3318p;

    /* JADX INFO: renamed from: l.b4h0$a */
    public class ViewOnClickListenerC3301a implements View.OnClickListener {
        public ViewOnClickListenerC3301a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b4h0.this.dismiss();
            if (b4h0.this.f3318p != null) {
                b4h0.this.f3318p.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.b4h0$b */
    public class RunnableC3302b implements Runnable {

        /* JADX INFO: renamed from: l.b4h0$b$a */
        public class a extends AnimListener {

            /* JADX INFO: renamed from: l.b4h0$b$a$a, reason: collision with other inner class name */
            public class RunnableC3499a implements Runnable {
                public RunnableC3499a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b4h0.this.f3318p != null) {
                        b4h0.this.f3318p.call();
                    }
                    b4h0.this.dismiss();
                }
            }

            public a() {
            }

            public void onFinished() {
                super.onFinished();
                b4h0.this.f3313k.postDelayed(new RunnableC3499a(), 200L);
            }
        }

        public RunnableC3302b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SVGALoader.with(b4h0.this.f3317o).from("https://fe-static.tancdn.com/v1/raw/b38800eb-79c3-48e9-8172-02a118f76a9a14.svga").autoPlay(true).repeatCount(1).animListener(new a()).into(b4h0.this.f3312j);
        }
    }

    public b4h0(Context context) {
        super(context, false, v7c0.r);
        this.f3317o = (Act) context;
    }

    /* JADX INFO: renamed from: G */
    public View m5688G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c4h0.m5862b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m5689H(d30 d30Var) {
        this.f3318p = d30Var;
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m5688G(this.f3317o.getLayoutInflater(), null));
        xdl0.E0(this.f3316n, new ViewOnClickListenerC3301a());
        qib0.G.L0(this.f3313k, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc3TUxURkdBMkVBMldYQUxSUENMNVhPQlhDUVpHVjE0IiwidyI6MTI5NywiaCI6MTMzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjUwODY0MTg0MDI2NzY2MDgxNH0.png");
    }

    public void show() {
        super.show();
        Act act = this.f3317o;
        if (act == null) {
            return;
        }
        e51.H(act, new RunnableC3302b(), 300L);
        VText_Bold vText_Bold = this.f3314l;
        Property property = View.ALPHA;
        bt0.l(vText_Bold, property, 400L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f}).start();
        bt0.l(this.f3315m, property, 400L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f}).start();
        bt0.l(this.f3313k, property, 400L, 450L, new LinearInterpolator(), new float[]{0.0f, 1.0f}).start();
    }
}
