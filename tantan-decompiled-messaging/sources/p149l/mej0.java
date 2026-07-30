package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* JADX INFO: loaded from: classes2.dex */
public class mej0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeParameterUpperBoundEraser f133429a;

    public mej0(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f133429a = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeParameterUpperBoundEraser.m92747f(this.f133429a, (TypeParameterUpperBoundEraser.C15343a) obj);
    }
}
