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
import p153l.o1m;
import p153l.o8g0;
import p153l.wki;
import p153l.yki;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/UnzipWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", BaseSei.INFO, "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "unzip", "zipFile", "Ljava/io/File;", "zipFileInfo", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "validateNativeLibrary", "", "installed", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class UnzipWorker extends Worker {

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.UnzipWorker$a */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m88121d2 = {"com/tantanapp/common/nativelib/manager/worker/UnzipWorker$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/tantanapp/common/nativelib/manager/bean/ProjectLibrary;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C13785a extends TypeToken<List<? extends ProjectLibrary>> {
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
            return new Result.Success(new Data.Builder().m82725e(InstallWorker.KEY_ZIP_OR_DIR_PATH, strValidateNativeLibrary).m82721a());
        }
        ZipFile zipFileM165667k = o1m.m165667k(zipFile);
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        o1m.m165665i(zipFileM165667k, absolutePath);
        String strValidateNativeLibrary2 = validateNativeLibrary(file);
        return strValidateNativeLibrary2 != null ? new Result.Success(new Data.Builder().m82725e(InstallWorker.KEY_ZIP_OR_DIR_PATH, strValidateNativeLibrary2).m82721a()) : Result.INSTANCE.m82728a("shared lib file md5 check invalidate");
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
            if (Intrinsics.m88377d(yki.m216471s(file2), "json")) {
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
        File file3 = new File(installed, yki.m216472t(file));
        if (!file3.exists()) {
            return null;
        }
        Type type = new C13785a().getType();
        String strM206830j = wki.m206830j(file, null, 1, null);
        type.getClass();
        for (ProjectLibrary projectLibrary : (List) o8g0.m166573a(strM206830j, type)) {
            File file4 = new File(file3, projectLibrary.getName());
            if (!file4.exists() || !Intrinsics.m88377d(o1m.m165663g(file4), projectLibrary.getMd5())) {
                return null;
            }
        }
        return file3.getPath();
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        String strM82719d = getInfo().getInput().m82719d("key_file_path");
        ZipFileInfo zipFileInfo = (ZipFileInfo) getInfo().getInput().m82718c("key_download_info", null);
        boolean zM82717b = getInput().m82717b("key_use_zip", false);
        if (strM82719d.length() == 0) {
            return Result.INSTANCE.m82728a("zipPath is empty");
        }
        if (zipFileInfo == null) {
            return Result.INSTANCE.m82728a("zip file info is null");
        }
        File file = new File(strM82719d);
        if (!file.exists()) {
            return Result.INSTANCE.m82728a("zip file info is null");
        }
        if (!zM82717b) {
            return unzip(file, zipFileInfo);
        }
        return new Result.Success(new Data.Builder().m82725e(InstallWorker.KEY_ZIP_OR_DIR_PATH, StringsKt.m94349y0(strM82719d, "/") + "!/").m82721a());
    }
}
