package com.p051p1.mobile.putong.live.base.webview;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.camera.TTCameraAct;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.upload.C4860b;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p051p1.mobile.putong.live.base.webview.LiveCameraBridgeImplementation;
import p153l.aqq;
import p153l.kcg0;
import p153l.lf2;
import p153l.lkq;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCameraBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public kcg0 f45677a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m70029c(aqq aqqVar, String str, String str2, C4860b.b bVar) {
        if (bVar.f17976a == 1) {
            aqqVar.mo99544d().mo97004b(str, bVar.f17978c);
        }
        if (bVar.f17976a == 2) {
            aqqVar.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m70030d(aqq aqqVar, String str, String str2, C4860b.b bVar) {
        if (bVar.f17976a == 1) {
            aqqVar.mo99544d().mo97004b(str, bVar.f17978c);
        }
        if (bVar.f17976a == 2) {
            aqqVar.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m70031e(aqq aqqVar, String str, String str2, C4860b.b bVar) {
        int i = bVar.f17976a;
        if (i == 1) {
            aqqVar.mo99544d().mo97004b(str, bVar.f17978c);
        } else if (i == 2) {
            aqqVar.mo99544d().mo97004b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m70032f(aqq aqqVar, String str, String str2, C4860b.b bVar) {
        if (bVar.f17976a == 1) {
            aqqVar.mo99544d().mo97004b(str, bVar.f17978c);
        }
        if (bVar.f17976a == 2) {
            aqqVar.mo99544d().mo97004b(str2, "1001");
        }
    }

    @lkq(key = "previewSpecialPhoto")
    public void previewSpecialPhoto(@NonNull final aqq aqqVar, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m30711n(str)) {
            aqqVar.mo99544d().mo97004b(str4, "2000");
        }
        psd0.m173633z(this.f45677a);
        this.f45677a = aqqVar.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.c3s
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m70029c(aqqVar, str3, str4, (C4860b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM30735a = TTCameraConfig.m30712p().m30739e(false).m30737c(true).m30741g(str).m30742h(true).m30738d(str5).m30736b(true).m30735a();
        aqqVar.mo99543c().startActivity(TTCameraPreviewAndUploadAct.m30768Z1(aqqVar.mo99543c(), tTCameraConfigM30735a, TTCameraPreviewConfig.m30774e().m30796f(str2).m30793c(tTCameraConfigM30735a).m30797g(false).m30791a()));
    }

    @lkq(key = "previewSpecialVideo")
    public void previewSpecialVideo(@NonNull final aqq aqqVar, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m30711n(str)) {
            aqqVar.mo99544d().mo97004b(str4, "2000");
        }
        psd0.m173633z(this.f45677a);
        this.f45677a = aqqVar.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.e3s
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m70031e(aqqVar, str3, str4, (C4860b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM30735a = TTCameraConfig.m30712p().m30739e(true).m30737c(true).m30742h(true).m30741g(str).m30740f(30).m30736b(true).m30738d(str5).m30735a();
        TTCameraPreviewAndUploadAct.m30769a2(aqqVar.mo99543c(), tTCameraConfigM30735a, TTCameraPreviewConfig.m30774e().m30796f(str2).m30799i().m30798h().m30793c(tTCameraConfigM30735a).m30797g(false).m30791a());
    }

    @lkq(key = "recordSpecialVideo")
    public void recordSpecialVideo(@NonNull final aqq aqqVar, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m30711n(str)) {
            aqqVar.mo99544d().mo97004b(str3, "2000");
        }
        psd0.m173633z(this.f45677a);
        this.f45677a = aqqVar.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.b3s
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m70032f(aqqVar, str2, str3, (C4860b.b) obj);
            }
        }));
        TTCameraAct.m30705b2(aqqVar.mo99543c(), TTCameraConfig.m30712p().m30739e(true).m30741g(str).m30740f(30).m30742h(true).m30737c(true).m30736b(true).m30738d(str4).m30735a());
    }

    @lkq(key = "takeSpecialPhoto")
    public void takeSpecialPhoto(@NonNull final aqq aqqVar, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m30711n(str)) {
            aqqVar.mo99544d().mo97004b(str3, "2000");
        }
        psd0.m173633z(this.f45677a);
        this.f45677a = aqqVar.mo99543c().duringCreated(C4860b.m30824a().m30825b()).subscribe(psd0.m173596G(new y20() { // from class: l.d3s
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m70030d(aqqVar, str2, str3, (C4860b.b) obj);
            }
        }));
        TTCameraAct.m30705b2(aqqVar.mo99543c(), TTCameraConfig.m30712p().m30739e(false).m30741g(str).m30737c(true).m30738d(str4).m30742h(true).m30736b(true).m30735a());
    }
}
