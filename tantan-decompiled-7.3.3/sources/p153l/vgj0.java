package p153l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/vgj0;", "", "<init>", "()V", "Ll/f33;", "transformation", "Ll/fb5;", "Landroid/graphics/Bitmap;", "bitmapReference", "", "a", "(Ll/f33;Ll/fb5;)Z", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class vgj0 {

    @NotNull
    public static final vgj0 INSTANCE = new vgj0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m201234a(@Nullable f33 transformation, @Nullable fb5<Bitmap> bitmapReference) {
        if (transformation == null || bitmapReference == null) {
            return false;
        }
        Bitmap bitmapM124875B = bitmapReference.m124875B();
        bitmapM124875B.getClass();
        Bitmap bitmap = bitmapM124875B;
        if (transformation.m123704a()) {
            bitmap.setHasAlpha(true);
        }
        transformation.m123705b(bitmap);
        return true;
    }
}
