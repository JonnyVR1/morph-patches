package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes2.dex */
public class uu80 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f181048a;

    public uu80(PrimitiveType primitiveType) {
        this.f181048a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return PrimitiveType.arrayTypeFqName_delegate$lambda$0(this.f181048a);
    }
}
