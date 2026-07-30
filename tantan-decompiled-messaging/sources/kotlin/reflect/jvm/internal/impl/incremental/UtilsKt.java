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
    public static final void m89074a(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull ClassDescriptor classDescriptor, @NotNull Name name) {
        LocationInfo location;
        lookupTracker.getClass();
        lookupLocation.getClass();
        classDescriptor.getClass();
        name.getClass();
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        Position position = lookupTracker.mo89078a() ? location.getPosition() : Position.Companion.m89080a();
        String strM89077a = location.m89077a();
        String strM91057a = DescriptorUtils.m91772m(classDescriptor).m91057a();
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        lookupTracker.mo89079b(strM89077a, position, strM91057a, scopeKind, strM91082b);
    }

    /* JADX INFO: renamed from: b */
    public static final void m89075b(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull Name name) {
        lookupTracker.getClass();
        lookupLocation.getClass();
        packageFragmentDescriptor.getClass();
        name.getClass();
        String strM91046a = packageFragmentDescriptor.mo88562d().m91046a();
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        m89076c(lookupTracker, lookupLocation, strM91046a, strM91082b);
    }

    /* JADX INFO: renamed from: c */
    public static final void m89076c(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull String str, @NotNull String str2) {
        LocationInfo location;
        lookupTracker.getClass();
        lookupLocation.getClass();
        str.getClass();
        str2.getClass();
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        lookupTracker.mo89079b(location.m89077a(), lookupTracker.mo89078a() ? location.getPosition() : Position.Companion.m89080a(), str, ScopeKind.PACKAGE, str2);
    }
}
