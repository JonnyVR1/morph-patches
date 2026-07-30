package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.C0670g;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.a200;
import p149l.b200;
import p149l.bhh0;
import p149l.c200;
import p149l.d200;
import p149l.e200;
import p149l.f200;
import p149l.g200;
import p149l.gzg0;
import p149l.h200;
import p149l.iaq0;
import p149l.lvc0;
import p149l.n75;
import p149l.ndc0;
import p149l.qaq0;
import p149l.r5j;
import p149l.r95;
import p149l.th80;
import p149l.u9q0;
import p149l.w9q0;
import p149l.y100;
import p149l.ytd;
import p149l.z100;
import p149l.z9q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Ll/iaq0;", "workSpecDao", "()Ll/iaq0;", "Ll/ytd;", "dependencyDao", "()Ll/ytd;", "Ll/qaq0;", "workTagDao", "()Ll/qaq0;", "Ll/bhh0;", "systemIdInfoDao", "()Ll/bhh0;", "Ll/w9q0;", "workNameDao", "()Ll/w9q0;", "Ll/z9q0;", "workProgressDao", "()Ll/z9q0;", "Ll/th80;", "preferenceDao", "()Ll/th80;", "Ll/ndc0;", "rawWorkInfoDao", "()Ll/ndc0;", "Companion", "a", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Ll/r95;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ll/r95;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static gzg0 m4449a(Context context, gzg0.C17209b c17209b) {
            c17209b.getClass();
            gzg0.C17209b.a aVarM128867a = gzg0.C17209b.INSTANCE.m128867a(context);
            aVarM128867a.m128865d(c17209b.com.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String).m128864c(c17209b.callback).m128866e(true).m128862a(true);
            return new r5j().mo112331a(aVarM128867a.m128863b());
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final WorkDatabase m4450b(@NotNull final Context context, @NotNull Executor queryExecutor, @NotNull r95 clock, boolean useTestDatabase) {
            context.getClass();
            queryExecutor.getClass();
            clock.getClass();
            return (WorkDatabase) (useTestDatabase ? C0670g.m3992c(context, WorkDatabase.class).m3913c() : C0670g.m3990a(context, WorkDatabase.class, "androidx.work.workdb").m3916f(new gzg0.InterfaceC17210c() { // from class: l.w8q0
                @Override // p149l.gzg0.InterfaceC17210c
                /* JADX INFO: renamed from: a */
                public final gzg0 mo112331a(gzg0.C17209b c17209b) {
                    return WorkDatabase.Companion.m4449a(context, c17209b);
                }
            })).m3917g(queryExecutor).m3911a(new n75(clock)).m3912b(c200.INSTANCE).m3912b(new lvc0(context, 2, 3)).m3912b(d200.INSTANCE).m3912b(e200.INSTANCE).m3912b(new lvc0(context, 5, 6)).m3912b(f200.INSTANCE).m3912b(g200.INSTANCE).m3912b(h200.INSTANCE).m3912b(new u9q0(context)).m3912b(new lvc0(context, 10, 11)).m3912b(y100.INSTANCE).m3912b(z100.INSTANCE).m3912b(a200.INSTANCE).m3912b(b200.INSTANCE).m3912b(new lvc0(context, 21, 22)).m3915e().m3914d();
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final WorkDatabase create(@NotNull Context context, @NotNull Executor executor, @NotNull r95 r95Var, boolean z) {
        return INSTANCE.m4450b(context, executor, r95Var, z);
    }

    @NotNull
    public abstract ytd dependencyDao();

    @NotNull
    public abstract th80 preferenceDao();

    @NotNull
    public abstract ndc0 rawWorkInfoDao();

    @NotNull
    public abstract bhh0 systemIdInfoDao();

    @NotNull
    public abstract w9q0 workNameDao();

    @NotNull
    public abstract z9q0 workProgressDao();

    @NotNull
    public abstract iaq0 workSpecDao();

    @NotNull
    public abstract qaq0 workTagDao();
}
