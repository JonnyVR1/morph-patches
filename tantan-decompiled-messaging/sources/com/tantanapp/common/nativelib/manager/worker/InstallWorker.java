package com.tantanapp.common.nativelib.manager.worker;

import android.app.Application;
import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.kri0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/InstallWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "Landroid/content/Context;", "appContext", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", BaseSei.INFO, "<init>", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "Lcom/tantanapp/sharelib/workmanager/Result;", "doWork", "()Lcom/tantanapp/sharelib/workmanager/Result;", "Companion", "a", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class InstallWorker extends Worker {

    @NotNull
    public static final String KEY_ZIP_OR_DIR_PATH = "zip_or_dir_path";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        String strM81536d = getInfo().getInput().m81536d(KEY_ZIP_OR_DIR_PATH);
        if (strM81536d.length() == 0) {
            return Result.INSTANCE.m81545a("zipOrDirPath is empty");
        }
        Context appContext = getAppContext();
        appContext.getClass();
        return kri0.m146982d((Application) appContext, new File(strM81536d)) ? new Result.Success(new Data.Builder().m81540c(getInfo().getInput()).m81538a()) : Result.INSTANCE.m81545a("installNativeLibraryABIWithoutTinkerInstalled failed");
    }
}
