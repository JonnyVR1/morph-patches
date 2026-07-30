package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KmPropertyAccessorAttributes {

    /* JADX INFO: renamed from: a */
    public int f65210a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmAnnotation> f65211b;

    public KmPropertyAccessorAttributes(int i) {
        this.f65210a = i;
        this.f65211b = new ArrayList(0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90058a() {
        return this.f65211b;
    }

    /* JADX INFO: renamed from: b */
    public final int m90059b() {
        return this.f65210a;
    }

    /* JADX INFO: renamed from: c */
    public final void m90060c(int i) {
        this.f65210a = i;
    }

    public KmPropertyAccessorAttributes() {
        this(0);
    }
}
