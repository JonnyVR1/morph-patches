package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class h8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f106483a;

    /* JADX INFO: renamed from: b */
    public final MessageLite f106484b;

    /* JADX INFO: renamed from: c */
    public final AnnotatedCallableKind f106485c;

    public h8y(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f106483a = memberDeserializer;
        this.f106484b = messageLite;
        this.f106485c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92214n(this.f106483a, this.f106484b, this.f106485c);
    }
}
