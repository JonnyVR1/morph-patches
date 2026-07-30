package p149l;

import android.app.Application;
import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class gli {

    /* JADX INFO: renamed from: a */
    public static final String f103321a;

    /* JADX INFO: renamed from: b */
    public static final String f103322b;

    /* JADX INFO: renamed from: c */
    public static final String f103323c;

    /* JADX INFO: renamed from: d */
    public static final String f103324d;

    /* JADX INFO: renamed from: e */
    public static final String f103325e;

    /* JADX INFO: renamed from: f */
    public static final String f103326f;

    /* JADX INFO: renamed from: g */
    public static final tpd0 f103327g;

    /* JADX INFO: renamed from: h */
    public static final uqd0 f103328h;

    /* JADX INFO: renamed from: i */
    public static final uqd0 f103329i;

    /* JADX INFO: renamed from: j */
    public static final String f103330j;

    /* JADX INFO: renamed from: k */
    public static final String f103331k;

    /* JADX INFO: renamed from: l */
    public static final String f103332l;

    /* JADX INFO: renamed from: m */
    public static final uqd0 f103333m;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(App.f15369e.getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("live_camera_filter");
        String string = sb.toString();
        f103321a = string;
        f103322b = string + str + "filters.zip";
        String str2 = string + str + "filters";
        f103323c = str2;
        f103324d = str2 + str + "douyinResource";
        f103325e = str2 + str + "momoResource";
        f103326f = string + str + "lic";
        f103327g = new tpd0("live_camera_filter_version", -1);
        f103328h = new uqd0("live_camera_filter_type", "");
        f103329i = new uqd0("live_momo_lic_md5", "");
        String str3 = string + str + "cvModel";
        f103330j = str3;
        f103331k = string + str + "mmcv_android_byte_model.zip";
        f103332l = str3 + str + "mmcv_android_byte_model";
        f103333m = new uqd0("mmcv_android_byte_model_md5", "");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m126752b(String str, String str2, z3g0 z3g0Var, File file, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file2) {
        bki.m102396b(str, true);
        if (!str2.equalsIgnoreCase(ogw.m164283d(file2))) {
            z3g0Var.onError(new Throwable("error:file md5 not equal to json's zipMd5"));
            bki.m102398d(str, false);
            return;
        }
        bki.m102398d(str, true);
        try {
            k9j.m145076H(file);
            rhi.m179363g(file2, file);
            rhi.m179369m(file2.getAbsolutePath());
            hfw.m130790a("[live]beauty_filter", "unzip success");
            bki.m102399e(str, true);
            f103327g.put(Integer.valueOf(bLiveBeautyFilterConfig.version));
            f103328h.put(m126765o().name());
            z3g0Var.m132487l(bLiveBeautyFilterConfig);
            z3g0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            rhi.m179367k(file);
            z3g0Var.onError(e);
            bki.m102399e(str, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m126753c(final File file, final String str, final String str2, final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, final z3g0 z3g0Var) {
        try {
            k9j.m145076H(file);
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79639n(new File(f103322b)).m79635j(new f30() { // from class: l.dli
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    gli.m126752b(str, str2, z3g0Var, file, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.eli
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    gli.m126754d(z3g0Var, str, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79629d(new e30() { // from class: l.fli
                @Override // p149l.e30
                public final void call(Object obj) {
                    gli.m126755e(z3g0Var, str, (DownloadTask) obj);
                }
            }).m79626a());
            bki.m102397c(str);
        } catch (RuntimeException e) {
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m126754d(z3g0 z3g0Var, String str, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        bki.m102396b(str, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m126755e(z3g0 z3g0Var, String str, DownloadTask downloadTask) {
        z3g0Var.onError(new RuntimeException("canceled"));
        bki.m102396b(str, false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m126756f(String str, z3g0 z3g0Var, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file) {
        gkh0.m126627j("[live]beauty_filter", "momo lic download success");
        if (!str.equalsIgnoreCase(ogw.m164283d(file))) {
            gkh0.m126627j("[live]beauty_filter", "momo lic md5 check error");
            rhi.m179369m(file.getAbsolutePath());
            z3g0Var.onError(new Throwable("error:file md5 not equal to json's zipMd5"));
        } else {
            f103329i.put(str);
            hgt.INSTANCE.m130904K(kt6.INSTANCE);
            gkh0.m126627j("[live]beauty_filter", "momo lic set finish");
            z3g0Var.m132487l(bLiveBeautyFilterConfig);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m126757g(z3g0 z3g0Var, DownloadTask downloadTask) {
        z3g0Var.onError(new RuntimeException("canceled"));
        gkh0.m126627j("[live]beauty_filter", "momo lic download cancel");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m126758h(File file, String str, final String str2, final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, final z3g0 z3g0Var) {
        try {
            SharePatchFileUtil.ensureDirectory(file);
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79639n(file).m79635j(new f30() { // from class: l.yki
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    gli.m126756f(str2, z3g0Var, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.ali
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    gli.m126759i(z3g0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79629d(new e30() { // from class: l.cli
                @Override // p149l.e30
                public final void call(Object obj) {
                    gli.m126757g(z3g0Var, (DownloadTask) obj);
                }
            }).m79626a());
            gkh0.m126627j("[live]beauty_filter", "momo lic download start");
        } catch (RuntimeException e) {
            gkh0.m126627j("[live]beauty_filter", "momo lic ensure dir error " + e.getMessage());
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m126759i(z3g0 z3g0Var, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        gkh0.m126627j("[live]beauty_filter", "momo lic download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: j */
    public static TTPresetFilter m126760j(BLiveFilterItem bLiveFilterItem) {
        String str;
        Application application = ypv.f199497e;
        TTPresetFilter tTPresetFilter = new TTPresetFilter(application);
        if (uvr.m196087d().m162668F1()) {
            str = f103325e + "/filter" + File.separator + "%s";
        } else {
            str = f103324d + "/filter" + File.separator + "%s";
        }
        String str2 = str + File.separator + "%s.png";
        tTPresetFilter.mFilterName = bLiveFilterItem.name;
        tTPresetFilter.mFilterId = bLiveFilterItem.f44368id;
        Locale locale = Locale.getDefault();
        String str3 = bLiveFilterItem.resource;
        tTPresetFilter.lookupUrl = String.format(locale, str2, str3, str3);
        tTPresetFilter.mFilterIcon = bLiveFilterItem.icon;
        tTPresetFilter.isIconLocal = false;
        File file = new File(tTPresetFilter.lookupUrl);
        if (!file.exists() || file.length() <= 0) {
            tTPresetFilter.isFilterFileExist = false;
            bLiveFilterItem.isFilterFileExist = false;
            return null;
        }
        tTPresetFilter.isFilterFileExist = true;
        bLiveFilterItem.isFilterFileExist = true;
        MMPresetFilterStore.generateFilter(application, new File(String.format(Locale.getDefault(), str, bLiveFilterItem.resource)), tTPresetFilter);
        return tTPresetFilter;
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveBeautyFilterConfig> m126761k(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        if (TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseMd5) || TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseUrl)) {
            gkh0.m126627j("[live]beauty_filter", "lic config error, md5 = " + bLiveBeautyFilterConfig.licenseMd5 + ", url = " + bLiveBeautyFilterConfig.licenseUrl);
            return C22306c.error(new RuntimeException("md5 or url is empty"));
        }
        final File file = new File(f103326f);
        if (file.exists() && TextUtils.equals(bLiveBeautyFilterConfig.licenseMd5, f103329i.get())) {
            gkh0.m126627j("[live]beauty_filter", "lic exist, ignore");
            return C22306c.just(bLiveBeautyFilterConfig);
        }
        if (file.exists()) {
            rhi.m179367k(file);
        }
        final String str = bLiveBeautyFilterConfig.licenseUrl;
        final String str2 = bLiveBeautyFilterConfig.licenseMd5;
        return C22306c.create(new C22306c.a() { // from class: l.wki
            @Override // p149l.e30
            public final void call(Object obj) {
                gli.m126758h(file, str, str2, bLiveBeautyFilterConfig, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveBeautyFilterConfig> m126762l(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        final String str;
        final String str2;
        if (bLiveBeautyFilterConfig == null) {
            return C22306c.error(new Exception("filter is null"));
        }
        String strName = m126765o().name();
        boolean z = f103327g.get().intValue() < bLiveBeautyFilterConfig.version || m126768r(f103323c) || !f103328h.get().equals(strName);
        gkh0.m126627j("[live]beauty_filter", "beauty select: " + strName + " ver: " + bLiveBeautyFilterConfig.version + " update: " + z);
        if (!z) {
            return C22306c.just(bLiveBeautyFilterConfig);
        }
        final File file = new File(f103323c);
        if (file.exists()) {
            rhi.m179367k(file);
        }
        if (uvr.m196087d().m162668F1()) {
            str = bLiveBeautyFilterConfig.momoResourcesUrl;
            str2 = bLiveBeautyFilterConfig.momoMd5;
        } else {
            str = bLiveBeautyFilterConfig.resourcesUrl;
            str2 = bLiveBeautyFilterConfig.md5;
        }
        return C22306c.create(new C22306c.a() { // from class: l.uki
            @Override // p149l.e30
            public final void call(Object obj) {
                gli.m126753c(file, str, str2, bLiveBeautyFilterConfig, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<roj0> m126763m(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        return C22306c.zip(m126762l(bLiveBeautyFilterConfig), m126761k(bLiveBeautyFilterConfig), new x9j() { // from class: l.ski
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static List<TTPresetFilter> m126764n(List<BLiveFilterItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                TTPresetFilter tTPresetFilterM126760j = m126760j(list.get(i));
                if (tTPresetFilterM126760j != null) {
                    arrayList.add(tTPresetFilterM126760j);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static MomoMediaConstants$BEAUTY_TYPE m126765o() {
        return uvr.m196087d().m162668F1() ? MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE : MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE;
    }

    /* JADX INFO: renamed from: p */
    public static String m126766p() {
        return f103326f;
    }

    /* JADX INFO: renamed from: q */
    public static String m126767q() {
        return uvr.m196087d().m162668F1() ? f103325e : f103324d;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m126768r(String str) {
        File file = new File(str);
        return !file.exists() || vwb.m200297K(file.list());
    }
}
