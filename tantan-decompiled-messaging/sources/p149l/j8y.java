package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class j8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f116825a;

    /* JADX INFO: renamed from: b */
    public final MessageLite f116826b;

    /* JADX INFO: renamed from: c */
    public final AnnotatedCallableKind f116827c;

    public j8y(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f116825a = memberDeserializer;
        this.f116826b = messageLite;
        this.f116827c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92216s(this.f116825a, this.f116826b, this.f116827c);
    }
}
