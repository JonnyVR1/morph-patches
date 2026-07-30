package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public class lvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f133725a;

    /* JADX INFO: renamed from: b */
    public final StorageManager f133726b;

    public lvq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        this.f133725a = jvmBuiltInsCustomizer;
        this.f133726b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.m89293o(this.f133725a, this.f133726b);
    }
}
