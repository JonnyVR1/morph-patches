package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p124km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.p124km.internal.EnumFlagDelegate;
import kotlin.reflect.jvm.internal.impl.p124km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.p124km.internal.FlagImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@JvmName
@SourceDebugExtension
public final class Attributes {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final BooleanFlagDelegate f65051A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final BooleanFlagDelegate f65052B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public static final BooleanFlagDelegate f65053C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public static final BooleanFlagDelegate f65054D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final BooleanFlagDelegate f65055E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public static final BooleanFlagDelegate f65056F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public static final EnumFlagDelegate f65057G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public static final EnumFlagDelegate f65058H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final EnumFlagDelegate f65059I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public static final BooleanFlagDelegate f65060J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public static final BooleanFlagDelegate f65061K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public static final BooleanFlagDelegate f65062L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public static final BooleanFlagDelegate f65063M;

    /* JADX INFO: renamed from: N */
    @NotNull
    public static final BooleanFlagDelegate f65064N;

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final BooleanFlagDelegate f65065O;

    /* JADX INFO: renamed from: P */
    @NotNull
    public static final BooleanFlagDelegate f65066P;

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static final EnumFlagDelegate f65067Q;

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final EnumFlagDelegate f65068R;

    /* JADX INFO: renamed from: S */
    @NotNull
    public static final BooleanFlagDelegate f65069S;

    /* JADX INFO: renamed from: T */
    @NotNull
    public static final BooleanFlagDelegate f65070T;

