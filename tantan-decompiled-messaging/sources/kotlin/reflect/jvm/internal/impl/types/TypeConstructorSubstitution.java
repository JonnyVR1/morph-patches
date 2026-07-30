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
        public static /* synthetic */ TypeConstructorSubstitution m92737e(Companion companion, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.m92741d(map, z);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final TypeSubstitution m92738a(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            return m92739b(kotlinType.mo91890G0(), kotlinType.mo91888E0());
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final TypeSubstitution m92739b(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
            typeConstructor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            parameters.getClass();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.mo88599A()) {
                return new IndexedParametersSubstitution(parameters, list);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            parameters2.getClass();
            List<TypeParameterDescriptor> list2 = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).mo88305l());
            }
            return m92737e(this, MapsKt.toMap(CollectionsKt.zip(arrayList, list)), false, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: c */
        public final TypeConstructorSubstitution m92740c(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
            map.getClass();
            return m92737e(this, map, false, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: d */
        public final TypeConstructorSubstitution m92741d(@NotNull final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z) {
            map.getClass();
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: a */
                public boolean mo92578a() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: f */
                public boolean mo89882f() {
                    return map.isEmpty();
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                /* JADX INFO: renamed from: k */
                public TypeProjection mo92673k(TypeConstructor typeConstructor) {
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
    public static final TypeSubstitution m92735i(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
        return Companion.m92739b(typeConstructor, list);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final TypeConstructorSubstitution m92736j(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.m92740c(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo89881e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return mo92673k(kotlinType.mo91890G0());
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract TypeProjection mo92673k(@NotNull TypeConstructor typeConstructor);
}
