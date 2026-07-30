package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Work;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 F2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\b\u001e\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, m87232d2 = {"Ll/q9q0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/pv5;", "configuration", "e", "(Ll/pv5;)Ll/q9q0;", "Ll/m4c;", "dataHandler", "g", "(Ll/m4c;)Ll/q9q0;", "Ll/z8;", Work.TYPE, "Ll/lvl;", "callback", "a", "(Ll/z8;Ll/lvl;)Ll/q9q0;", "", "b", "()V", Constants.INAPP_DATA_TAG, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue;", "workQueue", "c", "mirrorQueue", "Ll/pv5;", "getConfiguration", "()Ll/pv5;", "f", "(Ll/pv5;)V", "Ll/m4c;", "getDataHandler", "()Ll/m4c;", "h", "(Ll/m4c;)V", "Ll/nvl;", "Ll/nvl;", "getDownloader", "()Ll/nvl;", "setDownloader", "(Ll/nvl;)V", "downloader", "Ll/ovl;", "Ll/ovl;", "()Ll/ovl;", "setMonitor", "(Ll/ovl;)V", "monitor", "", "Z", "getCanceled", "()Z", "setCanceled", "(Z)V", "canceled", "", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "tag", "j", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class q9q0 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AbstractC21646z8> workQueue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AbstractC21646z8> mirrorQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public pv5 configuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public m4c dataHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public nvl downloader;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public ovl monitor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean canceled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String tag;

    public q9q0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.workQueue = new LinkedBlockingQueue<>();
        this.mirrorQueue = new LinkedBlockingQueue<>();
        this.downloader = new b9e(null);
        this.monitor = new ay00(null);
        this.tag = "WorkManager";
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final q9q0 m173662a(@NotNull AbstractC21646z8 work, @Nullable lvl callback) {
        work.getClass();
        synchronized (this.workQueue) {
            work.m217549g(callback);
            this.workQueue.add(work);
            this.mirrorQueue.add(work);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m173663b() {
        AbstractC21646z8 abstractC21646z8Poll;
        synchronized (this.workQueue) {
            do {
                try {
                    if (!this.workQueue.isEmpty()) {
                        if (this.canceled) {
                            break;
                        }
                        abstractC21646z8Poll = this.workQueue.poll();
                        abstractC21646z8Poll.m217548f(this);
                    } else {
                        m173665d();
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } while (!abstractC21646z8Poll.m217543a().m156870b());
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ovl getMonitor() {
        return this.monitor;
    }

    /* JADX INFO: renamed from: d */
    public final void m173665d() {
        Iterator<T> it = this.mirrorQueue.iterator();
        while (it.hasNext()) {
            ((AbstractC21646z8) it.next()).deleteObservers();
        }
        this.mirrorQueue.clear();
        this.workQueue.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final q9q0 m173666e(@NotNull pv5 configuration) {
        configuration.getClass();
        m173667f(configuration);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m173667f(@NotNull pv5 pv5Var) {
        pv5Var.getClass();
        this.configuration = pv5Var;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final q9q0 m173668g(@NotNull m4c dataHandler) {
        dataHandler.getClass();
        m173669h(dataHandler);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m173669h(@NotNull m4c m4cVar) {
        m4cVar.getClass();
        this.dataHandler = m4cVar;
    }

    /* JADX INFO: renamed from: l.q9q0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/q9q0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/q9q0;", "a", "(Landroid/content/Context;)Ll/q9q0;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final q9q0 m173670a(@NotNull Context context) {
            context.getClass();
            return new q9q0(context);
        }

        public Companion() {
        }
    }
}
