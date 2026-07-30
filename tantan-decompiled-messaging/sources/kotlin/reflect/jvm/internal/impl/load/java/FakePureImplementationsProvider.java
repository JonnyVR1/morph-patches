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
    public static final Map<ClassId, ClassId> f64650a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<FqName, FqName> f64651b;

    static {
        FakePureImplementationsProvider fakePureImplementationsProvider = new FakePureImplementationsProvider();
        INSTANCE = fakePureImplementationsProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f64650a = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        fakePureImplementationsProvider.m89380c(standardClassIds.m91102m(), fakePureImplementationsProvider.m89378a("java.util.ArrayList", "java.util.LinkedList"));
        fakePureImplementationsProvider.m89380c(standardClassIds.m91104o(), fakePureImplementationsProvider.m89378a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        fakePureImplementationsProvider.m89380c(standardClassIds.m91103n(), fakePureImplementationsProvider.m89378a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.Companion;
        fakePureImplementationsProvider.m89380c(companion.m91045c(new FqName("java.util.function.Function")), fakePureImplementationsProvider.m89378a("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.m89380c(companion.m91045c(new FqName("java.util.function.BiFunction")), fakePureImplementationsProvider.m89378a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.m87240a(((ClassId) entry.getKey()).m91034a(), ((ClassId) entry.getValue()).m91034a()));
        }
        f64651b = MapsKt.toMap(arrayList);
    }

    private FakePureImplementationsProvider() {
    }

    /* JADX INFO: renamed from: a */
    public final List<ClassId> m89378a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.m91045c(new FqName(str)));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final FqName m89379b(@NotNull FqName fqName) {
        fqName.getClass();
        return f64651b.get(fqName);
    }

    /* JADX INFO: renamed from: c */
    public final void m89380c(ClassId classId, List<ClassId> list) {
        Map<ClassId, ClassId> map = f64650a;
        for (Object obj : list) {
            map.put((ClassId) obj, classId);
        }
    }
}
