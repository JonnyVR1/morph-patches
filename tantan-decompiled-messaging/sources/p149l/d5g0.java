package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;

/* JADX INFO: loaded from: classes2.dex */
public class d5g0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final SubstitutingScope f84535a;

    public d5g0(SubstitutingScope substitutingScope) {
        this.f84535a = substitutingScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return SubstitutingScope.m92077h(this.f84535a);
    }
}
