package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p149l.fa5;
import p149l.i5e;
import p149l.rf80;
import p149l.zpi;

/* JADX INFO: loaded from: classes.dex */
@i5e
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: a */
    public final zpi f6466a;

    @i5e
    public KitKatPurgeableDecoder(zpi zpiVar) {
        this.f6466a = zpiVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m8467h(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: c */
    public Bitmap mo8453c(fa5<PooledByteBuffer> fa5Var, BitmapFactory.Options options) {
        PooledByteBuffer pooledByteBufferM120155B = fa5Var.m120155B();
        int size = pooledByteBufferM120155B.size();
        fa5<byte[]> fa5VarM219670a = this.f6466a.m219670a(size);
        try {
            byte[] bArrM120155B = fa5VarM219670a.m120155B();
            pooledByteBufferM120155B.mo8156p(0, bArrM120155B, 0, size);
            return (Bitmap) rf80.m179117h(BitmapFactory.decodeByteArray(bArrM120155B, 0, size, options), "BitmapFactory returned null");
        } finally {
            fa5.m120154v(fa5VarM219670a);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: d */
    public Bitmap mo8454d(fa5<PooledByteBuffer> fa5Var, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.m8449e(fa5Var, i) ? null : DalvikPurgeableDecoder.EOI;
        PooledByteBuffer pooledByteBufferM120155B = fa5Var.m120155B();
        rf80.m179111b(Boolean.valueOf(i <= pooledByteBufferM120155B.size()));
        int i2 = i + 2;
        fa5<byte[]> fa5VarM219670a = this.f6466a.m219670a(i2);
        try {
            byte[] bArrM120155B = fa5VarM219670a.m120155B();
            pooledByteBufferM120155B.mo8156p(0, bArrM120155B, 0, i);
            if (bArr != null) {
                m8467h(bArrM120155B, i);
                i = i2;
            }
            return (Bitmap) rf80.m179117h(BitmapFactory.decodeByteArray(bArrM120155B, 0, i, options), "BitmapFactory returned null");
        } finally {
            fa5.m120154v(fa5VarM219670a);
        }
    }
}
