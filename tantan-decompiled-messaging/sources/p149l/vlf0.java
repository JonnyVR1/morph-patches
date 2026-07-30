package p149l;

import android.content.Context;
import android.media.SoundPool;
import androidx.annotation.RawRes;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R*\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m87232d2 = {"Ll/vlf0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "resId", "", "b", "(Landroid/content/Context;I)V", "c", Constants.INAPP_DATA_TAG, "Landroid/media/SoundPool;", "a", "Landroid/media/SoundPool;", "soundPool", "I", "soundId", "", "value", "F", "()F", "e", "(F)V", "soundPlayVolume", "Companion", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vlf0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SoundPool soundPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int soundId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float soundPlayVolume;

    public vlf0() {
        SoundPool soundPoolBuild = new SoundPool.Builder().build();
        soundPoolBuild.getClass();
        this.soundPool = soundPoolBuild;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSoundPlayVolume() {
        return this.soundPlayVolume;
    }

    /* JADX INFO: renamed from: b */
    public final void m198798b(@NotNull Context context, @RawRes int resId) {
        context.getClass();
        this.soundId = this.soundPool.load(context, resId, 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m198799c() {
        int i = this.soundId;
        if (i != 0) {
            SoundPool soundPool = this.soundPool;
            float f = this.soundPlayVolume;
            soundPool.play(i, f, f, 1, 0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m198800d() {
        this.soundPool.release();
    }

    /* JADX INFO: renamed from: e */
    public final void m198801e(float f) {
        this.soundPlayVolume = Math.min(1.0f, Math.max(f, 0.0f));
    }

    /* JADX INFO: renamed from: l.vlf0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/vlf0$a;", "", "<init>", "()V", "Ll/vlf0;", "a", "()Ll/vlf0;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final vlf0 m198802a() {
            return new vlf0(null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ vlf0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
