package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f64741a;

    /* JADX INFO: renamed from: b */
    public final boolean f64742b;

    public Visibility(@NotNull String str, boolean z) {
        str.getClass();
        this.f64741a = str;
        this.f64742b = z;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Integer mo89517a(@NotNull Visibility visibility) {
        visibility.getClass();
        return Visibilities.INSTANCE.m89514a(this, visibility);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo89516b() {
        return this.f64741a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89518c() {
        return this.f64742b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public Visibility mo89519d() {
        return this;
    }

    @NotNull
    public final String toString() {
        return mo89516b();
    }
}
