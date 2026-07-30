package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public class ftq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInClassDescriptorFactory f99253a;

    /* JADX INFO: renamed from: b */
    public final StorageManager f99254b;

    public ftq(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.f99253a = jvmBuiltInClassDescriptorFactory;
        this.f99254b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInClassDescriptorFactory.m88374h(this.f99253a, this.f99254b);
    }
}
