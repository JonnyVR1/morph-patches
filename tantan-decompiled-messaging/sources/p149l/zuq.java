package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class zuq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KotlinType f204873a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl.Data f204874b;

    /* JADX INFO: renamed from: c */
    public final KClassImpl f204875c;

    public zuq(KotlinType kotlinType, KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f204873a = kotlinType;
        this.f204874b = data;
        this.f204875c = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87775d0(this.f204873a, this.f204874b, this.f204875c);
    }
}
