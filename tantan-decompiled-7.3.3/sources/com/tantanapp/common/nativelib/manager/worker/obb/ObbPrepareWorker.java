package com.tantanapp.common.nativelib.manager.worker.obb;

import android.content.Context;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.n3f0;
import p153l.r3f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/obb/ObbPrepareWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", "workInfo", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "loadObbFromAssets", "", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "results", "", "(Ljava/util/concurrent/CountDownLatch;[Lcom/tantanapp/sharelib/workmanager/Result;)V", "loadObbFromGP", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ObbPrepareWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObbPrepareWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
    }

    private final void loadObbFromAssets(CountDownLatch countDownLatch, Result[] results) {
        Object next;
        Iterator it = ((List) getInfo().getInput().m82718c("key_download_info_list", CollectionsKt.emptyList())).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m88377d(((ZipFileInfo) next).getModule(), "global"));
        ZipFileInfo zipFileInfo = (ZipFileInfo) next;
        if (zipFileInfo == null) {
            results[0] = Result.INSTANCE.m82728a("Read assets failed");
            countDownLatch.countDown();
        } else {
            results[0] = new Result.Success(new Data.Builder().m82724d("key_download_info", zipFileInfo).m82723c(getInput()).m82721a());
            countDownLatch.countDown();
        }
    }

    private final void loadObbFromGP(CountDownLatch countDownLatch, Result[] results) {
        r3f0.INSTANCE.m179611a().m179610h();
        getAppContext();
        throw null;
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Result[] resultArr = {Result.INSTANCE.m82731d()};
        if (n3f0.INSTANCE.m161288a().mo161287a().invoke().booleanValue()) {
            loadObbFromAssets(countDownLatch, resultArr);
        } else {
            loadObbFromGP(countDownLatch, resultArr);
        }
        try {
            countDownLatch.await();
        } catch (Exception e) {
            resultArr[0] = Result.INSTANCE.m82729b(e);
        }
        return resultArr[0];
    }
}
