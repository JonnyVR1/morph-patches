package p149l;

import android.text.TextUtils;
import com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class nzr {

    /* JADX INFO: renamed from: l.nzr$a */
    public class C18806a extends vkd0 {
        @Override // p149l.vkd0
        /* JADX INFO: renamed from: b */
        public String mo161783b() {
            return qib0.f154713b0.f139233d.getMoMoVerificationAppId();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m162084a(final z3g0 z3g0Var) {
        m162092i();
        if (nw3.m161776e().m161780h(16)) {
            m162097n(z3g0Var);
        } else {
            nw3.m161776e().m161781i(new DetectorListener$OnDetectorPreparedListener() { // from class: l.jzr
                @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
                /* JADX INFO: renamed from: a */
                public final void mo18293a(Map map) {
                    nzr.m162087d(z3g0Var, map);
                }
            }, 16);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m162086c(z3g0 z3g0Var, DownloadTask downloadTask) {
        z3g0Var.onError(new RuntimeException("canceled"));
        gkh0.m126627j("[live]beauty_filter", "donyin cv  download cancel");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m162087d(z3g0 z3g0Var, Map map) {
        if (((Boolean) map.get(16)).booleanValue()) {
            m162097n(z3g0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m162088e(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        if (bLiveBeautyFilterConfig == null) {
            return C22306c.error(new RuntimeException("beautyFilterConfig  is null"));
        }
        final String str = bLiveBeautyFilterConfig.byteCvModelUrl;
        return TextUtils.isEmpty(str) ? C22306c.error(new RuntimeException("byteCvModelUrl is empty")) : C22306c.create(new C22306c.a() { // from class: l.izr
            @Override // p149l.e30
            public final void call(Object obj) {
                nzr.m162091h(bLiveBeautyFilterConfig, str, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m162089f(File file, z3g0 z3g0Var, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file2) {
        gkh0.m126627j("[live]beauty_filter", "donyin cv download success");
        try {
            k9j.m145076H(file);
            rhi.m179363g(file2, file);
            rhi.m179369m(file2.getAbsolutePath());
            swr.m186344T(gli.f103332l);
            m162096m(z3g0Var, true);
            gli.f103333m.put(bLiveBeautyFilterConfig.byteCvModelZipMd5);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            rhi.m179367k(file);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m162090g(z3g0 z3g0Var, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        gkh0.m126627j("[live]beauty_filter", "donyin cv  download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m162091h(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, String str, final z3g0 z3g0Var) {
        String str2 = gli.f103332l;
        File file = new File(str2);
        String str3 = gli.f103333m.get();
        if (TextUtils.equals(str3, bLiveBeautyFilterConfig.byteCvModelZipMd5) && !TextUtils.isEmpty(str3) && file.exists()) {
            swr.m186344T(str2);
            m162096m(z3g0Var, true);
            gkh0.m126627j("[live]beauty_filter", "cv local has existed");
            return;
        }
        final File file2 = new File(gli.f103330j);
        rhi.m179367k(file2);
        try {
            SharePatchFileUtil.ensureDirectory(file2);
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79639n(new File(gli.f103331k)).m79635j(new f30() { // from class: l.kzr
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    nzr.m162089f(file2, z3g0Var, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.lzr
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    nzr.m162090g(z3g0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79629d(new e30() { // from class: l.mzr
                @Override // p149l.e30
                public final void call(Object obj) {
                    nzr.m162086c(z3g0Var, (DownloadTask) obj);
                }
            }).m79626a());
            gkh0.m126627j("[live]beauty_filter", "donyin cv download start");
        } catch (RuntimeException e) {
            gkh0.m126627j("[live]beauty_filter", "cv ensure dir error " + e.getMessage());
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m162092i() {
        if (ivc0.f115118g == null) {
            ivc0.m138543d(ypv.f199497e, new C18806a());
        }
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<s7e> m162093j() {
        hfw.m130790a("live_sdk", "start load cv res");
        return uvr.m196087d().m162668F1() ? m162094k() : m162095l();
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<s7e> m162094k() {
        return C22306c.create(new C22306c.a() { // from class: l.fzr
            @Override // p149l.e30
            public final void call(Object obj) {
                nzr.m162084a((z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<s7e> m162095l() {
        return ypv.f199495c.m121230k().filter(new w9j() { // from class: l.gzr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveBeautyFilterConfig bLiveBeautyFilterConfig = (BLiveBeautyFilterConfig) obj;
                return Boolean.valueOf((TextUtils.isEmpty(bLiveBeautyFilterConfig.byteCvModelZipMd5) || TextUtils.isEmpty(bLiveBeautyFilterConfig.byteCvModelUrl)) ? false : true);
            }
        }).take(1).flatMap(new w9j() { // from class: l.hzr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nzr.m162088e((BLiveBeautyFilterConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m162096m(z3g0<? super s7e> z3g0Var, boolean z) {
        hfw.m130790a("live_sdk", "load cv res finished. result" + z);
        zvf0.m220369B("e_cv_download", "", vwb.m200311Y("download_status", Boolean.valueOf(z)), vwb.m200311Y("switch_status", Boolean.valueOf(qib0.f154713b0.f139231b.isHttpDnsOpen())));
        if (z) {
            z3g0Var.m132487l(s7e.INSTANCE);
            z3g0Var.onCompleted();
        } else {
            Exception exc = new Exception("cv resource download fail");
            CrashHelper.m81296c(exc);
            z3g0Var.onError(exc);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m162097n(z3g0 z3g0Var) {
        File fileM177963c = r600.m177960b().m177963c("mmcv_android_fa_model");
        File fileM177963c2 = r600.m177960b().m177963c("mmcv_android_222_big_fd_model");
        if (fileM177963c == null || !fileM177963c.exists() || fileM177963c2 == null || !fileM177963c2.exists()) {
            return;
        }
        swr.m186345U(fileM177963c2.getAbsolutePath(), fileM177963c.getAbsolutePath());
        m162096m(z3g0Var, true);
    }
}
