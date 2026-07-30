package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p149l.b5f;
import p149l.g23;
import p149l.h01;
import p149l.px50;
import p149l.rvc0;
import p149l.suw;
import p149l.wvc0;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* JADX INFO: loaded from: classes.dex */
public class C1095c implements wvc0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final C1093a f4624a;

    /* JADX INFO: renamed from: b */
    private final h01 f4625b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C1093a.b {

        /* JADX INFO: renamed from: a */
        private final RecyclableBufferedInputStream f4626a;

        /* JADX INFO: renamed from: b */
        private final b5f f4627b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, b5f b5fVar) {
            this.f4626a = recyclableBufferedInputStream;
            this.f4627b = b5fVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1093a.b
        /* JADX INFO: renamed from: a */
        public void mo5546a() {
            this.f4626a.m5519k();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1093a.b
        /* JADX INFO: renamed from: b */
        public void mo5547b(g23 g23Var, Bitmap bitmap) throws IOException {
            IOException iOExceptionM100329k = this.f4627b.m100329k();
            if (iOExceptionM100329k != null) {
                if (bitmap == null) {
                    throw iOExceptionM100329k;
                }
                g23Var.mo124142c(bitmap);
                throw iOExceptionM100329k;
            }
        }
    }

    public C1095c(C1093a c1093a, h01 h01Var) {
        this.f4624a = c1093a;
        this.f4625b = h01Var;
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Bitmap> mo5553b(@NonNull InputStream inputStream, int i, int i2, @NonNull px50 px50Var) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f4625b);
        }
        b5f b5fVarM100328m = b5f.m100328m(recyclableBufferedInputStream);
        try {
            return this.f4624a.m5542g(new suw(b5fVarM100328m), i, i2, px50Var, new a(recyclableBufferedInputStream, b5fVarM100328m));
        } finally {
            b5fVarM100328m.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull InputStream inputStream, @NonNull px50 px50Var) {
        return this.f4624a.m5544p(inputStream);
    }
}
