package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes2.dex */
public class kli implements Function1 {
    public static final kli INSTANCE = new kli();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(FindClassInModuleKt.m88510e((ClassId) obj));
    }
}
