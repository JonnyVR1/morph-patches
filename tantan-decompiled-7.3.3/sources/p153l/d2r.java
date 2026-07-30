package p153l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class d2r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeConstructor f84812a;

    /* JADX INFO: renamed from: b */
    public final List f84813b;

    /* JADX INFO: renamed from: c */
    public final TypeAttributes f84814c;

    /* JADX INFO: renamed from: d */
    public final boolean f84815d;

    public d2r(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z) {
        this.f84812a = typeConstructor;
        this.f84813b = list;
        this.f84814c = typeAttributes;
        this.f84815d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.m93526l(this.f84812a, this.f84813b, this.f84814c, this.f84815d, (KotlinTypeRefiner) obj);
    }
}
