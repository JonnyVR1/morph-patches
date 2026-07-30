package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes2.dex */
public class qm80 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f155288a;

    public qm80(PrimitiveType primitiveType) {
        this.f155288a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return PrimitiveType.arrayTypeFqName_delegate$lambda$0(this.f155288a);
    }
}
