package kotlin.reflect.jvm.internal.impl.p120km;

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
import kotlin.reflect.jvm.internal.impl.p120km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.p120km.internal.EnumFlagDelegate;
import kotlin.reflect.jvm.internal.impl.p120km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.p120km.internal.FlagImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@JvmName
@SourceDebugExtension
public final class Attributes {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final BooleanFlagDelegate f64377A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final BooleanFlagDelegate f64378B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public static final BooleanFlagDelegate f64379C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public static final BooleanFlagDelegate f64380D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final BooleanFlagDelegate f64381E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public static final BooleanFlagDelegate f64382F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public static final EnumFlagDelegate f64383G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public static final EnumFlagDelegate f64384H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final EnumFlagDelegate f64385I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public static final BooleanFlagDelegate f64386J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public static final BooleanFlagDelegate f64387K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public static final BooleanFlagDelegate f64388L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public static final BooleanFlagDelegate f64389M;

    /* JADX INFO: renamed from: N */
    @NotNull
    public static final BooleanFlagDelegate f64390N;

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final BooleanFlagDelegate f64391O;

    /* JADX INFO: renamed from: P */
    @NotNull
    public static final BooleanFlagDelegate f64392P;

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static final EnumFlagDelegate f64393Q;

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final EnumFlagDelegate f64394R;

    /* JADX INFO: renamed from: S */
    @NotNull
    public static final BooleanFlagDelegate f64395S;

    /* JADX INFO: renamed from: T */
    @NotNull
    public static final BooleanFlagDelegate f64396T;

