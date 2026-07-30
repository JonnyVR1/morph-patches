package p149l;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class okq implements Function1 {

    /* JADX INFO: renamed from: a */
    public final KotlinVersion f144455a;

    public okq(KotlinVersion kotlinVersion) {
        this.f144455a = kotlinVersion;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JavaTypeEnhancementState.Companion.m89421c(this.f144455a, (FqName) obj);
    }
}
