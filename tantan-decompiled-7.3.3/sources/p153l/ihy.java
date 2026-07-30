package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* JADX INFO: loaded from: classes2.dex */
public class ihy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f115030a;

    /* JADX INFO: renamed from: b */
    public final ProtoContainer f115031b;

    /* JADX INFO: renamed from: c */
    public final MessageLite f115032c;

    /* JADX INFO: renamed from: d */
    public final AnnotatedCallableKind f115033d;

    /* JADX INFO: renamed from: e */
    public final int f115034e;

    /* JADX INFO: renamed from: f */
    public final ProtoBuf.ValueParameter f115035f;

    public ihy(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        this.f115030a = memberDeserializer;
        this.f115031b = protoContainer;
        this.f115032c = messageLite;
        this.f115033d = annotatedCallableKind;
        this.f115034e = i;
        this.f115035f = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93104l(this.f115030a, this.f115031b, this.f115032c, this.f115033d, this.f115034e, this.f115035f);
    }
}
