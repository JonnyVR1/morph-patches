package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PredefinedFunctionEnhancementInfo {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final TypeEnhancementInfo f65649a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<TypeEnhancementInfo> f65650b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f65651c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final PredefinedFunctionEnhancementInfo f65652d;

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> list, @Nullable String str) {
        list.getClass();
        this.f65649a = typeEnhancementInfo;
        this.f65650b = list;
        this.f65651c = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoM90994a = typeEnhancementInfo != null ? typeEnhancementInfo.m90994a() : null;
            List<TypeEnhancementInfo> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list2) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.m90994a() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoM90994a, arrayList, null);
        }
        this.f65652d = predefinedFunctionEnhancementInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m90959a() {
        return this.f65651c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<TypeEnhancementInfo> m90960b() {
        return this.f65650b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final TypeEnhancementInfo m90961c() {
        return this.f65649a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final PredefinedFunctionEnhancementInfo m90962d() {
        return this.f65652d;
    }

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str);
    }
}
