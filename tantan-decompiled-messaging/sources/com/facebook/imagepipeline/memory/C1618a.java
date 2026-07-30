package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.b2s;
import p149l.jhy;
import p149l.va80;
import p149l.wa80;
import p149l.wp3;

/* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Lcom/facebook/imagepipeline/memory/a;", "Lcom/facebook/imagepipeline/memory/BasePool;", "", "Ll/wp3;", "Ll/jhy;", "memoryTrimmableRegistry", "Ll/va80;", "poolParams", "Ll/wa80;", "poolStatsTracker", "<init>", "(Ll/jhy;Ll/va80;Ll/wa80;)V", "", "bucketedSize", "A", "(I)[B", "value", "", "B", "([B)V", "p", "(I)I", "requestSize", "n", b2s.C_ZONE, "([B)I", "", "k", "[I", "bucketSizes", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class C1618a extends BasePool<byte[]> implements wp3 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final int[] bucketSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618a(@NotNull jhy jhyVar, @NotNull va80 va80Var, @NotNull wa80 wa80Var) {
        super(jhyVar, va80Var, wa80Var);
        jhyVar.getClass();
        va80Var.getClass();
        wa80Var.getClass();
        SparseIntArray sparseIntArray = va80Var.f180718c;
        if (sparseIntArray != null) {
            this.bucketSizes = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.bucketSizes[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.bucketSizes = new int[0];
        }
        m8420s();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public byte[] mo8408g(int bucketedSize) {
        return new byte[bucketedSize];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8412k(@NotNull byte[] value) {
        value.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo8416o(@NotNull byte[] value) {
        value.getClass();
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo8415n(int requestSize) {
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
    public int mo8417p(int bucketedSize) {
        return bucketedSize;
    }
}
