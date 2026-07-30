package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Name f64639d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Name m89230a() {
            return CloneableClassScope.f64639d;
        }

        private Companion() {
        }
    }

    static {
        Name nameM91970i = Name.m91970i("clone");
        nameM91970i.getClass();
        f64639d = nameM91970i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        super(storageManager, classDescriptor);
        storageManager.getClass();
        classDescriptor.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<FunctionDescriptor> mo88704j() {
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplM89789e1 = SimpleFunctionDescriptorImpl.m89789e1(m92950m(), Annotations.Companion.m89532b(), f64639d, CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f64737a);
        simpleFunctionDescriptorImplM89789e1.mo89634K0(null, m92950m().mo89347R(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), DescriptorUtilsKt.m92871m(m92950m()).m89123i(), Modality.OPEN, DescriptorVisibilities.f64698c);
        return CollectionsKt.listOf(simpleFunctionDescriptorImplM89789e1);
    }
}
