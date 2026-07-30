package p153l;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class mxq implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Function2 f139261a;

    public mxq(Function2 function2) {
        this.f139261a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return KDeclarationContainerImpl.m88706B(this.f139261a, obj, obj2);
    }
}
