package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class nwd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedMemberScope.OptimizedImplementation f140939a;

    /* JADX INFO: renamed from: b */
    public final DeserializedMemberScope f140940b;

    public nwd(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f140939a = optimizedImplementation;
        this.f140940b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.m92373u(this.f140939a, this.f140940b);
    }
}
