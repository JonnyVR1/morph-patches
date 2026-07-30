package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.view.ClipRoundImageView;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ydt;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class obg extends LiveMenuDialogHolder<ubg> {

    /* JADX INFO: renamed from: A */
    public VImage f16481A;

    /* JADX INFO: renamed from: B */
    public VImage f16482B;

    /* JADX INFO: renamed from: C */
    public VImage f16483C;

    /* JADX INFO: renamed from: D */
    public Space f16484D;

    /* JADX INFO: renamed from: E */
    public TextView f16485E;

    /* JADX INFO: renamed from: F */
    public FansClubCompanyViewGroup f16486F;

    /* JADX INFO: renamed from: G */
    public FansClubCompanyItemView f16487G;

    /* JADX INFO: renamed from: H */
    public FansClubCompanyItemView f16488H;

    /* JADX INFO: renamed from: I */
    public FansClubCompanyItemView f16489I;

    /* JADX INFO: renamed from: J */
    public ClipRoundImageView f16490J;

    /* JADX INFO: renamed from: K */
    public TextView f16491K;

    /* JADX INFO: renamed from: L */
    public Space f16492L;

    /* JADX INFO: renamed from: M */
    public TextView f16493M;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f16494k;

    /* JADX INFO: renamed from: l */
    public View f16495l;

    /* JADX INFO: renamed from: m */
    public View f16496m;

    /* JADX INFO: renamed from: n */
    public Space f16497n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f16498o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f16499p;

    /* JADX INFO: renamed from: q */
    public VImage f16500q;

    /* JADX INFO: renamed from: r */
    public VImage f16501r;

    /* JADX INFO: renamed from: s */
    public VImage f16502s;

    /* JADX INFO: renamed from: t */
    public Space f16503t;

    /* JADX INFO: renamed from: u */
    public Space f16504u;

    /* JADX INFO: renamed from: v */
    public View f16505v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f16506w;

    /* JADX INFO: renamed from: x */
    public View f16507x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f16508y;

    /* JADX INFO: renamed from: z */
    public AnimEffectPlayer f16509z;

    public obg(Act act, ubg ubgVar) {
        super(t6c0.f20005s3, act, ubgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m19382M(View view) {
        ((ubg) this.f3799b).m23428u4();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m19383I(View view) {
        pbg.m20180a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m19385K(View view) {
        ((ubg) this.f3799b).m23420m4();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m19386L(View view) {
        ((ubg) this.f3799b).m23420m4();
        ((ubg) this.f3799b).m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N */
    public void m19387N(boolean z, boolean z2) {
        this.f16495l.setBackgroundColor(z ? -1929379840 : 16777215);
        xdl0.M(this.f16501r, z2);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
        View view = this.f16495l;
        if (view != null) {
            view.setOnClickListener(null);
        }
        VImage vImage = this.f16501r;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f16502s;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m19383I(view);
        ((ubg) this.f3799b).m23425s4();
        xdl0.E0(this.f16495l, new View.OnClickListener() { // from class: l.lbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14754a.m19385K(view2);
            }
        });
        xdl0.E0(this.f16501r, new View.OnClickListener() { // from class: l.mbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15322a.m19386L(view2);
            }
        });
        xdl0.E0(this.f16502s, new View.OnClickListener() { // from class: l.nbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15911a.m19382M(view2);
            }
        });
        hxs.u("context_livingAct", this.f16498o, ydt.l, t100.d(296.0f), t100.d(214.0f));
        hxs.u("context_livingAct", this.f16499p, ydt.k, t100.d(234.0f), t100.d(236.0f));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(ubg ubgVar) {
    }
}
