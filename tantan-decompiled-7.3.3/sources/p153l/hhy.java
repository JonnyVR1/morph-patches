package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* JADX INFO: loaded from: classes2.dex */
public class hhy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f109947a;

    /* JADX INFO: renamed from: b */
    public final ProtoContainer f109948b;

    /* JADX INFO: renamed from: c */
    public final MessageLite f109949c;

    /* JADX INFO: renamed from: d */
    public final AnnotatedCallableKind f109950d;

    /* JADX INFO: renamed from: e */
    public final int f109951e;

    /* JADX INFO: renamed from: f */
    public final ProtoBuf.ValueParameter f109952f;

    public hhy(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        this.f109947a = memberDeserializer;
        this.f109948b = protoContainer;
        this.f109949c = messageLite;
        this.f109950d = annotatedCallableKind;
        this.f109951e = i;
        this.f109952f = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93094F(this.f109947a, this.f109948b, this.f109949c, this.f109950d, this.f109951e, this.f109952f);
    }
}
