package kotlin.reflect.jvm.internal.impl.p124km.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p153l.ifd0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BooleanFlagDelegate<Node> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KMutableProperty1<Node, Integer> f65252a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FlagImpl f65253b;

    /* JADX INFO: renamed from: c */
    public final int f65254c;

    public BooleanFlagDelegate(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1, @NotNull FlagImpl flagImpl) {
        kMutableProperty1.getClass();
        flagImpl.getClass();
        this.f65252a = kMutableProperty1;
        this.f65253b = flagImpl;
        if (flagImpl.m90109a() == 1 && flagImpl.m90111c() == 1) {
            this.f65254c = 1 << flagImpl.m90110b();
        } else {
            ifd0.m139726a("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", flagImpl, " was passed");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90095a(Node node, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.f65253b.m90112d(this.f65252a.get(node).intValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m90096b(Node node, @NotNull KProperty<?> kProperty, boolean z) {
        kProperty.getClass();
        int iIntValue = this.f65252a.get(node).intValue();
        this.f65252a.set(node, Integer.valueOf(z ? iIntValue | this.f65254c : iIntValue & (~this.f65254c)));
    }
}
