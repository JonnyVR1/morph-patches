package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p153l.fb5;
import p153l.vsi;
import p153l.w6e;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: a */
    public final vsi f6503a;

    @w6e
    public KitKatPurgeableDecoder(vsi vsiVar) {
        this.f6503a = vsiVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m8521h(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: c */
    public Bitmap mo8507c(fb5<PooledByteBuffer> fb5Var, BitmapFactory.Options options) {
        PooledByteBuffer pooledByteBufferM124875B = fb5Var.m124875B();
        int size = pooledByteBufferM124875B.size();
        fb5<byte[]> fb5VarM202615a = this.f6503a.m202615a(size);
        try {
            byte[] bArrM124875B = fb5VarM202615a.m124875B();
            pooledByteBufferM124875B.mo8210p(0, bArrM124875B, 0, size);
            return (Bitmap) wn80.m207183h(BitmapFactory.decodeByteArray(bArrM124875B, 0, size, options), "BitmapFactory returned null");
        } finally {
            fb5.m124874v(fb5VarM202615a);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: d */
    public Bitmap mo8508d(fb5<PooledByteBuffer> fb5Var, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.m8503e(fb5Var, i) ? null : DalvikPurgeableDecoder.EOI;
        PooledByteBuffer pooledByteBufferM124875B = fb5Var.m124875B();
        wn80.m207177b(Boolean.valueOf(i <= pooledByteBufferM124875B.size()));
        int i2 = i + 2;
        fb5<byte[]> fb5VarM202615a = this.f6503a.m202615a(i2);
        try {
            byte[] bArrM124875B = fb5VarM202615a.m124875B();
            pooledByteBufferM124875B.mo8210p(0, bArrM124875B, 0, i);
            if (bArr != null) {
                m8521h(bArrM124875B, i);
                i = i2;
            }
            return (Bitmap) wn80.m207183h(BitmapFactory.decodeByteArray(bArrM124875B, 0, i, options), "BitmapFactory returned null");
        } finally {
            fb5.m124874v(fb5VarM202615a);
        }
    }
}
