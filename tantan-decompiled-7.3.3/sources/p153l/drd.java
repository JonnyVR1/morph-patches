package p153l;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C1110a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class drd implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    private final hyk f90371a = hyk.m137743b();

    /* JADX INFO: renamed from: b */
    private final int f90372b;

    /* JADX INFO: renamed from: c */
    private final int f90373c;

    /* JADX INFO: renamed from: d */
    private final DecodeFormat f90374d;

    /* JADX INFO: renamed from: e */
    private final DownsampleStrategy f90375e;

    /* JADX INFO: renamed from: f */
    private final boolean f90376f;

    /* JADX INFO: renamed from: g */
    private final PreferredColorSpace f90377g;

    /* JADX INFO: renamed from: l.drd$a */
    public class C16609a implements ImageDecoder$OnPartialImageListener {
        public C16609a() {
        }

        public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public drd(int i, int i2, @NonNull u560 u560Var) {
        this.f90372b = i;
        this.f90373c = i2;
        this.f90374d = (DecodeFormat) u560Var.m194542c(C1110a.f4626f);
        this.f90375e = (DownsampleStrategy) u560Var.m194542c(DownsampleStrategy.f4608h);
        q560<Boolean> q560Var = C1110a.f4630j;
        this.f90376f = u560Var.m194542c(q560Var) != null && ((Boolean) u560Var.m194542c(q560Var)).booleanValue();
        this.f90377g = (PreferredColorSpace) u560Var.m194542c(C1110a.f4627g);
    }

    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        if (this.f90371a.m137749e(this.f90372b, this.f90373c, this.f90376f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f90374d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C16609a());
        Size size = imageInfo.getSize();
        int width = this.f90372b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f90373c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo5543b = this.f90375e.mo5543b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo5543b);
        int iRound2 = Math.round(fMo5543b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f90377g;
        if (preferredColorSpace != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
