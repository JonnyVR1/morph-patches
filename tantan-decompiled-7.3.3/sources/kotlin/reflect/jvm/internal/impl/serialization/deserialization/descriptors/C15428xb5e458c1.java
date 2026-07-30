package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class C15428xb5e458c1 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Parser f66789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteArrayInputStream f66790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DeserializedMemberScope f66791c;

    public C15428xb5e458c1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.f66789a = parser;
        this.f66790b = byteArrayInputStream;
        this.f66791c = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessageLite invoke() {
        return (MessageLite) this.f66789a.mo92025a(this.f66790b, this.f66791c.m93250s().m93071c().m93050k());
    }
}
