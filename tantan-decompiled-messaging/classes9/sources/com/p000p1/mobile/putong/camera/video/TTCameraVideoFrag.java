package com.p000p1.mobile.putong.camera.video;

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
import com.p000p1.mobile.putong.camera.widget.TTCameraRecordView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.xdl0;
import p006l.blh0;
import p006l.e4m;
import p006l.i4m;
import p006l.tnh0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraVideoFrag extends TTCameraBaseFrag implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: B */
    public e4m f1249B;

    /* JADX INFO: renamed from: C */
    public i4m f1250C;

    /* JADX INFO: renamed from: D */
    public c4g0 f1251D;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m1751Y4(View view) {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m1752Z4(View view) {
        if (this.f1250C.mo12819h()) {
            m1766k5(true);
        } else {
            m1756j5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m1753a5(View view) {
        m1757l5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public void m1754g5(Throwable th) {
        CrashHelper.c(th);
        lsi0.h(R$string.f1201e);
        this.f1249B.mo1796p().post(new Runnable() { // from class: l.snh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21445a.m1759b5();
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    private void m1755i5() {
        this.f1250C.mo12817d(this.f1249B.getPreviewSurface(), new d30() { // from class: l.jnh0
            public final void call() {
                this.f15288a.m1765h5();
            }
        }, new e30() { // from class: l.knh0
            public final void call(Object obj) {
                this.f15916a.m1754g5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    private void m1756j5() {
        this.f1249B.mo1792a(this.f1204z.m1629g());
        this.f1250C.mo12814a(this.f1249B.getPreviewSurface());
        mkd0.z(this.f1251D);
        if (this.f1204z.m1629g() > 0) {
            this.f1251D = duringCreated(c.interval(1L, TimeUnit.SECONDS).take((int) this.f1204z.m1629g())).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.I(new e30() { // from class: l.pnh0
                public final void call(Object obj) {
                    this.f19227a.m1761d5((Long) obj);
                }
            }, new e30() { // from class: l.qnh0
                public final void call(Object obj) {
                    this.f19944a.m1762e5((Throwable) obj);
                }
            }, new d30() { // from class: l.rnh0
                public final void call() {
                    this.f20644a.m1763f5();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l5 */
    private void m1757l5() {
        m1766k5(false);
        this.f1250C.destroy();
        TTCameraConfig tTCameraConfig = this.f1204z;
        tTCameraConfig.m1643y(!tTCameraConfig.m1633l());
        i4m i4mVarM1758X4 = m1758X4();
        this.f1250C = i4mVarM1758X4;
        i4mVarM1758X4.mo12815b(this.f1204z);
        m1755i5();
    }

    /* JADX INFO: renamed from: X4 */
    public final i4m m1758X4() {
        return this.f1204z.m1634m() ? new blh0(act()) : new tnh0(act());
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m1759b5() {
        this.f1249B.mo1793b(false);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m1760c5() {
        this.f1249B.mo1793b(true);
    }

    @Override // com.p000p1.mobile.putong.camera.TTCameraBaseFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        i4m i4mVarM1758X4 = m1758X4();
        this.f1250C = i4mVarM1758X4;
        i4mVarM1758X4.mo12815b(this.f1204z);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m1761d5(Long l2) {
        this.f1249B.mo1795d(l2.longValue() + 1, this.f1204z.m1629g());
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m1762e5(Throwable th) {
        m1766k5(false);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m1763f5() {
        m1766k5(true);
    }

    /* JADX INFO: renamed from: g4 */
    public void m1764g4(Bundle bundle) {
        super.g4(bundle);
        xdl0.E0(this.f1249B.getCloseButton(), new View.OnClickListener() { // from class: l.lnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16532a.m1751Y4(view);
            }
        });
        xdl0.E0(this.f1249B.getRecordButton(), new View.OnClickListener() { // from class: l.mnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17127a.m1752Z4(view);
            }
        });
        if (this.f1249B.getSwitchCameraButton() != null) {
            xdl0.E0(this.f1249B.getSwitchCameraButton(), new View.OnClickListener() { // from class: l.nnh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17756a.m1753a5(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m1765h5() {
        this.f1249B.mo1796p().post(new Runnable() { // from class: l.onh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18294a.m1760c5();
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TTCameraRecordView tTCameraRecordView = new TTCameraRecordView(layoutInflater.getContext());
        this.f1249B = tTCameraRecordView;
        tTCameraRecordView.getPreviewSurface().getHolder().addCallback(this);
        tTCameraRecordView.setDescriptionText(this.f1204z.m1626d());
        return this.f1249B.mo1796p();
    }

    /* JADX INFO: renamed from: k5 */
    public final void m1766k5(boolean z) {
        mkd0.z(this.f1251D);
        this.f1250C.m12824p();
        this.f1249B.mo1794c();
        if (z) {
            if (this.f1204z.m1631i()) {
                act().startActivity(TTCameraPreviewAndUploadAct.m1681Y1(act(), this.f1204z, TTCameraPreviewConfig.m1687e().m1705b(this.f1250C.mo12816c()).m1707d(true).m1706c(this.f1204z).m1704a()));
            }
            act().finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1250C.destroy();
        this.f1249B.release();
    }

    public void onStop() {
        super.onStop();
        m1766k5(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        m1755i5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
