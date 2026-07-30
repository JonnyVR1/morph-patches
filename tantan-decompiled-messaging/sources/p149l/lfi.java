package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/lfi;", "Ll/ox2;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "", "size", "()J", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "()Ljava/io/File;", "Companion", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lfi implements ox2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    public lfi(File file) {
        this.file = file;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final lfi m149698b(@NotNull File file) {
        return INSTANCE.m149702a(file);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final lfi m149699c(@Nullable File file) {
        return INSTANCE.m149703b(file);
    }

    @Override // p149l.ox2
    @NotNull
    /* JADX INFO: renamed from: a */
    public InputStream mo149700a() throws IOException {
        return new FileInputStream(this.file);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof lfi)) {
            return false;
        }
        return Intrinsics.m87488d(this.file, ((lfi) other).file);
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // p149l.ox2
    public long size() {
        return this.file.length();
    }

    /* JADX INFO: renamed from: l.lfi$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"Ll/lfi$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ll/lfi;", "b", "(Ljava/io/File;)Ll/lfi;", "a", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final lfi m149702a(@NotNull File file) {
            file.getClass();
            return new lfi(file, null);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final lfi m149703b(@Nullable File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new lfi(file, defaultConstructorMarker);
            }
            return null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ lfi(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }
}
