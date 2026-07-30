package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import p153l.gle0;
import p153l.xke0;
import p153l.yke0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m88121d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "", "timeMillis", "<init>", "(J)V", "Ll/gle0;", "select", "ignoredParam", "", "c", "(Ll/gle0;Ljava/lang/Object;)V", "a", "J", "Ll/xke0;", "b", "()Ll/xke0;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class OnTimeout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long timeMillis;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.OnTimeout$a */
    @Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m88121d2 = {"", "run", "()V", "<anonymous>"}, m88122k = 3, m88123mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class RunnableC15600a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gle0 f67621a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnTimeout f67622b;

        public RunnableC15600a(gle0 gle0Var, OnTimeout onTimeout) {
            this.f67621a = gle0Var;
            this.f67622b = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f67621a.mo95205f(this.f67622b, Unit.INSTANCE);
        }
    }

    public OnTimeout(long j) {
        this.timeMillis = j;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final xke0 m95189b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        onTimeout$selectClause$1.getClass();
        return new yke0(this, (Function3) TypeIntrinsics.m88429g(onTimeout$selectClause$1, 3), null, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m95190c(gle0<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.mo95203d(Unit.INSTANCE);
            return;
        }
        RunnableC15600a runnableC15600a = new RunnableC15600a(select, this);
        select.getClass();
        CoroutineContext context = select.getContext();
        select.mo95201b(DelayKt.m94503c(context).invokeOnTimeout(this.timeMillis, runnableC15600a, context));
    }
}
