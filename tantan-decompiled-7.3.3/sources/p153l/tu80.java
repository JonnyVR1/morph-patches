package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes2.dex */
public class tu80 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f176174a;

    public tu80(PrimitiveType primitiveType) {
        this.f176174a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return PrimitiveType.typeFqName_delegate$lambda$0(this.f176174a);
    }
}