    /* JADX INFO: renamed from: U */
    @NotNull
    public static final BooleanFlagDelegate f64397U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final BooleanFlagDelegate f64398V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final BooleanFlagDelegate f64399W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final BooleanFlagDelegate f64400X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final BooleanFlagDelegate f64401Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final EnumFlagDelegate f64402Z;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty<Object>[] f64403a = {Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1)), Reflection.m87510e(new MutablePropertyReference1Impl(Attributes.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final BooleanFlagDelegate f64404a0;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final BooleanFlagDelegate f64405b;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final BooleanFlagDelegate f64406b0;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final BooleanFlagDelegate f64407c;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final BooleanFlagDelegate f64408c0;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final BooleanFlagDelegate f64409d;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final BooleanFlagDelegate f64410d0;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final BooleanFlagDelegate f64411e;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final BooleanFlagDelegate f64412e0;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final BooleanFlagDelegate f64413f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final BooleanFlagDelegate f64414g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final BooleanFlagDelegate f64415h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final EnumFlagDelegate f64416i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final EnumFlagDelegate f64417j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final EnumFlagDelegate f64418k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final BooleanFlagDelegate f64419l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final BooleanFlagDelegate f64420m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final BooleanFlagDelegate f64421n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final BooleanFlagDelegate f64422o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final BooleanFlagDelegate f64423p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final BooleanFlagDelegate f64424q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final BooleanFlagDelegate f64425r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final EnumFlagDelegate f64426s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final BooleanFlagDelegate f64427t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final BooleanFlagDelegate f64428u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final EnumFlagDelegate f64429v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final EnumFlagDelegate f64430w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final EnumFlagDelegate f64431x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final BooleanFlagDelegate f64432y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final BooleanFlagDelegate f64433z;

    static {
        Flags.BooleanFlagField booleanFlagField = Flags.f65361c;
        booleanFlagField.getClass();
        f64405b = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f64407c = FlagDelegatesImplKt.m89208b(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f64409d = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f64411e = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f64413f = FlagDelegatesImplKt.m89212f(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f64414g = FlagDelegatesImplKt.m89216j(new FlagImpl(booleanFlagField));
        booleanFlagField.getClass();
        f64415h = FlagDelegatesImplKt.m89214h(new FlagImpl(booleanFlagField));
        f64416i = FlagDelegatesImplKt.m89211e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89107i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m89117s(((Number) obj2).intValue());
            }
        });
        f64417j = FlagDelegatesImplKt.m89217k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89107i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m89117s(((Number) obj2).intValue());
            }
        });
        Attributes$kind$2 attributes$kind$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89107i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m89117s(((Number) obj2).intValue());
            }
        };
        Flags.FlagField<ProtoBuf.Class.Kind> flagField = Flags.f65364f;
        flagField.getClass();
        EnumEntries<ClassKind> entries = ClassKind.getEntries();
        EnumEntries<ClassKind> entries2 = ClassKind.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<ClassKind> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        f64418k = new EnumFlagDelegate(attributes$kind$2, flagField, entries, arrayList);
        Flags.BooleanFlagField booleanFlagField2 = Flags.f65365g;
        booleanFlagField2.getClass();
        f64419l = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField2));
        Flags.BooleanFlagField booleanFlagField3 = Flags.f65366h;
        booleanFlagField3.getClass();
        f64420m = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField3));
        Flags.BooleanFlagField booleanFlagField4 = Flags.f65367i;
        booleanFlagField4.getClass();
        f64421n = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField4));
        Flags.BooleanFlagField booleanFlagField5 = Flags.f65368j;
        booleanFlagField5.getClass();
        f64422o = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField5));
        Flags.BooleanFlagField booleanFlagField6 = Flags.f65369k;
        booleanFlagField6.getClass();
        f64423p = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField6));
        Flags.BooleanFlagField booleanFlagField7 = Flags.f65370l;
        booleanFlagField7.getClass();
        f64424q = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField7));
        Flags.BooleanFlagField booleanFlagField8 = Flags.f65371m;
        booleanFlagField8.getClass();
        f64425r = FlagDelegatesImplKt.m89207a(new FlagImpl(booleanFlagField8));
        f64426s = FlagDelegatesImplKt.m89217k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmConstructor) obj).m89123c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmConstructor) obj).m89126f(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField9 = Flags.f65372n;
        booleanFlagField9.getClass();
        f64427t = FlagDelegatesImplKt.m89208b(new FlagImpl(booleanFlagField9));
        Flags.BooleanFlagField booleanFlagField10 = Flags.f65373o;
        booleanFlagField10.getClass();
        f64428u = FlagDelegatesImplKt.m89208b(new FlagImpl(booleanFlagField10));
        f64429v = FlagDelegatesImplKt.m89210d(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m89142e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m89147j(((Number) obj2).intValue());
            }
        });
        f64430w = FlagDelegatesImplKt.m89217k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m89142e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m89147j(((Number) obj2).intValue());
            }
        });
        f64431x = FlagDelegatesImplKt.m89211e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m89142e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m89147j(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField11 = Flags.f65376r;
        booleanFlagField11.getClass();
        f64432y = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField11));
        Flags.BooleanFlagField booleanFlagField12 = Flags.f65377s;
        booleanFlagField12.getClass();
        f64433z = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField12));
        Flags.BooleanFlagField booleanFlagField13 = Flags.f65378t;
        booleanFlagField13.getClass();
        f64377A = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField13));
        Flags.BooleanFlagField booleanFlagField14 = Flags.f65379u;
        booleanFlagField14.getClass();
        f64378B = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField14));
        Flags.BooleanFlagField booleanFlagField15 = Flags.f65380v;
        booleanFlagField15.getClass();
        f64379C = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField15));
        Flags.BooleanFlagField booleanFlagField16 = Flags.f65381w;
        booleanFlagField16.getClass();
        f64380D = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField16));
        Flags.BooleanFlagField booleanFlagField17 = Flags.f65382x;
        booleanFlagField17.getClass();
        f64381E = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField17));
        Flags.BooleanFlagField booleanFlagField18 = Flags.f65383y;
        booleanFlagField18.getClass();
        f64382F = FlagDelegatesImplKt.m89209c(new FlagImpl(booleanFlagField18));
        f64383G = FlagDelegatesImplKt.m89217k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m89156g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m89162m(((Number) obj2).intValue());
            }
        });
        f64384H = FlagDelegatesImplKt.m89211e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m89156g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m89162m(((Number) obj2).intValue());
            }
        });
        f64385I = FlagDelegatesImplKt.m89210d(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$11
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m89156g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m89162m(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField19 = Flags.f65340A;
        booleanFlagField19.getClass();
        f64386J = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField19));
        Flags.BooleanFlagField booleanFlagField20 = Flags.f65343D;
        booleanFlagField20.getClass();
        f64387K = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField20));
        Flags.BooleanFlagField booleanFlagField21 = Flags.f65344E;
        booleanFlagField21.getClass();
        f64388L = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField21));
        Flags.BooleanFlagField booleanFlagField22 = Flags.f65345F;
        booleanFlagField22.getClass();
        f64389M = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField22));
        Flags.BooleanFlagField booleanFlagField23 = Flags.f65346G;
        booleanFlagField23.getClass();
        f64390N = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField23));
        Flags.BooleanFlagField booleanFlagField24 = Flags.f65347H;
        booleanFlagField24.getClass();
        f64391O = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField24));
        Flags.BooleanFlagField booleanFlagField25 = Flags.f65348I;
        booleanFlagField25.getClass();
        f64392P = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField25));
        f64393Q = FlagDelegatesImplKt.m89217k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).m89168b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).m89169c(((Number) obj2).intValue());
            }
        });
        f64394R = FlagDelegatesImplKt.m89211e(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).m89168b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).m89169c(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField26 = Flags.f65353N;
        booleanFlagField26.getClass();
        f64395S = FlagDelegatesImplKt.m89212f(new FlagImpl(booleanFlagField26));
        Flags.BooleanFlagField booleanFlagField27 = Flags.f65354O;
        booleanFlagField27.getClass();
        f64396T = FlagDelegatesImplKt.m89212f(new FlagImpl(booleanFlagField27));
        Flags.BooleanFlagField booleanFlagField28 = Flags.f65355P;
        booleanFlagField28.getClass();
        f64397U = FlagDelegatesImplKt.m89212f(new FlagImpl(booleanFlagField28));
        f64398V = FlagDelegatesImplKt.m89215i(new FlagImpl(0, 1, 1));
        Flags.BooleanFlagField booleanFlagField29 = Flags.f65359a;
        f64399W = FlagDelegatesImplKt.m89215i(new FlagImpl(booleanFlagField29.f65385a + 1, booleanFlagField29.f65386b, 1));
        Flags.BooleanFlagField booleanFlagField30 = Flags.f65360b;
        f64400X = FlagDelegatesImplKt.m89215i(new FlagImpl(booleanFlagField30.f65385a + 1, booleanFlagField30.f65386b, 1));
        f64401Y = new BooleanFlagDelegate(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isReified$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeParameter) obj).m89187b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeParameter) obj).m89189d(((Number) obj2).intValue());
            }
        }, new FlagImpl(0, 1, 1));
        f64402Z = FlagDelegatesImplKt.m89217k(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeAlias) obj).m89180b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeAlias) obj).m89184f(((Number) obj2).intValue());
            }
        });
        Flags.BooleanFlagField booleanFlagField31 = Flags.f65350K;
        booleanFlagField31.getClass();
        f64404a0 = FlagDelegatesImplKt.m89216j(new FlagImpl(booleanFlagField31));
        Flags.BooleanFlagField booleanFlagField32 = Flags.f65351L;
        booleanFlagField32.getClass();
        f64406b0 = FlagDelegatesImplKt.m89216j(new FlagImpl(booleanFlagField32));
        Flags.BooleanFlagField booleanFlagField33 = Flags.f65352M;
        booleanFlagField33.getClass();
        f64408c0 = FlagDelegatesImplKt.m89216j(new FlagImpl(booleanFlagField33));
        Attributes$isNegated$2 attributes$isNegated$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmEffectExpression) obj).m89131b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmEffectExpression) obj).m89134e(((Number) obj2).intValue());
            }
        };
        Flags.BooleanFlagField booleanFlagField34 = Flags.f65356Q;
        booleanFlagField34.getClass();
        f64410d0 = new BooleanFlagDelegate(attributes$isNegated$2, new FlagImpl(booleanFlagField34));
        Attributes$isNullCheckPredicate$2 attributes$isNullCheckPredicate$2 = new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmEffectExpression) obj).m89131b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmEffectExpression) obj).m89134e(((Number) obj2).intValue());
            }
        };
        Flags.BooleanFlagField booleanFlagField35 = Flags.f65357R;
        booleanFlagField35.getClass();
        f64412e0 = new BooleanFlagDelegate(attributes$isNullCheckPredicate$2, new FlagImpl(booleanFlagField35));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ClassKind m89081a(@NotNull KmClass kmClass) {
        kmClass.getClass();
        return (ClassKind) f64418k.m89206a(kmClass, f64403a[9]);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m89082b(@NotNull KmClass kmClass) {
        kmClass.getClass();
        return f64423p.m89204a(kmClass, f64403a[14]);
    }
}
