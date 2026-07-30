package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes2.dex */
public class p760 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SmartSet f150900a;

    public p760(SmartSet smartSet) {
        this.f150900a = smartSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return OverridingUtilsKt.m92773c(this.f150900a, obj);
    }
}
