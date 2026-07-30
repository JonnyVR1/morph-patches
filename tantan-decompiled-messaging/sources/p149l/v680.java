package p149l;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v680 {

    /* JADX INFO: renamed from: b */
    public static final v680 f180167b;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C20585a f180168a;

    /* JADX INFO: renamed from: l.v680$a */
    @RequiresApi(31)
    public static final class C20585a {

        /* JADX INFO: renamed from: b */
        public static final C20585a f180169b = new C20585a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a */
        public final LogSessionId f180170a;

        public C20585a(LogSessionId logSessionId) {
            this.f180170a = logSessionId;
        }
    }

    static {
        f180167b = vck0.f180948a < 31 ? new v680() : new v680(C20585a.f180169b);
    }

    public v680() {
        this((C20585a) null);
        p11.m167013g(vck0.f180948a < 31);
    }

    @RequiresApi(31)
    /* JADX INFO: renamed from: a */
    public LogSessionId m197200a() {
        return ((C20585a) p11.m167011e(this.f180168a)).f180170a;
    }

    @RequiresApi(31)
    public v680(LogSessionId logSessionId) {
        this(new C20585a(logSessionId));
    }

    public v680(@Nullable C20585a c20585a) {
        this.f180168a = c20585a;
    }
}
