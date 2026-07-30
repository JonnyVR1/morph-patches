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
import p153l.n0j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/InstallWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "Landroid/content/Context;", "appContext", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", BaseSei.INFO, "<init>", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "Lcom/tantanapp/sharelib/workmanager/Result;", "doWork", "()Lcom/tantanapp/sharelib/workmanager/Result;", "Companion", "a", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
        String strM82719d = getInfo().getInput().m82719d(KEY_ZIP_OR_DIR_PATH);
        if (strM82719d.length() == 0) {
            return Result.INSTANCE.m82728a("zipOrDirPath is empty");
        }
        Context appContext = getAppContext();
        appContext.getClass();
        return n0j0.m160993d((Application) appContext, new File(strM82719d)) ? new Result.Success(new Data.Builder().m82723c(getInfo().getInput()).m82721a()) : Result.INSTANCE.m82728a("installNativeLibraryABIWithoutTinkerInstalled failed");
    }
}
