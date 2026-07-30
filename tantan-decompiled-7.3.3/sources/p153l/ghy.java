package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class ghy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f104177a;

    /* JADX INFO: renamed from: b */
    public final MessageLite f104178b;

    /* JADX INFO: renamed from: c */
    public final AnnotatedCallableKind f104179c;

    public ghy(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f104177a = memberDeserializer;
        this.f104178b = messageLite;
        this.f104179c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93107s(this.f104177a, this.f104178b, this.f104179c);
    }
}
