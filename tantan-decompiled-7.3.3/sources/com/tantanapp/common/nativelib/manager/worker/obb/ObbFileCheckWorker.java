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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.o1m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/obb/ObbFileCheckWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", "workInfo", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
        ZipFileInfo zipFileInfo = (ZipFileInfo) input.m82718c("key_download_info", companion.getEMPTY());
        String absolutePath2 = new File(getInput().m82719d("key_base_dir"), getInput().m82719d("key_module")).getAbsolutePath();
        if (Intrinsics.m88377d(zipFileInfo, companion.getEMPTY())) {
            return Result.INSTANCE.m82728a("Target obb file info is empty");
        }
        File file = new File(getAppContext().getObbDir(), zipFileInfo.getName());
        String absolutePath3 = "";
        if (file.exists() && C15493d.m94381x(o1m.m165663g(file), zipFileInfo.getMd5(), true)) {
            absolutePath = file.getAbsolutePath();
        } else {
            file.delete();
            absolutePath = "";
        }
        File file2 = new File(absolutePath2, zipFileInfo.getName());
        if (file2.exists() && C15493d.m94381x(o1m.m165663g(file2), zipFileInfo.getMd5(), true)) {
            absolutePath3 = file2.getAbsolutePath();
        }
        Data.Builder builder = new Data.Builder();
        absolutePath2.getClass();
        Data.Builder builderM82725e = builder.m82725e("key_module_path", absolutePath2);
        absolutePath3.getClass();
        Data.Builder builderM82724d = builderM82725e.m82724d("key_obb_file_path", absolutePath3);
        absolutePath.getClass();
        return new Result.Success(builderM82724d.m82724d("key_file_path", absolutePath).m82723c(getInput()).m82721a());
    }
}
