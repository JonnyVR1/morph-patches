package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class kwd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DeserializedMemberScope.OptimizedImplementation f124972a;

    public kwd(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        this.f124972a = optimizedImplementation;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedMemberScope.OptimizedImplementation.m92371s(this.f124972a, (Name) obj);
    }
}
