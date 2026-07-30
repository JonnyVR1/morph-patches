package p153l;

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
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/hii;", "Ll/dy2;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "", "size", "()J", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "()Ljava/io/File;", "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class hii implements dy2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    public hii(File file) {
        this.file = file;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final hii m135123b(@NotNull File file) {
        return INSTANCE.m135126a(file);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final hii m135124c(@Nullable File file) {
        return INSTANCE.m135127b(file);
    }

    @Override // p153l.dy2
    @NotNull
    /* JADX INFO: renamed from: a */
    public InputStream mo118582a() throws IOException {
        return new FileInputStream(this.file);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof hii)) {
            return false;
        }
        return Intrinsics.m88377d(this.file, ((hii) other).file);
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // p153l.dy2
    public long size() {
        return this.file.length();
    }

    /* JADX INFO: renamed from: l.hii$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m88121d2 = {"Ll/hii$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ll/hii;", "b", "(Ljava/io/File;)Ll/hii;", "a", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final hii m135126a(@NotNull File file) {
            file.getClass();
            return new hii(file, null);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final hii m135127b(@Nullable File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new hii(file, defaultConstructorMarker);
            }
            return null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ hii(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }
}
