package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KmPropertyAccessorAttributes {

    /* JADX INFO: renamed from: a */
    public int f64536a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmAnnotation> f64537b;

    public KmPropertyAccessorAttributes(int i) {
        this.f64536a = i;
        this.f64537b = new ArrayList(0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89167a() {
        return this.f64537b;
    }

    /* JADX INFO: renamed from: b */
    public final int m89168b() {
        return this.f64536a;
    }

    /* JADX INFO: renamed from: c */
    public final void m89169c(int i) {
        this.f64536a = i;
    }

    public KmPropertyAccessorAttributes() {
        this(0);
    }
}
