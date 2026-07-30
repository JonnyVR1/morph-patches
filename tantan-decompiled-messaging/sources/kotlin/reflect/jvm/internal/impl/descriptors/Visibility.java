package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f64067a;

    /* JADX INFO: renamed from: b */
    public final boolean f64068b;

    public Visibility(@NotNull String str, boolean z) {
        str.getClass();
        this.f64067a = str;
        this.f64068b = z;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Integer mo88626a(@NotNull Visibility visibility) {
        visibility.getClass();
        return Visibilities.INSTANCE.m88623a(this, visibility);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo88625b() {
        return this.f64067a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88627c() {
        return this.f64068b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public Visibility mo88628d() {
        return this;
    }

    @NotNull
    public final String toString() {
        return mo88625b();
    }
}
