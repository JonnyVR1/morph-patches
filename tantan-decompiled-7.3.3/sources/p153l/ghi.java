package p153l;

import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import immomo.com.mklibrary.core.offline.bsdiff.BsdiffUtil;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/ghi;", "", "<init>", "()V", "", "patchPath", "originZipPath", "bid", "", "newVersion", "", "recordData", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)Ljava/lang/String;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ghi {
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m130251a(@NotNull String patchPath, @NotNull String originZipPath, @NotNull String bid, long newVersion, @NotNull Map<String, String> recordData) {
        patchPath.getClass();
        originZipPath.getClass();
        bid.getClass();
        recordData.getClass();
        File file = new File(patchPath);
        File file2 = new File(originZipPath);
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        File fileM109798d = chi.m109798d(fepPackageContext.m17684k(), bid, null, 2, null);
        if (!file.exists() || !file2.exists() || file2.length() <= 0) {
            pgi.m172234d(fepPackageContext.m17685l(), -3010, "Read patch/origin file failed", null, recordData, 4, null);
            return null;
        }
        try {
            if (fileM109798d.exists()) {
                fileM109798d.delete();
            }
            int iApply_patch = BsdiffUtil.apply_patch(file2.getAbsolutePath(), fileM109798d.getAbsolutePath(), file.getAbsolutePath());
            if (iApply_patch <= 0) {
                pgi.m172234d(fepPackageContext.m17685l(), -3010, "Patch merge failed, result code: " + iApply_patch, null, recordData, 4, null);
                fileM109798d.delete();
                return null;
            }
            if (!fileM109798d.exists() || fileM109798d.length() <= 0) {
                pgi.m172234d(fepPackageContext.m17685l(), -3010, "Write merged file failed", null, recordData, 4, null);
                fileM109798d.delete();
                return null;
            }
            pgi.m172235f(fepPackageContext.m17685l(), "Patch merge success: " + patchPath + " + " + originZipPath + " -> " + fileM109798d.getAbsolutePath(), recordData, 0, 4, null);
            return fileM109798d.getAbsolutePath();
        } catch (Exception e) {
            FepPackageContext.INSTANCE.m17685l().m172241c(-3010, "Patch merge failed", e, recordData);
            fileM109798d.delete();
            return null;
        }
    }
}
