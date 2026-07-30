package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.List;
import l.ap0;
import l.d30;
import l.e51;
import l.i3c0;
import l.lsi0;
import l.s7m;
import l.t100;
import l.w8u;
import l.x5o0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w5o0 implements s7m<ekm0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f21900a;

    /* JADX INFO: renamed from: b */
    public Group f21901b;

    /* JADX INFO: renamed from: c */
    public ImageView f21902c;

    /* JADX INFO: renamed from: d */
    public TextView f21903d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f21904e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f21905f;

    /* JADX INFO: renamed from: g */
    public Button f21906g;

    /* JADX INFO: renamed from: h */
    public Group f21907h;

    /* JADX INFO: renamed from: i */
    public TextView f21908i;

    /* JADX INFO: renamed from: j */
    public TextView f21909j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f21910k;

    /* JADX INFO: renamed from: l */
    public Button f21911l;

    /* JADX INFO: renamed from: m */
    public ekm0 f21912m;

    /* JADX INFO: renamed from: n */
    public View f21913n;

    /* JADX INFO: renamed from: o */
    public d30 f21914o;

    /* JADX INFO: renamed from: l.w5o0$a */
    public class C1282a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f21915a;

        public C1282a(d30 d30Var) {
            this.f21915a = d30Var;
        }

        /* JADX INFO: renamed from: a */
        public void m23936a(@NotNull String str) {
            d30 d30Var = this.f21915a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m23937b() {
            super.b();
            d30 d30Var = this.f21915a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m23938c() {
            super.c();
            xdl0.M0(w5o0.this.f21905f, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23914a(View view) {
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23921C0() {
        return null;
    }

    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f21904e;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m23923j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m23923j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x5o0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m23922i1(ekm0 ekm0Var) {
        this.f21912m = ekm0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m23925l() {
        d30 d30Var = this.f21914o;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m23926m(ViewGroup viewGroup) {
        viewGroup.removeView(this.f21913n);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m23927n(final ViewGroup viewGroup, View view) {
        e51.M(new Runnable() { // from class: l.u5o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21002a.m23926m(viewGroup);
            }
        });
        m23925l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m23928p(View view) {
        ((ViewGroup) this.f21913n.getParent()).removeView(this.f21913n);
        m23925l();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m23929q() {
        this.f21912m.m13968i0();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m23930s() {
        m23935y(new d30() { // from class: l.t5o0
            public final void call() {
                this.f20564a.m23929q();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m23931u(Context context, final ViewGroup viewGroup, final d30 d30Var) {
        View view = this.f21913n;
        if (view != null) {
            viewGroup.removeView(view);
        } else {
            this.f21913n = m23923j(LayoutInflater.from(context), viewGroup);
            xdl0.E0(this.f21906g, new View.OnClickListener() { // from class: l.q5o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d30Var.call();
                }
            });
            xdl0.E0(this.f21902c, new View.OnClickListener() { // from class: l.r5o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f19642a.m23927n(viewGroup, view2);
                }
            });
        }
        xdl0.E0(this.f21900a, new View.OnClickListener() { // from class: l.s5o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w5o0.m23914a(view2);
            }
        });
        this.f21905f.setImageResource(i3c0.i9);
        xdl0.M(viewGroup, true);
        View view2 = this.f21913n;
        int i = xdl0.e;
        viewGroup.addView(view2, new ViewGroup.LayoutParams(i, i));
        xdl0.M0(this.f21905f, true);
        xdl0.M0(this.f21904e, false);
        xdl0.M(this.f21901b, true);
        xdl0.M(this.f21907h, false);
        this.f21906g.setEnabled(true);
    }

    /* JADX INFO: renamed from: v */
    public void m23932v() {
        this.f21906g.setEnabled(true);
        lsi0.w(R.string.mi);
        xdl0.M0(this.f21905f, true);
        this.f21904e.stopAnimation(true);
    }

    /* JADX INFO: renamed from: w */
    public void m23933w(long j, List<BLiveVoiceBonusGiftItem> list) {
        this.f21904e.stopAnimation(true);
        xdl0.M0(this.f21904e, false);
        xdl0.M0(this.f21905f, false);
        xdl0.M(this.f21901b, false);
        xdl0.M(this.f21907h, true);
        this.f21910k.removeAllViews();
        xdl0.E0(this.f21911l, new View.OnClickListener() { // from class: l.v5o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21462a.m23928p(view);
            }
        });
        this.f21908i.setText(w8u.u(R.string.Yf, Long.valueOf(j)));
        for (int i = 0; i < list.size(); i++) {
            yjm0 yjm0Var = new yjm0();
            View viewM25428a = yjm0Var.m25428a(LayoutInflater.from(this.f21910k.getContext()), null);
            yjm0Var.m25429b(list.get(i), null);
            int i2 = xdl0.f;
            viewM25428a.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            if (i > 0) {
                xdl0.V(viewM25428a, t100.h);
            }
            this.f21910k.addView(viewM25428a);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m23934x(Context context, ViewGroup viewGroup, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        m23931u(context, viewGroup, new d30() { // from class: l.p5o0
            public final void call() {
                this.f18398a.m23930s();
            }
        });
        this.f21903d.setText(w8u.v(R.string.zf, new Object[]{bLiveVoiceBonusGifts.description, Long.valueOf(bLiveVoiceBonusGifts.attractUserNum)}));
    }

    /* JADX INFO: renamed from: y */
    public void m23935y(d30 d30Var) {
        xdl0.M0(this.f21904e, true);
        this.f21904e.l("https://auto.tancdn.com/v1/raw/153d80ff-ac9f-4219-9776-ca60566a606010.so", 1, new C1282a(d30Var));
        this.f21906g.setEnabled(false);
    }
}
