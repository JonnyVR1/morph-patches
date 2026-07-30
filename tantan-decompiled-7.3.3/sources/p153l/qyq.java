package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class qyq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Getter f160179a;

    public qyq(KPropertyImpl.Getter getter) {
        this.f160179a = getter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Getter.m88840d0(this.f160179a);
    }
}
