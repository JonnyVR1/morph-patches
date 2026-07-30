package p149l;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class lvq implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Function2 f130184a;

    public lvq(Function2 function2) {
        this.f130184a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return KDeclarationContainerImpl.m87815B(this.f130184a, obj, obj2);
    }
}
