package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class pwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Getter f151592a;

    public pwq(KPropertyImpl.Getter getter) {
        this.f151592a = getter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Getter.m87949d0(this.f151592a);
    }
}
