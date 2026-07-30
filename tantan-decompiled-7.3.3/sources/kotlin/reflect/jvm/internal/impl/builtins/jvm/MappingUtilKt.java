package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class MappingUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TypeConstructorSubstitution m89333a(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        classDescriptor.getClass();
        classDescriptor2.getClass();
        classDescriptor.mo89200p().size();
        classDescriptor2.mo89200p().size();
        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.Companion;
        List<TypeParameterDescriptor> listMo89200p = classDescriptor.mo89200p();
        listMo89200p.getClass();
        List<TypeParameterDescriptor> list = listMo89200p;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).mo89196l());
        }
        List<TypeParameterDescriptor> listMo89200p2 = classDescriptor2.mo89200p();
        listMo89200p2.getClass();
        List<TypeParameterDescriptor> list2 = listMo89200p2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleType simpleTypeMo89349o = ((TypeParameterDescriptor) it2.next()).mo89349o();
            simpleTypeMo89349o.getClass();
            arrayList2.add(TypeUtilsKt.m93975d(simpleTypeMo89349o));
        }
        return TypeConstructorSubstitution.Companion.m93628e(companion, MapsKt.toMap(CollectionsKt.zip(arrayList, arrayList2)), false, 2, null);
    }
}
