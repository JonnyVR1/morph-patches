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
import kotlin.p122io.CloseableKt;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.l8j;
import p153l.n7h0;
import p153l.nk90;
import p153l.o1c;
import p153l.o7h0;
import p153l.pki;
import p153l.rr10;
import p153l.sud;
import p153l.vtq0;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.room.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, m88121d2 = {"Landroidx/room/j;", "Ll/o7h0;", "Ll/sud;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILl/o7h0;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "Landroidx/room/b;", "databaseConfiguration", "g", "(Landroidx/room/b;)V", "writable", "h", "destinationFile", "b", "(Ljava/io/File;Z)V", "databaseFile", "e", Constants.INAPP_DATA_TAG, "(Ljava/io/File;)Ll/o7h0;", "a", "Landroid/content/Context;", "Ljava/lang/String;", "c", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "I", "f", "Ll/o7h0;", "getDelegate", "()Ll/o7h0;", "Landroidx/room/b;", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ll/n7h0;", c4s.C_ZONE, "()Ll/n7h0;", "writableDatabase", "X", "readableDatabase", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C0675j implements o7h0, sud {

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
    public final o7h0 delegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public C0667b databaseConfiguration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean verified;

    /* JADX INFO: renamed from: androidx.room.j$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, m88121d2 = {"androidx/room/j$a", "Ll/o7h0$a;", "Ll/n7h0;", "db", "", Constants.INAPP_DATA_TAG, "(Ll/n7h0;)V", "", "oldVersion", "newVersion", "g", "(Ll/n7h0;II)V", "f", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class a extends o7h0.AbstractC19043a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f3065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(i2);
            this.f3065b = i;
        }

        @Override // p153l.o7h0.AbstractC19043a
        /* JADX INFO: renamed from: d */
        public void mo3998d(@NotNull n7h0 db) {
            db.getClass();
        }

        @Override // p153l.o7h0.AbstractC19043a
        /* JADX INFO: renamed from: f */
        public void mo4000f(@NotNull n7h0 db) {
            db.getClass();
            int i = this.f3065b;
            if (i < 1) {
                db.setVersion(i);
            }
        }

        @Override // p153l.o7h0.AbstractC19043a
        /* JADX INFO: renamed from: g */
        public void mo4001g(@NotNull n7h0 db, int oldVersion, int newVersion) {
            db.getClass();
        }
    }

    public C0675j(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i, @NotNull o7h0 o7h0Var) {
        context.getClass();
        o7h0Var.getClass();
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i;
        this.delegate = o7h0Var;
    }

    @Override // p153l.o7h0
    @NotNull
    /* JADX INFO: renamed from: C */
    public n7h0 mo3892C() {
        if (!this.verified) {
            m4018h(true);
            this.verified = true;
        }
        return getDelegate().mo3892C();
    }

    @Override // p153l.o7h0
    @NotNull
    /* JADX INFO: renamed from: X */
    public n7h0 mo3893X() {
        if (!this.verified) {
            m4018h(false);
            this.verified = true;
        }
        return getDelegate().mo3893X();
    }

    /* JADX INFO: renamed from: b */
    public final void m4014b(File destinationFile, boolean writable) throws IOException {
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
                wtq0.m207906a("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
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
        pki.m172598a(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            rr10.m182681a("Failed to create directories for ", destinationFile.getAbsolutePath());
            return;
        }
        m4016e(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    @Override // p153l.o7h0, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    /* JADX INFO: renamed from: d */
    public final o7h0 m4015d(File databaseFile) {
        try {
            int iM165593c = o1c.m165593c(databaseFile);
            return new l8j().mo104496a(o7h0.C19044b.INSTANCE.m166346a(this.context).m166344d(databaseFile.getAbsolutePath()).m166343c(new a(iM165593c, C15274a.m88486b(iM165593c, 1))).m166342b());
        } catch (IOException e) {
            vtq0.m202761a("Malformed database file, unable to read version.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4016e(File databaseFile, boolean writable) {
        C0667b c0667b = this.databaseConfiguration;
        if (c0667b == null) {
            Intrinsics.m88391r("databaseConfiguration");
            c0667b = null;
        }
        if (c0667b.prepackagedDatabaseCallback == null) {
            return;
        }
        o7h0 o7h0VarM4015d = m4015d(databaseFile);
        try {
            n7h0 n7h0VarMo3892C = writable ? o7h0VarM4015d.mo3892C() : o7h0VarM4015d.mo3893X();
            C0667b c0667b2 = this.databaseConfiguration;
            if (c0667b2 == null) {
                Intrinsics.m88391r("databaseConfiguration");
                c0667b2 = null;
            }
            RoomDatabase.AbstractC0662e abstractC0662e = c0667b2.prepackagedDatabaseCallback;
            abstractC0662e.getClass();
            abstractC0662e.m3929a(n7h0VarMo3892C);
            Unit unit = Unit.INSTANCE;
            CloseableKt.m88293a(o7h0VarM4015d, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(o7h0VarM4015d, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4017g(@NotNull C0667b databaseConfiguration) {
        databaseConfiguration.getClass();
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // p153l.o7h0
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() {
        return getDelegate().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
    }

    @Override // p153l.sud
    @NotNull
    public o7h0 getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: h */
    public final void m4018h(boolean writable) {
        String str = getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
        if (str == null) {
            wtq0.m207906a("Required value was null.");
            return;
        }
        File databasePath = this.context.getDatabasePath(str);
        C0667b c0667b = this.databaseConfiguration;
        C0667b c0667b2 = null;
        if (c0667b == null) {
            Intrinsics.m88391r("databaseConfiguration");
            c0667b = null;
        }
        nk90 nk90Var = new nk90(str, this.context.getFilesDir(), c0667b.multiInstanceInvalidation);
        try {
            nk90.m163592c(nk90Var, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    m4014b(databasePath, writable);
                    nk90Var.m163594d();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                int iM165593c = o1c.m165593c(databasePath);
                if (iM165593c == this.databaseVersion) {
                    nk90Var.m163594d();
                    return;
                }
                C0667b c0667b3 = this.databaseConfiguration;
                if (c0667b3 == null) {
                    Intrinsics.m88391r("databaseConfiguration");
                } else {
                    c0667b2 = c0667b3;
                }
                if (c0667b2.m3940a(iM165593c, this.databaseVersion)) {
                    nk90Var.m163594d();
                    return;
                }
                if (this.context.deleteDatabase(str)) {
                    try {
                        m4014b(databasePath, writable);
                    } catch (IOException unused) {
                    }
                }
                nk90Var.m163594d();
            } catch (IOException unused2) {
                nk90Var.m163594d();
            }
        } catch (Throwable th) {
            nk90Var.m163594d();
            throw th;
        }
    }

    @Override // p153l.o7h0
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
