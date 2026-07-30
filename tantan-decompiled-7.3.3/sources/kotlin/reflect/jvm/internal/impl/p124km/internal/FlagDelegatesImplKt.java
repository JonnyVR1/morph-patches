package kotlin.reflect.jvm.internal.impl.p124km.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p124km.KmClass;
import kotlin.reflect.jvm.internal.impl.p124km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p124km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p124km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p124km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.p124km.KmType;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p124km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p124km.MemberKind;
import kotlin.reflect.jvm.internal.impl.p124km.Modality;
import kotlin.reflect.jvm.internal.impl.p124km.Visibility;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FlagDelegatesImplKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BooleanFlagDelegate<KmClass> m90098a(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$classBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89998i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m90008s(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BooleanFlagDelegate<KmConstructor> m90099b(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$constructorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmConstructor) obj).m90014c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmConstructor) obj).m90017f(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final BooleanFlagDelegate<KmFunction> m90100c(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$functionBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m90033e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m90038j(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <Node> EnumFlagDelegate<Node, MemberKind> m90101d(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.f66049q;
        flagField.getClass();
        EnumEntries<MemberKind> entries = MemberKind.getEntries();
        EnumEntries<MemberKind> entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<MemberKind> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <Node> EnumFlagDelegate<Node, Modality> m90102e(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.f66037e;
        flagField.getClass();
        EnumEntries<Modality> entries = Modality.getEntries();
        EnumEntries<Modality> entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<Modality> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final BooleanFlagDelegate<KmPropertyAccessorAttributes> m90103f(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyAccessorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).m90059b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).m90060c(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final BooleanFlagDelegate<KmProperty> m90104g(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m90047g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m90053m(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final BooleanFlagDelegate<KmTypeAlias> m90105h(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeAliasBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeAlias) obj).m90071b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeAlias) obj).m90075f(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final BooleanFlagDelegate<KmType> m90106i(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmType) obj).m90064d());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmType) obj).m90067g(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final BooleanFlagDelegate<KmValueParameter> m90107j(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$valueParameterBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmValueParameter) obj).m90082b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmValueParameter) obj).m90084d(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <Node> EnumFlagDelegate<Node, Visibility> m90108k(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.f66036d;
        flagField.getClass();
        EnumEntries<Visibility> entries = Visibility.getEntries();
        EnumEntries<Visibility> entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<Visibility> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }
}
