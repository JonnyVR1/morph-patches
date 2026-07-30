package com.tantanapp.common.nativelib.manager.worker;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.common.nativelib.manager.bean.ProjectLibrary;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.bii;
import p149l.g0g0;
import p149l.tyl;
import p149l.zhi;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/UnzipWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", BaseSei.INFO, "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "unzip", "zipFile", "Ljava/io/File;", "zipFileInfo", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "validateNativeLibrary", "", "installed", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class UnzipWorker extends Worker {

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.UnzipWorker$a */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m87232d2 = {"com/tantanapp/common/nativelib/manager/worker/UnzipWorker$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/tantanapp/common/nativelib/manager/bean/ProjectLibrary;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13622a extends TypeToken<List<? extends ProjectLibrary>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnzipWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
    }

    private final Result unzip(File zipFile, ZipFileInfo zipFileInfo) throws IOException {
        File file = new File(zipFile.getParent(), zipFileInfo.getMd5());
        String strValidateNativeLibrary = validateNativeLibrary(file);
        if (strValidateNativeLibrary != null) {
            return new Result.Success(new Data.Builder().m81542e(InstallWorker.KEY_ZIP_OR_DIR_PATH, strValidateNativeLibrary).m81538a());
        }
        ZipFile zipFileM191066k = tyl.m191066k(zipFile);
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        tyl.m191064i(zipFileM191066k, absolutePath);
        String strValidateNativeLibrary2 = validateNativeLibrary(file);
        return strValidateNativeLibrary2 != null ? new Result.Success(new Data.Builder().m81542e(InstallWorker.KEY_ZIP_OR_DIR_PATH, strValidateNativeLibrary2).m81538a()) : Result.INSTANCE.m81545a("shared lib file md5 check invalidate");
    }

    private final String validateNativeLibrary(File installed) {
        if (!installed.exists()) {
            return null;
        }
        File[] fileArrListFiles = installed.listFiles();
        int i = 0;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        int length = fileArrListFiles.length;
        File file = null;
        boolean z = false;
        while (true) {
            if (i >= length) {
                if (!z) {
                    break;
                }
                break;
            }
            File file2 = fileArrListFiles[i];
            file2.getClass();
            if (Intrinsics.m87488d(bii.m102043s(file2), "json")) {
                if (!z) {
                    z = true;
                    file = file2;
                }
            }
            i++;
            file = null;
            break;
        }
        if (file == null) {
            return null;
        }
        File file3 = new File(installed, bii.m102044t(file));
        if (!file3.exists()) {
            return null;
        }
        Type type = new C13622a().getType();
        String strM218807j = zhi.m218807j(file, null, 1, null);
        type.getClass();
        for (ProjectLibrary projectLibrary : (List) g0g0.m123971a(strM218807j, type)) {
            File file4 = new File(file3, projectLibrary.getName());
            if (!file4.exists() || !Intrinsics.m87488d(tyl.m191062g(file4), projectLibrary.getMd5())) {
                return null;
            }
        }
        return file3.getPath();
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        String strM81536d = getInfo().getInput().m81536d("key_file_path");
        ZipFileInfo zipFileInfo = (ZipFileInfo) getInfo().getInput().m81535c("key_download_info", null);
        boolean zM81534b = getInput().m81534b("key_use_zip", false);
        if (strM81536d.length() == 0) {
            return Result.INSTANCE.m81545a("zipPath is empty");
        }
        if (zipFileInfo == null) {
            return Result.INSTANCE.m81545a("zip file info is null");
        }
        File file = new File(strM81536d);
        if (!file.exists()) {
            return Result.INSTANCE.m81545a("zip file info is null");
        }
        if (!zM81534b) {
            return unzip(file, zipFileInfo);
        }
        return new Result.Success(new Data.Builder().m81542e(InstallWorker.KEY_ZIP_OR_DIR_PATH, StringsKt.m93458y0(strM81536d, "/") + "!/").m81538a());
    }
}
