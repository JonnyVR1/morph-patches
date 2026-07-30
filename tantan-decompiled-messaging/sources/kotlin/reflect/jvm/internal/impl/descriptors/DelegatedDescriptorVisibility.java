package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Visibility f64021a;

    public DelegatedDescriptorVisibility(@NotNull Visibility visibility) {
        visibility.getClass();
        this.f64021a = visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    /* JADX INFO: renamed from: b */
    public Visibility mo88475b() {
        return this.f64021a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo88476c() {
        return mo88475b().mo88625b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    /* JADX INFO: renamed from: f */
    public DescriptorVisibility mo88477f() {
        DescriptorVisibility descriptorVisibilityM88491j = DescriptorVisibilities.m88491j(mo88475b().mo88628d());
        descriptorVisibilityM88491j.getClass();
        return descriptorVisibilityM88491j;
    }
}
