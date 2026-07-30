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
import p153l.v1d0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaToKotlinClassMapper {

    @NotNull
    public static final JavaToKotlinClassMapper INSTANCE = new JavaToKotlinClassMapper();

    private JavaToKotlinClassMapper() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ClassDescriptor m89254f(JavaToKotlinClassMapper javaToKotlinClassMapper, FqName fqName, KotlinBuiltIns kotlinBuiltIns, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.m89259e(fqName, kotlinBuiltIns, num);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassDescriptor m89255a(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqName fqNameM89248o = JavaToKotlinClassMap.INSTANCE.m89248o(DescriptorUtils.m92663m(classDescriptor));
        if (fqNameM89248o == null) {
            v1d0.m199002a("Given class ", classDescriptor, " is not a mutable collection");
            return null;
        }
        ClassDescriptor classDescriptorM89130p = DescriptorUtilsKt.m92871m(classDescriptor).m89130p(fqNameM89248o);
        classDescriptorM89130p.getClass();
        return classDescriptorM89130p;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m89256b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqName fqNameM89249p = JavaToKotlinClassMap.INSTANCE.m89249p(DescriptorUtils.m92663m(classDescriptor));
        if (fqNameM89249p == null) {
            v1d0.m199002a("Given class ", classDescriptor, " is not a read-only collection");
            return null;
        }
        ClassDescriptor classDescriptorM89130p = DescriptorUtilsKt.m92871m(classDescriptor).m89130p(fqNameM89249p);
        classDescriptorM89130p.getClass();
        return classDescriptorM89130p;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89257c(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return JavaToKotlinClassMap.INSTANCE.m89244k(DescriptorUtils.m92663m(classDescriptor));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89258d(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return JavaToKotlinClassMap.INSTANCE.m89245l(DescriptorUtils.m92663m(classDescriptor));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ClassDescriptor m89259e(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable Integer num) {
        fqName.getClass();
        kotlinBuiltIns.getClass();
        ClassId classIdM89246m = (num == null || !Intrinsics.m88377d(fqName, JavaToKotlinClassMap.INSTANCE.m89241h())) ? JavaToKotlinClassMap.INSTANCE.m89246m(fqName) : StandardNames.m89154a(num.intValue());
        if (classIdM89246m != null) {
            return kotlinBuiltIns.m89130p(classIdM89246m.m91925a());
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Collection<ClassDescriptor> m89260g(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        fqName.getClass();
        kotlinBuiltIns.getClass();
        ClassDescriptor classDescriptorM89254f = m89254f(this, fqName, kotlinBuiltIns, null, 4, null);
        if (classDescriptorM89254f == null) {
            return SetsKt.emptySet();
        }
        FqName fqNameM89249p = JavaToKotlinClassMap.INSTANCE.m89249p(DescriptorUtilsKt.m92874p(classDescriptorM89254f));
        if (fqNameM89249p == null) {
            return SetsKt.setOf(classDescriptorM89254f);
        }
        ClassDescriptor classDescriptorM89130p = kotlinBuiltIns.m89130p(fqNameM89249p);
        classDescriptorM89130p.getClass();
        return CollectionsKt.listOf((Object[]) new ClassDescriptor[]{classDescriptorM89254f, classDescriptorM89130p});
    }
}
