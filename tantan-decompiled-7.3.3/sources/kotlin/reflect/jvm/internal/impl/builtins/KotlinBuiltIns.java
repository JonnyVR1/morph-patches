package kotlin.reflect.jvm.internal.impl.builtins;

import com.alibaba.fastjson.asm.Opcodes;
import com.momo.momortc.MMConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.c2r;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinBuiltIns {

    /* JADX INFO: renamed from: g */
    public static final Name f64446g = Name.m91972n("<built-ins module>");

    /* JADX INFO: renamed from: a */
    public ModuleDescriptorImpl f64447a;

    /* JADX INFO: renamed from: b */
    public NotNullLazyValue<ModuleDescriptorImpl> f64448b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue<C15286e> f64449c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue<Collection<PackageViewDescriptor>> f64450d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNotNull<Name, ClassDescriptor> f64451e;

    /* JADX INFO: renamed from: f */
    public final StorageManager f64452f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$a */
    public class C15282a implements Function0<Collection<PackageViewDescriptor>> {
        public C15282a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<PackageViewDescriptor> invoke() {
            return Arrays.asList(KotlinBuiltIns.this.m89133s().mo89434I(StandardNames.f64473A), KotlinBuiltIns.this.m89133s().mo89434I(StandardNames.f64475C), KotlinBuiltIns.this.m89133s().mo89434I(StandardNames.f64476D), KotlinBuiltIns.this.m89133s().mo89434I(StandardNames.f64474B));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$b */
    public class C15283b implements Function0<C15286e> {
        public C15283b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C15286e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                SimpleType simpleTypeM89132r = KotlinBuiltIns.this.m89132r(primitiveType.getTypeName().m91973b());
                SimpleType simpleTypeM89132r2 = KotlinBuiltIns.this.m89132r(primitiveType.getArrayTypeName().m91973b());
                enumMap.put(primitiveType, simpleTypeM89132r2);
                map.put(simpleTypeM89132r, simpleTypeM89132r2);
                map2.put(simpleTypeM89132r2, simpleTypeM89132r);
            }
            return new C15286e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$c */
    public class C15284c implements Function1<Name, ClassDescriptor> {
        public C15284c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassDescriptor invoke(Name name) {
            ClassifierDescriptor classifierDescriptorMo90533f = KotlinBuiltIns.this.m89134t().mo90533f(name, NoLookupLocation.FROM_BUILTINS);
            if (classifierDescriptorMo90533f == null) {
                c2r.m107723a("Built-in class ", StandardNames.f64473A.m91938b(name), " is not found");
                return null;
            }
            if (classifierDescriptorMo90533f instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorMo90533f;
            }
            throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorMo90533f);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$d */
    public class C15285d implements Function0<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ModuleDescriptorImpl f64456a;

        public C15285d(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f64456a = moduleDescriptorImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            ModuleDescriptorImpl moduleDescriptorImpl = KotlinBuiltIns.this.f64447a;
            KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
            if (moduleDescriptorImpl == null) {
                kotlinBuiltIns.f64447a = this.f64456a;
                return null;
            }
            StringBuilder sb = new StringBuilder("Built-ins module is already set: ");
            sb.append(kotlinBuiltIns.f64447a);
            ModuleDescriptorImpl moduleDescriptorImpl2 = this.f64456a;
            sb.append(" (attempting to reset to ");
            sb.append(moduleDescriptorImpl2);
            sb.append(")");
            throw new AssertionError(sb.toString());
        }
    }

    public KotlinBuiltIns(@NotNull StorageManager storageManager) {
        if (storageManager == null) {
            m89066a(0);
        }
        this.f64452f = storageManager;
        this.f64450d = storageManager.mo93337e(new C15282a());
        this.f64449c = storageManager.mo93337e(new C15283b());
        this.f64451e = storageManager.mo93341i(new C15284c());
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m89057A0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(131);
        }
        return m89079j0(kotlinType, StandardNames.FqNames.f64528J0.m91945i());
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public static KotlinType m89058B(@NotNull KotlinType kotlinType, @NotNull ModuleDescriptor moduleDescriptor) {
        ClassId classIdM92872n;
        ClassId classIdM89169a;
        ClassDescriptor classDescriptorM89398b;
        if (kotlinType == null) {
            m89066a(71);
        }
        if (moduleDescriptor == null) {
            m89066a(72);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e == null) {
            return null;
        }
        UnsignedTypes unsignedTypes = UnsignedTypes.INSTANCE;
        if (!unsignedTypes.m89170b(classifierDescriptorMo89207e.getName()) || (classIdM92872n = DescriptorUtilsKt.m92872n(classifierDescriptorMo89207e)) == null || (classIdM89169a = unsignedTypes.m89169a(classIdM92872n)) == null || (classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptor, classIdM89169a)) == null) {
            return null;
        }
        return classDescriptorM89398b.mo89349o();
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m89059B0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(MMConstants.ERR_WATERMARK_READ);
        }
        return m89079j0(kotlinType, StandardNames.FqNames.f64524H0.m91945i());
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m89060C0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m89066a(10);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).mo89453d().m91944h(StandardNames.f64508z);
            }
            declarationDescriptor = declarationDescriptor.mo89190b();
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m89061D0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        }
        return m89083n0(kotlinType, StandardNames.FqNames.f64564e);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m89062E0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        }
        return m89094y0(kotlinType) || m89059B0(kotlinType) || m89095z0(kotlinType) || m89057A0(kotlinType);
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public static PrimitiveType m89063O(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(92);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e == null) {
            return null;
        }
        return m89064Q(classifierDescriptorMo89207e);
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public static PrimitiveType m89064Q(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m89066a(77);
        }
        if (StandardNames.FqNames.f64546S0.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.f64550U0.get(DescriptorUtils.m92663m(declarationDescriptor));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: T */
    public static PrimitiveType m89065T(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m89066a(76);
        }
        if (StandardNames.FqNames.f64544R0.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.f64548T0.get(DescriptorUtils.m92663m(declarationDescriptor));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m89066a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case EACTags.FILE_REFERENCE /* 81 */:
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case Opcodes.IADD /* 96 */:
            case 103:
            case 107:
            case 108:
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case EACTags.FCP_TEMPLATE /* 98 */:
            case 100:
            case 102:
            case 104:
            case 106:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case EACTags.NAME /* 91 */:
            case EACTags.TAG_LIST /* 92 */:
            case EACTags.HEADER_LIST /* 93 */:
            case EACTags.LOGIN_DATA /* 94 */:
            case 95:
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case MMConstants.ERR_WATERMARK_READ /* 129 */:
            case 130:
            case 131:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
            case 134:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
            case 140:
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
            case 144:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
            case 148:
            case 150:
            case 151:
            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
            case 153:
            case 154:
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
                objArr[0] = "projectionType";
                break;
            case 79:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case EACTags.FILE_REFERENCE /* 81 */:
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case EACTags.HEADER_LIST /* 93 */:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case EACTags.NAME /* 91 */:
                objArr[2] = "isPrimitiveArray";
                break;
            case EACTags.TAG_LIST /* 92 */:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case EACTags.LOGIN_DATA /* 94 */:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case Opcodes.IADD /* 96 */:
                objArr[2] = "isPrimitiveClass";
                break;
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case EACTags.FCP_TEMPLATE /* 98 */:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case MMConstants.ERR_WATERMARK_READ /* 129 */:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                objArr[2] = "isUnsignedArrayType";
                break;
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                objArr[2] = "isNothing";
                break;
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                objArr[2] = "isNullableNothing";
                break;
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                objArr[2] = "isDefaultBound";
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                objArr[2] = "isUnit";
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                objArr[2] = "isMemberOfAny";
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m89068b0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m89066a(108);
        }
        return m89073e(classDescriptor, StandardNames.FqNames.f64556a);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m89070c0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        }
        return m89078i0(kotlinType, StandardNames.FqNames.f64556a);
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m89072d0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(88);
        }
        return m89078i0(kotlinType, StandardNames.FqNames.f64570h);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m89073e(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            m89066a(103);
        }
        if (fqNameUnsafe == null) {
            m89066a(104);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.m91956j()) && fqNameUnsafe.equals(DescriptorUtils.m92663m(classifierDescriptor));
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m89074e0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m89066a(89);
        }
        return m89073e(classDescriptor, StandardNames.FqNames.f64570h) || m89064Q(classDescriptor) != null;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m89075f0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(90);
        }
        return m89072d0(kotlinType) || m89087r0(kotlinType);
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m89076g0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(110);
        }
        return m89079j0(kotlinType, StandardNames.FqNames.f64572i);
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m89077h0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m89066a(9);
        }
        return DescriptorUtils.m92668r(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m89078i0(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            m89066a(97);
        }
        if (fqNameUnsafe == null) {
            m89066a(98);
        }
        return m89093x0(kotlinType.mo92781G0(), fqNameUnsafe);
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m89079j0(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            m89066a(134);
        }
        if (fqNameUnsafe == null) {
            m89066a(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);
        }
        return m89078i0(kotlinType, fqNameUnsafe) && !kotlinType.mo90857H0();
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m89080k0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
        }
        return m89086q0(kotlinType);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m89081l0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m89066a(160);
        }
        if (declarationDescriptor.mo89336a().getAnnotations().mo89530d0(StandardNames.FqNames.f64602x)) {
            return true;
        }
        if (declarationDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
            boolean zMo89511y = propertyDescriptor.mo89511y();
            PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            if (getter != null && m89081l0(getter) && (!zMo89511y || (setter != null && m89081l0(setter)))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m89082m0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m89066a(158);
        }
        return m89073e(classDescriptor, StandardNames.FqNames.f64577k0);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m89083n0(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            m89066a(105);
        }
        if (fqNameUnsafe == null) {
            m89066a(106);
        }
        return !kotlinType.mo90857H0() && m89078i0(kotlinType, fqNameUnsafe);
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m89084o0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        }
        return m89085p0(kotlinType) && !TypeUtils.m93692l(kotlinType);
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m89085p0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
        }
        return m89078i0(kotlinType, StandardNames.FqNames.f64558b);
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m89086q0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(140);
        }
        return m89070c0(kotlinType) && kotlinType.mo90857H0();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m89087r0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(91);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        return (classifierDescriptorMo89207e == null || m89064Q(classifierDescriptorMo89207e) == null) ? false : true;
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m89088s0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m89066a(96);
        }
        return m89065T(classDescriptor) != null;
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m89089t0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(94);
        }
        return !kotlinType.mo90857H0() && m89090u0(kotlinType);
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m89090u0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(95);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        return (classifierDescriptorMo89207e instanceof ClassDescriptor) && m89088s0((ClassDescriptor) classifierDescriptorMo89207e);
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m89091v0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m89066a(107);
        }
        return m89073e(classDescriptor, StandardNames.FqNames.f64556a) || m89073e(classDescriptor, StandardNames.FqNames.f64558b);
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m89092w0(@Nullable KotlinType kotlinType) {
        return kotlinType != null && m89083n0(kotlinType, StandardNames.FqNames.f64568g);
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m89093x0(@NotNull TypeConstructor typeConstructor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            m89066a(101);
        }
        if (fqNameUnsafe == null) {
            m89066a(102);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        return (classifierDescriptorMo89207e instanceof ClassDescriptor) && m89073e(classifierDescriptorMo89207e, fqNameUnsafe);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m89094y0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(128);
        }
        return m89079j0(kotlinType, StandardNames.FqNames.f64522G0.m91945i());
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m89095z0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(130);
        }
        return m89079j0(kotlinType, StandardNames.FqNames.f64526I0.m91945i());
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public SimpleType m89096A() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.DOUBLE);
        if (simpleTypeM89112S == null) {
            m89066a(62);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public SimpleType m89097C() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.FLOAT);
        if (simpleTypeM89112S == null) {
            m89066a(61);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public ClassDescriptor m89098D(int i) {
        return m89131q(StandardNames.m89155b(i));
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public SimpleType m89099E() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.INT);
        if (simpleTypeM89112S == null) {
            m89066a(59);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public ClassDescriptor m89100F() {
        ClassDescriptor classDescriptorM89130p = m89130p(StandardNames.FqNames.f64577k0.m91959m());
        if (classDescriptorM89130p == null) {
            m89066a(21);
        }
        return classDescriptorM89130p;
    }

    /* JADX INFO: renamed from: F0 */
    public void m89101F0(@NotNull ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            m89066a(1);
        }
        this.f64452f.mo93338f(new C15285d(moduleDescriptorImpl));
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public SimpleType m89102G() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.LONG);
        if (simpleTypeM89112S == null) {
            m89066a(60);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public ClassDescriptor m89103H() {
        return m89131q("Nothing");
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public SimpleType m89104I() {
        SimpleType simpleTypeMo89349o = m89103H().mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(49);
        }
        return simpleTypeMo89349o;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public SimpleType m89105J() {
        SimpleType simpleTypeMo90858N0 = m89123i().mo90858N0(true);
        if (simpleTypeMo90858N0 == null) {
            m89066a(52);
        }
        return simpleTypeMo90858N0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public SimpleType m89106K() {
        SimpleType simpleTypeMo90858N0 = m89104I().mo90858N0(true);
        if (simpleTypeMo90858N0 == null) {
            m89066a(50);
        }
        return simpleTypeMo90858N0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public ClassDescriptor m89107L() {
        return m89131q("Number");
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public SimpleType m89108M() {
        SimpleType simpleTypeMo89349o = m89107L().mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(56);
        }
        return simpleTypeMo89349o;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public PlatformDependentDeclarationFilter mo89109N() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent == null) {
            m89066a(4);
        }
        return noPlatformDependent;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public SimpleType m89110P(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m89066a(73);
        }
        SimpleType simpleType = this.f64449c.invoke().f64458a.get(primitiveType);
        if (simpleType == null) {
            m89066a(74);
        }
        return simpleType;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ClassDescriptor m89111R(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m89066a(16);
        }
        return m89131q(primitiveType.getTypeName().m91973b());
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public SimpleType m89112S(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m89066a(54);
        }
        SimpleType simpleTypeMo89349o = m89111R(primitiveType).mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(55);
        }
        return simpleTypeMo89349o;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public SimpleType m89113U() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.SHORT);
        if (simpleTypeM89112S == null) {
            m89066a(58);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public StorageManager m89114V() {
        StorageManager storageManager = this.f64452f;
        if (storageManager == null) {
            m89066a(6);
        }
        return storageManager;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public ClassDescriptor m89115W() {
        return m89131q("String");
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public SimpleType m89116X() {
        SimpleType simpleTypeMo89349o = m89115W().mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(66);
        }
        return simpleTypeMo89349o;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public ClassDescriptor m89117Y(int i) {
        ClassDescriptor classDescriptorM89130p = m89130p(StandardNames.f64500r.m91938b(Name.m91970i(StandardNames.m89157d(i))));
        if (classDescriptorM89130p == null) {
            m89066a(18);
        }
        return classDescriptorM89130p;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public ClassDescriptor m89118Z() {
        return m89131q("Unit");
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public SimpleType m89119a0() {
        SimpleType simpleTypeMo89349o = m89118Z().mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(65);
        }
        return simpleTypeMo89349o;
    }

    /* JADX INFO: renamed from: f */
    public void m89120f(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f64446g, this.f64452f, this, null);
        this.f64447a = moduleDescriptorImpl;
        moduleDescriptorImpl.m89715H0(BuiltInsLoader.Companion.m89027c().mo89024a(this.f64452f, this.f64447a, mo89137w(), mo89109N(), mo89121g(), z));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f64447a;
        moduleDescriptorImpl2.m89720P0(moduleDescriptorImpl2);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public AdditionalClassPartsProvider mo89121g() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.INSTANCE;
        if (none == null) {
            m89066a(3);
        }
        return none;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public ClassDescriptor m89122h() {
        return m89131q("Any");
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public SimpleType m89123i() {
        SimpleType simpleTypeMo89349o = m89122h().mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(51);
        }
        return simpleTypeMo89349o;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public ClassDescriptor m89124j() {
        return m89131q("Array");
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public KotlinType m89125k(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89066a(68);
        }
        KotlinType kotlinTypeM89126l = m89126l(kotlinType);
        if (kotlinTypeM89126l != null) {
            return kotlinTypeM89126l;
        }
        xtq0.m213103a("not array: ", kotlinType);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public KotlinType m89126l(@NotNull KotlinType kotlinType) {
        KotlinType kotlinTypeM89058B;
        if (kotlinType == null) {
            m89066a(70);
        }
        if (m89072d0(kotlinType)) {
            if (kotlinType.mo92779E0().size() != 1) {
                return null;
            }
            return kotlinType.mo92779E0().get(0).getType();
        }
        KotlinType kotlinTypeM93694n = TypeUtils.m93694n(kotlinType);
        SimpleType simpleType = this.f64449c.invoke().f64460c.get(kotlinTypeM93694n);
        if (simpleType != null) {
            return simpleType;
        }
        ModuleDescriptor moduleDescriptorM92659i = DescriptorUtils.m92659i(kotlinTypeM93694n);
        if (moduleDescriptorM92659i == null || (kotlinTypeM89058B = m89058B(kotlinTypeM93694n, moduleDescriptorM92659i)) == null) {
            return null;
        }
        return kotlinTypeM89058B;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public SimpleType m89127m(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            m89066a(82);
        }
        if (kotlinType == null) {
            m89066a(83);
        }
        SimpleType simpleTypeM89128n = m89128n(variance, kotlinType, Annotations.Companion.m89532b());
        if (simpleTypeM89128n == null) {
            m89066a(84);
        }
        return simpleTypeM89128n;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public SimpleType m89128n(@NotNull Variance variance, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        if (variance == null) {
            m89066a(78);
        }
        if (kotlinType == null) {
            m89066a(79);
        }
        if (annotations == null) {
            m89066a(80);
        }
        SimpleType simpleTypeM93522h = KotlinTypeFactory.m93522h(TypeAttributesKt.m93602b(annotations), m89124j(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeM93522h == null) {
            m89066a(81);
        }
        return simpleTypeM93522h;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType m89129o() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.BOOLEAN);
        if (simpleTypeM89112S == null) {
            m89066a(64);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public ClassDescriptor m89130p(@NotNull FqName fqName) {
        if (fqName == null) {
            m89066a(12);
        }
        ClassDescriptor classDescriptorM89372d = DescriptorUtilKt.m89372d(m89133s(), fqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorM89372d == null) {
            m89066a(13);
        }
        return classDescriptorM89372d;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ClassDescriptor m89131q(@NotNull String str) {
        if (str == null) {
            m89066a(14);
        }
        ClassDescriptor classDescriptorInvoke = this.f64451e.invoke(Name.m91970i(str));
        if (classDescriptorInvoke == null) {
            m89066a(15);
        }
        return classDescriptorInvoke;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final SimpleType m89132r(@NotNull String str) {
        if (str == null) {
            m89066a(47);
        }
        SimpleType simpleTypeMo89349o = m89131q(str).mo89349o();
        if (simpleTypeMo89349o == null) {
            m89066a(48);
        }
        return simpleTypeMo89349o;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public ModuleDescriptorImpl m89133s() {
        if (this.f64447a == null) {
            this.f64447a = this.f64448b.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f64447a;
        if (moduleDescriptorImpl == null) {
            m89066a(7);
        }
        return moduleDescriptorImpl;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public MemberScope m89134t() {
        MemberScope memberScopeMo89467n = m89133s().mo89434I(StandardNames.f64473A).mo89467n();
        if (memberScopeMo89467n == null) {
            m89066a(11);
        }
        return memberScopeMo89467n;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public SimpleType m89135u() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.BYTE);
        if (simpleTypeM89112S == null) {
            m89066a(57);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public SimpleType m89136v() {
        SimpleType simpleTypeM89112S = m89112S(PrimitiveType.CHAR);
        if (simpleTypeM89112S == null) {
            m89066a(63);
        }
        return simpleTypeM89112S;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public Iterable<ClassDescriptorFactory> mo89137w() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f64452f, m89133s()));
        if (listSingletonList == null) {
            m89066a(5);
        }
        return listSingletonList;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public ClassDescriptor m89138x() {
        ClassDescriptor classDescriptorM89130p = m89130p(StandardNames.FqNames.f64552W);
        if (classDescriptorM89130p == null) {
            m89066a(35);
        }
        return classDescriptorM89130p;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public ClassDescriptor m89139y() {
        return m89131q("Comparable");
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public SimpleType m89140z() {
        SimpleType simpleTypeM89105J = m89105J();
        if (simpleTypeM89105J == null) {
            m89066a(53);
        }
        return simpleTypeM89105J;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$e */
    public static class C15286e {

        /* JADX INFO: renamed from: a */
        public final Map<PrimitiveType, SimpleType> f64458a;

        /* JADX INFO: renamed from: b */
        public final Map<KotlinType, SimpleType> f64459b;

        /* JADX INFO: renamed from: c */
        public final Map<SimpleType, SimpleType> f64460c;

        public C15286e(@NotNull Map<PrimitiveType, SimpleType> map, @NotNull Map<KotlinType, SimpleType> map2, @NotNull Map<SimpleType, SimpleType> map3) {
            if (map == null) {
                m89145a(0);
            }
            if (map2 == null) {
                m89145a(1);
            }
            if (map3 == null) {
                m89145a(2);
            }
            this.f64458a = map;
            this.f64459b = map2;
            this.f64460c = map3;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m89145a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public /* synthetic */ C15286e(Map map, Map map2, Map map3, C15282a c15282a) {
            this(map, map2, map3);
        }
    }
}
