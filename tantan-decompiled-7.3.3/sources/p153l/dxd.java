package p153l;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class dxd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final List f91084a;

    public dxd(List list) {
        this.f91084a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.m93214B(this.f91084a);
    }
}
