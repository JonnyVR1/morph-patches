package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;

/* JADX INFO: loaded from: classes2.dex */
public class xmf0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ValueParameterDescriptor f195080a;

    public xmf0(ValueParameterDescriptor valueParameterDescriptor) {
        this.f195080a = valueParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return SignatureEnhancement.m90972n(this.f195080a, (CallableMemberDescriptor) obj);
    }
}
