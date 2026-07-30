package p153l;

import android.app.Application;
import android.text.TextUtils;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class coi {

    /* JADX INFO: renamed from: a */
    public static final String f82872a;

    /* JADX INFO: renamed from: b */
    public static final String f82873b;

    /* JADX INFO: renamed from: c */
    public static final String f82874c;

    /* JADX INFO: renamed from: d */
    public static final String f82875d;

    /* JADX INFO: renamed from: e */
    public static final String f82876e;

    /* JADX INFO: renamed from: f */
    public static final String f82877f;

    /* JADX INFO: renamed from: g */
    public static final vxd0 f82878g;

    /* JADX INFO: renamed from: h */
    public static final wyd0 f82879h;

    /* JADX INFO: renamed from: i */
    public static final wyd0 f82880i;

    /* JADX INFO: renamed from: j */
    public static final String f82881j;

    /* JADX INFO: renamed from: k */
    public static final String f82882k;

    /* JADX INFO: renamed from: l */
    public static final String f82883l;

    /* JADX INFO: renamed from: m */
    public static final wyd0 f82884m;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(App.f16088e.getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("live_camera_filter");
        String string = sb.toString();
        f82872a = string;
        f82873b = string + str + "filters.zip";
        String str2 = string + str + "filters";
        f82874c = str2;
        f82875d = str2 + str + "douyinResource";
        f82876e = str2 + str + "momoResource";
        f82877f = string + str + "lic";
        f82878g = new vxd0("live_camera_filter_version", -1);
        f82879h = new wyd0("live_camera_filter_type", "");
        f82880i = new wyd0("live_momo_lic_md5", "");
        String str3 = string + str + "cvModel";
        f82881j = str3;
        f82882k = string + str + "mmcv_android_byte_model.zip";
        f82883l = str3 + str + "mmcv_android_byte_model";
        f82884m = new wyd0("mmcv_android_byte_model_md5", "");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m111641b(String str, String str2, gcg0 gcg0Var, File file, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file2) {
        xmi.m211727b(str, true);
        if (!str2.equalsIgnoreCase(niw.m163314d(file2))) {
            gcg0Var.onError(new Throwable("error:file md5 not equal to json's zipMd5"));
            xmi.m211729d(str, false);
            return;
        }
        xmi.m211729d(str, true);
        try {
            ecj.m120374H(file);
            oki.m168019g(file2, file);
            oki.m168025m(file2.getAbsolutePath());
            fhw.m125605a("[live]beauty_filter", "unzip success");
            xmi.m211730e(str, true);
            f82878g.put(Integer.valueOf(bLiveBeautyFilterConfig.version));
            f82879h.put(m111654o().name());
            gcg0Var.m137019l(bLiveBeautyFilterConfig);
            gcg0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            oki.m168023k(file);
            gcg0Var.onError(e);
            xmi.m211730e(str, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m111642c(final File file, final String str, final String str2, final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, final gcg0 gcg0Var) {
        try {
            ecj.m120374H(file);
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80822n(new File(f82873b)).m80818j(new z20() { // from class: l.zni
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    coi.m111641b(str, str2, gcg0Var, file, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.aoi
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    coi.m111643d(gcg0Var, str, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80812d(new y20() { // from class: l.boi
                @Override // p153l.y20
                public final void call(Object obj) {
                    coi.m111644e(gcg0Var, str, (DownloadTask) obj);
                }
            }).m80809a());
            xmi.m211728c(str);
        } catch (RuntimeException e) {
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m111643d(gcg0 gcg0Var, String str, DownloadTask downloadTask, Throwable th) {
        gcg0Var.onError(th);
        xmi.m211727b(str, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m111644e(gcg0 gcg0Var, String str, DownloadTask downloadTask) {
        gcg0Var.onError(new RuntimeException("canceled"));
        xmi.m211727b(str, false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m111645f(String str, gcg0 gcg0Var, BLiveBeautyFilterConfig bLiveBeautyFilterConfig, DownloadTask downloadTask, File file) {
        nsh0.m164608j("[live]beauty_filter", "momo lic download success");
        if (!str.equalsIgnoreCase(niw.m163314d(file))) {
            nsh0.m164608j("[live]beauty_filter", "momo lic md5 check error");
            oki.m168025m(file.getAbsolutePath());
            gcg0Var.onError(new Throwable("error:file md5 not equal to json's zipMd5"));
        } else {
            f82880i.put(str);
            iit.INSTANCE.m140125K(nu6.INSTANCE);
            nsh0.m164608j("[live]beauty_filter", "momo lic set finish");
            gcg0Var.m137019l(bLiveBeautyFilterConfig);
            gcg0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m111646g(gcg0 gcg0Var, DownloadTask downloadTask) {
        gcg0Var.onError(new RuntimeException("canceled"));
        nsh0.m164608j("[live]beauty_filter", "momo lic download cancel");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m111647h(File file, String str, final String str2, final BLiveBeautyFilterConfig bLiveBeautyFilterConfig, final gcg0 gcg0Var) {
        try {
            SharePatchFileUtil.ensureDirectory(file);
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80822n(file).m80818j(new z20() { // from class: l.uni
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    coi.m111645f(str2, gcg0Var, bLiveBeautyFilterConfig, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.wni
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    coi.m111648i(gcg0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80812d(new y20() { // from class: l.yni
                @Override // p153l.y20
                public final void call(Object obj) {
                    coi.m111646g(gcg0Var, (DownloadTask) obj);
                }
            }).m80809a());
            nsh0.m164608j("[live]beauty_filter", "momo lic download start");
        } catch (RuntimeException e) {
            nsh0.m164608j("[live]beauty_filter", "momo lic ensure dir error " + e.getMessage());
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m111648i(gcg0 gcg0Var, DownloadTask downloadTask, Throwable th) {
        gcg0Var.onError(th);
        nsh0.m164608j("[live]beauty_filter", "momo lic download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: j */
    public static TTPresetFilter m111649j(BLiveFilterItem bLiveFilterItem) {
        String str;
        Application application = zrv.f205803e;
        TTPresetFilter tTPresetFilter = new TTPresetFilter(application);
        if (vxr.m203876d().m170975F1()) {
            str = f82876e + "/filter" + File.separator + "%s";
        } else {
            str = f82875d + "/filter" + File.separator + "%s";
        }
        String str2 = str + File.separator + "%s.png";
        tTPresetFilter.mFilterName = bLiveFilterItem.name;
        tTPresetFilter.mFilterId = bLiveFilterItem.f45216id;
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
    public static C22421c<BLiveBeautyFilterConfig> m111650k(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        if (TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseMd5) || TextUtils.isEmpty(bLiveBeautyFilterConfig.licenseUrl)) {
            nsh0.m164608j("[live]beauty_filter", "lic config error, md5 = " + bLiveBeautyFilterConfig.licenseMd5 + ", url = " + bLiveBeautyFilterConfig.licenseUrl);
            return C22421c.error(new RuntimeException("md5 or url is empty"));
        }
        final File file = new File(f82877f);
        if (file.exists() && TextUtils.equals(bLiveBeautyFilterConfig.licenseMd5, f82880i.get())) {
            nsh0.m164608j("[live]beauty_filter", "lic exist, ignore");
            return C22421c.just(bLiveBeautyFilterConfig);
        }
        if (file.exists()) {
            oki.m168023k(file);
        }
        final String str = bLiveBeautyFilterConfig.licenseUrl;
        final String str2 = bLiveBeautyFilterConfig.licenseMd5;
        return C22421c.create(new C22421c.a() { // from class: l.sni
            @Override // p153l.y20
            public final void call(Object obj) {
                coi.m111647h(file, str, str2, bLiveBeautyFilterConfig, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveBeautyFilterConfig> m111651l(final BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        final String str;
        final String str2;
        if (bLiveBeautyFilterConfig == null) {
            return C22421c.error(new Exception("filter is null"));
        }
        String strName = m111654o().name();
        boolean z = f82878g.get().intValue() < bLiveBeautyFilterConfig.version || m111657r(f82874c) || !f82879h.get().equals(strName);
        nsh0.m164608j("[live]beauty_filter", "beauty select: " + strName + " ver: " + bLiveBeautyFilterConfig.version + " update: " + z);
        if (!z) {
            return C22421c.just(bLiveBeautyFilterConfig);
        }
        final File file = new File(f82874c);
        if (file.exists()) {
            oki.m168023k(file);
        }
        if (vxr.m203876d().m170975F1()) {
            str = bLiveBeautyFilterConfig.momoResourcesUrl;
            str2 = bLiveBeautyFilterConfig.momoMd5;
        } else {
            str = bLiveBeautyFilterConfig.resourcesUrl;
            str2 = bLiveBeautyFilterConfig.md5;
        }
        return C22421c.create(new C22421c.a() { // from class: l.qni
            @Override // p153l.y20
            public final void call(Object obj) {
                coi.m111642c(file, str, str2, bLiveBeautyFilterConfig, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<uxj0> m111652m(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        return C22421c.zip(m111651l(bLiveBeautyFilterConfig), m111650k(bLiveBeautyFilterConfig), new rcj() { // from class: l.oni
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static List<TTPresetFilter> m111653n(List<BLiveFilterItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                TTPresetFilter tTPresetFilterM111649j = m111649j(list.get(i));
                if (tTPresetFilterM111649j != null) {
                    arrayList.add(tTPresetFilterM111649j);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static MomoMediaConstants$BEAUTY_TYPE m111654o() {
        return vxr.m203876d().m170975F1() ? MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE : MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE;
    }

    /* JADX INFO: renamed from: p */
    public static String m111655p() {
        return f82877f;
    }

    /* JADX INFO: renamed from: q */
    public static String m111656q() {
        return vxr.m203876d().m170975F1() ? f82876e : f82875d;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m111657r(String str) {
        File file = new File(str);
        return !file.exists() || jyb.m147480K(file.list());
    }
}
