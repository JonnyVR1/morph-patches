package p153l;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class j23 implements z3d0<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final w23 f118029a = new x23();

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5553a(@NonNull ImageDecoder.Source source, @NonNull u560 u560Var) throws IOException {
        return m143187d(h23.m133362a(source), u560Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ u3d0<Bitmap> mo5554b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull u560 u560Var) throws IOException {
        return m143186c(h23.m133362a(source), i, i2, u560Var);
    }

    /* JADX INFO: renamed from: c */
    public u3d0<Bitmap> m143186c(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull u560 u560Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new drd(i, i2, u560Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new e33(bitmapDecodeBitmap, this.f118029a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m143187d(@NonNull ImageDecoder.Source source, @NonNull u560 u560Var) throws IOException {
        return true;
    }
}
