package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.ClipRoundImageView;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class cdg extends LiveMenuDialogHolder<idg> {

    /* JADX INFO: renamed from: A */
    public VImage f81193A;

    /* JADX INFO: renamed from: B */
    public VImage f81194B;

    /* JADX INFO: renamed from: C */
    public VImage f81195C;

    /* JADX INFO: renamed from: D */
    public Space f81196D;

    /* JADX INFO: renamed from: E */
    public TextView f81197E;

    /* JADX INFO: renamed from: F */
    public FansClubCompanyViewGroup f81198F;

    /* JADX INFO: renamed from: G */
    public FansClubCompanyItemView f81199G;

    /* JADX INFO: renamed from: H */
    public FansClubCompanyItemView f81200H;

    /* JADX INFO: renamed from: I */
    public FansClubCompanyItemView f81201I;

    /* JADX INFO: renamed from: J */
    public ClipRoundImageView f81202J;

    /* JADX INFO: renamed from: K */
    public TextView f81203K;

    /* JADX INFO: renamed from: L */
    public Space f81204L;

    /* JADX INFO: renamed from: M */
    public TextView f81205M;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f81206k;

    /* JADX INFO: renamed from: l */
    public View f81207l;

    /* JADX INFO: renamed from: m */
    public View f81208m;

    /* JADX INFO: renamed from: n */
    public Space f81209n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f81210o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f81211p;

    /* JADX INFO: renamed from: q */
    public VImage f81212q;

    /* JADX INFO: renamed from: r */
    public VImage f81213r;

    /* JADX INFO: renamed from: s */
    public VImage f81214s;

    /* JADX INFO: renamed from: t */
    public Space f81215t;

    /* JADX INFO: renamed from: u */
    public Space f81216u;

    /* JADX INFO: renamed from: v */
    public View f81217v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f81218w;

    /* JADX INFO: renamed from: x */
    public View f81219x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f81220y;

    /* JADX INFO: renamed from: z */
    public AnimEffectPlayer f81221z;

    public cdg(Act act, idg idgVar) {
        super(yec0.f199241s3, act, idgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m109195M(View view) {
        ((idg) this.f48605b).m139532u4();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m109196I(View view) {
        ddg.m115339a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m109198K(View view) {
        ((idg) this.f48605b).m139525m4();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m109199L(View view) {
        ((idg) this.f48605b).m139525m4();
        ((idg) this.f48605b).m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N */
    public void m109200N(boolean z, boolean z2) {
        this.f81207l.setBackgroundColor(z ? -1929379840 : 16777215);
        bnl0.m105524M(this.f81213r, z2);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        View view = this.f81207l;
        if (view != null) {
            view.setOnClickListener(null);
        }
        VImage vImage = this.f81213r;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f81214s;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m109196I(view);
        ((idg) this.f48605b).m139530s4();
        bnl0.m105509E0(this.f81207l, new View.OnClickListener() { // from class: l.zcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f203758a.m109198K(view2);
            }
        });
        bnl0.m105509E0(this.f81213r, new View.OnClickListener() { // from class: l.adg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f70686a.m109199L(view2);
            }
        });
        bnl0.m105509E0(this.f81214s, new View.OnClickListener() { // from class: l.bdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f76264a.m109195M(view2);
            }
        });
        izs.m142870u("context_livingAct", this.f81210o, zft.f204217l, qa00.m175859d(296.0f), qa00.m175859d(214.0f));
        izs.m142870u("context_livingAct", this.f81211p, zft.f204216k, qa00.m175859d(234.0f), qa00.m175859d(236.0f));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(idg idgVar) {
    }
}
