package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class ayd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedMemberScope.OptimizedImplementation f73963a;

    /* JADX INFO: renamed from: b */
    public final DeserializedMemberScope f73964b;

    public ayd(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f73963a = optimizedImplementation;
        this.f73964b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.m93260p(this.f73963a, this.f73964b);
    }
}
