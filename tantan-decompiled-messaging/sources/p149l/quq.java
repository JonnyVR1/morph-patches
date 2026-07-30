package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class quq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl f156532a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl.Data f156533b;

    public quq(KClassImpl kClassImpl, KClassImpl.Data data) {
        this.f156532a = kClassImpl;
        this.f156533b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87771a0(this.f156532a, this.f156533b);
    }
}
