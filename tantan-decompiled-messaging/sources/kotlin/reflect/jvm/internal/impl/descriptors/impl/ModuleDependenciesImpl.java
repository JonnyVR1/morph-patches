package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<ModuleDescriptorImpl> f64221a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Set<ModuleDescriptorImpl> f64222b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<ModuleDescriptorImpl> f64223c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Set<ModuleDescriptorImpl> f64224d;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set, @NotNull List<ModuleDescriptorImpl> list2, @NotNull Set<ModuleDescriptorImpl> set2) {
        list.getClass();
        set.getClass();
        list2.getClass();
        set2.getClass();
        this.f64221a = list;
        this.f64222b = set;
        this.f64223c = list2;
        this.f64224d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<ModuleDescriptorImpl> mo88812a() {
        return this.f64223c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* JADX INFO: renamed from: b */
    public Set<ModuleDescriptorImpl> mo88813b() {
        return this.f64222b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<ModuleDescriptorImpl> mo88814c() {
        return this.f64221a;
    }
}
