package com.p051p1.mobile.putong.camera.video;

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
import com.p051p1.mobile.putong.camera.widget.TTCameraRecordView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.awh0;
import p153l.bnl0;
import p153l.fo0;
import p153l.ith0;
import p153l.kcg0;
import p153l.o1j0;
import p153l.psd0;
import p153l.u6m;
import p153l.x20;
import p153l.y20;
import p153l.y6m;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraVideoFrag extends TTCameraBaseFrag implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B */
    public u6m f17979B;

    /* JADX INFO: renamed from: C */
    public y6m f17980C;

    /* JADX INFO: renamed from: D */
    public kcg0 f17981D;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m30838Y4(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m30839Z4(View view) {
        if (this.f17980C.mo100643h()) {
            m30852k5(true);
        } else {
            m30843j5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m30840a5(View view) {
        m30844l5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public void m30841g5(Throwable th) {
        CrashHelper.m82479c(th);
        o1j0.m165634h(R$string.f17931e);
        this.f17979B.mo30882q().post(new Runnable() { // from class: l.zvh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f206221a.m30846b5();
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    private void m30842i5() {
        this.f17980C.mo100640d(this.f17979B.getPreviewSurface(), new x20() { // from class: l.qvh0
            @Override // p153l.x20
            public final void call() {
                this.f159759a.m30851h5();
            }
        }, new y20() { // from class: l.rvh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165017a.m30841g5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    private void m30843j5() {
        this.f17979B.mo30878a(this.f17934z.m30717g());
        this.f17980C.mo100637a(this.f17979B.getPreviewSurface());
        psd0.m173633z(this.f17981D);
        if (this.f17934z.m30717g() > 0) {
            this.f17981D = duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).take((int) this.f17934z.m30717g())).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173598I(new y20() { // from class: l.wvh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190968a.m30848d5((Long) obj);
                }
            }, new y20() { // from class: l.xvh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196401a.m30849e5((Throwable) obj);
                }
            }, new x20() { // from class: l.yvh0
                @Override // p153l.x20
                public final void call() {
                    this.f201721a.m30850f5();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l5 */
    private void m30844l5() {
        m30852k5(false);
        this.f17980C.destroy();
        TTCameraConfig tTCameraConfig = this.f17934z;
        tTCameraConfig.m30731y(!tTCameraConfig.m30721l());
        y6m y6mVarM30845X4 = m30845X4();
        this.f17980C = y6mVarM30845X4;
        y6mVarM30845X4.mo100638b(this.f17934z);
        m30842i5();
    }

    /* JADX INFO: renamed from: X4 */
    public final y6m m30845X4() {
        return this.f17934z.m30722m() ? new ith0(act()) : new awh0(act());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m30846b5() {
        this.f17979B.mo30879b(false);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m30847c5() {
        this.f17979B.mo30879b(true);
    }

    @Override // com.p051p1.mobile.putong.camera.TTCameraBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        y6m y6mVarM30845X4 = m30845X4();
        this.f17980C = y6mVarM30845X4;
        y6mVarM30845X4.mo100638b(this.f17934z);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m30848d5(Long l2) {
        this.f17979B.mo30881d(l2.longValue() + 1, this.f17934z.m30717g());
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m30849e5(Throwable th) {
        m30852k5(false);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m30850f5() {
        m30852k5(true);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        bnl0.m105509E0(this.f17979B.getCloseButton(), new View.OnClickListener() { // from class: l.svh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170842a.m30838Y4(view);
            }
        });
        bnl0.m105509E0(this.f17979B.getRecordButton(), new View.OnClickListener() { // from class: l.tvh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176264a.m30839Z4(view);
            }
        });
        if (this.f17979B.getSwitchCameraButton() != null) {
            bnl0.m105509E0(this.f17979B.getSwitchCameraButton(), new View.OnClickListener() { // from class: l.uvh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181141a.m30840a5(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m30851h5() {
        this.f17979B.mo30882q().post(new Runnable() { // from class: l.vvh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185932a.m30847c5();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TTCameraRecordView tTCameraRecordView = new TTCameraRecordView(layoutInflater.getContext());
        this.f17979B = tTCameraRecordView;
        tTCameraRecordView.getPreviewSurface().getHolder().addCallback(this);
        tTCameraRecordView.setDescriptionText(this.f17934z.m30714d());
        return this.f17979B.mo30882q();
    }

    /* JADX INFO: renamed from: k5 */
    public final void m30852k5(boolean z) {
        psd0.m173633z(this.f17981D);
        this.f17980C.m142049p();
        this.f17979B.mo30880c();
        if (z) {
            if (this.f17934z.m30719i()) {
                act().startActivity(TTCameraPreviewAndUploadAct.m30768Z1(act(), this.f17934z, TTCameraPreviewConfig.m30774e().m30792b(this.f17980C.mo100639c()).m30794d(true).m30793c(this.f17934z).m30791a()));
            }
            act().lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f17980C.destroy();
        this.f17979B.release();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m30852k5(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m30842i5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
