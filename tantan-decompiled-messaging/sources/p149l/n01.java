package p149l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/n01;", "Ll/rmd;", "Ll/f23;", "bitmapPool", "Ll/hb80;", "Ljava/nio/ByteBuffer;", "decodeBuffers", "Ll/v480;", "platformDecoderOptions", "<init>", "(Ll/f23;Ll/hb80;Ll/v480;)V", "", "width", "height", "Landroid/graphics/BitmapFactory$Options;", Options.TYPE, Constants.INAPP_DATA_TAG, "(IILandroid/graphics/BitmapFactory$Options;)I", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@TargetApi(21)
public final class n01 extends rmd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(@NotNull f23 f23Var, @NotNull hb80<ByteBuffer> hb80Var, @NotNull v480 v480Var) {
        super(f23Var, hb80Var, v480Var);
        f23Var.getClass();
        hb80Var.getClass();
        v480Var.getClass();
    }

    @Override // p149l.rmd
    /* JADX INFO: renamed from: d */
    public int mo157191d(int width, int height, @NotNull BitmapFactory.Options options) {
        options.getClass();
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return t23.m186959h(width, height, config);
        }
        qkq0.m175383a("Required value was null.");
        return 0;
    }
}
