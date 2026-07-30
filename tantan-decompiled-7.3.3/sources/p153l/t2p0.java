package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t2p0 extends LiveMenuDialogHolder<kyo0> {

    /* JADX INFO: renamed from: k */
    public VImage f171778k;

    /* JADX INFO: renamed from: l */
    public VLinear f171779l;

    /* JADX INFO: renamed from: m */
    public VText f171780m;

    /* JADX INFO: renamed from: n */
    public VText f171781n;

    /* JADX INFO: renamed from: o */
    public View f171782o;

    /* JADX INFO: renamed from: p */
    public VText f171783p;

    /* JADX INFO: renamed from: q */
    public VText f171784q;

    /* JADX INFO: renamed from: r */
    public BLiveVoiceCpHouseInfo f171785r;

    public t2p0(Act act, kyo0 kyo0Var) {
        super(yec0.f198726Ca, act, kyo0Var, qag0.m175924e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m188972K(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m188973L(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m188974M(View view) {
        mo73021p();
        ((kyo0) this.f48605b).m152113X4(this.f171785r);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m188975I(View view) {
        u2p0.m194295a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public void m188977N(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        this.f171785r = bLiveVoiceCpHouseInfo;
        m73017E();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m188975I(view);
        bnl0.m105509E0(this.f171778k, new View.OnClickListener() { // from class: l.q2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f155377a.m188972K(view2);
            }
        });
        bnl0.m105509E0(this.f171784q, new View.OnClickListener() { // from class: l.r2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f160961a.m188973L(view2);
            }
        });
        bnl0.m105509E0(this.f171783p, new View.OnClickListener() { // from class: l.s2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f165906a.m188974M(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kyo0 kyo0Var) {
    }
}
