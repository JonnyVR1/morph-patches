package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.C0672g;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p153l.ab00;
import p153l.bb00;
import p153l.bjq0;
import p153l.cb00;
import p153l.db00;
import p153l.eb00;
import p153l.ejq0;
import p153l.iph0;
import p153l.l8j;
import p153l.mvd;
import p153l.njq0;
import p153l.o3d0;
import p153l.o7h0;
import p153l.o85;
import p153l.sa5;
import p153l.ulc0;
import p153l.va00;
import p153l.vjq0;
import p153l.wa00;
import p153l.xa00;
import p153l.ya00;
import p153l.yp80;
import p153l.za00;
import p153l.ziq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m88121d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Ll/njq0;", "workSpecDao", "()Ll/njq0;", "Ll/mvd;", "dependencyDao", "()Ll/mvd;", "Ll/vjq0;", "workTagDao", "()Ll/vjq0;", "Ll/iph0;", "systemIdInfoDao", "()Ll/iph0;", "Ll/bjq0;", "workNameDao", "()Ll/bjq0;", "Ll/ejq0;", "workProgressDao", "()Ll/ejq0;", "Ll/yp80;", "preferenceDao", "()Ll/yp80;", "Ll/ulc0;", "rawWorkInfoDao", "()Ll/ulc0;", "Companion", "a", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Ll/sa5;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ll/sa5;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static o7h0 m4451a(Context context, o7h0.C19044b c19044b) {
            c19044b.getClass();
            o7h0.C19044b.a aVarM166346a = o7h0.C19044b.INSTANCE.m166346a(context);
            aVarM166346a.m166344d(c19044b.com.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String).m166343c(c19044b.callback).m166345e(true).m166341a(true);
            return new l8j().mo104496a(aVarM166346a.m166342b());
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final WorkDatabase m4452b(@NotNull final Context context, @NotNull Executor queryExecutor, @NotNull sa5 clock, boolean useTestDatabase) {
            context.getClass();
            queryExecutor.getClass();
            clock.getClass();
            return (WorkDatabase) (useTestDatabase ? C0672g.m3994c(context, WorkDatabase.class).m3915c() : C0672g.m3992a(context, WorkDatabase.class, "androidx.work.workdb").m3918f(new o7h0.InterfaceC19045c() { // from class: l.biq0
                @Override // p153l.o7h0.InterfaceC19045c
                /* JADX INFO: renamed from: a */
                public final o7h0 mo104496a(o7h0.C19044b c19044b) {
                    return WorkDatabase.Companion.m4451a(context, c19044b);
                }
            })).m3919g(queryExecutor).m3913a(new o85(clock)).m3914b(za00.INSTANCE).m3914b(new o3d0(context, 2, 3)).m3914b(ab00.INSTANCE).m3914b(bb00.INSTANCE).m3914b(new o3d0(context, 5, 6)).m3914b(cb00.INSTANCE).m3914b(db00.INSTANCE).m3914b(eb00.INSTANCE).m3914b(new ziq0(context)).m3914b(new o3d0(context, 10, 11)).m3914b(va00.INSTANCE).m3914b(wa00.INSTANCE).m3914b(xa00.INSTANCE).m3914b(ya00.INSTANCE).m3914b(new o3d0(context, 21, 22)).m3917e().m3916d();
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final WorkDatabase create(@NotNull Context context, @NotNull Executor executor, @NotNull sa5 sa5Var, boolean z) {
        return INSTANCE.m4452b(context, executor, sa5Var, z);
    }

    @NotNull
    public abstract mvd dependencyDao();

    @NotNull
    public abstract yp80 preferenceDao();

    @NotNull
    public abstract ulc0 rawWorkInfoDao();

    @NotNull
    public abstract iph0 systemIdInfoDao();

    @NotNull
    public abstract bjq0 workNameDao();

    @NotNull
    public abstract ejq0 workProgressDao();

    @NotNull
    public abstract njq0 workSpecDao();

    @NotNull
    public abstract vjq0 workTagDao();
}
