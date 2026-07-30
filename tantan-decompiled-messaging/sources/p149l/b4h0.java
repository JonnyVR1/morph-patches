package p149l;

import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b4h0 extends szd {

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f73360j;

    /* JADX INFO: renamed from: k */
    public SimpleDraweeView f73361k;

    /* JADX INFO: renamed from: l */
    public VText_Bold f73362l;

    /* JADX INFO: renamed from: m */
    public VText f73363m;

    /* JADX INFO: renamed from: n */
    public VImage f73364n;

    /* JADX INFO: renamed from: o */
    public final Act f73365o;

    /* JADX INFO: renamed from: p */
    public d30 f73366p;

    /* JADX INFO: renamed from: l.b4h0$a */
    public class ViewOnClickListenerC15800a implements View.OnClickListener {
        public ViewOnClickListenerC15800a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b4h0.this.dismiss();
            if (b4h0.this.f73366p != null) {
                b4h0.this.f73366p.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.b4h0$b */
    public class RunnableC15801b implements Runnable {

        /* JADX INFO: renamed from: l.b4h0$b$a */
        public class a extends AnimListener {

            /* JADX INFO: renamed from: l.b4h0$b$a$a, reason: collision with other inner class name */
            public class RunnableC22721a implements Runnable {
                public RunnableC22721a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b4h0.this.f73366p != null) {
                        b4h0.this.f73366p.call();
                    }
                    b4h0.this.dismiss();
                }
            }

            public a() {
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onFinished() {
                super.onFinished();
                b4h0.this.f73361k.postDelayed(new RunnableC22721a(), 200L);
            }
        }

        public RunnableC15801b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SVGALoader.with(b4h0.this.f73365o).from("https://fe-static.tancdn.com/v1/raw/b38800eb-79c3-48e9-8172-02a118f76a9a14.svga").autoPlay(true).repeatCount(1).animListener(new a()).into(b4h0.this.f73360j);
        }
    }

    public b4h0(Context context) {
        super(context, false, v7c0.f180371r);
        this.f73365o = (Act) context;
    }

    /* JADX INFO: renamed from: G */
    public View m100256G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c4h0.m105218b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m100257H(d30 d30Var) {
        this.f73366p = d30Var;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m100256G(this.f73365o.getLayoutInflater(), null));
        xdl0.m208329E0(this.f73364n, new ViewOnClickListenerC15800a());
        qib0.f154691G.m102331L0(this.f73361k, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc3TUxURkdBMkVBMldYQUxSUENMNVhPQlhDUVpHVjE0IiwidyI6MTI5NywiaCI6MTMzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjUwODY0MTg0MDI2NzY2MDgxNH0.png");
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        Act act = this.f73365o;
        if (act == null) {
            return;
        }
        e51.m114743H(act, new RunnableC15801b(), 300L);
        VText_Bold vText_Bold = this.f73362l;
        Property property = View.ALPHA;
        bt0.m103739l(vText_Bold, property, 400L, 200L, new LinearInterpolator(), 0.0f, 1.0f).start();
        bt0.m103739l(this.f73363m, property, 400L, 200L, new LinearInterpolator(), 0.0f, 1.0f).start();
        bt0.m103739l(this.f73361k, property, 400L, 450L, new LinearInterpolator(), 0.0f, 1.0f).start();
    }
}
