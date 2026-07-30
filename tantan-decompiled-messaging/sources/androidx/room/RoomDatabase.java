package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bzg0;
import p149l.dld0;
import p149l.etd;
import p149l.f7d0;
import p149l.fzg0;
import p149l.gzg0;
import p149l.h7j0;
import p149l.ig3;
import p149l.izg0;
import p149l.j6f;
import p149l.jck0;
import p149l.jzg0;
import p149l.ke1;
import p149l.le1;
import p149l.nhf0;
import p149l.qkq0;
import p149l.qq3;
import p149l.qtc0;
import p149l.r5j;
import p149l.ui1;
import p149l.x100;
import p149l.xy0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b&\u0018\u0000 \u0083\u00012\u00020\u0001:\f\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u001a\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0015H$¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H$¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001c0\u0019H\u0015¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00050(H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH'¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u000bH\u0017¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u000bH\u0017¢\u0006\u0004\b.\u0010\u0003J+\u00100\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u000101H\u0016¢\u0006\u0004\b0\u00104J#\u00100\u001a\u0002032\u0006\u00100\u001a\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b0\u00108J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020/H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000bH\u0017¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u000bH\u0017¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u000bH\u0017¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ#\u0010B\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016¢\u0006\u0004\bB\u0010FJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0014¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u001e\u0010N\u001a\u0004\u0018\u00010G8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010\u0003R\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010%R\u0016\u0010Z\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R$\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b^\u0010_\u0012\u0004\b`\u0010\u0003RR\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0a2\u001a\u0010b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0a8E@EX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010c\u001a\u0004\bd\u0010'\"\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m8G¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR#\u0010s\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00010a8G¢\u0006\f\n\u0004\bs\u0010c\u001a\u0004\bt\u0010'R$\u0010u\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010cR\u001a\u0010v\u001a\u00020K8VX\u0096\u0004¢\u0006\f\u0012\u0004\bw\u0010\u0003\u001a\u0004\bv\u0010MR\u0017\u0010x\u001a\u00020K8G¢\u0006\f\u0012\u0004\by\u0010\u0003\u001a\u0004\bx\u0010MR\u0014\u0010|\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0015\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u00020K8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010M¨\u0006\u008a\u0001"}, m87232d2 = {"Landroidx/room/RoomDatabase;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "Ll/gzg0;", "openHelper", "unwrapOpenHelper", "(Ljava/lang/Class;Ll/gzg0;)Ljava/lang/Object;", "", "internalBeginTransaction", "internalEndTransaction", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/b;", "configuration", "init", "(Landroidx/room/b;)V", "", "Ll/ui1;", "autoMigrationSpecs", "", "Ll/x100;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", Constants.KEY_CONFIG, "createOpenHelper", "(Landroidx/room/b;)Ll/gzg0;", "Landroidx/room/e;", "createInvalidationTracker", "()Landroidx/room/e;", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "clearAllTables", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "", BLivePkInviteSource.query, "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Ll/izg0;", "Landroid/os/CancellationSignal;", "signal", "(Ll/izg0;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Ll/jzg0;", "compileStatement", "(Ljava/lang/String;)Ll/jzg0;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Ll/fzg0;", "db", "internalInitInvalidationTracker", "(Ll/fzg0;)V", "", "inTransaction", "()Z", "mDatabase", "Ll/fzg0;", "getMDatabase$annotations", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "internalOpenHelper", "Ll/gzg0;", "invalidationTracker", "Landroidx/room/e;", "getInvalidationTracker", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "Landroidx/room/RoomDatabase$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ll/ke1;", "autoCloser", "Ll/ke1;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Ll/gzg0;", "isMainThread$room_runtime_release", "isMainThread", "Companion", "a", "b", "c", "JournalMode", Constants.INAPP_DATA_TAG, "e", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class RoomDatabase {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private ke1 autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private gzg0 internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    protected List<? extends AbstractC0656b> mCallbacks;

    @JvmField
    @Nullable
    protected volatile fzg0 mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final C0668e invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends ui1>, ui1> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m87232d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "(Ljava/lang/String;I)V", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "resolve", "context", "Landroid/content/Context;", "resolve$room_runtime_release", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return bzg0.m104620b(activityManager);
        }

        @NotNull
        public final JournalMode resolve$room_runtime_release(@NotNull Context context) {
            context.getClass();
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$a */
    @Metadata(m87231d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020,0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0018\u00100\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00107R\u0016\u0010D\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00107R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010$R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006c"}, m87232d2 = {"Landroidx/room/RoomDatabase$a;", "Landroidx/room/RoomDatabase;", j6f.GPS_DIRECTION_TRUE, "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", AuthenticationTokenClaims.JSON_KEY_NAME, "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Ll/gzg0$c;", "factory", "f", "(Ll/gzg0$c;)Landroidx/room/RoomDatabase$a;", "", "Ll/x100;", "migrations", "b", "([Ll/x100;)Landroidx/room/RoomDatabase$a;", "c", "()Landroidx/room/RoomDatabase$a;", "Ljava/util/concurrent/Executor;", "executor", "g", "(Ljava/util/concurrent/Executor;)Landroidx/room/RoomDatabase$a;", "e", "Landroidx/room/RoomDatabase$b;", "callback", "a", "(Landroidx/room/RoomDatabase$b;)Landroidx/room/RoomDatabase$a;", Constants.INAPP_DATA_TAG, "()Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "Ljava/lang/Class;", "Ljava/lang/String;", "", "Ljava/util/List;", "callbacks", "Landroidx/room/RoomDatabase$e;", "Landroidx/room/RoomDatabase$e;", "prepackagedDatabaseCallback", "typeConverters", "Ll/ui1;", "autoMigrationSpecs", "h", "Ljava/util/concurrent/Executor;", "queryExecutor", RXScreenCaptureService.KEY_INDEX, "transactionExecutor", "j", "Ll/gzg0$c;", "", "k", "Z", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Landroid/content/Intent;", "m", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "n", "requireMigration", "o", "allowDestructiveMigrationOnDowngrade", "", "p", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "q", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/RoomDatabase$d;", "r", "Landroidx/room/RoomDatabase$d;", "migrationContainer", "", "", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/util/Set;", "migrationsNotRequiredFrom", Constants.KEY_T, "migrationStartAndEndVersions", "u", "copyFromAssetPath", "Ljava/io/File;", ResourceDirection.f38808v, "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "w", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static class C0655a<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Class<T> klass;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<AbstractC0656b> callbacks;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public AbstractC0660e prepackagedDatabaseCallback;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<Object> typeConverters;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public List<ui1> autoMigrationSpecs;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public Executor queryExecutor;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public Executor transactionExecutor;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public gzg0.InterfaceC17210c factory;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public JournalMode journalMode;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public boolean requireMigration;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public long autoCloseTimeout;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public final C0659d migrationContainer;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public Set<Integer> migrationsNotRequiredFrom;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public Set<Integer> migrationStartAndEndVersions;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public String copyFromAssetPath;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public File copyFromFile;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public Callable<InputStream> copyFromInputStream;

        public C0655a(@NotNull Context context, @NotNull Class<T> cls, @Nullable String str) {
            context.getClass();
            cls.getClass();
            this.context = context;
            this.klass = cls;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new C0659d();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public C0655a<T> m3911a(@NotNull AbstractC0656b callback) {
            callback.getClass();
            this.callbacks.add(callback);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public C0655a<T> m3912b(@NotNull x100... migrations) {
            migrations.getClass();
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (x100 x100Var : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                set.getClass();
                set.add(Integer.valueOf(x100Var.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                set2.getClass();
                set2.add(Integer.valueOf(x100Var.endVersion));
            }
            this.migrationContainer.m3922b((x100[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public C0655a<T> m3913c() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public T m3914d() {
            gzg0.InterfaceC17210c interfaceC17210c;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorM211653f = xy0.m211653f();
                this.transactionExecutor = executorM211653f;
                this.queryExecutor = executorM211653f;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                set.getClass();
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        jck0.m140980a("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue);
                        return null;
                    }
                }
            }
            gzg0.InterfaceC17210c dld0Var = this.factory;
            if (dld0Var == null) {
                dld0Var = new r5j();
            }
            if (dld0Var != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        ig3.m135964a("Cannot create auto-closing database for an in-memory database.");
                        return null;
                    }
                    long j = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        ig3.m135964a("Required value was null.");
                        return null;
                    }
                    Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        ig3.m135964a("Required value was null.");
                        return null;
                    }
                    dld0Var = new le1(dld0Var, new ke1(j, timeUnit, executor2));
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        ig3.m135964a("Cannot create from asset or file for an in-memory database.");
                        return null;
                    }
                    int i = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i2 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        ig3.m135964a("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        return null;
                    }
                    dld0Var = new dld0(str, file, callable, dld0Var);
                }
                interfaceC17210c = dld0Var;
            } else {
                interfaceC17210c = null;
            }
            if (interfaceC17210c == null) {
                ig3.m135964a("Required value was null.");
                return null;
            }
            Context context = this.context;
            String str2 = this.name;
            C0659d c0659d = this.migrationContainer;
            List<AbstractC0656b> list = this.callbacks;
            boolean z = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                ig3.m135964a("Required value was null.");
                return null;
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                ig3.m135964a("Required value was null.");
                return null;
            }
            C0665b c0665b = new C0665b(context, str2, interfaceC17210c, c0659d, list, z, journalModeResolve$room_runtime_release, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs);
            T t = (T) C0670g.m3991b(this.klass, "_Impl");
            t.init(c0665b);
            return t;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public C0655a<T> m3915e() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public C0655a<T> m3916f(@Nullable gzg0.InterfaceC17210c factory) {
            this.factory = factory;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public C0655a<T> m3917g(@NotNull Executor executor) {
            executor.getClass();
            this.queryExecutor = executor;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$b */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Landroidx/room/RoomDatabase$b;", "", "<init>", "()V", "Ll/fzg0;", "db", "", "a", "(Ll/fzg0;)V", "c", "b", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static abstract class AbstractC0656b {
        /* JADX INFO: renamed from: a */
        public void m3918a(@NotNull fzg0 db) {
            db.getClass();
        }

        /* JADX INFO: renamed from: b */
        public void m3919b(@NotNull fzg0 db) {
            db.getClass();
        }

        /* JADX INFO: renamed from: c */
        public void mo3920c(@NotNull fzg0 db) {
            db.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$d */
    @Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"¨\u0006#"}, m87232d2 = {"Landroidx/room/RoomDatabase$d;", "", "<init>", "()V", "", "Ll/x100;", "migrations", "", "b", "([Ll/x100;)V", "", "", "f", "()Ljava/util/Map;", "start", "end", "", Constants.INAPP_DATA_TAG, "(II)Ljava/util/List;", "startVersion", "endVersion", "", "c", "(II)Z", "migration", "a", "(Ll/x100;)V", "", LovePlanetStage.result, "upgrade", "e", "(Ljava/util/List;ZII)Ljava/util/List;", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static class C0659d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<Integer, TreeMap<Integer, x100>> migrations = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public final void m3921a(x100 migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            Map<Integer, TreeMap<Integer, x100>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i);
            TreeMap<Integer, x100> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, x100> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                migration.toString();
            }
            treeMap2.put(Integer.valueOf(i2), migration);
        }

        /* JADX INFO: renamed from: b */
        public void m3922b(@NotNull x100... migrations) {
            migrations.getClass();
            for (x100 x100Var : migrations) {
                m3921a(x100Var);
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m3923c(int startVersion, int endVersion) {
            Map<Integer, Map<Integer, x100>> mapM3926f = m3926f();
            if (!mapM3926f.containsKey(Integer.valueOf(startVersion))) {
                return false;
            }
            Map<Integer, x100> mapEmptyMap = mapM3926f.get(Integer.valueOf(startVersion));
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return mapEmptyMap.containsKey(Integer.valueOf(endVersion));
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public List<x100> m3924d(int start, int end) {
            if (start == end) {
                return CollectionsKt.emptyList();
            }
            return m3925e(new ArrayList(), end > start, start, end);
        }

        /* JADX INFO: renamed from: e */
        public final List<x100> m3925e(List<x100> result, boolean upgrade, int start, int end) {
            boolean z;
            do {
                if (upgrade) {
                    if (start >= end) {
                        return result;
                    }
                } else if (start <= end) {
                    return result;
                }
                TreeMap<Integer, x100> treeMap = this.migrations.get(Integer.valueOf(start));
                if (treeMap != null) {
                    Iterator<Integer> it = (upgrade ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        Integer next = it.next();
                        if (!upgrade) {
                            next.getClass();
                            int iIntValue = next.intValue();
                            if (end <= iIntValue && iIntValue < start) {
                                x100 x100Var = treeMap.get(next);
                                x100Var.getClass();
                                result.add(x100Var);
                                start = next.intValue();
                                z = true;
                                break;
                                break;
                            }
                        } else {
                            int i = start + 1;
                            next.getClass();
                            int iIntValue2 = next.intValue();
                            if (i <= iIntValue2 && iIntValue2 <= end) {
                                x100 x100Var2 = treeMap.get(next);
                                x100Var2.getClass();
                                result.add(x100Var2);
                                start = next.intValue();
                                z = true;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z);
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public Map<Integer, Map<Integer, x100>> m3926f() {
            return this.migrations;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$e */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/room/RoomDatabase$e;", "", "<init>", "()V", "Ll/fzg0;", "db", "", "a", "(Ll/fzg0;)V", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static abstract class AbstractC0660e {
        /* JADX INFO: renamed from: a */
        public void m3927a(@NotNull fzg0 db) {
            db.getClass();
        }
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @Deprecated
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        fzg0 fzg0VarMo3891C = getOpenHelper().mo3891C();
        getInvalidationTracker().m3963v(fzg0VarMo3891C);
        if (fzg0VarMo3891C.isWriteAheadLoggingEnabled()) {
            fzg0VarMo3891C.beginTransactionNonExclusive();
        } else {
            fzg0VarMo3891C.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().mo3891C().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().m3954m();
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, izg0 izg0Var, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(izg0Var, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> clazz, gzg0 openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof etd) {
            return (T) unwrapOpenHelper(clazz, ((etd) openHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            qkq0.m175383a("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (inTransaction() || this.suspendingTransactionId.get() == null) {
            return;
        }
        qkq0.m175383a("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        ke1 ke1Var = this.autoCloser;
        if (ke1Var == null) {
            internalBeginTransaction();
        } else {
            ke1Var.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.RoomDatabase.beginTransaction.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    RoomDatabase.this.internalBeginTransaction();
                    return null;
                }
            });
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            writeLock.getClass();
            writeLock.lock();
            try {
                getInvalidationTracker().m3960s();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public jzg0 compileStatement(@NotNull String sql) {
        sql.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().mo3891C().compileStatement(sql);
    }

    @NotNull
    public abstract C0668e createInvalidationTracker();

    @NotNull
    public abstract gzg0 createOpenHelper(@NotNull C0665b config);

    @Deprecated
    public void endTransaction() {
        ke1 ke1Var = this.autoCloser;
        if (ke1Var == null) {
            internalEndTransaction();
        } else {
            ke1Var.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.RoomDatabase.endTransaction.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    RoomDatabase.this.internalEndTransaction();
                    return null;
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<Class<? extends ui1>, ui1> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @JvmSuppressWildcards
    @NotNull
    public List<x100> getAutoMigrations(@NotNull Map<Class<? extends ui1>, ui1> autoMigrationSpecs) {
        autoMigrationSpecs.getClass();
        return CollectionsKt.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        lock.getClass();
        return lock;
    }

    @NotNull
    public C0668e getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public gzg0 getOpenHelper() {
        gzg0 gzg0Var = this.internalOpenHelper;
        if (gzg0Var != null) {
            return gzg0Var;
        }
        Intrinsics.m87502r("internalOpenHelper");
        return null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.m87502r("internalQueryExecutor");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Set<Class<? extends ui1>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.m87502r("internalTransactionExecutor");
        return null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        klass.getClass();
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().mo3891C().inTransaction();
    }

    @CallSuper
    public void init(@NotNull C0665b configuration) {
        configuration.getClass();
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends ui1>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends ui1>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends ui1> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    f7d0.m119786a("A required auto migration spec (", next.getCanonicalName(), ") is missing in the database configuration.");
                    return;
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            ig3.m135964a("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            return;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (x100 x100Var : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.m3923c(x100Var.startVersion, x100Var.endVersion)) {
                        configuration.migrationContainer.m3922b(x100Var);
                    }
                }
                C0673j c0673j = (C0673j) unwrapOpenHelper(C0673j.class, getOpenHelper());
                if (c0673j != null) {
                    c0673j.m4015g(configuration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().m3957p(autoClosingRoomOpenHelper.autoCloser);
                }
                boolean z = configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new h7j0(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        ig3.m135964a("Required value was null.");
                        return;
                    }
                    getInvalidationTracker().m3958q(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i4 = size3 - 1;
                            if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i4 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i4;
                            }
                        }
                        if (size3 < 0) {
                            StringBuilder sb = new StringBuilder("A required type converter (");
                            sb.append(cls);
                            String canonicalName = key.getCanonicalName();
                            sb.append(") for ");
                            sb.append(canonicalName);
                            sb.append(" is missing in the database configuration.");
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        qtc0.m176411a("Unexpected type converter ", configuration.typeConverters.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        return;
                    } else if (i5 < 0) {
                        return;
                    } else {
                        size4 = i5;
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull fzg0 db) {
        db.getClass();
        getInvalidationTracker().m3951j(db);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        ke1 ke1Var = this.autoCloser;
        if (ke1Var == null) {
            fzg0 fzg0Var = this.mDatabase;
            if (fzg0Var != null) {
                zIsOpen = fzg0Var.isOpen();
            } else {
                boolValueOf = null;
            }
            return Intrinsics.m87488d(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = ke1Var.m145709j();
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.m87488d(boolValueOf, Boolean.TRUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        fzg0 fzg0Var = this.mDatabase;
        return fzg0Var != null && fzg0Var.isOpen();
    }

    @JvmOverloads
    @NotNull
    public Cursor query(@NotNull izg0 query, @Nullable CancellationSignal signal) {
        query.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return signal != null ? getOpenHelper().mo3891C().mo3896b0(query, signal) : getOpenHelper().mo3891C().mo3894E(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        body.getClass();
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setAutoMigrationSpecs(@NotNull Map<Class<? extends ui1>, ui1> map) {
        map.getClass();
        this.autoMigrationSpecs = map;
    }

    @Deprecated
    public void setTransactionSuccessful() {
        getOpenHelper().mo3891C().setTransactionSuccessful();
    }

    public void runInTransaction(@NotNull Runnable body) {
        body.getClass();
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] args) {
        query.getClass();
        return getOpenHelper().mo3891C().mo3894E(new nhf0(query, args));
    }

    @JvmOverloads
    @NotNull
    public final Cursor query(@NotNull izg0 izg0Var) {
        izg0Var.getClass();
        return query$default(this, izg0Var, null, 2, null);
    }
}
