package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import p153l.bj80;
import p153l.cj80;
import p153l.gqy;
import p153l.ppy;
import p153l.wn80;

/* JADX INFO: renamed from: com.facebook.imagepipeline.memory.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1642b extends BasePool<ppy> {

    /* JADX INFO: renamed from: k */
    public final int[] f6496k;

    public AbstractC1642b(gqy gqyVar, bj80 bj80Var, cj80 cj80Var) {
        super(gqyVar, bj80Var, cj80Var);
        SparseIntArray sparseIntArray = (SparseIntArray) wn80.m207182g(bj80Var.f76966c);
        this.f6496k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f6496k;
            if (i >= iArr.length) {
                m8474s();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract ppy mo8462g(int i);

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8466k(ppy ppyVar) {
        wn80.m207182g(ppyVar);
        ppyVar.close();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo8470o(ppy ppyVar) {
        wn80.m207182g(ppyVar);
        return ppyVar.getSize();
    }

    /* JADX INFO: renamed from: D */
    public int m8501D() {
        return this.f6496k[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo8476u(ppy ppyVar) {
        wn80.m207182g(ppyVar);
        return !ppyVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo8469n(int i) {
        if (i <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.f6496k) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo8471p(int i) {
        return i;
    }
}
