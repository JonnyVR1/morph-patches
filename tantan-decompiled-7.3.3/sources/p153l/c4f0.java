package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00162\u00020\u0001:\u0002\f\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m88121d2 = {"Ll/c4f0;", "", "<init>", "()V", "", "min", "Ll/dyl;", "storageCheckCallback", "", "c", "(JLl/dyl;)V", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "h", "(Landroid/content/Context;)V", "context", "Ll/u5c;", "b", "Ll/u5c;", "e", "()Ll/u5c;", RXScreenCaptureService.KEY_INDEX, "(Ll/u5c;)V", "dataHandler", "Ll/uw5;", "Ll/uw5;", Constants.INAPP_DATA_TAG, "()Ll/uw5;", "g", "(Ll/uw5;)V", "configuration", "Ll/viq0;", "Ll/viq0;", "f", "()Ll/viq0;", "j", "(Ll/viq0;)V", "workManager", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class c4f0 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f79694f = "SharedLibraryManager";

    /* JADX INFO: renamed from: g */
    public static C16180b f79695g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public u5c dataHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public uw5 configuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public viq0 workManager;

    /* JADX INFO: renamed from: l.c4f0$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/c4f0$b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/c4f0;", "a", "()Ll/c4f0;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ll/c4f0;", "managerImpl", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C16180b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final c4f0 managerImpl;

        public C16180b(@NotNull Context context) {
            context.getClass();
            this.context = context;
            d4f0 d4f0Var = new d4f0();
            this.managerImpl = d4f0Var;
            d4f0Var.m107877g(new uw5(context));
            d4f0Var.m107879i(new u5c(context));
            d4f0Var.m107880j(viq0.INSTANCE.m201414a(context).m201410e(d4f0Var.m107874d()).m201412g(d4f0Var.m107875e()));
            d4f0Var.m107878h(context);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final c4f0 getManagerImpl() {
            return this.managerImpl;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo107873c(long min, @Nullable dyl storageCheckCallback);

    @NotNull
    /* JADX INFO: renamed from: d */
    public final uw5 m107874d() {
        uw5 uw5Var = this.configuration;
        if (uw5Var != null) {
            return uw5Var;
        }
        Intrinsics.m88391r("configuration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final u5c m107875e() {
        u5c u5cVar = this.dataHandler;
        if (u5cVar != null) {
            return u5cVar;
        }
        Intrinsics.m88391r("dataHandler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final viq0 m107876f() {
        viq0 viq0Var = this.workManager;
        if (viq0Var != null) {
            return viq0Var;
        }
        Intrinsics.m88391r("workManager");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m107877g(@NotNull uw5 uw5Var) {
        uw5Var.getClass();
        this.configuration = uw5Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m107878h(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: i */
    public final void m107879i(@NotNull u5c u5cVar) {
        u5cVar.getClass();
        this.dataHandler = u5cVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m107880j(@NotNull viq0 viq0Var) {
        viq0Var.getClass();
        this.workManager = viq0Var;
    }

    /* JADX INFO: renamed from: l.c4f0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/c4f0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/c4f0$b;", "a", "(Landroid/content/Context;)Ll/c4f0$b;", "", "TAG", "Ljava/lang/String;", "builder", "Ll/c4f0$b;", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C16180b m107881a(@NotNull Context context) {
            context.getClass();
            c4f0.f79695g = new C16180b(context);
            C16180b c16180b = c4f0.f79695g;
            if (c16180b != null) {
                return c16180b;
            }
            Intrinsics.m88391r("builder");
            return null;
        }

        public Companion() {
        }
    }
}
