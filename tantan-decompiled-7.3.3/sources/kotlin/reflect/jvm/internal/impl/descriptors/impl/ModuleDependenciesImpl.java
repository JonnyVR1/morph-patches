package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<ModuleDescriptorImpl> f64895a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Set<ModuleDescriptorImpl> f64896b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<ModuleDescriptorImpl> f64897c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Set<ModuleDescriptorImpl> f64898d;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set, @NotNull List<ModuleDescriptorImpl> list2, @NotNull Set<ModuleDescriptorImpl> set2) {
        list.getClass();
        set.getClass();
        list2.getClass();
        set2.getClass();
        this.f64895a = list;
        this.f64896b = set;
        this.f64897c = list2;
        this.f64898d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<ModuleDescriptorImpl> mo89703a() {
        return this.f64897c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* JADX INFO: renamed from: b */
    public Set<ModuleDescriptorImpl> mo89704b() {
        return this.f64896b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<ModuleDescriptorImpl> mo89705c() {
        return this.f64895a;
    }
}
