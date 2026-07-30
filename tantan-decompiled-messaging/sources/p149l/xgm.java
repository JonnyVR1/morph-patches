package p149l;

import android.graphics.ColorSpace;
import com.p046p1.mobile.putong.core.data.Dimensions;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/xgm;", "", "", "width", "height", "Landroid/graphics/ColorSpace;", "colorSpace", "<init>", "(IILandroid/graphics/ColorSpace;)V", "a", "Landroid/graphics/ColorSpace;", "()Landroid/graphics/ColorSpace;", "Lkotlin/Pair;", "b", "Lkotlin/Pair;", "()Lkotlin/Pair;", Dimensions.TYPE, "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class xgm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final ColorSpace colorSpace;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Pair<Integer, Integer> dimensions;

    public xgm(int i, int i2, @Nullable ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
        this.dimensions = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Pair<Integer, Integer> m208684b() {
        return this.dimensions;
    }
}
