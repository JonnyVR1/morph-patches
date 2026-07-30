package p153l;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/qpy;", "", "<init>", "()V", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "count", "memorySize", "a", "(III)I", "otherLength", "otherOffset", "", "b", "(IIIII)V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class qpy {

    @NotNull
    public static final qpy INSTANCE = new qpy();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m177473a(int offset, int count, int memorySize) {
        return Math.min(Math.max(0, memorySize - offset), count);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m177474b(int offset, int otherLength, int otherOffset, int count, int memorySize) {
        wn80.m207179d(count >= 0, "count (%d) ! >= 0", Integer.valueOf(count));
        wn80.m207179d(offset >= 0, "offset (%d) ! >= 0", Integer.valueOf(offset));
        wn80.m207179d(otherOffset >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(otherOffset));
        wn80.m207179d(offset + count <= memorySize, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(offset), Integer.valueOf(count), Integer.valueOf(memorySize));
        wn80.m207179d(otherOffset + count <= otherLength, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(otherOffset), Integer.valueOf(count), Integer.valueOf(otherLength));
    }
}
