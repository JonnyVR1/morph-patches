package p149l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/r7j0;", "", "<init>", "()V", "Ll/p23;", "transformation", "Ll/fa5;", "Landroid/graphics/Bitmap;", "bitmapReference", "", "a", "(Ll/p23;Ll/fa5;)Z", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class r7j0 {

    @NotNull
    public static final r7j0 INSTANCE = new r7j0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m178146a(@Nullable p23 transformation, @Nullable fa5<Bitmap> bitmapReference) {
        if (transformation == null || bitmapReference == null) {
            return false;
        }
        Bitmap bitmapM120155B = bitmapReference.m120155B();
        bitmapM120155B.getClass();
        Bitmap bitmap = bitmapM120155B;
        if (transformation.m167126a()) {
            bitmap.setHasAlpha(true);
        }
        transformation.m167127b(bitmap);
        return true;
    }
}
