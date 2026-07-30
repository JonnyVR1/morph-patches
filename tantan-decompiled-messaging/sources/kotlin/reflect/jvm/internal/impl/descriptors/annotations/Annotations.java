package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {

    @NotNull
    public static final Companion Companion = Companion.f64078a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64078a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Annotations f64079b = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            /* JADX INFO: renamed from: a */
            public Void m88642a(FqName fqName) {
                fqName.getClass();
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: b */
            public /* bridge */ /* synthetic */ AnnotationDescriptor mo88638b(FqName fqName) {
                return (AnnotationDescriptor) m88642a(fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: c0 */
            public /* bridge */ boolean mo88639c0(FqName fqName) {
                return Annotations.DefaultImpls.m88644b(this, fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<AnnotationDescriptor> iterator() {
                return CollectionsKt.emptyList().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        };

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Annotations m88640a(@NotNull List<? extends AnnotationDescriptor> list) {
            list.getClass();
            return list.isEmpty() ? f64079b : new AnnotationsImpl(list);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Annotations m88641b() {
            return f64079b;
        }
    }

    @SourceDebugExtension
    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static AnnotationDescriptor m88643a(@NotNull Annotations annotations, @NotNull FqName fqName) {
            AnnotationDescriptor next;
            fqName.getClass();
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.m87488d(next.mo88631d(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m88644b(@NotNull Annotations annotations, @NotNull FqName fqName) {
            fqName.getClass();
            return annotations.mo88638b(fqName) != null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    AnnotationDescriptor mo88638b(@NotNull FqName fqName);

    /* JADX INFO: renamed from: c0 */
    boolean mo88639c0(@NotNull FqName fqName);

    boolean isEmpty();
}
