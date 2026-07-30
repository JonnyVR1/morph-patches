package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;

/* JADX INFO: loaded from: classes4.dex */
public class ycp extends LiveMenuDialogHolder<tcp> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f197471k;

    /* JADX INFO: renamed from: l */
    public View f197472l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f197473m;

    /* JADX INFO: renamed from: n */
    public tcp f197474n;

    public ycp(Act act, @NonNull tcp tcpVar) {
        super(t6c0.f167986C2, act, tcpVar, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m214183F(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m214185J(View view) {
        mo71838p();
    }

    /* JADX INFO: renamed from: K */
    private void m214186K(int[] iArr, boolean z, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z2 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f197473m.getLayoutParams();
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
        this.f197473m.setLayoutParams(layoutParams);
        int iM186890d = t100.m186890d(i2);
        if (z) {
            return;
        }
        FrameLayout frameLayout = this.f197473m;
        if (z2) {
            mep0.m154301c1(frameLayout, 0, 0, 0, -iM186890d, iM186890d);
        } else {
            mep0.m154302d1(frameLayout, iM186890d);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((tcp) this.f47757b).act();
    }

    /* JADX INFO: renamed from: H */
    public final void m214187H(View view) {
        zcp.m218074a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tcp tcpVar) {
        this.f197474n = tcpVar;
    }

    /* JADX INFO: renamed from: L */
    public void m214189L(shj shjVar) {
        m71834E();
        m214186K(shjVar.m184196d(), shjVar.m184197e(), shjVar.m184194b(), shjVar.m184193a());
        this.f197471k.setBackgroundColor(0);
        this.f197473m.setBackgroundResource(i3c0.f111185u7);
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a != null) {
            dialogC12611a.getWindow().setSoftInputMode(19);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m214187H(view);
        xdl0.m208329E0(this.f197472l, new View.OnClickListener() { // from class: l.wcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f185704a.m214185J(view2);
            }
        });
        xdl0.m208329E0(this.f197473m, new View.OnClickListener() { // from class: l.xcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ycp.m214183F(view2);
            }
        });
    }
}
