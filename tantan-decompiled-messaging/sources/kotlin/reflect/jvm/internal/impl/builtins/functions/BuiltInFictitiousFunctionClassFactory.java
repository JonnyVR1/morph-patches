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
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f63941a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f63942b;

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.f63941a = storageManager;
        this.f63942b = moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /* JADX INFO: renamed from: a */
    public boolean mo88281a(@NotNull FqName fqName, @NotNull Name name) {
        fqName.getClass();
        name.getClass();
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        return (C15386d.m93483J(strM91082b, "Function", false, 2, null) || C15386d.m93483J(strM91082b, "KFunction", false, 2, null) || C15386d.m93483J(strM91082b, "SuspendFunction", false, 2, null) || C15386d.m93483J(strM91082b, "KSuspendFunction", false, 2, null)) && FunctionTypeKindExtractor.Companion.m88334a().m88332c(fqName, strM91082b) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    /* JADX INFO: renamed from: b */
    public ClassDescriptor mo88282b(@NotNull ClassId classId) {
        FqName fqNameM91038f;
        FunctionTypeKindExtractor.KindWithArity kindWithArityM88332c;
        classId.getClass();
        if (classId.m91041i() || classId.m91042j()) {
            return null;
        }
        String strM91046a = classId.m91039g().m91046a();
        if (!StringsKt.m93412P(strM91046a, "Function", false, 2, null) || (kindWithArityM88332c = FunctionTypeKindExtractor.Companion.m88334a().m88332c((fqNameM91038f = classId.m91038f()), strM91046a)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindM88335a = kindWithArityM88332c.m88335a();
        int iM88336b = kindWithArityM88332c.m88336b();
        List<PackageFragmentDescriptor> listMo88574H = this.f63942b.mo88543I(fqNameM91038f).mo88574H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo88574H) {
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
        return new FunctionClassDescriptor(this.f63941a, packageFragmentDescriptor, functionTypeKindM88335a, iM88336b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<ClassDescriptor> mo88283c(@NotNull FqName fqName) {
        fqName.getClass();
        return SetsKt.emptySet();
    }
}
