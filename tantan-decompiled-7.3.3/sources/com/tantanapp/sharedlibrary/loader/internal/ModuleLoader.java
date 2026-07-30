package com.tantanapp.sharedlibrary.loader.internal;

import android.provider.Settings;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.android.vending.licensing.ServiceConnectionC2660b;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.ThreadUtil;
import com.tantanapp.sharedlibrary.loader.C13846a;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.C17606i;
import p153l.C18758n1;
import p153l.npj0;
import p153l.q5d0;
import p153l.wdr;
import p153l.yki;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J;\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001b2\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/ModuleLoader;", "", "<init>", "()V", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "", "module", "Lkotlin/Function1;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "", "callback", "m", "(Lcom/tantanapp/sharedlibrary/loader/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "extras", "Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "f", "(Lcom/tantanapp/sharedlibrary/loader/a;Ljava/lang/String;Ljava/util/Map;)Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "moduleZipInfo", "Ll/q5d0;", "j", "(Lcom/tantanapp/sharedlibrary/loader/a;Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;Ljava/util/Map;)Ll/q5d0;", "h", "n", "g", "p", "", "Lcom/tantanapp/sharedlibrary/loader/internal/SoInfo;", "k", "(Lcom/tantanapp/sharedlibrary/loader/a;Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;)Ljava/util/List;", "missingSoInfoList", "Lcom/tantanapp/sharedlibrary/loader/internal/ZipInfo;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;Ljava/util/List;)Ljava/util/List;", "a", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ModuleLoader {

    @NotNull
    public static final ModuleLoader INSTANCE = new ModuleLoader();

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$a */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00120\u0010\f\u001a,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015RA\u0010\f\u001a,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/ModuleLoader$a;", "", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "step", "", "retryCount", "Lkotlin/Function3;", "Lcom/tantanapp/sharedlibrary/loader/a;", "Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "", "", "Ll/q5d0;", "action", "<init>", "(Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;ILkotlin/jvm/functions/Function3;)V", "a", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "c", "()Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "b", "I", "()I", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C13848a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final LoadEvent.Step step;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int retryCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Function3<C13846a, ModuleZipInfo, Map<String, Object>, q5d0<?>> action;

        /* JADX WARN: Multi-variable type inference failed */
        public C13848a(@NotNull LoadEvent.Step step, int i, @NotNull Function3<? super C13846a, ? super ModuleZipInfo, ? super Map<String, Object>, ? extends q5d0<?>> function3) {
            step.getClass();
            function3.getClass();
            this.step = step;
            this.retryCount = i;
            this.action = function3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function3<C13846a, ModuleZipInfo, Map<String, Object>, q5d0<?>> m82697a() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LoadEvent.Step getStep() {
            return this.step;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"com/tantanapp/sharedlibrary/loader/internal/ModuleLoader$b", "Ll/wdr;", "", "p0", "", "a", "(I)V", "b", "c", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C13849b implements wdr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18758n1 f57053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map<String, Object> f57054b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ModuleZipInfo f57055c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ q5d0<Unit>[] f57056d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CountDownLatch f57057e;

        public C13849b(C18758n1 c18758n1, Map<String, Object> map, ModuleZipInfo moduleZipInfo, q5d0<Unit>[] q5d0VarArr, CountDownLatch countDownLatch) {
            this.f57053a = c18758n1;
            this.f57054b = map;
            this.f57055c = moduleZipInfo;
            this.f57056d = q5d0VarArr;
            this.f57057e = countDownLatch;
        }

        @Override // p153l.wdr
        /* JADX INFO: renamed from: a */
        public void mo82700a(int p0) {
            Object next;
            if (this.f57053a.m161044f() > 0) {
                String strM161043e = this.f57053a.m161043e(0);
                String strM161042d = this.f57053a.m161042d(0);
                UtilKt.m82705c("fetchObbInfo: url=" + strM161043e + ", name=" + strM161042d);
                Object obj = this.f57054b.get("missing_zip_info_list");
                obj.getClass();
                List mutableList = CollectionsKt.toMutableList((Collection) obj);
                ZipInfo obbZipInfo = this.f57055c.getObbZipInfo();
                UtilKt.m82705c("fetchObbInfo obbZipInfo=" + obbZipInfo.getName() + ',' + obbZipInfo.getUrl());
                Iterator it = mutableList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ZipInfo zipInfo = (ZipInfo) next;
                    if (Intrinsics.m88377d(zipInfo.getName(), obbZipInfo.getName()) && Intrinsics.m88377d(zipInfo.getAbi(), obbZipInfo.getAbi()) && Intrinsics.m88377d(zipInfo.getMd5(), obbZipInfo.getMd5())) {
                        break;
                    }
                }
                ZipInfo zipInfo2 = (ZipInfo) next;
                StringBuilder sb = new StringBuilder("fetchObbInfo findZipInfo=");
                sb.append(zipInfo2 != null ? zipInfo2.getName() : null);
                sb.append(',');
                sb.append(zipInfo2 != null ? zipInfo2.getUrl() : null);
                UtilKt.m82705c(sb.toString());
                if (zipInfo2 != null) {
                    mutableList.remove(zipInfo2);
                    strM161042d.getClass();
                    strM161043e.getClass();
                    mutableList.add(ZipInfo.copy$default(zipInfo2, null, strM161042d, null, 0L, strM161043e, null, 45, null));
                    this.f57054b.put("missing_zip_info_list", mutableList);
                }
                ModuleZipInfo moduleZipInfo = this.f57055c;
                strM161043e.getClass();
                strM161042d.getClass();
                moduleZipInfo.setObbInfo(strM161043e, strM161042d);
                this.f57056d[0] = q5d0.INSTANCE.m175357d();
            } else {
                this.f57056d[0] = q5d0.INSTANCE.m175354a("LicenseChecker get url failed");
            }
            this.f57057e.countDown();
        }

        @Override // p153l.wdr
        /* JADX INFO: renamed from: b */
        public void mo82701b(int p0) {
            this.f57056d[0] = q5d0.INSTANCE.m175356c("LicenseChecker dontAllow: " + p0);
            this.f57057e.countDown();
        }

        @Override // p153l.wdr
        /* JADX INFO: renamed from: c */
        public void mo82702c(int p0) {
            this.f57056d[0] = q5d0.INSTANCE.m175356c("LicenseChecker applicationError: " + p0);
            this.f57057e.countDown();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final List<ZipInfo> m82686i(Map<String, Object> map, C13846a c13846a) {
        Object obj = map.get("missing_zip_info_list");
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            ZipInfo zipInfo = (ZipInfo) obj2;
            File file = new File(c13846a.m82658a(), zipInfo.getName());
            if (!UtilKt.m82703a(file, zipInfo.getMd5())) {
                UtilKt.m82707e(file);
                arrayList.add(obj2);
            }
        }
        UtilKt.m82705c("checkDownload=" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$download$checkDownload$2$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull ZipInfo zipInfo2) {
                zipInfo2.getClass();
                return zipInfo2.getName();
            }
        }, 31, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m82687o(Map<String, Object> map, C13846a c13846a) {
        Object obj = map.get("missing_so_info_list");
        obj.getClass();
        List<SoInfo> list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (SoInfo soInfo : list) {
            if (!UtilKt.m82703a(new File(c13846a.m82670m(), soInfo.getName()), soInfo.getMd5())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final ModuleZipInfo m82688f(C13846a config, String module, Map<String, Object> extras) {
        AssetsHelper assetsHelper = AssetsHelper.INSTANCE;
        if (assetsHelper.m82675c()) {
            UtilKt.m82705c("checkNeedLoad apkHasSoFiles=true");
            return null;
        }
        ModuleZipInfo moduleZipInfoM82679g = assetsHelper.m82679g(module);
        List<SoInfo> listM82692k = m82692k(config, moduleZipInfoM82679g);
        if (listM82692k.isEmpty()) {
            UtilKt.m82705c("checkNeedLoad verifySo success");
            return null;
        }
        List<ZipInfo> listM82693l = m82693l(moduleZipInfoM82679g, listM82692k);
        extras.put("missing_so_info_list", listM82692k);
        extras.put("missing_zip_info_list", listM82693l);
        UtilKt.m82705c("EXTRA_MISSING_SO_INFO_LIST=" + listM82692k);
        UtilKt.m82705c("EXTRA_MISSING_ZIP_INFO_LIST=" + listM82693l);
        UtilKt.m82705c("checkNeedLoad delete and make unzip dir=" + config.m82670m());
        File fileM82670m = config.m82670m();
        UtilKt.m82707e(fileM82670m);
        UtilKt.m82708f(fileM82670m);
        return moduleZipInfoM82679g;
    }

    /* JADX INFO: renamed from: g */
    public final q5d0<Unit> m82689g(C13846a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) {
        Object objM225066constructorimpl;
        StringBuilder sb = new StringBuilder("mergeSo: soPathFileListBeforeCopyNew=");
        File[] fileArrListFiles = config.m82669l().listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        sb.append(ArraysKt.joinToString$default(fileArrListFiles, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<File, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$copySo$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(File file) {
                String name = file.getName();
                name.getClass();
                return name;
            }
        }, 31, (Object) null));
        UtilKt.m82705c(sb.toString());
        File[] fileArrListFiles2 = config.m82670m().listFiles();
        if (fileArrListFiles2 == null) {
            fileArrListFiles2 = new File[0];
        }
        List list = ArraysKt.toList(fileArrListFiles2);
        StringBuilder sb2 = new StringBuilder("mergeSo: unzipFileList=");
        List<File> list2 = list;
        sb2.append(CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1<File, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$copySo$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(File file) {
                String name = file.getName();
                name.getClass();
                return name;
            }
        }, 31, null));
        UtilKt.m82705c(sb2.toString());
        for (File file : list2) {
            File file2 = new File(config.m82669l(), file.getName());
            boolean zExists = file2.exists();
            UtilKt.m82705c("mergeSo: copyTo file=" + file2 + ", exist=" + zExists);
            if (zExists) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM225066constructorimpl = Result.m225066constructorimpl(yki.m216469q(file, file2, true, 0, 4, null));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
                }
                if (Result.m225069exceptionOrNullimpl(objM225066constructorimpl) != null) {
                    UtilKt.m82705c("mergeSo: copyTo failed file=" + file2);
                }
            } else {
                yki.m216469q(file, file2, true, 0, 4, null);
            }
        }
        StringBuilder sb3 = new StringBuilder("mergeSo: soPathFileListAfterCopyNew=");
        File[] fileArrListFiles3 = config.m82669l().listFiles();
        if (fileArrListFiles3 == null) {
            fileArrListFiles3 = new File[0];
        }
        sb3.append(ArraysKt.joinToString$default(fileArrListFiles3, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<File, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$copySo$4
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(File file3) {
                String name = file3.getName();
                name.getClass();
                return name;
            }
        }, 31, (Object) null));
        UtilKt.m82705c(sb3.toString());
        UtilKt.m82707e(config.m82670m());
        return q5d0.INSTANCE.m175357d();
    }

    /* JADX INFO: renamed from: h */
    public final q5d0<Unit> m82690h(C13846a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) throws InterruptedException {
        List<ZipInfo> listM82686i = m82686i(extras, config);
        if (listM82686i.isEmpty()) {
            UtilKt.m82705c("download skip");
            return q5d0.INSTANCE.m175357d();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(listM82686i.size());
        final ArrayList arrayList = new ArrayList();
        for (final ZipInfo zipInfo : listM82686i) {
            UtilKt.m82705c("download: url=" + zipInfo.getUrl() + ", path=" + config.m82658a().getAbsolutePath() + ", fileName=" + zipInfo.getName());
            C13846a.a downloader = config.getDownloader();
            String url = zipInfo.getUrl();
            String absolutePath = config.m82658a().getAbsolutePath();
            absolutePath.getClass();
            downloader.mo82671a(url, absolutePath, zipInfo.getName(), new Function1<q5d0<Unit>, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$download$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull q5d0<Unit> q5d0Var) {
                    q5d0Var.getClass();
                    if (q5d0Var.m175352d()) {
                        UtilKt.m82705c("download isFailure name=" + zipInfo.getName() + ", exception=" + q5d0Var.m175350b());
                        arrayList.add(TuplesKt.m88129a(zipInfo.getName(), q5d0Var.m175350b()));
                    }
                    countDownLatch.countDown();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(q5d0<Unit> q5d0Var) {
                    invoke2(q5d0Var);
                    return Unit.INSTANCE;
                }
            });
        }
        countDownLatch.await();
        List<ZipInfo> listM82686i2 = m82686i(extras, config);
        if (listM82686i2.isEmpty()) {
            return q5d0.INSTANCE.m175357d();
        }
        return q5d0.INSTANCE.m175354a("download failed=" + CollectionsKt.joinToString$default(listM82686i2, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$download$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull ZipInfo zipInfo2) {
                zipInfo2.getClass();
                return zipInfo2.getName();
            }
        }, 31, null) + "\nfailureInfo=" + arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final q5d0<Unit> m82691j(C13846a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) throws InterruptedException {
        if (config.getMockObb() || !config.getUseObb()) {
            UtilKt.m82705c("fetchObbInfoIfNeeded skip");
            return q5d0.INSTANCE.m175357d();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        q5d0<Unit>[] q5d0VarArr = {q5d0.INSTANCE.m175354a("")};
        C18758n1 c18758n1 = new C18758n1(config.getContext(), new C17606i(config.getObbSalt(), config.getContext().getPackageName(), Settings.Secure.getString(config.getContext().getContentResolver(), "android_id")));
        c18758n1.m161045g();
        new ServiceConnectionC2660b(config.getContext(), c18758n1, config.getObbPublicKey()).m15449f(new C13849b(c18758n1, extras, moduleZipInfo, q5d0VarArr, countDownLatch));
        countDownLatch.await();
        return q5d0VarArr[0];
    }

    /* JADX INFO: renamed from: k */
    public final List<SoInfo> m82692k(C13846a config, ModuleZipInfo moduleZipInfo) {
        UtilKt.m82705c("start verifySo " + moduleZipInfo.getName());
        File[] fileArrListFiles = config.m82669l().listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        List list = ArraysKt.toList(fileArrListFiles);
        StringBuilder sb = new StringBuilder("soPathFileList=");
        List list2 = list;
        sb.append(CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1<File, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingSoInfoList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(File file) {
                String name = file.getName();
                name.getClass();
                return name;
            }
        }, 31, null));
        UtilKt.m82705c(sb.toString());
        List<ZipInfo> zipInfoList = moduleZipInfo.getZipInfoList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = zipInfoList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ZipInfo) it.next()).getSoInfoList());
        }
        UtilKt.m82705c("moduleSoInfoList=" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingSoInfoList$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull SoInfo soInfo) {
                soInfo.getClass();
                return soInfo.getName();
            }
        }, 31, null));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            SoInfo soInfo = (SoInfo) obj;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        File file = (File) it2.next();
                        if (Intrinsics.m88377d(file.getName(), soInfo.getName()) && UtilKt.m82703a(file, soInfo.getMd5())) {
                            break;
                        }
                    }
                }
            }
            arrayList2.add(obj);
        }
        UtilKt.m82705c("missingSoInfoList=" + CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingSoInfoList$3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull SoInfo soInfo2) {
                soInfo2.getClass();
                return soInfo2.getName();
            }
        }, 31, null));
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public final List<ZipInfo> m82693l(ModuleZipInfo moduleZipInfo, List<SoInfo> missingSoInfoList) {
        ZipInfo zipInfo;
        List<SoInfo> list = missingSoInfoList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SoInfo soInfo : list) {
            Iterator<T> it = moduleZipInfo.getZipInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    npj0.m164229a("Collection contains no element matching the predicate.");
                    return null;
                }
                zipInfo = (ZipInfo) it.next();
                List<SoInfo> soInfoList = zipInfo.getSoInfoList();
                if (!(soInfoList instanceof Collection) || !soInfoList.isEmpty()) {
                    Iterator<T> it2 = soInfoList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.m88377d((SoInfo) it2.next(), soInfo)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            arrayList.add(zipInfo);
        }
        List<ZipInfo> list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        UtilKt.m82705c("missingZipInfoList=" + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingZipInfoList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull ZipInfo zipInfo2) {
                zipInfo2.getClass();
                return zipInfo2.getName();
            }
        }, 31, null));
        return list2;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m82694m(@NotNull C13846a config, @NotNull String module, @NotNull Function1<? super LoadEvent, Unit> callback) {
        try {
            config.getClass();
            module.getClass();
            callback.getClass();
            if (ThreadUtil.m82494f()) {
                throw new IllegalStateException("Load can not be called in ui thread!");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LoadEvent.Companion companion = LoadEvent.INSTANCE;
            LoadEvent.Step step = LoadEvent.Step.CheckNeedLoad;
            callback.invoke(companion.m82626b(step));
            ModuleZipInfo moduleZipInfoM82688f = m82688f(config, module, linkedHashMap);
            UtilKt.m82705c("checkNeedLoad: ".concat(moduleZipInfoM82688f == null ? "no need" : "need"));
            callback.invoke(LoadEvent.Companion.m82624d(companion, step, null, 2, null));
            for (C13848a c13848a : CollectionsKt.listOf((Object[]) new C13848a[]{new C13848a(LoadEvent.Step.FetchObbInfoIfNeeded, 3, new ModuleLoader$load$1(this)), new C13848a(LoadEvent.Step.Download, 3, new ModuleLoader$load$2(this)), new C13848a(LoadEvent.Step.Unzip, 3, new ModuleLoader$load$3(this)), new C13848a(LoadEvent.Step.CopySo, 1, new ModuleLoader$load$4(this)), new C13848a(LoadEvent.Step.VerifySo, 1, new ModuleLoader$load$5(this))})) {
                LoadEvent.Companion companion2 = LoadEvent.INSTANCE;
                callback.invoke(companion2.m82626b(c13848a.getStep()));
                if (moduleZipInfoM82688f == null) {
                    callback.invoke(companion2.m82627c(c13848a.getStep(), FreeSpaceBox.TYPE));
                } else {
                    q5d0<?> q5d0VarM175357d = q5d0.INSTANCE.m175357d();
                    int retryCount = c13848a.getRetryCount();
                    int i = 0;
                    do {
                        if (i >= retryCount) {
                            callback.invoke(LoadEvent.INSTANCE.m82625a(c13848a.getStep(), q5d0VarM175357d.m175349a()));
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("trying ");
                        sb.append(c13848a.getStep());
                        sb.append(' ');
                        i++;
                        sb.append(i);
                        UtilKt.m82705c(sb.toString());
                        try {
                            q5d0VarM175357d = c13848a.m82697a().invoke(config, moduleZipInfoM82688f, linkedHashMap);
                        } catch (Throwable th) {
                            q5d0VarM175357d = q5d0.INSTANCE.m175355b(th);
                        }
                    } while (!q5d0VarM175357d.m175353e());
                    callback.invoke(LoadEvent.INSTANCE.m82627c(c13848a.getStep(), q5d0VarM175357d.m175351c()));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final q5d0<Unit> m82695n(C13846a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) throws IOException {
        if (m82687o(extras, config)) {
            UtilKt.m82705c("unzip skip");
            return q5d0.INSTANCE.m175357d();
        }
        UtilKt.m82707e(config.m82670m());
        UtilKt.m82708f(config.m82670m());
        Object obj = extras.get("missing_zip_info_list");
        obj.getClass();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            File file = new File(config.m82658a(), ((ZipInfo) it.next()).getName());
            String absolutePath = config.m82670m().getAbsolutePath();
            absolutePath.getClass();
            UtilKt.m82709g(file, absolutePath);
        }
        return m82687o(extras, config) ? q5d0.INSTANCE.m175357d() : q5d0.INSTANCE.m175354a("unzip failed");
    }

    /* JADX INFO: renamed from: p */
    public final q5d0<Unit> m82696p(C13846a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) {
        List<SoInfo> listM82692k = m82692k(config, moduleZipInfo);
        if (listM82692k.isEmpty()) {
            return q5d0.INSTANCE.m175357d();
        }
        return q5d0.INSTANCE.m175354a("verifySo failed: missingSoInfoList=" + CollectionsKt.joinToString$default(listM82692k, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$verifySo$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull SoInfo soInfo) {
                soInfo.getClass();
                return soInfo.getName();
            }
        }, 31, null));
    }
}
