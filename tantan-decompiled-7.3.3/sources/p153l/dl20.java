package p153l;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C15530e;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/dl20;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ll/po5;", "a", "Ll/po5;", "job", "Ll/drb;", "b", "Ll/drb;", "()Ll/drb;", "coroutineScope", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class dl20 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final po5 job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final drb coroutineScope;

    public dl20(@NotNull CoroutineDispatcher coroutineDispatcher) {
        coroutineDispatcher.getClass();
        po5 po5VarM218802b = z6h0.m218802b(null, 1, null);
        this.job = po5VarM218802b;
        this.coroutineScope = C15531f.m94947a(po5VarM218802b.plus(coroutineDispatcher).plus(new C15530e("CT-Fetch")));
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final drb getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dl20() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ dl20(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? r5e.m179861b() : coroutineDispatcher);
    }
}
