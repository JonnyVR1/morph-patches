package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/tti0;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Bitmap;)I", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tti0 {

    @NotNull
    public static final tti0 INSTANCE = new tti0();

    /* JADX INFO: renamed from: a */
    public final int m192670a(@Nullable Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        if (bitmap == null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            return 0;
        }
        if (bitmap.isRecycled()) {
            C21726z0.INSTANCE.m218093b("TextureUtil", "bitmap isRecycled");
            return 0;
        }
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }
}
