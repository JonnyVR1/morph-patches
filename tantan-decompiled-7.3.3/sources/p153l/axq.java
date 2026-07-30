package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class axq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KotlinType f73878a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl.Data f73879b;

    /* JADX INFO: renamed from: c */
    public final KClassImpl f73880c;

    public axq(KotlinType kotlinType, KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f73878a = kotlinType;
        this.f73879b = data;
        this.f73880c = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88666d0(this.f73878a, this.f73879b, this.f73880c);
    }
}
