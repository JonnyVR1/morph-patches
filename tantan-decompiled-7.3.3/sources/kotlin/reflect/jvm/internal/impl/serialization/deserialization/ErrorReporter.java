package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ErrorReporter {

    /* JADX INFO: renamed from: a */
    public static final ErrorReporter f66690a = new C15423a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter$a */
    public static class C15423a implements ErrorReporter {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m93089c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        /* JADX INFO: renamed from: a */
        public void mo89849a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                m93089c(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        /* JADX INFO: renamed from: b */
        public void mo89850b(@NotNull ClassDescriptor classDescriptor, @NotNull List<String> list) {
            if (classDescriptor == null) {
                m93089c(0);
            }
            if (list == null) {
                m93089c(1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo89849a(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    /* JADX INFO: renamed from: b */
    void mo89850b(@NotNull ClassDescriptor classDescriptor, @NotNull List<String> list);
}
