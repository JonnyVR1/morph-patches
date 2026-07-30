package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class f1k implements Function0 {

    /* JADX INFO: renamed from: a */
    public final GivenFunctionsMemberScope f94103a;

    public f1k(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f94103a = givenFunctionsMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return GivenFunctionsMemberScope.m92056i(this.f94103a);
    }
}
