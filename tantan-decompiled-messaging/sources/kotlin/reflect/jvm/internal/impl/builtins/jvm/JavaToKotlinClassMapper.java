package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qtc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaToKotlinClassMapper {

    @NotNull
    public static final JavaToKotlinClassMapper INSTANCE = new JavaToKotlinClassMapper();

    private JavaToKotlinClassMapper() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ClassDescriptor m88363f(JavaToKotlinClassMapper javaToKotlinClassMapper, FqName fqName, KotlinBuiltIns kotlinBuiltIns, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.m88368e(fqName, kotlinBuiltIns, num);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassDescriptor m88364a(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqName fqNameM88357o = JavaToKotlinClassMap.INSTANCE.m88357o(DescriptorUtils.m91772m(classDescriptor));
        if (fqNameM88357o == null) {
            qtc0.m176411a("Given class ", classDescriptor, " is not a mutable collection");
            return null;
        }
        ClassDescriptor classDescriptorM88239p = DescriptorUtilsKt.m91980m(classDescriptor).m88239p(fqNameM88357o);
        classDescriptorM88239p.getClass();
        return classDescriptorM88239p;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m88365b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqName fqNameM88358p = JavaToKotlinClassMap.INSTANCE.m88358p(DescriptorUtils.m91772m(classDescriptor));
        if (fqNameM88358p == null) {
            qtc0.m176411a("Given class ", classDescriptor, " is not a read-only collection");
            return null;
        }
        ClassDescriptor classDescriptorM88239p = DescriptorUtilsKt.m91980m(classDescriptor).m88239p(fqNameM88358p);
        classDescriptorM88239p.getClass();
        return classDescriptorM88239p;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88366c(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return JavaToKotlinClassMap.INSTANCE.m88353k(DescriptorUtils.m91772m(classDescriptor));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m88367d(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return JavaToKotlinClassMap.INSTANCE.m88354l(DescriptorUtils.m91772m(classDescriptor));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ClassDescriptor m88368e(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable Integer num) {
        fqName.getClass();
        kotlinBuiltIns.getClass();
        ClassId classIdM88355m = (num == null || !Intrinsics.m87488d(fqName, JavaToKotlinClassMap.INSTANCE.m88350h())) ? JavaToKotlinClassMap.INSTANCE.m88355m(fqName) : StandardNames.m88263a(num.intValue());
        if (classIdM88355m != null) {
            return kotlinBuiltIns.m88239p(classIdM88355m.m91034a());
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Collection<ClassDescriptor> m88369g(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        fqName.getClass();
        kotlinBuiltIns.getClass();
        ClassDescriptor classDescriptorM88363f = m88363f(this, fqName, kotlinBuiltIns, null, 4, null);
        if (classDescriptorM88363f == null) {
            return SetsKt.emptySet();
        }
        FqName fqNameM88358p = JavaToKotlinClassMap.INSTANCE.m88358p(DescriptorUtilsKt.m91983p(classDescriptorM88363f));
        if (fqNameM88358p == null) {
            return SetsKt.setOf(classDescriptorM88363f);
        }
        ClassDescriptor classDescriptorM88239p = kotlinBuiltIns.m88239p(fqNameM88358p);
        classDescriptorM88239p.getClass();
        return CollectionsKt.listOf((Object[]) new ClassDescriptor[]{classDescriptorM88363f, classDescriptorM88239p});
    }
}
