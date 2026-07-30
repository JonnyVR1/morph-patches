package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* JADX INFO: loaded from: classes2.dex */
public class l8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f126866a;

    /* JADX INFO: renamed from: b */
    public final ProtoContainer f126867b;

    /* JADX INFO: renamed from: c */
    public final MessageLite f126868c;

    /* JADX INFO: renamed from: d */
    public final AnnotatedCallableKind f126869d;

    /* JADX INFO: renamed from: e */
    public final int f126870e;

    /* JADX INFO: renamed from: f */
    public final ProtoBuf.ValueParameter f126871f;

    public l8y(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        this.f126866a = memberDeserializer;
        this.f126867b = protoContainer;
        this.f126868c = messageLite;
        this.f126869d = annotatedCallableKind;
        this.f126870e = i;
        this.f126871f = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92213l(this.f126866a, this.f126867b, this.f126868c, this.f126869d, this.f126870e, this.f126871f);
    }
}
