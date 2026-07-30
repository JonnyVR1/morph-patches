package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.camera.R$string;
import com.p000p1.mobile.putong.camera.TTCameraAct;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewPresenter;
import com.p000p1.mobile.putong.camera.widget.TTCameraMediaView;
import com.p1.mobile.android.app.Act;
import l.cll;
import l.d30;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hnh0 implements s7m<TTCameraPreviewPresenter> {

    /* JADX INFO: renamed from: a */
    public TextView f13969a;

    /* JADX INFO: renamed from: b */
    public TextView f13970b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f13971c;

    /* JADX INFO: renamed from: d */
    public TTCameraMediaView f13972d;

    /* JADX INFO: renamed from: e */
    public final String f13973e = getClass().getSimpleName();

    /* JADX INFO: renamed from: f */
    public TTCameraPreviewPresenter f13974f;

    /* JADX INFO: renamed from: g */
    public final TTCameraPreviewAndUploadAct f13975g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public TTCameraConfig f13976h;

    /* JADX INFO: renamed from: i */
    public TTCameraPreviewConfig f13977i;

    public hnh0(final TTCameraPreviewAndUploadAct tTCameraPreviewAndUploadAct, View view, @Nullable TTCameraConfig tTCameraConfig, final TTCameraPreviewConfig tTCameraPreviewConfig) {
        this.f13975g = tTCameraPreviewAndUploadAct;
        this.f13976h = tTCameraConfig;
        this.f13977i = tTCameraPreviewConfig;
        this.f13969a = (TextView) view.findViewById(r4c0.f20295e);
        this.f13970b = (TextView) view.findViewById(r4c0.f20293c);
        this.f13971c = view.findViewById(r4c0.f20304n);
        TTCameraMediaView tTCameraMediaView = (TTCameraMediaView) view.findViewById(r4c0.f20307q);
        this.f13972d = tTCameraMediaView;
        tTCameraMediaView.setRadius(t100.i);
        xdl0.E0(this.f13970b, new View.OnClickListener() { // from class: l.enh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11288a.m16277e(tTCameraPreviewConfig, tTCameraPreviewAndUploadAct, view2);
            }
        });
        xdl0.E0(this.f13969a, new View.OnClickListener() { // from class: l.fnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12799a.m16274f(view2);
            }
        });
        xdl0.M0(this.f13969a, tTCameraConfig != null);
        xdl0.M0(this.f13972d, tTCameraPreviewConfig.m1689g() == 2);
        xdl0.M0(this.f13971c, tTCameraPreviewConfig.m1689g() == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m16274f(View view) {
        m16286q();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16275C0() {
        return this.f13975g;
    }

    @Nullable
    public Act act() {
        return this.f13975g;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m16279i1(TTCameraPreviewPresenter tTCameraPreviewPresenter) {
        this.f13974f = tTCameraPreviewPresenter;
        tTCameraPreviewPresenter.m1724p0();
    }

    public void destroy() {
        this.f13972d.m1790o();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m16277e(TTCameraPreviewConfig tTCameraPreviewConfig, TTCameraPreviewAndUploadAct tTCameraPreviewAndUploadAct, View view) {
        if (tTCameraPreviewConfig.m1694m()) {
            this.f13974f.m1732z0();
        } else {
            tTCameraPreviewAndUploadAct.finish();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m16278i() {
        this.f13975g.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m16280j() {
        this.f13975g.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public void m16281k(Throwable th) {
        this.f13975g.progressDismiss();
    }

    /* JADX INFO: renamed from: l */
    public void m16282l(String str) {
        this.f13975g.progressDismiss();
        this.f13975g.finish();
    }

    /* JADX INFO: renamed from: m */
    public void m16283m() {
        this.f13975g.progress(R$string.f1202f);
    }

    /* JADX INFO: renamed from: n */
    public final void m16284n() {
        if (this.f13977i.m1690h().contains("live-web")) {
            this.f13977i.m1700s(cll.r(this.f13977i.m1690h()).p().c("webApiFlag", "flag").d().toString());
        }
        if (this.f13977i.m1689g() != 2) {
            qib0.f19782G.m12748N0(this.f13971c, this.f13977i.m1690h(), false);
        } else {
            this.f13972d.setCoverUrl(this.f13977i.m1690h());
            this.f13972d.m1789n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m16285p() {
        if (!this.f13977i.m1691i()) {
            if (this.f13977i.m1692k()) {
                this.f13974f.m1723o0();
                return;
            } else {
                this.f13972d.m1784i(this.f13977i.m1690h());
                return;
            }
        }
        if (this.f13974f.m1722n0()) {
            this.f13972d.m1784i(this.f13977i.m1690h());
        } else if (this.f13977i.m1692k()) {
            this.f13974f.m1723o0();
        } else {
            this.f13972d.m1784i(this.f13977i.m1690h());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m16286q() {
        TTCameraAct.m1618b2(this.f13975g, this.f13976h, new d30() { // from class: l.gnh0
            public final void call() {
                this.f13409a.m16278i();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m16287s() {
        if (TextUtils.isEmpty(this.f13977i.m1690h())) {
            return;
        }
        if (this.f13977i.m1695n()) {
            m16285p();
        } else {
            m16284n();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16288u() {
        this.f13972d.m1790o();
    }
}
