package p149l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/m01;", "Ll/r480;", "Ll/f23;", "bitmapPool", "Ll/ga5;", "closeableReferenceFactory", "<init>", "(Ll/f23;Ll/ga5;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ll/fa5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(IILandroid/graphics/Bitmap$Config;)Ll/fa5;", "a", "Ll/f23;", "b", "Ll/ga5;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@TargetApi(21)
public final class m01 extends r480 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final f23 bitmapPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ga5 closeableReferenceFactory;

    public m01(@NotNull f23 f23Var, @NotNull ga5 ga5Var) {
        f23Var.getClass();
        ga5Var.getClass();
        this.bitmapPool = f23Var;
        this.closeableReferenceFactory = ga5Var;
    }

    @Override // p149l.r480
    @NotNull
    /* JADX INFO: renamed from: d */
    public fa5<Bitmap> mo152410d(int width, int height, @NotNull Bitmap.Config bitmapConfig) {
        bitmapConfig.getClass();
        Bitmap bitmap = this.bitmapPool.get(t23.m186959h(width, height, bitmapConfig));
        if (bitmap.getAllocationByteCount() < width * height * t23.m186958g(bitmapConfig)) {
            qkq0.m175383a("Check failed.");
            return null;
        }
        bitmap.reconfigure(width, height, bitmapConfig);
        fa5<Bitmap> fa5VarM124923c = this.closeableReferenceFactory.m124923c(bitmap, this.bitmapPool);
        fa5VarM124923c.getClass();
        return fa5VarM124923c;
    }
}
