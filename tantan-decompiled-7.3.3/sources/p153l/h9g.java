package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class h9g extends LiveMenuDialogHolder<l9g> {

    /* JADX INFO: renamed from: k */
    public View f108405k;

    /* JADX INFO: renamed from: l */
    public FansClubEventView f108406l;

    /* JADX INFO: renamed from: m */
    public VImage f108407m;

    /* JADX INFO: renamed from: n */
    public VImage f108408n;

    public h9g(Act act, l9g l9gVar) {
        super(yec0.f199176n3, act, l9gVar, qag0.m175922c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m134050K(View view) {
        ((l9g) this.f48605b).m153422k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m134051L(View view) {
        ((l9g) this.f48605b).m153425o4();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((l9g) this.f48605b).m113230C0();
    }

    /* JADX INFO: renamed from: H */
    public final void m134052H(View view) {
        i9g.m139096a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m134054J() {
        this.f108406l.f49879c.m74070k();
    }

    /* JADX INFO: renamed from: M */
    public void m134055M(boolean z) {
        m73015B(z);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        VImage vImage = this.f108407m;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f108408n;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m134052H(view);
        ((l9g) this.f48605b).m153424n4();
        this.f108406l.m74052d(((l9g) this.f48605b).m191482b4(), this.f48605b);
        bnl0.m105509E0(this.f108407m, new View.OnClickListener() { // from class: l.f9g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f97882a.m134050K(view2);
            }
        });
        bnl0.m105509E0(this.f108408n, new View.OnClickListener() { // from class: l.g9g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f102845a.m134051L(view2);
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f108406l.f49879c.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.leftMargin = 0;
        this.f108406l.f49879c.setLayoutParams(layoutParams);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(l9g l9gVar) {
    }
}
