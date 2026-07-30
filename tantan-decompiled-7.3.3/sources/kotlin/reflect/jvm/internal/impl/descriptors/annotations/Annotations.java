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
    public static final Companion Companion = Companion.f64752a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64752a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Annotations f64753b = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            /* JADX INFO: renamed from: a */
            public Void m89533a(FqName fqName) {
                fqName.getClass();
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: b */
            public /* bridge */ /* synthetic */ AnnotationDescriptor mo89529b(FqName fqName) {
                return (AnnotationDescriptor) m89533a(fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: d0 */
            public /* bridge */ boolean mo89530d0(FqName fqName) {
                return Annotations.DefaultImpls.m89535b(this, fqName);
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
        public final Annotations m89531a(@NotNull List<? extends AnnotationDescriptor> list) {
            list.getClass();
            return list.isEmpty() ? f64753b : new AnnotationsImpl(list);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Annotations m89532b() {
            return f64753b;
        }
    }

    @SourceDebugExtension
    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static AnnotationDescriptor m89534a(@NotNull Annotations annotations, @NotNull FqName fqName) {
            AnnotationDescriptor next;
            fqName.getClass();
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.m88377d(next.mo89522d(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m89535b(@NotNull Annotations annotations, @NotNull FqName fqName) {
            fqName.getClass();
            return annotations.mo89529b(fqName) != null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    AnnotationDescriptor mo89529b(@NotNull FqName fqName);

    /* JADX INFO: renamed from: d0 */
    boolean mo89530d0(@NotNull FqName fqName);

    boolean isEmpty();
}
