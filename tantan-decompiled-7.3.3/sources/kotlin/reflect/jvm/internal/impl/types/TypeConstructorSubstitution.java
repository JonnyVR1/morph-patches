package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ TypeConstructorSubstitution m93628e(Companion companion, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.m93632d(map, z);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final TypeSubstitution m93629a(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            return m93630b(kotlinType.mo92781G0(), kotlinType.mo92779E0());
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final TypeSubstitution m93630b(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
            typeConstructor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            parameters.getClass();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.mo89490A()) {
                return new IndexedParametersSubstitution(parameters, list);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            parameters2.getClass();
            List<TypeParameterDescriptor> list2 = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).mo89196l());
            }
            return m93628e(this, MapsKt.toMap(CollectionsKt.zip(arrayList, list)), false, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: c */
        public final TypeConstructorSubstitution m93631c(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
            map.getClass();
            return m93628e(this, map, false, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: d */
        public final TypeConstructorSubstitution m93632d(@NotNull final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z) {
            map.getClass();
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: a */
                public boolean mo93469a() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: f */
                public boolean mo90773f() {
                    return map.isEmpty();
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                /* JADX INFO: renamed from: k */
                public TypeProjection mo93564k(TypeConstructor typeConstructor) {
                    typeConstructor.getClass();
                    return map.get(typeConstructor);
                }
            };
        }

        private Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final TypeSubstitution m93626i(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
        return Companion.m93630b(typeConstructor, list);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final TypeConstructorSubstitution m93627j(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.m93631c(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo90772e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return mo93564k(kotlinType.mo92781G0());
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract TypeProjection mo93564k(@NotNull TypeConstructor typeConstructor);
}
