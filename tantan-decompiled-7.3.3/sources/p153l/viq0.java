package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Work;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 F2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\b\u001e\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, m88121d2 = {"Ll/viq0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/uw5;", "configuration", "e", "(Ll/uw5;)Ll/viq0;", "Ll/u5c;", "dataHandler", "g", "(Ll/u5c;)Ll/viq0;", "Ll/u8;", Work.TYPE, "Ll/dyl;", "callback", "a", "(Ll/u8;Ll/dyl;)Ll/viq0;", "", "b", "()V", Constants.INAPP_DATA_TAG, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue;", "workQueue", "c", "mirrorQueue", "Ll/uw5;", "getConfiguration", "()Ll/uw5;", "f", "(Ll/uw5;)V", "Ll/u5c;", "getDataHandler", "()Ll/u5c;", "h", "(Ll/u5c;)V", "Ll/fyl;", "Ll/fyl;", "getDownloader", "()Ll/fyl;", "setDownloader", "(Ll/fyl;)V", "downloader", "Ll/gyl;", "Ll/gyl;", "()Ll/gyl;", "setMonitor", "(Ll/gyl;)V", "monitor", "", "Z", "getCanceled", "()Z", "setCanceled", "(Z)V", "canceled", "", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "tag", "j", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class viq0 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AbstractC20518u8> workQueue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AbstractC20518u8> mirrorQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public uw5 configuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public u5c dataHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public fyl downloader;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public gyl monitor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean canceled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String tag;

    public viq0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.workQueue = new LinkedBlockingQueue<>();
        this.mirrorQueue = new LinkedBlockingQueue<>();
        this.downloader = new fae(null);
        this.monitor = new k610(null);
        this.tag = "WorkManager";
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final viq0 m201406a(@NotNull AbstractC20518u8 work, @Nullable dyl callback) {
        work.getClass();
        synchronized (this.workQueue) {
            work.m194902g(callback);
            this.workQueue.add(work);
            this.mirrorQueue.add(work);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m201407b() {
        AbstractC20518u8 abstractC20518u8Poll;
        synchronized (this.workQueue) {
            do {
                try {
                    if (!this.workQueue.isEmpty()) {
                        if (this.canceled) {
                            break;
                        }
                        abstractC20518u8Poll = this.workQueue.poll();
                        abstractC20518u8Poll.m194901f(this);
                    } else {
                        m201409d();
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } while (!abstractC20518u8Poll.m194896a().m170619b());
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final gyl getMonitor() {
        return this.monitor;
    }

    /* JADX INFO: renamed from: d */
    public final void m201409d() {
        Iterator<T> it = this.mirrorQueue.iterator();
        while (it.hasNext()) {
            ((AbstractC20518u8) it.next()).deleteObservers();
        }
        this.mirrorQueue.clear();
        this.workQueue.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final viq0 m201410e(@NotNull uw5 configuration) {
        configuration.getClass();
        m201411f(configuration);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m201411f(@NotNull uw5 uw5Var) {
        uw5Var.getClass();
        this.configuration = uw5Var;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final viq0 m201412g(@NotNull u5c dataHandler) {
        dataHandler.getClass();
        m201413h(dataHandler);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m201413h(@NotNull u5c u5cVar) {
        u5cVar.getClass();
        this.dataHandler = u5cVar;
    }

    /* JADX INFO: renamed from: l.viq0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/viq0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/viq0;", "a", "(Landroid/content/Context;)Ll/viq0;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final viq0 m201414a(@NotNull Context context) {
            context.getClass();
            return new viq0(context);
        }

        public Companion() {
        }
    }
}
