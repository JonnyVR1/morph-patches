package com.tantanapp.common.nativelib.manager.worker.obb;

import android.content.Context;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p149l.tyl;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/obb/ObbFileCheckWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", "workInfo", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ObbFileCheckWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObbFileCheckWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        String absolutePath;
        Data input = getInput();
        ZipFileInfo.Companion companion = ZipFileInfo.INSTANCE;
        ZipFileInfo zipFileInfo = (ZipFileInfo) input.m81535c("key_download_info", companion.getEMPTY());
        String absolutePath2 = new File(getInput().m81536d("key_base_dir"), getInput().m81536d("key_module")).getAbsolutePath();
        if (Intrinsics.m87488d(zipFileInfo, companion.getEMPTY())) {
            return Result.INSTANCE.m81545a("Target obb file info is empty");
        }
        File file = new File(getAppContext().getObbDir(), zipFileInfo.getName());
        String absolutePath3 = "";
        if (file.exists() && C15386d.m93490x(tyl.m191062g(file), zipFileInfo.getMd5(), true)) {
            absolutePath = file.getAbsolutePath();
        } else {
            file.delete();
            absolutePath = "";
        }
        File file2 = new File(absolutePath2, zipFileInfo.getName());
        if (file2.exists() && C15386d.m93490x(tyl.m191062g(file2), zipFileInfo.getMd5(), true)) {
            absolutePath3 = file2.getAbsolutePath();
        }
        Data.Builder builder = new Data.Builder();
        absolutePath2.getClass();
        Data.Builder builderM81542e = builder.m81542e("key_module_path", absolutePath2);
        absolutePath3.getClass();
        Data.Builder builderM81541d = builderM81542e.m81541d("key_obb_file_path", absolutePath3);
        absolutePath.getClass();
        return new Result.Success(builderM81541d.m81541d("key_file_path", absolutePath).m81540c(getInput()).m81538a());
    }
}
