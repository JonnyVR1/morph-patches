package p153l;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.internal.module.install.FepPackageUnzipModule;
import com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJI\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/bhi;", "", "<init>", "()V", "", "bid", "", "keepVersion", "", "a", "(Ljava/lang/String;J)V", "zipPath", "baseVersion", "newVersion", "", "useRSA", "", "recordData", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/util/Map;)Z", "Ljava/io/File;", "finalPackageDir", "Lkotlin/Pair;", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "verifySuccess", "b", "(Ljava/lang/String;Ljava/lang/String;JLjava/io/File;Lkotlin/Pair;)V", WBConstants.AUTH_PARAMS_VERSION, RequestParameters.PREFIX, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class bhi {
    /* JADX INFO: renamed from: a */
    private final void m104345a(String bid, long keepVersion) {
        try {
            File file = new File(FepPackageContext.INSTANCE.m17677d().getRootPath(), "backup");
            if (file.exists()) {
                String str = "backup_" + bid + 'v' + keepVersion + ".zip";
                String str2 = "backup_" + bid + 'v' + keepVersion + ".7z";
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        file2.getClass();
                        if (file2.isFile()) {
                            String name = file2.getName();
                            name.getClass();
                            if (C15493d.m94374J(name, "backup_" + bid, false, 2, null)) {
                                arrayList.add(file2);
                            }
                        }
                    }
                    for (File file3 : arrayList) {
                        file3.getClass();
                        if (!Intrinsics.m88377d(file3.getName(), str) && !Intrinsics.m88377d(file3.getName(), str2)) {
                            file3.delete();
                            pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Deleted old backup: " + file3.getAbsolutePath(), null, 2, null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Delete old backups failed: " + e.getMessage(), e, 0, MapsKt.mapOf(TuplesKt.m88129a("bid", bid)), 4, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m104346b(@NotNull String bid, @NotNull String baseVersion, long newVersion, @NotNull File finalPackageDir, @NotNull Pair<Boolean, FepPackageConfig> verifySuccess) {
        FepPackageConfig second;
        bid.getClass();
        baseVersion.getClass();
        finalPackageDir.getClass();
        verifySuccess.getClass();
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        fepPackageContext.m17691r().m17720B(bid, baseVersion, newVersion);
        fepPackageContext.m17680g().m215842a(bid, finalPackageDir, newVersion);
        zgi zgiVarM97843g = fepPackageContext.m17682i().m97843g(bid, baseVersion);
        if (zgiVarM97843g != null && (second = verifySuccess.getSecond()) != null) {
            zgiVarM97843g.m219639v(second.getVersion(), finalPackageDir.getAbsolutePath(), second);
        }
        pgi.m172235f(fepPackageContext.m17685l(), "Package install success: " + bid + '/' + baseVersion + '/' + newVersion, MapsKt.mapOf(TuplesKt.m88129a("bid", bid), TuplesKt.m88129a("baseVersion", baseVersion)), 0, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m104347c(@NotNull String zipPath, @NotNull String bid, @NotNull String baseVersion, long newVersion, boolean useRSA, @NotNull Map<String, String> recordData) {
        zipPath.getClass();
        bid.getClass();
        baseVersion.getClass();
        recordData.getClass();
        File file = new File(zipPath);
        if (!file.exists()) {
            pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3007, "Zip file not exists: " + zipPath, null, recordData, 4, null);
            return false;
        }
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        File fileM109821x = fepPackageContext.m17684k().m109821x(bid, baseVersion, newVersion);
        if (!fileM109821x.exists()) {
            fileM109821x.mkdirs();
        }
        FepPackageUnzipModule fepPackageUnzipModuleM17692s = fepPackageContext.m17692s();
        String absolutePath = fileM109821x.getAbsolutePath();
        absolutePath.getClass();
        if (!fepPackageUnzipModuleM17692s.m17699a(zipPath, absolutePath, recordData)) {
            FileUtil.m17527k(fileM109821x.getParentFile());
            return false;
        }
        nhi nhiVarM17694u = fepPackageContext.m17694u();
        String absolutePath2 = fileM109821x.getAbsolutePath();
        absolutePath2.getClass();
        Pair<Boolean, FepPackageConfig> pairM163100m = nhi.m163100m(nhiVarM17694u, bid, baseVersion, absolutePath2, useRSA, false, recordData, 16, null);
        if (!pairM163100m.getFirst().booleanValue()) {
            FileUtil.m17527k(fileM109821x.getParentFile());
            pgi.m172234d(fepPackageContext.m17685l(), -3007, "Package verify failed", null, recordData, 4, null);
            return false;
        }
        File fileM109818u = fepPackageContext.m17684k().m109818u(bid, baseVersion, newVersion);
        if (fileM109818u.exists()) {
            FileUtil.m17527k(fileM109818u);
        } else {
            fileM109818u.mkdirs();
        }
        if (!fepPackageContext.m17684k().m109815r(fileM109821x, fileM109818u)) {
            FileUtil.m17527k(fileM109821x.getParentFile());
            pgi.m172234d(fepPackageContext.m17685l(), -3007, "Move package to final path failed", null, recordData, 4, null);
            return false;
        }
        String name = file.getName();
        name.getClass();
        File fileM109810l = fepPackageContext.m17684k().m109810l(bid, newVersion, C15493d.m94380w(name, ".7z", false, 2, null) ? ".7z" : ".zip");
        if (fileM109810l.exists()) {
            fileM109810l.delete();
        }
        fepPackageContext.m17684k().m109802a(file, fileM109810l);
        m104345a(bid, newVersion);
        file.delete();
        FileUtil.m17527k(fileM109821x.getParentFile());
        m104346b(bid, baseVersion, newVersion, fileM109818u, pairM163100m);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m104348d(@NotNull String zipPath, @NotNull String bid, @Nullable String baseVersion, @NotNull String version, @Nullable String prefix) {
        zipPath.getClass();
        bid.getClass();
        version.getClass();
        String str = (baseVersion == null || baseVersion.length() == 0) ? "default" : baseVersion;
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        File file = new File(fepPackageContext.m17684k().m109817t(bid, str), version);
        String absolutePath = file.getAbsolutePath();
        if (prefix != null && prefix.length() != 0) {
            absolutePath = file.getAbsolutePath() + File.separator + prefix;
        }
        FepPackageUnzipModule fepPackageUnzipModuleM17692s = fepPackageContext.m17692s();
        absolutePath.getClass();
        boolean zM17699a = fepPackageUnzipModuleM17692s.m17699a(zipPath, absolutePath, xgi.m210888a(MapsKt.mutableMapOf(TuplesKt.m88129a("bid", bid), TuplesKt.m88129a("zipPath", zipPath), TuplesKt.m88129a("baseVersion", String.valueOf(baseVersion)), TuplesKt.m88129a("fepVersion", version), TuplesKt.m88129a(RequestParameters.PREFIX, String.valueOf(prefix))), "FepPackageInstallModule-installCustom"));
        FepPackageRecordModule fepPackageRecordModuleM17691r = fepPackageContext.m17691r();
        Long lP = StringsKt.m94281p(version);
        fepPackageRecordModuleM17691r.m17720B(bid, str, lP != null ? lP.longValue() : 0L);
        return zM17699a;
    }
}
