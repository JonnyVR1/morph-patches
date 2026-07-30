package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAliasExpansion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public final TypeAliasExpansion f66925a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeAliasDescriptor f66926b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<TypeProjection> f66927c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<TypeParameterDescriptor, TypeProjection> f66928d;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final TypeAliasExpansion m93584a(@Nullable TypeAliasExpansion typeAliasExpansion, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
            typeAliasDescriptor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.mo89196l().getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list2 = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).mo89336a());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, list, MapsKt.toMap(CollectionsKt.zip(arrayList, list)), null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.f66925a = typeAliasExpansion;
        this.f66926b = typeAliasDescriptor;
        this.f66927c = list;
        this.f66928d = map;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TypeProjection> m93580a() {
        return this.f66927c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final TypeAliasDescriptor m93581b() {
        return this.f66926b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final TypeProjection m93582c(@NotNull TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
            return this.f66928d.get(classifierDescriptorMo89207e);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93583d(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
        typeAliasDescriptor.getClass();
        if (Intrinsics.m88377d(this.f66926b, typeAliasDescriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f66925a;
        return typeAliasExpansion != null ? typeAliasExpansion.m93583d(typeAliasDescriptor) : false;
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }
}
