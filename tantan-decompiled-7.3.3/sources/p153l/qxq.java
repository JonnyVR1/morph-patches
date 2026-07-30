package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KFunctionImpl;

/* JADX INFO: loaded from: classes2.dex */
public class qxq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KFunctionImpl f160069a;

    /* JADX INFO: renamed from: b */
    public final String f160070b;

    public qxq(KFunctionImpl kFunctionImpl, String str) {
        this.f160069a = kFunctionImpl;
        this.f160070b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KFunctionImpl.m88741q0(this.f160069a, this.f160070b);
    }
}
