package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DescriptorRendererImpl$renderFlexibleType$3 extends FunctionReferenceImpl implements Function1<String, String> {
    public DescriptorRendererImpl$renderFlexibleType$3(Object obj) {
        super(1, obj, DescriptorRendererImpl.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        str.getClass();
        return ((DescriptorRendererImpl) this.receiver).m91615v0(str);
    }
}
