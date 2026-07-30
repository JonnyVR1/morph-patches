package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00162\u00020\u0001:\u0002\f\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Ll/vve0;", "", "<init>", "()V", "", "min", "Ll/lvl;", "storageCheckCallback", "", "c", "(JLl/lvl;)V", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "h", "(Landroid/content/Context;)V", "context", "Ll/m4c;", "b", "Ll/m4c;", "e", "()Ll/m4c;", RXScreenCaptureService.KEY_INDEX, "(Ll/m4c;)V", "dataHandler", "Ll/pv5;", "Ll/pv5;", Constants.INAPP_DATA_TAG, "()Ll/pv5;", "g", "(Ll/pv5;)V", "configuration", "Ll/q9q0;", "Ll/q9q0;", "f", "()Ll/q9q0;", "j", "(Ll/q9q0;)V", "workManager", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class vve0 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f183211f = "SharedLibraryManager";

    /* JADX INFO: renamed from: g */
    public static C20740b f183212g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public m4c dataHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public pv5 configuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public q9q0 workManager;

    /* JADX INFO: renamed from: l.vve0$b */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/vve0$b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/vve0;", "a", "()Ll/vve0;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ll/vve0;", "managerImpl", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C20740b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final vve0 managerImpl;

        public C20740b(@NotNull Context context) {
            context.getClass();
            this.context = context;
            wve0 wve0Var = new wve0();
            this.managerImpl = wve0Var;
            wve0Var.m200187g(new pv5(context));
            wve0Var.m200189i(new m4c(context));
            wve0Var.m200190j(q9q0.INSTANCE.m173670a(context).m173666e(wve0Var.m200184d()).m173668g(wve0Var.m200185e()));
            wve0Var.m200188h(context);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final vve0 getManagerImpl() {
            return this.managerImpl;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo200183c(long min, @Nullable lvl storageCheckCallback);

    @NotNull
    /* JADX INFO: renamed from: d */
    public final pv5 m200184d() {
        pv5 pv5Var = this.configuration;
        if (pv5Var != null) {
            return pv5Var;
        }
        Intrinsics.m87502r("configuration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final m4c m200185e() {
        m4c m4cVar = this.dataHandler;
        if (m4cVar != null) {
            return m4cVar;
        }
        Intrinsics.m87502r("dataHandler");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final q9q0 m200186f() {
        q9q0 q9q0Var = this.workManager;
        if (q9q0Var != null) {
            return q9q0Var;
        }
        Intrinsics.m87502r("workManager");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m200187g(@NotNull pv5 pv5Var) {
        pv5Var.getClass();
        this.configuration = pv5Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m200188h(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: i */
    public final void m200189i(@NotNull m4c m4cVar) {
        m4cVar.getClass();
        this.dataHandler = m4cVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m200190j(@NotNull q9q0 q9q0Var) {
        q9q0Var.getClass();
        this.workManager = q9q0Var;
    }

    /* JADX INFO: renamed from: l.vve0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/vve0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/vve0$b;", "a", "(Landroid/content/Context;)Ll/vve0$b;", "", "TAG", "Ljava/lang/String;", "builder", "Ll/vve0$b;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C20740b m200191a(@NotNull Context context) {
            context.getClass();
            vve0.f183212g = new C20740b(context);
            C20740b c20740b = vve0.f183212g;
            if (c20740b != null) {
                return c20740b;
            }
            Intrinsics.m87502r("builder");
            return null;
        }

        public Companion() {
        }
    }
}
