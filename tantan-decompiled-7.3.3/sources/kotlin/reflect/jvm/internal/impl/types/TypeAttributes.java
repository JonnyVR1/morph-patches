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
    public static final TypeAttributes f66929b = new TypeAttributes((List<? extends TypeAttribute<?>>) CollectionsKt.emptyList());

    @SourceDebugExtension
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        /* JADX INFO: renamed from: c */
        public int mo93598c(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1) {
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
        public final TypeAttributes m93599j(@NotNull List<? extends TypeAttribute<?>> list) {
            list.getClass();
            return list.isEmpty() ? m93600k() : new TypeAttributes(list, null);
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final TypeAttributes m93600k() {
            return TypeAttributes.f66929b;
        }

        private Companion() {
        }
    }

    public TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            m94015g(typeAttribute.mo93452b(), typeAttribute);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    /* JADX INFO: renamed from: c */
    public TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> mo93591c() {
        return Companion;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeAttributes m93592j(@NotNull TypeAttributes typeAttributes) {
        TypeAttribute typeAttributeMo93451a;
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.m94060h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = mo94013a().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = typeAttributes.mo94013a().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeMo93451a = typeAttribute2 != null ? typeAttribute2.mo93451a(typeAttribute) : null;
            } else {
                typeAttributeMo93451a = typeAttribute.mo93451a(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, typeAttributeMo93451a);
        }
        return Companion.m93599j(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m93593l(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        return mo94013a().get(Companion.m94059f(typeAttribute.mo93452b())) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final TypeAttributes m93594o(@NotNull TypeAttributes typeAttributes) {
        TypeAttribute typeAttributeMo93453c;
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.m94060h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = mo94013a().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = typeAttributes.mo94013a().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeMo93453c = typeAttribute2 != null ? typeAttribute2.mo93453c(typeAttribute) : null;
            } else {
                typeAttributeMo93453c = typeAttribute.mo93453c(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, typeAttributeMo93453c);
        }
        return Companion.m93599j(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TypeAttributes m93595p(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (m93593l(typeAttribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(typeAttribute);
        }
        return Companion.m93599j(CollectionsKt.plus((Collection<? extends TypeAttribute<?>>) CollectionsKt.toList(this), typeAttribute));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final TypeAttributes m93596r(@NotNull TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (!isEmpty()) {
            ArrayMap<TypeAttribute<?>> arrayMapMo94013a = mo94013a();
            ArrayList arrayList = new ArrayList();
            for (TypeAttribute<?> typeAttribute2 : arrayMapMo94013a) {
                if (!Intrinsics.m88377d(typeAttribute2, typeAttribute)) {
                    arrayList.add(typeAttribute2);
                }
            }
            if (arrayList.size() != mo94013a().mo94019a()) {
                return Companion.m93599j(arrayList);
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
