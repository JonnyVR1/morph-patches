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
    public final ClassLoader f64998a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BuiltInsResourceLoader f64999b;

    public ReflectKotlinClassFinder(@NotNull ClassLoader classLoader) {
        classLoader.getClass();
        this.f64998a = classLoader;
        this.f64999b = new BuiltInsResourceLoader();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public KotlinClassFinder.Result mo89842a(@NotNull ClassId classId, @NotNull MetadataVersion metadataVersion) {
        classId.getClass();
        metadataVersion.getClass();
        return m89845d(ReflectKotlinClassFinderKt.m89847b(classId));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    @Nullable
    /* JADX INFO: renamed from: b */
    public InputStream mo89843b(@NotNull FqName fqName) {
        fqName.getClass();
        if (fqName.m91944h(StandardNames.f64508z)) {
            return this.f64999b.m93175a(BuiltInSerializerProtocol.INSTANCE.m93171r(fqName));
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    /* JADX INFO: renamed from: c */
    public KotlinClassFinder.Result mo89844c(@NotNull JavaClass javaClass, @NotNull MetadataVersion metadataVersion) {
        String strM91937a;
        javaClass.getClass();
        metadataVersion.getClass();
        FqName fqNameMo89923d = javaClass.mo89923d();
        if (fqNameMo89923d == null || (strM91937a = fqNameMo89923d.m91937a()) == null) {
            return null;
        }
        return m89845d(strM91937a);
    }

    /* JADX INFO: renamed from: d */
    public final KotlinClassFinder.Result m89845d(String str) {
        ReflectKotlinClass reflectKotlinClassM89841a;
        Class<?> clsM89835a = ReflectJavaClassFinderKt.m89835a(this.f64998a, str);
        if (clsM89835a == null || (reflectKotlinClassM89841a = ReflectKotlinClass.f64995c.m89841a(clsM89835a)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassM89841a, null, 2, null);
    }
}
