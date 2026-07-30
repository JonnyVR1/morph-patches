package com.tantanapp.common.nativelib.manager.worker;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p118io.ByteStreamsKt;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p149l.kve0;
import p149l.tyl;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/DownloadWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "Landroid/content/Context;", "appContext", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "workInfo", "<init>", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "zipFileInfo", "", "filePath", "Lcom/tantanapp/sharelib/workmanager/Result;", "procedureDownloadFile", "(Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;Ljava/lang/String;)Lcom/tantanapp/sharelib/workmanager/Result;", "", Constants.KEY_T, "shouldRetry", "(Ljava/lang/Throwable;)Lcom/tantanapp/sharelib/workmanager/Result;", "doWork", "()Lcom/tantanapp/sharelib/workmanager/Result;", "a", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class DownloadWorker extends Worker {

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.DownloadWorker$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/DownloadWorker$a;", "", "<init>", "()V", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static abstract class AbstractC13619a {
    }

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.DownloadWorker$b */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"com/tantanapp/common/nativelib/manager/worker/DownloadWorker$b", "Lcom/tantanapp/common/nativelib/manager/worker/DownloadWorker$a;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13620b extends AbstractC13619a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Result[] f56030a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DownloadWorker f56031b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ZipFileInfo f56032c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CountDownLatch f56033d;

        public C13620b(Result[] resultArr, DownloadWorker downloadWorker, ZipFileInfo zipFileInfo, CountDownLatch countDownLatch) {
            this.f56030a = resultArr;
            this.f56031b = downloadWorker;
            this.f56032c = zipFileInfo;
            this.f56033d = countDownLatch;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result procedureDownloadFile(ZipFileInfo zipFileInfo, String filePath) {
        if (zipFileInfo.getMd5().length() == 0) {
            return Result.INSTANCE.m81545a("File info->md5 is empty");
        }
        if (!new File(filePath).exists()) {
            return shouldRetry(new Exception("After download file not exists: " + filePath));
        }
        if (Intrinsics.m87488d(zipFileInfo.getMd5(), tyl.m191062g(new File(filePath)))) {
            return new Result.Success(new Data.Builder().m81542e("key_file_path", filePath).m81541d("key_download_info", zipFileInfo).m81538a());
        }
        return shouldRetry(new Exception("File md5 not match: file->" + tyl.m191062g(new File(filePath)) + ", info->" + zipFileInfo.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result shouldRetry(Throwable t) {
        return getInfo().getConstraints().m81532f() ? Result.INSTANCE.m81547c() : Result.INSTANCE.m81546b(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.tantanapp.sharelib.workmanager.Result] */
    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() {
        String strM81536d = getInput().m81536d("key_file_path");
        Data input = getInput();
        ZipFileInfo.Companion companion = ZipFileInfo.INSTANCE;
        ZipFileInfo zipFileInfo = (ZipFileInfo) input.m81535c("key_download_info", companion.getEMPTY());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Result.Companion companion2 = Result.INSTANCE;
        Result[] resultArr = {companion2.m81548d()};
        try {
            if (strM81536d.length() > 0) {
                return new Result.Success(getInfo().getInput());
            }
            if (Intrinsics.m87488d(zipFileInfo, companion.getEMPTY())) {
                return companion2.m81545a("Target zip file info is empty");
            }
            String absolutePath = new File(getInput().m81536d("key_module_path"), zipFileInfo.getName()).getAbsolutePath();
            String url = zipFileInfo.getUrl();
            if (!C15386d.m93483J(url, "file://assets/", false, 2, null)) {
                kve0.INSTANCE.m147370a().m147368g();
                absolutePath.getClass();
                new C13620b(resultArr, this, zipFileInfo, countDownLatch);
                throw null;
            }
            try {
                InputStream inputStreamOpen = getAppContext().getAssets().open(C15386d.m93479F(url, "file://assets/", "", false, 4, null));
                inputStreamOpen.getClass();
                ByteStreamsKt.m87402b(inputStreamOpen, new FileOutputStream(new File(absolutePath)), 0, 2, null);
                absolutePath.getClass();
                this = procedureDownloadFile(zipFileInfo, absolutePath);
                return this;
            } catch (Exception e) {
                return shouldRetry(e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            Result resultShouldRetry = this.shouldRetry(e2);
            resultArr[0] = resultShouldRetry;
            return resultShouldRetry;
        }
    }
}
