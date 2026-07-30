package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import p149l.r9r;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NotNullLazyValue<MemberScope> f65914a;

    @JvmOverloads
    public LazyScopeAdapter(@NotNull StorageManager storageManager, @NotNull Function0<? extends MemberScope> function0) {
        storageManager.getClass();
        function0.getClass();
        this.f65914a = storageManager.mo92446e(new r9r(function0));
    }

    /* JADX INFO: renamed from: k */
    public static final MemberScope m92062k(Function0 function0) {
        MemberScope memberScope = (MemberScope) function0.invoke();
        return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).m92023h() : memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    /* JADX INFO: renamed from: i */
    public MemberScope mo92024i() {
        return this.f65914a.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LazyScopeAdapter(@NotNull Function0<? extends MemberScope> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        function0.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(StorageManager storageManager, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            storageManager = LockBasedStorageManager.f66165e;
            storageManager.getClass();
        }
        this(storageManager, function0);
    }
}