    /* JADX INFO: renamed from: U */
    @NotNull
    public static final BooleanFlagDelegate f65071U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final BooleanFlagDelegate f65072V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final BooleanFlagDelegate f65073W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final BooleanFlagDelegate f65074X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final BooleanFlagDelegate f65075Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final EnumFlagDelegate f65076Z;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty<Object>[] f65077a = {Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1)), Reflection.m88399e(new MutablePropertyReference1Impl(Attributes.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final BooleanFlagDelegate f65078a0;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final BooleanFlagDelegate f65079b;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final BooleanFlagDelegate f65080b0;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final BooleanFlagDelegate f65081c;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final BooleanFlagDelegate f65082c0;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final BooleanFlagDelegate f65083d;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final BooleanFlagDelegate f65084d0;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final BooleanFlagDelegate f65085e;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final BooleanFlagDelegate f65086e0;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final BooleanFlagDelegate f65087f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final BooleanFlagDelegate f65088g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final BooleanFlagDelegate f65089h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final EnumFlagDelegate f65090i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final EnumFlagDelegate f65091j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final EnumFlagDelegate f65092k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final BooleanFlagDelegate f65093l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final BooleanFlagDelegate f65094m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final BooleanFlagDelegate f65095n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final BooleanFlagDelegate f65096o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final BooleanFlagDelegate f65097p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final BooleanFlagDelegate f65098q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final BooleanFlagDelegate f65099r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final EnumFlagDelegate f65100s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final BooleanFlagDelegate f65101t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final BooleanFlagDelegate f65102u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final EnumFlagDelegate f65103v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final EnumFlagDelegate f65104w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final EnumFlagDelegate f65105x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final BooleanFlagDelegate f65106y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final BooleanFlagDelegate f65107z;

    static {
        Flags.BooleanFlagField booleanFlagField = Flags.f66035c;
        booleanFlagField.getClass();
        f65079b = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f65081c = FlagDelegatesImplKt.m90099b(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f65083d = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f65085e = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f65087f = FlagDelegatesImplKt.m90103f(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f65088g = FlagDelegatesImplKt.m90107j(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f65089h = FlagDelegatesImplKt.m90105h(new FlagImpl(booleanFlagField));
        f65090i = FlagDelegatesImplKt.m90102e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89998i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m90008s(((Number) obj2).intValue());
            }
        });
        f65091j = FlagDelegatesImplKt.m90108k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89998i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m90008s(((Number) obj2).intValue());
            }
        });
        Attributes$kind$2 attributes$kind$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89998i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m90008s(((Number) obj2).intValue());
            }
        };
        Flags.FlagField<ProtoBuf.Class.Kind> flagField = Flags.f66038f;
        flagField.getClass();
        EnumEntries<ClassKind> entries = ClassKind.getEntries();
        EnumEntries<ClassKind> entries2 = ClassKind.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<ClassKind> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        f65092k = new EnumFlagDelegate(attributes$kind$2, flagField, entries, arrayList);
        Flags.BooleanFlagField booleanFlagField2 = Flags.f66039g;
        booleanFlagField2.getClass();
        f65093l = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField2));
        Flags.BooleanFlagField booleanFlagField3 = Flags.f66040h;
        booleanFlagField3.getClass();
        f65094m = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField3));
        Flags.BooleanFlagField booleanFlagField4 = Flags.f66041i;
        booleanFlagField4.getClass();
        f65095n = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField4));
        Flags.BooleanFlagField booleanFlagField5 = Flags.f66042j;
        booleanFlagField5.getClass();
        f65096o = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField5));
        Flags.BooleanFlagField booleanFlagField6 = Flags.f66043k;
        booleanFlagField6.getClass();
        f65097p = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField6));
        Flags.BooleanFlagField booleanFlagField7 = Flags.f66044l;
        booleanFlagField7.getClass();
        f65098q = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField7));
        Flags.BooleanFlagField booleanFlagField8 = Flags.f66045m;
        booleanFlagField8.getClass();
        f65099r = FlagDelegatesImplKt.m90098a(new FlagImpl(booleanFlagField8));
        f65100s = FlagDelegatesImplKt.m90108k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmConstructor) obj).m90014c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmConstructor) obj).m90017f(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField9 = Flags.f66046n;
        booleanFlagField9.getClass();
        f65101t = FlagDelegatesImplKt.m90099b(new FlagImpl(booleanFlagField9));
        Flags.BooleanFlagField booleanFlagField10 = Flags.f66047o;
        booleanFlagField10.getClass();
        f65102u = FlagDelegatesImplKt.m90099b(new FlagImpl(booleanFlagField10));
        f65103v = FlagDelegatesImplKt.m90101d(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m90033e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m90038j(((Number) obj2).intValue());
            }
        });
        f65104w = FlagDelegatesImplKt.m90108k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m90033e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m90038j(((Number) obj2).intValue());
            }
        });
        f65105x = FlagDelegatesImplKt.m90102e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m90033e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m90038j(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField11 = Flags.f66050r;
        booleanFlagField11.getClass();
        f65106y = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField11));
        Flags.BooleanFlagField booleanFlagField12 = Flags.f66051s;
        booleanFlagField12.getClass();
        f65107z = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField12));
        Flags.BooleanFlagField booleanFlagField13 = Flags.f66052t;
        booleanFlagField13.getClass();
        f65051A = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField13));
        Flags.BooleanFlagField booleanFlagField14 = Flags.f66053u;
        booleanFlagField14.getClass();
        f65052B = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField14));
        Flags.BooleanFlagField booleanFlagField15 = Flags.f66054v;
        booleanFlagField15.getClass();
        f65053C = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField15));
        Flags.BooleanFlagField booleanFlagField16 = Flags.f66055w;
        booleanFlagField16.getClass();
        f65054D = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField16));
        Flags.BooleanFlagField booleanFlagField17 = Flags.f66056x;
        booleanFlagField17.getClass();
        f65055E = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField17));
        Flags.BooleanFlagField booleanFlagField18 = Flags.f66057y;
        booleanFlagField18.getClass();
        f65056F = FlagDelegatesImplKt.m90100c(new FlagImpl(booleanFlagField18));
        f65057G = FlagDelegatesImplKt.m90108k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m90047g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m90053m(((Number) obj2).intValue());
            }
        });
        f65058H = FlagDelegatesImplKt.m90102e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m90047g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m90053m(((Number) obj2).intValue());
            }
        });
        f65059I = FlagDelegatesImplKt.m90101d(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$11
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m90047g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m90053m(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField19 = Flags.f66014A;
        booleanFlagField19.getClass();
        f65060J = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField19));
        Flags.BooleanFlagField booleanFlagField20 = Flags.f66017D;
        booleanFlagField20.getClass();
        f65061K = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField20));
        Flags.BooleanFlagField booleanFlagField21 = Flags.f66018E;
        booleanFlagField21.getClass();
        f65062L = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField21));
        Flags.BooleanFlagField booleanFlagField22 = Flags.f66019F;
        booleanFlagField22.getClass();
        f65063M = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField22));
        Flags.BooleanFlagField booleanFlagField23 = Flags.f66020G;
        booleanFlagField23.getClass();
        f65064N = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField23));
        Flags.BooleanFlagField booleanFlagField24 = Flags.f66021H;
        booleanFlagField24.getClass();
        f65065O = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField24));
        Flags.BooleanFlagField booleanFlagField25 = Flags.f66022I;
        booleanFlagField25.getClass();
        f65066P = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField25));
        f65067Q = FlagDelegatesImplKt.m90108k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).m90059b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).m90060c(((Number) obj2).intValue());
            }
        });
        f65068R = FlagDelegatesImplKt.m90102e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).m90059b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).m90060c(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField26 = Flags.f66027N;
        booleanFlagField26.getClass();
        f65069S = FlagDelegatesImplKt.m90103f(new FlagImpl(booleanFlagField26));
        Flags.BooleanFlagField booleanFlagField27 = Flags.f66028O;
        booleanFlagField27.getClass();
        f65070T = FlagDelegatesImplKt.m90103f(new FlagImpl(booleanFlagField27));
        Flags.BooleanFlagField booleanFlagField28 = Flags.f66029P;
        booleanFlagField28.getClass();
        f65071U = FlagDelegatesImplKt.m90103f(new FlagImpl(booleanFlagField28));
        f65072V = FlagDelegatesImplKt.m90106i(new FlagImpl(0, 1, 1));
        Flags.BooleanFlagField booleanFlagField29 = Flags.f66033a;
        f65073W = FlagDelegatesImplKt.m90106i(new FlagImpl(booleanFlagField29.f66059a + 1, booleanFlagField29.f66060b, 1));
        Flags.BooleanFlagField booleanFlagField30 = Flags.f66034b;
        f65074X = FlagDelegatesImplKt.m90106i(new FlagImpl(booleanFlagField30.f66059a + 1, booleanFlagField30.f66060b, 1));
        f65075Y = new BooleanFlagDelegate(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isReified$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeParameter) obj).m90078b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeParameter) obj).m90080d(((Number) obj2).intValue());
            }
        }, new FlagImpl(0, 1, 1));
        f65076Z = FlagDelegatesImplKt.m90108k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeAlias) obj).m90071b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeAlias) obj).m90075f(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField31 = Flags.f66024K;
        booleanFlagField31.getClass();
        f65078a0 = FlagDelegatesImplKt.m90107j(new FlagImpl(booleanFlagField31));
        Flags.BooleanFlagField booleanFlagField32 = Flags.f66025L;
        booleanFlagField32.getClass();
        f65080b0 = FlagDelegatesImplKt.m90107j(new FlagImpl(booleanFlagField32));
        Flags.BooleanFlagField booleanFlagField33 = Flags.f66026M;
        booleanFlagField33.getClass();
        f65082c0 = FlagDelegatesImplKt.m90107j(new FlagImpl(booleanFlagField33));
        Attributes$isNegated$2 attributes$isNegated$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmEffectExpression) obj).m90022b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmEffectExpression) obj).m90025e(((Number) obj2).intValue());
            }
        };
        Flags.BooleanFlagField booleanFlagField34 = Flags.f66030Q;
        booleanFlagField34.getClass();
        f65084d0 = new BooleanFlagDelegate(attributes$isNegated$2, new FlagImpl(booleanFlagField34));
        Attributes$isNullCheckPredicate$2 attributes$isNullCheckPredicate$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmEffectExpression) obj).m90022b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmEffectExpression) obj).m90025e(((Number) obj2).intValue());
            }
        };
        Flags.BooleanFlagField booleanFlagField35 = Flags.f66031R;
        booleanFlagField35.getClass();
        f65086e0 = new BooleanFlagDelegate(attributes$isNullCheckPredicate$2, new FlagImpl(booleanFlagField35));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ClassKind m89972a(@NotNull KmClass kmClass) {
        kmClass.getClass();
        return (ClassKind) f65092k.m90097a(kmClass, f65077a[9]);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m89973b(@NotNull KmClass kmClass) {
        kmClass.getClass();
        return f65097p.m90095a(kmClass, f65077a[14]);
    }
}
