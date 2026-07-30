package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
public class c5g0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeSubstitutor f79380a;

    public c5g0(TypeSubstitutor typeSubstitutor) {
        this.f79380a = typeSubstitutor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return SubstitutingScope.m92080n(this.f79380a);
    }
}
