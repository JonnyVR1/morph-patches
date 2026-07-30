package com.tantanapp.common.nativelib.manager.worker;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.tantanapp.common.nativelib.manager.bean.ZipFileInfo;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p149l.g0g0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/worker/AssetsReaderWorker;", "Lcom/tantanapp/sharelib/workmanager/Worker;", "Landroid/content/Context;", "appContext", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "workInfo", "<init>", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "Lcom/tantanapp/sharelib/workmanager/Result;", "doWork", "()Lcom/tantanapp/sharelib/workmanager/Result;", "", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "downloadInfo", "Ljava/util/List;", "Companion", "a", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AssetsReaderWorker extends Worker {

    @NotNull
    private static final String ASSETS_FILE_DIR = "sharedlibrary";

    @NotNull
    private static final String ASSETS_FILE_PREFIX = "libraries-assets-";

    @NotNull
    public static final String TAG = "assets_reader";

    @NotNull
    private final List<ZipFileInfo> downloadInfo;

    /* JADX INFO: renamed from: com.tantanapp.common.nativelib.manager.worker.AssetsReaderWorker$b */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m87232d2 = {"com/tantanapp/common/nativelib/manager/worker/AssetsReaderWorker$b", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13618b extends TypeToken<List<? extends ZipFileInfo>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsReaderWorker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        super(context, workInfo);
        context.getClass();
        workInfo.getClass();
        this.downloadInfo = new ArrayList();
    }

    @Override // com.tantanapp.sharelib.workmanager.Worker
    @NotNull
    public Result doWork() throws IOException {
        Type type = new C13618b().getType();
        String[] list = getAppContext().getAssets().list(ASSETS_FILE_DIR);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (str != null && str.length() != 0) {
                    str.getClass();
                    if (C15386d.m93483J(str, ASSETS_FILE_PREFIX, false, 2, null)) {
                        arrayList.add(str);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InputStream inputStreamOpen = getAppContext().getAssets().open("sharedlibrary/" + ((String) it.next()));
                inputStreamOpen.getClass();
                List list2 = (List) g0g0.m123972b().fromJson(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), type);
                List<ZipFileInfo> list3 = this.downloadInfo;
                list2.getClass();
                list3.addAll(list2);
            }
        }
        return new Result.Success(new Data.Builder().m81541d("key_download_info_list", this.downloadInfo).m81538a());
    }
}
