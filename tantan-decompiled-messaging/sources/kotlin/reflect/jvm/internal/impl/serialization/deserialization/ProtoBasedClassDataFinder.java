package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NameResolver f66024a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BinaryVersion f66025b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<ClassId, SourceElement> f66026c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<ClassId, ProtoBuf.Class> f66027d;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(@NotNull ProtoBuf.PackageFragment packageFragment, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull Function1<? super ClassId, ? extends SourceElement> function1) {
        packageFragment.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        function1.getClass();
        this.f66024a = nameResolver;
        this.f66025b = binaryVersion;
        this.f66026c = function1;
        List<ProtoBuf.Class> class_List = packageFragment.getClass_List();
        class_List.getClass();
        List<ProtoBuf.Class> list = class_List;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.m92232a(this.f66024a, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.f66027d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassData mo90319a(@NotNull ClassId classId) {
        classId.getClass();
        ProtoBuf.Class r0 = this.f66027d.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.f66024a, r0, this.f66025b, this.f66026c.invoke(classId));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Collection<ClassId> m92234b() {
        return this.f66027d.keySet();
    }
}
