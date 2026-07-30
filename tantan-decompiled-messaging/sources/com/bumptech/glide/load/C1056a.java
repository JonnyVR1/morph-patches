package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p149l.h01;
import p149l.w760;

/* JADX INFO: renamed from: com.bumptech.glide.load.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1056a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a */
    public class a implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f4368a;

        public a(InputStream inputStream) {
            this.f4368a = inputStream;
        }

        @Override // com.bumptech.glide.load.C1056a.g
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo5352a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo5342a(this.f4368a);
            } finally {
                this.f4368a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$b */
    public class b implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f4369a;

        public b(ByteBuffer byteBuffer) {
            this.f4369a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C1056a.g
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo5352a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo5343b(this.f4369a);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$c */
    public class c implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ w760 f4370a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h01 f4371b;

        public c(w760 w760Var, h01 h01Var) {
            this.f4370a = w760Var;
            this.f4371b = h01Var;
        }

        @Override // com.bumptech.glide.load.C1056a.g
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo5352a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f4370a.mo112975a().getFileDescriptor()), this.f4371b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo5342a = imageHeaderParser.mo5342a(recyclableBufferedInputStream2);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f4370a.mo112975a();
                    return imageTypeMo5342a;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f4370a.mo112975a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$d */
    public class d implements f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f4372a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h01 f4373b;

        public d(InputStream inputStream, h01 h01Var) {
            this.f4372a = inputStream;
            this.f4373b = h01Var;
        }

        @Override // com.bumptech.glide.load.C1056a.f
        /* JADX INFO: renamed from: a */
        public int mo5353a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo5344c(this.f4372a, this.f4373b);
            } finally {
                this.f4372a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$e */
    public class e implements f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ w760 f4374a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h01 f4375b;

        public e(w760 w760Var, h01 h01Var) {
            this.f4374a = w760Var;
            this.f4375b = h01Var;
        }

        @Override // com.bumptech.glide.load.C1056a.f
        /* JADX INFO: renamed from: a */
        public int mo5353a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f4374a.mo112975a().getFileDescriptor()), this.f4375b);
                try {
                    int iMo5344c = imageHeaderParser.mo5344c(recyclableBufferedInputStream2, this.f4375b);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f4374a.mo112975a();
                    return iMo5344c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f4374a.mo112975a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        int mo5353a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        ImageHeaderParser.ImageType mo5352a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: renamed from: a */
    public static int m5345a(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull h01 h01Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, h01Var);
        }
        inputStream.mark(5242880);
        return m5347c(list, new d(inputStream, h01Var));
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: b */
    public static int m5346b(@NonNull List<ImageHeaderParser> list, @NonNull w760 w760Var, @NonNull h01 h01Var) throws IOException {
        return m5347c(list, new e(w760Var, h01Var));
    }

    /* JADX INFO: renamed from: c */
    private static int m5347c(@NonNull List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iMo5353a = fVar.mo5353a(list.get(i));
            if (iMo5353a != -1) {
                return iMo5353a;
            }
        }
        return -1;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static ImageHeaderParser.ImageType m5348d(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull h01 h01Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, h01Var);
        }
        inputStream.mark(5242880);
        return m5351g(list, new a(inputStream));
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static ImageHeaderParser.ImageType m5349e(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m5351g(list, new b(byteBuffer));
    }

    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: f */
    public static ImageHeaderParser.ImageType m5350f(@NonNull List<ImageHeaderParser> list, @NonNull w760 w760Var, @NonNull h01 h01Var) throws IOException {
        return m5351g(list, new c(w760Var, h01Var));
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private static ImageHeaderParser.ImageType m5351g(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeMo5352a = gVar.mo5352a(list.get(i));
            if (imageTypeMo5352a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo5352a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
