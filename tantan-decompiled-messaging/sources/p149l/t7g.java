package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class t7g extends LiveMenuDialogHolder<x7g> {

    /* JADX INFO: renamed from: k */
    public View f168712k;

    /* JADX INFO: renamed from: l */
    public FansClubEventView f168713l;

    /* JADX INFO: renamed from: m */
    public VImage f168714m;

    /* JADX INFO: renamed from: n */
    public VImage f168715n;

    public t7g(Act act, x7g x7gVar) {
        super(t6c0.f168444n3, act, x7gVar, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m187450K(View view) {
        ((x7g) this.f47757b).m207296k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m187451L(View view) {
        ((x7g) this.f47757b).m207299o4();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((x7g) this.f47757b).m104249C0();
    }

    /* JADX INFO: renamed from: H */
    public final void m187452H(View view) {
        u7g.m192135a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m187454J() {
        this.f168713l.f49031c.m72887k();
    }

    /* JADX INFO: renamed from: M */
    public void m187455M(boolean z) {
        m71832B(z);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        VImage vImage = this.f168714m;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f168715n;
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
        m187452H(view);
        ((x7g) this.f47757b).m207298n4();
        this.f168713l.m72869d(((x7g) this.f47757b).m150134b4(), this.f47757b);
        xdl0.m208329E0(this.f168714m, new View.OnClickListener() { // from class: l.r7g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f158026a.m187450K(view2);
            }
        });
        xdl0.m208329E0(this.f168715n, new View.OnClickListener() { // from class: l.s7g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f162911a.m187451L(view2);
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f168713l.f49031c.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.leftMargin = 0;
        this.f168713l.f49031c.setLayoutParams(layoutParams);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x7g x7gVar) {
    }
}
