package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class obe0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ScopesHolderForClass f146579a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypeRefiner f146580b;

    public obe0(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f146579a = scopesHolderForClass;
        this.f146580b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ScopesHolderForClass.m89479d(this.f146579a, this.f146580b);
    }
}
