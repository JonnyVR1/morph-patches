package kotlin.reflect.jvm.internal.impl.resolve;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorUtils {

    /* JADX INFO: renamed from: a */
    public static final FqName f66483a = new FqName("kotlin.jvm.JvmName");

    private DescriptorUtils() {
    }

    /* JADX INFO: renamed from: A */
    public static boolean m92638A(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m92641D(declarationDescriptor, ClassKind.ENUM_CLASS);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m92639B(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(36);
        }
        return m92641D(declarationDescriptor, ClassKind.ENUM_ENTRY);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m92640C(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m92641D(declarationDescriptor, ClassKind.INTERFACE);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m92641D(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind) {
        if (classKind == null) {
            m92651a(37);
        }
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).getKind() == classKind;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m92642E(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(1);
        }
        while (declarationDescriptor != null) {
            if (m92671u(declarationDescriptor) || m92675y(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.mo89190b();
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m92643F(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            m92651a(30);
        }
        if (declarationDescriptor == null) {
            m92651a(31);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e == null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo89336a = classifierDescriptorMo89207e.mo89336a();
        return (declarationDescriptorMo89336a instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).mo89196l().equals(((ClassifierDescriptor) declarationDescriptorMo89336a).mo89196l());
    }

    /* JADX INFO: renamed from: G */
    public static boolean m92644G(@Nullable DeclarationDescriptor declarationDescriptor) {
        return (m92641D(declarationDescriptor, ClassKind.CLASS) || m92641D(declarationDescriptor, ClassKind.INTERFACE)) && ((ClassDescriptor) declarationDescriptor).mo89194i() == Modality.SEALED;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m92645H(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            m92651a(28);
        }
        if (classDescriptor2 == null) {
            m92651a(29);
        }
        return m92646I(classDescriptor.mo89349o(), classDescriptor2.mo89336a());
    }

    /* JADX INFO: renamed from: I */
    public static boolean m92646I(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            m92651a(32);
        }
        if (declarationDescriptor == null) {
            m92651a(33);
        }
        if (m92643F(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator<KotlinType> it = kotlinType.mo92781G0().mo89569c().iterator();
        while (it.hasNext()) {
            if (m92646I(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m92647J(@Nullable DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.mo89190b() instanceof PackageFragmentDescriptor);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m92648K(@NotNull VariableDescriptor variableDescriptor, @NotNull KotlinType kotlinType) {
        if (variableDescriptor == null) {
            m92651a(65);
        }
        if (kotlinType == null) {
            m92651a(66);
        }
        if (variableDescriptor.mo89511y() || KotlinTypeKt.m93535a(kotlinType)) {
            return false;
        }
        if (TypeUtils.m93682b(kotlinType)) {
            return true;
        }
        KotlinBuiltIns kotlinBuiltInsM92871m = DescriptorUtilsKt.m92871m(variableDescriptor);
        if (!KotlinBuiltIns.m89089t0(kotlinType)) {
            KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f66972a;
            if (!kotlinTypeChecker.mo93794a(kotlinBuiltInsM92871m.m89116X(), kotlinType) && !kotlinTypeChecker.mo93794a(kotlinBuiltInsM92871m.m89107L().mo89349o(), kotlinType) && !kotlinTypeChecker.mo93794a(kotlinBuiltInsM92871m.m89123i(), kotlinType) && !UnsignedTypes.m89168d(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public static <D extends CallableMemberDescriptor> D m92649L(@NotNull D d) {
        if (d == null) {
            m92651a(58);
        }
        while (d.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> collectionMo89338e = d.mo89338e();
            if (collectionMo89338e.isEmpty()) {
                xtq0.m213103a("Fake override should have at least one overridden descriptor: ", d);
                return null;
            }
            d = (D) collectionMo89338e.iterator().next();
        }
        return d;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public static <D extends DeclarationDescriptorWithVisibility> D m92650M(@NotNull D d) {
        if (d == null) {
            m92651a(63);
        }
        if (d instanceof CallableMemberDescriptor) {
            return m92649L((CallableMemberDescriptor) d);
        }
        if (d == null) {
            m92651a(64);
        }
        return d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92651a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case 85:
            case 88:
            case EACTags.HEADER_LIST /* 93 */:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case 85:
            case 88:
            case EACTags.HEADER_LIST /* 93 */:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case EACTags.FILE_REFERENCE /* 81 */:
            case EACTags.LOGIN_DATA /* 94 */:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case 85:
            case 88:
            case EACTags.HEADER_LIST /* 93 */:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = MerchandiseTimeUnit.second;
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                objArr[0] = LovePlanetStage.result;
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case 89:
            case EACTags.NAME /* 91 */:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case EACTags.TAG_LIST /* 92 */:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case EACTags.HEADER_LIST /* 93 */:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case 85:
            case 88:
            case EACTags.HEADER_LIST /* 93 */:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case EACTags.FILE_REFERENCE /* 81 */:
                objArr[2] = "getContainingSourceFile";
                break;
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                objArr[2] = "getAllDescriptors";
                break;
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case EACTags.NAME /* 91 */:
            case EACTags.TAG_LIST /* 92 */:
                objArr[2] = "getPropertyByName";
                break;
            case EACTags.LOGIN_DATA /* 94 */:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case 85:
            case 88:
            case EACTags.HEADER_LIST /* 93 */:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m92652b(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m92651a(16);
        }
        if (declarationDescriptor2 == null) {
            m92651a(17);
        }
        return m92657g(declarationDescriptor).equals(m92657g(declarationDescriptor2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <D extends CallableDescriptor> void m92653c(@NotNull D d, @NotNull Set<D> set) {
        if (d == null) {
            m92651a(72);
        }
        if (set == 0) {
            m92651a(73);
        }
        if (set.contains(d)) {
            return;
        }
        Iterator<? extends CallableDescriptor> it = d.mo89336a().mo89338e().iterator();
        while (it.hasNext()) {
            CallableDescriptor callableDescriptorMo89336a = it.next().mo89336a();
            m92653c(callableDescriptorMo89336a, set);
            set.add(callableDescriptorMo89336a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static <D extends CallableDescriptor> Set<D> m92654d(@NotNull D d) {
        if (d == null) {
            m92651a(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m92653c(d.mo89336a(), linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static ClassDescriptor m92655e(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92651a(45);
        }
        return m92656f(kotlinType.mo92781G0());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static ClassDescriptor m92656f(@NotNull TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            m92651a(46);
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructor.mo89207e();
        if (classDescriptor == null) {
            m92651a(47);
        }
        return classDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static ModuleDescriptor m92657g(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(21);
        }
        ModuleDescriptor moduleDescriptorM92658h = m92658h(declarationDescriptor);
        if (moduleDescriptorM92658h == null) {
            m92651a(22);
        }
        return moduleDescriptorM92658h;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static ModuleDescriptor m92658h(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(23);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).mo89468z0();
            }
            declarationDescriptor = declarationDescriptor.mo89190b();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static ModuleDescriptor m92659i(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m92651a(20);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e == null) {
            return null;
        }
        return m92658h(classifierDescriptorMo89207e);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static SourceFile m92660j(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(81);
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).mo89473d0();
        }
        if (declarationDescriptor instanceof DeclarationDescriptorWithSource) {
            SourceFile sourceFileMo89484b = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().mo89484b();
            if (sourceFileMo89484b == null) {
                m92651a(82);
            }
            return sourceFileMo89484b;
        }
        SourceFile sourceFile = SourceFile.f64738a;
        if (sourceFile == null) {
            m92651a(83);
        }
        return sourceFile;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static DescriptorVisibility m92661k(@NotNull ClassDescriptor classDescriptor, boolean z) {
        if (classDescriptor == null) {
            m92651a(48);
        }
        ClassKind kind = classDescriptor.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64696a;
            if (descriptorVisibility == null) {
                m92651a(49);
            }
            return descriptorVisibility;
        }
        if (m92644G(classDescriptor)) {
            if (z) {
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.f64698c;
                if (descriptorVisibility2 == null) {
                    m92651a(50);
                }
                return descriptorVisibility2;
            }
            DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.f64696a;
            if (descriptorVisibility3 == null) {
                m92651a(51);
            }
            return descriptorVisibility3;
        }
        if (m92671u(classDescriptor)) {
            DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.f64707l;
            if (descriptorVisibility4 == null) {
                m92651a(52);
            }
            return descriptorVisibility4;
        }
        DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.f64700e;
        if (descriptorVisibility5 == null) {
            m92651a(53);
        }
        return descriptorVisibility5;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static ReceiverParameterDescriptor m92662l(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(0);
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptor).mo89347R();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static FqNameUnsafe m92663m(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(2);
        }
        FqName fqNameM92665o = m92665o(declarationDescriptor);
        return fqNameM92665o != null ? fqNameM92665o.m91945i() : m92666p(declarationDescriptor);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static FqName m92664n(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(3);
        }
        FqName fqNameM92665o = m92665o(declarationDescriptor);
        if (fqNameM92665o == null) {
            fqNameM92665o = m92666p(declarationDescriptor).m91959m();
        }
        if (fqNameM92665o == null) {
            m92651a(4);
        }
        return fqNameM92665o;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static FqName m92665o(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(5);
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.m93894m(declarationDescriptor)) {
            return FqName.f66146c;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).mo89466d();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).mo89453d();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static FqNameUnsafe m92666p(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(6);
        }
        FqNameUnsafe fqNameUnsafeM91949b = m92663m(declarationDescriptor.mo89190b()).m91949b(declarationDescriptor.getName());
        if (fqNameUnsafeM91949b == null) {
            m92651a(7);
        }
        return fqNameUnsafeM91949b;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static <D extends DeclarationDescriptor> D m92667q(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls) {
        if (cls == null) {
            m92651a(18);
        }
        return (D) m92668r(declarationDescriptor, cls, true);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static <D extends DeclarationDescriptor> D m92668r(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls, boolean z) {
        if (cls == null) {
            m92651a(19);
        }
        if (declarationDescriptor == null) {
            return null;
        }
        if (z) {
            declarationDescriptor = (D) declarationDescriptor.mo89190b();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.mo89190b();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static ClassDescriptor m92669s(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m92651a(44);
        }
        Iterator<KotlinType> it = classDescriptor.mo89196l().mo89569c().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorM92655e = m92655e(it.next());
            if (classDescriptorM92655e.getKind() != ClassKind.INTERFACE) {
                return classDescriptorM92655e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m92670t(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m92641D(declarationDescriptor, ClassKind.ANNOTATION_CLASS);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m92671u(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m92651a(34);
        }
        return m92672v(declarationDescriptor) && declarationDescriptor.getName().equals(SpecialNames.f66160a);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m92672v(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m92641D(declarationDescriptor, ClassKind.CLASS);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m92673w(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m92672v(declarationDescriptor) || m92638A(declarationDescriptor);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m92674x(@Nullable DeclarationDescriptor declarationDescriptor) {
        return m92641D(declarationDescriptor, ClassKind.OBJECT) && ((ClassDescriptor) declarationDescriptor).mo89193h0();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m92675y(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.f64701f;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m92676z(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            m92651a(26);
        }
        if (classDescriptor2 == null) {
            m92651a(27);
        }
        Iterator<KotlinType> it = classDescriptor.mo89196l().mo89569c().iterator();
        while (it.hasNext()) {
            if (m92643F(it.next(), classDescriptor2.mo89336a())) {
                return true;
            }
        }
        return false;
    }
}
