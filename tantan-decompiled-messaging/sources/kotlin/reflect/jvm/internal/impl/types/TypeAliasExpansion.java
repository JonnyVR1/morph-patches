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
    public final TypeAliasExpansion f66251a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeAliasDescriptor f66252b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<TypeProjection> f66253c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<TypeParameterDescriptor, TypeProjection> f66254d;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final TypeAliasExpansion m92693a(@Nullable TypeAliasExpansion typeAliasExpansion, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
            typeAliasDescriptor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.mo88305l().getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list2 = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).mo88445a());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, list, MapsKt.toMap(CollectionsKt.zip(arrayList, list)), null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.f66251a = typeAliasExpansion;
        this.f66252b = typeAliasDescriptor;
        this.f66253c = list;
        this.f66254d = map;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TypeProjection> m92689a() {
        return this.f66253c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final TypeAliasDescriptor m92690b() {
        return this.f66252b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final TypeProjection m92691c(@NotNull TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
            return this.f66254d.get(classifierDescriptorMo88316e);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m92692d(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
        typeAliasDescriptor.getClass();
        if (Intrinsics.m87488d(this.f66252b, typeAliasDescriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f66251a;
        return typeAliasExpansion != null ? typeAliasExpansion.m92692d(typeAliasDescriptor) : false;
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }
}
