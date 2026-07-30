package com.p046p1.mobile.putong.live.base.webview;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.camera.TTCameraAct;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.upload.C4709b;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewConfig;
import com.p046p1.mobile.putong.live.base.webview.LiveCameraBridgeImplementation;
import p149l.boq;
import p149l.c4g0;
import p149l.e30;
import p149l.ef2;
import p149l.liq;
import p149l.mkd0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCameraBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public c4g0 f44829a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m68846c(boq boqVar, String str, String str2, C4709b.b bVar) {
        if (bVar.f17257a == 1) {
            boqVar.mo102962d().mo127285b(str, bVar.f17259c);
        }
        if (bVar.f17257a == 2) {
            boqVar.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m68847d(boq boqVar, String str, String str2, C4709b.b bVar) {
        if (bVar.f17257a == 1) {
            boqVar.mo102962d().mo127285b(str, bVar.f17259c);
        }
        if (bVar.f17257a == 2) {
            boqVar.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m68848e(boq boqVar, String str, String str2, C4709b.b bVar) {
        int i = bVar.f17257a;
        if (i == 1) {
            boqVar.mo102962d().mo127285b(str, bVar.f17259c);
        } else if (i == 2) {
            boqVar.mo102962d().mo127285b(str2, "1001");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m68849f(boq boqVar, String str, String str2, C4709b.b bVar) {
        if (bVar.f17257a == 1) {
            boqVar.mo102962d().mo127285b(str, bVar.f17259c);
        }
        if (bVar.f17257a == 2) {
            boqVar.mo102962d().mo127285b(str2, "1001");
        }
    }

    @liq(key = "previewSpecialPhoto")
    public void previewSpecialPhoto(@NonNull final boq boqVar, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m29713n(str)) {
            boqVar.mo102962d().mo127285b(str4, "2000");
        }
        mkd0.m154992z(this.f44829a);
        this.f44829a = boqVar.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.b1s
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m68846c(boqVar, str3, str4, (C4709b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM29737a = TTCameraConfig.m29714p().m29741e(false).m29739c(true).m29743g(str).m29744h(true).m29740d(str5).m29738b(true).m29737a();
        boqVar.mo102961c().startActivity(TTCameraPreviewAndUploadAct.m29770Y1(boqVar.mo102961c(), tTCameraConfigM29737a, TTCameraPreviewConfig.m29776e().m29798f(str2).m29795c(tTCameraConfigM29737a).m29799g(false).m29793a()));
    }

    @liq(key = "previewSpecialVideo")
    public void previewSpecialVideo(@NonNull final boq boqVar, String str, String str2, final String str3, final String str4, String str5) {
        if (!TTCameraConfig.m29713n(str)) {
            boqVar.mo102962d().mo127285b(str4, "2000");
        }
        mkd0.m154992z(this.f44829a);
        this.f44829a = boqVar.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.d1s
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m68848e(boqVar, str3, str4, (C4709b.b) obj);
            }
        }));
        TTCameraConfig tTCameraConfigM29737a = TTCameraConfig.m29714p().m29741e(true).m29739c(true).m29744h(true).m29743g(str).m29742f(30).m29738b(true).m29740d(str5).m29737a();
        TTCameraPreviewAndUploadAct.m29771Z1(boqVar.mo102961c(), tTCameraConfigM29737a, TTCameraPreviewConfig.m29776e().m29798f(str2).m29801i().m29800h().m29795c(tTCameraConfigM29737a).m29799g(false).m29793a());
    }

    @liq(key = "recordSpecialVideo")
    public void recordSpecialVideo(@NonNull final boq boqVar, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m29713n(str)) {
            boqVar.mo102962d().mo127285b(str3, "2000");
        }
        mkd0.m154992z(this.f44829a);
        this.f44829a = boqVar.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.a1s
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m68849f(boqVar, str2, str3, (C4709b.b) obj);
            }
        }));
        TTCameraAct.m29707a2(boqVar.mo102961c(), TTCameraConfig.m29714p().m29741e(true).m29743g(str).m29742f(30).m29744h(true).m29739c(true).m29738b(true).m29740d(str4).m29737a());
    }

    @liq(key = "takeSpecialPhoto")
    public void takeSpecialPhoto(@NonNull final boq boqVar, String str, final String str2, final String str3, String str4) {
        if (!TTCameraConfig.m29713n(str)) {
            boqVar.mo102962d().mo127285b(str3, "2000");
        }
        mkd0.m154992z(this.f44829a);
        this.f44829a = boqVar.mo102961c().duringCreated(C4709b.m29826a().m29827b()).subscribe(mkd0.m154955G(new e30() { // from class: l.c1s
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveCameraBridgeImplementation.m68847d(boqVar, str2, str3, (C4709b.b) obj);
            }
        }));
        TTCameraAct.m29707a2(boqVar.mo102961c(), TTCameraConfig.m29714p().m29741e(false).m29743g(str).m29739c(true).m29740d(str4).m29744h(true).m29738b(true).m29737a());
    }
}
