package p153l;

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
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B3\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/mu3;", "", "Ll/epy;", "Landroid/graphics/Bitmap;", "inAppImageMemoryV1", "", "inAppGifMemoryV1", "fileMemory", "<init>", "(Ll/epy;Ll/epy;Ll/epy;)V", "Ll/ssm;", "Lkotlin/Pair;", "Ljava/io/File;", "h", "()Ll/ssm;", "f", Constants.INAPP_DATA_TAG, "Ll/a5e;", "g", "()Ll/a5e;", "e", "c", "a", "Ll/epy;", "b", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class mu3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    private static mu3 f138717d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final epy<Bitmap> inAppImageMemoryV1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final epy<byte[]> inAppGifMemoryV1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final epy<byte[]> fileMemory;

    private mu3(epy<Bitmap> epyVar, epy<byte[]> epyVar2, epy<byte[]> epyVar3) {
        this.inAppImageMemoryV1 = epyVar;
        this.inAppGifMemoryV1 = epyVar2;
        this.fileMemory = epyVar3;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final a5e m160069c() {
        return this.fileMemory.mo104626a();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ssm<Pair<byte[], File>> m160070d() {
        return this.fileMemory.mo104627b();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final a5e m160071e() {
        return this.inAppGifMemoryV1.mo104626a();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ssm<Pair<byte[], File>> m160072f() {
        return this.inAppGifMemoryV1.mo104627b();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final a5e m160073g() {
        return this.inAppImageMemoryV1.mo104626a();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ssm<Pair<Bitmap, File>> m160074h() {
        return this.inAppImageMemoryV1.mo104627b();
    }

    /* JADX INFO: renamed from: l.mu3$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/mu3$a;", "", "<init>", "()V", "Ll/epy;", "Landroid/graphics/Bitmap;", "inAppImageMemoryV1", "", "inAppGifMemoryV1", "fileMemory", "Ll/mu3;", "a", "(Ll/epy;Ll/epy;Ll/epy;)Ll/mu3;", "ctCaches", "Ll/mu3;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final mu3 m160075a(@NotNull epy<Bitmap> inAppImageMemoryV1, @NotNull epy<byte[]> inAppGifMemoryV1, @NotNull epy<byte[]> fileMemory) {
            inAppImageMemoryV1.getClass();
            inAppGifMemoryV1.getClass();
            fileMemory.getClass();
            if (mu3.f138717d == null) {
                synchronized (this) {
                    try {
                        if (mu3.f138717d == null) {
                            mu3.f138717d = new mu3(inAppImageMemoryV1, inAppGifMemoryV1, fileMemory, null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            mu3 mu3Var = mu3.f138717d;
            mu3Var.getClass();
            return mu3Var;
        }

        private Companion() {
        }
    }

    public /* synthetic */ mu3(epy epyVar, epy epyVar2, epy epyVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(epyVar, epyVar2, epyVar3);
    }
}
