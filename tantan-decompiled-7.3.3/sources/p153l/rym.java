package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class rym implements Function1 {
    public static final rym INSTANCE = new rym();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntegerLiteralTypeConstructor.m92829q((KotlinType) obj);
    }
}
