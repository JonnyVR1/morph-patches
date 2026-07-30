package com.bumptech.glide.load.resource.bitmap;

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
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p153l.e33;
import p153l.fcg0;
import p153l.q560;
import p153l.u3d0;
import p153l.u560;
import p153l.w23;
import p153l.y6e;
import p153l.z3d0;

/* JADX INFO: loaded from: classes.dex */
public class VideoDecoder<T> implements z3d0<T, Bitmap> {

    /* JADX INFO: renamed from: d */
    public static final q560<Long> f4616d = q560.m175293a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1103a());

    /* JADX INFO: renamed from: e */
    public static final q560<Integer> f4617e = q560.m175293a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1104b());

    /* JADX INFO: renamed from: f */
    private static final C1107e f4618f = new C1107e();

    /* JADX INFO: renamed from: a */
    private final InterfaceC1108f<T> f4619a;

    /* JADX INFO: renamed from: b */
    private final w23 f4620b;

    /* JADX INFO: renamed from: c */
    private final C1107e f4621c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C1103a implements q560.InterfaceC19524b<Long> {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4622a = ByteBuffer.allocate(8);

        @Override // p153l.q560.InterfaceC19524b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5555a(@NonNull byte[] bArr, @NonNull Long l2, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f4622a) {
                this.f4622a.position(0);
                messageDigest.update(this.f4622a.putLong(l2.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C1104b implements q560.InterfaceC19524b<Integer> {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4623a = ByteBuffer.allocate(4);

        @Override // p153l.q560.InterfaceC19524b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5555a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f4623a) {
                this.f4623a.position(0);
                messageDigest.update(this.f4623a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    @RequiresApi(23)
    public static final class C1106d implements InterfaceC1108f<ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ByteBuffer f4624a;

            public a(ByteBuffer byteBuffer) {
                this.f4624a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f4624a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f4624a.limit()) {
                    return -1;
                }
                this.f4624a.position((int) j);
                int iMin = Math.min(i2, this.f4624a.remaining());
                this.f4624a.get(bArr, i, iMin);
                return iMin;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC1108f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5558a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    @VisibleForTesting
    public static class C1107e {
        /* JADX INFO: renamed from: a */
        public MediaMetadataRetriever m5561a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    @VisibleForTesting
    public interface InterfaceC1108f<T> {
        /* JADX INFO: renamed from: a */
        void mo5558a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C1109g implements InterfaceC1108f<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC1108f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5558a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    @VisibleForTesting
    public VideoDecoder(w23 w23Var, InterfaceC1108f<T> interfaceC1108f, C1107e c1107e) {
        this.f4620b = w23Var;
        this.f4619a = interfaceC1108f;
        this.f4621c = c1107e;
    }

    /* JADX INFO: renamed from: c */
    public static z3d0<AssetFileDescriptor, Bitmap> m5547c(w23 w23Var) {
        return new VideoDecoder(w23Var, new C1105c(null));
    }

    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: d */
    public static z3d0<ByteBuffer, Bitmap> m5548d(w23 w23Var) {
        return new VideoDecoder(w23Var, new C1106d());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    private static Bitmap m5549e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmapM5551g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f4606f) ? null : m5551g(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        if (bitmapM5551g == null) {
            bitmapM5551g = m5550f(mediaMetadataRetriever, j, i);
        }
        if (bitmapM5551g != null) {
            return bitmapM5551g;
        }
        throw new VideoDecoderException();
    }

    /* JADX INFO: renamed from: f */
    private static Bitmap m5550f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @Nullable
    @TargetApi(27)
    /* JADX INFO: renamed from: g */
    private static Bitmap m5551g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fMo5543b = downsampleStrategy.mo5543b(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fMo5543b), Math.round(fMo5543b * i5));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static z3d0<ParcelFileDescriptor, Bitmap> m5552h(w23 w23Var) {
        return new VideoDecoder(w23Var, new C1109g());
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: a */
    public boolean mo5553a(@NonNull T t, @NonNull u560 u560Var) {
        return true;
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: b */
    public u3d0<Bitmap> mo5554b(@NonNull T t, int i, int i2, @NonNull u560 u560Var) throws Exception {
        long jLongValue = ((Long) u560Var.m194542c(f4616d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            fcg0.m125008a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue);
            return null;
        }
        Integer num = (Integer) u560Var.m194542c(f4617e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) u560Var.m194542c(DownsampleStrategy.f4608h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f4607g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM5561a = this.f4621c.m5561a();
        try {
            this.f4619a.mo5558a(mediaMetadataRetrieverM5561a, t);
            return e33.m119246b(m5549e(mediaMetadataRetrieverM5561a, jLongValue, num.intValue(), i, i2, downsampleStrategy2), this.f4620b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                y6e.m214482a(mediaMetadataRetrieverM5561a);
            }
            mediaMetadataRetrieverM5561a.release();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C1105c implements InterfaceC1108f<AssetFileDescriptor> {
        private C1105c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC1108f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5558a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C1105c(C1103a c1103a) {
            this();
        }
    }

    public VideoDecoder(w23 w23Var, InterfaceC1108f<T> interfaceC1108f) {
        this(w23Var, interfaceC1108f, f4618f);
    }
}
