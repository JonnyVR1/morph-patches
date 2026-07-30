package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hfg extends LiveMenuDialogHolder<mfg> {

    /* JADX INFO: renamed from: k */
    public VText f107474k;

    /* JADX INFO: renamed from: l */
    public VText f107475l;

    /* JADX INFO: renamed from: m */
    public VLinear f107476m;

    /* JADX INFO: renamed from: n */
    public VImage f107477n;

    /* JADX INFO: renamed from: o */
    public VText f107478o;

    /* JADX INFO: renamed from: p */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f107479p;

    public hfg(Act act, @NonNull @NotNull mfg mfgVar) {
        super(t6c0.f168545v0, act, mfgVar, j2g0.m139460g());
        this.f107479p = new hpd0("live_fans_invitation" + qib0.f154713b0.f139230a.userId(), Boolean.FALSE);
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m130756J(View view) {
        boolean zIsSelected = this.f107477n.isSelected();
        VImage vImage = this.f107477n;
        if (zIsSelected) {
            vImage.setSelected(false);
        } else {
            vImage.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m130757K(View view) {
        this.f107479p.put(Boolean.valueOf(this.f107477n.isSelected()));
        T t = this.f47757b;
        if (t != 0) {
            ((mfg) t).m154385V3();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((mfg) this.f47757b).act();
    }

    /* JADX INFO: renamed from: H */
    public final void m130758H(View view) {
        ifg.m135921a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m130760L(String str) {
        this.f107474k.setText(str);
        xdl0.m208329E0(this.f107476m, new View.OnClickListener() { // from class: l.ffg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97254a.m130756J(view);
            }
        });
        xdl0.m208329E0(this.f107478o, new View.OnClickListener() { // from class: l.gfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102391a.m130757K(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m130758H(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mfg mfgVar) {
    }
}
