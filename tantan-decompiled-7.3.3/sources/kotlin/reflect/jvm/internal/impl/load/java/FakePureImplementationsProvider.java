package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FakePureImplementationsProvider {

    @NotNull
    public static final FakePureImplementationsProvider INSTANCE;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<ClassId, ClassId> f65324a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<FqName, FqName> f65325b;

    static {
        FakePureImplementationsProvider fakePureImplementationsProvider = new FakePureImplementationsProvider();
        INSTANCE = fakePureImplementationsProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f65324a = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        fakePureImplementationsProvider.m90271c(standardClassIds.m91993m(), fakePureImplementationsProvider.m90269a("java.util.ArrayList", "java.util.LinkedList"));
        fakePureImplementationsProvider.m90271c(standardClassIds.m91995o(), fakePureImplementationsProvider.m90269a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        fakePureImplementationsProvider.m90271c(standardClassIds.m91994n(), fakePureImplementationsProvider.m90269a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.Companion;
        fakePureImplementationsProvider.m90271c(companion.m91936c(new FqName("java.util.function.Function")), fakePureImplementationsProvider.m90269a("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.m90271c(companion.m91936c(new FqName("java.util.function.BiFunction")), fakePureImplementationsProvider.m90269a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.m88129a(((ClassId) entry.getKey()).m91925a(), ((ClassId) entry.getValue()).m91925a()));
        }
        f65325b = MapsKt.toMap(arrayList);
    }

    private FakePureImplementationsProvider() {
    }

    /* JADX INFO: renamed from: a */
    public final List<ClassId> m90269a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.m91936c(new FqName(str)));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final FqName m90270b(@NotNull FqName fqName) {
        fqName.getClass();
        return f65325b.get(fqName);
    }

    /* JADX INFO: renamed from: c */
    public final void m90271c(ClassId classId, List<ClassId> list) {
        Map<ClassId, ClassId> map = f65324a;
        for (Object obj : list) {
            map.put((ClassId) obj, classId);
        }
    }
}
