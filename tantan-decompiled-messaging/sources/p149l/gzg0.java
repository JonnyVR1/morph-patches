package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.sina.weibo.sdk.constant.WBConstants;
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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m87232d2 = {"Ll/gzg0;", "Ljava/io/Closeable;", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ll/fzg0;", b2s.C_ZONE, "()Ll/fzg0;", "writableDatabase", "W", "readableDatabase", "a", "b", "c", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface gzg0 extends Closeable {

    /* JADX INFO: renamed from: l.gzg0$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/gzg0$a;", "", "", WBConstants.AUTH_PARAMS_VERSION, "<init>", "(I)V", "Ll/fzg0;", "db", "", "b", "(Ll/fzg0;)V", Constants.INAPP_DATA_TAG, "oldVersion", "newVersion", "g", "(Ll/fzg0;II)V", "e", "f", "c", "", "fileName", "a", "(Ljava/lang/String;)V", "I", "Companion", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static abstract class AbstractC17208a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final int version;

        public AbstractC17208a(int i) {
            this.version = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m128859a(String fileName) {
            if (C15386d.m93490x(fileName, ":memory:", true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m87489e(fileName.charAt(!z ? i : length), 32) <= 0;
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
                azg0.m99665b(new File(fileName));
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo3995b(@NotNull fzg0 db) {
            db.getClass();
        }

        /* JADX INFO: renamed from: c */
        public void m128860c(@NotNull fzg0 db) {
            db.getClass();
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    m128859a(path);
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
                            m128859a((String) obj);
                        }
                    } else {
                        String path2 = db.getPath();
                        if (path2 != null) {
                            m128859a(path2);
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
        public abstract void mo3996d(@NotNull fzg0 db);

        /* JADX INFO: renamed from: e */
        public void mo3997e(@NotNull fzg0 db, int oldVersion, int newVersion) {
            db.getClass();
            throw new SQLiteException("Can't downgrade database from version " + oldVersion + " to " + newVersion);
        }

        /* JADX INFO: renamed from: f */
        public void mo3998f(@NotNull fzg0 db) {
            db.getClass();
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo3999g(@NotNull fzg0 db, int oldVersion, int newVersion);
    }

    /* JADX INFO: renamed from: l.gzg0$c */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m87232d2 = {"Ll/gzg0$c;", "", "Ll/gzg0$b;", "configuration", "Ll/gzg0;", "a", "(Ll/gzg0$b;)Ll/gzg0;", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC17210c {
        @NotNull
        /* JADX INFO: renamed from: a */
        gzg0 mo112331a(@NotNull C17209b configuration);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    fzg0 mo3891C();

    @NotNull
    /* JADX INFO: renamed from: W */
    fzg0 mo3892W();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean enabled);

    /* JADX INFO: renamed from: l.gzg0$b */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m87232d2 = {"Ll/gzg0$b;", "", "Landroid/content/Context;", "context", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/gzg0$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/gzg0$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ll/gzg0$a;", Constants.INAPP_DATA_TAG, "Z", "e", "Companion", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17209b {

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
        public final AbstractC17208a callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        public final boolean useNoBackupDirectory;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        public final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: l.gzg0$b$a */
        @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/gzg0$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/gzg0$b;", "b", "()Ll/gzg0$b;", "", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/gzg0$b$a;", "Ll/gzg0$a;", "callback", "c", "(Ll/gzg0$a;)Ll/gzg0$b$a;", "", "useNoBackupDirectory", "e", "(Z)Ll/gzg0$b$a;", "allowDataLossOnRecovery", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Ll/gzg0$a;", "Z", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Context context;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public String name;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public AbstractC17208a callback;

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
            public a m128862a(boolean allowDataLossOnRecovery) {
                this.allowDataLossOnRecovery = allowDataLossOnRecovery;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public C17209b m128863b() {
                String str;
                AbstractC17208a abstractC17208a = this.callback;
                if (abstractC17208a == null) {
                    ig3.m135964a("Must set a callback to create the configuration.");
                    return null;
                }
                if (!this.useNoBackupDirectory || ((str = this.name) != null && str.length() != 0)) {
                    return new C17209b(this.context, this.name, abstractC17208a, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
                }
                ig3.m135964a("Must set a non-null database name to a configuration that uses the no backup directory.");
                return null;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public a m128864c(@NotNull AbstractC17208a callback) {
                callback.getClass();
                this.callback = callback;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public a m128865d(@Nullable String name) {
                this.name = name;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public a m128866e(boolean useNoBackupDirectory) {
                this.useNoBackupDirectory = useNoBackupDirectory;
                return this;
            }
        }

        public C17209b(@NotNull Context context, @Nullable String str, @NotNull AbstractC17208a abstractC17208a, boolean z, boolean z2) {
            context.getClass();
            abstractC17208a.getClass();
            this.context = context;
            this.name = str;
            this.callback = abstractC17208a;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z2;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final a m128861a(@NotNull Context context) {
            return INSTANCE.m128867a(context);
        }

        /* JADX INFO: renamed from: l.gzg0$b$b, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/gzg0$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/gzg0$b$a;", "a", "(Landroid/content/Context;)Ll/gzg0$b$a;", "sqlite_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final a m128867a(@NotNull Context context) {
                context.getClass();
                return new a(context);
            }

            public Companion() {
            }
        }
    }
}
