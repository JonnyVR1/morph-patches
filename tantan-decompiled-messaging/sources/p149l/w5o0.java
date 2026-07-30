package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class w5o0 implements s7m<ekm0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f184716a;

    /* JADX INFO: renamed from: b */
    public Group f184717b;

    /* JADX INFO: renamed from: c */
    public ImageView f184718c;

    /* JADX INFO: renamed from: d */
    public TextView f184719d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f184720e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f184721f;

    /* JADX INFO: renamed from: g */
    public Button f184722g;

    /* JADX INFO: renamed from: h */
    public Group f184723h;

    /* JADX INFO: renamed from: i */
    public TextView f184724i;

    /* JADX INFO: renamed from: j */
    public TextView f184725j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f184726k;

    /* JADX INFO: renamed from: l */
    public Button f184727l;

    /* JADX INFO: renamed from: m */
    public ekm0 f184728m;

    /* JADX INFO: renamed from: n */
    public View f184729n;

    /* JADX INFO: renamed from: o */
    public d30 f184730o;

    /* JADX INFO: renamed from: l.w5o0$a */
    public class C20807a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f184731a;

        public C20807a(d30 d30Var) {
            this.f184731a = d30Var;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: a */
        public void mo72837a(@NotNull String str) {
            d30 d30Var = this.f184731a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            d30 d30Var = this.f184731a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: c */
        public void mo73520c() {
            super.mo73520c();
            xdl0.m208345M0(w5o0.this.f184721f, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m201660a(View view) {
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f184720e;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m201667j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m201667j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x5o0.m207097b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ekm0 ekm0Var) {
        this.f184728m = ekm0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m201669l() {
        d30 d30Var = this.f184730o;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m201670m(ViewGroup viewGroup) {
        viewGroup.removeView(this.f184729n);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m201671n(final ViewGroup viewGroup, View view) {
        e51.m114748M(new Runnable() { // from class: l.u5o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174743a.m201670m(viewGroup);
            }
        });
        m201669l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m201672p(View view) {
        ((ViewGroup) this.f184729n.getParent()).removeView(this.f184729n);
        m201669l();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m201673q() {
        this.f184728m.m116981i0();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m201674s() {
        m201679y(new d30() { // from class: l.t5o0
            @Override // p149l.d30
            public final void call() {
                this.f167842a.m201673q();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m201675u(Context context, final ViewGroup viewGroup, final d30 d30Var) {
        View view = this.f184729n;
        if (view != null) {
            viewGroup.removeView(view);
        } else {
            this.f184729n = m201667j(LayoutInflater.from(context), viewGroup);
            xdl0.m208329E0(this.f184722g, new View.OnClickListener() { // from class: l.q5o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d30Var.call();
                }
            });
            xdl0.m208329E0(this.f184718c, new View.OnClickListener() { // from class: l.r5o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f157861a.m201671n(viewGroup, view2);
                }
            });
        }
        xdl0.m208329E0(this.f184716a, new View.OnClickListener() { // from class: l.s5o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w5o0.m201660a(view2);
            }
        });
        this.f184721f.setImageResource(i3c0.f111043i9);
        xdl0.m208344M(viewGroup, true);
        View view2 = this.f184729n;
        int i = xdl0.f192403e;
        viewGroup.addView(view2, new ViewGroup.LayoutParams(i, i));
        xdl0.m208345M0(this.f184721f, true);
        xdl0.m208345M0(this.f184720e, false);
        xdl0.m208344M(this.f184717b, true);
        xdl0.m208344M(this.f184723h, false);
        this.f184722g.setEnabled(true);
    }

    /* JADX INFO: renamed from: v */
    public void m201676v() {
        this.f184722g.setEnabled(true);
        lsi0.m151593w(R$string.f47395mi);
        xdl0.m208345M0(this.f184721f, true);
        this.f184720e.stopAnimation(true);
    }

    /* JADX INFO: renamed from: w */
    public void m201677w(long j, List<BLiveVoiceBonusGiftItem> list) {
        this.f184720e.stopAnimation(true);
        xdl0.m208345M0(this.f184720e, false);
        xdl0.m208345M0(this.f184721f, false);
        xdl0.m208344M(this.f184717b, false);
        xdl0.m208344M(this.f184723h, true);
        this.f184726k.removeAllViews();
        xdl0.m208329E0(this.f184727l, new View.OnClickListener() { // from class: l.v5o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180102a.m201672p(view);
            }
        });
        this.f184724i.setText(w8u.m202218u(R$string.f47087Yf, Long.valueOf(j)));
        for (int i = 0; i < list.size(); i++) {
            yjm0 yjm0Var = new yjm0();
            View viewM215069a = yjm0Var.m215069a(LayoutInflater.from(this.f184726k.getContext()), null);
            yjm0Var.m215070b(list.get(i), null);
            int i2 = xdl0.f192404f;
            viewM215069a.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            if (i > 0) {
                xdl0.m208358V(viewM215069a, t100.f167259h);
            }
            this.f184726k.addView(viewM215069a);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m201678x(Context context, ViewGroup viewGroup, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        m201675u(context, viewGroup, new d30() { // from class: l.p5o0
            @Override // p149l.d30
            public final void call() {
                this.f147316a.m201674s();
            }
        });
        this.f184719d.setText(w8u.m202219v(R$string.f47678zf, bLiveVoiceBonusGifts.description, Long.valueOf(bLiveVoiceBonusGifts.attractUserNum)));
    }

    /* JADX INFO: renamed from: y */
    public void m201679y(d30 d30Var) {
        xdl0.m208345M0(this.f184720e, true);
        this.f184720e.mo68502l("https://auto.tancdn.com/v1/raw/153d80ff-ac9f-4219-9776-ca60566a606010.so", 1, new C20807a(d30Var));
        this.f184722g.setEnabled(false);
    }
}
