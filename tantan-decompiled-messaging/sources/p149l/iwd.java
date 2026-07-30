package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class iwd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedMemberScope.C15323b f115263a;

    /* JADX INFO: renamed from: b */
    public final DeserializedMemberScope f115264b;

    public iwd(DeserializedMemberScope.C15323b c15323b, DeserializedMemberScope deserializedMemberScope) {
        this.f115263a = c15323b;
        this.f115264b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.C15323b.m92392P(this.f115263a, this.f115264b);
    }
}
