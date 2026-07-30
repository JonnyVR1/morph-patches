package p153l;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bf80 {

    /* JADX INFO: renamed from: b */
    public static final bf80 f76466b;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C15977a f76467a;

    /* JADX INFO: renamed from: l.bf80$a */
    @RequiresApi(31)
    public static final class C15977a {

        /* JADX INFO: renamed from: b */
        public static final C15977a f76468b = new C15977a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a */
        public final LogSessionId f76469a;

        public C15977a(LogSessionId logSessionId) {
            this.f76469a = logSessionId;
        }
    }

    static {
        f76466b = bmk0.f77313a < 31 ? new bf80() : new bf80(C15977a.f76468b);
    }

    public bf80() {
        this((C15977a) null);
        w11.m204371g(bmk0.f77313a < 31);
    }

    @RequiresApi(31)
    /* JADX INFO: renamed from: a */
    public LogSessionId m103880a() {
        return ((C15977a) w11.m204369e(this.f76467a)).f76469a;
    }

    @RequiresApi(31)
    public bf80(LogSessionId logSessionId) {
        this(new C15977a(logSessionId));
    }

    public bf80(@Nullable C15977a c15977a) {
        this.f76467a = c15977a;
    }
}
