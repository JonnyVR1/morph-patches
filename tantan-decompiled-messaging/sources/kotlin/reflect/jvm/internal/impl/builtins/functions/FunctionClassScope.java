package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(@NotNull StorageManager storageManager, @NotNull FunctionClassDescriptor functionClassDescriptor) {
        super(storageManager, functionClassDescriptor);
        storageManager.getClass();
        functionClassDescriptor.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<FunctionDescriptor> mo87813j() {
        ClassDescriptor classDescriptorM92059m = m92059m();
        classDescriptorM92059m.getClass();
        FunctionTypeKind functionTypeKindM88295N0 = ((FunctionClassDescriptor) classDescriptorM92059m).m88295N0();
        if (Intrinsics.m87488d(functionTypeKindM88295N0, FunctionTypeKind.Function.INSTANCE)) {
            return CollectionsKt.listOf(FunctionInvokeDescriptor.f63954E.m88325a((FunctionClassDescriptor) m92059m(), false));
        }
        return Intrinsics.m87488d(functionTypeKindM88295N0, FunctionTypeKind.SuspendFunction.INSTANCE) ? CollectionsKt.listOf(FunctionInvokeDescriptor.f63954E.m88325a((FunctionClassDescriptor) m92059m(), true)) : CollectionsKt.emptyList();
    }
}
