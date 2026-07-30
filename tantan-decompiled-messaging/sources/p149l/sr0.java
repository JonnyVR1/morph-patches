package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public class sr0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final KotlinBuiltIns f166033a;

    public sr0(KotlinBuiltIns kotlinBuiltIns) {
        this.f166033a = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AnnotationUtilKt.m88637d(this.f166033a, (ModuleDescriptor) obj);
    }
}
