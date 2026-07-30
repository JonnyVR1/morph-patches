package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            m93383I(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: I */
    private static /* synthetic */ void m93383I(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: J */
    public abstract ClassDescriptor mo89207e();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        KotlinBuiltIns kotlinBuiltInsM92871m = DescriptorUtilsKt.m92871m(mo89207e());
        if (kotlinBuiltInsM92871m == null) {
            m93383I(1);
        }
        return kotlinBuiltInsM92871m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    /* JADX INFO: renamed from: j */
    public boolean mo89581j(@NotNull ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            m93383I(2);
        }
        return (classifierDescriptor instanceof ClassDescriptor) && m93460h(mo89207e(), classifierDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @Nullable
    /* JADX INFO: renamed from: t */
    public KotlinType mo89582t() {
        if (KotlinBuiltIns.m89091v0(mo89207e())) {
            return null;
        }
        return mo89570f().m89123i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: u */
    public Collection<KotlinType> mo93384u(boolean z) {
        DeclarationDescriptor declarationDescriptorMo89190b = mo89207e().mo89190b();
        if (!(declarationDescriptorMo89190b instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                m93383I(3);
            }
            return list;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorMo89190b;
        smartList.add(classDescriptor.mo89349o());
        ClassDescriptor classDescriptorMo89201p0 = classDescriptor.mo89201p0();
        if (z && classDescriptorMo89201p0 != null) {
            smartList.add(classDescriptorMo89201p0.mo89349o());
        }
        return smartList;
    }
}
