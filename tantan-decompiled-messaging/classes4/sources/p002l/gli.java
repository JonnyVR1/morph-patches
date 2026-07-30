package p002l;

import android.app.Application;
import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants;
import com.momo.mcamera.filtermanager.MMFilter;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.f30;
import l.gkh0;
import l.hfw;
import l.hgt;
import l.k9j;
import l.kt6;
import l.ogw;
import l.qib0;
import l.rhi;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.uvr;
import l.vwb;
import l.x9j;
import l.ypv;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gli {

    /* JADX INFO: renamed from: a */
    public static final String f11495a;

    /* JADX INFO: renamed from: b */
    public static final String f11496b;

    /* JADX INFO: renamed from: c */
    public static final String f11497c;

    /* JADX INFO: renamed from: d */
    public static final String f11498d;

    /* JADX INFO: renamed from: e */
    public static final String f11499e;

    /* JADX INFO: renamed from: f */
    public static final String f11500f;

    /* JADX INFO: renamed from: g */
    public static final tpd0 f11501g;

    /* JADX INFO: renamed from: h */
    public static final uqd0 f11502h;

    /* JADX INFO: renamed from: i */
    public static final uqd0 f11503i;

    /* JADX INFO: renamed from: j */
    public static final String f11504j;

    /* JADX INFO: renamed from: k */
    public static final String f11505k;

    /* JADX INFO: renamed from: l */
    public static final String f11506l;

    /* JADX INFO: renamed from: m */
    public static final uqd0 f11507m;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(App.e.getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("live_camera_filter");
        String string = sb.toString();
        f11495a = string;
        f11496b = string + str + "filters.zip";
        String str2 = string + str + "filters";
        f11497c = str2;
        f11498d = str2 + str + "douyinResource";
        f11499e = str2 + str + "momoResource";
        f11500f = string + str + "lic";
        f11501g = new tpd0("live_camera_filter_version", -1);
        f11502h = new uqd0("live_camera_filter_type", "");
        f11503i = new uqd0("live_momo_lic_md5", "");
        String str3 = string + str + "cvModel";
        f11504j = str3;
        f11505k = string + str + "mmcv_android_byte_model.zip";
        f11506l = str3 + str + "mmcv_android_byte_model";
        f11507m = new uqd0("mmcv_android_byte_model_md5", "");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13879b(String str, String str2, z3g0 z3g0Var, File file, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file2) {
        bki.m10416b(str, true);
        if (!str2.equalsIgnoreCase(ogw.d(file2))) {
            z3g0Var.onError(new Throwable("error:file md5 not equal to json's zipMd5"));
            bki.m10418d(str, false);
            return;
        }
        bki.m10418d(str, true);
        try {
            k9j.H(file);
            rhi.g(file2, file);
            rhi.m(file2.getAbsolutePath());
            hfw.a("[live]beauty_filter", "unzip success");
            bki.m10419e(str, true);
            f11501g.put(Integer.valueOf(bLiveBeautyFilterConfig.version));
            f11502h.put(m13892o().name());
            z3g0Var.onNext(bLiveBeautyFilterConfig);
            z3g0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.c(e);
            rhi.k(file);
            z3g0Var.onError(e);
            bki.m10419e(str, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13880c(final File file, final String str, final String str2, final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, final z3g0 z3g0Var) {
        try {
            k9j.H(file);
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(str).n(new File(f11496b)).j(new f30() { // from class: l.dli
                public final void call(Object obj, Object obj2) {
                    gli.m13879b(str, str2, z3g0Var, file, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.eli
                public final void call(Object obj, Object obj2) {
                    gli.m13881d(z3g0Var, str, (DownloadTask) obj, (Throwable) obj2);
                }
            }).d(new e30() { // from class: l.fli
                public final void call(Object obj) {
                    gli.m13882e(z3g0Var, str, (DownloadTask) obj);
                }
            }).a());
            bki.m10417c(str);
        } catch (RuntimeException e) {
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13881d(z3g0 z3g0Var, String str, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        bki.m10416b(str, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13882e(z3g0 z3g0Var, String str, DownloadTask downloadTask) {
        z3g0Var.onError(new RuntimeException("canceled"));
        bki.m10416b(str, false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m13883f(String str, z3g0 z3g0Var, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file) {
        gkh0.j("[live]beauty_filter", "momo lic download success");
        if (!str.equalsIgnoreCase(ogw.d(file))) {
            gkh0.j("[live]beauty_filter", "momo lic md5 check error");
            rhi.m(file.getAbsolutePath());
            z3g0Var.onError(new Throwable("error:file md5 not equal to json's zipMd5"));
        } else {
            f11503i.put(str);
            hgt.Companion.K(kt6.INSTANCE);
            gkh0.j("[live]beauty_filter", "momo lic set finish");
            z3g0Var.onNext(bLiveBeautyFilterConfig);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13884g(z3g0 z3g0Var, DownloadTask downloadTask) {
        z3g0Var.onError(new RuntimeException("canceled"));
        gkh0.j("[live]beauty_filter", "momo lic download cancel");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13885h(File file, String str, final String str2, final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, final z3g0 z3g0Var) {
        try {
            SharePatchFileUtil.ensureDirectory(file);
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(str).n(file).j(new f30() { // from class: l.yki
                public final void call(Object obj, Object obj2) {
                    gli.m13883f(str2, z3g0Var, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.ali
                public final void call(Object obj, Object obj2) {
                    gli.m13886i(z3g0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).d(new e30() { // from class: l.cli
                public final void call(Object obj) {
                    gli.m13884g(z3g0Var, (DownloadTask) obj);
                }
            }).a());
            gkh0.j("[live]beauty_filter", "momo lic download start");
        } catch (RuntimeException e) {
            gkh0.j("[live]beauty_filter", "momo lic ensure dir error " + e.getMessage());
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m13886i(z3g0 z3g0Var, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        gkh0.j("[live]beauty_filter", "momo lic download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: j */
    public static TTPresetFilter m13887j(BLiveFilterItem bLiveFilterItem) {
        String str;
        Application application = ypv.e;
        TTPresetFilter tTPresetFilter = new TTPresetFilter(application);
        if (uvr.d().F1()) {
            str = f11499e + "/filter" + File.separator + "%s";
        } else {
            str = f11498d + "/filter" + File.separator + "%s";
        }
        String str2 = str + File.separator + "%s.png";
        ((MMFilter) tTPresetFilter).mFilterName = bLiveFilterItem.name;
        ((MMPresetFilter) tTPresetFilter).mFilterId = bLiveFilterItem.id;
        Locale locale = Locale.getDefault();
        String str3 = bLiveFilterItem.resource;
        ((MMPresetFilter) tTPresetFilter).lookupUrl = String.format(locale, str2, str3, str3);
        ((MMPresetFilter) tTPresetFilter).mFilterIcon = bLiveFilterItem.icon;
        ((MMPresetFilter) tTPresetFilter).isIconLocal = false;
        File file = new File(((MMPresetFilter) tTPresetFilter).lookupUrl);
        if (!file.exists() || file.length() <= 0) {
            ((MMPresetFilter) tTPresetFilter).isFilterFileExist = false;
            bLiveFilterItem.isFilterFileExist = false;
            return null;
        }
        ((MMPresetFilter) tTPresetFilter).isFilterFileExist = true;
        bLiveFilterItem.isFilterFileExist = true;
        MMPresetFilterStore.generateFilter(application, new File(String.format(Locale.getDefault(), str, bLiveFilterItem.resource)), tTPresetFilter);
        return tTPresetFilter;
    }

    /* JADX INFO: renamed from: k */
    public static c<BLiveBeautyFilterConfig> m13888k(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        if (TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseMd5) || TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseUrl)) {
            gkh0.j("[live]beauty_filter", "lic config error, md5 = " + bLiveBeautyFilterConfig.licenseMd5 + ", url = " + bLiveBeautyFilterConfig.licenseUrl);
            return c.error(new RuntimeException("md5 or url is empty"));
        }
        final File file = new File(f11500f);
        if (file.exists() && TextUtils.equals(bLiveBeautyFilterConfig.licenseMd5, (CharSequence) f11503i.get())) {
            gkh0.j("[live]beauty_filter", "lic exist, ignore");
            return c.just(bLiveBeautyFilterConfig);
        }
        if (file.exists()) {
            rhi.k(file);
        }
        final String str = bLiveBeautyFilterConfig.licenseUrl;
        final String str2 = bLiveBeautyFilterConfig.licenseMd5;
        return c.create(new c.a() { // from class: l.wki
            public final void call(Object obj) {
                gli.m13885h(file, str, str2, bLiveBeautyFilterConfig, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static c<BLiveBeautyFilterConfig> m13889l(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        final String str;
        final String str2;
        if (bLiveBeautyFilterConfig == null) {
            return c.error(new Exception("filter is null"));
        }
        String strName = m13892o().name();
        boolean z = ((Integer) f11501g.get()).intValue() < bLiveBeautyFilterConfig.version || m13895r(f11497c) || !((String) f11502h.get()).equals(strName);
        gkh0.j("[live]beauty_filter", "beauty select: " + strName + " ver: " + bLiveBeautyFilterConfig.version + " update: " + z);
        if (!z) {
            return c.just(bLiveBeautyFilterConfig);
        }
        final File file = new File(f11497c);
        if (file.exists()) {
            rhi.k(file);
        }
        if (uvr.d().F1()) {
            str = bLiveBeautyFilterConfig.momoResourcesUrl;
            str2 = bLiveBeautyFilterConfig.momoMd5;
        } else {
            str = bLiveBeautyFilterConfig.resourcesUrl;
            str2 = bLiveBeautyFilterConfig.md5;
        }
        return c.create(new c.a() { // from class: l.uki
            public final void call(Object obj) {
                gli.m13880c(file, str, str2, bLiveBeautyFilterConfig, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static c<roj0> m13890m(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        return c.zip(m13889l(bLiveBeautyFilterConfig), m13888k(bLiveBeautyFilterConfig), new x9j() { // from class: l.ski
            public final Object call(Object obj, Object obj2) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static List<TTPresetFilter> m13891n(List<BLiveFilterItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                TTPresetFilter tTPresetFilterM13887j = m13887j(list.get(i));
                if (tTPresetFilterM13887j != null) {
                    arrayList.add(tTPresetFilterM13887j);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static MomoMediaConstants.BEAUTY_TYPE m13892o() {
        return uvr.d().F1() ? MomoMediaConstants.BEAUTY_TYPE.BEAUTY_TYPE_ENGINE : MomoMediaConstants.BEAUTY_TYPE.BEAUTY_TYPE_BYTE;
    }

    /* JADX INFO: renamed from: p */
    public static String m13893p() {
        return f11500f;
    }

    /* JADX INFO: renamed from: q */
    public static String m13894q() {
        return uvr.d().F1() ? f11499e : f11498d;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m13895r(String str) {
        File file = new File(str);
        return !file.exists() || vwb.K(file.list());
    }
}
