package com.tantanapp.common.nativelib.manager.worker;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/StarterWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", BaseSei.INFO, "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "abi", "", "baseDir", "downloadInfoList", "", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "module", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class StarterWorker extends Worker {

    @NotNull
    private final String abi;

    @NotNull
    private final String baseDir;

    @NotNull
    private final List<ZipFileInfo> downloadInfoList;

    @NotNull
    private final String module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarterWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
        this.baseDir = getInput().m82719d("key_base_dir");
        this.module = getInput().m82719d("key_module");
        this.abi = getInput().m82719d("key_abi");
        this.downloadInfoList = (List) getInput().m82718c("key_download_info_list", new ArrayList());
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        Object next;
        if (this.baseDir.length() == 0 || this.module.length() == 0) {
            return Result.INSTANCE.m82728a("baseDir or module is empty, baseDie: " + this.baseDir + ", module: " + this.module);
        }
        File file = new File(this.baseDir);
        if (!file.exists() && !file.mkdirs() && getInfo().getConstraints().m82715f()) {
            return Result.INSTANCE.m82730c();
        }
        File file2 = new File(this.baseDir, this.module);
        if (!file2.exists() && !file2.mkdirs() && getInfo().getConstraints().m82715f()) {
            return Result.INSTANCE.m82730c();
        }
        List<ZipFileInfo> list = this.downloadInfoList;
        if (list == null || list.isEmpty()) {
            return Result.INSTANCE.m82728a("Download Info is Empty");
        }
        Iterator<T> it = this.downloadInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ZipFileInfo zipFileInfo = (ZipFileInfo) next;
            if (Intrinsics.m88377d(this.abi, zipFileInfo.getAbi()) && Intrinsics.m88377d(this.module, zipFileInfo.getModule())) {
                break;
            }
        }
        ZipFileInfo zipFileInfo2 = (ZipFileInfo) next;
        if (zipFileInfo2 != null) {
            Data.Builder builder = new Data.Builder();
            String absolutePath = file2.getAbsolutePath();
            absolutePath.getClass();
            return new Result.Success(builder.m82725e("key_module_path", absolutePath).m82724d("key_download_info", zipFileInfo2).m82721a());
        }
        return Result.INSTANCE.m82728a("Target zip file info not found: " + this.module + ", " + this.abi);
    }
}
