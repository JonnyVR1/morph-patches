package p153l;

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
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0014B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001d\u0010\u000f¨\u0006!"}, m88121d2 = {"Ll/del0;", "", "", "width", "height", "", "factory", "frameRate", "bgColor", "<init>", "(IIFII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "f", "c", "F", "getFactory", "()F", Constants.INAPP_DATA_TAG, "e", "bitRate", "Companion", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class del0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final del0 f88044g;

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
        f88044g = companion.m115432a(new Function1() { // from class: l.cel0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return del0.m115425a((uh3) obj);
            }
        });
    }

    public /* synthetic */ del0(int i, int i2, float f, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 720 : i, (i5 & 2) != 0 ? EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK : i2, (i5 & 4) != 0 ? 0.25f : f, (i5 & 8) != 0 ? 30 : i3, (i5 & 16) != 0 ? RoundedDrawable.DEFAULT_BORDER_COLOR : i4);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m115425a(uh3 uh3Var) {
        uh3Var.getClass();
        uh3Var.m196024f(720);
        uh3Var.m196023e(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        uh3Var.m196022d(30);
        uh3Var.m196021c(0.5f);
        uh3Var.m196020b(RoundedDrawable.DEFAULT_BORDER_COLOR);
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
        if (!(other instanceof del0)) {
            return false;
        }
        del0 del0Var = (del0) other;
        return this.width == del0Var.width && this.height == del0Var.height && Float.compare(this.factory, del0Var.factory) == 0 && this.frameRate == del0Var.frameRate && this.bgColor == del0Var.bgColor;
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

    /* JADX INFO: renamed from: l.del0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/del0$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Ll/uh3;", "", "Lkotlin/ExtensionFunctionType;", "initData", "Ll/del0;", "a", "(Lkotlin/jvm/functions/Function1;)Ll/del0;", "DEFAULT_VIDEO_FORMAT", "Ll/del0;", "b", "()Ll/del0;", "", "I_FRAME_INTERVAL", "I", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final del0 m115432a(@NotNull Function1<? super uh3, Unit> initData) {
            initData.getClass();
            uh3 uh3Var = new uh3();
            initData.invoke(uh3Var);
            return uh3Var.m196019a();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final del0 m115433b() {
            return del0.f88044g;
        }

        public Companion() {
        }
    }

    public del0(int i, int i2, float f, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.factory = f;
        this.frameRate = i3;
        this.bgColor = i4;
        this.bitRate = (int) (i * i2 * i3 * f);
    }

    public del0() {
        this(0, 0, 0.0f, 0, 0, 31, null);
    }
}
