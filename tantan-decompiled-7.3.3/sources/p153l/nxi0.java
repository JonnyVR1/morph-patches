package p153l;

import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000fB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/nxi0;", p7f.GPS_DIRECTION_TRUE, "Ll/wk90;", "inputProducer", "Ll/oxi0;", "threadHandoffProducerQueue", "<init>", "(Ll/wk90;Ll/oxi0;)V", "Ll/z06;", "consumer", "Ll/yk90;", "context", "", "b", "(Ll/z06;Ll/yk90;)V", "a", "Ll/wk90;", "c", "()Ll/wk90;", "Ll/oxi0;", Constants.INAPP_DATA_TAG, "()Ll/oxi0;", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class nxi0<T> implements wk90<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wk90<T> inputProducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oxi0 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: l.nxi0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/nxi0$b", "Ll/er2;", "", "b", "()V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C18978b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0<T> f144128a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ nxi0<T> f144129b;

        public C18978b(z3g0<T> z3g0Var, nxi0<T> nxi0Var) {
            this.f144128a = z3g0Var;
            this.f144129b = nxi0Var;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f144128a.m95923a();
            this.f144129b.getThreadHandoffProducerQueue().mo169711a(this.f144128a);
        }
    }

    public nxi0(@NotNull wk90<T> wk90Var, @NotNull oxi0 oxi0Var) {
        wk90Var.getClass();
        oxi0Var.getClass();
        this.inputProducer = wk90Var;
        this.threadHandoffProducerQueue = oxi0Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(@NotNull z06<T> consumer, @NotNull yk90 context) {
        consumer.getClass();
        context.getClass();
        if (!i9j.m139099d()) {
            cl90 cl90VarMo117675n = context.mo117675n();
            Companion companion = INSTANCE;
            if (companion.m165122d(context)) {
                cl90VarMo117675n.mo110444d(context, "BackgroundThreadHandoffProducer");
                cl90VarMo117675n.mo110446f(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.mo8539b(consumer, context);
                return;
            } else {
                C18979c c18979c = new C18979c(consumer, cl90VarMo117675n, context, this);
                context.mo117677q(new C18978b(c18979c, this));
                this.threadHandoffProducerQueue.mo169713c(h9j.m134074a(c18979c, companion.m165121c(context)));
                return;
            }
        }
        i9j.m139097a("ThreadHandoffProducer#produceResults");
        try {
            cl90 cl90VarMo117675n2 = context.mo117675n();
            Companion companion2 = INSTANCE;
            if (companion2.m165122d(context)) {
                cl90VarMo117675n2.mo110444d(context, "BackgroundThreadHandoffProducer");
                cl90VarMo117675n2.mo110446f(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.mo8539b(consumer, context);
            } else {
                C18979c c18979c2 = new C18979c(consumer, cl90VarMo117675n2, context, this);
                context.mo117677q(new C18978b(c18979c2, this));
                this.threadHandoffProducerQueue.mo169713c(h9j.m134074a(c18979c2, companion2.m165121c(context)));
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            i9j.m139098b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final wk90<T> m165117c() {
        return this.inputProducer;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final oxi0 getThreadHandoffProducerQueue() {
        return this.threadHandoffProducerQueue;
    }

    /* JADX INFO: renamed from: l.nxi0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/nxi0$a;", "", "<init>", "()V", "Ll/yk90;", "context", "", "c", "(Ll/yk90;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Ll/yk90;)Z", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final String m165121c(yk90 context) {
            if (!h9j.m134075b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + context.getId();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m165122d(yk90 context) {
            return context.mo117674m().getExperiments().getHandOffOnUiThreadOnly() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l.nxi0$c */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0006\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/nxi0$c", "Ll/z3g0;", "ignored", "", "f", "(Ljava/lang/Object;)V", "b", "c", "()Ljava/lang/Object;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C18979c extends z3g0<T> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z06<T> f144130f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ cl90 f144131g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ yk90 f144132h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ nxi0<T> f144133i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18979c(z06<T> z06Var, cl90 cl90Var, yk90 yk90Var, nxi0<T> nxi0Var) {
            super(z06Var, cl90Var, yk90Var, "BackgroundThreadHandoffProducer");
            this.f144130f = z06Var;
            this.f144131g = cl90Var;
            this.f144132h = yk90Var;
            this.f144133i = nxi0Var;
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: c */
        public T mo8546c() throws Exception {
            return null;
        }

        @Override // p153l.z3g0, p153l.a4g0
        /* JADX INFO: renamed from: f */
        public void mo95926f(T ignored) {
            this.f144131g.mo110446f(this.f144132h, "BackgroundThreadHandoffProducer", null);
            this.f144133i.m165117c().mo8539b(this.f144130f, this.f144132h);
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: b */
        public void mo8545b(T ignored) {
        }
    }
}
