package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.camera.R$string;
import com.p051p1.mobile.putong.camera.TTCameraAct;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewPresenter;
import com.p051p1.mobile.putong.camera.widget.TTCameraMediaView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class ovh0 implements iam<TTCameraPreviewPresenter> {

    /* JADX INFO: renamed from: a */
    public TextView f149263a;

    /* JADX INFO: renamed from: b */
    public TextView f149264b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f149265c;

    /* JADX INFO: renamed from: d */
    public TTCameraMediaView f149266d;

    /* JADX INFO: renamed from: e */
    public final String f149267e = getClass().getSimpleName();

    /* JADX INFO: renamed from: f */
    public TTCameraPreviewPresenter f149268f;

    /* JADX INFO: renamed from: g */
    public final TTCameraPreviewAndUploadAct f149269g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public TTCameraConfig f149270h;

    /* JADX INFO: renamed from: i */
    public TTCameraPreviewConfig f149271i;

    public ovh0(final TTCameraPreviewAndUploadAct tTCameraPreviewAndUploadAct, View view, @Nullable TTCameraConfig tTCameraConfig, final TTCameraPreviewConfig tTCameraPreviewConfig) {
        this.f149269g = tTCameraPreviewAndUploadAct;
        this.f149270h = tTCameraConfig;
        this.f149271i = tTCameraPreviewConfig;
        this.f149263a = (TextView) view.findViewById(xcc0.f193292e);
        this.f149264b = (TextView) view.findViewById(xcc0.f193290c);
        this.f149265c = (VDraweeView) view.findViewById(xcc0.f193301n);
        TTCameraMediaView tTCameraMediaView = (TTCameraMediaView) view.findViewById(xcc0.f193304q);
        this.f149266d = tTCameraMediaView;
        tTCameraMediaView.setRadius(qa00.f156322i);
        bnl0.m105509E0(this.f149264b, new View.OnClickListener() { // from class: l.lvh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f133706a.m169441e(tTCameraPreviewConfig, tTCameraPreviewAndUploadAct, view2);
            }
        });
        bnl0.m105509E0(this.f149263a, new View.OnClickListener() { // from class: l.mvh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f138895a.m169439f(view2);
            }
        });
        bnl0.m105525M0(this.f149263a, tTCameraConfig != null);
        bnl0.m105525M0(this.f149266d, tTCameraPreviewConfig.m30776g() == 2);
        bnl0.m105525M0(this.f149265c, tTCameraPreviewConfig.m30776g() == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m169439f(View view) {
        m169449q();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f149269g;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f149269g;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(TTCameraPreviewPresenter tTCameraPreviewPresenter) {
        this.f149268f = tTCameraPreviewPresenter;
        tTCameraPreviewPresenter.m30811p0();
    }

    @Override // p153l.iam
    public void destroy() {
        this.f149266d.m30876o();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m169441e(TTCameraPreviewConfig tTCameraPreviewConfig, TTCameraPreviewAndUploadAct tTCameraPreviewAndUploadAct, View view) {
        if (tTCameraPreviewConfig.m30781m()) {
            this.f149268f.m30819z0();
        } else {
            tTCameraPreviewAndUploadAct.m68056e2();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m169442i() {
        this.f149269g.m68056e2();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m169443j() {
        this.f149269g.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public void m169444k(Throwable th) {
        this.f149269g.progressDismiss();
    }

    /* JADX INFO: renamed from: l */
    public void m169445l(String str) {
        this.f149269g.progressDismiss();
        this.f149269g.m68056e2();
    }

    /* JADX INFO: renamed from: m */
    public void m169446m() {
        this.f149269g.progress(R$string.f17932f);
    }

    /* JADX INFO: renamed from: n */
    public final void m169447n() {
        if (this.f149271i.m30777h().contains("live-web")) {
            this.f149271i.m30787s(rnl.m182265r(this.f149271i.m30777h()).m182288p().m182300c("webApiFlag", "flag").m182301d().toString());
        }
        if (this.f149271i.m30776g() != 2) {
            uqb0.f180374G.m127119N0(this.f149265c, this.f149271i.m30777h(), false);
        } else {
            this.f149266d.setCoverUrl(this.f149271i.m30777h());
            this.f149266d.m30875n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m169448p() {
        if (!this.f149271i.m30778i()) {
            if (this.f149271i.m30779k()) {
                this.f149268f.m30810o0();
                return;
            } else {
                this.f149266d.m30870i(this.f149271i.m30777h());
                return;
            }
        }
        if (this.f149268f.m30809n0()) {
            this.f149266d.m30870i(this.f149271i.m30777h());
        } else if (this.f149271i.m30779k()) {
            this.f149268f.m30810o0();
        } else {
            this.f149266d.m30870i(this.f149271i.m30777h());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m169449q() {
        TTCameraAct.m30706c2(this.f149269g, this.f149270h, new x20() { // from class: l.nvh0
            @Override // p153l.x20
            public final void call() {
                this.f143801a.m169442i();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m169450s() {
        if (TextUtils.isEmpty(this.f149271i.m30777h())) {
            return;
        }
        if (this.f149271i.m30782n()) {
            m169448p();
        } else {
            m169447n();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m169451u() {
        this.f149266d.m30876o();
    }
}
