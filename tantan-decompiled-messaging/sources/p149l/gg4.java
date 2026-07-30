package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class gg4 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeProjection f102449a;

    public gg4(TypeProjection typeProjection) {
        this.f102449a = typeProjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return CapturedTypeConstructorKt.m91902d(this.f102449a);
    }
}
