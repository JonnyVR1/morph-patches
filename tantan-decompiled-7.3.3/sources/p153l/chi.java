package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 22\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000fJ\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\nJ%\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0013J\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u000fJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u000fJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b'\u0010&J\u001d\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\bJ\u001d\u0010-\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b-\u0010+J\u001d\u0010/\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u0016¨\u00063"}, m88121d2 = {"Ll/chi;", "", "<init>", "()V", "Ljava/io/File;", "dir", "", "q", "(Ljava/io/File;)Z", ResourceDirection.f39656v, "()Ljava/io/File;", "", "bid", "baseVersion", Constants.KEY_T, "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "", "fullVersion", "u", "(Ljava/lang/String;Ljava/lang/String;J)Ljava/io/File;", "type", BaseSei.f14625Y, "(Ljava/lang/String;JLjava/lang/String;)Ljava/io/File;", "k", "g", "e", "c", "m", BaseSei.f14624X, "w", "j", RXScreenCaptureService.KEY_INDEX, "packageDir", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "packageDirPath", "n", "(Ljava/lang/String;)Ljava/io/File;", "o", "source", FirebaseAnalytics.Param.DESTINATION, "r", "(Ljava/io/File;Ljava/io/File;)Z", "b", "a", WBConstants.AUTH_PARAMS_VERSION, "p", "(Ljava/lang/String;J)Z", BLiveStormDanmakuGiftResourceType.f45292l, "Companion", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class chi {

    /* JADX INFO: renamed from: l.chi$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C16258b<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Long l2 = 0L;
            File file = (File) t2;
            file.getClass();
            String name = file.getName();
            name.getClass();
            Long lP = StringsKt.m94281p(name);
            if (lP == null) {
                lP = l2;
            }
            File file2 = (File) t;
            file2.getClass();
            String name2 = file2.getName();
            name2.getClass();
            Long lP2 = StringsKt.m94281p(name2);
            return go5.m131087d(lP, lP2 != null ? lP2 : 0L);
        }
    }

    /* JADX INFO: renamed from: l.chi$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C16259c<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Long l2 = 0L;
            File file = (File) t2;
            file.getClass();
            String name = file.getName();
            name.getClass();
            Long lP = StringsKt.m94281p(name);
            if (lP == null) {
                lP = l2;
            }
            File file2 = (File) t;
            file2.getClass();
            String name2 = file2.getName();
            name2.getClass();
            Long lP2 = StringsKt.m94281p(name2);
            return go5.m131087d(lP, lP2 != null ? lP2 : 0L);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ File m109798d(chi chiVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ".zip";
        }
        return chiVar.m109804c(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ File m109799f(chi chiVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ".zip";
        }
        return chiVar.m109805e(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ File m109800h(chi chiVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ".zip";
        }
        return chiVar.m109806g(str, str2);
    }

    /* JADX INFO: renamed from: q */
    private final boolean m109801q(File dir) {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(Boolean.valueOf(new File(dir, "config.json").exists()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m225072isFailureimpl(objM225066constructorimpl)) {
            objM225066constructorimpl = bool;
        }
        return ((Boolean) objM225066constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m109802a(@NotNull File source, @NotNull File destination) throws Throwable {
        File parentFile;
        source.getClass();
        destination.getClass();
        try {
            File parentFile2 = destination.getParentFile();
            if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = destination.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            FileUtil.m17523g(source, destination);
            return true;
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Copy file failed: " + e.getMessage(), e, 0, null, 12, null);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m109803b(@NotNull File dir) {
        dir.getClass();
        try {
            FileUtil.m17527k(dir);
            return true;
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Delete dir failed: " + e.getMessage(), e, 0, null, 12, null);
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final File m109804c(@NotNull String bid, @NotNull String type) {
        bid.getClass();
        type.getClass();
        return new File(m109811m(), bid + "_patch_done" + type);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final File m109805e(@NotNull String bid, @NotNull String type) {
        bid.getClass();
        type.getClass();
        return new File(m109811m(), bid + "_patch" + type);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final File m109806g(@NotNull String bid, @NotNull String type) {
        bid.getClass();
        type.getClass();
        return new File(m109811m(), bid + type);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final File m109807i(@NotNull String bid, @NotNull String baseVersion) {
        File[] fileArrListFiles;
        bid.getClass();
        baseVersion.getClass();
        File fileM109817t = m109817t(bid, baseVersion);
        if (fileM109817t.exists() && (fileArrListFiles = fileM109817t.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                file.getClass();
                if (file.isDirectory()) {
                    String name = file.getName();
                    name.getClass();
                    if (TextUtils.isDigitsOnly(name) && file.length() > 0) {
                        String name2 = file.getName();
                        name2.getClass();
                        if (!C15493d.m94374J(name2, "unzip_", false, 2, null)) {
                            arrayList.add(file);
                        }
                    }
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new C16258b());
            if (listSortedWith != null) {
                return (File) CollectionsKt.firstOrNull(listSortedWith);
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final File m109808j(@NotNull String bid, @NotNull String baseVersion) {
        File[] fileArrListFiles;
        bid.getClass();
        baseVersion.getClass();
        File fileM109817t = m109817t(bid, baseVersion);
        if (fileM109817t.exists() && (fileArrListFiles = fileM109817t.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                file.getClass();
                if (file.isDirectory()) {
                    String name = file.getName();
                    name.getClass();
                    if (TextUtils.isDigitsOnly(name) && file.length() > 0) {
                        String name2 = file.getName();
                        name2.getClass();
                        if (!C15493d.m94374J(name2, "unzip_", false, 2, null) && m109801q(file)) {
                            arrayList.add(file);
                        }
                    }
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new C16259c());
            if (listSortedWith != null) {
                return (File) CollectionsKt.firstOrNull(listSortedWith);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final File m109809k() {
        return new File(FepPackageContext.INSTANCE.m17677d().getRootPath(), "backup");
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final File m109810l(@NotNull String bid, long version, @NotNull String type) {
        bid.getClass();
        type.getClass();
        return m109822y(bid, version, type);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final File m109811m() {
        File file = new File(FepPackageContext.INSTANCE.m17677d().getRootPath(), "download");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final File m109812n(@Nullable String packageDirPath) {
        return new File(packageDirPath, "config.json");
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final File m109813o(@Nullable String packageDirPath) {
        return new File(packageDirPath, "verify.json");
    }

    /* JADX INFO: renamed from: p */
    public final boolean m109814p(@NotNull String bid, long version) {
        bid.getClass();
        File fileM109822y = m109822y(bid, version, ".zip");
        if (fileM109822y.exists() && fileM109822y.length() > 0) {
            return true;
        }
        File fileM109822y2 = m109822y(bid, version, ".7z");
        return fileM109822y2.exists() && fileM109822y2.length() > 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m109815r(@NotNull File source, @NotNull File destination) throws Throwable {
        File parentFile;
        source.getClass();
        destination.getClass();
        try {
            if (destination.exists()) {
                FileUtil.m17527k(destination);
            }
            File parentFile2 = destination.getParentFile();
            if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = destination.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            if (!source.renameTo(destination)) {
                if (source.isDirectory()) {
                    FileUtil.m17521e(source, destination);
                    FileUtil.m17527k(source);
                } else {
                    FileUtil.m17523g(source, destination);
                    source.delete();
                }
                if (!destination.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Move file failed: " + e.getMessage(), e, 0, null, 12, null);
            return false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final FepPackageConfig m109816s(@NotNull String packageDir) throws Throwable {
        packageDir.getClass();
        String strM17534r = FileUtil.m17534r(m109812n(packageDir));
        strM17534r.getClass();
        if (StringsKt.m94329e0(strM17534r)) {
            return null;
        }
        try {
            return FepPackageConfig.INSTANCE.m17743a(strM17534r);
        } catch (JSONException e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Parse package config failed: " + e.getMessage(), e, 0, null, 12, null);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final File m109817t(@NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        return new File(m109819v(), bid + File.separator + baseVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final File m109818u(@NotNull String bid, @NotNull String baseVersion, long fullVersion) {
        bid.getClass();
        baseVersion.getClass();
        return new File(m109817t(bid, baseVersion), String.valueOf(fullVersion));
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final File m109819v() {
        return new File(FepPackageContext.INSTANCE.m17677d().getRootPath() + File.separator + "MultiOffline");
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final File m109820w(@NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        return new File(FepPackageContext.INSTANCE.m17677d().getRootPath(), "tempUnzip" + File.separator + bid + '_' + baseVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final File m109821x(@NotNull String bid, @NotNull String baseVersion, long fullVersion) {
        bid.getClass();
        baseVersion.getClass();
        return new File(m109820w(bid, baseVersion), "unzip_" + fullVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final File m109822y(@NotNull String bid, long fullVersion, @NotNull String type) {
        bid.getClass();
        type.getClass();
        return new File(m109809k(), "backup_" + bid + 'v' + fullVersion + type);
    }
}
