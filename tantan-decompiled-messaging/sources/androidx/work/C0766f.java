package androidx.work;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;

/* JADX INFO: renamed from: androidx.work.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m87232d2 = {"Landroidx/work/f;", "Landroidx/work/h;", "Landroidx/work/f$a;", "builder", "<init>", "(Landroidx/work/f$a;)V", "Companion", "a", "b", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0766f extends AbstractC0768h {

    /* JADX INFO: renamed from: androidx.work.f$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Landroidx/work/f$a;", "Landroidx/work/h$a;", "Landroidx/work/f;", "Ljava/lang/Class;", "Landroidx/work/b;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "flexInterval", "flexIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroidx/work/f;", "m", "()Landroidx/work/f$a;", "thisObject", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class a extends AbstractC0768h.a<a, C0766f> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends AbstractC0762b> cls, long j, @NotNull TimeUnit timeUnit, long j2, @NotNull TimeUnit timeUnit2) {
            super(cls);
            cls.getClass();
            timeUnit.getClass();
            timeUnit2.getClass();
            getWorkSpec().m130170p(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        @Override // androidx.work.AbstractC0768h.a
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C0766f mo4420c() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                ig3.m135964a("Cannot set backoff criteria on an idle mode job");
                return null;
            }
            if (!getWorkSpec().expedited) {
                return new C0766f(this);
            }
            ig3.m135964a("PeriodicWorkRequests cannot be expedited");
            return null;
        }

        @Override // androidx.work.AbstractC0768h.a
        @NotNull
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a mo4421g() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0766f(@NotNull a aVar) {
        super(aVar.getId(), aVar.getWorkSpec(), aVar.m4439f());
        aVar.getClass();
    }
}
