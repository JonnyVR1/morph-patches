package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import l.mep0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ycp extends LiveMenuDialogHolder<tcp> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f22803k;

    /* JADX INFO: renamed from: l */
    public View f22804l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f22805m;

    /* JADX INFO: renamed from: n */
    public tcp f22806n;

    public ycp(Act act, @NonNull tcp tcpVar) {
        super(t6c0.f19482C2, act, tcpVar, j2g0.m15579e(true));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m26644F(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m26646J(View view) {
        mo5216p();
    }

    /* JADX INFO: renamed from: K */
    private void m26647K(int[] iArr, boolean z, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z2 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22805m.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (z) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.gravity = i;
        this.f22805m.setLayoutParams(layoutParams);
        int iD = t100.d(i2);
        if (z) {
            return;
        }
        FrameLayout frameLayout = this.f22805m;
        if (z2) {
            mep0.c1(frameLayout, 0, 0, 0, -iD, iD);
        } else {
            mep0.d1(frameLayout, iD);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((tcp) this.f3799b).act();
    }

    /* JADX INFO: renamed from: H */
    public final void m26648H(View view) {
        zcp.m27165a(this, view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(tcp tcpVar) {
        this.f22806n = tcpVar;
    }

    /* JADX INFO: renamed from: L */
    public void m26650L(shj shjVar) {
        m5211E();
        m26647K(shjVar.m22473d(), shjVar.m22474e(), shjVar.m22471b(), shjVar.m22470a());
        this.f22803k.setBackgroundColor(0);
        this.f22805m.setBackgroundResource(i3c0.f12970u7);
        a aVar = this.f3800c;
        if (aVar != null) {
            aVar.getWindow().setSoftInputMode(19);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m26648H(view);
        xdl0.E0(this.f22804l, new View.OnClickListener() { // from class: l.wcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f21639a.m26646J(view2);
            }
        });
        xdl0.E0(this.f22805m, new View.OnClickListener() { // from class: l.xcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ycp.m26644F(view2);
            }
        });
    }
}
