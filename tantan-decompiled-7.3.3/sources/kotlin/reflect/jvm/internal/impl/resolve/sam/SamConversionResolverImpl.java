package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Iterable<Object> f66550a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CacheWithNullableValues<ClassDescriptor, SimpleType> f66551b;

    public SamConversionResolverImpl(@NotNull StorageManager storageManager, @NotNull Iterable<? extends Object> iterable) {
        storageManager.getClass();
        iterable.getClass();
        this.f66550a = iterable;
        this.f66551b = storageManager.mo93340h();
    }
}
