package kotlin.reflect.jvm.internal.impl.p120km.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p120km.KmClass;
import kotlin.reflect.jvm.internal.impl.p120km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p120km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.p120km.KmType;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p120km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p120km.MemberKind;
import kotlin.reflect.jvm.internal.impl.p120km.Modality;
import kotlin.reflect.jvm.internal.impl.p120km.Visibility;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FlagDelegatesImplKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BooleanFlagDelegate<KmClass> m89207a(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$classBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmClass) obj).m89107i());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmClass) obj).m89117s(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BooleanFlagDelegate<KmConstructor> m89208b(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$constructorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmConstructor) obj).m89123c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmConstructor) obj).m89126f(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final BooleanFlagDelegate<KmFunction> m89209c(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$functionBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmFunction) obj).m89142e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmFunction) obj).m89147j(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <Node> EnumFlagDelegate<Node, MemberKind> m89210d(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.f65375q;
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
    public static final <Node> EnumFlagDelegate<Node, Modality> m89211e(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.f65363e;
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
    public static final BooleanFlagDelegate<KmPropertyAccessorAttributes> m89212f(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyAccessorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmPropertyAccessorAttributes) obj).m89168b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmPropertyAccessorAttributes) obj).m89169c(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final BooleanFlagDelegate<KmProperty> m89213g(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmProperty) obj).m89156g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmProperty) obj).m89162m(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final BooleanFlagDelegate<KmTypeAlias> m89214h(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeAliasBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmTypeAlias) obj).m89180b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmTypeAlias) obj).m89184f(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final BooleanFlagDelegate<KmType> m89215i(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmType) obj).m89173d());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmType) obj).m89176g(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final BooleanFlagDelegate<KmValueParameter> m89216j(@NotNull FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(new MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$valueParameterBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((KmValueParameter) obj).m89191b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((KmValueParameter) obj).m89193d(((Number) obj2).intValue());
            }
        }, flagImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <Node> EnumFlagDelegate<Node, Visibility> m89217k(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.f65362d;
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
