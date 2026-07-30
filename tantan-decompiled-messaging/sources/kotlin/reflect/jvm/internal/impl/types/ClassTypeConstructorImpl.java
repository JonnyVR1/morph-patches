package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: d */
    public final ClassDescriptor f66205d;

    /* JADX INFO: renamed from: e */
    public final List<TypeParameterDescriptor> f66206e;

    /* JADX INFO: renamed from: f */
    public final Collection<KotlinType> f66207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(@NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull Collection<KotlinType> collection, @NotNull StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            m92568I(0);
        }
        if (list == null) {
            m92568I(1);
        }
        if (collection == null) {
            m92568I(2);
        }
        if (storageManager == null) {
            m92568I(3);
        }
        this.f66205d = classDescriptor;
        this.f66206e = Collections.unmodifiableList(new ArrayList(list));
        this.f66207f = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: I */
    private static /* synthetic */ void m92568I(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: J */
    public ClassDescriptor mo88316e() {
        ClassDescriptor classDescriptor = this.f66205d;
        if (classDescriptor == null) {
            m92568I(5);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo88317g() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        List<TypeParameterDescriptor> list = this.f66206e;
        if (list == null) {
            m92568I(4);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: s */
    public Collection<KotlinType> mo88318s() {
        Collection<KotlinType> collection = this.f66207f;
        if (collection == null) {
            m92568I(6);
        }
        return collection;
    }

    public String toString() {
        return DescriptorUtils.m91772m(this.f66205d).m91057a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: w */
    public SupertypeLoopChecker mo88319w() {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        if (empty == null) {
            m92568I(7);
        }
        return empty;
    }
}
