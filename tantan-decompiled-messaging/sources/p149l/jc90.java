package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001b"}, m87232d2 = {"Ll/jc90;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ljava/io/File;", "lockDir", "", "processLock", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "", "b", "(Z)V", Constants.INAPP_DATA_TAG, "()V", "a", "Z", "Ljava/io/File;", "lockFile", "Ljava/util/concurrent/locks/Lock;", "c", "Ljava/util/concurrent/locks/Lock;", "threadLock", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "lockChannel", "Companion", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class jc90 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<String, Lock> f117278e = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean processLock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final File lockFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lock threadLock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public FileChannel lockChannel;

    public jc90(@NotNull String str, @Nullable File file, boolean z) {
        File file2;
        str.getClass();
        this.processLock = z;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.lockFile = file2;
        this.threadLock = INSTANCE.m140877b(str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m140873c(jc90 jc90Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = jc90Var.processLock;
        }
        jc90Var.m140874b(z);
    }

    /* JADX INFO: renamed from: b */
    public final void m140874b(boolean processLock) {
        this.threadLock.lock();
        if (processLock) {
            try {
                File file = this.lockFile;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.lockFile).getChannel();
                channel.lock();
                this.lockChannel = channel;
            } catch (IOException unused) {
                this.lockChannel = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m140875d() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }

    /* JADX INFO: renamed from: l.jc90$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/jc90$a;", "", "<init>", "()V", "", Constants.KEY_KEY, "Ljava/util/concurrent/locks/Lock;", "b", "(Ljava/lang/String;)Ljava/util/concurrent/locks/Lock;", "TAG", "Ljava/lang/String;", "", "threadLocksMap", "Ljava/util/Map;", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Lock m140877b(String key) {
            Lock lock;
            synchronized (jc90.f117278e) {
                try {
                    Map map = jc90.f117278e;
                    Object reentrantLock = map.get(key);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(key, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public Companion() {
        }
    }
}
