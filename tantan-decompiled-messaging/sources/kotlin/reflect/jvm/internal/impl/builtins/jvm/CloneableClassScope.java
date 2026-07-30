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
    public static final Name f63965d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Name m88339a() {
            return CloneableClassScope.f63965d;
        }

        private Companion() {
        }
    }

    static {
        Name nameM91079i = Name.m91079i("clone");
        nameM91079i.getClass();
        f63965d = nameM91079i;
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
    public List<FunctionDescriptor> mo87813j() {
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplM88898e1 = SimpleFunctionDescriptorImpl.m88898e1(m92059m(), Annotations.Companion.m88641b(), f63965d, CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f64063a);
        simpleFunctionDescriptorImplM88898e1.mo88743K0(null, m92059m().mo88456R(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), DescriptorUtilsKt.m91980m(m92059m()).m88232i(), Modality.OPEN, DescriptorVisibilities.f64024c);
        return CollectionsKt.listOf(simpleFunctionDescriptorImplM88898e1);
    }
}
