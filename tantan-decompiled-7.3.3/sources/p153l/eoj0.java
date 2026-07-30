package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class eoj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final KotlinType f94934a;

    public eoj0(KotlinType kotlinType) {
        this.f94934a = kotlinType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypedArrayValue.m92850c(this.f94934a, (ModuleDescriptor) obj);
    }
}
