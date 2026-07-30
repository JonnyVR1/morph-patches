package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C1062a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1066c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p153l.er3;
import p153l.o01;
import p153l.vn80;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC1111b {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class a implements InterfaceC1111b {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4640a;

        /* JADX INFO: renamed from: b */
        private final List<ImageHeaderParser> f4641b;

        /* JADX INFO: renamed from: c */
        private final o01 f4642c;

        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, o01 o01Var) {
            this.f4640a = byteBuffer;
            this.f4641b = list;
            this.f4642c = o01Var;
        }

        /* JADX INFO: renamed from: e */
        private InputStream m5595e() {
            return er3.m122100g(er3.m122097d(this.f4640a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: a */
        public void mo5591a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: b */
        public int mo5592b() throws IOException {
            return C1062a.m5360c(this.f4641b, er3.m122097d(this.f4640a), this.f4642c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo5593c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m5595e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo5594d() throws IOException {
            return C1062a.m5364g(this.f4641b, er3.m122097d(this.f4640a));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class b implements InterfaceC1111b {

        /* JADX INFO: renamed from: a */
        private final C1066c f4643a;

        /* JADX INFO: renamed from: b */
        private final o01 f4644b;

        /* JADX INFO: renamed from: c */
        private final List<ImageHeaderParser> f4645c;

        public b(InputStream inputStream, List<ImageHeaderParser> list, o01 o01Var) {
            this.f4644b = (o01) vn80.m201944d(o01Var);
            this.f4645c = (List) vn80.m201944d(list);
            this.f4643a = new C1066c(inputStream, o01Var);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: a */
        public void mo5591a() {
            this.f4643a.m5376b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: b */
        public int mo5592b() throws IOException {
            return C1062a.m5359b(this.f4645c, this.f4643a.mo5369a(), this.f4644b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo5593c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f4643a.mo5369a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo5594d() throws IOException {
            return C1062a.m5363f(this.f4645c, this.f4643a.mo5369a(), this.f4644b);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    @RequiresApi(21)
    public static final class c implements InterfaceC1111b {

        /* JADX INFO: renamed from: a */
        private final o01 f4646a;

        /* JADX INFO: renamed from: b */
        private final List<ImageHeaderParser> f4647b;

        /* JADX INFO: renamed from: c */
        private final ParcelFileDescriptorRewinder f4648c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, o01 o01Var) {
            this.f4646a = (o01) vn80.m201944d(o01Var);
            this.f4647b = (List) vn80.m201944d(list);
            this.f4648c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: a */
        public void mo5591a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: b */
        public int mo5592b() throws IOException {
            return C1062a.m5358a(this.f4647b, this.f4648c, this.f4646a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo5593c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f4648c.mo5369a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC1111b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo5594d() throws IOException {
            return C1062a.m5362e(this.f4647b, this.f4648c, this.f4646a);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo5591a();

    /* JADX INFO: renamed from: b */
    int mo5592b() throws IOException;

    @Nullable
    /* JADX INFO: renamed from: c */
    Bitmap mo5593c(BitmapFactory.Options options) throws IOException;

    /* JADX INFO: renamed from: d */
    ImageHeaderParser.ImageType mo5594d() throws IOException;
}
