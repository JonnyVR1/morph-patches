package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class znj0 implements Function1 {
    public static final znj0 INSTANCE = new znj0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeUtilsKt.m93979h((UnwrappedType) obj));
    }
}
