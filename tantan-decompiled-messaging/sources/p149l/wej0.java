package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class wej0 implements Function1 {
    public static final wej0 INSTANCE = new wej0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeUtilsKt.m93080F((UnwrappedType) obj));
    }
}
