package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class ur5 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final FqName f177807a;

    public ur5(FqName fqName) {
        this.f177807a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return CompositeAnnotations.m88650f(this.f177807a, (Annotations) obj);
    }
}
