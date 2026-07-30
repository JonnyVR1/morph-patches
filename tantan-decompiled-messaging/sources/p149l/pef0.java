package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;

/* JADX INFO: loaded from: classes2.dex */
public class pef0 implements Function1 {
    public static final pef0 INSTANCE = new pef0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return SignatureEnhancement.m90080m((CallableMemberDescriptor) obj);
    }
}
