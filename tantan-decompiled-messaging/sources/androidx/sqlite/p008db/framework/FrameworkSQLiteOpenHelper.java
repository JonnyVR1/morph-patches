package androidx.sqlite.p008db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p008db.framework.FrameworkSQLiteOpenHelper;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.azg0;
import p149l.b2s;
import p149l.czg0;
import p149l.fzg0;
import p149l.gzg0;
import p149l.jc90;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 12\u00020\u0001:\u0003\u0013\u00152B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0016\u0010%\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u001b\u00100\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b,\u0010-*\u0004\b.\u0010/¨\u00063"}, m87232d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Ll/gzg0;", "Landroid/content/Context;", "context", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/gzg0$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/gzg0$a;ZZ)V", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ll/gzg0$a;", Constants.INAPP_DATA_TAG, "Z", "e", "Lkotlin/Lazy;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "f", "Lkotlin/Lazy;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ll/fzg0;", b2s.C_ZONE, "()Ll/fzg0;", "writableDatabase", "W", "readableDatabase", "k", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "getDelegate$delegate", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;)Ljava/lang/Object;", "delegate", "Companion", "OpenHelper", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FrameworkSQLiteOpenHelper implements gzg0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final gzg0.AbstractC17208a callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean useNoBackupDirectory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean allowDataLossOnRecovery;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy<OpenHelper> lazyDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean writeAheadLoggingEnabled;

    @Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 =2\u00020\u0001:\u0003>?(B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0019J'\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00104¨\u0006@"}, m87232d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "dbRef", "Ll/gzg0$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;Ll/gzg0$a;Z)V", "writable", "Ll/fzg0;", Constants.INAPP_DATA_TAG, "(Z)Ll/fzg0;", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "e", "(Landroid/database/sqlite/SQLiteDatabase;)Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "h", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "g", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "getDbRef", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "c", "Ll/gzg0$a;", "getCallback", "()Ll/gzg0$a;", "Z", "getAllowDataLossOnRecovery", "()Z", "migrated", "Ll/jc90;", "f", "Ll/jc90;", JoinPoint.SYNCHRONIZATION_LOCK, "opened", "Companion", "CallbackException", "CallbackName", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C0688b dbRef;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final gzg0.AbstractC17208a callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean migrated;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final jc90 lock;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean opened;

        @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "cause", "", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "getCallbackName", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class CallbackException extends RuntimeException {

            @NotNull
            private final CallbackName callbackName;

            @NotNull
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(@NotNull CallbackName callbackName, @NotNull Throwable th) {
                super(th);
                callbackName.getClass();
                th.getClass();
                this.callbackName = callbackName;
                this.cause = th;
            }

            @NotNull
            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @NotNull
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "", "<init>", "()V", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "a", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;Landroid/database/sqlite/SQLiteDatabase;)Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final FrameworkSQLiteDatabase m4064a(@NotNull C0688b refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                refHolder.getClass();
                sqLiteDatabase.getClass();
                FrameworkSQLiteDatabase db = refHolder.getDb();
                if (db != null && db.m4051e(sqLiteDatabase)) {
                    return db;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.m4066b(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$b */
        @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
        public /* synthetic */ class C0686b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f3118a;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f3118a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@NotNull Context context, @Nullable String str, @NotNull final C0688b c0688b, @NotNull final gzg0.AbstractC17208a abstractC17208a, boolean z) {
            String string;
            super(context, str, null, abstractC17208a.com.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String, new DatabaseErrorHandler() { // from class: l.q5j
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper.m4059b(abstractC17208a, c0688b, sQLiteDatabase);
                }
            });
            context.getClass();
            c0688b.getClass();
            abstractC17208a.getClass();
            this.context = context;
            this.dbRef = c0688b;
            this.callback = abstractC17208a;
            this.allowDataLossOnRecovery = z;
            if (str == null) {
                string = UUID.randomUUID().toString();
                string.getClass();
            } else {
                string = str;
            }
            this.lock = new jc90(string, context.getCacheDir(), false);
        }

        /* JADX INFO: renamed from: b */
        public static void m4059b(gzg0.AbstractC17208a abstractC17208a, C0688b c0688b, SQLiteDatabase sQLiteDatabase) {
            abstractC17208a.getClass();
            c0688b.getClass();
            Companion companion = INSTANCE;
            sQLiteDatabase.getClass();
            abstractC17208a.m128860c(companion.m4064a(c0688b, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                jc90.m140873c(this.lock, false, 1, null);
                super.close();
                this.dbRef.m4066b(null);
                this.opened = false;
            } finally {
                this.lock.m140875d();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final fzg0 m4060d(boolean writable) {
            fzg0 fzg0VarM4061e;
            try {
                this.lock.m140874b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseM4063h = m4063h(writable);
                if (this.migrated) {
                    close();
                    fzg0VarM4061e = m4060d(writable);
                } else {
                    fzg0VarM4061e = m4061e(sQLiteDatabaseM4063h);
                }
                return fzg0VarM4061e;
            } finally {
                this.lock.m140875d();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final FrameworkSQLiteDatabase m4061e(@NotNull SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.getClass();
            return INSTANCE.m4064a(this.dbRef, sqLiteDatabase);
        }

        /* JADX INFO: renamed from: g */
        public final SQLiteDatabase m4062g(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            readableDatabase.getClass();
            return readableDatabase;
        }

        /* JADX INFO: renamed from: h */
        public final SQLiteDatabase m4063h(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z = this.opened;
            if (databaseName != null && !z && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                return m4062g(writable);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m4062g(writable);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int i = C0686b.f3118a[callbackException.getCallbackName().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return m4062g(writable);
                    } catch (CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db) {
            db.getClass();
            if (!this.migrated && this.callback.com.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.mo3995b(m4061e(db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.getClass();
            try {
                this.callback.mo3996d(m4061e(sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@NotNull SQLiteDatabase db, int oldVersion, int newVersion) {
            db.getClass();
            this.migrated = true;
            try {
                this.callback.mo3997e(m4061e(db), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@NotNull SQLiteDatabase db) {
            db.getClass();
            if (!this.migrated) {
                try {
                    this.callback.mo3998f(m4061e(db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            sqLiteDatabase.getClass();
            this.migrated = true;
            try {
                this.callback.mo3999g(m4061e(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, m87232d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "db", "<init>", "(Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;)V", "a", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "()Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "b", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0688b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public FrameworkSQLiteDatabase db;

        public C0688b(@Nullable FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final FrameworkSQLiteDatabase getDb() {
            return this.db;
        }

        /* JADX INFO: renamed from: b */
        public final void m4066b(@Nullable FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }
    }

    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull gzg0.AbstractC17208a abstractC17208a, boolean z, boolean z2) {
        context.getClass();
        abstractC17208a.getClass();
        this.context = context;
        this.name = str;
        this.callback = abstractC17208a;
        this.useNoBackupDirectory = z;
        this.allowDataLossOnRecovery = z2;
        this.lazyDelegate = LazyKt__LazyJVMKt.m87229b(new Function0<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                if (this.this$0.name == null || !this.this$0.useNoBackupDirectory) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.context, this.this$0.name, new FrameworkSQLiteOpenHelper.C0688b(null), this.this$0.callback, this.this$0.allowDataLossOnRecovery);
                } else {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.context, new File(czg0.m109412a(this.this$0.context), this.this$0.name).getAbsolutePath(), new FrameworkSQLiteOpenHelper.C0688b(null), this.this$0.callback, this.this$0.allowDataLossOnRecovery);
                }
                azg0.m99669f(openHelper, this.this$0.writeAheadLoggingEnabled);
                return openHelper;
            }
        });
    }

    @Override // p149l.gzg0
    @NotNull
    /* JADX INFO: renamed from: C */
    public fzg0 mo3891C() {
        return m4058k().m4060d(true);
    }

    @Override // p149l.gzg0
    @NotNull
    /* JADX INFO: renamed from: W */
    public fzg0 mo3892W() {
        return m4058k().m4060d(false);
    }

    @Override // p149l.gzg0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            m4058k().close();
        }
    }

    @Override // p149l.gzg0
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k */
    public final OpenHelper m4058k() {
        return this.lazyDelegate.getValue();
    }

    @Override // p149l.gzg0
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.isInitialized()) {
            azg0.m99669f(m4058k(), enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }
}
