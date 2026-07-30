package com.p046p1.mobile.putong.camera.picture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.camera.R$string;
import com.p046p1.mobile.putong.camera.TTCameraBaseFrag;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p046p1.mobile.putong.camera.widget.TTCameraAvatarAndEmblemView;
import com.p046p1.mobile.putong.camera.widget.TTCameraHandIdCardView;
import com.tantanapp.common.utils.CrashHelper;
import p149l.bs5;
import p149l.d30;
import p149l.d4m;
import p149l.e30;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.vkh0;
import p149l.vuh0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPictureFrag extends TTCameraBaseFrag implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B */
    public vkh0 f17227B;

    /* JADX INFO: renamed from: C */
    public d4m f17228C;

    /* JADX INFO: renamed from: D */
    public bs5 f17229D = new bs5();

    /* JADX INFO: renamed from: E */
    public int f17230E = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m29754Y4(View view) {
        act().progress(R$string.f17208a);
        this.f17227B.m198740y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m29755Z4(View view) {
        m29758j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m29756a5(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i5 */
    private void m29757i5() {
        vkh0 vkh0Var = this.f17227B;
        if (vkh0Var == null) {
            return;
        }
        vkh0Var.m198728d(this.f17228C.getPreviewSurface(), new d30() { // from class: l.ulh0
            @Override // p149l.d30
            public final void call() {
                this.f177067a.m29764e5();
            }
        }, new e30() { // from class: l.vlh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181951a.m29765f5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    private void m29758j5() {
        this.f17229D.m103657c();
        m29759W4(false);
        this.f17227B.destroy();
        TTCameraConfig tTCameraConfig = this.f17215z;
        tTCameraConfig.m29733y(!tTCameraConfig.m29723l());
        m29766g5();
        m29757i5();
    }

    /* JADX INFO: renamed from: W4 */
    public final void m29759W4(final boolean z) {
        d4m d4mVar = this.f17228C;
        if (d4mVar == null) {
            return;
        }
        d4mVar.mo29862p().post(new Runnable() { // from class: l.cmh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81568a.m29760X4(z);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m29760X4(boolean z) {
        xdl0.m208345M0(this.f17228C.getTakePictureButton(), z);
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m29761b5() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m29762c5(vuh0 vuh0Var) {
        act().progressDismiss();
        int i = this.f17230E + 1;
        this.f17230E = i;
        String str = vuh0Var.f183070b;
        if (i < this.f17215z.m29718f() || !this.f17215z.m29721i()) {
            return;
        }
        act().startActivity(TTCameraPreviewAndUploadAct.m29770Y1(act(), this.f17215z, TTCameraPreviewConfig.m29776e().m29794b(vuh0Var.f183070b).m29796d(true).m29795c(this.f17215z).m29793a()));
        act().lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.putong.camera.TTCameraBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m29766g5();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m29763d5(Throwable th) {
        act().progressDismiss();
        lsi0.m151578h(R$string.f17211d);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m29764e5() {
        this.f17227B.m198739x(this.f17228C.mo29860c());
        m29759W4(true);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m29765f5(Throwable th) {
        CrashHelper.m81296c(th);
        lsi0.m151578h(R$string.f17212e);
        m29759W4(false);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f17228C.getTakePictureButton().setOnClickListener(new View.OnClickListener() { // from class: l.wlh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186952a.m29754Y4(view);
            }
        });
        m29759W4(false);
        if (this.f17228C.getSwitchCameraButton() != null) {
            xdl0.m208329E0(this.f17228C.getSwitchCameraButton(), new View.OnClickListener() { // from class: l.xlh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f193421a.m29755Z4(view);
                }
            });
        }
        if (this.f17228C.getCloseButton() != null) {
            xdl0.m208329E0(this.f17228C.getCloseButton(), new View.OnClickListener() { // from class: l.ylh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198897a.m29756a5(view);
                }
            });
        }
        d4m d4mVar = this.f17228C;
        if (d4mVar != null) {
            d4mVar.getPreviewSurface().getHolder().addCallback(this);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final void m29766g5() {
        vkh0 vkh0Var = new vkh0(act());
        this.f17227B = vkh0Var;
        vkh0Var.mo102531b(this.f17215z);
        m29767h5();
    }

    /* JADX INFO: renamed from: h5 */
    public final void m29767h5() {
        this.f17229D.m103657c();
        this.f17229D.m103655a(duringCreated(this.f17227B.m198730o()).onBackpressureBuffer().observeOn(jo0.m142408a()).doOnUnsubscribe(new d30() { // from class: l.zlh0
            @Override // p149l.d30
            public final void call() {
                this.f203635a.m29761b5();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.amh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70624a.m29762c5((vuh0) obj);
            }
        }, new e30() { // from class: l.bmh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76284a.m29763d5((Throwable) obj);
            }
        })));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (TTCameraConfig.TYPE_ID_CARD_HAND.equals(this.f17215z.m29720h())) {
            this.f17228C = new TTCameraHandIdCardView(layoutInflater.getContext());
        } else if ("avatar".equals(this.f17215z.m29720h())) {
            TTCameraAvatarAndEmblemView tTCameraAvatarAndEmblemView = new TTCameraAvatarAndEmblemView(layoutInflater.getContext());
            tTCameraAvatarAndEmblemView.m29861i0(true);
            this.f17228C = tTCameraAvatarAndEmblemView;
        } else {
            TTCameraAvatarAndEmblemView tTCameraAvatarAndEmblemView2 = new TTCameraAvatarAndEmblemView(layoutInflater.getContext());
            tTCameraAvatarAndEmblemView2.m29861i0(false);
            this.f17228C = tTCameraAvatarAndEmblemView2;
        }
        this.f17228C.setDescriptionText(this.f17215z.m29716d());
        return this.f17228C.mo29862p();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f17229D.m103657c();
        super.onDestroy();
        vkh0 vkh0Var = this.f17227B;
        if (vkh0Var != null) {
            vkh0Var.destroy();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f17227B.m198736u();
        super.onStop();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m29757i5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
