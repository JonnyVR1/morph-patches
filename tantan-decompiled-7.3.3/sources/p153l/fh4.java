package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class fh4 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeProjection f99007a;

    public fh4(TypeProjection typeProjection) {
        this.f99007a = typeProjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return CapturedTypeConstructorKt.m92793d(this.f99007a);
    }
}
