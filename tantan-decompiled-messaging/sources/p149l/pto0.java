package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pto0 extends LiveMenuDialogHolder<gpo0> {

    /* JADX INFO: renamed from: k */
    public VImage f151189k;

    /* JADX INFO: renamed from: l */
    public VLinear f151190l;

    /* JADX INFO: renamed from: m */
    public VText f151191m;

    /* JADX INFO: renamed from: n */
    public VText f151192n;

    /* JADX INFO: renamed from: o */
    public View f151193o;

    /* JADX INFO: renamed from: p */
    public VText f151194p;

    /* JADX INFO: renamed from: q */
    public VText f151195q;

    /* JADX INFO: renamed from: r */
    public BLiveVoiceCpHouseInfo f151196r;

    public pto0(Act act, gpo0 gpo0Var) {
        super(t6c0.f167994Ca, act, gpo0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m171369K(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m171370L(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m171371M(View view) {
        mo71838p();
        ((gpo0) this.f47757b).m127466X4(this.f151196r);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m171372I(View view) {
        qto0.m176471a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public void m171374N(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        this.f151196r = bLiveVoiceCpHouseInfo;
        m71834E();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m171372I(view);
        xdl0.m208329E0(this.f151189k, new View.OnClickListener() { // from class: l.mto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f135651a.m171369K(view2);
            }
        });
        xdl0.m208329E0(this.f151195q, new View.OnClickListener() { // from class: l.nto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f140503a.m171370L(view2);
            }
        });
        xdl0.m208329E0(this.f151194p, new View.OnClickListener() { // from class: l.oto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f145609a.m171371M(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gpo0 gpo0Var) {
    }
}
