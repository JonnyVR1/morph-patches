package com.tantanapp.sharedlibrary.loader.internal;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.sharedlibrary.loader.C13683a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/MigrateHelper;", "", "<init>", "()V", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "", "a", "(Lcom/tantanapp/sharedlibrary/loader/a;)V", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MigrateHelper {

    @NotNull
    public static final MigrateHelper INSTANCE = new MigrateHelper();

    /* JADX INFO: renamed from: a */
    public final void m81497a(@NotNull C13683a config) {
        config.getClass();
        UtilKt.m81525f(config.m81475a());
        UtilKt.m81525f(config.m81487m());
        List<String> listM81495f = AssetsHelper.INSTANCE.m81495f();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81495f, 10));
        Iterator<T> it = listM81495f.iterator();
        while (it.hasNext()) {
            arrayList.add(AssetsHelper.INSTANCE.m81496g((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((ModuleZipInfo) it2.next()).getZipInfoList());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        StringBuilder sb = new StringBuilder("migrate, zipInfoSet=");
        Set set2 = set;
        sb.append(CollectionsKt.joinToString$default(set2, null, null, null, 0, null, new Function1<ZipInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.MigrateHelper$deleteUnusedSoFiles$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull ZipInfo zipInfo) {
                zipInfo.getClass();
                return zipInfo.getName();
            }
        }, 31, null));
        UtilKt.m81522c(sb.toString());
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            CollectionsKt.addAll(arrayList3, ((ZipInfo) it3.next()).getSoInfoList());
        }
        Set set3 = CollectionsKt.toSet(arrayList3);
        StringBuilder sb2 = new StringBuilder("migrate, soInfoSet=");
        Set set4 = set3;
        sb2.append(CollectionsKt.joinToString$default(set4, null, null, null, 0, null, new Function1<SoInfo, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.MigrateHelper$deleteUnusedSoFiles$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull SoInfo soInfo) {
                soInfo.getClass();
                return soInfo.getName();
            }
        }, 31, null));
        UtilKt.m81522c(sb2.toString());
        File[] fileArrListFiles = config.m81475a().listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList4 = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                arrayList4.add(file);
            }
        }
        ArrayList<File> arrayList5 = new ArrayList();
        for (Object obj : arrayList4) {
            File file2 = (File) obj;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it4 = set2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        ZipInfo zipInfo = (ZipInfo) it4.next();
                        if (Intrinsics.m87488d(file2.getName(), zipInfo.getName()) && UtilKt.m81520a(file2, zipInfo.getMd5())) {
                            break;
                        }
                    }
                }
            }
            arrayList5.add(obj);
        }
        UtilKt.m81522c("migrate, delete download fileList=" + CollectionsKt.joinToString$default(arrayList5, null, null, null, 0, null, new Function1<File, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.MigrateHelper$deleteUnusedSoFiles$5$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(File file3) {
                String name = file3.getName();
                name.getClass();
                return name;
            }
        }, 31, null));
        for (File file3 : arrayList5) {
            file3.getClass();
            UtilKt.m81524e(file3);
        }
        UtilKt.m81524e(config.m81487m());
        UtilKt.m81522c("migrate, delete unzipPath=" + config.m81487m());
        File[] fileArrListFiles2 = config.m81486l().listFiles();
        if (fileArrListFiles2 == null) {
            fileArrListFiles2 = new File[0];
        }
        ArrayList arrayList6 = new ArrayList();
        for (File file4 : fileArrListFiles2) {
            if (file4.isFile()) {
                arrayList6.add(file4);
            }
        }
        ArrayList<File> arrayList7 = new ArrayList();
        for (Object obj2 : arrayList6) {
            File file5 = (File) obj2;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                Iterator it5 = set4.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        SoInfo soInfo = (SoInfo) it5.next();
                        if (Intrinsics.m87488d(file5.getName(), soInfo.getName()) && UtilKt.m81520a(file5, soInfo.getMd5())) {
                            break;
                        }
                    }
                }
            }
            arrayList7.add(obj2);
        }
        UtilKt.m81522c("migrate, delete so fileList=" + CollectionsKt.joinToString$default(arrayList7, null, null, null, 0, null, new Function1<File, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.MigrateHelper$deleteUnusedSoFiles$9$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(File file6) {
                String name = file6.getName();
                name.getClass();
                return name;
            }
        }, 31, null));
        for (File file6 : arrayList7) {
            file6.getClass();
            UtilKt.m81524e(file6);
        }
    }
}
