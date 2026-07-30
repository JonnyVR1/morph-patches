package p153l;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/tpy;", "", "<init>", "()V", "Companion", "a", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tpy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.tpy$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, m88121d2 = {"Ll/tpy$a;", "", "<init>", "()V", "Ljava/io/File;", "diskMemoryLocation", "Ll/axl;", "logger", "Ll/epy;", "", "b", "(Ljava/io/File;Ll/axl;)Ll/epy;", "Landroid/graphics/Bitmap;", "c", "a", "", "IMAGE_CACHE_MIN_KB", "J", "GIF_CACHE_MIN_KB", "FILE_CACHE_MIN_KB", "IMAGE_SIZE_MAX_DISK", "FILE_SIZE_MAX_DISK", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final epy<byte[]> m192219a(@NotNull File diskMemoryLocation, @Nullable axl logger) {
            diskMemoryLocation.getClass();
            return new bji(new spy(15360L, Runtime.getRuntime().maxMemory() / 32768, 5120L, diskMemoryLocation), logger);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final epy<byte[]> m192220b(@NotNull File diskMemoryLocation, @Nullable axl logger) {
            diskMemoryLocation.getClass();
            return new xqm(new spy(5120L, Runtime.getRuntime().maxMemory() / 32768, 5120L, diskMemoryLocation), logger);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final epy<Bitmap> m192221c(@NotNull File diskMemoryLocation, @Nullable axl logger) {
            diskMemoryLocation.getClass();
            return new zqm(new spy(20480L, Runtime.getRuntime().maxMemory() / 32768, 5120L, diskMemoryLocation), logger);
        }

        private Companion() {
        }
    }
}
