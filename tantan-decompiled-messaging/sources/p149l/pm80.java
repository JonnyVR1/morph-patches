package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes2.dex */
public class pm80 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f150199a;

    public pm80(PrimitiveType primitiveType) {
        this.f150199a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return PrimitiveType.typeFqName_delegate$lambda$0(this.f150199a);
    }
}
