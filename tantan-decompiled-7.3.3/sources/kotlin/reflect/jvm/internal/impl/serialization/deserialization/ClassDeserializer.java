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
import p153l.h85;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ClassDeserializer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<ClassId> f66645c = SetsKt.setOf(ClassId.Companion.m91936c(StandardNames.FqNames.f64560c.m91959m()));

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationComponents f66646a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<C15422a, ClassDescriptor> f66647b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<ClassId> m93035a() {
            return ClassDeserializer.f66645c;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a */
    public static final class C15422a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f66648a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final ClassData f66649b;

        public C15422a(@NotNull ClassId classId, @Nullable ClassData classData) {
            classId.getClass();
            this.f66648a = classId;
            this.f66649b = classData;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ClassData m93036a() {
            return this.f66649b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final ClassId m93037b() {
            return this.f66648a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C15422a) && Intrinsics.m88377d(this.f66648a, ((C15422a) obj).f66648a);
        }

        public int hashCode() {
            return this.f66648a.hashCode();
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.f66646a = deserializationComponents;
        this.f66647b = deserializationComponents.m93060u().mo93335c(new h85(this));
    }

    /* JADX INFO: renamed from: c */
    public static final ClassDescriptor m93031c(ClassDeserializer classDeserializer, C15422a c15422a) {
        c15422a.getClass();
        return classDeserializer.m93033d(c15422a);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ClassDescriptor m93032f(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.m93034e(classId, classData);
    }

    /* JADX INFO: renamed from: d */
    public final ClassDescriptor m93033d(C15422a c15422a) {
        Object next;
        DeserializationContext deserializationContextM93040a;
        PackageFragmentDescriptor packageFragmentDescriptor;
        ClassId classIdM93037b = c15422a.m93037b();
        Iterator<ClassDescriptorFactory> it = this.f66646a.m93051l().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorMo89173b = it.next().mo89173b(classIdM93037b);
            if (classDescriptorMo89173b != null) {
                return classDescriptorMo89173b;
            }
        }
        if (f66645c.contains(classIdM93037b)) {
            return null;
        }
        ClassData classDataM93036a = c15422a.m93036a();
        if (classDataM93036a == null && (classDataM93036a = this.f66646a.m93044e().mo91210a(classIdM93037b)) == null) {
            return null;
        }
        NameResolver nameResolverM93025a = classDataM93036a.m93025a();
        ProtoBuf.Class classM93026b = classDataM93036a.m93026b();
        BinaryVersion binaryVersionM93027c = classDataM93036a.m93027c();
        SourceElement sourceElementM93028d = classDataM93036a.m93028d();
        ClassId classIdM91928e = classIdM93037b.m91928e();
        if (classIdM91928e != null) {
            ClassDescriptor classDescriptorM93032f = m93032f(this, classIdM91928e, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorM93032f instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorM93032f : null;
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.m93213d1(classIdM93037b.m91931h())) {
                return null;
            }
            deserializationContextM93040a = deserializedClassDescriptor.m93206W0();
        } else {
            Iterator<T> it2 = PackageFragmentProviderKt.m89464c(this.f66646a.m93058s(), classIdM93037b.m91929f()).iterator();
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
            } while (!((DeserializedPackageFragment) packageFragmentDescriptor).m93081D0(classIdM93037b.m91931h()));
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.f66646a;
            ProtoBuf.TypeTable typeTable = classM93026b.getTypeTable();
            typeTable.getClass();
            TypeTable typeTable2 = new TypeTable(typeTable);
            VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = classM93026b.getVersionRequirementTable();
            versionRequirementTable.getClass();
            deserializationContextM93040a = deserializationComponents.m93040a(packageFragmentDescriptor2, nameResolverM93025a, typeTable2, companion.m91823a(versionRequirementTable), binaryVersionM93027c, null);
            binaryVersionM93027c = binaryVersionM93027c;
        }
        return new DeserializedClassDescriptor(deserializationContextM93040a, classM93026b, nameResolverM93025a, binaryVersionM93027c, sourceElementM93028d);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ClassDescriptor m93034e(@NotNull ClassId classId, @Nullable ClassData classData) {
        classId.getClass();
        return this.f66647b.invoke(new C15422a(classId, classData));
    }
}
