package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;
import org.jetbrains.annotations.NotNull;
import p153l.bqf0;
import p153l.j350;
import p153l.mx40;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C15453a extends SimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeConstructor f66965b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<TypeProjection> f66966c;

    /* JADX INFO: renamed from: d */
    public final boolean f66967d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemberScope f66968e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Function1<KotlinTypeRefiner, SimpleType> f66969f;

    /* JADX WARN: Multi-variable type inference failed */
    public C15453a(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        this.f66965b = typeConstructor;
        this.f66966c = list;
        this.f66967d = z;
        this.f66968e = memberScope;
        this.f66969f = function1;
        if (!(mo90791n() instanceof ErrorScope) || (mo90791n() instanceof ThrowingScope)) {
            return;
        }
        StringBuilder sb = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
        sb.append(mo90791n());
        TypeConstructor typeConstructorMo92781G0 = mo92781G0();
        sb.append('\n');
        sb.append(typeConstructorMo92781G0);
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo92779E0() {
        return this.f66966c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo92780F0() {
        return TypeAttributes.Companion.m93600k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo92781G0() {
        return this.f66965b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return this.f66967d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo90858N0(boolean z) {
        if (z == mo90857H0()) {
            return this;
        }
        return z ? new j350(this) : new mx40(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo90785M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes.isEmpty() ? this : new bqf0(this, typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        SimpleType simpleTypeInvoke = this.f66969f.invoke(kotlinTypeRefiner);
        return simpleTypeInvoke == null ? this : simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return this.f66968e;
    }
}
