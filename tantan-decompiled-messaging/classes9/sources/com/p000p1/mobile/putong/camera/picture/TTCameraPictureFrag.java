package com.p000p1.mobile.putong.camera.picture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.camera.R$string;
import com.p000p1.mobile.putong.camera.TTCameraBaseFrag;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p000p1.mobile.putong.camera.widget.TTCameraAvatarAndEmblemView;
import com.p000p1.mobile.putong.camera.widget.TTCameraHandIdCardView;
import com.tantanapp.common.utils.CrashHelper;
import l.bs5;
import l.d30;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.xdl0;
import p006l.d4m;
import p006l.vkh0;
import p006l.vuh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraPictureFrag extends TTCameraBaseFrag implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B */
    public vkh0 f1216B;

    /* JADX INFO: renamed from: C */
    public d4m f1217C;

    /* JADX INFO: renamed from: D */
    public bs5 f1218D = new bs5();

    /* JADX INFO: renamed from: E */
    public int f1219E = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m1664Y4(View view) {
        act().progress(R$string.f1197a);
        this.f1216B.m25852y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m1665Z4(View view) {
        m1668j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m1666a5(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: i5 */
    private void m1667i5() {
        vkh0 vkh0Var = this.f1216B;
        if (vkh0Var == null) {
            return;
        }
        vkh0Var.m25840d(this.f1217C.getPreviewSurface(), new d30() { // from class: l.ulh0
            public final void call() {
                this.f23630a.m1674e5();
            }
        }, new e30() { // from class: l.vlh0
            public final void call(Object obj) {
                this.f24376a.m1675f5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    private void m1668j5() {
        this.f1218D.c();
        m1669W4(false);
        this.f1216B.destroy();
        TTCameraConfig tTCameraConfig = this.f1204z;
        tTCameraConfig.m1643y(!tTCameraConfig.m1633l());
        m1677g5();
        m1667i5();
    }

    /* JADX INFO: renamed from: W4 */
    public final void m1669W4(final boolean z) {
        d4m d4mVar = this.f1217C;
        if (d4mVar == null) {
            return;
        }
        d4mVar.mo1774p().post(new Runnable() { // from class: l.cmh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9733a.m1670X4(z);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m1670X4(boolean z) {
        xdl0.M0(this.f1217C.getTakePictureButton(), z);
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m1671b5() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m1672c5(vuh0 vuh0Var) {
        act().progressDismiss();
        int i = this.f1219E + 1;
        this.f1219E = i;
        String str = vuh0Var.f24475b;
        if (i < this.f1204z.m1628f() || !this.f1204z.m1631i()) {
            return;
        }
        act().startActivity(TTCameraPreviewAndUploadAct.m1681Y1(act(), this.f1204z, TTCameraPreviewConfig.m1687e().m1705b(vuh0Var.f24475b).m1707d(true).m1706c(this.f1204z).m1704a()));
        act().finish();
    }

    @Override // com.p000p1.mobile.putong.camera.TTCameraBaseFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        m1677g5();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m1673d5(Throwable th) {
        act().progressDismiss();
        lsi0.h(R$string.f1200d);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m1674e5() {
        this.f1216B.m25851x(this.f1217C.mo1772c());
        m1669W4(true);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m1675f5(Throwable th) {
        CrashHelper.c(th);
        lsi0.h(R$string.f1201e);
        m1669W4(false);
    }

    /* JADX INFO: renamed from: g4 */
    public void m1676g4(Bundle bundle) {
        super.g4(bundle);
        this.f1217C.getTakePictureButton().setOnClickListener(new View.OnClickListener() { // from class: l.wlh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25225a.m1664Y4(view);
            }
        });
        m1669W4(false);
        if (this.f1217C.getSwitchCameraButton() != null) {
            xdl0.E0(this.f1217C.getSwitchCameraButton(), new View.OnClickListener() { // from class: l.xlh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27586a.m1665Z4(view);
                }
            });
        }
        if (this.f1217C.getCloseButton() != null) {
            xdl0.E0(this.f1217C.getCloseButton(), new View.OnClickListener() { // from class: l.ylh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28291a.m1666a5(view);
                }
            });
        }
        d4m d4mVar = this.f1217C;
        if (d4mVar != null) {
            d4mVar.getPreviewSurface().getHolder().addCallback(this);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final void m1677g5() {
        vkh0 vkh0Var = new vkh0(act());
        this.f1216B = vkh0Var;
        vkh0Var.mo12815b(this.f1204z);
        m1678h5();
    }

    /* JADX INFO: renamed from: h5 */
    public final void m1678h5() {
        this.f1218D.c();
        this.f1218D.a(duringCreated(this.f1216B.m25842o()).onBackpressureBuffer().observeOn(jo0.a()).doOnUnsubscribe(new d30() { // from class: l.zlh0
            public final void call() {
                this.f28815a.m1671b5();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.amh0
            public final void call(Object obj) {
                this.f8368a.m1672c5((vuh0) obj);
            }
        }, new e30() { // from class: l.bmh0
            public final void call(Object obj) {
                this.f8990a.m1673d5((Throwable) obj);
            }
        })));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (TTCameraConfig.TYPE_ID_CARD_HAND.equals(this.f1204z.m1630h())) {
            this.f1217C = new TTCameraHandIdCardView(layoutInflater.getContext());
        } else if (TTCameraConfig.TYPE_ID_CARD_AVATAR.equals(this.f1204z.m1630h())) {
            TTCameraAvatarAndEmblemView tTCameraAvatarAndEmblemView = new TTCameraAvatarAndEmblemView(layoutInflater.getContext());
            tTCameraAvatarAndEmblemView.m1773i0(true);
            this.f1217C = tTCameraAvatarAndEmblemView;
        } else {
            TTCameraAvatarAndEmblemView tTCameraAvatarAndEmblemView2 = new TTCameraAvatarAndEmblemView(layoutInflater.getContext());
            tTCameraAvatarAndEmblemView2.m1773i0(false);
            this.f1217C = tTCameraAvatarAndEmblemView2;
        }
        this.f1217C.setDescriptionText(this.f1204z.m1626d());
        return this.f1217C.mo1774p();
    }

    public void onDestroy() {
        this.f1218D.c();
        super.onDestroy();
        vkh0 vkh0Var = this.f1216B;
        if (vkh0Var != null) {
            vkh0Var.destroy();
        }
    }

    public void onStop() {
        this.f1216B.m25848u();
        super.onStop();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m1667i5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
