package p153l;

import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.facebook.C1600c;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1680e;
import com.p051p1.mobile.putong.core.data.Condition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\b\u001d\u001f!%(\u000b/\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u001c\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103¨\u00066"}, m88121d2 = {"Ll/zii;", "", "", "tag", "Ll/zii$e;", "limits", "<init>", "(Ljava/lang/String;Ll/zii$e;)V", Constants.KEY_KEY, "contentTag", "Ljava/io/InputStream;", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;", "input", "h", "(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;", "toString", "()Ljava/lang/String;", "Ljava/io/File;", "buffer", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Ljava/io/File;)V", "k", "()V", "m", "a", "Ljava/lang/String;", "b", "Ll/zii$e;", "c", "Ljava/io/File;", "directory", "", Constants.INAPP_DATA_TAG, "Z", "isTrimPending", "e", "isTrimInProgress", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "g", "Ljava/util/concurrent/locks/Condition;", Condition.TYPE, "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastClearCacheTime", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class zii {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final String f204564i = zii.class.getSimpleName();

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final AtomicLong f204565j = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C21821e limits;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final File directory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isTrimPending;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isTrimInProgress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final java.util.concurrent.locks.Condition condition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicLong lastClearCacheTime;

    /* JADX INFO: renamed from: l.zii$a */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m88121d2 = {"Ll/zii$a;", "", "<init>", "()V", "Ljava/io/File;", "root", "", "c", "(Ljava/io/File;)V", "Ljava/io/FilenameFilter;", Constants.INAPP_DATA_TAG, "()Ljava/io/FilenameFilter;", "e", "f", "(Ljava/io/File;)Ljava/io/File;", "a", "Ljava/io/FilenameFilter;", "filterExcludeBufferFiles", "b", "filterExcludeNonBufferFiles", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21817a {

        @NotNull
        public static final C21817a INSTANCE = new C21817a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() { // from class: l.xii
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return zii.C21817a.m219900a(file, str);
            }
        };

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() { // from class: l.yii
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return zii.C21817a.m219901b(file, str);
            }
        };

        /* JADX INFO: renamed from: a */
        public static boolean m219900a(File file, String str) {
            str.getClass();
            return !C15493d.m94374J(str, "buffer", false, 2, null);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m219901b(File file, String str) {
            str.getClass();
            return C15493d.m94374J(str, "buffer", false, 2, null);
        }

        /* JADX INFO: renamed from: c */
        public final void m219902c(@NotNull File root) {
            root.getClass();
            File[] fileArrListFiles = root.listFiles(m219904e());
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final FilenameFilter m219903d() {
            return filterExcludeBufferFiles;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final FilenameFilter m219904e() {
            return filterExcludeNonBufferFiles;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final File m219905f(@Nullable File root) {
            return new File(root, "buffer" + zii.f204565j.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: l.zii$e */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000f"}, m88121d2 = {"Ll/zii$e;", "", "<init>", "()V", "", "value", "a", "I", "()I", "setByteCount", "(I)V", "byteCount", "b", "setFileCount", "fileCount", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21821e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int byteCount = 1048576;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int fileCount = 1024;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getByteCount() {
            return this.byteCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFileCount() {
            return this.fileCount;
        }
    }

    /* JADX INFO: renamed from: l.zii$f */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/zii$f;", "", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "another", "", "a", "(Ll/zii$f;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/io/File;", "b", "()Ljava/io/File;", "", "J", "f", "()J", "modified", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21822f implements Comparable<C21822f> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final File file;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long modified;

        public C21822f(@NotNull File file) {
            file.getClass();
            this.file = file;
            this.modified = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull C21822f another) {
            another.getClass();
            long j = this.modified;
            long j2 = another.modified;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.file.compareTo(another.file);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        public boolean equals(@Nullable Object another) {
            return (another instanceof C21822f) && compareTo((C21822f) another) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getModified() {
            return this.modified;
        }

        public int hashCode() {
            return ((1073 + this.file.hashCode()) * 37) + ((int) (this.modified % 2147483647L));
        }
    }

    /* JADX INFO: renamed from: l.zii$g */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Ll/zii$g;", "", "", "onClose", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC21823g {
        void onClose();
    }

    /* JADX INFO: renamed from: l.zii$h */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/zii$h;", "", "<init>", "()V", "Ljava/io/OutputStream;", "stream", "Lorg/json/JSONObject;", "header", "", "b", "(Ljava/io/OutputStream;Lorg/json/JSONObject;)V", "Ljava/io/InputStream;", "a", "(Ljava/io/InputStream;)Lorg/json/JSONObject;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21824h {

        @NotNull
        public static final C21824h INSTANCE = new C21824h();

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JSONObject m219912a(@NotNull InputStream stream) throws IOException {
            stream.getClass();
            if (stream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = stream.read();
                if (i4 == -1) {
                    rzv.Companion companion = rzv.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String strM219906a = zii.INSTANCE.m219906a();
                    strM219906a.getClass();
                    companion.m183848b(loggingBehavior, strM219906a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (i4 & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int i5 = stream.read(bArr, i, i2 - i);
                if (i5 < 1) {
                    rzv.Companion companion2 = rzv.INSTANCE;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String strM219906a2 = zii.INSTANCE.m219906a();
                    strM219906a2.getClass();
                    companion2.m183848b(loggingBehavior2, strM219906a2, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += i5;
            }
            try {
                Object objNextValue = new JSONTokener(new String(bArr, Charsets.UTF_8)).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return (JSONObject) objNextValue;
                }
                rzv.Companion companion3 = rzv.INSTANCE;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                String strM219906a3 = zii.INSTANCE.m219906a();
                strM219906a3.getClass();
                companion3.m183848b(loggingBehavior3, strM219906a3, "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                zpg0.m220844a(e.getMessage());
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m219913b(@NotNull OutputStream stream, @NotNull JSONObject header) throws IOException {
            stream.getClass();
            header.getClass();
            String string = header.toString();
            string.getClass();
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            bytes.getClass();
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write(bytes.length & 255);
            stream.write(bytes);
        }
    }

    /* JADX INFO: renamed from: l.zii$i */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/zii$i", "Ll/zii$g;", "", "onClose", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21825i implements InterfaceC21823g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f204584a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zii f204585b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f204586c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f204587d;

        public C21825i(long j, zii ziiVar, File file, String str) {
            this.f204584a = j;
            this.f204585b = ziiVar;
            this.f204586c = file;
            this.f204587d = str;
        }

        @Override // p153l.zii.InterfaceC21823g
        public void onClose() {
            if (this.f204584a < this.f204585b.lastClearCacheTime.get()) {
                this.f204586c.delete();
            } else {
                this.f204585b.m219898l(this.f204587d, this.f204586c);
            }
        }
    }

    public zii(@NotNull String str, @NotNull C21821e c21821e) {
        str.getClass();
        c21821e.getClass();
        this.tag = str;
        this.limits = c21821e;
        File file = new File(C1600c.m8106q(), str);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            C21817a.INSTANCE.m219902c(file);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m219887a(zii ziiVar) {
        ziiVar.getClass();
        ziiVar.m219899m();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InputStream m219892g(zii ziiVar, String str, String str2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return ziiVar.m219894f(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ OutputStream m219893j(zii ziiVar, String str, String str2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return ziiVar.m219896i(str, str2);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: f */
    public final InputStream m219894f(@NotNull String key, @Nullable String contentTag) throws IOException {
        key.getClass();
        File file = new File(this.directory, C1680e.m8903m0(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject jSONObjectM219912a = C21824h.INSTANCE.m219912a(bufferedInputStream);
                if (jSONObjectM219912a == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!Intrinsics.m88377d(jSONObjectM219912a.optString(Constants.KEY_KEY), key)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = jSONObjectM219912a.optString("tag", null);
                if (contentTag == null && !Intrinsics.m88377d(contentTag, strOptString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                rzv.Companion companion = rzv.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = f204564i;
                str.getClass();
                companion.m183848b(loggingBehavior, str, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InputStream m219895h(@NotNull String key, @NotNull InputStream input) throws IOException {
        key.getClass();
        input.getClass();
        return new C21820d(input, m219893j(this, key, null, 2, null));
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: i */
    public final OutputStream m219896i(@NotNull String key, @Nullable String contentTag) throws IOException {
        key.getClass();
        File fileM219905f = C21817a.INSTANCE.m219905f(this.directory);
        fileM219905f.delete();
        if (!fileM219905f.createNewFile()) {
            rr10.m182681a("Could not create file at ", fileM219905f.getAbsolutePath());
            return null;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C21818b(new FileOutputStream(fileM219905f), new C21825i(System.currentTimeMillis(), this, fileM219905f, key)), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.KEY_KEY, key);
                    if (!C1680e.m8886c0(contentTag)) {
                        jSONObject.put("tag", contentTag);
                    }
                    C21824h.INSTANCE.m219913b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    rzv.Companion companion = rzv.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = f204564i;
                    str.getClass();
                    companion.m183847a(loggingBehavior, 5, str, "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            rzv.Companion companion2 = rzv.INSTANCE;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
            String str2 = f204564i;
            str2.getClass();
            companion2.m183847a(loggingBehavior2, 5, str2, "Error creating buffer output stream: " + e2);
            zpg0.m220844a(e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m219897k() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                C1600c.m8110u().execute(new Runnable() { // from class: l.wii
                    @Override // java.lang.Runnable
                    public final void run() {
                        zii.m219887a(this.f189360a);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m219898l(String key, File buffer) {
        if (!buffer.renameTo(new File(this.directory, C1680e.m8903m0(key)))) {
            buffer.delete();
        }
        m219897k();
    }

    /* JADX INFO: renamed from: m */
    public final void m219899m() {
        long j;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            try {
                rzv.Companion companion = rzv.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = f204564i;
                str.getClass();
                companion.m183848b(loggingBehavior, str, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] fileArrListFiles = this.directory.listFiles(C21817a.INSTANCE.m219903d());
                long length = 0;
                if (fileArrListFiles != null) {
                    j = 0;
                    for (File file : fileArrListFiles) {
                        file.getClass();
                        C21822f c21822f = new C21822f(file);
                        priorityQueue.add(c21822f);
                        rzv.Companion companion2 = rzv.INSTANCE;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                        String str2 = f204564i;
                        str2.getClass();
                        companion2.m183848b(loggingBehavior2, str2, "  trim considering time=" + Long.valueOf(c21822f.getModified()) + " name=" + c21822f.getFile().getName());
                        length += file.length();
                        j++;
                    }
                } else {
                    j = 0;
                }
                while (true) {
                    if (length <= this.limits.getByteCount() && j <= this.limits.getFileCount()) {
                        ReentrantLock reentrantLock2 = this.lock;
                        reentrantLock2.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                    File file2 = ((C21822f) priorityQueue.remove()).getFile();
                    rzv.Companion companion3 = rzv.INSTANCE;
                    LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                    String str3 = f204564i;
                    str3.getClass();
                    companion3.m183848b(loggingBehavior3, str3, "  trim removing " + file2.getName());
                    length -= file2.length();
                    j += -1;
                    file2.delete();
                }
            } catch (Throwable th) {
                ReentrantLock reentrantLock3 = this.lock;
                reentrantLock3.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                } finally {
                    reentrantLock3.unlock();
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + '}';
    }

    /* JADX INFO: renamed from: l.zii$c, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/zii$c;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "HEADER_CACHEKEY_KEY", "HEADER_CACHE_CONTENT_TAG_KEY", "Ljava/util/concurrent/atomic/AtomicLong;", "bufferIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m219906a() {
            return zii.f204564i;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l.zii$b */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/zii$b;", "Ljava/io/OutputStream;", "innerStream", "Ll/zii$g;", "callback", "<init>", "(Ljava/io/OutputStream;Ll/zii$g;)V", "", "close", "()V", "flush", "", "buffer", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "count", "write", "([BII)V", "([B)V", "oneByte", "(I)V", "a", "Ljava/io/OutputStream;", "getInnerStream", "()Ljava/io/OutputStream;", "b", "Ll/zii$g;", "getCallback", "()Ll/zii$g;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21818b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final OutputStream innerStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC21823g callback;

        public C21818b(@NotNull OutputStream outputStream, @NotNull InterfaceC21823g interfaceC21823g) {
            outputStream.getClass();
            interfaceC21823g.getClass();
            this.innerStream = outputStream;
            this.callback = interfaceC21823g;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.innerStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] buffer, int offset, int count) throws IOException {
            buffer.getClass();
            this.innerStream.write(buffer, offset, count);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] buffer) throws IOException {
            buffer.getClass();
            this.innerStream.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int oneByte) throws IOException {
            this.innerStream.write(oneByte);
        }
    }

    /* JADX INFO: renamed from: l.zii$d */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m88121d2 = {"Ll/zii$d;", "Ljava/io/InputStream;", "input", "Ljava/io/OutputStream;", "output", "<init>", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "", "available", "()I", "", "close", "()V", "readlimit", "mark", "(I)V", "", "markSupported", "()Z", "", "buffer", "read", "([B)I", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "length", "([BII)I", "reset", "", "byteCount", FreeSpaceBox.TYPE, "(J)J", "a", "Ljava/io/InputStream;", "getInput", "()Ljava/io/InputStream;", "b", "Ljava/io/OutputStream;", "getOutput", "()Ljava/io/OutputStream;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21820d extends InputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InputStream input;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final OutputStream output;

        public C21820d(@NotNull InputStream inputStream, @NotNull OutputStream outputStream) {
            inputStream.getClass();
            outputStream.getClass();
            this.input = inputStream;
            this.output = outputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.input.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int readlimit) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] buffer) throws IOException {
            buffer.getClass();
            int i = this.input.read(buffer);
            if (i > 0) {
                this.output.write(buffer, 0, i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long byteCount) throws IOException {
            int i;
            byte[] bArr = new byte[1024];
            long j = 0;
            while (j < byteCount && (i = read(bArr, 0, (int) Math.min(byteCount - j, 1024L))) >= 0) {
                j += (long) i;
            }
            return j;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.input.read();
            if (i >= 0) {
                this.output.write(i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] buffer, int offset, int length) throws IOException {
            buffer.getClass();
            int i = this.input.read(buffer, offset, length);
            if (i > 0) {
                this.output.write(buffer, offset, i);
            }
            return i;
        }
    }
}
