package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class zzm implements Function1 {

    /* JADX INFO: renamed from: a */
    public final IntersectionTypeConstructor f205809a;

    public zzm(IntersectionTypeConstructor intersectionTypeConstructor) {
        this.f205809a = intersectionTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.m92614m(this.f205809a, (KotlinTypeRefiner) obj);
    }
}
