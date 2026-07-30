package p149l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class d0r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeConstructor f83205a;

    /* JADX INFO: renamed from: b */
    public final List f83206b;

    /* JADX INFO: renamed from: c */
    public final TypeAttributes f83207c;

    /* JADX INFO: renamed from: d */
    public final boolean f83208d;

    /* JADX INFO: renamed from: e */
    public final MemberScope f83209e;

    public d0r(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z, MemberScope memberScope) {
        this.f83205a = typeConstructor;
        this.f83206b = list;
        this.f83207c = typeAttributes;
        this.f83208d = z;
        this.f83209e = memberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.m92638o(this.f83205a, this.f83206b, this.f83207c, this.f83208d, this.f83209e, (KotlinTypeRefiner) obj);
    }
}
