package kotlin.reflect.jvm.internal.impl.p120km.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p149l.f7d0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BooleanFlagDelegate<Node> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KMutableProperty1<Node, Integer> f64578a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FlagImpl f64579b;

    /* JADX INFO: renamed from: c */
    public final int f64580c;

    public BooleanFlagDelegate(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1, @NotNull FlagImpl flagImpl) {
        kMutableProperty1.getClass();
        flagImpl.getClass();
        this.f64578a = kMutableProperty1;
        this.f64579b = flagImpl;
        if (flagImpl.m89218a() == 1 && flagImpl.m89220c() == 1) {
            this.f64580c = 1 << flagImpl.m89219b();
        } else {
            f7d0.m119786a("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", flagImpl, " was passed");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89204a(Node node, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.f64579b.m89221d(this.f64578a.get(node).intValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m89205b(Node node, @NotNull KProperty<?> kProperty, boolean z) {
        kProperty.getClass();
        int iIntValue = this.f64578a.get(node).intValue();
        this.f64578a.set(node, Integer.valueOf(z ? iIntValue | this.f64580c : iIntValue & (~this.f64580c)));
    }
}
