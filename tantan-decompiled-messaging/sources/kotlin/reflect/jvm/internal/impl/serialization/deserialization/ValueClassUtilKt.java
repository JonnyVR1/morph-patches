package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ValueClassUtilKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> m92278a(@NotNull ProtoBuf.Class r4, boolean z, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function1<? super ProtoBuf.Type, ? extends T> function1, @NotNull Function1<? super Name, ? extends T> function2) {
        T tInvoke;
        r4.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        function1.getClass();
        function2.getClass();
        if (r4.hasInlineClassUnderlyingPropertyName()) {
            Name nameM92233b = NameResolverUtilKt.m92233b(nameResolver, r4.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeM90905i = ProtoTypeTableUtilKt.m90905i(r4, typeTable);
            if ((typeM90905i != null && (tInvoke = function1.invoke(typeM90905i)) != null) || (tInvoke = function2.invoke(nameM92233b)) != null) {
                return new InlineClassRepresentation(nameM92233b, tInvoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.m92233b(nameResolver, r4.getFqName()) + " with property " + nameM92233b).toString());
        }
        if (!z || !Flags.f65369k.mo90875d(r4.getFlags()).booleanValue()) {
            return null;
        }
        List<ProtoBuf.Constructor> constructorList = r4.getConstructorList();
        constructorList.getClass();
        Iterator<T> it = constructorList.iterator();
        boolean z2 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z2) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (!Flags.f65372n.mo90875d(((ProtoBuf.Constructor) next).getFlags()).booleanValue()) {
                if (!z2) {
                    z2 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj;
        if (constructor == null) {
            return null;
        }
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        List<ProtoBuf.ValueParameter> list = valueParameterList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.ValueParameter valueParameter : list) {
            arrayList.add(TuplesKt.m87240a(NameResolverUtilKt.m92233b(nameResolver, valueParameter.getName()), function1.invoke(ProtoTypeTableUtilKt.m90914r(valueParameter, typeTable))));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
