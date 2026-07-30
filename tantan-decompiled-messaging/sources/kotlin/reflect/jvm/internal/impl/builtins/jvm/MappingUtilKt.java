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
    public static final TypeConstructorSubstitution m88442a(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        classDescriptor.getClass();
        classDescriptor2.getClass();
        classDescriptor.mo88309p().size();
        classDescriptor2.mo88309p().size();
        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.Companion;
        List<TypeParameterDescriptor> listMo88309p = classDescriptor.mo88309p();
        listMo88309p.getClass();
        List<TypeParameterDescriptor> list = listMo88309p;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).mo88305l());
        }
        List<TypeParameterDescriptor> listMo88309p2 = classDescriptor2.mo88309p();
        listMo88309p2.getClass();
        List<TypeParameterDescriptor> list2 = listMo88309p2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleType simpleTypeMo88458o = ((TypeParameterDescriptor) it2.next()).mo88458o();
            simpleTypeMo88458o.getClass();
            arrayList2.add(TypeUtilsKt.m93084d(simpleTypeMo88458o));
        }
        return TypeConstructorSubstitution.Companion.m92737e(companion, MapsKt.toMap(CollectionsKt.zip(arrayList, arrayList2)), false, 2, null);
    }
}
