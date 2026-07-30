package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* JADX INFO: loaded from: classes2.dex */
public class qnj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeParameterUpperBoundEraser f158494a;

    public qnj0(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f158494a = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeParameterUpperBoundEraser.m93638f(this.f158494a, (TypeParameterUpperBoundEraser.C15450a) obj);
    }
}
