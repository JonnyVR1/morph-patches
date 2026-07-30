package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public class ktq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f124607a;

    /* JADX INFO: renamed from: b */
    public final StorageManager f124608b;

    public ktq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        this.f124607a = jvmBuiltInsCustomizer;
        this.f124608b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.m88402o(this.f124607a, this.f124608b);
    }
}
