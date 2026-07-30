package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Visibility f64695a;

    public DelegatedDescriptorVisibility(@NotNull Visibility visibility) {
        visibility.getClass();
        this.f64695a = visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    /* JADX INFO: renamed from: b */
    public Visibility mo89366b() {
        return this.f64695a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo89367c() {
        return mo89366b().mo89516b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    /* JADX INFO: renamed from: f */
    public DescriptorVisibility mo89368f() {
        DescriptorVisibility descriptorVisibilityM89382j = DescriptorVisibilities.m89382j(mo89366b().mo89519d());
        descriptorVisibilityM89382j.getClass();
        return descriptorVisibilityM89382j;
    }
}
