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
import p149l.bj20;
import p149l.cj20;
import p149l.dj20;
import p149l.ej20;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeProjection f66306a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<? extends List<? extends UnwrappedType>> f66307b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final NewCapturedTypeConstructor f66308c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final TypeParameterDescriptor f66309d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f66310e;

    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection, @Nullable Function0<? extends List<? extends UnwrappedType>> function0, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        typeProjection.getClass();
        this.f66306a = typeProjection;
        this.f66307b = function0;
        this.f66308c = newCapturedTypeConstructor;
        this.f66309d = typeParameterDescriptor;
        this.f66310e = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new bj20(this));
    }

    /* JADX INFO: renamed from: h */
    public static final List m92923h(List list) {
        return list;
    }

    /* JADX INFO: renamed from: i */
    public static final List m92924i(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        Function0<? extends List<? extends UnwrappedType>> function0 = newCapturedTypeConstructor.f66307b;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final List m92929q(List list) {
        return list;
    }

    /* JADX INFO: renamed from: s */
    public static final List m92930s(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        List<UnwrappedType> listMo88678c = newCapturedTypeConstructor.mo88678c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo88678c, 10));
        Iterator<T> it = listMo88678c.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnwrappedType) it.next()).mo89893L0(kotlinTypeRefiner));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: d */
    public TypeProjection mo91894d() {
        return this.f66306a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo88316e() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m87488d(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f66308c;
        if (newCapturedTypeConstructor2 != null) {
            this = newCapturedTypeConstructor2;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f66308c;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return this == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88679f() {
        KotlinType type = mo91894d().getType();
        type.getClass();
        return TypeUtilsKt.m93094n(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo88317g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f66308c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<UnwrappedType> mo88678c() {
        List<UnwrappedType> listM92932o = m92932o();
        return listM92932o == null ? CollectionsKt.emptyList() : listM92932o;
    }

    /* JADX INFO: renamed from: o */
    public final List<UnwrappedType> m92932o() {
        return (List) this.f66310e.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m92933p(@NotNull List<? extends UnwrappedType> list) {
        list.getClass();
        this.f66307b = new dj20(list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection typeProjectionMo92665a = mo91894d().mo92665a(kotlinTypeRefiner);
        typeProjectionMo92665a.getClass();
        ej20 ej20Var = this.f66307b != null ? new ej20(this, kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f66308c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(typeProjectionMo92665a, ej20Var, newCapturedTypeConstructor, this.f66309d);
    }

    @NotNull
    public String toString() {
        return "CapturedType(" + mo91894d() + ')';
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection, @NotNull List<? extends UnwrappedType> list, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(typeProjection, new cj20(list), newCapturedTypeConstructor, null, 8, null);
        typeProjection.getClass();
        list.getClass();
    }
}
