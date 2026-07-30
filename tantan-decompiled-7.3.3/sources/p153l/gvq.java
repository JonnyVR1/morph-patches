package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public class gvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInClassDescriptorFactory f106670a;

    /* JADX INFO: renamed from: b */
    public final StorageManager f106671b;

    public gvq(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.f106670a = jvmBuiltInClassDescriptorFactory;
        this.f106671b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInClassDescriptorFactory.m89265h(this.f106670a, this.f106671b);
    }
}
