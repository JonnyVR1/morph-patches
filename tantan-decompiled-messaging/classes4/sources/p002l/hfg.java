package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import l.hpd0;
import l.qib0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hfg extends LiveMenuDialogHolder<mfg> {

    /* JADX INFO: renamed from: k */
    public VText f12013k;

    /* JADX INFO: renamed from: l */
    public VText f12014l;

    /* JADX INFO: renamed from: m */
    public VLinear f12015m;

    /* JADX INFO: renamed from: n */
    public VImage f12016n;

    /* JADX INFO: renamed from: o */
    public VText f12017o;

    /* JADX INFO: renamed from: p */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f12018p;

    public hfg(Act act, @NonNull @NotNull mfg mfgVar) {
        super(t6c0.f20041v0, act, mfgVar, j2g0.m15581g());
        this.f12018p = new hpd0("live_fans_invitation" + qib0.b0.a.userId(), Boolean.FALSE);
        m5208B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m14358J(View view) {
        boolean zIsSelected = this.f12016n.isSelected();
        VImage vImage = this.f12016n;
        if (zIsSelected) {
            vImage.setSelected(false);
        } else {
            vImage.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m14359K(View view) {
        this.f12018p.put(Boolean.valueOf(this.f12016n.isSelected()));
        T t = this.f3799b;
        if (t != 0) {
            ((mfg) t).m17845V3();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((mfg) this.f3799b).act();
    }

    /* JADX INFO: renamed from: H */
    public final void m14360H(View view) {
        ifg.m15146a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m14362L(String str) {
        this.f12013k.setText(str);
        xdl0.E0(this.f12015m, new View.OnClickListener() { // from class: l.ffg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10314a.m14358J(view);
            }
        });
        xdl0.E0(this.f12017o, new View.OnClickListener() { // from class: l.gfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11399a.m14359K(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m14360H(view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(mfg mfgVar) {
    }
}
