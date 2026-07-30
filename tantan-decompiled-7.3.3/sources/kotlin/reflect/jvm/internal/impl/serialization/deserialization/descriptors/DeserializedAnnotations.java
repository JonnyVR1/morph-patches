package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DeserializedAnnotations implements Annotations {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty<Object>[] f66735b = {Reflection.m88403i(new PropertyReference1Impl(DeserializedAnnotations.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NotNullLazyValue f66736a;

    public DeserializedAnnotations(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<? extends AnnotationDescriptor>> function0) {
        storageManager.getClass();
        function0.getClass();
        this.f66736a = storageManager.mo93337e(function0);
    }

    /* JADX INFO: renamed from: a */
    private final List<AnnotationDescriptor> m93176a() {
        return (List) StorageKt.m93375a(this.f66736a, this, f66735b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ AnnotationDescriptor mo89529b(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m89534a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ boolean mo89530d0(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m89535b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return m93176a().isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return m93176a().iterator();
    }
}
