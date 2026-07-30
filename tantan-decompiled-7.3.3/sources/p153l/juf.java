package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\bR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\bR\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\bR\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\bR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b#\u0010\bR\"\u0010(\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, m88121d2 = {"Ll/juf;", "", "<init>", "()V", "", "fps", "", "a", "(I)V", "c", "", "[Ljava/lang/Integer;", "getFpsArray", "()[Ljava/lang/Integer;", "setFpsArray", "([Ljava/lang/Integer;)V", "fpsArray", "b", "I", "getCurrentIndex", "()I", "setCurrentIndex", "currentIndex", "getFPS", "setFPS", "FPS", Constants.INAPP_DATA_TAG, "getRepeatValue", "setRepeatValue", "repeatValue", "e", "getCurrentTotal", "setCurrentTotal", "currentTotal", "f", "setAVG_FPS", "AVG_FPS", "", "g", "Z", "isFullArray", "()Z", "setFullArray", "(Z)V", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class juf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Integer[] fpsArray = {0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int FPS;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int repeatValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int currentTotal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int AVG_FPS;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isFullArray;

    /* JADX INFO: renamed from: a */
    public final void m146978a(int fps) {
        this.fpsArray[this.currentIndex] = Integer.valueOf(fps);
        this.FPS = fps;
        int i = (this.currentIndex + 1) % 5;
        this.currentIndex = i;
        if (!this.isFullArray && i == 0) {
            this.isFullArray = true;
        }
        int i2 = this.currentTotal + fps;
        this.currentTotal = i2;
        if (!this.isFullArray) {
            this.AVG_FPS = i2 / i;
            return;
        }
        int i3 = i2 - this.repeatValue;
        this.currentTotal = i3;
        this.AVG_FPS = i3 / 5;
        this.repeatValue = this.fpsArray[i].intValue();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAVG_FPS() {
        return this.AVG_FPS;
    }

    /* JADX INFO: renamed from: c */
    public final void m146980c() {
        this.fpsArray = new Integer[]{0, 0, 0, 0, 0};
        this.currentIndex = 0;
        this.FPS = 0;
        this.repeatValue = 0;
        this.currentTotal = 0;
        this.AVG_FPS = 0;
        this.isFullArray = false;
    }
}
