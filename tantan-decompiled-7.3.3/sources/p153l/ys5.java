package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class ys5 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final FqName f201371a;

    public ys5(FqName fqName) {
        this.f201371a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return CompositeAnnotations.m89541f(this.f201371a, (Annotations) obj);
    }
}
