package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ymy;

/* JADX INFO: loaded from: classes2.dex */
public interface MemberScope extends ResolutionScope {

    @NotNull
    public static final Companion Companion = Companion.f66589a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66589a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Function1<Name, Boolean> f66590b = ymy.INSTANCE;

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public static final boolean m92954a(Name name) {
            name.getClass();
            return true;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Function1<Name, Boolean> m92956c() {
            return f66590b;
        }
    }

    public static final class DefaultImpls {
    }

    public static final class Empty extends MemberScopeImpl {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo89610a() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo89613d() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: e */
        public Set<Name> mo89614e() {
            return SetsKt.emptySet();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Set<Name> mo89610a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Collection<? extends SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* JADX INFO: renamed from: c */
    Collection<? extends PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* JADX INFO: renamed from: d */
    Set<Name> mo89613d();

    @Nullable
    /* JADX INFO: renamed from: e */
    Set<Name> mo89614e();
}
