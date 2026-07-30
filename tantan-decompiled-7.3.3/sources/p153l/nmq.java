package p153l;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class nmq implements Function1 {

    /* JADX INFO: renamed from: a */
    public final KotlinVersion f142734a;

    public nmq(KotlinVersion kotlinVersion) {
        this.f142734a = kotlinVersion;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JavaTypeEnhancementState.Companion.m90312c(this.f142734a, (FqName) obj);
    }
}
