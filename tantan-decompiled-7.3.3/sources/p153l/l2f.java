package p153l;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class l2f implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f129767a;

    public l2f(@NotNull FqName fqName) {
        fqName.getClass();
        this.f129767a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k2f mo89529b(@NotNull FqName fqName) {
        fqName.getClass();
        if (Intrinsics.m88377d(fqName, this.f129767a)) {
            return k2f.INSTANCE;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ boolean mo89530d0(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m89535b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return CollectionsKt.emptyList().iterator();
    }
}
