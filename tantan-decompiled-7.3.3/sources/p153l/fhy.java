package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class fhy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f99124a;

    /* JADX INFO: renamed from: b */
    public final boolean f99125b;

    /* JADX INFO: renamed from: c */
    public final ProtoBuf.Property f99126c;

    public fhy(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        this.f99124a = memberDeserializer;
        this.f99125b = z;
        this.f99126c = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93106q(this.f99124a, this.f99125b, this.f99126c);
    }
}
