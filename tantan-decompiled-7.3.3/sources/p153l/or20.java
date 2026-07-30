package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* JADX INFO: loaded from: classes2.dex */
public class or20 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final NewCapturedTypeConstructor f148669a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypeRefiner f148670b;

    public or20(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f148669a = newCapturedTypeConstructor;
        this.f148670b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.m93821s(this.f148669a, this.f148670b);
    }
}
