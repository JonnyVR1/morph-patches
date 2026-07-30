package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;

/* JADX INFO: loaded from: classes2.dex */
public class owd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DeserializedPackageFragmentImpl f146043a;

    public owd(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.f146043a = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedPackageFragmentImpl.m92194H0(this.f146043a, (ClassId) obj);
    }
}
