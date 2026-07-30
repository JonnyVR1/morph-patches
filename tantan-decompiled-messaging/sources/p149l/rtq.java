package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class rtq implements Function1 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f160988a;

    public rtq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f160988a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.m88391G(this.f160988a, (CallableMemberDescriptor) obj);
    }
}
