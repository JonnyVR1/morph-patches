package com.tantanapp.sharedlibrary.loader.internal;

import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tantanapp.sharedlibrary.loader.C13683a;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.TextStreamsKt;
import kotlin.text.C15386d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;
import p149l.kgj0;
import p149l.upk0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/AssetsHelper;", "", "<init>", "()V", "", "module", "Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "g", "(Ljava/lang/String;)Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "", "a", "Lkotlin/Lazy;", "e", "()Ljava/util/Map;", "moduleJsonMap", "", "b", "f", "()Ljava/util/List;", "moduleList", "", "c", "()Z", "apkHasSoFiles", "", Constants.INAPP_DATA_TAG, "Ljava/util/Map;", "moduleZipInfoMap", "Lcom/tantanapp/sharedlibrary/loader/a;", "()Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AssetsHelper {

    @NotNull
    public static final AssetsHelper INSTANCE = new AssetsHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy moduleJsonMap = LazyKt__LazyJVMKt.m87229b(new Function0<Map<String, ? extends String>>() { // from class: com.tantanapp.sharedlibrary.loader.internal.AssetsHelper$moduleJsonMap$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends String> invoke() throws IOException {
            String[] list = AssetsHelper.INSTANCE.m81493d().getContext().getAssets().list("sharedlibrary");
            if (list == null) {
                list = new String[0];
            }
            ArrayList<String> arrayList = new ArrayList();
            for (String str : list) {
                if (str != null && str.length() != 0) {
                    str.getClass();
                    if (C15386d.m93489w(str, ".json", false, 2, null)) {
                        arrayList.add(str);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (String str2 : arrayList) {
                str2.getClass();
                arrayList2.add(TuplesKt.m87240a(StringsKt.m93458y0(str2, ".json"), "sharedlibrary/" + str2));
            }
            return MapsKt.toMap(arrayList2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy moduleList = LazyKt__LazyJVMKt.m87229b(new Function0<List<? extends String>>() { // from class: com.tantanapp.sharedlibrary.loader.internal.AssetsHelper$moduleList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends String> invoke() {
            return CollectionsKt.toList(AssetsHelper.INSTANCE.m81494e().keySet());
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy apkHasSoFiles = LazyKt__LazyJVMKt.m87229b(new Function0<Boolean>() { // from class: com.tantanapp.sharedlibrary.loader.internal.AssetsHelper$apkHasSoFiles$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(AssetsHelper.INSTANCE.m81494e().isEmpty());
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, ModuleZipInfo> moduleZipInfoMap = new LinkedHashMap();

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.internal.AssetsHelper$a */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m87232d2 = {"com/tantanapp/sharedlibrary/loader/internal/AssetsHelper$a", "Lcom/google/gson/reflect/TypeToken;", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C13684a extends TypeToken<List<? extends ModuleZipInfo>> {
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81492c() {
        return ((Boolean) apkHasSoFiles.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final C13683a m81493d() {
        return SharedLibraryLoader.INSTANCE.m81469a().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m81494e() {
        return (Map) moduleJsonMap.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m81495f() {
        return (List) moduleList.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ModuleZipInfo m81496g(@NotNull String module) {
        module.getClass();
        if (m81492c()) {
            upk0.m194883a("Please check apkHasSoFiles in advance");
            return null;
        }
        Map<String, ModuleZipInfo> map = moduleZipInfoMap;
        ModuleZipInfo moduleZipInfo = map.get(module);
        if (moduleZipInfo == null) {
            AssetsHelper assetsHelper = INSTANCE;
            InputStream inputStreamOpen = assetsHelper.m81493d().getContext().getAssets().open((String) MapsKt.getValue(assetsHelper.m81494e(), module));
            inputStreamOpen.getClass();
            boolean z = false;
            Object obj = null;
            for (Object obj2 : (Iterable) new Gson().fromJson(TextStreamsKt.m87425g(new InputStreamReader(inputStreamOpen, Charsets.UTF_8)), new C13684a().getType())) {
                ModuleZipInfo moduleZipInfo2 = (ModuleZipInfo) obj2;
                if (Intrinsics.m87488d(moduleZipInfo2.getName(), module) && C15386d.m93490x(INSTANCE.m81493d().getAbi().getId(), moduleZipInfo2.getAbi(), true)) {
                    if (z) {
                        ig3.m135964a("Collection contains more than one matching element.");
                        return null;
                    }
                    obj = obj2;
                    z = true;
                }
            }
            if (!z) {
                kgj0.m145892a("Collection contains no element matching the predicate.");
                return null;
            }
            moduleZipInfo = (ModuleZipInfo) obj;
            map.put(module, moduleZipInfo);
        }
        return moduleZipInfo;
    }
}
