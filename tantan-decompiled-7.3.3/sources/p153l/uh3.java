package p153l;

import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0013\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u0019\u0010\fR\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u001e"}, m88121d2 = {"Ll/uh3;", "", "<init>", "()V", "Ll/del0;", "a", "()Ll/del0;", "", "I", "getWidth", "()I", "f", "(I)V", "width", "b", "getHeight", "e", "height", "", "c", "F", "getFactory", "()F", "(F)V", "factory", Constants.INAPP_DATA_TAG, "getFrameRate", "frameRate", "getBgColor", "bgColor", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class uh3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int width = 720;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int height = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float factory = 0.25f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int frameRate = 30;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int bgColor = RoundedDrawable.DEFAULT_BORDER_COLOR;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final del0 m196019a() {
        return new del0(this.width, this.height, this.factory, this.frameRate, this.bgColor);
    }

    /* JADX INFO: renamed from: b */
    public final void m196020b(int i) {
        this.bgColor = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m196021c(float f) {
        this.factory = f;
    }

    /* JADX INFO: renamed from: d */
    public final void m196022d(int i) {
        this.frameRate = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m196023e(int i) {
        this.height = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m196024f(int i) {
        this.width = i;
    }
}
