package p153l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/u01;", "Ll/wnd;", "Ll/v23;", "bitmapPool", "Ll/nj80;", "Ljava/nio/ByteBuffer;", "decodeBuffers", "Ll/bd80;", "platformDecoderOptions", "<init>", "(Ll/v23;Ll/nj80;Ll/bd80;)V", "", "width", "height", "Landroid/graphics/BitmapFactory$Options;", Options.TYPE, Constants.INAPP_DATA_TAG, "(IILandroid/graphics/BitmapFactory$Options;)I", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@TargetApi(21)
public final class u01 extends wnd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(@NotNull v23 v23Var, @NotNull nj80<ByteBuffer> nj80Var, @NotNull bd80 bd80Var) {
        super(v23Var, nj80Var, bd80Var);
        v23Var.getClass();
        nj80Var.getClass();
        bd80Var.getClass();
    }

    @Override // p153l.wnd
    /* JADX INFO: renamed from: d */
    public int mo193753d(int width, int height, @NotNull BitmapFactory.Options options) {
        options.getClass();
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return j33.m143309h(width, height, config);
        }
        wtq0.m207906a("Required value was null.");
        return 0;
    }
}
