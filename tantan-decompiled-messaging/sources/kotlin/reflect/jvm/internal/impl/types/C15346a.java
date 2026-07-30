package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;
import org.jetbrains.annotations.NotNull;
import p149l.shf0;
import p149l.uu40;
import p149l.yo40;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C15346a extends SimpleType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeConstructor f66291b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<TypeProjection> f66292c;

    /* JADX INFO: renamed from: d */
    public final boolean f66293d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemberScope f66294e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Function1<KotlinTypeRefiner, SimpleType> f66295f;

    /* JADX WARN: Multi-variable type inference failed */
    public C15346a(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        this.f66291b = typeConstructor;
        this.f66292c = list;
        this.f66293d = z;
        this.f66294e = memberScope;
        this.f66295f = function1;
        if (!(mo89900n() instanceof ErrorScope) || (mo89900n() instanceof ThrowingScope)) {
            return;
        }
        StringBuilder sb = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
        sb.append(mo89900n());
        TypeConstructor typeConstructorMo91890G0 = mo91890G0();
        sb.append('\n');
        sb.append(typeConstructorMo91890G0);
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo91888E0() {
        return this.f66292c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return TypeAttributes.Companion.m92709k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo91890G0() {
        return this.f66291b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return this.f66293d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89967N0(boolean z) {
        if (z == mo89966H0()) {
            return this;
        }
        return z ? new uu40(this) : new yo40(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes.isEmpty() ? this : new shf0(this, typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        SimpleType simpleTypeInvoke = this.f66295f.invoke(kotlinTypeRefiner);
        return simpleTypeInvoke == null ? this : simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return this.f66294e;
    }
}
