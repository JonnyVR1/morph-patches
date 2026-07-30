package p149l;

import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000fB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/loi0;", j6f.GPS_DIRECTION_TRUE, "Ll/sc90;", "inputProducer", "Ll/moi0;", "threadHandoffProducerQueue", "<init>", "(Ll/sc90;Ll/moi0;)V", "Ll/uz5;", "consumer", "Ll/uc90;", "context", "", "b", "(Ll/uz5;Ll/uc90;)V", "a", "Ll/sc90;", "c", "()Ll/sc90;", "Ll/moi0;", Constants.INAPP_DATA_TAG, "()Ll/moi0;", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class loi0<T> implements sc90<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sc90<T> inputProducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final moi0 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: l.loi0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/loi0$b", "Ll/nq2;", "", "b", "()V", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18272b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvf0<T> f129110a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ loi0<T> f129111b;

        public C18272b(qvf0<T> qvf0Var, loi0<T> loi0Var) {
            this.f129110a = qvf0Var;
            this.f129111b = loi0Var;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f129110a.m181279a();
            this.f129111b.getThreadHandoffProducerQueue().mo155508a(this.f129110a);
        }
    }

    public loi0(@NotNull sc90<T> sc90Var, @NotNull moi0 moi0Var) {
        sc90Var.getClass();
        moi0Var.getClass();
        this.inputProducer = sc90Var;
        this.threadHandoffProducerQueue = moi0Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(@NotNull uz5<T> consumer, @NotNull uc90 context) {
        consumer.getClass();
        context.getClass();
        if (!o6j.m162852d()) {
            yc90 yc90VarMo155870n = context.mo155870n();
            Companion companion = INSTANCE;
            if (companion.m150779d(context)) {
                yc90VarMo155870n.mo104754d(context, "BackgroundThreadHandoffProducer");
                yc90VarMo155870n.mo104756f(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.mo8485b(consumer, context);
                return;
            } else {
                C18273c c18273c = new C18273c(consumer, yc90VarMo155870n, context, this);
                context.mo155872q(new C18272b(c18273c, this));
                this.threadHandoffProducerQueue.mo155510c(n6j.m158041a(c18273c, companion.m150778c(context)));
                return;
            }
        }
        o6j.m162850a("ThreadHandoffProducer#produceResults");
        try {
            yc90 yc90VarMo155870n2 = context.mo155870n();
            Companion companion2 = INSTANCE;
            if (companion2.m150779d(context)) {
                yc90VarMo155870n2.mo104754d(context, "BackgroundThreadHandoffProducer");
                yc90VarMo155870n2.mo104756f(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.mo8485b(consumer, context);
            } else {
                C18273c c18273c2 = new C18273c(consumer, yc90VarMo155870n2, context, this);
                context.mo155872q(new C18272b(c18273c2, this));
                this.threadHandoffProducerQueue.mo155510c(n6j.m158041a(c18273c2, companion2.m150778c(context)));
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            o6j.m162851b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final sc90<T> m150774c() {
        return this.inputProducer;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final moi0 getThreadHandoffProducerQueue() {
        return this.threadHandoffProducerQueue;
    }

    /* JADX INFO: renamed from: l.loi0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/loi0$a;", "", "<init>", "()V", "Ll/uc90;", "context", "", "c", "(Ll/uc90;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Ll/uc90;)Z", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final String m150778c(uc90 context) {
            if (!n6j.m158042b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + context.getId();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m150779d(uc90 context) {
            return context.mo155869m().getExperiments().getHandOffOnUiThreadOnly() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l.loi0$c */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0006\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/loi0$c", "Ll/qvf0;", "ignored", "", "f", "(Ljava/lang/Object;)V", "b", "c", "()Ljava/lang/Object;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18273c extends qvf0<T> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ uz5<T> f129112f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ yc90 f129113g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ uc90 f129114h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ loi0<T> f129115i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18273c(uz5<T> uz5Var, yc90 yc90Var, uc90 uc90Var, loi0<T> loi0Var) {
            super(uz5Var, yc90Var, uc90Var, "BackgroundThreadHandoffProducer");
            this.f129112f = uz5Var;
            this.f129113g = yc90Var;
            this.f129114h = uc90Var;
            this.f129115i = loi0Var;
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: c */
        public T mo8492c() throws Exception {
            return null;
        }

        @Override // p149l.qvf0, p149l.rvf0
        /* JADX INFO: renamed from: f */
        public void mo113828f(T ignored) {
            this.f129113g.mo104756f(this.f129114h, "BackgroundThreadHandoffProducer", null);
            this.f129115i.m150774c().mo8485b(this.f129112f, this.f129114h);
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: b */
        public void mo8491b(T ignored) {
        }
    }
}
