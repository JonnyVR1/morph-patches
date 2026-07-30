package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class h9r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final Name f106622a;

    public h9r(Name name) {
        this.f106622a = name;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaStaticClassScope.m89832n0(this.f106622a, (MemberScope) obj);
    }
}
