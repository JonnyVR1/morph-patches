package p153l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class e2r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeConstructor f91828a;

    /* JADX INFO: renamed from: b */
    public final List f91829b;

    /* JADX INFO: renamed from: c */
    public final TypeAttributes f91830c;

    /* JADX INFO: renamed from: d */
    public final boolean f91831d;

    /* JADX INFO: renamed from: e */
    public final MemberScope f91832e;

    public e2r(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z, MemberScope memberScope) {
        this.f91828a = typeConstructor;
        this.f91829b = list;
        this.f91830c = typeAttributes;
        this.f91831d = z;
        this.f91832e = memberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.m93529o(this.f91828a, this.f91829b, this.f91830c, this.f91831d, this.f91832e, (KotlinTypeRefiner) obj);
    }
}
