package kotlin.reflect.jvm.internal.impl.p120km.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt;
import kotlin.contracts.ExperimentalContracts;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.p120km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.p120km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p120km.KmClass;
import kotlin.reflect.jvm.internal.impl.p120km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.p120km.KmConstantValue;
import kotlin.reflect.jvm.internal.impl.p120km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p120km.KmContract;
import kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.p120km.KmEffect;
import kotlin.reflect.jvm.internal.impl.p120km.KmEffectExpression;
import kotlin.reflect.jvm.internal.impl.p120km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.p120km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.p120km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.p120km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.p120km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.KmType;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.p120km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p120km.KmVariance;
import kotlin.reflect.jvm.internal.impl.p120km.KmVersion;
import kotlin.reflect.jvm.internal.impl.p120km.KmVersionRequirement;
import kotlin.reflect.jvm.internal.impl.p120km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.p120km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReadersKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64597a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f64598b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f64599c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f64600d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f64601e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f64602f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f64603g;

        static {
            int[] iArr = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr[ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64597a = iArr;
            int[] iArr2 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f64598b = iArr2;
            int[] iArr3 = new int[ProtoBuf.VersionRequirement.VersionKind.values().length];
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f64599c = iArr3;
            int[] iArr4 = new int[DeprecationLevel.values().length];
            try {
                iArr4[DeprecationLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DeprecationLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DeprecationLevel.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f64600d = iArr4;
            int[] iArr5 = new int[ProtoBuf.Effect.EffectType.values().length];
            try {
                iArr5[ProtoBuf.Effect.EffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[ProtoBuf.Effect.EffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[ProtoBuf.Effect.EffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f64601e = iArr5;
            int[] iArr6 = new int[ProtoBuf.Effect.InvocationKind.values().length];
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f64602f = iArr6;
            int[] iArr7 = new int[ProtoBuf.Expression.ConstantValue.values().length];
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f64603g = iArr7;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m89234a(int i) {
        Boolean boolMo90875d = Flags.f65361c.mo90875d(i);
        boolMo90875d.getClass();
        return Flags.m90874b(boolMo90875d.booleanValue(), Flags.f65362d.mo90875d(i), Flags.f65363e.mo90875d(i), false, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static final int m89235b(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasGetterFlags() ? property.getGetterFlags() : m89234a(property.getFlags());
    }

    /* JADX INFO: renamed from: c */
    public static final int m89236c(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasSetterFlags() ? property.getSetterFlags() : m89234a(property.getFlags());
    }

    /* JADX INFO: renamed from: d */
    public static final int m89237d(ProtoBuf.Type type) {
        boolean nullable = type.getNullable();
        return (nullable ? 1 : 0) + (type.getFlags() << 1);
    }

    /* JADX INFO: renamed from: e */
    public static final int m89238e(ProtoBuf.TypeParameter typeParameter) {
        return typeParameter.getReified() ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static final KmValueParameter m89239f(KmType kmType) {
        KmValueParameter kmValueParameter = new KmValueParameter(0, "_");
        kmValueParameter.m89194e(kmType);
        return kmValueParameter;
    }

    /* JADX INFO: renamed from: g */
    public static final ProtoBuf.Type m89240g(ProtoBuf.Class r7, ReadContext readContext) {
        ProtoBuf.Type typeM90905i = ProtoTypeTableUtilKt.m90905i(r7, readContext.m89228g());
        if (typeM90905i != null) {
            return typeM90905i;
        }
        if (!r7.hasInlineClassUnderlyingPropertyName()) {
            return null;
        }
        List<ProtoBuf.Property> propertyList = r7.getPropertyList();
        propertyList.getClass();
        Iterator<T> it = propertyList.iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            ProtoBuf.Property property = (ProtoBuf.Property) next;
            property.getClass();
            if (ProtoTypeTableUtilKt.m90909m(property, readContext.m89228g()) == null && Intrinsics.m87488d(readContext.m89223b(property.getName()), readContext.m89223b(r7.getInlineClassUnderlyingPropertyName()))) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        ProtoBuf.Property property2 = (ProtoBuf.Property) obj;
        if (property2 != null) {
            return ProtoTypeTableUtilKt.m90911o(property2, readContext.m89228g());
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final KmVersionRequirement m89241h(int i, ReadContext readContext) {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        VersionRequirement.Version versionM90923e;
        KmVersionRequirement kmVersionRequirement = new KmVersionRequirement();
        VersionRequirement versionRequirementM90924a = VersionRequirement.Companion.m90924a(i, readContext.m89226e(), readContext.m89229h());
        if (versionRequirementM90924a == null && !readContext.m89225d()) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf.VersionRequirement.VersionKind versionKindM90920b = versionRequirementM90924a != null ? versionRequirementM90924a.m90920b() : null;
        int i2 = versionKindM90920b == null ? -1 : WhenMappings.f64599c[versionKindM90920b.ordinal()];
        if (i2 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i2 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i2 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i2 != 3) {
                l9r.m149037a();
                return null;
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        DeprecationLevel deprecationLevelM90921c = versionRequirementM90924a != null ? versionRequirementM90924a.m90921c() : null;
        int i3 = deprecationLevelM90921c == null ? -1 : WhenMappings.f64600d[deprecationLevelM90921c.ordinal()];
        if (i3 == -1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else if (i3 == 1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
        } else if (i3 != 2) {
            if (i3 != 3) {
                l9r.m149037a();
                return null;
            }
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else {
            kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
        }
        kmVersionRequirement.m89200e(kmVersionRequirementVersionKind);
        kmVersionRequirement.m89201f(kmVersionRequirementLevel);
        kmVersionRequirement.m89199d(versionRequirementM90924a != null ? versionRequirementM90924a.m90919a() : null);
        kmVersionRequirement.m89202g(versionRequirementM90924a != null ? versionRequirementM90924a.m90922d() : null);
        if (versionRequirementM90924a == null || (versionM90923e = versionRequirementM90924a.m90923e()) == null) {
            versionM90923e = VersionRequirement.Version.f65401d;
        }
        kmVersionRequirement.m89203h(new KmVersion(versionM90923e.m90926b(), versionM90923e.m90927c(), versionM90923e.m90928d()));
        return kmVersionRequirement;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final KmClass m89242i(@NotNull ProtoBuf.Class r10, @NotNull NameResolver nameResolver, boolean z, @NotNull List<? extends Object> list) {
        r10.getClass();
        nameResolver.getClass();
        list.getClass();
        KmClass kmClass = new KmClass();
        ProtoBuf.TypeTable typeTable = r10.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r10.getVersionRequirementTable();
        versionRequirementTable.getClass();
        ReadContext readContext = new ReadContext(nameResolver, typeTable2, companion.m90932a(versionRequirementTable), z, null, list, 16, null);
        List<ProtoBuf.TypeParameter> typeParameterList = r10.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM89230i = readContext.m89230i(typeParameterList);
        kmClass.m89117s(r10.getFlags());
        kmClass.m89120v(readContextM89230i.m89222a(r10.getFqName()));
        List<ProtoBuf.TypeParameter> typeParameterList2 = r10.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM89114p = kmClass.m89114p();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM89114p.add(m89253t(typeParameter, readContextM89230i));
        }
        List<ProtoBuf.Type> listM90912p = ProtoTypeTableUtilKt.m90912p(r10, readContextM89230i.m89228g());
        List<KmType> listM89113o = kmClass.m89113o();
        Iterator<T> it = listM90912p.iterator();
        while (it.hasNext()) {
            listM89113o.add(m89251r((ProtoBuf.Type) it.next(), readContextM89230i));
        }
        List<ProtoBuf.Constructor> constructorList = r10.getConstructorList();
        constructorList.getClass();
        List<KmConstructor> listM89103e = kmClass.m89103e();
        for (ProtoBuf.Constructor constructor : constructorList) {
            constructor.getClass();
            listM89103e.add(m89244k(constructor, readContextM89230i));
        }
        List<ProtoBuf.Function> functionList = r10.getFunctionList();
        functionList.getClass();
        List<ProtoBuf.Property> propertyList = r10.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf.TypeAlias> typeAliasList = r10.getTypeAliasList();
        typeAliasList.getClass();
        m89255v(kmClass, functionList, propertyList, typeAliasList, readContextM89230i);
        if (r10.hasCompanionObjectName()) {
            kmClass.m89116r(readContextM89230i.m89223b(r10.getCompanionObjectName()));
        }
        List<Integer> nestedClassNameList = r10.getNestedClassNameList();
        nestedClassNameList.getClass();
        List<String> listM89111m = kmClass.m89111m();
        for (Integer num : nestedClassNameList) {
            num.getClass();
            listM89111m.add(readContextM89230i.m89223b(num.intValue()));
        }
        Iterator<ProtoBuf.EnumEntry> it2 = r10.getEnumEntryList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                List<Integer> sealedSubclassFqNameList = r10.getSealedSubclassFqNameList();
                sealedSubclassFqNameList.getClass();
                List<String> listM89112n = kmClass.m89112n();
                for (Integer num2 : sealedSubclassFqNameList) {
                    num2.getClass();
                    listM89112n.add(readContextM89230i.m89222a(num2.intValue()));
                }
                if (r10.hasInlineClassUnderlyingPropertyName()) {
                    kmClass.m89118t(readContextM89230i.m89223b(r10.getInlineClassUnderlyingPropertyName()));
                }
                ProtoBuf.Type typeM89240g = m89240g(r10, readContextM89230i);
                kmClass.m89119u(typeM89240g != null ? m89251r(typeM89240g, readContextM89230i) : null);
                List<ProtoBuf.Type> listM90898b = ProtoTypeTableUtilKt.m90898b(r10, readContextM89230i.m89228g());
                List<KmType> listM89104f = kmClass.m89104f();
                Iterator<T> it3 = listM90898b.iterator();
                while (it3.hasNext()) {
                    listM89104f.add(m89251r((ProtoBuf.Type) it3.next(), readContextM89230i));
                }
                List<Integer> versionRequirementList = r10.getVersionRequirementList();
                versionRequirementList.getClass();
                List<KmVersionRequirement> listM89115q = kmClass.m89115q();
                for (Integer num3 : versionRequirementList) {
                    num3.getClass();
                    listM89115q.add(m89241h(num3.intValue(), readContextM89230i));
                }
                Iterator<T> it4 = readContextM89230i.m89224c().iterator();
                while (it4.hasNext()) {
                    ((MetadataExtensions) it4.next()).mo89277o(kmClass, r10, readContextM89230i);
                }
                return kmClass;
            }
            ProtoBuf.EnumEntry next = it2.next();
            if (!next.hasName()) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", null, 2, null);
            }
            kmClass.m89105g().add(readContextM89230i.m89223b(next.getName()));
            kmClass.m89109k().add(m89248o(next, readContextM89230i));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ KmClass m89243j(ProtoBuf.Class r0, NameResolver nameResolver, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return m89242i(r0, nameResolver, z, list);
    }

    /* JADX INFO: renamed from: k */
    public static final KmConstructor m89244k(ProtoBuf.Constructor constructor, ReadContext readContext) {
        KmConstructor kmConstructor = new KmConstructor(constructor.getFlags());
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        List<KmValueParameter> listM89124d = kmConstructor.m89124d();
        for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
            valueParameter.getClass();
            listM89124d.add(m89254u(valueParameter, readContext));
        }
        List<Integer> versionRequirementList = constructor.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM89125e = kmConstructor.m89125e();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM89125e.add(m89241h(num.intValue(), readContext));
        }
        Iterator<T> it = readContext.m89224c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo89274l(kmConstructor, constructor, readContext);
        }
        return kmConstructor;
    }

    @ExperimentalContracts
    /* JADX INFO: renamed from: l */
    public static final KmContract m89245l(ProtoBuf.Contract contract, ReadContext readContext) {
        KmEffectType kmEffectType;
        KmContract kmContract = new KmContract();
        for (ProtoBuf.Effect effect : contract.getEffectList()) {
            if (effect.hasEffectType()) {
                ProtoBuf.Effect.EffectType effectType = effect.getEffectType();
                KmEffectInvocationKind kmEffectInvocationKind = null;
                if (effectType == null) {
                    ig3.m135964a("Required value was null.");
                    return null;
                }
                int i = WhenMappings.f64601e[effectType.ordinal()];
                if (i == 1) {
                    kmEffectType = KmEffectType.RETURNS_CONSTANT;
                } else if (i == 2) {
                    kmEffectType = KmEffectType.CALLS;
                } else {
                    if (i != 3) {
                        l9r.m149037a();
                        return null;
                    }
                    kmEffectType = KmEffectType.RETURNS_NOT_NULL;
                }
                if (effect.hasKind()) {
                    ProtoBuf.Effect.InvocationKind kind = effect.getKind();
                    if (kind == null) {
                        ig3.m135964a("Required value was null.");
                        return null;
                    }
                    int i2 = WhenMappings.f64602f[kind.ordinal()];
                    if (i2 == 1) {
                        kmEffectInvocationKind = KmEffectInvocationKind.AT_MOST_ONCE;
                    } else if (i2 == 2) {
                        kmEffectInvocationKind = KmEffectInvocationKind.EXACTLY_ONCE;
                    } else {
                        if (i2 != 3) {
                            l9r.m149037a();
                            return null;
                        }
                        kmEffectInvocationKind = KmEffectInvocationKind.AT_LEAST_ONCE;
                    }
                }
                kmContract.m89127a().add(m89246m(effect, kmEffectType, kmEffectInvocationKind, readContext));
            }
        }
        return kmContract;
    }

    @ExperimentalContracts
    /* JADX INFO: renamed from: m */
    public static final KmEffect m89246m(ProtoBuf.Effect effect, KmEffectType kmEffectType, KmEffectInvocationKind kmEffectInvocationKind, ReadContext readContext) {
        KmEffect kmEffect = new KmEffect(kmEffectType, kmEffectInvocationKind);
        List<ProtoBuf.Expression> effectConstructorArgumentList = effect.getEffectConstructorArgumentList();
        effectConstructorArgumentList.getClass();
        List<KmEffectExpression> listM89128a = kmEffect.m89128a();
        for (ProtoBuf.Expression expression : effectConstructorArgumentList) {
            expression.getClass();
            listM89128a.add(m89247n(expression, readContext));
        }
        if (effect.hasConclusionOfConditionalEffect()) {
            ProtoBuf.Expression conclusionOfConditionalEffect = effect.getConclusionOfConditionalEffect();
            conclusionOfConditionalEffect.getClass();
            kmEffect.m89129b(m89247n(conclusionOfConditionalEffect, readContext));
        }
        return kmEffect;
    }

    @ExperimentalContracts
    /* JADX INFO: renamed from: n */
    public static final KmEffectExpression m89247n(ProtoBuf.Expression expression, ReadContext readContext) {
        Boolean bool;
        KmEffectExpression kmEffectExpression = new KmEffectExpression();
        kmEffectExpression.m89134e(expression.getFlags());
        kmEffectExpression.m89136g(expression.hasValueParameterReference() ? Integer.valueOf(expression.getValueParameterReference()) : null);
        if (expression.hasConstantValue()) {
            ProtoBuf.Expression.ConstantValue constantValue = expression.getConstantValue();
            if (constantValue == null) {
                ig3.m135964a("Required value was null.");
                return null;
            }
            int i = WhenMappings.f64603g[constantValue.ordinal()];
            if (i == 1) {
                bool = Boolean.TRUE;
            } else if (i == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i != 3) {
                    l9r.m149037a();
                    return null;
                }
                bool = null;
            }
            kmEffectExpression.m89133d(new KmConstantValue(bool));
        }
        ProtoBuf.Type typeM90906j = ProtoTypeTableUtilKt.m90906j(expression, readContext.m89228g());
        kmEffectExpression.m89135f(typeM90906j != null ? m89251r(typeM90906j, readContext) : null);
        List<ProtoBuf.Expression> andArgumentList = expression.getAndArgumentList();
        andArgumentList.getClass();
        List<KmEffectExpression> listM89130a = kmEffectExpression.m89130a();
        for (ProtoBuf.Expression expression2 : andArgumentList) {
            expression2.getClass();
            listM89130a.add(m89247n(expression2, readContext));
        }
        List<ProtoBuf.Expression> orArgumentList = expression.getOrArgumentList();
        orArgumentList.getClass();
        List<KmEffectExpression> listM89132c = kmEffectExpression.m89132c();
        for (ProtoBuf.Expression expression3 : orArgumentList) {
            expression3.getClass();
            listM89132c.add(m89247n(expression3, readContext));
        }
        return kmEffectExpression;
    }

    /* JADX INFO: renamed from: o */
    public static final KmEnumEntry m89248o(ProtoBuf.EnumEntry enumEntry, ReadContext readContext) {
        KmEnumEntry kmEnumEntry = new KmEnumEntry(readContext.m89223b(enumEntry.getName()));
        Iterator<T> it = readContext.m89224c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo89273k(kmEnumEntry, enumEntry, readContext);
        }
        return kmEnumEntry;
    }

    /* JADX INFO: renamed from: p */
    public static final KmFunction m89249p(ProtoBuf.Function function, ReadContext readContext) {
        KmFunction kmFunction = new KmFunction(function.getFlags(), readContext.m89223b(function.getName()));
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM89230i = readContext.m89230i(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = function.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM89143f = kmFunction.m89143f();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM89143f.add(m89253t(typeParameter, readContextM89230i));
        }
        ProtoBuf.Type typeM90908l = ProtoTypeTableUtilKt.m90908l(function, readContextM89230i.m89228g());
        kmFunction.m89148k(typeM90908l != null ? m89251r(typeM90908l, readContextM89230i) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        contextParameterList.getClass();
        List<KmValueParameter> listM89139b = kmFunction.m89139b();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            valueParameter.getClass();
            listM89139b.add(m89254u(valueParameter, readContextM89230i));
        }
        if (function.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> listM90899c = ProtoTypeTableUtilKt.m90899c(function, readContextM89230i.m89228g());
                List<KmValueParameter> listM89139b2 = kmFunction.m89139b();
                Iterator<T> it = listM90899c.iterator();
                while (it.hasNext()) {
                    listM89139b2.add(m89239f(m89251r((ProtoBuf.Type) it.next(), readContextM89230i)));
                }
            }
        }
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        List<KmValueParameter> listM89144g = kmFunction.m89144g();
        for (ProtoBuf.ValueParameter valueParameter2 : valueParameterList) {
            valueParameter2.getClass();
            listM89144g.add(m89254u(valueParameter2, readContextM89230i));
        }
        kmFunction.m89149l(m89251r(ProtoTypeTableUtilKt.m90910n(function, readContextM89230i.m89228g()), readContextM89230i));
        if (function.hasContract()) {
            ProtoBuf.Contract contract = function.getContract();
            contract.getClass();
            kmFunction.m89146i(m89245l(contract, readContextM89230i));
        }
        List<Integer> versionRequirementList = function.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM89145h = kmFunction.m89145h();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM89145h.add(m89241h(num.intValue(), readContextM89230i));
        }
        Iterator<T> it2 = readContextM89230i.m89224c().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).mo89280r(kmFunction, function, readContextM89230i);
        }
        return kmFunction;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final KmProperty m89250q(@NotNull ProtoBuf.Property property, @NotNull ReadContext readContext) {
        property.getClass();
        readContext.getClass();
        KmProperty kmProperty = new KmProperty(property.getFlags(), readContext.m89223b(property.getName()), m89235b(property), m89236c(property));
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM89230i = readContext.m89230i(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = property.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM89159j = kmProperty.m89159j();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM89159j.add(m89253t(typeParameter, readContextM89230i));
        }
        ProtoBuf.Type typeM90909m = ProtoTypeTableUtilKt.m90909m(property, readContextM89230i.m89228g());
        kmProperty.m89163n(typeM90909m != null ? m89251r(typeM90909m, readContextM89230i) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        contextParameterList.getClass();
        List<KmValueParameter> listM89152c = kmProperty.m89152c();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            valueParameter.getClass();
            listM89152c.add(m89254u(valueParameter, readContextM89230i));
        }
        if (property.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> listM90900d = ProtoTypeTableUtilKt.m90900d(property, readContextM89230i.m89228g());
                List<KmValueParameter> listM89152c2 = kmProperty.m89152c();
                Iterator<T> it = listM90900d.iterator();
                while (it.hasNext()) {
                    listM89152c2.add(m89239f(m89251r((ProtoBuf.Type) it.next(), readContextM89230i)));
                }
            }
        }
        if (property.hasSetterValueParameter()) {
            ProtoBuf.ValueParameter setterValueParameter = property.getSetterValueParameter();
            setterValueParameter.getClass();
            kmProperty.m89165p(m89254u(setterValueParameter, readContextM89230i));
        }
        kmProperty.m89164o(m89251r(ProtoTypeTableUtilKt.m90911o(property, readContextM89230i.m89228g()), readContextM89230i));
        List<Integer> versionRequirementList = property.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM89160k = kmProperty.m89160k();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM89160k.add(m89241h(num.intValue(), readContextM89230i));
        }
        Iterator<T> it2 = readContextM89230i.m89224c().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).mo89268f(kmProperty, property, readContextM89230i);
        }
        return kmProperty;
    }

    /* JADX INFO: renamed from: r */
    public static final KmType m89251r(ProtoBuf.Type type, ReadContext readContext) {
        KmClassifier typeParameter;
        KmType kmTypeM89251r;
        KmVariance kmVariance;
        KmType kmType = new KmType(m89237d(type));
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = null;
        kmFlexibleTypeUpperBound = null;
        if (type.hasClassName()) {
            typeParameter = new KmClassifier.Class(readContext.m89222a(type.getClassName()));
        } else if (type.hasTypeAliasName()) {
            typeParameter = new KmClassifier.TypeAlias(readContext.m89222a(type.getTypeAliasName()));
        } else if (type.hasTypeParameter()) {
            typeParameter = new KmClassifier.TypeParameter(type.getTypeParameter());
        } else {
            if (!type.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numM89227f = readContext.m89227f(type.getTypeParameterName());
            if (numM89227f == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for " + readContext.m89223b(type.getTypeParameterName()), null, 2, null);
            }
            typeParameter = new KmClassifier.TypeParameter(numM89227f.intValue());
        }
        kmType.m89175f(typeParameter);
        for (ProtoBuf.Type.Argument argument : type.getArgumentList()) {
            ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                ig3.m135964a("Required value was null.");
                return null;
            }
            int i = WhenMappings.f64598b[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    l9r.m149037a();
                    return null;
                }
                kmVariance = null;
            }
            if (kmVariance != null) {
                ProtoBuf.Type typeM90913q = ProtoTypeTableUtilKt.m90913q(argument, readContext.m89228g());
                if (typeM90913q == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                kmType.m89170a().add(new KmTypeProjection(kmVariance, m89251r(typeM90913q, readContext)));
            } else {
                kmType.m89170a().add(KmTypeProjection.f64559c);
            }
        }
        ProtoBuf.Type typeM90897a = ProtoTypeTableUtilKt.m90897a(type, readContext.m89228g());
        kmType.m89174e(typeM90897a != null ? m89251r(typeM90897a, readContext) : null);
        ProtoBuf.Type typeM90907k = ProtoTypeTableUtilKt.m90907k(type, readContext.m89228g());
        kmType.m89178i(typeM90907k != null ? m89251r(typeM90907k, readContext) : null);
        ProtoBuf.Type typeM90902f = ProtoTypeTableUtilKt.m90902f(type, readContext.m89228g());
        if (typeM90902f != null && (kmTypeM89251r = m89251r(typeM90902f, readContext)) != null) {
            kmFlexibleTypeUpperBound = new KmFlexibleTypeUpperBound(kmTypeM89251r, type.hasFlexibleTypeCapabilitiesId() ? readContext.m89223b(type.getFlexibleTypeCapabilitiesId()) : null);
        }
        kmType.m89177h(kmFlexibleTypeUpperBound);
        Iterator<T> it = readContext.m89224c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo89276n(kmType, type, readContext);
        }
        return kmType;
    }

    /* JADX INFO: renamed from: s */
    public static final KmTypeAlias m89252s(ProtoBuf.TypeAlias typeAlias, ReadContext readContext) {
        KmTypeAlias kmTypeAlias = new KmTypeAlias(typeAlias.getFlags(), readContext.m89223b(typeAlias.getName()));
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM89230i = readContext.m89230i(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = typeAlias.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM89181c = kmTypeAlias.m89181c();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM89181c.add(m89253t(typeParameter, readContextM89230i));
        }
        kmTypeAlias.m89185g(m89251r(ProtoTypeTableUtilKt.m90915s(typeAlias, readContextM89230i.m89228g()), readContextM89230i));
        kmTypeAlias.m89183e(m89251r(ProtoTypeTableUtilKt.m90901e(typeAlias, readContextM89230i.m89228g()), readContextM89230i));
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89179a = kmTypeAlias.m89179a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89179a.add(ReadUtilsKt.m89232b(annotation, readContextM89230i.m89226e()));
        }
        List<Integer> versionRequirementList = typeAlias.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM89182d = kmTypeAlias.m89182d();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM89182d.add(m89241h(num.intValue(), readContextM89230i));
        }
        Iterator<T> it = readContextM89230i.m89224c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo89272j(kmTypeAlias, typeAlias, readContextM89230i);
        }
        return kmTypeAlias;
    }

    /* JADX INFO: renamed from: t */
    public static final KmTypeParameter m89253t(ProtoBuf.TypeParameter typeParameter, ReadContext readContext) {
        KmVariance kmVariance;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        if (variance == null) {
            ig3.m135964a("Required value was null.");
            return null;
        }
        int i = WhenMappings.f64597a[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                l9r.m149037a();
                return null;
            }
            kmVariance = KmVariance.INVARIANT;
        }
        KmTypeParameter kmTypeParameter = new KmTypeParameter(m89238e(typeParameter), readContext.m89223b(typeParameter.getName()), typeParameter.getId(), kmVariance);
        List<ProtoBuf.Type> listM90916t = ProtoTypeTableUtilKt.m90916t(typeParameter, readContext.m89228g());
        List<KmType> listM89188c = kmTypeParameter.m89188c();
        Iterator<T> it = listM90916t.iterator();
        while (it.hasNext()) {
            listM89188c.add(m89251r((ProtoBuf.Type) it.next(), readContext));
        }
        Iterator<T> it2 = readContext.m89224c().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).mo89265c(kmTypeParameter, typeParameter, readContext);
        }
        return kmTypeParameter;
    }

    /* JADX INFO: renamed from: u */
    public static final KmValueParameter m89254u(ProtoBuf.ValueParameter valueParameter, ReadContext readContext) {
        KmValueParameter kmValueParameter = new KmValueParameter(valueParameter.getFlags(), readContext.m89223b(valueParameter.getName()));
        kmValueParameter.m89194e(m89251r(ProtoTypeTableUtilKt.m90914r(valueParameter, readContext.m89228g()), readContext));
        ProtoBuf.Type typeM90917u = ProtoTypeTableUtilKt.m90917u(valueParameter, readContext.m89228g());
        kmValueParameter.m89195f(typeM90917u != null ? m89251r(typeM90917u, readContext) : null);
        if (valueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf.Annotation.Argument.Value annotationParameterDefaultValue = valueParameter.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            kmValueParameter.m89192c(ReadUtilsKt.m89233c(annotationParameterDefaultValue, readContext.m89226e()));
        }
        Iterator<T> it = readContext.m89224c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo89278p(kmValueParameter, valueParameter, readContext);
        }
        return kmValueParameter;
    }

    /* JADX INFO: renamed from: v */
    public static final void m89255v(KmDeclarationContainer kmDeclarationContainer, List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3, ReadContext readContext) {
        List<KmFunction> listMo89101c = kmDeclarationContainer.mo89101c();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            listMo89101c.add(m89249p((ProtoBuf.Function) it.next(), readContext));
        }
        List<KmProperty> listMo89099a = kmDeclarationContainer.mo89099a();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            listMo89099a.add(m89250q((ProtoBuf.Property) it2.next(), readContext));
        }
        List<KmTypeAlias> listMo89100b = kmDeclarationContainer.mo89100b();
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            listMo89100b.add(m89252s((ProtoBuf.TypeAlias) it3.next(), readContext));
        }
    }
}
