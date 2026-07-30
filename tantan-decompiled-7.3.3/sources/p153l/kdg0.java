package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
public class kdg0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeSubstitutor f125243a;

    public kdg0(TypeSubstitutor typeSubstitutor) {
        this.f125243a = typeSubstitutor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return SubstitutingScope.m92971n(this.f125243a);
    }
}
