package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import p149l.jhy;
import p149l.rf80;
import p149l.sgy;
import p149l.va80;
import p149l.wa80;

/* JADX INFO: renamed from: com.facebook.imagepipeline.memory.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1619b extends BasePool<sgy> {

    /* JADX INFO: renamed from: k */
    public final int[] f6459k;

    public AbstractC1619b(jhy jhyVar, va80 va80Var, wa80 wa80Var) {
        super(jhyVar, va80Var, wa80Var);
        SparseIntArray sparseIntArray = (SparseIntArray) rf80.m179116g(va80Var.f180718c);
        this.f6459k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f6459k;
            if (i >= iArr.length) {
                m8420s();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract sgy mo8408g(int i);

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8412k(sgy sgyVar) {
        rf80.m179116g(sgyVar);
        sgyVar.close();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo8416o(sgy sgyVar) {
        rf80.m179116g(sgyVar);
        return sgyVar.getSize();
    }

    /* JADX INFO: renamed from: D */
    public int m8447D() {
        return this.f6459k[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo8422u(sgy sgyVar) {
        rf80.m179116g(sgyVar);
        return !sgyVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo8415n(int i) {
        if (i <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.f6459k) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo8417p(int i) {
        return i;
    }
}
