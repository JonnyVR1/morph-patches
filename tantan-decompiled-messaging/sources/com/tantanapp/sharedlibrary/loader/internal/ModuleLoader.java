package com.tantanapp.sharedlibrary.loader.internal;

import android.provider.Settings;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.android.vending.licensing.ServiceConnectionC2637b;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.ThreadUtil;
import com.tantanapp.sharedlibrary.loader.C13683a;
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
import p149l.C17440i;
import p149l.C18601n1;
import p149l.bii;
import p149l.kgj0;
import p149l.nxc0;
import p149l.ubr;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J;\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001b2\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006$"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/ModuleLoader;", "", "<init>", "()V", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "", "module", "Lkotlin/Function1;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "", "callback", "m", "(Lcom/tantanapp/sharedlibrary/loader/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "extras", "Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "f", "(Lcom/tantanapp/sharedlibrary/loader/a;Ljava/lang/String;Ljava/util/Map;)Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "moduleZipInfo", "Ll/nxc0;", "j", "(Lcom/tantanapp/sharedlibrary/loader/a;Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;Ljava/util/Map;)Ll/nxc0;", "h", "n", "g", "p", "", "Lcom/tantanapp/sharedlibrary/loader/internal/SoInfo;", "k", "(Lcom/tantanapp/sharedlibrary/loader/a;Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;)Ljava/util/List;", "missingSoInfoList", "Lcom/tantanapp/sharedlibrary/loader/internal/ZipInfo;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;Ljava/util/List;)Ljava/util/List;", "a", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ModuleLoader {

    @NotNull
    public static final ModuleLoader INSTANCE = new ModuleLoader();

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$a */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00120\u0010\f\u001a,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015RA\u0010\f\u001a,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/ModuleLoader$a;", "", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "step", "", "retryCount", "Lkotlin/Function3;", "Lcom/tantanapp/sharedlibrary/loader/a;", "Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "", "", "Ll/nxc0;", "action", "<init>", "(Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;ILkotlin/jvm/functions/Function3;)V", "a", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "c", "()Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "b", "I", "()I", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13685a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final LoadEvent.Step step;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int retryCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Function3<C13683a, ModuleZipInfo, Map<String, Object>, nxc0<?>> action;

        /* JADX WARN: Multi-variable type inference failed */
        public C13685a(@NotNull LoadEvent.Step step, int i, @NotNull Function3<? super C13683a, ? super ModuleZipInfo, ? super Map<String, Object>, ? extends nxc0<?>> function3) {
            step.getClass();
            function3.getClass();
            this.step = step;
            this.retryCount = i;
            this.action = function3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function3<C13683a, ModuleZipInfo, Map<String, Object>, nxc0<?>> m81514a() {
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
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"com/tantanapp/sharedlibrary/loader/internal/ModuleLoader$b", "Ll/ubr;", "", "p0", "", "a", "(I)V", "b", "c", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C13686b implements ubr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18601n1 f56205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map<String, Object> f56206b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ModuleZipInfo f56207c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ nxc0<Unit>[] f56208d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CountDownLatch f56209e;

        public C13686b(C18601n1 c18601n1, Map<String, Object> map, ModuleZipInfo moduleZipInfo, nxc0<Unit>[] nxc0VarArr, CountDownLatch countDownLatch) {
            this.f56205a = c18601n1;
            this.f56206b = map;
            this.f56207c = moduleZipInfo;
            this.f56208d = nxc0VarArr;
            this.f56209e = countDownLatch;
        }

        @Override // p149l.ubr
        /* JADX INFO: renamed from: a */
        public void mo81517a(int p0) {
            Object next;
            if (this.f56205a.m157306f() > 0) {
                String strM157305e = this.f56205a.m157305e(0);
                String strM157304d = this.f56205a.m157304d(0);
                UtilKt.m81522c("fetchObbInfo: url=" + strM157305e + ", name=" + strM157304d);
                Object obj = this.f56206b.get("missing_zip_info_list");
                obj.getClass();
                List mutableList = CollectionsKt.toMutableList((Collection) obj);
                ZipInfo obbZipInfo = this.f56207c.getObbZipInfo();
                UtilKt.m81522c("fetchObbInfo obbZipInfo=" + obbZipInfo.getName() + ',' + obbZipInfo.getUrl());
                Iterator it = mutableList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ZipInfo zipInfo = (ZipInfo) next;
                    if (Intrinsics.m87488d(zipInfo.getName(), obbZipInfo.getName()) && Intrinsics.m87488d(zipInfo.getAbi(), obbZipInfo.getAbi()) && Intrinsics.m87488d(zipInfo.getMd5(), obbZipInfo.getMd5())) {
                        break;
                    }
                }
                ZipInfo zipInfo2 = (ZipInfo) next;
                StringBuilder sb = new StringBuilder("fetchObbInfo findZipInfo=");
                sb.append(zipInfo2 != null ? zipInfo2.getName() : null);
                sb.append(',');
                sb.append(zipInfo2 != null ? zipInfo2.getUrl() : null);
                UtilKt.m81522c(sb.toString());
                if (zipInfo2 != null) {
                    mutableList.remove(zipInfo2);
                    strM157304d.getClass();
                    strM157305e.getClass();
                    mutableList.add(ZipInfo.copy$default(zipInfo2, null, strM157304d, null, 0L, strM157305e, null, 45, null));
                    this.f56206b.put("missing_zip_info_list", mutableList);
                }
                ModuleZipInfo moduleZipInfo = this.f56207c;
                strM157305e.getClass();
                strM157304d.getClass();
                moduleZipInfo.setObbInfo(strM157305e, strM157304d);
                this.f56208d[0] = nxc0.INSTANCE.m161941d();
            } else {
                this.f56208d[0] = nxc0.INSTANCE.m161938a("LicenseChecker get url failed");
            }
            this.f56209e.countDown();
        }

        @Override // p149l.ubr
        /* JADX INFO: renamed from: b */
        public void mo81518b(int p0) {
            this.f56208d[0] = nxc0.INSTANCE.m161940c("LicenseChecker dontAllow: " + p0);
            this.f56209e.countDown();
        }

        @Override // p149l.ubr
        /* JADX INFO: renamed from: c */
        public void mo81519c(int p0) {
            this.f56208d[0] = nxc0.INSTANCE.m161940c("LicenseChecker applicationError: " + p0);
            this.f56209e.countDown();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final List<ZipInfo> m81503i(Map<String, Object> map, C13683a c13683a) {
        Object obj = map.get("missing_zip_info_list");
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            ZipInfo zipInfo = (ZipInfo) obj2;
            File file = new File(c13683a.m81475a(), zipInfo.getName());
            if (!UtilKt.m81520a(file, zipInfo.getMd5())) {
                UtilKt.m81524e(file);
                arrayList.add(obj2);
            }
        }
        UtilKt.m81522c("checkDownload=" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$download$checkDownload$2$1
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
    public static final boolean m81504o(Map<String, Object> map, C13683a c13683a) {
        Object obj = map.get("missing_so_info_list");
        obj.getClass();
        List<SoInfo> list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (SoInfo soInfo : list) {
            if (!UtilKt.m81520a(new File(c13683a.m81487m(), soInfo.getName()), soInfo.getMd5())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final ModuleZipInfo m81505f(C13683a config, String module, Map<String, Object> extras) {
        AssetsHelper assetsHelper = AssetsHelper.INSTANCE;
        if (assetsHelper.m81492c()) {
            UtilKt.m81522c("checkNeedLoad apkHasSoFiles=true");
            return null;
        }
        ModuleZipInfo moduleZipInfoM81496g = assetsHelper.m81496g(module);
        List<SoInfo> listM81509k = m81509k(config, moduleZipInfoM81496g);
        if (listM81509k.isEmpty()) {
            UtilKt.m81522c("checkNeedLoad verifySo success");
            return null;
        }
        List<ZipInfo> listM81510l = m81510l(moduleZipInfoM81496g, listM81509k);
        extras.put("missing_so_info_list", listM81509k);
        extras.put("missing_zip_info_list", listM81510l);
        UtilKt.m81522c("EXTRA_MISSING_SO_INFO_LIST=" + listM81509k);
        UtilKt.m81522c("EXTRA_MISSING_ZIP_INFO_LIST=" + listM81510l);
        UtilKt.m81522c("checkNeedLoad delete and make unzip dir=" + config.m81487m());
        File fileM81487m = config.m81487m();
        UtilKt.m81524e(fileM81487m);
        UtilKt.m81525f(fileM81487m);
        return moduleZipInfoM81496g;
    }

    /* JADX INFO: renamed from: g */
    public final nxc0<Unit> m81506g(C13683a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) {
        Object objM223820constructorimpl;
        StringBuilder sb = new StringBuilder("mergeSo: soPathFileListBeforeCopyNew=");
        File[] fileArrListFiles = config.m81486l().listFiles();
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
        UtilKt.m81522c(sb.toString());
        File[] fileArrListFiles2 = config.m81487m().listFiles();
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
        UtilKt.m81522c(sb2.toString());
        for (File file : list2) {
            File file2 = new File(config.m81486l(), file.getName());
            boolean zExists = file2.exists();
            UtilKt.m81522c("mergeSo: copyTo file=" + file2 + ", exist=" + zExists);
            if (zExists) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM223820constructorimpl = Result.m223820constructorimpl(bii.m102041q(file, file2, true, 0, 4, null));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
                }
                if (Result.m223823exceptionOrNullimpl(objM223820constructorimpl) != null) {
                    UtilKt.m81522c("mergeSo: copyTo failed file=" + file2);
                }
            } else {
                bii.m102041q(file, file2, true, 0, 4, null);
            }
        }
        StringBuilder sb3 = new StringBuilder("mergeSo: soPathFileListAfterCopyNew=");
        File[] fileArrListFiles3 = config.m81486l().listFiles();
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
        UtilKt.m81522c(sb3.toString());
        UtilKt.m81524e(config.m81487m());
        return nxc0.INSTANCE.m161941d();
    }

    /* JADX INFO: renamed from: h */
    public final nxc0<Unit> m81507h(C13683a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) throws InterruptedException {
        List<ZipInfo> listM81503i = m81503i(extras, config);
        if (listM81503i.isEmpty()) {
            UtilKt.m81522c("download skip");
            return nxc0.INSTANCE.m161941d();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(listM81503i.size());
        final ArrayList arrayList = new ArrayList();
        for (final ZipInfo zipInfo : listM81503i) {
            UtilKt.m81522c("download: url=" + zipInfo.getUrl() + ", path=" + config.m81475a().getAbsolutePath() + ", fileName=" + zipInfo.getName());
            C13683a.a downloader = config.getDownloader();
            String url = zipInfo.getUrl();
            String absolutePath = config.m81475a().getAbsolutePath();
            absolutePath.getClass();
            downloader.mo81488a(url, absolutePath, zipInfo.getName(), new Function1<nxc0<Unit>, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$download$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull nxc0<Unit> nxc0Var) {
                    nxc0Var.getClass();
                    if (nxc0Var.m161936d()) {
                        UtilKt.m81522c("download isFailure name=" + zipInfo.getName() + ", exception=" + nxc0Var.m161934b());
                        arrayList.add(TuplesKt.m87240a(zipInfo.getName(), nxc0Var.m161934b()));
                    }
                    countDownLatch.countDown();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(nxc0<Unit> nxc0Var) {
                    invoke2(nxc0Var);
                    return Unit.INSTANCE;
                }
            });
        }
        countDownLatch.await();
        List<ZipInfo> listM81503i2 = m81503i(extras, config);
        if (listM81503i2.isEmpty()) {
            return nxc0.INSTANCE.m161941d();
        }
        return nxc0.INSTANCE.m161938a("download failed=" + CollectionsKt.joinToString$default(listM81503i2, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$download$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull ZipInfo zipInfo2) {
                zipInfo2.getClass();
                return zipInfo2.getName();
            }
        }, 31, null) + "\nfailureInfo=" + arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final nxc0<Unit> m81508j(C13683a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) throws InterruptedException {
        if (config.getMockObb() || !config.getUseObb()) {
            UtilKt.m81522c("fetchObbInfoIfNeeded skip");
            return nxc0.INSTANCE.m161941d();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        nxc0<Unit>[] nxc0VarArr = {nxc0.INSTANCE.m161938a("")};
        C18601n1 c18601n1 = new C18601n1(config.getContext(), new C17440i(config.getObbSalt(), config.getContext().getPackageName(), Settings.Secure.getString(config.getContext().getContentResolver(), "android_id")));
        c18601n1.m157307g();
        new ServiceConnectionC2637b(config.getContext(), c18601n1, config.getObbPublicKey()).m15395f(new C13686b(c18601n1, extras, moduleZipInfo, nxc0VarArr, countDownLatch));
        countDownLatch.await();
        return nxc0VarArr[0];
    }

    /* JADX INFO: renamed from: k */
    public final List<SoInfo> m81509k(C13683a config, ModuleZipInfo moduleZipInfo) {
        UtilKt.m81522c("start verifySo " + moduleZipInfo.getName());
        File[] fileArrListFiles = config.m81486l().listFiles();
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
        UtilKt.m81522c(sb.toString());
        List<ZipInfo> zipInfoList = moduleZipInfo.getZipInfoList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = zipInfoList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ZipInfo) it.next()).getSoInfoList());
        }
        UtilKt.m81522c("moduleSoInfoList=" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingSoInfoList$2
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
                        if (Intrinsics.m87488d(file.getName(), soInfo.getName()) && UtilKt.m81520a(file, soInfo.getMd5())) {
                            break;
                        }
                    }
                }
            }
            arrayList2.add(obj);
        }
        UtilKt.m81522c("missingSoInfoList=" + CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingSoInfoList$3
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
    public final List<ZipInfo> m81510l(ModuleZipInfo moduleZipInfo, List<SoInfo> missingSoInfoList) {
        ZipInfo zipInfo;
        List<SoInfo> list = missingSoInfoList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SoInfo soInfo : list) {
            Iterator<T> it = moduleZipInfo.getZipInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    kgj0.m145892a("Collection contains no element matching the predicate.");
                    return null;
                }
                zipInfo = (ZipInfo) it.next();
                List<SoInfo> soInfoList = zipInfo.getSoInfoList();
                if (!(soInfoList instanceof Collection) || !soInfoList.isEmpty()) {
                    Iterator<T> it2 = soInfoList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.m87488d((SoInfo) it2.next(), soInfo)) {
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
        UtilKt.m81522c("missingZipInfoList=" + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$findMissingZipInfoList$1
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
    public final synchronized void m81511m(@NotNull C13683a config, @NotNull String module, @NotNull Function1<? super LoadEvent, Unit> callback) {
        try {
            config.getClass();
            module.getClass();
            callback.getClass();
            if (ThreadUtil.m81311f()) {
                throw new IllegalStateException("Load can not be called in ui thread!");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LoadEvent.Companion companion = LoadEvent.INSTANCE;
            LoadEvent.Step step = LoadEvent.Step.CheckNeedLoad;
            callback.invoke(companion.m81443b(step));
            ModuleZipInfo moduleZipInfoM81505f = m81505f(config, module, linkedHashMap);
            UtilKt.m81522c("checkNeedLoad: ".concat(moduleZipInfoM81505f == null ? "no need" : "need"));
            callback.invoke(LoadEvent.Companion.m81441d(companion, step, null, 2, null));
            for (C13685a c13685a : CollectionsKt.listOf((Object[]) new C13685a[]{new C13685a(LoadEvent.Step.FetchObbInfoIfNeeded, 3, new ModuleLoader$load$1(this)), new C13685a(LoadEvent.Step.Download, 3, new ModuleLoader$load$2(this)), new C13685a(LoadEvent.Step.Unzip, 3, new ModuleLoader$load$3(this)), new C13685a(LoadEvent.Step.CopySo, 1, new ModuleLoader$load$4(this)), new C13685a(LoadEvent.Step.VerifySo, 1, new ModuleLoader$load$5(this))})) {
                LoadEvent.Companion companion2 = LoadEvent.INSTANCE;
                callback.invoke(companion2.m81443b(c13685a.getStep()));
                if (moduleZipInfoM81505f == null) {
                    callback.invoke(companion2.m81444c(c13685a.getStep(), FreeSpaceBox.TYPE));
                } else {
                    nxc0<?> nxc0VarM161941d = nxc0.INSTANCE.m161941d();
                    int retryCount = c13685a.getRetryCount();
                    int i = 0;
                    do {
                        if (i >= retryCount) {
                            callback.invoke(LoadEvent.INSTANCE.m81442a(c13685a.getStep(), nxc0VarM161941d.m161933a()));
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("trying ");
                        sb.append(c13685a.getStep());
                        sb.append(' ');
                        i++;
                        sb.append(i);
                        UtilKt.m81522c(sb.toString());
                        try {
                            nxc0VarM161941d = c13685a.m81514a().invoke(config, moduleZipInfoM81505f, linkedHashMap);
                        } catch (Throwable th) {
                            nxc0VarM161941d = nxc0.INSTANCE.m161939b(th);
                        }
                    } while (!nxc0VarM161941d.m161937e());
                    callback.invoke(LoadEvent.INSTANCE.m81444c(c13685a.getStep(), nxc0VarM161941d.m161935c()));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final nxc0<Unit> m81512n(C13683a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) throws IOException {
        if (m81504o(extras, config)) {
            UtilKt.m81522c("unzip skip");
            return nxc0.INSTANCE.m161941d();
        }
        UtilKt.m81524e(config.m81487m());
        UtilKt.m81525f(config.m81487m());
        Object obj = extras.get("missing_zip_info_list");
        obj.getClass();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            File file = new File(config.m81475a(), ((ZipInfo) it.next()).getName());
            String absolutePath = config.m81487m().getAbsolutePath();
            absolutePath.getClass();
            UtilKt.m81526g(file, absolutePath);
        }
        return m81504o(extras, config) ? nxc0.INSTANCE.m161941d() : nxc0.INSTANCE.m161938a("unzip failed");
    }

    /* JADX INFO: renamed from: p */
    public final nxc0<Unit> m81513p(C13683a config, ModuleZipInfo moduleZipInfo, Map<String, Object> extras) {
        List<SoInfo> listM81509k = m81509k(config, moduleZipInfo);
        if (listM81509k.isEmpty()) {
            return nxc0.INSTANCE.m161941d();
        }
        return nxc0.INSTANCE.m161938a("verifySo failed: missingSoInfoList=" + CollectionsKt.joinToString$default(listM81509k, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.ModuleLoader$verifySo$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull SoInfo soInfo) {
                soInfo.getClass();
                return soInfo.getName();
            }
        }, 31, null));
    }
}
