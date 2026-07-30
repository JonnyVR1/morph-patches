package p153l;

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
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class afo0 implements iam<itm0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f71028a;

    /* JADX INFO: renamed from: b */
    public Group f71029b;

    /* JADX INFO: renamed from: c */
    public ImageView f71030c;

    /* JADX INFO: renamed from: d */
    public TextView f71031d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f71032e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f71033f;

    /* JADX INFO: renamed from: g */
    public Button f71034g;

    /* JADX INFO: renamed from: h */
    public Group f71035h;

    /* JADX INFO: renamed from: i */
    public TextView f71036i;

    /* JADX INFO: renamed from: j */
    public TextView f71037j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f71038k;

    /* JADX INFO: renamed from: l */
    public Button f71039l;

    /* JADX INFO: renamed from: m */
    public itm0 f71040m;

    /* JADX INFO: renamed from: n */
    public View f71041n;

    /* JADX INFO: renamed from: o */
    public x20 f71042o;

    /* JADX INFO: renamed from: l.afo0$a */
    public class C15703a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f71043a;

        public C15703a(x20 x20Var) {
            this.f71043a = x20Var;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: a */
        public void mo74020a(@NotNull String str) {
            x20 x20Var = this.f71043a;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            x20 x20Var = this.f71043a;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: c */
        public void mo74703c() {
            super.mo74703c();
            bnl0.m105525M0(afo0.this.f71033f, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m97522a(View view) {
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f71032e;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m97529j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m97529j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bfo0.m103934b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(itm0 itm0Var) {
        this.f71040m = itm0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m97531l() {
        x20 x20Var = this.f71042o;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m97532m(ViewGroup viewGroup) {
        viewGroup.removeView(this.f71041n);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m97533n(final ViewGroup viewGroup, View view) {
        l51.m152893M(new Runnable() { // from class: l.yeo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199386a.m97532m(viewGroup);
            }
        });
        m97531l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m97534p(View view) {
        ((ViewGroup) this.f71041n.getParent()).removeView(this.f71041n);
        m97531l();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m97535q() {
        this.f71040m.m142061i0();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m97536s() {
        m97541y(new x20() { // from class: l.xeo0
            @Override // p153l.x20
            public final void call() {
                this.f193971a.m97535q();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m97537u(Context context, final ViewGroup viewGroup, final x20 x20Var) {
        View view = this.f71041n;
        if (view != null) {
            viewGroup.removeView(view);
        } else {
            this.f71041n = m97529j(LayoutInflater.from(context), viewGroup);
            bnl0.m105509E0(this.f71034g, new View.OnClickListener() { // from class: l.ueo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x20Var.call();
                }
            });
            bnl0.m105509E0(this.f71030c, new View.OnClickListener() { // from class: l.veo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f183836a.m97533n(viewGroup, view2);
                }
            });
        }
        bnl0.m105509E0(this.f71028a, new View.OnClickListener() { // from class: l.weo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                afo0.m97522a(view2);
            }
        });
        this.f71033f.setImageResource(obc0.f146371i9);
        bnl0.m105524M(viewGroup, true);
        View view2 = this.f71041n;
        int i = bnl0.f77544e;
        viewGroup.addView(view2, new ViewGroup.LayoutParams(i, i));
        bnl0.m105525M0(this.f71033f, true);
        bnl0.m105525M0(this.f71032e, false);
        bnl0.m105524M(this.f71029b, true);
        bnl0.m105524M(this.f71035h, false);
        this.f71034g.setEnabled(true);
    }

    /* JADX INFO: renamed from: v */
    public void m97538v() {
        this.f71034g.setEnabled(true);
        o1j0.m165649w(R$string.f48243mi);
        bnl0.m105525M0(this.f71033f, true);
        this.f71032e.stopAnimation(true);
    }

    /* JADX INFO: renamed from: w */
    public void m97539w(long j, List<BLiveVoiceBonusGiftItem> list) {
        this.f71032e.stopAnimation(true);
        bnl0.m105525M0(this.f71032e, false);
        bnl0.m105525M0(this.f71033f, false);
        bnl0.m105524M(this.f71029b, false);
        bnl0.m105524M(this.f71035h, true);
        this.f71038k.removeAllViews();
        bnl0.m105509E0(this.f71039l, new View.OnClickListener() { // from class: l.zeo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204039a.m97534p(view);
            }
        });
        this.f71036i.setText(xau.m209911u(R$string.f47935Yf, Long.valueOf(j)));
        for (int i = 0; i < list.size(); i++) {
            ctm0 ctm0Var = new ctm0();
            View viewM112517a = ctm0Var.m112517a(LayoutInflater.from(this.f71038k.getContext()), null);
            ctm0Var.m112518b(list.get(i), null);
            int i2 = bnl0.f77545f;
            viewM112517a.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            if (i > 0) {
                bnl0.m105538V(viewM112517a, qa00.f156321h);
            }
            this.f71038k.addView(viewM112517a);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m97540x(Context context, ViewGroup viewGroup, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        m97537u(context, viewGroup, new x20() { // from class: l.teo0
            @Override // p153l.x20
            public final void call() {
                this.f173887a.m97536s();
            }
        });
        this.f71031d.setText(xau.m209912v(R$string.f48526zf, bLiveVoiceBonusGifts.description, Long.valueOf(bLiveVoiceBonusGifts.attractUserNum)));
    }

    /* JADX INFO: renamed from: y */
    public void m97541y(x20 x20Var) {
        bnl0.m105525M0(this.f71032e, true);
        this.f71032e.mo69685l("https://auto.tancdn.com/v1/raw/153d80ff-ac9f-4219-9776-ca60566a606010.so", 1, new C15703a(x20Var));
        this.f71034g.setEnabled(false);
    }
}
