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
import p153l.xke0;
import p153l.zke0;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J2\u0010\t\u001a\u00020\b*\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJD\u0010\u000e\u001a\u00020\b\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00010\f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Lkotlinx/coroutines/selects/c;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "Ll/xke0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "c", "(Ll/xke0;Lkotlin/jvm/functions/Function1;)V", "Q", "Ll/zke0;", "Lkotlin/Function2;", "e", "(Ll/zke0;Lkotlin/jvm/functions/Function2;)V", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", "()V", "", "Lkotlinx/coroutines/selects/SelectImplementation$a;", "g", "Ljava/util/List;", "clausesToRegister", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
@SourceDebugExtension
public class C15605c<R> extends SelectImplementation<R> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<SelectImplementation<R>.C15601a> clausesToRegister;

    @PublishedApi
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ <R> Object m95235C(C15605c<R> c15605c, Continuation<? super R> continuation) {
        c15605c.m95236D();
        return super.mo95209p(continuation);
    }

    /* JADX INFO: renamed from: D */
    public final void m95236D() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it = this.clausesToRegister.iterator();
            while (it.hasNext()) {
                SelectImplementation.m95198x(this, (SelectImplementation.C15601a) it.next(), false, 1, null);
            }
            this.clausesToRegister.clear();
        } catch (Throwable th) {
            this.clausesToRegister.clear();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, p153l.wke0
    /* JADX INFO: renamed from: c */
    public void mo95202c(@NotNull xke0 xke0Var, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.clausesToRegister.add(new SelectImplementation.C15601a(xke0Var.getClauseObject(), xke0Var.mo98659c(), xke0Var.mo98658b(), SelectKt.m95230i(), function1, xke0Var.mo98657a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, p153l.wke0
    /* JADX INFO: renamed from: e */
    public <Q> void mo95204e(@NotNull zke0<? extends Q> zke0Var, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        this.clausesToRegister.add(new SelectImplementation.C15601a(zke0Var.getClauseObject(), zke0Var.mo98659c(), zke0Var.mo98658b(), null, function2, zke0Var.mo98657a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo95209p(@NotNull Continuation<? super R> continuation) {
        return m95235C(this, continuation);
    }
}
