package com.p051p1.mobile.putong.camera.picture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.camera.R$string;
import com.p051p1.mobile.putong.camera.TTCameraBaseFrag;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p051p1.mobile.putong.camera.widget.TTCameraAvatarAndEmblemView;
import com.p051p1.mobile.putong.camera.widget.TTCameraHandIdCardView;
import com.tantanapp.common.utils.CrashHelper;
import p153l.bnl0;
import p153l.cth0;
import p153l.d3i0;
import p153l.fo0;
import p153l.ft5;
import p153l.o1j0;
import p153l.psd0;
import p153l.t6m;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPictureFrag extends TTCameraBaseFrag implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B */
    public cth0 f17946B;

    /* JADX INFO: renamed from: C */
    public t6m f17947C;

    /* JADX INFO: renamed from: D */
    public ft5 f17948D = new ft5();

    /* JADX INFO: renamed from: E */
    public int f17949E = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m30752Y4(View view) {
        act().progress(R$string.f17927a);
        this.f17946B.m112489y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m30753Z4(View view) {
        m30756j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m30754a5(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i5 */
    private void m30755i5() {
        cth0 cth0Var = this.f17946B;
        if (cth0Var == null) {
            return;
        }
        cth0Var.m112477d(this.f17947C.getPreviewSurface(), new x20() { // from class: l.buh0
            @Override // p153l.x20
            public final void call() {
                this.f78511a.m30762e5();
            }
        }, new y20() { // from class: l.cuh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83841a.m30763f5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    private void m30756j5() {
        this.f17948D.m127299c();
        m30757W4(false);
        this.f17946B.destroy();
        TTCameraConfig tTCameraConfig = this.f17934z;
        tTCameraConfig.m30731y(!tTCameraConfig.m30721l());
        m30764g5();
        m30755i5();
    }

    /* JADX INFO: renamed from: W4 */
    public final void m30757W4(final boolean z) {
        t6m t6mVar = this.f17947C;
        if (t6mVar == null) {
            return;
        }
        t6mVar.mo30860q().post(new Runnable() { // from class: l.juh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122719a.m30758X4(z);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m30758X4(boolean z) {
        bnl0.m105525M0(this.f17947C.getTakePictureButton(), z);
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m30759b5() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m30760c5(d3i0 d3i0Var) {
        act().progressDismiss();
        int i = this.f17949E + 1;
        this.f17949E = i;
        String str = d3i0Var.f84910b;
        if (i < this.f17934z.m30716f() || !this.f17934z.m30719i()) {
            return;
        }
        act().startActivity(TTCameraPreviewAndUploadAct.m30768Z1(act(), this.f17934z, TTCameraPreviewConfig.m30774e().m30792b(d3i0Var.f84910b).m30794d(true).m30793c(this.f17934z).m30791a()));
        act().lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.putong.camera.TTCameraBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m30764g5();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m30761d5(Throwable th) {
        act().progressDismiss();
        o1j0.m165634h(R$string.f17930d);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m30762e5() {
        this.f17946B.m112488x(this.f17947C.mo30858c());
        m30757W4(true);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m30763f5(Throwable th) {
        CrashHelper.m82479c(th);
        o1j0.m165634h(R$string.f17931e);
        m30757W4(false);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f17947C.getTakePictureButton().setOnClickListener(new View.OnClickListener() { // from class: l.duh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90797a.m30752Y4(view);
            }
        });
        m30757W4(false);
        if (this.f17947C.getSwitchCameraButton() != null) {
            bnl0.m105509E0(this.f17947C.getSwitchCameraButton(), new View.OnClickListener() { // from class: l.euh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f95872a.m30753Z4(view);
                }
            });
        }
        if (this.f17947C.getCloseButton() != null) {
            bnl0.m105509E0(this.f17947C.getCloseButton(), new View.OnClickListener() { // from class: l.fuh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f100917a.m30754a5(view);
                }
            });
        }
        t6m t6mVar = this.f17947C;
        if (t6mVar != null) {
            t6mVar.getPreviewSurface().getHolder().addCallback(this);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final void m30764g5() {
        cth0 cth0Var = new cth0(act());
        this.f17946B = cth0Var;
        cth0Var.mo100638b(this.f17934z);
        m30765h5();
    }

    /* JADX INFO: renamed from: h5 */
    public final void m30765h5() {
        this.f17948D.m127299c();
        this.f17948D.m127297a(duringCreated(this.f17946B.m112479o()).onBackpressureBuffer().observeOn(fo0.m126432a()).doOnUnsubscribe(new x20() { // from class: l.guh0
            @Override // p153l.x20
            public final void call() {
                this.f106509a.m30759b5();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.huh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111670a.m30760c5((d3i0) obj);
            }
        }, new y20() { // from class: l.iuh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116950a.m30761d5((Throwable) obj);
            }
        })));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (TTCameraConfig.TYPE_ID_CARD_HAND.equals(this.f17934z.m30718h())) {
            this.f17947C = new TTCameraHandIdCardView(layoutInflater.getContext());
        } else if ("avatar".equals(this.f17934z.m30718h())) {
            TTCameraAvatarAndEmblemView tTCameraAvatarAndEmblemView = new TTCameraAvatarAndEmblemView(layoutInflater.getContext());
            tTCameraAvatarAndEmblemView.m30859i0(true);
            this.f17947C = tTCameraAvatarAndEmblemView;
        } else {
            TTCameraAvatarAndEmblemView tTCameraAvatarAndEmblemView2 = new TTCameraAvatarAndEmblemView(layoutInflater.getContext());
            tTCameraAvatarAndEmblemView2.m30859i0(false);
            this.f17947C = tTCameraAvatarAndEmblemView2;
        }
        this.f17947C.setDescriptionText(this.f17934z.m30714d());
        return this.f17947C.mo30860q();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f17948D.m127299c();
        super.onDestroy();
        cth0 cth0Var = this.f17946B;
        if (cth0Var != null) {
            cth0Var.destroy();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f17946B.m112485u();
        super.onStop();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m30755i5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
