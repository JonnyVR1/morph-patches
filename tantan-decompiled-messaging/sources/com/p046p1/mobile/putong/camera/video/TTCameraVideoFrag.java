package com.p046p1.mobile.putong.camera.video;

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
import com.p046p1.mobile.putong.camera.widget.TTCameraRecordView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.blh0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.e4m;
import p149l.i4m;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.tnh0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraVideoFrag extends TTCameraBaseFrag implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B */
    public e4m f17260B;

    /* JADX INFO: renamed from: C */
    public i4m f17261C;

    /* JADX INFO: renamed from: D */
    public c4g0 f17262D;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m29840Y4(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m29841Z4(View view) {
        if (this.f17261C.mo102535h()) {
            m29854k5(true);
        } else {
            m29845j5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m29842a5(View view) {
        m29846l5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public void m29843g5(Throwable th) {
        CrashHelper.m81296c(th);
        lsi0.m151578h(R$string.f17212e);
        this.f17260B.mo29884p().post(new Runnable() { // from class: l.snh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165457a.m29848b5();
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    private void m29844i5() {
        this.f17261C.mo102533d(this.f17260B.getPreviewSurface(), new d30() { // from class: l.jnh0
            @Override // p149l.d30
            public final void call() {
                this.f118854a.m29853h5();
            }
        }, new e30() { // from class: l.knh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123890a.m29843g5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    private void m29845j5() {
        this.f17260B.mo29880a(this.f17215z.m29719g());
        this.f17261C.mo102530a(this.f17260B.getPreviewSurface());
        mkd0.m154992z(this.f17262D);
        if (this.f17215z.m29719g() > 0) {
            this.f17262D = duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).take((int) this.f17215z.m29719g())).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154957I(new e30() { // from class: l.pnh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150396a.m29850d5((Long) obj);
                }
            }, new e30() { // from class: l.qnh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155476a.m29851e5((Throwable) obj);
                }
            }, new d30() { // from class: l.rnh0
                @Override // p149l.d30
                public final void call() {
                    this.f160269a.m29852f5();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l5 */
    private void m29846l5() {
        m29854k5(false);
        this.f17261C.destroy();
        TTCameraConfig tTCameraConfig = this.f17215z;
        tTCameraConfig.m29733y(!tTCameraConfig.m29723l());
        i4m i4mVarM29847X4 = m29847X4();
        this.f17261C = i4mVarM29847X4;
        i4mVarM29847X4.mo102531b(this.f17215z);
        m29844i5();
    }

    /* JADX INFO: renamed from: X4 */
    public final i4m m29847X4() {
        return this.f17215z.m29724m() ? new blh0(act()) : new tnh0(act());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m29848b5() {
        this.f17260B.mo29881b(false);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m29849c5() {
        this.f17260B.mo29881b(true);
    }

    @Override // com.p046p1.mobile.putong.camera.TTCameraBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        i4m i4mVarM29847X4 = m29847X4();
        this.f17261C = i4mVarM29847X4;
        i4mVarM29847X4.mo102531b(this.f17215z);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m29850d5(Long l2) {
        this.f17260B.mo29883d(l2.longValue() + 1, this.f17215z.m29719g());
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m29851e5(Throwable th) {
        m29854k5(false);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m29852f5() {
        m29854k5(true);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        xdl0.m208329E0(this.f17260B.getCloseButton(), new View.OnClickListener() { // from class: l.lnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128993a.m29840Y4(view);
            }
        });
        xdl0.m208329E0(this.f17260B.getRecordButton(), new View.OnClickListener() { // from class: l.mnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134753a.m29841Z4(view);
            }
        });
        if (this.f17260B.getSwitchCameraButton() != null) {
            xdl0.m208329E0(this.f17260B.getSwitchCameraButton(), new View.OnClickListener() { // from class: l.nnh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139730a.m29842a5(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m29853h5() {
        this.f17260B.mo29884p().post(new Runnable() { // from class: l.onh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144787a.m29849c5();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TTCameraRecordView tTCameraRecordView = new TTCameraRecordView(layoutInflater.getContext());
        this.f17260B = tTCameraRecordView;
        tTCameraRecordView.getPreviewSurface().getHolder().addCallback(this);
        tTCameraRecordView.setDescriptionText(this.f17215z.m29716d());
        return this.f17260B.mo29884p();
    }

    /* JADX INFO: renamed from: k5 */
    public final void m29854k5(boolean z) {
        mkd0.m154992z(this.f17262D);
        this.f17261C.m102540p();
        this.f17260B.mo29882c();
        if (z) {
            if (this.f17215z.m29721i()) {
                act().startActivity(TTCameraPreviewAndUploadAct.m29770Y1(act(), this.f17215z, TTCameraPreviewConfig.m29776e().m29794b(this.f17261C.mo102532c()).m29796d(true).m29795c(this.f17215z).m29793a()));
            }
            act().lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f17261C.destroy();
        this.f17260B.release();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m29854k5(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m29844i5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
