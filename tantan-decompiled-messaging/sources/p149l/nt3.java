package p149l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B3\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Ll/nt3;", "", "Ll/hgy;", "Landroid/graphics/Bitmap;", "inAppImageMemoryV1", "", "inAppGifMemoryV1", "fileMemory", "<init>", "(Ll/hgy;Ll/hgy;Ll/hgy;)V", "Ll/qqm;", "Lkotlin/Pair;", "Ljava/io/File;", "h", "()Ll/qqm;", "f", Constants.INAPP_DATA_TAG, "Ll/m3e;", "g", "()Ll/m3e;", "e", "c", "a", "Ll/hgy;", "b", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class nt3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    private static nt3 f140328d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final hgy<Bitmap> inAppImageMemoryV1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final hgy<byte[]> inAppGifMemoryV1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final hgy<byte[]> fileMemory;

    private nt3(hgy<Bitmap> hgyVar, hgy<byte[]> hgyVar2, hgy<byte[]> hgyVar3) {
        this.inAppImageMemoryV1 = hgyVar;
        this.inAppGifMemoryV1 = hgyVar2;
        this.fileMemory = hgyVar3;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final m3e m160838c() {
        return this.fileMemory.mo116289a();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final qqm<Pair<byte[], File>> m160839d() {
        return this.fileMemory.mo116290b();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final m3e m160840e() {
        return this.inAppGifMemoryV1.mo116289a();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final qqm<Pair<byte[], File>> m160841f() {
        return this.inAppGifMemoryV1.mo116290b();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final m3e m160842g() {
        return this.inAppImageMemoryV1.mo116289a();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final qqm<Pair<Bitmap, File>> m160843h() {
        return this.inAppImageMemoryV1.mo116290b();
    }

    /* JADX INFO: renamed from: l.nt3$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/nt3$a;", "", "<init>", "()V", "Ll/hgy;", "Landroid/graphics/Bitmap;", "inAppImageMemoryV1", "", "inAppGifMemoryV1", "fileMemory", "Ll/nt3;", "a", "(Ll/hgy;Ll/hgy;Ll/hgy;)Ll/nt3;", "ctCaches", "Ll/nt3;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final nt3 m160844a(@NotNull hgy<Bitmap> inAppImageMemoryV1, @NotNull hgy<byte[]> inAppGifMemoryV1, @NotNull hgy<byte[]> fileMemory) {
            inAppImageMemoryV1.getClass();
            inAppGifMemoryV1.getClass();
            fileMemory.getClass();
            if (nt3.f140328d == null) {
                synchronized (this) {
                    try {
                        if (nt3.f140328d == null) {
                            nt3.f140328d = new nt3(inAppImageMemoryV1, inAppGifMemoryV1, fileMemory, null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            nt3 nt3Var = nt3.f140328d;
            nt3Var.getClass();
            return nt3Var;
        }

        private Companion() {
        }
    }

    public /* synthetic */ nt3(hgy hgyVar, hgy hgyVar2, hgy hgyVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(hgyVar, hgyVar2, hgyVar3);
    }
}
