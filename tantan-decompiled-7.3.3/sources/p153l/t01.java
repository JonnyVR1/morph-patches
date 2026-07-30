package p153l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/t01;", "Ll/xc80;", "Ll/v23;", "bitmapPool", "Ll/gb5;", "closeableReferenceFactory", "<init>", "(Ll/v23;Ll/gb5;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ll/fb5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(IILandroid/graphics/Bitmap$Config;)Ll/fb5;", "a", "Ll/v23;", "b", "Ll/gb5;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@TargetApi(21)
public final class t01 extends xc80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final v23 bitmapPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gb5 closeableReferenceFactory;

    public t01(@NotNull v23 v23Var, @NotNull gb5 gb5Var) {
        v23Var.getClass();
        gb5Var.getClass();
        this.bitmapPool = v23Var;
        this.closeableReferenceFactory = gb5Var;
    }

    @Override // p153l.xc80
    @NotNull
    /* JADX INFO: renamed from: d */
    public fb5<Bitmap> mo188699d(int width, int height, @NotNull Bitmap.Config bitmapConfig) {
        bitmapConfig.getClass();
        Bitmap bitmap = this.bitmapPool.get(j33.m143309h(width, height, bitmapConfig));
        if (bitmap.getAllocationByteCount() < width * height * j33.m143308g(bitmapConfig)) {
            wtq0.m207906a("Check failed.");
            return null;
        }
        bitmap.reconfigure(width, height, bitmapConfig);
        fb5<Bitmap> fb5VarM129769c = this.closeableReferenceFactory.m129769c(bitmap, this.bitmapPool);
        fb5VarM129769c.getClass();
        return fb5VarM129769c;
    }
}
