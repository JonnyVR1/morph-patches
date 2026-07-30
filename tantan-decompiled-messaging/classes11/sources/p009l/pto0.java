package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.j2g0;
import l.qto0;
import l.t6c0;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pto0 extends LiveMenuDialogHolder<gpo0> {

    /* JADX INFO: renamed from: k */
    public VImage f18912k;

    /* JADX INFO: renamed from: l */
    public VLinear f18913l;

    /* JADX INFO: renamed from: m */
    public VText f18914m;

    /* JADX INFO: renamed from: n */
    public VText f18915n;

    /* JADX INFO: renamed from: o */
    public View f18916o;

    /* JADX INFO: renamed from: p */
    public VText f18917p;

    /* JADX INFO: renamed from: q */
    public VText f18918q;

    /* JADX INFO: renamed from: r */
    public BLiveVoiceCpHouseInfo f18919r;

    public pto0(Act act, gpo0 gpo0Var) {
        super(t6c0.Ca, act, gpo0Var, j2g0.e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m20709K(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m20710L(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m20711M(View view) {
        p();
        ((gpo0) ((LiveMenuDialogHolder) this).b).m15207X4(this.f18919r);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20712C0() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m20713I(View view) {
        qto0.a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public void m20715N(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        if (bLiveVoiceCpHouseInfo == null) {
            return;
        }
        this.f18919r = bLiveVoiceCpHouseInfo;
        E();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m20717m(View view) {
        super.m(view);
        m20713I(view);
        xdl0.E0(this.f18912k, new View.OnClickListener() { // from class: l.mto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f17108a.m20709K(view2);
            }
        });
        xdl0.E0(this.f18918q, new View.OnClickListener() { // from class: l.nto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f17741a.m20710L(view2);
            }
        });
        xdl0.E0(this.f18917p, new View.OnClickListener() { // from class: l.oto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18251a.m20711M(view2);
            }
        });
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m20718n(gpo0 gpo0Var) {
    }
}
