package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C1056a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p149l.h01;
import p149l.qf80;
import p149l.w760;
import p149l.zsm;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC1094b {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC1094b {

        /* JADX INFO: renamed from: a */
        private final zsm f4618a;

        /* JADX INFO: renamed from: b */
        private final h01 f4619b;

        /* JADX INFO: renamed from: c */
        private final List<ImageHeaderParser> f4620c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, h01 h01Var) {
            this.f4619b = (h01) qf80.m174276d(h01Var);
            this.f4620c = (List) qf80.m174276d(list);
            this.f4618a = new zsm(inputStream, h01Var);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        /* JADX INFO: renamed from: a */
        public void mo5548a() {
            this.f4618a.m220041b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        /* JADX INFO: renamed from: b */
        public int mo5549b() throws IOException {
            return C1056a.m5345a(this.f4620c, this.f4618a.mo112975a(), this.f4619b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo5550c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f4618a.mo112975a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo5551d() throws IOException {
            return C1056a.m5348d(this.f4620c, this.f4618a.mo112975a(), this.f4619b);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    @RequiresApi(21)
    public static final class b implements InterfaceC1094b {

        /* JADX INFO: renamed from: a */
        private final h01 f4621a;

        /* JADX INFO: renamed from: b */
        private final List<ImageHeaderParser> f4622b;

        /* JADX INFO: renamed from: c */
        private final w760 f4623c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, h01 h01Var) {
            this.f4621a = (h01) qf80.m174276d(h01Var);
            this.f4622b = (List) qf80.m174276d(list);
            this.f4623c = new w760(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        /* JADX INFO: renamed from: a */
        public void mo5548a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        /* JADX INFO: renamed from: b */
        public int mo5549b() throws IOException {
            return C1056a.m5346b(this.f4622b, this.f4623c, this.f4621a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo5550c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f4623c.mo112975a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1094b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo5551d() throws IOException {
            return C1056a.m5350f(this.f4622b, this.f4623c, this.f4621a);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo5548a();

    /* JADX INFO: renamed from: b */
    int mo5549b() throws IOException;

    @Nullable
    /* JADX INFO: renamed from: c */
    Bitmap mo5550c(BitmapFactory.Options options) throws IOException;

    /* JADX INFO: renamed from: d */
    ImageHeaderParser.ImageType mo5551d() throws IOException;
}
