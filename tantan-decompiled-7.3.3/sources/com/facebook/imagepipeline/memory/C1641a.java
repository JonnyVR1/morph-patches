package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.bj80;
import p153l.c4s;
import p153l.cj80;
import p153l.gqy;
import p153l.wq3;

/* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Lcom/facebook/imagepipeline/memory/a;", "Lcom/facebook/imagepipeline/memory/BasePool;", "", "Ll/wq3;", "Ll/gqy;", "memoryTrimmableRegistry", "Ll/bj80;", "poolParams", "Ll/cj80;", "poolStatsTracker", "<init>", "(Ll/gqy;Ll/bj80;Ll/cj80;)V", "", "bucketedSize", "A", "(I)[B", "value", "", "B", "([B)V", "p", "(I)I", "requestSize", "n", c4s.C_ZONE, "([B)I", "", "k", "[I", "bucketSizes", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class C1641a extends BasePool<byte[]> implements wq3 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final int[] bucketSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1641a(@NotNull gqy gqyVar, @NotNull bj80 bj80Var, @NotNull cj80 cj80Var) {
        super(gqyVar, bj80Var, cj80Var);
        gqyVar.getClass();
        bj80Var.getClass();
        cj80Var.getClass();
        SparseIntArray sparseIntArray = bj80Var.f76966c;
        if (sparseIntArray != null) {
            this.bucketSizes = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.bucketSizes[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.bucketSizes = new int[0];
        }
        m8474s();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public byte[] mo8462g(int bucketedSize) {
        return new byte[bucketedSize];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8466k(@NotNull byte[] value) {
        value.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo8470o(@NotNull byte[] value) {
        value.getClass();
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo8469n(int requestSize) {
        if (requestSize <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(requestSize));
        }
        for (int i : this.bucketSizes) {
            if (i >= requestSize) {
                return i;
            }
        }
        return requestSize;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo8471p(int bucketedSize) {
        return bucketedSize;
    }
}
