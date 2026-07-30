package p153l;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.sina.weibo.sdk.constant.WBConstants;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m88121d2 = {"Ll/o7h0;", "Ljava/io/Closeable;", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ll/n7h0;", c4s.C_ZONE, "()Ll/n7h0;", "writableDatabase", "X", "readableDatabase", "a", "b", "c", "sqlite_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface o7h0 extends Closeable {

    /* JADX INFO: renamed from: l.o7h0$a */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/o7h0$a;", "", "", WBConstants.AUTH_PARAMS_VERSION, "<init>", "(I)V", "Ll/n7h0;", "db", "", "b", "(Ll/n7h0;)V", Constants.INAPP_DATA_TAG, "oldVersion", "newVersion", "g", "(Ll/n7h0;II)V", "e", "f", "c", "", "fileName", "a", "(Ljava/lang/String;)V", "I", "Companion", "sqlite_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static abstract class AbstractC19043a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final int version;

        public AbstractC19043a(int i) {
            this.version = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m166338a(String fileName) {
            if (C15493d.m94381x(fileName, SQLiteDatabaseConfiguration.MEMORY_DB_PATH, true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m88378e(fileName.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (fileName.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            try {
                i7h0.m138952b(new File(fileName));
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo3997b(@NotNull n7h0 db) {
            db.getClass();
        }

        /* JADX INFO: renamed from: c */
        public void m166339c(@NotNull n7h0 db) {
            db.getClass();
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    m166338a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = db.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            obj.getClass();
                            m166338a((String) obj);
                        }
                    } else {
                        String path2 = db.getPath();
                        if (path2 != null) {
                            m166338a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo3998d(@NotNull n7h0 db);

        /* JADX INFO: renamed from: e */
        public void mo3999e(@NotNull n7h0 db, int oldVersion, int newVersion) {
            db.getClass();
            throw new SQLiteException("Can't downgrade database from version " + oldVersion + " to " + newVersion);
        }

        /* JADX INFO: renamed from: f */
        public void mo4000f(@NotNull n7h0 db) {
            db.getClass();
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo4001g(@NotNull n7h0 db, int oldVersion, int newVersion);
    }

    /* JADX INFO: renamed from: l.o7h0$c */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m88121d2 = {"Ll/o7h0$c;", "", "Ll/o7h0$b;", "configuration", "Ll/o7h0;", "a", "(Ll/o7h0$b;)Ll/o7h0;", "sqlite_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC19045c {
        @NotNull
        /* JADX INFO: renamed from: a */
        o7h0 mo104496a(@NotNull C19044b configuration);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    n7h0 mo3892C();

    @NotNull
    /* JADX INFO: renamed from: X */
    n7h0 mo3893X();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean enabled);

    /* JADX INFO: renamed from: l.o7h0$b */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Ll/o7h0$b;", "", "Landroid/content/Context;", "context", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/o7h0$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/o7h0$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ll/o7h0$a;", Constants.INAPP_DATA_TAG, "Z", "e", "Companion", "sqlite_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C19044b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final String name;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final AbstractC19043a callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        public final boolean useNoBackupDirectory;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        public final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: l.o7h0$b$a */
        @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/o7h0$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/o7h0$b;", "b", "()Ll/o7h0$b;", "", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/o7h0$b$a;", "Ll/o7h0$a;", "callback", "c", "(Ll/o7h0$a;)Ll/o7h0$b$a;", "", "useNoBackupDirectory", "e", "(Z)Ll/o7h0$b$a;", "allowDataLossOnRecovery", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Ll/o7h0$a;", "Z", "sqlite_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Context context;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public String name;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public AbstractC19043a callback;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public boolean useNoBackupDirectory;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public boolean allowDataLossOnRecovery;

            public a(@NotNull Context context) {
                context.getClass();
                this.context = context;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public a m166341a(boolean allowDataLossOnRecovery) {
                this.allowDataLossOnRecovery = allowDataLossOnRecovery;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public C19044b m166342b() {
                String str;
                AbstractC19043a abstractC19043a = this.callback;
                if (abstractC19043a == null) {
                    wg3.m206174a("Must set a callback to create the configuration.");
                    return null;
                }
                if (!this.useNoBackupDirectory || ((str = this.name) != null && str.length() != 0)) {
                    return new C19044b(this.context, this.name, abstractC19043a, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
                }
                wg3.m206174a("Must set a non-null database name to a configuration that uses the no backup directory.");
                return null;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public a m166343c(@NotNull AbstractC19043a callback) {
                callback.getClass();
                this.callback = callback;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public a m166344d(@Nullable String name) {
                this.name = name;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public a m166345e(boolean useNoBackupDirectory) {
                this.useNoBackupDirectory = useNoBackupDirectory;
                return this;
            }
        }

        public C19044b(@NotNull Context context, @Nullable String str, @NotNull AbstractC19043a abstractC19043a, boolean z, boolean z2) {
            context.getClass();
            abstractC19043a.getClass();
            this.context = context;
            this.name = str;
            this.callback = abstractC19043a;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z2;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final a m166340a(@NotNull Context context) {
            return INSTANCE.m166346a(context);
        }

        /* JADX INFO: renamed from: l.o7h0$b$b, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/o7h0$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/o7h0$b$a;", "a", "(Landroid/content/Context;)Ll/o7h0$b$a;", "sqlite_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final a m166346a(@NotNull Context context) {
                context.getClass();
                return new a(context);
            }

            public Companion() {
            }
        }
    }
}
