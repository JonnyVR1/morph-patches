package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* JADX INFO: loaded from: classes2.dex */
public class naj implements Function1 {
    public static final naj INSTANCE = new naj();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(FunctionsKt.m93198a(obj));
    }
}
