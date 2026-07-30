package androidx.room;

import android.content.Context;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p118io.CloseableKt;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b0c;
import p149l.b2s;
import p149l.etd;
import p149l.fzg0;
import p149l.gzg0;
import p149l.hj10;
import p149l.jc90;
import p149l.pkq0;
import p149l.qkq0;
import p149l.r5j;
import p149l.shi;

/* JADX INFO: renamed from: androidx.room.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, m87232d2 = {"Landroidx/room/j;", "Ll/gzg0;", "Ll/etd;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILl/gzg0;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "Landroidx/room/b;", "databaseConfiguration", "g", "(Landroidx/room/b;)V", "writable", "h", "destinationFile", "b", "(Ljava/io/File;Z)V", "databaseFile", "e", Constants.INAPP_DATA_TAG, "(Ljava/io/File;)Ll/gzg0;", "a", "Landroid/content/Context;", "Ljava/lang/String;", "c", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "I", "f", "Ll/gzg0;", "getDelegate", "()Ll/gzg0;", "Landroidx/room/b;", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ll/fzg0;", b2s.C_ZONE, "()Ll/fzg0;", "writableDatabase", "W", "readableDatabase", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0673j implements gzg0, etd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final File copyFromFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int databaseVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final gzg0 delegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public C0665b databaseConfiguration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean verified;

    /* JADX INFO: renamed from: androidx.room.j$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, m87232d2 = {"androidx/room/j$a", "Ll/gzg0$a;", "Ll/fzg0;", "db", "", Constants.INAPP_DATA_TAG, "(Ll/fzg0;)V", "", "oldVersion", "newVersion", "g", "(Ll/fzg0;II)V", "f", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a extends gzg0.AbstractC17208a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f3065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(i2);
            this.f3065b = i;
        }

        @Override // p149l.gzg0.AbstractC17208a
        /* JADX INFO: renamed from: d */
        public void mo3996d(@NotNull fzg0 db) {
            db.getClass();
        }

        @Override // p149l.gzg0.AbstractC17208a
        /* JADX INFO: renamed from: f */
        public void mo3998f(@NotNull fzg0 db) {
            db.getClass();
            int i = this.f3065b;
            if (i < 1) {
                db.setVersion(i);
            }
        }

        @Override // p149l.gzg0.AbstractC17208a
        /* JADX INFO: renamed from: g */
        public void mo3999g(@NotNull fzg0 db, int oldVersion, int newVersion) {
            db.getClass();
        }
    }

    public C0673j(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i, @NotNull gzg0 gzg0Var) {
        context.getClass();
        gzg0Var.getClass();
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i;
        this.delegate = gzg0Var;
    }

    @Override // p149l.gzg0
    @NotNull
    /* JADX INFO: renamed from: C */
    public fzg0 mo3891C() {
        if (!this.verified) {
            m4016h(true);
            this.verified = true;
        }
        return getDelegate().mo3891C();
    }

    @Override // p149l.gzg0
    @NotNull
    /* JADX INFO: renamed from: W */
    public fzg0 mo3892W() {
        if (!this.verified) {
            m4016h(false);
            this.verified = true;
        }
        return getDelegate().mo3892W();
    }

    /* JADX INFO: renamed from: b */
    public final void m4012b(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            readableByteChannelNewChannel.getClass();
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            readableByteChannelNewChannel.getClass();
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                qkq0.m175383a("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                return;
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                readableByteChannelNewChannel.getClass();
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        channel.getClass();
        shi.m184192a(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            hj10.m131352a("Failed to create directories for ", destinationFile.getAbsolutePath());
            return;
        }
        m4014e(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    @Override // p149l.gzg0, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    /* JADX INFO: renamed from: d */
    public final gzg0 m4013d(File databaseFile) {
        try {
            int iM99747c = b0c.m99747c(databaseFile);
            return new r5j().mo112331a(gzg0.C17209b.INSTANCE.m128867a(this.context).m128865d(databaseFile.getAbsolutePath()).m128864c(new a(iM99747c, C15167a.m87596b(iM99747c, 1))).m128863b());
        } catch (IOException e) {
            pkq0.m170054a("Malformed database file, unable to read version.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4014e(File databaseFile, boolean writable) {
        C0665b c0665b = this.databaseConfiguration;
        if (c0665b == null) {
            Intrinsics.m87502r("databaseConfiguration");
            c0665b = null;
        }
        if (c0665b.prepackagedDatabaseCallback == null) {
            return;
        }
        gzg0 gzg0VarM4013d = m4013d(databaseFile);
        try {
            fzg0 fzg0VarMo3891C = writable ? gzg0VarM4013d.mo3891C() : gzg0VarM4013d.mo3892W();
            C0665b c0665b2 = this.databaseConfiguration;
            if (c0665b2 == null) {
                Intrinsics.m87502r("databaseConfiguration");
                c0665b2 = null;
            }
            RoomDatabase.AbstractC0660e abstractC0660e = c0665b2.prepackagedDatabaseCallback;
            abstractC0660e.getClass();
            abstractC0660e.m3927a(fzg0VarMo3891C);
            Unit unit = Unit.INSTANCE;
            CloseableKt.m87404a(gzg0VarM4013d, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(gzg0VarM4013d, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4015g(@NotNull C0665b databaseConfiguration) {
        databaseConfiguration.getClass();
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // p149l.gzg0
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() {
        return getDelegate().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
    }

    @Override // p149l.etd
    @NotNull
    public gzg0 getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: h */
    public final void m4016h(boolean writable) {
        String str = getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
        if (str == null) {
            qkq0.m175383a("Required value was null.");
            return;
        }
        File databasePath = this.context.getDatabasePath(str);
        C0665b c0665b = this.databaseConfiguration;
        C0665b c0665b2 = null;
        if (c0665b == null) {
            Intrinsics.m87502r("databaseConfiguration");
            c0665b = null;
        }
        jc90 jc90Var = new jc90(str, this.context.getFilesDir(), c0665b.multiInstanceInvalidation);
        try {
            jc90.m140873c(jc90Var, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    m4012b(databasePath, writable);
                    jc90Var.m140875d();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                int iM99747c = b0c.m99747c(databasePath);
                if (iM99747c == this.databaseVersion) {
                    jc90Var.m140875d();
                    return;
                }
                C0665b c0665b3 = this.databaseConfiguration;
                if (c0665b3 == null) {
                    Intrinsics.m87502r("databaseConfiguration");
                } else {
                    c0665b2 = c0665b3;
                }
                if (c0665b2.m3938a(iM99747c, this.databaseVersion)) {
                    jc90Var.m140875d();
                    return;
                }
                if (this.context.deleteDatabase(str)) {
                    try {
                        m4012b(databasePath, writable);
                    } catch (IOException unused) {
                    }
                }
                jc90Var.m140875d();
            } catch (IOException unused2) {
                jc90Var.m140875d();
            }
        } catch (Throwable th) {
            jc90Var.m140875d();
            throw th;
        }
    }

    @Override // p149l.gzg0
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
