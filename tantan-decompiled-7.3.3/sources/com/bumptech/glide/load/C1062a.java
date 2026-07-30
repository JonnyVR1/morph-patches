package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p153l.o01;

/* JADX INFO: renamed from: com.bumptech.glide.load.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1062a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a */
    public class a implements h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f4369a;

        public a(InputStream inputStream) {
            this.f4369a = inputStream;
        }

        @Override // com.bumptech.glide.load.C1062a.h
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo5366a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo5354a(this.f4369a);
            } finally {
                this.f4369a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$b */
    public class b implements h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f4370a;

        public b(ByteBuffer byteBuffer) {
            this.f4370a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C1062a.h
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo5366a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo5355b(this.f4370a);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$c */
    public class c implements h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f4371a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o01 f4372b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o01 o01Var) {
            this.f4371a = parcelFileDescriptorRewinder;
            this.f4372b = o01Var;
        }

        @Override // com.bumptech.glide.load.C1062a.h
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo5366a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f4371a.mo5369a().getFileDescriptor()), this.f4372b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo5354a = imageHeaderParser.mo5354a(recyclableBufferedInputStream2);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f4371a.mo5369a();
                    return imageTypeMo5354a;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f4371a.mo5369a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$d */
    public class d implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f4373a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o01 f4374b;

        public d(ByteBuffer byteBuffer, o01 o01Var) {
            this.f4373a = byteBuffer;
            this.f4374b = o01Var;
        }

        @Override // com.bumptech.glide.load.C1062a.g
        /* JADX INFO: renamed from: a */
        public int mo5367a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo5357d(this.f4373a, this.f4374b);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$e */
    public class e implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f4375a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o01 f4376b;

        public e(InputStream inputStream, o01 o01Var) {
            this.f4375a = inputStream;
            this.f4376b = o01Var;
        }

        @Override // com.bumptech.glide.load.C1062a.g
        /* JADX INFO: renamed from: a */
        public int mo5367a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo5356c(this.f4375a, this.f4376b);
            } finally {
                this.f4375a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$f */
    public class f implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f4377a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o01 f4378b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o01 o01Var) {
            this.f4377a = parcelFileDescriptorRewinder;
            this.f4378b = o01Var;
        }

        @Override // com.bumptech.glide.load.C1062a.g
        /* JADX INFO: renamed from: a */
        public int mo5367a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f4377a.mo5369a().getFileDescriptor()), this.f4378b);
                try {
                    int iMo5356c = imageHeaderParser.mo5356c(recyclableBufferedInputStream2, this.f4378b);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f4377a.mo5369a();
                    return iMo5356c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f4377a.mo5369a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        int mo5367a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        ImageHeaderParser.ImageType mo5366a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: a */
    public static int m5358a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull o01 o01Var) throws IOException {
        return m5361d(list, new f(parcelFileDescriptorRewinder, o01Var));
    }

    /* JADX INFO: renamed from: b */
    public static int m5359b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull o01 o01Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, o01Var);
        }
        inputStream.mark(5242880);
        return m5361d(list, new e(inputStream, o01Var));
    }

    /* JADX INFO: renamed from: c */
    public static int m5360c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull o01 o01Var) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m5361d(list, new d(byteBuffer, o01Var));
    }

    /* JADX INFO: renamed from: d */
    private static int m5361d(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iMo5367a = gVar.mo5367a(list.get(i));
            if (iMo5367a != -1) {
                return iMo5367a;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: e */
    public static ImageHeaderParser.ImageType m5362e(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull o01 o01Var) throws IOException {
        return m5365h(list, new c(parcelFileDescriptorRewinder, o01Var));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static ImageHeaderParser.ImageType m5363f(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull o01 o01Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, o01Var);
        }
        inputStream.mark(5242880);
        return m5365h(list, new a(inputStream));
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static ImageHeaderParser.ImageType m5364g(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m5365h(list, new b(byteBuffer));
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    private static ImageHeaderParser.ImageType m5365h(@NonNull List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeMo5366a = hVar.mo5366a(list.get(i));
            if (imageTypeMo5366a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo5366a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
