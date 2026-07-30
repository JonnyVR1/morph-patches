package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;
import p153l.utd;
import p153l.uyp;
import p153l.wp1;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0005¨\u0006\r"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "", "Ll/utd;", "", "a", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/o;", "jobs", "", "c", "([Lkotlinx/coroutines/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class AwaitKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m94491a(@NotNull Collection<? extends utd<? extends T>> collection, @NotNull Continuation<? super List<? extends T>> continuation) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new wp1((utd[]) collection.toArray(new utd[0])).m207400c(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m94492b(@NotNull Collection<? extends InterfaceC15593o> collection, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            int i = awaitKt$joinAll$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.label = i - Integer.MIN_VALUE;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
            }
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        }
        Object obj = awaitKt$joinAll$3.result;
        Object objM198688e = uyp.m198688e();
        int i2 = awaitKt$joinAll$3.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) awaitKt$joinAll$3.L$0;
            ResultKt.m88128b(obj);
        }
        while (it.hasNext()) {
            InterfaceC15593o interfaceC15593o = (InterfaceC15593o) it.next();
            awaitKt$joinAll$3.L$0 = it;
            awaitKt$joinAll$3.label = 1;
            if (interfaceC15593o.mo94554S(awaitKt$joinAll$3) == objM198688e) {
                return objM198688e;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m94493c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC15593o[] r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt$joinAll$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt$joinAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p153l.uyp.m198688e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            int r6 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.o[] r4 = (kotlinx.coroutines.InterfaceC15593o[]) r4
            kotlin.ResultKt.m88128b(r7)
            r7 = r4
            goto L54
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r6)
            r6 = 0
            return r6
        L39:
            kotlin.ResultKt.m88128b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L41:
            if (r2 >= r6) goto L56
            r4 = r7[r2]
            r0.L$0 = r7
            r0.I$0 = r2
            r0.I$1 = r6
            r0.label = r3
            java.lang.Object r4 = r4.mo94554S(r0)
            if (r4 != r1) goto L54
            return r1
        L54:
            int r2 = r2 + r3
            goto L41
        L56:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.m94493c(kotlinx.coroutines.o[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
