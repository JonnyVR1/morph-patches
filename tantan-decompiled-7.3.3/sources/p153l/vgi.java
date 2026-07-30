package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.feppkg.core.FepPackageManager;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/vgi;", "", "<init>", "()V", "", "a", "b", "", "bid", "baseVersion", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)V", "c", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class vgi {

    /* JADX INFO: renamed from: l.vgi$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C20832a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d(Long.valueOf(((mhi) t).getLastVisitT()), Long.valueOf(((mhi) t2).getLastVisitT()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX INFO: renamed from: a */
    public final void m201230a() {
        String bid;
        String baseVer;
        ArrayList arrayList;
        try {
            FepConfigManager.Companion companion = FepConfigManager.INSTANCE;
            Integer numM151323k = kt0.m151323k(companion.m17633a().m17629k("offlineDiskMonitorDuration", 30));
            int iIntValue = numM151323k != null ? numM151323k.intValue() : 30;
            if (iIntValue <= 0) {
                return;
            }
            int i = 0;
            Integer numM151323k2 = kt0.m151323k(companion.m17633a().m17629k("offlineDiskMonitorDeleteCount", 0));
            int iIntValue2 = numM151323k2 != null ? numM151323k2.intValue() : 0;
            if (iIntValue2 == 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (iIntValue * MMKV.ExpireInDay)) * 1000);
            File fileM109819v = FepPackageContext.INSTANCE.m17684k().m109819v();
            if (fileM109819v.exists() && fileM109819v.isDirectory()) {
                ArrayList arrayList2 = new ArrayList();
                File[] fileArrListFiles = fileM109819v.listFiles();
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        File file = fileArrListFiles[i2];
                        file.getClass();
                        if (file.isDirectory()) {
                            String name = file.getName();
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                int length2 = fileArrListFiles2.length;
                                int i3 = i;
                                while (i3 < length2) {
                                    File file2 = fileArrListFiles2[i3];
                                    file2.getClass();
                                    if (file2.isDirectory()) {
                                        String name2 = file2.getName();
                                        File[] fileArrListFiles3 = file2.listFiles();
                                        if (fileArrListFiles3 != null) {
                                            int length3 = fileArrListFiles3.length;
                                            int i4 = i;
                                            while (i4 < length3) {
                                                File file3 = fileArrListFiles3[i4];
                                                file3.getClass();
                                                String name3 = file3.getName();
                                                name3.getClass();
                                                Long lP = StringsKt.m94281p(name3);
                                                ArrayList arrayList3 = arrayList2;
                                                long jLongValue = lP != null ? lP.longValue() : 0L;
                                                File[] fileArr = fileArrListFiles;
                                                FepPackageRecordModule fepPackageRecordModuleM17691r = FepPackageContext.INSTANCE.m17691r();
                                                name.getClass();
                                                name2.getClass();
                                                mhi mhiVarM17731v = fepPackageRecordModuleM17691r.m17731v(name, name2, jLongValue);
                                                if (mhiVarM17731v != null) {
                                                    long lastVisitT = mhiVarM17731v.getLastVisitT();
                                                    if (1 <= lastVisitT && jCurrentTimeMillis > lastVisitT) {
                                                        arrayList = arrayList3;
                                                        arrayList.add(mhiVarM17731v);
                                                    } else {
                                                        arrayList = arrayList3;
                                                    }
                                                } else {
                                                    arrayList = arrayList3;
                                                }
                                                i4++;
                                                arrayList2 = arrayList;
                                                fileArrListFiles = fileArr;
                                            }
                                        }
                                    }
                                    i3++;
                                    arrayList2 = arrayList2;
                                    fileArrListFiles = fileArrListFiles;
                                    i = 0;
                                }
                            }
                        }
                        i2++;
                        arrayList2 = arrayList2;
                        fileArrListFiles = fileArrListFiles;
                        i = 0;
                    }
                }
                int i5 = 0;
                for (mhi mhiVar : CollectionsKt.sortedWith(arrayList2, new C20832a())) {
                    if (i5 < iIntValue2 && (bid = mhiVar.getBid()) != null && (baseVer = mhiVar.getBaseVer()) != null) {
                        Map mapMapOf = MapsKt.mapOf(TuplesKt.m88129a("bid", bid), TuplesKt.m88129a("baseVersion", baseVer));
                        try {
                            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
                            fepPackageContext.m17684k().m109803b(fepPackageContext.m17684k().m109818u(bid, baseVer, mhiVar.getFullVer()));
                            fepPackageContext.m17691r().m17725m(bid, baseVer, Long.valueOf(mhiVar.getFullVer()));
                            i5++;
                            pgi.m172235f(fepPackageContext.m17685l(), "Cleaned unused package: " + bid + '/' + baseVer + '/' + mhiVar.getFullVer(), mapMapOf, 0, 4, null);
                        } catch (Exception e) {
                            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Clean package failed: " + e.getMessage(), e, 0, mapMapOf, 4, null);
                        }
                    }
                    pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Clean unused packages failed: " + e.getMessage(), e, 0, null, 12, null);
                }
                pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), "Cleaned " + i5 + " unused packages", null, 0, 6, null);
            }
        } catch (Exception e2) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Clean unused packages failed: " + e2.getMessage(), e2, 0, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m201231b() {
        File[] fileArrListFiles;
        try {
            String rootPath = FepPackageContext.INSTANCE.m17677d().getRootPath();
            File file = new File(rootPath);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    file2.getClass();
                    if (file2.isDirectory()) {
                        FileUtil.m17527k(file2);
                    }
                }
            }
            File file3 = new File(rootPath, "backup");
            if (file3.exists()) {
                FileUtil.m17527k(file3);
            }
            File file4 = new File(rootPath, "download");
            if (file4.exists()) {
                FileUtil.m17527k(file4);
            }
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            fepPackageContext.m17682i().m97840d();
            fepPackageContext.m17691r().m17724k();
            pgi.m172235f(fepPackageContext.m17685l(), "Cleared all packages", null, 0, 6, null);
        } catch (Exception e) {
            pgi pgiVarM17685l = FepPackageContext.INSTANCE.m17685l();
            String str = "Clear all packages failed: " + e.getMessage();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pgi.m172239k(pgiVarM17685l, str, e, 0, MapsKt.mapOf(TuplesKt.m88129a("error", message)), 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    /* JADX INFO: renamed from: c */
    public final void m201232c(@NotNull String bid, @Nullable String baseVersion) {
        bid.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (baseVersion == null) {
                baseVersion = "default";
            } else {
                if (StringsKt.m94329e0(baseVersion)) {
                    baseVersion = null;
                }
                if (baseVersion == null) {
                    baseVersion = "default";
                }
            }
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            FileUtil.m17527k(fepPackageContext.m17684k().m109817t(bid, baseVersion));
            File[] fileArrListFiles = fepPackageContext.m17684k().m109809k().listFiles();
            if (fileArrListFiles != null) {
                if (!(fileArrListFiles.length == 0)) {
                    for (File file : fileArrListFiles) {
                        if (file != null && !file.isDirectory() && !TextUtils.isEmpty(file.getName())) {
                            String name = file.getName();
                            name.getClass();
                            if (C15493d.m94374J(name, "backup_" + bid, false, 2, null)) {
                                file.delete();
                            }
                        }
                    }
                }
            }
            FileUtil.m17527k(chi.m109800h(FepPackageContext.INSTANCE.m17684k(), bid, null, 2, null));
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m201233d(@NotNull String bid, @Nullable String baseVersion) {
        bid.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            zgi zgiVarM17657o = FepPackageManager.m17657o(FepPackageManager.INSTANCE.m17673a(), bid, baseVersion, null, null, 8, null);
            if (zgiVarM17657o != null) {
                FepPackageContext.INSTANCE.m17674a(zgiVarM17657o.m219626i(), bid, d8g0.m114836a(baseVersion));
            } else {
                zgiVarM17657o = null;
            }
            Result.m225066constructorimpl(zgiVarM17657o);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }
}
