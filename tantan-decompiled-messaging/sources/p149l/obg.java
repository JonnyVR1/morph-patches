package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.ClipRoundImageView;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class obg extends LiveMenuDialogHolder<ubg> {

    /* JADX INFO: renamed from: A */
    public VImage f142910A;

    /* JADX INFO: renamed from: B */
    public VImage f142911B;

    /* JADX INFO: renamed from: C */
    public VImage f142912C;

    /* JADX INFO: renamed from: D */
    public Space f142913D;

    /* JADX INFO: renamed from: E */
    public TextView f142914E;

    /* JADX INFO: renamed from: F */
    public FansClubCompanyViewGroup f142915F;

    /* JADX INFO: renamed from: G */
    public FansClubCompanyItemView f142916G;

    /* JADX INFO: renamed from: H */
    public FansClubCompanyItemView f142917H;

    /* JADX INFO: renamed from: I */
    public FansClubCompanyItemView f142918I;

    /* JADX INFO: renamed from: J */
    public ClipRoundImageView f142919J;

    /* JADX INFO: renamed from: K */
    public TextView f142920K;

    /* JADX INFO: renamed from: L */
    public Space f142921L;

    /* JADX INFO: renamed from: M */
    public TextView f142922M;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f142923k;

    /* JADX INFO: renamed from: l */
    public View f142924l;

    /* JADX INFO: renamed from: m */
    public View f142925m;

    /* JADX INFO: renamed from: n */
    public Space f142926n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f142927o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f142928p;

    /* JADX INFO: renamed from: q */
    public VImage f142929q;

    /* JADX INFO: renamed from: r */
    public VImage f142930r;

    /* JADX INFO: renamed from: s */
    public VImage f142931s;

    /* JADX INFO: renamed from: t */
    public Space f142932t;

    /* JADX INFO: renamed from: u */
    public Space f142933u;

    /* JADX INFO: renamed from: v */
    public View f142934v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f142935w;

    /* JADX INFO: renamed from: x */
    public View f142936x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f142937y;

    /* JADX INFO: renamed from: z */
    public AnimEffectPlayer f142938z;

    public obg(Act act, ubg ubgVar) {
        super(t6c0.f168509s3, act, ubgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m163436M(View view) {
        ((ubg) this.f47757b).m192833u4();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m163437I(View view) {
        pbg.m168203a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m163439K(View view) {
        ((ubg) this.f47757b).m192826m4();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m163440L(View view) {
        ((ubg) this.f47757b).m192826m4();
        ((ubg) this.f47757b).m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N */
    public void m163441N(boolean z, boolean z2) {
        this.f142924l.setBackgroundColor(z ? -1929379840 : 16777215);
        xdl0.m208344M(this.f142930r, z2);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        View view = this.f142924l;
        if (view != null) {
            view.setOnClickListener(null);
        }
        VImage vImage = this.f142930r;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f142931s;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m163437I(view);
        ((ubg) this.f47757b).m192831s4();
        xdl0.m208329E0(this.f142924l, new View.OnClickListener() { // from class: l.lbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f127292a.m163439K(view2);
            }
        });
        xdl0.m208329E0(this.f142930r, new View.OnClickListener() { // from class: l.mbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f133020a.m163440L(view2);
            }
        });
        xdl0.m208329E0(this.f142931s, new View.OnClickListener() { // from class: l.nbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f138035a.m163436M(view2);
            }
        });
        hxs.m133408u("context_livingAct", this.f142927o, ydt.f197622l, t100.m186890d(296.0f), t100.m186890d(214.0f));
        hxs.m133408u("context_livingAct", this.f142928p, ydt.f197621k, t100.m186890d(234.0f), t100.m186890d(236.0f));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ubg ubgVar) {
    }
}
