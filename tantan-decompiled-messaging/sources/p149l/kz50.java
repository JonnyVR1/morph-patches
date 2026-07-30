package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes2.dex */
public class kz50 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SmartSet f125358a;

    public kz50(SmartSet smartSet) {
        this.f125358a = smartSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return OverridingUtilsKt.m91882c(this.f125358a, obj);
    }
}
