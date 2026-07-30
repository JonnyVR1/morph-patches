package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;

/* JADX INFO: loaded from: classes2.dex */
public class cyd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DeserializedPackageFragmentImpl f84352a;

    public cyd(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.f84352a = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedPackageFragmentImpl.m93085H0(this.f84352a, (ClassId) obj);
    }
}
