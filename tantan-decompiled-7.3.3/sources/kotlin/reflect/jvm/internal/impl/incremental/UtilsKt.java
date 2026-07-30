package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static final void m89965a(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull ClassDescriptor classDescriptor, @NotNull Name name) {
        LocationInfo location;
        lookupTracker.getClass();
        lookupLocation.getClass();
        classDescriptor.getClass();
        name.getClass();
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        Position position = lookupTracker.mo89969a() ? location.getPosition() : Position.Companion.m89971a();
        String strM89968a = location.m89968a();
        String strM91948a = DescriptorUtils.m92663m(classDescriptor).m91948a();
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        lookupTracker.mo89970b(strM89968a, position, strM91948a, scopeKind, strM91973b);
    }

    /* JADX INFO: renamed from: b */
    public static final void m89966b(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull Name name) {
        lookupTracker.getClass();
        lookupLocation.getClass();
        packageFragmentDescriptor.getClass();
        name.getClass();
        String strM91937a = packageFragmentDescriptor.mo89453d().m91937a();
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        m89967c(lookupTracker, lookupLocation, strM91937a, strM91973b);
    }

    /* JADX INFO: renamed from: c */
    public static final void m89967c(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull String str, @NotNull String str2) {
        LocationInfo location;
        lookupTracker.getClass();
        lookupLocation.getClass();
        str.getClass();
        str2.getClass();
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        lookupTracker.mo89970b(location.m89968a(), lookupTracker.mo89969a() ? location.getPosition() : Position.Companion.m89971a(), str, ScopeKind.PACKAGE, str2);
    }
}
