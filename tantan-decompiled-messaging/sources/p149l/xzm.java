package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class xzm implements Function1 {

    /* JADX INFO: renamed from: a */
    public final Function1 f195209a;

    public xzm(Function1 function1) {
        this.f195209a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.m92617r(this.f195209a, (KotlinType) obj);
    }
}
