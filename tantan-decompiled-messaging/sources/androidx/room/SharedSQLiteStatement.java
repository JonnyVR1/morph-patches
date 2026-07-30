package androidx.room;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import p149l.jzg0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001f"}, m87232d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "", "e", "()Ljava/lang/String;", "", "c", "()V", "Ll/jzg0;", "b", "()Ll/jzg0;", "statement", "h", "(Ll/jzg0;)V", Constants.INAPP_DATA_TAG, "", "canUseCached", "g", "(Z)Ll/jzg0;", "a", "Landroidx/room/RoomDatabase;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", JoinPoint.SYNCHRONIZATION_LOCK, "Lkotlin/Lazy;", "f", "stmt", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean lock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy stmt;

    public SharedSQLiteStatement(@NotNull RoomDatabase roomDatabase) {
        roomDatabase.getClass();
        this.database = roomDatabase;
        this.lock = new AtomicBoolean(false);
        this.stmt = LazyKt__LazyJVMKt.m87229b(new Function0<jzg0>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final jzg0 invoke() {
                return this.this$0.m3931d();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public jzg0 m3929b() {
        m3930c();
        return m3934g(this.lock.compareAndSet(false, true));
    }

    /* JADX INFO: renamed from: c */
    public void m3930c() {
        this.database.assertNotMainThread();
    }

    /* JADX INFO: renamed from: d */
    public final jzg0 m3931d() {
        return this.database.compileStatement(mo3932e());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract String mo3932e();

    /* JADX INFO: renamed from: f */
    public final jzg0 m3933f() {
        return (jzg0) this.stmt.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final jzg0 m3934g(boolean canUseCached) {
        return canUseCached ? m3933f() : m3931d();
    }

    /* JADX INFO: renamed from: h */
    public void m3935h(@NotNull jzg0 statement) {
        statement.getClass();
        if (statement == m3933f()) {
            this.lock.set(false);
        }
    }
}
