package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.camera.R$string;
import com.p046p1.mobile.putong.camera.TTCameraAct;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewPresenter;
import com.p046p1.mobile.putong.camera.widget.TTCameraMediaView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class hnh0 implements s7m<TTCameraPreviewPresenter> {

    /* JADX INFO: renamed from: a */
    public TextView f108630a;

    /* JADX INFO: renamed from: b */
    public TextView f108631b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f108632c;

    /* JADX INFO: renamed from: d */
    public TTCameraMediaView f108633d;

    /* JADX INFO: renamed from: e */
    public final String f108634e = getClass().getSimpleName();

    /* JADX INFO: renamed from: f */
    public TTCameraPreviewPresenter f108635f;

    /* JADX INFO: renamed from: g */
    public final TTCameraPreviewAndUploadAct f108636g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public TTCameraConfig f108637h;

    /* JADX INFO: renamed from: i */
    public TTCameraPreviewConfig f108638i;

    public hnh0(final TTCameraPreviewAndUploadAct tTCameraPreviewAndUploadAct, View view, @Nullable TTCameraConfig tTCameraConfig, final TTCameraPreviewConfig tTCameraPreviewConfig) {
        this.f108636g = tTCameraPreviewAndUploadAct;
        this.f108637h = tTCameraConfig;
        this.f108638i = tTCameraPreviewConfig;
        this.f108630a = (TextView) view.findViewById(r4c0.f157650e);
        this.f108631b = (TextView) view.findViewById(r4c0.f157648c);
        this.f108632c = (VDraweeView) view.findViewById(r4c0.f157659n);
        TTCameraMediaView tTCameraMediaView = (TTCameraMediaView) view.findViewById(r4c0.f157662q);
        this.f108633d = tTCameraMediaView;
        tTCameraMediaView.setRadius(t100.f167260i);
        xdl0.m208329E0(this.f108631b, new View.OnClickListener() { // from class: l.enh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f92315a.m131929e(tTCameraPreviewConfig, tTCameraPreviewAndUploadAct, view2);
            }
        });
        xdl0.m208329E0(this.f108630a, new View.OnClickListener() { // from class: l.fnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98421a.m131927f(view2);
            }
        });
        xdl0.m208345M0(this.f108630a, tTCameraConfig != null);
        xdl0.m208345M0(this.f108633d, tTCameraPreviewConfig.m29778g() == 2);
        xdl0.m208345M0(this.f108632c, tTCameraPreviewConfig.m29778g() == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m131927f(View view) {
        m131937q();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f108636g;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f108636g;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(TTCameraPreviewPresenter tTCameraPreviewPresenter) {
        this.f108635f = tTCameraPreviewPresenter;
        tTCameraPreviewPresenter.m29813p0();
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f108633d.m29878o();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m131929e(TTCameraPreviewConfig tTCameraPreviewConfig, TTCameraPreviewAndUploadAct tTCameraPreviewAndUploadAct, View view) {
        if (tTCameraPreviewConfig.m29783m()) {
            this.f108635f.m29821z0();
        } else {
            tTCameraPreviewAndUploadAct.m66873d2();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m131930i() {
        this.f108636g.m66873d2();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m131931j() {
        this.f108636g.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public void m131932k(Throwable th) {
        this.f108636g.progressDismiss();
    }

    /* JADX INFO: renamed from: l */
    public void m131933l(String str) {
        this.f108636g.progressDismiss();
        this.f108636g.m66873d2();
    }

    /* JADX INFO: renamed from: m */
    public void m131934m() {
        this.f108636g.progress(R$string.f17213f);
    }

    /* JADX INFO: renamed from: n */
    public final void m131935n() {
        if (this.f108638i.m29779h().contains("live-web")) {
            this.f108638i.m29789s(cll.m107501r(this.f108638i.m29779h()).m107524p().m107536c("webApiFlag", "flag").m107537d().toString());
        }
        if (this.f108638i.m29778g() != 2) {
            qib0.f154691G.m102335N0(this.f108632c, this.f108638i.m29779h(), false);
        } else {
            this.f108633d.setCoverUrl(this.f108638i.m29779h());
            this.f108633d.m29877n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m131936p() {
        if (!this.f108638i.m29780i()) {
            if (this.f108638i.m29781k()) {
                this.f108635f.m29812o0();
                return;
            } else {
                this.f108633d.m29872i(this.f108638i.m29779h());
                return;
            }
        }
        if (this.f108635f.m29811n0()) {
            this.f108633d.m29872i(this.f108638i.m29779h());
        } else if (this.f108638i.m29781k()) {
            this.f108635f.m29812o0();
        } else {
            this.f108633d.m29872i(this.f108638i.m29779h());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m131937q() {
        TTCameraAct.m29708b2(this.f108636g, this.f108637h, new d30() { // from class: l.gnh0
            @Override // p149l.d30
            public final void call() {
                this.f103601a.m131930i();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m131938s() {
        if (TextUtils.isEmpty(this.f108638i.m29779h())) {
            return;
        }
        if (this.f108638i.m29784n()) {
            m131936p();
        } else {
            m131935n();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m131939u() {
        this.f108633d.m29878o();
    }
}
