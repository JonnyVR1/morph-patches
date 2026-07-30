package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OverridingStrategy {
    /* JADX INFO: renamed from: a */
    public abstract void mo89625a(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    /* JADX INFO: renamed from: b */
    public abstract void mo92693b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    /* JADX INFO: renamed from: c */
    public abstract void mo92694c(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    /* JADX INFO: renamed from: d */
    public void mo90403d(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
        callableMemberDescriptor.getClass();
        collection.getClass();
        callableMemberDescriptor.mo89342N(collection);
    }
}
