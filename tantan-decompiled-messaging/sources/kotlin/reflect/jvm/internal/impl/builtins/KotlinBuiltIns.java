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
import p149l.b0r;
import p149l.rkq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinBuiltIns {

    /* JADX INFO: renamed from: g */
    public static final Name f63772g = Name.m91081n("<built-ins module>");

    /* JADX INFO: renamed from: a */
    public ModuleDescriptorImpl f63773a;

    /* JADX INFO: renamed from: b */
    public NotNullLazyValue<ModuleDescriptorImpl> f63774b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue<C15179e> f63775c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue<Collection<PackageViewDescriptor>> f63776d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNotNull<Name, ClassDescriptor> f63777e;

    /* JADX INFO: renamed from: f */
    public final StorageManager f63778f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$a */
    public class C15175a implements Function0<Collection<PackageViewDescriptor>> {
        public C15175a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<PackageViewDescriptor> invoke() {
            return Arrays.asList(KotlinBuiltIns.this.m88242s().mo88543I(StandardNames.f63799A), KotlinBuiltIns.this.m88242s().mo88543I(StandardNames.f63801C), KotlinBuiltIns.this.m88242s().mo88543I(StandardNames.f63802D), KotlinBuiltIns.this.m88242s().mo88543I(StandardNames.f63800B));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$b */
    public class C15176b implements Function0<C15179e> {
        public C15176b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C15179e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                SimpleType simpleTypeM88241r = KotlinBuiltIns.this.m88241r(primitiveType.getTypeName().m91082b());
                SimpleType simpleTypeM88241r2 = KotlinBuiltIns.this.m88241r(primitiveType.getArrayTypeName().m91082b());
                enumMap.put(primitiveType, simpleTypeM88241r2);
                map.put(simpleTypeM88241r, simpleTypeM88241r2);
                map2.put(simpleTypeM88241r2, simpleTypeM88241r);
            }
            return new C15179e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$c */
    public class C15177c implements Function1<Name, ClassDescriptor> {
        public C15177c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassDescriptor invoke(Name name) {
            ClassifierDescriptor classifierDescriptorMo89642f = KotlinBuiltIns.this.m88243t().mo89642f(name, NoLookupLocation.FROM_BUILTINS);
            if (classifierDescriptorMo89642f == null) {
                b0r.m99785a("Built-in class ", StandardNames.f63799A.m91047b(name), " is not found");
                return null;
            }
            if (classifierDescriptorMo89642f instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorMo89642f;
            }
            throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorMo89642f);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$d */
    public class C15178d implements Function0<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ModuleDescriptorImpl f63782a;

        public C15178d(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f63782a = moduleDescriptorImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            ModuleDescriptorImpl moduleDescriptorImpl = KotlinBuiltIns.this.f63773a;
            KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
            if (moduleDescriptorImpl == null) {
                kotlinBuiltIns.f63773a = this.f63782a;
                return null;
            }
            StringBuilder sb = new StringBuilder("Built-ins module is already set: ");
            sb.append(kotlinBuiltIns.f63773a);
            ModuleDescriptorImpl moduleDescriptorImpl2 = this.f63782a;
            sb.append(" (attempting to reset to ");
            sb.append(moduleDescriptorImpl2);
            sb.append(")");
            throw new AssertionError(sb.toString());
        }
    }

    public KotlinBuiltIns(@NotNull StorageManager storageManager) {
        if (storageManager == null) {
            m88175a(0);
        }
        this.f63778f = storageManager;
        this.f63776d = storageManager.mo92446e(new C15175a());
        this.f63775c = storageManager.mo92446e(new C15176b());
        this.f63777e = storageManager.mo92450i(new C15177c());
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m88166A0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(131);
        }
        return m88188j0(kotlinType, StandardNames.FqNames.f63854J0.m91054i());
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public static KotlinType m88167B(@NotNull KotlinType kotlinType, @NotNull ModuleDescriptor moduleDescriptor) {
        ClassId classIdM91981n;
        ClassId classIdM88278a;
        ClassDescriptor classDescriptorM88507b;
        if (kotlinType == null) {
            m88175a(71);
        }
        if (moduleDescriptor == null) {
            m88175a(72);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e == null) {
            return null;
        }
        UnsignedTypes unsignedTypes = UnsignedTypes.INSTANCE;
        if (!unsignedTypes.m88279b(classifierDescriptorMo88316e.getName()) || (classIdM91981n = DescriptorUtilsKt.m91981n(classifierDescriptorMo88316e)) == null || (classIdM88278a = unsignedTypes.m88278a(classIdM91981n)) == null || (classDescriptorM88507b = FindClassInModuleKt.m88507b(moduleDescriptor, classIdM88278a)) == null) {
            return null;
        }
        return classDescriptorM88507b.mo88458o();
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m88168B0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(MMConstants.ERR_WATERMARK_READ);
        }
        return m88188j0(kotlinType, StandardNames.FqNames.f63850H0.m91054i());
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m88169C0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m88175a(10);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).mo88562d().m91053h(StandardNames.f63834z);
            }
            declarationDescriptor = declarationDescriptor.mo88299b();
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m88170D0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        }
        return m88192n0(kotlinType, StandardNames.FqNames.f63890e);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m88171E0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        }
        return m88203y0(kotlinType) || m88168B0(kotlinType) || m88204z0(kotlinType) || m88166A0(kotlinType);
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public static PrimitiveType m88172O(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(92);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e == null) {
            return null;
        }
        return m88173Q(classifierDescriptorMo88316e);
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public static PrimitiveType m88173Q(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m88175a(77);
        }
        if (StandardNames.FqNames.f63872S0.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.f63876U0.get(DescriptorUtils.m91772m(declarationDescriptor));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: T */
    public static PrimitiveType m88174T(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m88175a(76);
        }
        if (StandardNames.FqNames.f63870R0.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.f63874T0.get(DescriptorUtils.m91772m(declarationDescriptor));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m88175a(int i) {
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
    public static boolean m88177b0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m88175a(108);
        }
        return m88182e(classDescriptor, StandardNames.FqNames.f63882a);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m88179c0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        }
        return m88187i0(kotlinType, StandardNames.FqNames.f63882a);
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m88181d0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(88);
        }
        return m88187i0(kotlinType, StandardNames.FqNames.f63896h);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m88182e(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            m88175a(103);
        }
        if (fqNameUnsafe == null) {
            m88175a(104);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.m91065j()) && fqNameUnsafe.equals(DescriptorUtils.m91772m(classifierDescriptor));
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m88183e0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m88175a(89);
        }
        return m88182e(classDescriptor, StandardNames.FqNames.f63896h) || m88173Q(classDescriptor) != null;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m88184f0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(90);
        }
        return m88181d0(kotlinType) || m88196r0(kotlinType);
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m88185g0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(110);
        }
        return m88188j0(kotlinType, StandardNames.FqNames.f63898i);
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m88186h0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m88175a(9);
        }
        return DescriptorUtils.m91777r(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m88187i0(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            m88175a(97);
        }
        if (fqNameUnsafe == null) {
            m88175a(98);
        }
        return m88202x0(kotlinType.mo91890G0(), fqNameUnsafe);
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m88188j0(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            m88175a(134);
        }
        if (fqNameUnsafe == null) {
            m88175a(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);
        }
        return m88187i0(kotlinType, fqNameUnsafe) && !kotlinType.mo89966H0();
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m88189k0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
        }
        return m88195q0(kotlinType);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m88190l0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m88175a(160);
        }
        if (declarationDescriptor.mo88445a().getAnnotations().mo88639c0(StandardNames.FqNames.f63928x)) {
            return true;
        }
        if (declarationDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
            boolean zMo88620y = propertyDescriptor.mo88620y();
            PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            if (getter != null && m88190l0(getter) && (!zMo88620y || (setter != null && m88190l0(setter)))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m88191m0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m88175a(158);
        }
        return m88182e(classDescriptor, StandardNames.FqNames.f63903k0);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m88192n0(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            m88175a(105);
        }
        if (fqNameUnsafe == null) {
            m88175a(106);
        }
        return !kotlinType.mo89966H0() && m88187i0(kotlinType, fqNameUnsafe);
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m88193o0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        }
        return m88194p0(kotlinType) && !TypeUtils.m92801l(kotlinType);
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m88194p0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
        }
        return m88187i0(kotlinType, StandardNames.FqNames.f63884b);
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m88195q0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(140);
        }
        return m88179c0(kotlinType) && kotlinType.mo89966H0();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m88196r0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(91);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        return (classifierDescriptorMo88316e == null || m88173Q(classifierDescriptorMo88316e) == null) ? false : true;
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m88197s0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m88175a(96);
        }
        return m88174T(classDescriptor) != null;
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m88198t0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(94);
        }
        return !kotlinType.mo89966H0() && m88199u0(kotlinType);
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m88199u0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(95);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        return (classifierDescriptorMo88316e instanceof ClassDescriptor) && m88197s0((ClassDescriptor) classifierDescriptorMo88316e);
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m88200v0(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m88175a(107);
        }
        return m88182e(classDescriptor, StandardNames.FqNames.f63882a) || m88182e(classDescriptor, StandardNames.FqNames.f63884b);
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m88201w0(@Nullable KotlinType kotlinType) {
        return kotlinType != null && m88192n0(kotlinType, StandardNames.FqNames.f63894g);
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m88202x0(@NotNull TypeConstructor typeConstructor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            m88175a(101);
        }
        if (fqNameUnsafe == null) {
            m88175a(102);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        return (classifierDescriptorMo88316e instanceof ClassDescriptor) && m88182e(classifierDescriptorMo88316e, fqNameUnsafe);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m88203y0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(128);
        }
        return m88188j0(kotlinType, StandardNames.FqNames.f63848G0.m91054i());
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m88204z0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(130);
        }
        return m88188j0(kotlinType, StandardNames.FqNames.f63852I0.m91054i());
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public SimpleType m88205A() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.DOUBLE);
        if (simpleTypeM88221S == null) {
            m88175a(62);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public SimpleType m88206C() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.FLOAT);
        if (simpleTypeM88221S == null) {
            m88175a(61);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public ClassDescriptor m88207D(int i) {
        return m88240q(StandardNames.m88264b(i));
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public SimpleType m88208E() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.INT);
        if (simpleTypeM88221S == null) {
            m88175a(59);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public ClassDescriptor m88209F() {
        ClassDescriptor classDescriptorM88239p = m88239p(StandardNames.FqNames.f63903k0.m91068m());
        if (classDescriptorM88239p == null) {
            m88175a(21);
        }
        return classDescriptorM88239p;
    }

    /* JADX INFO: renamed from: F0 */
    public void m88210F0(@NotNull ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            m88175a(1);
        }
        this.f63778f.mo92447f(new C15178d(moduleDescriptorImpl));
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public SimpleType m88211G() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.LONG);
        if (simpleTypeM88221S == null) {
            m88175a(60);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public ClassDescriptor m88212H() {
        return m88240q("Nothing");
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public SimpleType m88213I() {
        SimpleType simpleTypeMo88458o = m88212H().mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(49);
        }
        return simpleTypeMo88458o;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public SimpleType m88214J() {
        SimpleType simpleTypeMo89967N0 = m88232i().mo89967N0(true);
        if (simpleTypeMo89967N0 == null) {
            m88175a(52);
        }
        return simpleTypeMo89967N0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public SimpleType m88215K() {
        SimpleType simpleTypeMo89967N0 = m88213I().mo89967N0(true);
        if (simpleTypeMo89967N0 == null) {
            m88175a(50);
        }
        return simpleTypeMo89967N0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public ClassDescriptor m88216L() {
        return m88240q("Number");
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public SimpleType m88217M() {
        SimpleType simpleTypeMo88458o = m88216L().mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(56);
        }
        return simpleTypeMo88458o;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public PlatformDependentDeclarationFilter mo88218N() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent == null) {
            m88175a(4);
        }
        return noPlatformDependent;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public SimpleType m88219P(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m88175a(73);
        }
        SimpleType simpleType = this.f63775c.invoke().f63784a.get(primitiveType);
        if (simpleType == null) {
            m88175a(74);
        }
        return simpleType;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ClassDescriptor m88220R(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m88175a(16);
        }
        return m88240q(primitiveType.getTypeName().m91082b());
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public SimpleType m88221S(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m88175a(54);
        }
        SimpleType simpleTypeMo88458o = m88220R(primitiveType).mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(55);
        }
        return simpleTypeMo88458o;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public SimpleType m88222U() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.SHORT);
        if (simpleTypeM88221S == null) {
            m88175a(58);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public StorageManager m88223V() {
        StorageManager storageManager = this.f63778f;
        if (storageManager == null) {
            m88175a(6);
        }
        return storageManager;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public ClassDescriptor m88224W() {
        return m88240q("String");
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public SimpleType m88225X() {
        SimpleType simpleTypeMo88458o = m88224W().mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(66);
        }
        return simpleTypeMo88458o;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public ClassDescriptor m88226Y(int i) {
        ClassDescriptor classDescriptorM88239p = m88239p(StandardNames.f63826r.m91047b(Name.m91079i(StandardNames.m88266d(i))));
        if (classDescriptorM88239p == null) {
            m88175a(18);
        }
        return classDescriptorM88239p;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public ClassDescriptor m88227Z() {
        return m88240q("Unit");
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public SimpleType m88228a0() {
        SimpleType simpleTypeMo88458o = m88227Z().mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(65);
        }
        return simpleTypeMo88458o;
    }

    /* JADX INFO: renamed from: f */
    public void m88229f(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f63772g, this.f63778f, this, null);
        this.f63773a = moduleDescriptorImpl;
        moduleDescriptorImpl.m88824H0(BuiltInsLoader.Companion.m88136c().mo88133a(this.f63778f, this.f63773a, mo88246w(), mo88218N(), mo88230g(), z));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f63773a;
        moduleDescriptorImpl2.m88829P0(moduleDescriptorImpl2);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public AdditionalClassPartsProvider mo88230g() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.INSTANCE;
        if (none == null) {
            m88175a(3);
        }
        return none;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public ClassDescriptor m88231h() {
        return m88240q("Any");
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public SimpleType m88232i() {
        SimpleType simpleTypeMo88458o = m88231h().mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(51);
        }
        return simpleTypeMo88458o;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public ClassDescriptor m88233j() {
        return m88240q("Array");
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public KotlinType m88234k(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m88175a(68);
        }
        KotlinType kotlinTypeM88235l = m88235l(kotlinType);
        if (kotlinTypeM88235l != null) {
            return kotlinTypeM88235l;
        }
        rkq0.m179764a("not array: ", kotlinType);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public KotlinType m88235l(@NotNull KotlinType kotlinType) {
        KotlinType kotlinTypeM88167B;
        if (kotlinType == null) {
            m88175a(70);
        }
        if (m88181d0(kotlinType)) {
            if (kotlinType.mo91888E0().size() != 1) {
                return null;
            }
            return kotlinType.mo91888E0().get(0).getType();
        }
        KotlinType kotlinTypeM92803n = TypeUtils.m92803n(kotlinType);
        SimpleType simpleType = this.f63775c.invoke().f63786c.get(kotlinTypeM92803n);
        if (simpleType != null) {
            return simpleType;
        }
        ModuleDescriptor moduleDescriptorM91768i = DescriptorUtils.m91768i(kotlinTypeM92803n);
        if (moduleDescriptorM91768i == null || (kotlinTypeM88167B = m88167B(kotlinTypeM92803n, moduleDescriptorM91768i)) == null) {
            return null;
        }
        return kotlinTypeM88167B;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public SimpleType m88236m(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            m88175a(82);
        }
        if (kotlinType == null) {
            m88175a(83);
        }
        SimpleType simpleTypeM88237n = m88237n(variance, kotlinType, Annotations.Companion.m88641b());
        if (simpleTypeM88237n == null) {
            m88175a(84);
        }
        return simpleTypeM88237n;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public SimpleType m88237n(@NotNull Variance variance, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        if (variance == null) {
            m88175a(78);
        }
        if (kotlinType == null) {
            m88175a(79);
        }
        if (annotations == null) {
            m88175a(80);
        }
        SimpleType simpleTypeM92631h = KotlinTypeFactory.m92631h(TypeAttributesKt.m92711b(annotations), m88233j(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeM92631h == null) {
            m88175a(81);
        }
        return simpleTypeM92631h;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType m88238o() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.BOOLEAN);
        if (simpleTypeM88221S == null) {
            m88175a(64);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public ClassDescriptor m88239p(@NotNull FqName fqName) {
        if (fqName == null) {
            m88175a(12);
        }
        ClassDescriptor classDescriptorM88481d = DescriptorUtilKt.m88481d(m88242s(), fqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorM88481d == null) {
            m88175a(13);
        }
        return classDescriptorM88481d;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ClassDescriptor m88240q(@NotNull String str) {
        if (str == null) {
            m88175a(14);
        }
        ClassDescriptor classDescriptorInvoke = this.f63777e.invoke(Name.m91079i(str));
        if (classDescriptorInvoke == null) {
            m88175a(15);
        }
        return classDescriptorInvoke;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final SimpleType m88241r(@NotNull String str) {
        if (str == null) {
            m88175a(47);
        }
        SimpleType simpleTypeMo88458o = m88240q(str).mo88458o();
        if (simpleTypeMo88458o == null) {
            m88175a(48);
        }
        return simpleTypeMo88458o;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public ModuleDescriptorImpl m88242s() {
        if (this.f63773a == null) {
            this.f63773a = this.f63774b.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f63773a;
        if (moduleDescriptorImpl == null) {
            m88175a(7);
        }
        return moduleDescriptorImpl;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public MemberScope m88243t() {
        MemberScope memberScopeMo88576n = m88242s().mo88543I(StandardNames.f63799A).mo88576n();
        if (memberScopeMo88576n == null) {
            m88175a(11);
        }
        return memberScopeMo88576n;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public SimpleType m88244u() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.BYTE);
        if (simpleTypeM88221S == null) {
            m88175a(57);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public SimpleType m88245v() {
        SimpleType simpleTypeM88221S = m88221S(PrimitiveType.CHAR);
        if (simpleTypeM88221S == null) {
            m88175a(63);
        }
        return simpleTypeM88221S;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public Iterable<ClassDescriptorFactory> mo88246w() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f63778f, m88242s()));
        if (listSingletonList == null) {
            m88175a(5);
        }
        return listSingletonList;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public ClassDescriptor m88247x() {
        ClassDescriptor classDescriptorM88239p = m88239p(StandardNames.FqNames.f63878W);
        if (classDescriptorM88239p == null) {
            m88175a(35);
        }
        return classDescriptorM88239p;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public ClassDescriptor m88248y() {
        return m88240q("Comparable");
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public SimpleType m88249z() {
        SimpleType simpleTypeM88214J = m88214J();
        if (simpleTypeM88214J == null) {
            m88175a(53);
        }
        return simpleTypeM88214J;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$e */
    public static class C15179e {

        /* JADX INFO: renamed from: a */
        public final Map<PrimitiveType, SimpleType> f63784a;

        /* JADX INFO: renamed from: b */
        public final Map<KotlinType, SimpleType> f63785b;

        /* JADX INFO: renamed from: c */
        public final Map<SimpleType, SimpleType> f63786c;

        public C15179e(@NotNull Map<PrimitiveType, SimpleType> map, @NotNull Map<KotlinType, SimpleType> map2, @NotNull Map<SimpleType, SimpleType> map3) {
            if (map == null) {
                m88254a(0);
            }
            if (map2 == null) {
                m88254a(1);
            }
            if (map3 == null) {
                m88254a(2);
            }
            this.f63784a = map;
            this.f63785b = map2;
            this.f63786c = map3;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m88254a(int i) {
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

        public /* synthetic */ C15179e(Map map, Map map2, Map map3, C15175a c15175a) {
            this(map, map2, map3);
        }
    }
}
