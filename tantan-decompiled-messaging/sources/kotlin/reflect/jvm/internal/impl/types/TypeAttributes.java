package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final TypeAttributes f66255b = new TypeAttributes((List<? extends TypeAttribute<?>>) CollectionsKt.emptyList());

    @SourceDebugExtension
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        /* JADX INFO: renamed from: c */
        public int mo92707c(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1) {
            int iIntValue;
            concurrentHashMap.getClass();
            str.getClass();
            function1.getClass();
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numInvoke = function1.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(numInvoke.intValue()));
                        iIntValue = numInvoke.intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final TypeAttributes m92708j(@NotNull List<? extends TypeAttribute<?>> list) {
            list.getClass();
            return list.isEmpty() ? m92709k() : new TypeAttributes(list, null);
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final TypeAttributes m92709k() {
            return TypeAttributes.f66255b;
        }

        private Companion() {
        }
    }

    public TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            m93124g(typeAttribute.mo92561b(), typeAttribute);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    /* JADX INFO: renamed from: c */
    public TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> mo92700c() {
        return Companion;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeAttributes m92701j(@NotNull TypeAttributes typeAttributes) {
        TypeAttribute typeAttributeMo92560a;
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.m93169h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = mo93122a().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = typeAttributes.mo93122a().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeMo92560a = typeAttribute2 != null ? typeAttribute2.mo92560a(typeAttribute) : null;
            } else {
                typeAttributeMo92560a = typeAttribute.mo92560a(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, typeAttributeMo92560a);
        }
        return Companion.m92708j(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m92702l(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        return mo93122a().get(Companion.m93168f(typeAttribute.mo92561b())) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final TypeAttributes m92703o(@NotNull TypeAttributes typeAttributes) {
        TypeAttribute typeAttributeMo92562c;
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.m93169h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = mo93122a().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = typeAttributes.mo93122a().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeMo92562c = typeAttribute2 != null ? typeAttribute2.mo92562c(typeAttribute) : null;
            } else {
                typeAttributeMo92562c = typeAttribute.mo92562c(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, typeAttributeMo92562c);
        }
        return Companion.m92708j(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TypeAttributes m92704p(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (m92702l(typeAttribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(typeAttribute);
        }
        return Companion.m92708j(CollectionsKt.plus((Collection<? extends TypeAttribute<?>>) CollectionsKt.toList(this), typeAttribute));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final TypeAttributes m92705r(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (!isEmpty()) {
            ArrayMap<TypeAttribute<?>> arrayMapMo93122a = mo93122a();
            ArrayList arrayList = new ArrayList();
            for (TypeAttribute<?> typeAttribute2 : arrayMapMo93122a) {
                if (!Intrinsics.m87488d(typeAttribute2, typeAttribute)) {
                    arrayList.add(typeAttribute2);
                }
            }
            if (arrayList.size() != mo93122a().mo93128a()) {
                return Companion.m92708j(arrayList);
            }
        }
        return this;
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    public TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) CollectionsKt.listOf(typeAttribute));
    }
}
