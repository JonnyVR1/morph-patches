package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    @NotNull
    public static final RuntimeErrorReporter INSTANCE = new RuntimeErrorReporter();

    private RuntimeErrorReporter() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    /* JADX INFO: renamed from: a */
    public void mo88958a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        throw new IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    /* JADX INFO: renamed from: b */
    public void mo88959b(@NotNull ClassDescriptor classDescriptor, @NotNull List<String> list) {
        classDescriptor.getClass();
        list.getClass();
        throw new IllegalStateException("Incomplete hierarchy for class " + classDescriptor.getName() + ", unresolved classes " + list);
    }
}
