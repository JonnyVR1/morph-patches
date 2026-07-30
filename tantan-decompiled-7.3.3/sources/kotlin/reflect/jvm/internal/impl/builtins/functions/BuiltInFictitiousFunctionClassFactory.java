package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f64615a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f64616b;

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.f64615a = storageManager;
        this.f64616b = moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /* JADX INFO: renamed from: a */
    public boolean mo89172a(@NotNull FqName fqName, @NotNull Name name) {
        fqName.getClass();
        name.getClass();
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        return (C15493d.m94374J(strM91973b, "Function", false, 2, null) || C15493d.m94374J(strM91973b, "KFunction", false, 2, null) || C15493d.m94374J(strM91973b, "SuspendFunction", false, 2, null) || C15493d.m94374J(strM91973b, "KSuspendFunction", false, 2, null)) && FunctionTypeKindExtractor.Companion.m89225a().m89223c(fqName, strM91973b) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    /* JADX INFO: renamed from: b */
    public ClassDescriptor mo89173b(@NotNull ClassId classId) {
        FqName fqNameM91929f;
        FunctionTypeKindExtractor.KindWithArity kindWithArityM89223c;
        classId.getClass();
        if (classId.m91932i() || classId.m91933j()) {
            return null;
        }
        String strM91937a = classId.m91930g().m91937a();
        if (!StringsKt.m94303P(strM91937a, "Function", false, 2, null) || (kindWithArityM89223c = FunctionTypeKindExtractor.Companion.m89225a().m89223c((fqNameM91929f = classId.m91929f()), strM91937a)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindM89226a = kindWithArityM89223c.m89226a();
        int iM89227b = kindWithArityM89223c.m89227b();
        List<PackageFragmentDescriptor> listMo89465H = this.f64616b.mo89434I(fqNameM91929f).mo89465H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo89465H) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.firstOrNull((List) arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
        }
        return new FunctionClassDescriptor(this.f64615a, packageFragmentDescriptor, functionTypeKindM89226a, iM89227b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<ClassDescriptor> mo89174c(@NotNull FqName fqName) {
        fqName.getClass();
        return SetsKt.emptySet();
    }
}
