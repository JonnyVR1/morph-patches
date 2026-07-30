package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p153l.g6f;
import p153l.o01;
import p153l.rxw;
import p153l.u3d0;
import p153l.u560;
import p153l.w23;
import p153l.z3d0;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* JADX INFO: loaded from: classes.dex */
public class C1112c implements z3d0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final C1110a f4649a;

    /* JADX INFO: renamed from: b */
    private final o01 f4650b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C1110a.b {

        /* JADX INFO: renamed from: a */
        private final RecyclableBufferedInputStream f4651a;

        /* JADX INFO: renamed from: b */
        private final g6f f4652b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, g6f g6fVar) {
            this.f4651a = recyclableBufferedInputStream;
            this.f4652b = g6fVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1110a.b
        /* JADX INFO: renamed from: a */
        public void mo5589a() {
            this.f4651a.m5546k();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1110a.b
        /* JADX INFO: renamed from: b */
        public void mo5590b(w23 w23Var, Bitmap bitmap) throws IOException {
            IOException iOExceptionM129247k = this.f4652b.m129247k();
            if (iOExceptionM129247k != null) {
                if (bitmap == null) {
                    throw iOExceptionM129247k;
                }
                w23Var.mo191126c(bitmap);
                throw iOExceptionM129247k;
            }
        }
    }

    public C1112c(C1110a c1110a, o01 o01Var) {
        this.f4649a = c1110a;
        this.f4650b = o01Var;
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull InputStream inputStream, int i, int i2, @NonNull u560 u560Var) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f4650b);
        }
        g6f g6fVarM129246m = g6f.m129246m(recyclableBufferedInputStream);
        try {
            return this.f4649a.m5584f(new rxw(g6fVarM129246m), i, i2, u560Var, new a(recyclableBufferedInputStream, g6fVarM129246m));
        } finally {
            g6fVarM129246m.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull InputStream inputStream, @NonNull u560 u560Var) {
        return this.f4649a.m5587p(inputStream);
    }
}
