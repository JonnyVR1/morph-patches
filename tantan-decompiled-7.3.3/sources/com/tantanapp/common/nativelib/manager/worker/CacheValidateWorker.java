package com.tantanapp.common.nativelib.manager.worker;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.o1m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/CacheValidateWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", BaseSei.INFO, "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "zipFilePath", "", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class CacheValidateWorker extends Worker {

    @NotNull
    private String zipFilePath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheValidateWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
        this.zipFilePath = "";
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        String absolutePath;
        Data input = getInput();
        ZipFileInfo.Companion companion = ZipFileInfo.INSTANCE;
        Object objM82718c = input.m82718c("key_download_info", companion.getEMPTY());
        String strM82719d = getInput().m82719d("key_module_path");
        if (Intrinsics.m88377d(objM82718c, companion.getEMPTY())) {
            return Result.INSTANCE.m82728a("Target zip file info is empty");
        }
        ZipFileInfo zipFileInfo = (ZipFileInfo) objM82718c;
        File file = new File(strM82719d, zipFileInfo.getName());
        if (file.exists() && Intrinsics.m88377d(zipFileInfo.getMd5(), o1m.m165663g(file))) {
            absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
        } else {
            absolutePath = "";
        }
        this.zipFilePath = absolutePath;
        return new Result.Success(new Data.Builder().m82725e("key_file_path", this.zipFilePath).m82723c(getInfo().getInput()).m82721a());
    }
}
