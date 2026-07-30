package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class k3e0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ScopesHolderForClass f120819a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypeRefiner f120820b;

    public k3e0(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f120819a = scopesHolderForClass;
        this.f120820b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ScopesHolderForClass.m88588d(this.f120819a, this.f120820b);
    }
}
