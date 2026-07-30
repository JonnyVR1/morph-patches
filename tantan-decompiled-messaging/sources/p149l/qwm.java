package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class qwm implements Function1 {
    public static final qwm INSTANCE = new qwm();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntegerLiteralTypeConstructor.m91938q((KotlinType) obj);
    }
}
