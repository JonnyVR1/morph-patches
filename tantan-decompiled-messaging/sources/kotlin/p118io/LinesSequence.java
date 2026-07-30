package kotlin.p118io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import p149l.lmr;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/BufferedReader;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LinesSequence implements Sequence<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BufferedReader reader;

    /* JADX INFO: renamed from: kotlin.io.LinesSequence$iterator$1 */
    @Metadata(m87231d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "", "hasNext", "()Z", "a", "()Ljava/lang/String;", "Ljava/lang/String;", "nextValue", "b", "Z", "done", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C151631 implements Iterator<String>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public String nextValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean done;

        public C151631() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            String str = this.nextValue;
            this.nextValue = null;
            str.getClass();
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.nextValue == null && !this.done) {
                String line = LinesSequence.this.reader.readLine();
                this.nextValue = line;
                if (line == null) {
                    this.done = true;
                }
            }
            return this.nextValue != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public LinesSequence(@NotNull BufferedReader bufferedReader) {
        bufferedReader.getClass();
        this.reader = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<String> iterator() {
        return new C151631();
    }
}
