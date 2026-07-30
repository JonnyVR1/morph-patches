package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class i8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f112080a;

    /* JADX INFO: renamed from: b */
    public final boolean f112081b;

    /* JADX INFO: renamed from: c */
    public final ProtoBuf.Property f112082c;

    public i8y(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        this.f112080a = memberDeserializer;
        this.f112081b = z;
        this.f112082c = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92215q(this.f112080a, this.f112081b, this.f112082c);
    }
}
