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
import kotlin.p118io.ByteStreamsKt;
import kotlin.p118io.FileSystemException;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.bii;
import p149l.kve0;
import p149l.tyl;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/obb/ObbFileDownloadWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "appContext", "Landroid/content/Context;", "workInfo", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "download", "zipFileInfo", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "obbFilePath", "", "obbModuleFilePath", "procedureDownloadFile", "shouldRetry", Constants.KEY_T, "", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ObbFileDownloadWorker extends Worker {

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.obb.ObbFileDownloadWorker$a */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"com/tantanapp/common/nativelib/manager/worker/obb/ObbFileDownloadWorker$a", "Lcom/tantanapp/common/nativelib/manager/worker/DownloadWorker$a;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13623a extends DownloadWorker.AbstractC13619a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Result[] f56034a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ObbFileDownloadWorker f56035b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ZipFileInfo f56036c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f56037d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f56038e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CountDownLatch f56039f;

        public C13623a(Result[] resultArr, ObbFileDownloadWorker obbFileDownloadWorker, ZipFileInfo zipFileInfo, String str, String str2, CountDownLatch countDownLatch) {
            this.f56034a = resultArr;
            this.f56035b = obbFileDownloadWorker;
            this.f56036c = zipFileInfo;
            this.f56037d = str;
            this.f56038e = str2;
            this.f56039f = countDownLatch;
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
        Result[] resultArr = {companion.m81548d()};
        try {
            if (Intrinsics.m87488d(zipFileInfo, ZipFileInfo.INSTANCE.getEMPTY())) {
                return companion.m81545a("Target zip file info is empty");
            }
            String url = zipFileInfo.getUrl();
            if (C15386d.m93483J(url, "file://assets/", false, 2, null)) {
                try {
                    InputStream inputStreamOpen = getAppContext().getAssets().open(C15386d.m93479F(url, "file://assets/", "", false, 4, null));
                    inputStreamOpen.getClass();
                    str = obbModuleFilePath;
                    try {
                        ByteStreamsKt.m87402b(inputStreamOpen, new FileOutputStream(new File(str)), 0, 2, null);
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
            kve0.INSTANCE.m147370a().m147368g();
            new C13623a(resultArr, this, zipFileInfo, obbFilePath, str, countDownLatch);
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
            return Result.INSTANCE.m81545a("File info->md5 is empty");
        }
        if (!new File(obbFilePath).exists()) {
            return shouldRetry(new Exception("After download file not exists: " + obbFilePath));
        }
        if (C15386d.m93490x(zipFileInfo.getMd5(), tyl.m191062g(new File(obbFilePath)), true)) {
            bii.m102041q(new File(obbFilePath), new File(obbModuleFilePath), true, 0, 4, null);
            return new Result.Success(new Data.Builder().m81542e("key_file_path", obbModuleFilePath).m81541d("key_download_info", zipFileInfo).m81538a());
        }
        return shouldRetry(new Exception("File md5 not match: file->" + tyl.m191062g(new File(obbFilePath)) + ", info->" + zipFileInfo.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result shouldRetry(Throwable t) {
        return getInfo().getConstraints().m81532f() ? Result.INSTANCE.m81547c() : Result.INSTANCE.m81546b(t);
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() throws FileSystemException {
        String strM81536d = getInput().m81536d("key_file_path");
        String strM81536d2 = getInput().m81536d("key_obb_file_path");
        ZipFileInfo zipFileInfo = (ZipFileInfo) getInput().m81535c("key_download_info", ZipFileInfo.INSTANCE.getEMPTY());
        String strM81536d3 = getInput().m81536d("key_module_path");
        if (strM81536d2 != null && !StringsKt.m93438e0(strM81536d2)) {
            return new Result.Success(new Data.Builder().m81542e("key_file_path", strM81536d2).m81541d("key_download_info", zipFileInfo).m81538a());
        }
        String absolutePath = new File(strM81536d3, zipFileInfo.getName()).getAbsolutePath();
        absolutePath.getClass();
        if (strM81536d != null && !StringsKt.m93438e0(strM81536d)) {
            bii.m102040p(new File(strM81536d), new File(absolutePath), true, 4096);
            return new Result.Success(new Data.Builder().m81542e("key_file_path", absolutePath).m81541d("key_download_info", zipFileInfo).m81538a());
        }
        String absolutePath2 = new File(getAppContext().getObbDir(), zipFileInfo.getName()).getAbsolutePath();
        absolutePath2.getClass();
        return download(zipFileInfo, absolutePath2, absolutePath);
    }
}
