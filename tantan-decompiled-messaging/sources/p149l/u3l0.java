package p149l;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class u3l0<T> implements wvc0<T, Bitmap> {

    /* JADX INFO: renamed from: d */
    public static final kx50<Long> f173628d = kx50.m147674a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C20345a());

    /* JADX INFO: renamed from: e */
    public static final kx50<Integer> f173629e = kx50.m147674a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C20346b());

    /* JADX INFO: renamed from: f */
    private static final C20349e f173630f = new C20349e();

    /* JADX INFO: renamed from: a */
    private final InterfaceC20350f<T> f173631a;

    /* JADX INFO: renamed from: b */
    private final g23 f173632b;

    /* JADX INFO: renamed from: c */
    private final C20349e f173633c;

    /* JADX INFO: renamed from: l.u3l0$a */
    public class C20345a implements kx50.InterfaceC18107b<Long> {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f173634a = ByteBuffer.allocate(8);

        @Override // p149l.kx50.InterfaceC18107b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo147681a(@NonNull byte[] bArr, @NonNull Long l2, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f173634a) {
                this.f173634a.position(0);
                messageDigest.update(this.f173634a.putLong(l2.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: l.u3l0$b */
    public class C20346b implements kx50.InterfaceC18107b<Integer> {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f173635a = ByteBuffer.allocate(4);

        @Override // p149l.kx50.InterfaceC18107b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo147681a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f173635a) {
                this.f173635a.position(0);
                messageDigest.update(this.f173635a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: l.u3l0$e */
    @VisibleForTesting
    public static class C20349e {
        /* JADX INFO: renamed from: a */
        public MediaMetadataRetriever m191588a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: renamed from: l.u3l0$f */
    @VisibleForTesting
    public interface InterfaceC20350f<T> {
        /* JADX INFO: renamed from: a */
        void mo191585a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: renamed from: l.u3l0$g */
    public static final class C20351g implements InterfaceC20350f<ParcelFileDescriptor> {
        @Override // p149l.u3l0.InterfaceC20350f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo191585a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    @VisibleForTesting
    public u3l0(g23 g23Var, InterfaceC20350f<T> interfaceC20350f, C20349e c20349e) {
        this.f173632b = g23Var;
        this.f173631a = interfaceC20350f;
        this.f173633c = c20349e;
    }

    /* JADX INFO: renamed from: c */
    public static wvc0<AssetFileDescriptor, Bitmap> m191577c(g23 g23Var) {
        return new u3l0(g23Var, new C20347c(null));
    }

    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: d */
    public static wvc0<ByteBuffer, Bitmap> m191578d(g23 g23Var) {
        return new u3l0(g23Var, new C20348d());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    private static Bitmap m191579e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmapM191581g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f4594f) ? null : m191581g(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return bitmapM191581g == null ? m191580f(mediaMetadataRetriever, j, i) : bitmapM191581g;
    }

    /* JADX INFO: renamed from: f */
    private static Bitmap m191580f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* JADX INFO: renamed from: g */
    private static Bitmap m191581g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fMo5516b = downsampleStrategy.mo5516b(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fMo5516b), Math.round(fMo5516b * i5));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static wvc0<ParcelFileDescriptor, Bitmap> m191582h(g23 g23Var) {
        return new u3l0(g23Var, new C20351g());
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: a */
    public boolean mo5552a(@NonNull T t, @NonNull px50 px50Var) {
        return true;
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: b */
    public rvc0<Bitmap> mo5553b(@NonNull T t, int i, int i2, @NonNull px50 px50Var) throws IOException {
        long jLongValue = ((Long) px50Var.m171822c(f173628d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            y3g0.m212802a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue);
            return null;
        }
        Integer num = (Integer) px50Var.m171822c(f173629e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) px50Var.m171822c(DownsampleStrategy.f4596h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f4595g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM191588a = this.f173633c.m191588a();
        try {
            try {
                this.f173631a.mo191585a(mediaMetadataRetrieverM191588a, t);
                Bitmap bitmapM191579e = m191579e(mediaMetadataRetrieverM191588a, jLongValue, num.intValue(), i, i2, downsampleStrategy2);
                mediaMetadataRetrieverM191588a.release();
                return o23.m162285b(bitmapM191579e, this.f173632b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            mediaMetadataRetrieverM191588a.release();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l.u3l0$c */
    public static final class C20347c implements InterfaceC20350f<AssetFileDescriptor> {
        private C20347c() {
        }

        @Override // p149l.u3l0.InterfaceC20350f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo191585a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C20347c(C20345a c20345a) {
            this();
        }
    }

    public u3l0(g23 g23Var, InterfaceC20350f<T> interfaceC20350f) {
        this(g23Var, interfaceC20350f, f173630f);
    }

    /* JADX INFO: renamed from: l.u3l0$d */
    @RequiresApi(23)
    public static final class C20348d implements InterfaceC20350f<ByteBuffer> {
        @Override // p149l.u3l0.InterfaceC20350f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo191585a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }

        /* JADX INFO: renamed from: l.u3l0$d$a */
        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ByteBuffer f173636a;

            public a(ByteBuffer byteBuffer) {
                this.f173636a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f173636a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f173636a.limit()) {
                    return -1;
                }
                this.f173636a.position((int) j);
                int iMin = Math.min(i2, this.f173636a.remaining());
                this.f173636a.get(bArr, i, iMin);
                return iMin;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
