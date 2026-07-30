package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class mwd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedMemberScope.OptimizedImplementation f136044a;

    /* JADX INFO: renamed from: b */
    public final DeserializedMemberScope f136045b;

    public mwd(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f136044a = optimizedImplementation;
        this.f136045b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.m92369p(this.f136044a, this.f136045b);
    }
}
