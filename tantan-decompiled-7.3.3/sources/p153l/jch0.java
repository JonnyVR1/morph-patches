package p153l;

import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class jch0 extends g1e {

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f120060j;

    /* JADX INFO: renamed from: k */
    public SimpleDraweeView f120061k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f120062l;

    /* JADX INFO: renamed from: m */
    public VText f120063m;

    /* JADX INFO: renamed from: n */
    public VImage f120064n;

    /* JADX INFO: renamed from: o */
    public final Act f120065o;

    /* JADX INFO: renamed from: p */
    public x20 f120066p;

    /* JADX INFO: renamed from: l.jch0$a */
    public class ViewOnClickListenerC17924a implements View.OnClickListener {
        public ViewOnClickListenerC17924a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jch0.this.dismiss();
            if (jch0.this.f120066p != null) {
                jch0.this.f120066p.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.jch0$b */
    public class RunnableC17925b implements Runnable {

        /* JADX INFO: renamed from: l.jch0$b$a */
        public class a extends AnimListener {

            /* JADX INFO: renamed from: l.jch0$b$a$a, reason: collision with other inner class name */
            public class RunnableC22838a implements Runnable {
                public RunnableC22838a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (jch0.this.f120066p != null) {
                        jch0.this.f120066p.call();
                    }
                    jch0.this.dismiss();
                }
            }

            public a() {
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onFinished() {
                super.onFinished();
                jch0.this.f120061k.postDelayed(new RunnableC22838a(), 200L);
            }
        }

        public RunnableC17925b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SVGALoader.with(jch0.this.f120065o).from("https://fe-static.tancdn.com/v1/raw/b38800eb-79c3-48e9-8172-02a118f76a9a14.svga").autoPlay(true).repeatCount(1).animListener(new a()).into(jch0.this.f120060j);
        }
    }

    public jch0(Context context) {
        super(context, false, agc0.f71132r);
        this.f120065o = (Act) context;
    }

    /* JADX INFO: renamed from: G */
    public View m144361G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kch0.m149113b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m144362H(x20 x20Var) {
        this.f120066p = x20Var;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m144361G(this.f120065o.getLayoutInflater(), null));
        bnl0.m105509E0(this.f120064n, new ViewOnClickListenerC17924a());
        uqb0.f180374G.m127115L0(this.f120061k, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc3TUxURkdBMkVBMldYQUxSUENMNVhPQlhDUVpHVjE0IiwidyI6MTI5NywiaCI6MTMzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjUwODY0MTg0MDI2NzY2MDgxNH0.png");
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        Act act = this.f120065o;
        if (act == null) {
            return;
        }
        l51.m152888H(act, new RunnableC17925b(), 300L);
        VText_Bold vText_Bold = this.f120062l;
        Property property = View.ALPHA;
        gt0.m132166l(vText_Bold, property, 400L, 200L, new LinearInterpolator(), 0.0f, 1.0f).start();
        gt0.m132166l(this.f120063m, property, 400L, 200L, new LinearInterpolator(), 0.0f, 1.0f).start();
        gt0.m132166l(this.f120061k, property, 400L, 450L, new LinearInterpolator(), 0.0f, 1.0f).start();
    }
}
