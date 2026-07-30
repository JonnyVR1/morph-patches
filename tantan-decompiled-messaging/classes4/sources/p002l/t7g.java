package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p1.mobile.android.app.Act;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t7g extends LiveMenuDialogHolder<x7g> {

    /* JADX INFO: renamed from: k */
    public View f20119k;

    /* JADX INFO: renamed from: l */
    public FansClubEventView f20120l;

    /* JADX INFO: renamed from: m */
    public VImage f20121m;

    /* JADX INFO: renamed from: n */
    public VImage f20122n;

    public t7g(Act act, x7g x7gVar) {
        super(t6c0.f19940n3, act, x7gVar, j2g0.m15577c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m22803K(View view) {
        ((x7g) this.f3799b).m25740k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m22804L(View view) {
        ((x7g) this.f3799b).m25743o4();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((x7g) this.f3799b).C0();
    }

    /* JADX INFO: renamed from: H */
    public final void m22805H(View view) {
        u7g.m23325a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m22807J() {
        this.f20120l.f5073c.m6406k();
    }

    /* JADX INFO: renamed from: M */
    public void m22808M(boolean z) {
        m5208B(z);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
        VImage vImage = this.f20121m;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f20122n;
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
        m22805H(view);
        ((x7g) this.f3799b).m25742n4();
        this.f20120l.m6388d(((x7g) this.f3799b).m17288b4(), this.f3799b);
        xdl0.E0(this.f20121m, new View.OnClickListener() { // from class: l.r7g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18409a.m22803K(view2);
            }
        });
        xdl0.E0(this.f20122n, new View.OnClickListener() { // from class: l.s7g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18818a.m22804L(view2);
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20120l.f5073c.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.leftMargin = 0;
        this.f20120l.f5073c.setLayoutParams(layoutParams);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(x7g x7gVar) {
    }
}
