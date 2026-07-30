package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0010\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/wjq;", "", "Ll/qjq;", "jankStats", "<init>", "(Ll/qjq;)V", "", "enable", "", "c", "(Z)V", "a", "Ll/qjq;", "getJankStats", "()Ll/qjq;", "Companion", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class wjq {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static long f186670b = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final qjq jankStats;

    public wjq(@NotNull qjq qjqVar) {
        qjqVar.getClass();
        this.jankStats = qjqVar;
    }

    /* JADX INFO: renamed from: c */
    public void mo189398c(boolean enable) {
        throw null;
    }

    /* JADX INFO: renamed from: l.wjq$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/wjq$a;", "", "<init>", "()V", "", "frameDuration", "J", "a", "()J", "b", "(J)V", "", "NANOS_PER_MS", "I", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final long m203485a() {
            return wjq.f186670b;
        }

        /* JADX INFO: renamed from: b */
        public final void m203486b(long j) {
            wjq.f186670b = j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
