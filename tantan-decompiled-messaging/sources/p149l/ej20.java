package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* JADX INFO: loaded from: classes2.dex */
public class ej20 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final NewCapturedTypeConstructor f91660a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypeRefiner f91661b;

    public ej20(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f91660a = newCapturedTypeConstructor;
        this.f91661b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.m92930s(this.f91660a, this.f91661b);
    }
}
