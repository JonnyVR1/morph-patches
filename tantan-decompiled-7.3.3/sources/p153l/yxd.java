package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class yxd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DeserializedMemberScope.OptimizedImplementation f201961a;

    public yxd(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        this.f201961a = optimizedImplementation;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedMemberScope.OptimizedImplementation.m93262s(this.f201961a, (Name) obj);
    }
}
