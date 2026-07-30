package kotlin.reflect.jvm.internal.impl.p124km.internal;

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
import kotlin.reflect.jvm.internal.impl.p124km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.p124km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p124km.KmClass;
import kotlin.reflect.jvm.internal.impl.p124km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.p124km.KmConstantValue;
import kotlin.reflect.jvm.internal.impl.p124km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p124km.KmContract;
import kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.p124km.KmEffect;
import kotlin.reflect.jvm.internal.impl.p124km.KmEffectExpression;
import kotlin.reflect.jvm.internal.impl.p124km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.p124km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.p124km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.p124km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.p124km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p124km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p124km.KmType;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.p124km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p124km.KmVariance;
import kotlin.reflect.jvm.internal.impl.p124km.KmVersion;
import kotlin.reflect.jvm.internal.impl.p124km.KmVersionRequirement;
import kotlin.reflect.jvm.internal.impl.p124km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.p124km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReadersKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65271a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f65272b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f65273c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f65274d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f65275e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f65276f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f65277g;

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
            f65271a = iArr;
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
            f65272b = iArr2;
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
            f65273c = iArr3;
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
            f65274d = iArr4;
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
            f65275e = iArr5;
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
            f65276f = iArr6;
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
            f65277g = iArr7;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m90125a(int i) {
        Boolean boolMo91766d = Flags.f66035c.mo91766d(i);
        boolMo91766d.getClass();
        return Flags.m91765b(boolMo91766d.booleanValue(), Flags.f66036d.mo91766d(i), Flags.f66037e.mo91766d(i), false, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static final int m90126b(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasGetterFlags() ? property.getGetterFlags() : m90125a(property.getFlags());
    }

    /* JADX INFO: renamed from: c */
    public static final int m90127c(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasSetterFlags() ? property.getSetterFlags() : m90125a(property.getFlags());
    }

    /* JADX INFO: renamed from: d */
    public static final int m90128d(ProtoBuf.Type type) {
        boolean nullable = type.getNullable();
        return (nullable ? 1 : 0) + (type.getFlags() << 1);
    }

    /* JADX INFO: renamed from: e */
    public static final int m90129e(ProtoBuf.TypeParameter typeParameter) {
        return typeParameter.getReified() ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static final KmValueParameter m90130f(KmType kmType) {
        KmValueParameter kmValueParameter = new KmValueParameter(0, "_");
        kmValueParameter.m90085e(kmType);
        return kmValueParameter;
    }

    /* JADX INFO: renamed from: g */
    public static final ProtoBuf.Type m90131g(ProtoBuf.Class r7, ReadContext readContext) {
        ProtoBuf.Type typeM91796i = ProtoTypeTableUtilKt.m91796i(r7, readContext.m90119g());
        if (typeM91796i != null) {
            return typeM91796i;
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
            if (ProtoTypeTableUtilKt.m91800m(property, readContext.m90119g()) == null && Intrinsics.m88377d(readContext.m90114b(property.getName()), readContext.m90114b(r7.getInlineClassUnderlyingPropertyName()))) {
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
            return ProtoTypeTableUtilKt.m91802o(property2, readContext.m90119g());
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final KmVersionRequirement m90132h(int i, ReadContext readContext) {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        VersionRequirement.Version versionM91814e;
        KmVersionRequirement kmVersionRequirement = new KmVersionRequirement();
        VersionRequirement versionRequirementM91815a = VersionRequirement.Companion.m91815a(i, readContext.m90117e(), readContext.m90120h());
        if (versionRequirementM91815a == null && !readContext.m90116d()) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf.VersionRequirement.VersionKind versionKindM91811b = versionRequirementM91815a != null ? versionRequirementM91815a.m91811b() : null;
        int i2 = versionKindM91811b == null ? -1 : WhenMappings.f65273c[versionKindM91811b.ordinal()];
        if (i2 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i2 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i2 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i2 != 3) {
                nbr.m162172a();
                return null;
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        DeprecationLevel deprecationLevelM91812c = versionRequirementM91815a != null ? versionRequirementM91815a.m91812c() : null;
        int i3 = deprecationLevelM91812c == null ? -1 : WhenMappings.f65274d[deprecationLevelM91812c.ordinal()];
        if (i3 == -1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else if (i3 == 1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
        } else if (i3 != 2) {
            if (i3 != 3) {
                nbr.m162172a();
                return null;
            }
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else {
            kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
        }
        kmVersionRequirement.m90091e(kmVersionRequirementVersionKind);
        kmVersionRequirement.m90092f(kmVersionRequirementLevel);
        kmVersionRequirement.m90090d(versionRequirementM91815a != null ? versionRequirementM91815a.m91810a() : null);
        kmVersionRequirement.m90093g(versionRequirementM91815a != null ? versionRequirementM91815a.m91813d() : null);
        if (versionRequirementM91815a == null || (versionM91814e = versionRequirementM91815a.m91814e()) == null) {
            versionM91814e = VersionRequirement.Version.f66075d;
        }
        kmVersionRequirement.m90094h(new KmVersion(versionM91814e.m91817b(), versionM91814e.m91818c(), versionM91814e.m91819d()));
        return kmVersionRequirement;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final KmClass m90133i(@NotNull ProtoBuf.Class r10, @NotNull NameResolver nameResolver, boolean z, @NotNull List<? extends Object> list) {
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
        ReadContext readContext = new ReadContext(nameResolver, typeTable2, companion.m91823a(versionRequirementTable), z, null, list, 16, null);
        List<ProtoBuf.TypeParameter> typeParameterList = r10.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM90121i = readContext.m90121i(typeParameterList);
        kmClass.m90008s(r10.getFlags());
        kmClass.m90011v(readContextM90121i.m90113a(r10.getFqName()));
        List<ProtoBuf.TypeParameter> typeParameterList2 = r10.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM90005p = kmClass.m90005p();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM90005p.add(m90144t(typeParameter, readContextM90121i));
        }
        List<ProtoBuf.Type> listM91803p = ProtoTypeTableUtilKt.m91803p(r10, readContextM90121i.m90119g());
        List<KmType> listM90004o = kmClass.m90004o();
        Iterator<T> it = listM91803p.iterator();
        while (it.hasNext()) {
            listM90004o.add(m90142r((ProtoBuf.Type) it.next(), readContextM90121i));
        }
        List<ProtoBuf.Constructor> constructorList = r10.getConstructorList();
        constructorList.getClass();
        List<KmConstructor> listM89994e = kmClass.m89994e();
        for (ProtoBuf.Constructor constructor : constructorList) {
            constructor.getClass();
            listM89994e.add(m90135k(constructor, readContextM90121i));
        }
        List<ProtoBuf.Function> functionList = r10.getFunctionList();
        functionList.getClass();
        List<ProtoBuf.Property> propertyList = r10.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf.TypeAlias> typeAliasList = r10.getTypeAliasList();
        typeAliasList.getClass();
        m90146v(kmClass, functionList, propertyList, typeAliasList, readContextM90121i);
        if (r10.hasCompanionObjectName()) {
            kmClass.m90007r(readContextM90121i.m90114b(r10.getCompanionObjectName()));
        }
        List<Integer> nestedClassNameList = r10.getNestedClassNameList();
        nestedClassNameList.getClass();
        List<String> listM90002m = kmClass.m90002m();
        for (Integer num : nestedClassNameList) {
            num.getClass();
            listM90002m.add(readContextM90121i.m90114b(num.intValue()));
        }
        Iterator<ProtoBuf.EnumEntry> it2 = r10.getEnumEntryList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                List<Integer> sealedSubclassFqNameList = r10.getSealedSubclassFqNameList();
                sealedSubclassFqNameList.getClass();
                List<String> listM90003n = kmClass.m90003n();
                for (Integer num2 : sealedSubclassFqNameList) {
                    num2.getClass();
                    listM90003n.add(readContextM90121i.m90113a(num2.intValue()));
                }
                if (r10.hasInlineClassUnderlyingPropertyName()) {
                    kmClass.m90009t(readContextM90121i.m90114b(r10.getInlineClassUnderlyingPropertyName()));
                }
                ProtoBuf.Type typeM90131g = m90131g(r10, readContextM90121i);
                kmClass.m90010u(typeM90131g != null ? m90142r(typeM90131g, readContextM90121i) : null);
                List<ProtoBuf.Type> listM91789b = ProtoTypeTableUtilKt.m91789b(r10, readContextM90121i.m90119g());
                List<KmType> listM89995f = kmClass.m89995f();
                Iterator<T> it3 = listM91789b.iterator();
                while (it3.hasNext()) {
                    listM89995f.add(m90142r((ProtoBuf.Type) it3.next(), readContextM90121i));
                }
                List<Integer> versionRequirementList = r10.getVersionRequirementList();
                versionRequirementList.getClass();
                List<KmVersionRequirement> listM90006q = kmClass.m90006q();
                for (Integer num3 : versionRequirementList) {
                    num3.getClass();
                    listM90006q.add(m90132h(num3.intValue(), readContextM90121i));
                }
                Iterator<T> it4 = readContextM90121i.m90115c().iterator();
                while (it4.hasNext()) {
                    ((MetadataExtensions) it4.next()).mo90168o(kmClass, r10, readContextM90121i);
                }
                return kmClass;
            }
            ProtoBuf.EnumEntry next = it2.next();
            if (!next.hasName()) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", null, 2, null);
            }
            kmClass.m89996g().add(readContextM90121i.m90114b(next.getName()));
            kmClass.m90000k().add(m90139o(next, readContextM90121i));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ KmClass m90134j(ProtoBuf.Class r0, NameResolver nameResolver, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return m90133i(r0, nameResolver, z, list);
    }

    /* JADX INFO: renamed from: k */
    public static final KmConstructor m90135k(ProtoBuf.Constructor constructor, ReadContext readContext) {
        KmConstructor kmConstructor = new KmConstructor(constructor.getFlags());
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        List<KmValueParameter> listM90015d = kmConstructor.m90015d();
        for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
            valueParameter.getClass();
            listM90015d.add(m90145u(valueParameter, readContext));
        }
        List<Integer> versionRequirementList = constructor.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM90016e = kmConstructor.m90016e();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM90016e.add(m90132h(num.intValue(), readContext));
        }
        Iterator<T> it = readContext.m90115c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo90165l(kmConstructor, constructor, readContext);
        }
        return kmConstructor;
    }

    @ExperimentalContracts
    /* JADX INFO: renamed from: l */
    public static final KmContract m90136l(ProtoBuf.Contract contract, ReadContext readContext) {
        KmEffectType kmEffectType;
        KmContract kmContract = new KmContract();
        for (ProtoBuf.Effect effect : contract.getEffectList()) {
            if (effect.hasEffectType()) {
                ProtoBuf.Effect.EffectType effectType = effect.getEffectType();
                KmEffectInvocationKind kmEffectInvocationKind = null;
                if (effectType == null) {
                    wg3.m206174a("Required value was null.");
                    return null;
                }
                int i = WhenMappings.f65275e[effectType.ordinal()];
                if (i == 1) {
                    kmEffectType = KmEffectType.RETURNS_CONSTANT;
                } else if (i == 2) {
                    kmEffectType = KmEffectType.CALLS;
                } else {
                    if (i != 3) {
                        nbr.m162172a();
                        return null;
                    }
                    kmEffectType = KmEffectType.RETURNS_NOT_NULL;
                }
                if (effect.hasKind()) {
                    ProtoBuf.Effect.InvocationKind kind = effect.getKind();
                    if (kind == null) {
                        wg3.m206174a("Required value was null.");
                        return null;
                    }
                    int i2 = WhenMappings.f65276f[kind.ordinal()];
                    if (i2 == 1) {
                        kmEffectInvocationKind = KmEffectInvocationKind.AT_MOST_ONCE;
                    } else if (i2 == 2) {
                        kmEffectInvocationKind = KmEffectInvocationKind.EXACTLY_ONCE;
                    } else {
                        if (i2 != 3) {
                            nbr.m162172a();
                            return null;
                        }
                        kmEffectInvocationKind = KmEffectInvocationKind.AT_LEAST_ONCE;
                    }
                }
                kmContract.m90018a().add(m90137m(effect, kmEffectType, kmEffectInvocationKind, readContext));
            }
        }
        return kmContract;
    }

    @ExperimentalContracts
    /* JADX INFO: renamed from: m */
    public static final KmEffect m90137m(ProtoBuf.Effect effect, KmEffectType kmEffectType, KmEffectInvocationKind kmEffectInvocationKind, ReadContext readContext) {
        KmEffect kmEffect = new KmEffect(kmEffectType, kmEffectInvocationKind);
        List<ProtoBuf.Expression> effectConstructorArgumentList = effect.getEffectConstructorArgumentList();
        effectConstructorArgumentList.getClass();
        List<KmEffectExpression> listM90019a = kmEffect.m90019a();
        for (ProtoBuf.Expression expression : effectConstructorArgumentList) {
            expression.getClass();
            listM90019a.add(m90138n(expression, readContext));
        }
        if (effect.hasConclusionOfConditionalEffect()) {
            ProtoBuf.Expression conclusionOfConditionalEffect = effect.getConclusionOfConditionalEffect();
            conclusionOfConditionalEffect.getClass();
            kmEffect.m90020b(m90138n(conclusionOfConditionalEffect, readContext));
        }
        return kmEffect;
    }

    @ExperimentalContracts
    /* JADX INFO: renamed from: n */
    public static final KmEffectExpression m90138n(ProtoBuf.Expression expression, ReadContext readContext) {
        Boolean bool;
        KmEffectExpression kmEffectExpression = new KmEffectExpression();
        kmEffectExpression.m90025e(expression.getFlags());
        kmEffectExpression.m90027g(expression.hasValueParameterReference() ? Integer.valueOf(expression.getValueParameterReference()) : null);
        if (expression.hasConstantValue()) {
            ProtoBuf.Expression.ConstantValue constantValue = expression.getConstantValue();
            if (constantValue == null) {
                wg3.m206174a("Required value was null.");
                return null;
            }
            int i = WhenMappings.f65277g[constantValue.ordinal()];
            if (i == 1) {
                bool = Boolean.TRUE;
            } else if (i == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i != 3) {
                    nbr.m162172a();
                    return null;
                }
                bool = null;
            }
            kmEffectExpression.m90024d(new KmConstantValue(bool));
        }
        ProtoBuf.Type typeM91797j = ProtoTypeTableUtilKt.m91797j(expression, readContext.m90119g());
        kmEffectExpression.m90026f(typeM91797j != null ? m90142r(typeM91797j, readContext) : null);
        List<ProtoBuf.Expression> andArgumentList = expression.getAndArgumentList();
        andArgumentList.getClass();
        List<KmEffectExpression> listM90021a = kmEffectExpression.m90021a();
        for (ProtoBuf.Expression expression2 : andArgumentList) {
            expression2.getClass();
            listM90021a.add(m90138n(expression2, readContext));
        }
        List<ProtoBuf.Expression> orArgumentList = expression.getOrArgumentList();
        orArgumentList.getClass();
        List<KmEffectExpression> listM90023c = kmEffectExpression.m90023c();
        for (ProtoBuf.Expression expression3 : orArgumentList) {
            expression3.getClass();
            listM90023c.add(m90138n(expression3, readContext));
        }
        return kmEffectExpression;
    }

    /* JADX INFO: renamed from: o */
    public static final KmEnumEntry m90139o(ProtoBuf.EnumEntry enumEntry, ReadContext readContext) {
        KmEnumEntry kmEnumEntry = new KmEnumEntry(readContext.m90114b(enumEntry.getName()));
        Iterator<T> it = readContext.m90115c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo90164k(kmEnumEntry, enumEntry, readContext);
        }
        return kmEnumEntry;
    }

    /* JADX INFO: renamed from: p */
    public static final KmFunction m90140p(ProtoBuf.Function function, ReadContext readContext) {
        KmFunction kmFunction = new KmFunction(function.getFlags(), readContext.m90114b(function.getName()));
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM90121i = readContext.m90121i(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = function.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM90034f = kmFunction.m90034f();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM90034f.add(m90144t(typeParameter, readContextM90121i));
        }
        ProtoBuf.Type typeM91799l = ProtoTypeTableUtilKt.m91799l(function, readContextM90121i.m90119g());
        kmFunction.m90039k(typeM91799l != null ? m90142r(typeM91799l, readContextM90121i) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        contextParameterList.getClass();
        List<KmValueParameter> listM90030b = kmFunction.m90030b();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            valueParameter.getClass();
            listM90030b.add(m90145u(valueParameter, readContextM90121i));
        }
        if (function.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> listM91790c = ProtoTypeTableUtilKt.m91790c(function, readContextM90121i.m90119g());
                List<KmValueParameter> listM90030b2 = kmFunction.m90030b();
                Iterator<T> it = listM91790c.iterator();
                while (it.hasNext()) {
                    listM90030b2.add(m90130f(m90142r((ProtoBuf.Type) it.next(), readContextM90121i)));
                }
            }
        }
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        List<KmValueParameter> listM90035g = kmFunction.m90035g();
        for (ProtoBuf.ValueParameter valueParameter2 : valueParameterList) {
            valueParameter2.getClass();
            listM90035g.add(m90145u(valueParameter2, readContextM90121i));
        }
        kmFunction.m90040l(m90142r(ProtoTypeTableUtilKt.m91801n(function, readContextM90121i.m90119g()), readContextM90121i));
        if (function.hasContract()) {
            ProtoBuf.Contract contract = function.getContract();
            contract.getClass();
            kmFunction.m90037i(m90136l(contract, readContextM90121i));
        }
        List<Integer> versionRequirementList = function.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM90036h = kmFunction.m90036h();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM90036h.add(m90132h(num.intValue(), readContextM90121i));
        }
        Iterator<T> it2 = readContextM90121i.m90115c().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).mo90171r(kmFunction, function, readContextM90121i);
        }
        return kmFunction;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final KmProperty m90141q(@NotNull ProtoBuf.Property property, @NotNull ReadContext readContext) {
        property.getClass();
        readContext.getClass();
        KmProperty kmProperty = new KmProperty(property.getFlags(), readContext.m90114b(property.getName()), m90126b(property), m90127c(property));
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM90121i = readContext.m90121i(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = property.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM90050j = kmProperty.m90050j();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM90050j.add(m90144t(typeParameter, readContextM90121i));
        }
        ProtoBuf.Type typeM91800m = ProtoTypeTableUtilKt.m91800m(property, readContextM90121i.m90119g());
        kmProperty.m90054n(typeM91800m != null ? m90142r(typeM91800m, readContextM90121i) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        contextParameterList.getClass();
        List<KmValueParameter> listM90043c = kmProperty.m90043c();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            valueParameter.getClass();
            listM90043c.add(m90145u(valueParameter, readContextM90121i));
        }
        if (property.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> listM91791d = ProtoTypeTableUtilKt.m91791d(property, readContextM90121i.m90119g());
                List<KmValueParameter> listM90043c2 = kmProperty.m90043c();
                Iterator<T> it = listM91791d.iterator();
                while (it.hasNext()) {
                    listM90043c2.add(m90130f(m90142r((ProtoBuf.Type) it.next(), readContextM90121i)));
                }
            }
        }
        if (property.hasSetterValueParameter()) {
            ProtoBuf.ValueParameter setterValueParameter = property.getSetterValueParameter();
            setterValueParameter.getClass();
            kmProperty.m90056p(m90145u(setterValueParameter, readContextM90121i));
        }
        kmProperty.m90055o(m90142r(ProtoTypeTableUtilKt.m91802o(property, readContextM90121i.m90119g()), readContextM90121i));
        List<Integer> versionRequirementList = property.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM90051k = kmProperty.m90051k();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM90051k.add(m90132h(num.intValue(), readContextM90121i));
        }
        Iterator<T> it2 = readContextM90121i.m90115c().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).mo90159f(kmProperty, property, readContextM90121i);
        }
        return kmProperty;
    }

    /* JADX INFO: renamed from: r */
    public static final KmType m90142r(ProtoBuf.Type type, ReadContext readContext) {
        KmClassifier typeParameter;
        KmType kmTypeM90142r;
        KmVariance kmVariance;
        KmType kmType = new KmType(m90128d(type));
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = null;
        kmFlexibleTypeUpperBound = null;
        if (type.hasClassName()) {
            typeParameter = new KmClassifier.Class(readContext.m90113a(type.getClassName()));
        } else if (type.hasTypeAliasName()) {
            typeParameter = new KmClassifier.TypeAlias(readContext.m90113a(type.getTypeAliasName()));
        } else if (type.hasTypeParameter()) {
            typeParameter = new KmClassifier.TypeParameter(type.getTypeParameter());
        } else {
            if (!type.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numM90118f = readContext.m90118f(type.getTypeParameterName());
            if (numM90118f == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for " + readContext.m90114b(type.getTypeParameterName()), null, 2, null);
            }
            typeParameter = new KmClassifier.TypeParameter(numM90118f.intValue());
        }
        kmType.m90066f(typeParameter);
        for (ProtoBuf.Type.Argument argument : type.getArgumentList()) {
            ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                wg3.m206174a("Required value was null.");
                return null;
            }
            int i = WhenMappings.f65272b[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    nbr.m162172a();
                    return null;
                }
                kmVariance = null;
            }
            if (kmVariance != null) {
                ProtoBuf.Type typeM91804q = ProtoTypeTableUtilKt.m91804q(argument, readContext.m90119g());
                if (typeM91804q == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                kmType.m90061a().add(new KmTypeProjection(kmVariance, m90142r(typeM91804q, readContext)));
            } else {
                kmType.m90061a().add(KmTypeProjection.f65233c);
            }
        }
        ProtoBuf.Type typeM91788a = ProtoTypeTableUtilKt.m91788a(type, readContext.m90119g());
        kmType.m90065e(typeM91788a != null ? m90142r(typeM91788a, readContext) : null);
        ProtoBuf.Type typeM91798k = ProtoTypeTableUtilKt.m91798k(type, readContext.m90119g());
        kmType.m90069i(typeM91798k != null ? m90142r(typeM91798k, readContext) : null);
        ProtoBuf.Type typeM91793f = ProtoTypeTableUtilKt.m91793f(type, readContext.m90119g());
        if (typeM91793f != null && (kmTypeM90142r = m90142r(typeM91793f, readContext)) != null) {
            kmFlexibleTypeUpperBound = new KmFlexibleTypeUpperBound(kmTypeM90142r, type.hasFlexibleTypeCapabilitiesId() ? readContext.m90114b(type.getFlexibleTypeCapabilitiesId()) : null);
        }
        kmType.m90068h(kmFlexibleTypeUpperBound);
        Iterator<T> it = readContext.m90115c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo90167n(kmType, type, readContext);
        }
        return kmType;
    }

    /* JADX INFO: renamed from: s */
    public static final KmTypeAlias m90143s(ProtoBuf.TypeAlias typeAlias, ReadContext readContext) {
        KmTypeAlias kmTypeAlias = new KmTypeAlias(typeAlias.getFlags(), readContext.m90114b(typeAlias.getName()));
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext readContextM90121i = readContext.m90121i(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = typeAlias.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> listM90072c = kmTypeAlias.m90072c();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            listM90072c.add(m90144t(typeParameter, readContextM90121i));
        }
        kmTypeAlias.m90076g(m90142r(ProtoTypeTableUtilKt.m91806s(typeAlias, readContextM90121i.m90119g()), readContextM90121i));
        kmTypeAlias.m90074e(m90142r(ProtoTypeTableUtilKt.m91792e(typeAlias, readContextM90121i.m90119g()), readContextM90121i));
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM90070a = kmTypeAlias.m90070a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM90070a.add(ReadUtilsKt.m90123b(annotation, readContextM90121i.m90117e()));
        }
        List<Integer> versionRequirementList = typeAlias.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> listM90073d = kmTypeAlias.m90073d();
        for (Integer num : versionRequirementList) {
            num.getClass();
            listM90073d.add(m90132h(num.intValue(), readContextM90121i));
        }
        Iterator<T> it = readContextM90121i.m90115c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo90163j(kmTypeAlias, typeAlias, readContextM90121i);
        }
        return kmTypeAlias;
    }

    /* JADX INFO: renamed from: t */
    public static final KmTypeParameter m90144t(ProtoBuf.TypeParameter typeParameter, ReadContext readContext) {
        KmVariance kmVariance;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        if (variance == null) {
            wg3.m206174a("Required value was null.");
            return null;
        }
        int i = WhenMappings.f65271a[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                nbr.m162172a();
                return null;
            }
            kmVariance = KmVariance.INVARIANT;
        }
        KmTypeParameter kmTypeParameter = new KmTypeParameter(m90129e(typeParameter), readContext.m90114b(typeParameter.getName()), typeParameter.getId(), kmVariance);
        List<ProtoBuf.Type> listM91807t = ProtoTypeTableUtilKt.m91807t(typeParameter, readContext.m90119g());
        List<KmType> listM90079c = kmTypeParameter.m90079c();
        Iterator<T> it = listM91807t.iterator();
        while (it.hasNext()) {
            listM90079c.add(m90142r((ProtoBuf.Type) it.next(), readContext));
        }
        Iterator<T> it2 = readContext.m90115c().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).mo90156c(kmTypeParameter, typeParameter, readContext);
        }
        return kmTypeParameter;
    }

    /* JADX INFO: renamed from: u */
    public static final KmValueParameter m90145u(ProtoBuf.ValueParameter valueParameter, ReadContext readContext) {
        KmValueParameter kmValueParameter = new KmValueParameter(valueParameter.getFlags(), readContext.m90114b(valueParameter.getName()));
        kmValueParameter.m90085e(m90142r(ProtoTypeTableUtilKt.m91805r(valueParameter, readContext.m90119g()), readContext));
        ProtoBuf.Type typeM91808u = ProtoTypeTableUtilKt.m91808u(valueParameter, readContext.m90119g());
        kmValueParameter.m90086f(typeM91808u != null ? m90142r(typeM91808u, readContext) : null);
        if (valueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf.Annotation.Argument.Value annotationParameterDefaultValue = valueParameter.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            kmValueParameter.m90083c(ReadUtilsKt.m90124c(annotationParameterDefaultValue, readContext.m90117e()));
        }
        Iterator<T> it = readContext.m90115c().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).mo90169p(kmValueParameter, valueParameter, readContext);
        }
        return kmValueParameter;
    }

    /* JADX INFO: renamed from: v */
    public static final void m90146v(KmDeclarationContainer kmDeclarationContainer, List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3, ReadContext readContext) {
        List<KmFunction> listMo89992c = kmDeclarationContainer.mo89992c();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            listMo89992c.add(m90140p((ProtoBuf.Function) it.next(), readContext));
        }
        List<KmProperty> listMo89990a = kmDeclarationContainer.mo89990a();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            listMo89990a.add(m90141q((ProtoBuf.Property) it2.next(), readContext));
        }
        List<KmTypeAlias> listMo89991b = kmDeclarationContainer.mo89991b();
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            listMo89991b.add(m90143s((ProtoBuf.TypeAlias) it3.next(), readContext));
        }
    }
}
