package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class ehy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f94092a;

    /* JADX INFO: renamed from: b */
    public final MessageLite f94093b;

    /* JADX INFO: renamed from: c */
    public final AnnotatedCallableKind f94094c;

    public ehy(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f94092a = memberDeserializer;
        this.f94093b = messageLite;
        this.f94094c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93105n(this.f94092a, this.f94093b, this.f94094c);
    }
}
