package androidx.work;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;

/* JADX INFO: renamed from: androidx.work.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m87232d2 = {"Landroidx/work/c;", "Landroidx/work/h;", "Landroidx/work/c$a;", "builder", "<init>", "(Landroidx/work/c$a;)V", "Companion", "a", "b", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0763c extends AbstractC0768h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.c$a */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"Landroidx/work/c$a;", "Landroidx/work/h$a;", "Landroidx/work/c;", "Ljava/lang/Class;", "Landroidx/work/b;", "workerClass", "<init>", "(Ljava/lang/Class;)V", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroidx/work/c;", "m", "()Landroidx/work/c$a;", "thisObject", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a extends AbstractC0768h.a<a, C0763c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends AbstractC0762b> cls) {
            super(cls);
            cls.getClass();
        }

        @Override // androidx.work.AbstractC0768h.a
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C0763c mo4420c() {
            if (!getBackoffCriteriaSet() || !getWorkSpec().constraints.getRequiresDeviceIdle()) {
                return new C0763c(this);
            }
            ig3.m135964a("Cannot set backoff criteria on an idle mode job");
            return null;
        }

        @Override // androidx.work.AbstractC0768h.a
        @NotNull
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a mo4421g() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Landroidx/work/c$b;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/work/b;", "workerClass", "Landroidx/work/c;", "a", "(Ljava/lang/Class;)Landroidx/work/c;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0763c m4424a(@NotNull Class<? extends AbstractC0762b> workerClass) {
            workerClass.getClass();
            return new a(workerClass).m4436b();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0763c(@NotNull a aVar) {
        super(aVar.getId(), aVar.getWorkSpec(), aVar.m4439f());
        aVar.getClass();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C0763c m4419e(@NotNull Class<? extends AbstractC0762b> cls) {
        return INSTANCE.m4424a(cls);
    }
}
