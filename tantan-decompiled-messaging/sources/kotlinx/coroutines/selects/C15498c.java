package kotlinx.coroutines.selects;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.sce0;
import p149l.uce0;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J2\u0010\t\u001a\u00020\b*\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJD\u0010\u000e\u001a\u00020\b\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00010\f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Lkotlinx/coroutines/selects/c;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "Ll/sce0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "c", "(Ll/sce0;Lkotlin/jvm/functions/Function1;)V", "Q", "Ll/uce0;", "Lkotlin/Function2;", "e", "(Ll/uce0;Lkotlin/jvm/functions/Function2;)V", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", "()V", "", "Lkotlinx/coroutines/selects/SelectImplementation$a;", "g", "Ljava/util/List;", "clausesToRegister", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
@SourceDebugExtension
public class C15498c<R> extends SelectImplementation<R> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<SelectImplementation<R>.C15494a> clausesToRegister;

    @PublishedApi
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ <R> Object m94342C(C15498c<R> c15498c, Continuation<? super R> continuation) {
        c15498c.m94343D();
        return super.mo94316p(continuation);
    }

    /* JADX INFO: renamed from: D */
    public final void m94343D() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it = this.clausesToRegister.iterator();
            while (it.hasNext()) {
                SelectImplementation.m94305x(this, (SelectImplementation.C15494a) it.next(), false, 1, null);
            }
            this.clausesToRegister.clear();
        } catch (Throwable th) {
            this.clausesToRegister.clear();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, p149l.rce0
    /* JADX INFO: renamed from: c */
    public void mo94309c(@NotNull sce0 sce0Var, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.clausesToRegister.add(new SelectImplementation.C15494a(sce0Var.getClauseObject(), sce0Var.mo187984c(), sce0Var.mo187983b(), SelectKt.m94337i(), function1, sce0Var.mo187982a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, p149l.rce0
    /* JADX INFO: renamed from: e */
    public <Q> void mo94311e(@NotNull uce0<? extends Q> uce0Var, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        this.clausesToRegister.add(new SelectImplementation.C15494a(uce0Var.getClauseObject(), uce0Var.mo187984c(), uce0Var.mo187983b(), null, function2, uce0Var.mo187982a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo94316p(@NotNull Continuation<? super R> continuation) {
        return m94342C(this, continuation);
    }
}
