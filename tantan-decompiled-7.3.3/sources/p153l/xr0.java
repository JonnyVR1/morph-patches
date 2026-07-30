package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public class xr0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final KotlinBuiltIns f195870a;

    public xr0(KotlinBuiltIns kotlinBuiltIns) {
        this.f195870a = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AnnotationUtilKt.m89528d(this.f195870a, (ModuleDescriptor) obj);
    }
}
