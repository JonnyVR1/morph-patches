package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KFunctionImpl;

/* JADX INFO: loaded from: classes2.dex */
public class pvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KFunctionImpl f151498a;

    /* JADX INFO: renamed from: b */
    public final String f151499b;

    public pvq(KFunctionImpl kFunctionImpl, String str) {
        this.f151498a = kFunctionImpl;
        this.f151499b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KFunctionImpl.m87850q0(this.f151498a, this.f151499b);
    }
}
