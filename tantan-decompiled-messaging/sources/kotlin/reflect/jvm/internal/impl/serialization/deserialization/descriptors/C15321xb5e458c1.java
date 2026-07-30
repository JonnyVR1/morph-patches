package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class C15321xb5e458c1 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Parser f66115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteArrayInputStream f66116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DeserializedMemberScope f66117c;

    public C15321xb5e458c1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.f66115a = parser;
        this.f66116b = byteArrayInputStream;
        this.f66117c = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessageLite invoke() {
        return (MessageLite) this.f66115a.mo91134a(this.f66116b, this.f66117c.m92359s().m92180c().m92159k());
    }
}
