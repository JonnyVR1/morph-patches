package p149l;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C1093a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public abstract class qfm<T> implements wvc0<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: a */
    final rvk f154142a = rvk.m181299a();

    /* JADX INFO: renamed from: l.qfm$a */
    public class C19488a implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f154143a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f154144b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f154145c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ DecodeFormat f154146d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ DownsampleStrategy f154147e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ PreferredColorSpace f154148f;

        /* JADX INFO: renamed from: l.qfm$a$a */
        public class a implements ImageDecoder$OnPartialImageListener {
            public a() {
            }

            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C19488a(int i, int i2, boolean z, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f154143a = i;
            this.f154144b = i2;
            this.f154145c = z;
            this.f154146d = decodeFormat;
            this.f154147e = downsampleStrategy;
            this.f154148f = preferredColorSpace;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            if (qfm.this.f154142a.m181302c(this.f154143a, this.f154144b, this.f154145c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f154146d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new a());
            Size size = imageInfo.getSize();
            int width = this.f154143a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f154144b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fMo5516b = this.f154147e.mo5516b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fMo5516b);
            int iRound2 = Math.round(fMo5516b * size.getHeight());
            if (Log.isLoggable("ImageDecoder", 2)) {
                size.getWidth();
                size.getHeight();
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((this.f154148f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5552a(@NonNull ImageDecoder.Source source, @NonNull px50 px50Var) throws IOException {
        return m174359e(efm.m116086a(source), px50Var);
    }

    @Override // p149l.wvc0
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ rvc0 mo5553b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull px50 px50Var) throws IOException {
        return m174358d(efm.m116086a(source), i, i2, px50Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract rvc0<T> mo174357c(ImageDecoder.Source source, int i, int i2, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException;

    @Nullable
    /* JADX INFO: renamed from: d */
    public final rvc0<T> m174358d(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull px50 px50Var) throws IOException {
        DecodeFormat decodeFormat = (DecodeFormat) px50Var.m171822c(C1093a.f4604f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) px50Var.m171822c(DownsampleStrategy.f4596h);
        kx50<Boolean> kx50Var = C1093a.f4608j;
        return mo174357c(source, i, i2, new C19488a(i, i2, px50Var.m171822c(kx50Var) != null && ((Boolean) px50Var.m171822c(kx50Var)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) px50Var.m171822c(C1093a.f4605g)));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m174359e(@NonNull ImageDecoder.Source source, @NonNull px50 px50Var) {
        return true;
    }
}
