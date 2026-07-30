package p149l;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class pvd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final List f151445a;

    public pvd(List list) {
        this.f151445a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.m92323B(this.f151445a);
    }
}
