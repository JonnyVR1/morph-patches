package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.lr20;
import p153l.mr20;
import p153l.nr20;
import p153l.or20;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeProjection f66980a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<? extends List<? extends UnwrappedType>> f66981b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final NewCapturedTypeConstructor f66982c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final TypeParameterDescriptor f66983d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f66984e;

    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection, @Nullable Function0<? extends List<? extends UnwrappedType>> function0, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        typeProjection.getClass();
        this.f66980a = typeProjection;
        this.f66981b = function0;
        this.f66982c = newCapturedTypeConstructor;
        this.f66983d = typeParameterDescriptor;
        this.f66984e = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new lr20(this));
    }

    /* JADX INFO: renamed from: h */
    public static final List m93814h(List list) {
        return list;
    }

    /* JADX INFO: renamed from: i */
    public static final List m93815i(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        Function0<? extends List<? extends UnwrappedType>> function0 = newCapturedTypeConstructor.f66981b;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final List m93820q(List list) {
        return list;
    }

    /* JADX INFO: renamed from: s */
    public static final List m93821s(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        List<UnwrappedType> listMo89569c = newCapturedTypeConstructor.mo89569c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo89569c, 10));
        Iterator<T> it = listMo89569c.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnwrappedType) it.next()).mo90784L0(kotlinTypeRefiner));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: d */
    public TypeProjection mo92785d() {
        return this.f66980a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo89207e() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m88377d(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f66982c;
        if (newCapturedTypeConstructor2 != null) {
            this = newCapturedTypeConstructor2;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f66982c;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return this == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        KotlinType type = mo92785d().getType();
        type.getClass();
        return TypeUtilsKt.m93985n(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo89208g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f66982c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<UnwrappedType> mo89569c() {
        List<UnwrappedType> listM93823o = m93823o();
        return listM93823o == null ? CollectionsKt.emptyList() : listM93823o;
    }

    /* JADX INFO: renamed from: o */
    public final List<UnwrappedType> m93823o() {
        return (List) this.f66984e.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m93824p(@NotNull List<? extends UnwrappedType> list) {
        list.getClass();
        this.f66981b = new nr20(list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection typeProjectionMo93556a = mo92785d().mo93556a(kotlinTypeRefiner);
        typeProjectionMo93556a.getClass();
        or20 or20Var = this.f66981b != null ? new or20(this, kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f66982c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(typeProjectionMo93556a, or20Var, newCapturedTypeConstructor, this.f66983d);
    }

    @NotNull
    public String toString() {
        return "CapturedType(" + mo92785d() + ')';
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection, @NotNull List<? extends UnwrappedType> list, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(typeProjection, new mr20(list), newCapturedTypeConstructor, null, 8, null);
        typeProjection.getClass();
        list.getClass();
    }
}
