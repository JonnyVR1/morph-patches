package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.g75;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ClassDeserializer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<ClassId> f65971c = SetsKt.setOf(ClassId.Companion.m91045c(StandardNames.FqNames.f63886c.m91068m()));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationComponents f65972a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<C15315a, ClassDescriptor> f65973b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<ClassId> m92144a() {
            return ClassDeserializer.f65971c;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a */
    public static final class C15315a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f65974a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final ClassData f65975b;

        public C15315a(@NotNull ClassId classId, @Nullable ClassData classData) {
            classId.getClass();
            this.f65974a = classId;
            this.f65975b = classData;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ClassData m92145a() {
            return this.f65975b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final ClassId m92146b() {
            return this.f65974a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C15315a) && Intrinsics.m87488d(this.f65974a, ((C15315a) obj).f65974a);
        }

        public int hashCode() {
            return this.f65974a.hashCode();
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.f65972a = deserializationComponents;
        this.f65973b = deserializationComponents.m92169u().mo92444c(new g75(this));
    }

    /* JADX INFO: renamed from: c */
    public static final ClassDescriptor m92140c(ClassDeserializer classDeserializer, C15315a c15315a) {
        c15315a.getClass();
        return classDeserializer.m92142d(c15315a);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ClassDescriptor m92141f(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.m92143e(classId, classData);
    }

    /* JADX INFO: renamed from: d */
    public final ClassDescriptor m92142d(C15315a c15315a) {
        Object next;
        DeserializationContext deserializationContextM92149a;
        PackageFragmentDescriptor packageFragmentDescriptor;
        ClassId classIdM92146b = c15315a.m92146b();
        Iterator<ClassDescriptorFactory> it = this.f65972a.m92160l().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorMo88282b = it.next().mo88282b(classIdM92146b);
            if (classDescriptorMo88282b != null) {
                return classDescriptorMo88282b;
            }
        }
        if (f65971c.contains(classIdM92146b)) {
            return null;
        }
        ClassData classDataM92145a = c15315a.m92145a();
        if (classDataM92145a == null && (classDataM92145a = this.f65972a.m92153e().mo90319a(classIdM92146b)) == null) {
            return null;
        }
        NameResolver nameResolverM92134a = classDataM92145a.m92134a();
        ProtoBuf.Class classM92135b = classDataM92145a.m92135b();
        BinaryVersion binaryVersionM92136c = classDataM92145a.m92136c();
        SourceElement sourceElementM92137d = classDataM92145a.m92137d();
        ClassId classIdM91037e = classIdM92146b.m91037e();
        if (classIdM91037e != null) {
            ClassDescriptor classDescriptorM92141f = m92141f(this, classIdM91037e, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorM92141f instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorM92141f : null;
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.m92322d1(classIdM92146b.m91040h())) {
                return null;
            }
            deserializationContextM92149a = deserializedClassDescriptor.m92315W0();
        } else {
            Iterator<T> it2 = PackageFragmentProviderKt.m88573c(this.f65972a.m92167s(), classIdM92146b.m91038f()).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                    break;
                }
            } while (!((DeserializedPackageFragment) packageFragmentDescriptor).m92190D0(classIdM92146b.m91040h()));
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.f65972a;
            ProtoBuf.TypeTable typeTable = classM92135b.getTypeTable();
            typeTable.getClass();
            TypeTable typeTable2 = new TypeTable(typeTable);
            VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = classM92135b.getVersionRequirementTable();
            versionRequirementTable.getClass();
            deserializationContextM92149a = deserializationComponents.m92149a(packageFragmentDescriptor2, nameResolverM92134a, typeTable2, companion.m90932a(versionRequirementTable), binaryVersionM92136c, null);
            binaryVersionM92136c = binaryVersionM92136c;
        }
        return new DeserializedClassDescriptor(deserializationContextM92149a, classM92135b, nameResolverM92134a, binaryVersionM92136c, sourceElementM92137d);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ClassDescriptor m92143e(@NotNull ClassId classId, @Nullable ClassData classData) {
        classId.getClass();
        return this.f65973b.invoke(new C15315a(classId, classData));
    }
}
