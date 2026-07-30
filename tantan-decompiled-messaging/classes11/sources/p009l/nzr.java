package p009l;

import android.text.TextUtils;
import com.immomo.cvcenter.interfaces.DetectorListener;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.Map;
import l.e30;
import l.f30;
import l.gkh0;
import l.gli;
import l.hfw;
import l.ivc0;
import l.j760;
import l.k9j;
import l.nw3;
import l.qib0;
import l.r600;
import l.rhi;
import l.swr;
import l.uvr;
import l.vkd0;
import l.vwb;
import l.w9j;
import l.z3g0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nzr {

    /* JADX INFO: renamed from: l.nzr$a */
    public class C1062a extends vkd0 {
        /* JADX INFO: renamed from: b */
        public String m19566b() {
            return qib0.b0.d.getMoMoVerificationAppId();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19552a(final z3g0 z3g0Var) {
        m19560i();
        if (nw3.e().h(16)) {
            m19565n(z3g0Var);
        } else {
            nw3.e().i(new DetectorListener.OnDetectorPreparedListener() { // from class: l.jzr
                /* JADX INFO: renamed from: a */
                public final void m17239a(Map map) {
                    nzr.m19555d(z3g0Var, map);
                }
            }, new int[]{16});
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m19554c(z3g0 z3g0Var, DownloadTask downloadTask) {
        z3g0Var.onError(new RuntimeException("canceled"));
        gkh0.j("[live]beauty_filter", "donyin cv  download cancel");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m19555d(z3g0 z3g0Var, Map map) {
        if (((Boolean) map.get(16)).booleanValue()) {
            m19565n(z3g0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ c m19556e(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        if (bLiveBeautyFilterConfig == null) {
            return c.error(new RuntimeException("beautyFilterConfig  is null"));
        }
        final String str = bLiveBeautyFilterConfig.byteCvModelUrl;
        return TextUtils.isEmpty(str) ? c.error(new RuntimeException("byteCvModelUrl is empty")) : c.create(new c.a() { // from class: l.izr
            public final void call(Object obj) {
                nzr.m19559h(bLiveBeautyFilterConfig, str, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m19557f(File file, z3g0 z3g0Var, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file2) {
        gkh0.j("[live]beauty_filter", "donyin cv download success");
        try {
            k9j.H(file);
            rhi.g(file2, file);
            rhi.m(file2.getAbsolutePath());
            swr.T(gli.l);
            m19564m(z3g0Var, true);
            gli.m.put(bLiveBeautyFilterConfig.byteCvModelZipMd5);
        } catch (Exception e) {
            CrashHelper.c(e);
            rhi.k(file);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m19558g(z3g0 z3g0Var, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        gkh0.j("[live]beauty_filter", "donyin cv  download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m19559h(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, String str, final z3g0 z3g0Var) {
        String str2 = gli.l;
        File file = new File(str2);
        String str3 = (String) gli.m.get();
        if (TextUtils.equals(str3, bLiveBeautyFilterConfig.byteCvModelZipMd5) && !TextUtils.isEmpty(str3) && file.exists()) {
            swr.T(str2);
            m19564m(z3g0Var, true);
            gkh0.j("[live]beauty_filter", "cv local has existed");
            return;
        }
        final File file2 = new File(gli.j);
        rhi.k(file2);
        try {
            SharePatchFileUtil.ensureDirectory(file2);
            C0513a.m9975u().m9986o(new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(str).m9960n(new File(gli.k)).m9956j(new f30() { // from class: l.kzr
                public final void call(Object obj, Object obj2) {
                    nzr.m19557f(file2, z3g0Var, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m9952f(new f30() { // from class: l.lzr
                public final void call(Object obj, Object obj2) {
                    nzr.m19558g(z3g0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m9950d(new e30() { // from class: l.mzr
                public final void call(Object obj) {
                    nzr.m19554c(z3g0Var, (DownloadTask) obj);
                }
            }).m9947a());
            gkh0.j("[live]beauty_filter", "donyin cv download start");
        } catch (RuntimeException e) {
            gkh0.j("[live]beauty_filter", "cv ensure dir error " + e.getMessage());
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m19560i() {
        if (ivc0.g == null) {
            ivc0.d(ypv.f23200e, new C1062a());
        }
    }

    /* JADX INFO: renamed from: j */
    public static c<s7e> m19561j() {
        hfw.a("live_sdk", "start load cv res");
        return uvr.d().F1() ? m19562k() : m19563l();
    }

    /* JADX INFO: renamed from: k */
    public static c<s7e> m19562k() {
        return c.create(new c.a() { // from class: l.fzr
            public final void call(Object obj) {
                nzr.m19552a((z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static c<s7e> m19563l() {
        return ypv.f23198c.k().filter(new w9j() { // from class: l.gzr
            public final Object call(Object obj) {
                BLiveBeautyFilterConfig bLiveBeautyFilterConfig = (BLiveBeautyFilterConfig) obj;
                return Boolean.valueOf((TextUtils.isEmpty(bLiveBeautyFilterConfig.byteCvModelZipMd5) || TextUtils.isEmpty(bLiveBeautyFilterConfig.byteCvModelUrl)) ? false : true);
            }
        }).take(1).flatMap(new w9j() { // from class: l.hzr
            public final Object call(Object obj) {
                return nzr.m19556e((BLiveBeautyFilterConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m19564m(z3g0<? super s7e> z3g0Var, boolean z) {
        hfw.a("live_sdk", "load cv res finished. result" + z);
        zvf0.B("e_cv_download", "", new j760[]{vwb.Y("download_status", Boolean.valueOf(z)), vwb.Y("switch_status", Boolean.valueOf(qib0.b0.b.isHttpDnsOpen()))});
        if (z) {
            z3g0Var.onNext(s7e.INSTANCE);
            z3g0Var.onCompleted();
        } else {
            Exception exc = new Exception("cv resource download fail");
            CrashHelper.c(exc);
            z3g0Var.onError(exc);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m19565n(z3g0 z3g0Var) {
        File fileC = r600.b().c("mmcv_android_fa_model");
        File fileC2 = r600.b().c("mmcv_android_222_big_fd_model");
        if (fileC == null || !fileC.exists() || fileC2 == null || !fileC2.exists()) {
            return;
        }
        swr.U(fileC2.getAbsolutePath(), fileC.getAbsolutePath());
        m19564m(z3g0Var, true);
    }
}
