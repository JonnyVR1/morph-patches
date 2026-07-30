package p153l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJC\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/zc80;", "", "Ll/n0f;", "encodedImage", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Rect;", "regionToDecode", "Landroid/graphics/ColorSpace;", "colorSpace", "Ll/fb5;", "Landroid/graphics/Bitmap;", "a", "(Ll/n0f;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;Landroid/graphics/ColorSpace;)Ll/fb5;", "", "length", "b", "(Ll/n0f;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;ILandroid/graphics/ColorSpace;)Ll/fb5;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface zc80 {
    @Nullable
    /* JADX INFO: renamed from: a */
    fb5<Bitmap> mo8505a(@NotNull n0f encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, @Nullable ColorSpace colorSpace);

    @Nullable
    /* JADX INFO: renamed from: b */
    fb5<Bitmap> mo8506b(@NotNull n0f encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length, @Nullable ColorSpace colorSpace);
}
