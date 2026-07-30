package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* JADX INFO: loaded from: classes2.dex */
public class k8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f121878a;

    /* JADX INFO: renamed from: b */
    public final ProtoContainer f121879b;

    /* JADX INFO: renamed from: c */
    public final MessageLite f121880c;

    /* JADX INFO: renamed from: d */
    public final AnnotatedCallableKind f121881d;

    /* JADX INFO: renamed from: e */
    public final int f121882e;

    /* JADX INFO: renamed from: f */
    public final ProtoBuf.ValueParameter f121883f;

    public k8y(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        this.f121878a = memberDeserializer;
        this.f121879b = protoContainer;
        this.f121880c = messageLite;
        this.f121881d = annotatedCallableKind;
        this.f121882e = i;
        this.f121883f = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92203F(this.f121878a, this.f121879b, this.f121880c, this.f121881d, this.f121882e, this.f121883f);
    }
}
