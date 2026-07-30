package p149l;

import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0014B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001d\u0010\u000f¨\u0006!"}, m87232d2 = {"Ll/z4l0;", "", "", "width", "height", "", "factory", "frameRate", "bgColor", "<init>", "(IIFII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "f", "c", "F", "getFactory", "()F", Constants.INAPP_DATA_TAG, "e", "bitRate", "Companion", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class z4l0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final z4l0 f201608g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float factory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int frameRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int bgColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int bitRate;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f201608g = companion.m217103a(new Function1() { // from class: l.y4l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z4l0.m217096a((gh3) obj);
            }
        });
    }

    public /* synthetic */ z4l0(int i, int i2, float f, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 720 : i, (i5 & 2) != 0 ? EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK : i2, (i5 & 4) != 0 ? 0.25f : f, (i5 & 8) != 0 ? 30 : i3, (i5 & 16) != 0 ? RoundedDrawable.DEFAULT_BORDER_COLOR : i4);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m217096a(gh3 gh3Var) {
        gh3Var.getClass();
        gh3Var.m126151f(720);
        gh3Var.m126150e(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        gh3Var.m126149d(30);
        gh3Var.m126148c(0.5f);
        gh3Var.m126147b(RoundedDrawable.DEFAULT_BORDER_COLOR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof z4l0)) {
            return false;
        }
        z4l0 z4l0Var = (z4l0) other;
        return this.width == z4l0Var.width && this.height == z4l0Var.height && Float.compare(this.factory, z4l0Var.factory) == 0 && this.frameRate == z4l0Var.frameRate && this.bgColor == z4l0Var.bgColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.factory)) * 31) + Integer.hashCode(this.frameRate)) * 31) + Integer.hashCode(this.bgColor);
    }

    @NotNull
    public String toString() {
        return "VideoFormat(width=" + this.width + ", height=" + this.height + ", factory=" + this.factory + ", frameRate=" + this.frameRate + ", bgColor=" + this.bgColor + ")";
    }

    /* JADX INFO: renamed from: l.z4l0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/z4l0$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Ll/gh3;", "", "Lkotlin/ExtensionFunctionType;", "initData", "Ll/z4l0;", "a", "(Lkotlin/jvm/functions/Function1;)Ll/z4l0;", "DEFAULT_VIDEO_FORMAT", "Ll/z4l0;", "b", "()Ll/z4l0;", "", "I_FRAME_INTERVAL", "I", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final z4l0 m217103a(@NotNull Function1<? super gh3, Unit> initData) {
            initData.getClass();
            gh3 gh3Var = new gh3();
            initData.invoke(gh3Var);
            return gh3Var.m126146a();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final z4l0 m217104b() {
            return z4l0.f201608g;
        }

        public Companion() {
        }
    }

    public z4l0(int i, int i2, float f, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.factory = f;
        this.frameRate = i3;
        this.bgColor = i4;
        this.bitRate = (int) (i * i2 * i3 * f);
    }

    public z4l0() {
        this(0, 0, 0.0f, 0, 0, 31, null);
    }
}
