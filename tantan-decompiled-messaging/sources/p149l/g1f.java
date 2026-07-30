package p149l;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class g1f implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f100177a;

    public g1f(@NotNull FqName fqName) {
        fqName.getClass();
        this.f100177a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1f mo88638b(@NotNull FqName fqName) {
        fqName.getClass();
        if (Intrinsics.m87488d(fqName, this.f100177a)) {
            return f1f.INSTANCE;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ boolean mo88639c0(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m88644b(this, fqName);
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
