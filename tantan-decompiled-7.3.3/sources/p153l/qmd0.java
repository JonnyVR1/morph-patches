package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u001b"}, m88121d2 = {"Ll/qmd0;", "", "", BLiveGiftItem.TYPE_ROTATION, "", "deferUntilRendered", "<init>", "(IZ)V", "j", "()Z", RXScreenCaptureService.KEY_INDEX, "f", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "Z", "h", "forcedAngle", "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qmd0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final qmd0 f158337c = new qmd0(-1, false);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final qmd0 f158338d = new qmd0(-2, false);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final qmd0 f158339e = new qmd0(-1, true);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int rotation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean deferUntilRendered;

    public qmd0(int i, boolean z) {
        this.rotation = i;
        this.deferUntilRendered = z;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final qmd0 m177098d() {
        return INSTANCE.m177105a();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final qmd0 m177099e() {
        return INSTANCE.m177106b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final qmd0 m177100g() {
        return INSTANCE.m177107c();
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof qmd0)) {
            return false;
        }
        qmd0 qmd0Var = (qmd0) other;
        return this.rotation == qmd0Var.rotation && this.deferUntilRendered == qmd0Var.deferUntilRendered;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDeferUntilRendered() {
        return this.deferUntilRendered;
    }

    /* JADX INFO: renamed from: h */
    public final int m177102h() {
        if (!m177104j()) {
            return this.rotation;
        }
        wtq0.m207906a("Rotation is set to use EXIF");
        return 0;
    }

    public int hashCode() {
        return ryk.m183611b(Integer.valueOf(this.rotation), Boolean.valueOf(this.deferUntilRendered));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m177103i() {
        return this.rotation != -2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m177104j() {
        return this.rotation == -1;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.rotation), Boolean.valueOf(this.deferUntilRendered)}, 2));
    }

    /* JADX INFO: renamed from: l.qmd0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"Ll/qmd0$a;", "", "<init>", "()V", "Ll/qmd0;", "a", "()Ll/qmd0;", "c", "b", "", "NO_ROTATION", "I", "ROTATE_90", "ROTATE_180", "ROTATE_270", "USE_EXIF_ROTATION_ANGLE", "DISABLE_ROTATION", "ROTATION_OPTIONS_AUTO_ROTATE", "Ll/qmd0;", "ROTATION_OPTIONS_DISABLE_ROTATION", "ROTATION_OPTIONS_ROTATE_AT_RENDER_TIME", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final qmd0 m177105a() {
            return qmd0.f158337c;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final qmd0 m177106b() {
            return qmd0.f158339e;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final qmd0 m177107c() {
            return qmd0.f158338d;
        }

        public Companion() {
        }
    }
}
