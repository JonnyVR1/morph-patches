package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassLoader f64324a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BuiltInsResourceLoader f64325b;

    public ReflectKotlinClassFinder(@NotNull ClassLoader classLoader) {
        classLoader.getClass();
        this.f64324a = classLoader;
        this.f64325b = new BuiltInsResourceLoader();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public KotlinClassFinder.Result mo88951a(@NotNull ClassId classId, @NotNull MetadataVersion metadataVersion) {
        classId.getClass();
        metadataVersion.getClass();
        return m88954d(ReflectKotlinClassFinderKt.m88956b(classId));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    @Nullable
    /* JADX INFO: renamed from: b */
    public InputStream mo88952b(@NotNull FqName fqName) {
        fqName.getClass();
        if (fqName.m91053h(StandardNames.f63834z)) {
            return this.f64325b.m92284a(BuiltInSerializerProtocol.INSTANCE.m92280r(fqName));
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    /* JADX INFO: renamed from: c */
    public KotlinClassFinder.Result mo88953c(@NotNull JavaClass javaClass, @NotNull MetadataVersion metadataVersion) {
        String strM91046a;
        javaClass.getClass();
        metadataVersion.getClass();
        FqName fqNameMo89032d = javaClass.mo89032d();
        if (fqNameMo89032d == null || (strM91046a = fqNameMo89032d.m91046a()) == null) {
            return null;
        }
        return m88954d(strM91046a);
    }

    /* JADX INFO: renamed from: d */
    public final KotlinClassFinder.Result m88954d(String str) {
        ReflectKotlinClass reflectKotlinClassM88950a;
        Class<?> clsM88944a = ReflectJavaClassFinderKt.m88944a(this.f64324a, str);
        if (clsM88944a == null || (reflectKotlinClassM88950a = ReflectKotlinClass.f64321c.m88950a(clsM88944a)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassM88950a, null, 2, null);
    }
}
