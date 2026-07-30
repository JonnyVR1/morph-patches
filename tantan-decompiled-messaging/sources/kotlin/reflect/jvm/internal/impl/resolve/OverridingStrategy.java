package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OverridingStrategy {
    /* JADX INFO: renamed from: a */
    public abstract void mo88734a(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    /* JADX INFO: renamed from: b */
    public abstract void mo91802b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    /* JADX INFO: renamed from: c */
    public abstract void mo91803c(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    /* JADX INFO: renamed from: d */
    public void mo89512d(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
        callableMemberDescriptor.getClass();
        collection.getClass();
        callableMemberDescriptor.mo88451N(collection);
    }
}
