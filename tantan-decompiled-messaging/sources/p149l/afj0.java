package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class afj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final KotlinType f69177a;

    public afj0(KotlinType kotlinType) {
        this.f69177a = kotlinType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypedArrayValue.m91959c(this.f69177a, (ModuleDescriptor) obj);
    }
}
