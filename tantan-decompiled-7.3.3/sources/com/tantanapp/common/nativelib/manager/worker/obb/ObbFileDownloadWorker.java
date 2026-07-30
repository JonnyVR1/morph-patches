package com.tantanapp.common.nativelib.manager.worker.obb;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.common.nativelib.manager.worker.DownloadWorker;
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
import kotlin.p122io.ByteStreamsKt;
import kotlin.p122io.FileSystemException;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.o1m;
import p153l.r3f0;
import p153l.yki;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/obb/ObbFileDownloadWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", "workInfo", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "download", "zipFileInfo", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "obbFilePath", "", "obbModuleFilePath", "procedureDownloadFile", "shouldRetry", Constants.KEY_T, "", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ObbFileDownloadWorker extends Worker {

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.obb.ObbFileDownloadWorker$a */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"com/tantanapp/common/nativelib/manager/worker/obb/ObbFileDownloadWorker$a", "Lcom/tantanapp/common/nativelib/manager/worker/DownloadWorker$a;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C13786a extends DownloadWorker.AbstractC13782a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Result[] f56882a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ObbFileDownloadWorker f56883b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ZipFileInfo f56884c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f56885d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f56886e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CountDownLatch f56887f;

        public C13786a(Result[] resultArr, ObbFileDownloadWorker obbFileDownloadWorker, ZipFileInfo zipFileInfo, String str, String str2, CountDownLatch countDownLatch) {
            this.f56882a = resultArr;
            this.f56883b = obbFileDownloadWorker;
            this.f56884c = zipFileInfo;
            this.f56885d = str;
            this.f56886e = str2;
            this.f56887f = countDownLatch;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObbFileDownloadWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
    }

    private final Result download(ZipFileInfo zipFileInfo, String obbFilePath, String obbModuleFilePath) {
        String str;
        Result resultShouldRetry;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Result.Companion companion = Result.INSTANCE;
        Result[] resultArr = {companion.m82731d()};
        try {
            if (Intrinsics.m88377d(zipFileInfo, ZipFileInfo.INSTANCE.getEMPTY())) {
                return companion.m82728a("Target zip file info is empty");
            }
            String url = zipFileInfo.getUrl();
            if (C15493d.m94374J(url, "file://assets/", false, 2, null)) {
                try {
                    InputStream inputStreamOpen = getAppContext().getAssets().open(C15493d.m94370F(url, "file://assets/", "", false, 4, null));
                    inputStreamOpen.getClass();
                    str = obbModuleFilePath;
                    try {
                        ByteStreamsKt.m88291b(inputStreamOpen, new FileOutputStream(new File(str)), 0, 2, null);
                        resultShouldRetry = procedureDownloadFile(zipFileInfo, obbFilePath, obbModuleFilePath);
                    } catch (Exception e) {
                        e = e;
                        resultShouldRetry = shouldRetry(e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = obbModuleFilePath;
                }
                resultArr[0] = resultShouldRetry;
            } else {
                str = obbModuleFilePath;
            }
            r3f0.INSTANCE.m179611a().m179609g();
            new C13786a(resultArr, this, zipFileInfo, obbFilePath, str, countDownLatch);
            throw null;
        } catch (Exception e3) {
            Result resultShouldRetry2 = shouldRetry(e3);
            resultArr[0] = resultShouldRetry2;
            return resultShouldRetry2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result procedureDownloadFile(ZipFileInfo zipFileInfo, String obbFilePath, String obbModuleFilePath) {
        if (zipFileInfo.getMd5().length() == 0) {
            return Result.INSTANCE.m82728a("File info->md5 is empty");
        }
        if (!new File(obbFilePath).exists()) {
            return shouldRetry(new Exception("After download file not exists: " + obbFilePath));
        }
        if (C15493d.m94381x(zipFileInfo.getMd5(), o1m.m165663g(new File(obbFilePath)), true)) {
            yki.m216469q(new File(obbFilePath), new File(obbModuleFilePath), true, 0, 4, null);
            return new Result.Success(new Data.Builder().m82725e("key_file_path", obbModuleFilePath).m82724d("key_download_info", zipFileInfo).m82721a());
        }
        return shouldRetry(new Exception("File md5 not match: file->" + o1m.m165663g(new File(obbFilePath)) + ", info->" + zipFileInfo.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result shouldRetry(Throwable t) {
        return getInfo().getConstraints().m82715f() ? Result.INSTANCE.m82730c() : Result.INSTANCE.m82729b(t);
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() throws FileSystemException {
        String strM82719d = getInput().m82719d("key_file_path");
        String strM82719d2 = getInput().m82719d("key_obb_file_path");
        ZipFileInfo zipFileInfo = (ZipFileInfo) getInput().m82718c("key_download_info", ZipFileInfo.INSTANCE.getEMPTY());
        String strM82719d3 = getInput().m82719d("key_module_path");
        if (strM82719d2 != null && !StringsKt.m94329e0(strM82719d2)) {
            return new Result.Success(new Data.Builder().m82725e("key_file_path", strM82719d2).m82724d("key_download_info", zipFileInfo).m82721a());
        }
        String absolutePath = new File(strM82719d3, zipFileInfo.getName()).getAbsolutePath();
        absolutePath.getClass();
        if (strM82719d != null && !StringsKt.m94329e0(strM82719d)) {
            yki.m216468p(new File(strM82719d), new File(absolutePath), true, 4096);
            return new Result.Success(new Data.Builder().m82725e("key_file_path", absolutePath).m82724d("key_download_info", zipFileInfo).m82721a());
        }
        String absolutePath2 = new File(getAppContext().getObbDir(), zipFileInfo.getName()).getAbsolutePath();
        absolutePath2.getClass();
        return download(zipFileInfo, absolutePath2, absolutePath);
    }
}
