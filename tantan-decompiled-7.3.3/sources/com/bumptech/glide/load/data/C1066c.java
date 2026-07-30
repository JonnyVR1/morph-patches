package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import p153l.o01;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1066c implements InterfaceC1064a<InputStream> {

    /* JADX INFO: renamed from: a */
    private final RecyclableBufferedInputStream f4384a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.c$a */
    public static final class a implements InterfaceC1064a.a<InputStream> {

        /* JADX INFO: renamed from: a */
        private final o01 f4385a;

        public a(o01 o01Var) {
            this.f4385a = o01Var;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<InputStream> mo5371a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1064a<InputStream> mo5372b(InputStream inputStream) {
            return new C1066c(inputStream, this.f4385a);
        }
    }

    public C1066c(InputStream inputStream, o01 o01Var) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, o01Var);
        this.f4384a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* JADX INFO: renamed from: b */
    public void m5376b() {
        this.f4384a.m5546k();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1064a
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo5369a() throws IOException {
        this.f4384a.reset();
        return this.f4384a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1064a
    public void cleanup() {
        this.f4384a.release();
    }
}
