package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class dhy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f88566a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f88567b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f88568c;

    public dhy(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f88566a = memberDeserializer;
        this.f88567b = property;
        this.f88568c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93092B(this.f88566a, this.f88567b, this.f88568c);
    }
}
