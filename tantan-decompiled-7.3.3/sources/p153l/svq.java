package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class svq implements Function1 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f170866a;

    public svq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f170866a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.m89282G(this.f170866a, (CallableMemberDescriptor) obj);
    }
}
