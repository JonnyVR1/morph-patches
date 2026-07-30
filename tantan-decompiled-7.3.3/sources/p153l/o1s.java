package p153l;

import android.text.TextUtils;
import com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class o1s {

    /* JADX INFO: renamed from: l.o1s$a */
    public class C19011a extends ysd0 {
        @Override // p153l.ysd0
        /* JADX INFO: renamed from: b */
        public String mo160634b() {
            return uqb0.f180396b0.f170327d.getMoMoVerificationAppId();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m165669a(final gcg0 gcg0Var) {
        m165677i();
        if (mx3.m160626e().m160630h(16)) {
            m165682n(gcg0Var);
        } else {
            mx3.m160626e().m160631i(new DetectorListener$OnDetectorPreparedListener() { // from class: l.k1s
                @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
                /* JADX INFO: renamed from: a */
                public final void mo19370a(Map map) {
                    o1s.m165672d(gcg0Var, map);
                }
            }, 16);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m165671c(gcg0 gcg0Var, DownloadTask downloadTask) {
        gcg0Var.onError(new RuntimeException("canceled"));
        nsh0.m164608j("[live]beauty_filter", "donyin cv  download cancel");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m165672d(gcg0 gcg0Var, Map map) {
        if (((Boolean) map.get(16)).booleanValue()) {
            m165682n(gcg0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22421c m165673e(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        if (bLiveBeautyFilterConfig == null) {
            return C22421c.error(new RuntimeException("beautyFilterConfig  is null"));
        }
        final String str = bLiveBeautyFilterConfig.byteCvModelUrl;
        return TextUtils.isEmpty(str) ? C22421c.error(new RuntimeException("byteCvModelUrl is empty")) : C22421c.create(new C22421c.a() { // from class: l.j1s
            @Override // p153l.y20
            public final void call(Object obj) {
                o1s.m165676h(bLiveBeautyFilterConfig, str, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m165674f(File file, gcg0 gcg0Var, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file2) {
        nsh0.m164608j("[live]beauty_filter", "donyin cv download success");
        try {
            ecj.m120374H(file);
            oki.m168019g(file2, file);
            oki.m168025m(file2.getAbsolutePath());
            tyr.m193609T(coi.f82883l);
            m165681m(gcg0Var, true);
            coi.f82884m.put(bLiveBeautyFilterConfig.byteCvModelZipMd5);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            oki.m168023k(file);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m165675g(gcg0 gcg0Var, DownloadTask downloadTask, Throwable th) {
        gcg0Var.onError(th);
        nsh0.m164608j("[live]beauty_filter", "donyin cv  download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m165676h(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, String str, final gcg0 gcg0Var) {
        String str2 = coi.f82883l;
        File file = new File(str2);
        String str3 = coi.f82884m.get();
        if (TextUtils.equals(str3, bLiveBeautyFilterConfig.byteCvModelZipMd5) && !TextUtils.isEmpty(str3) && file.exists()) {
            tyr.m193609T(str2);
            m165681m(gcg0Var, true);
            nsh0.m164608j("[live]beauty_filter", "cv local has existed");
            return;
        }
        final File file2 = new File(coi.f82881j);
        oki.m168023k(file2);
        try {
            SharePatchFileUtil.ensureDirectory(file2);
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80822n(new File(coi.f82882k)).m80818j(new z20() { // from class: l.l1s
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    o1s.m165674f(file2, gcg0Var, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.m1s
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    o1s.m165675g(gcg0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80812d(new y20() { // from class: l.n1s
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1s.m165671c(gcg0Var, (DownloadTask) obj);
                }
            }).m80809a());
            nsh0.m164608j("[live]beauty_filter", "donyin cv download start");
        } catch (RuntimeException e) {
            nsh0.m164608j("[live]beauty_filter", "cv ensure dir error " + e.getMessage());
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m165677i() {
        if (l3d0.f129865g == null) {
            l3d0.m152690d(zrv.f205803e, new C19011a());
        }
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<h9e> m165678j() {
        fhw.m125605a("live_sdk", "start load cv res");
        return vxr.m203876d().m170975F1() ? m165679k() : m165680l();
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<h9e> m165679k() {
        return C22421c.create(new C22421c.a() { // from class: l.g1s
            @Override // p153l.y20
            public final void call(Object obj) {
                o1s.m165669a((gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<h9e> m165680l() {
        return zrv.f205801c.m159274k().filter(new qcj() { // from class: l.h1s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveBeautyFilterConfig bLiveBeautyFilterConfig = (BLiveBeautyFilterConfig) obj;
                return Boolean.valueOf((TextUtils.isEmpty(bLiveBeautyFilterConfig.byteCvModelZipMd5) || TextUtils.isEmpty(bLiveBeautyFilterConfig.byteCvModelUrl)) ? false : true);
            }
        }).take(1).flatMap(new qcj() { // from class: l.i1s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o1s.m165673e((BLiveBeautyFilterConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m165681m(gcg0<? super h9e> gcg0Var, boolean z) {
        fhw.m125605a("live_sdk", "load cv res finished. result" + z);
        i4g0.m138493B("e_cv_download", "", jyb.m147494Y("download_status", Boolean.valueOf(z)), jyb.m147494Y("switch_status", Boolean.valueOf(uqb0.f180396b0.f170325b.isHttpDnsOpen())));
        if (z) {
            gcg0Var.m137019l(h9e.INSTANCE);
            gcg0Var.onCompleted();
        } else {
            Exception exc = new Exception("cv resource download fail");
            CrashHelper.m82479c(exc);
            gcg0Var.onError(exc);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m165682n(gcg0 gcg0Var) {
        File fileM97270c = af00.m97267b().m97270c("mmcv_android_fa_model");
        File fileM97270c2 = af00.m97267b().m97270c("mmcv_android_222_big_fd_model");
        if (fileM97270c == null || !fileM97270c.exists() || fileM97270c2 == null || !fileM97270c2.exists()) {
            return;
        }
        tyr.m193610U(fileM97270c2.getAbsolutePath(), fileM97270c.getAbsolutePath());
        m165681m(gcg0Var, true);
    }
}
