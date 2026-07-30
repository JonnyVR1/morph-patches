package kotlin.p122io;

import java.io.BufferedInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;
import p153l.npj0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0004\"\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, m88121d2 = {"kotlin/io/ByteStreamsKt$iterator$1", "Lkotlin/collections/ByteIterator;", "", "hasNext", "()Z", "", "nextByte", "()B", "", "a", "()V", "", "I", "getNextByte", "()I", "setNextByte", "(I)V", "b", "Z", "getNextPrepared", "setNextPrepared", "(Z)V", "nextPrepared", "c", "getFinished", "setFinished", "finished", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ByteStreamsKt$iterator$1 extends ByteIterator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int nextByte;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean nextPrepared;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean finished;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BufferedInputStream f64130d;

    /* JADX INFO: renamed from: a */
    public final void m88292a() throws IOException {
        if (this.nextPrepared || this.finished) {
            return;
        }
        int i = this.f64130d.read();
        this.nextByte = i;
        this.nextPrepared = true;
        this.finished = i == -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws IOException {
        m88292a();
        return !this.finished;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() throws IOException {
        m88292a();
        if (this.finished) {
            npj0.m164229a("Input stream is over.");
            return (byte) 0;
        }
        byte b = (byte) this.nextByte;
        this.nextPrepared = false;
        return b;
    }
}
