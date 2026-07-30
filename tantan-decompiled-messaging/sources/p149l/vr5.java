package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;

/* JADX INFO: loaded from: classes2.dex */
public class vr5 implements Function1 {
    public static final vr5 INSTANCE = new vr5();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return CompositeAnnotations.m88651g((Annotations) obj);
    }
}
