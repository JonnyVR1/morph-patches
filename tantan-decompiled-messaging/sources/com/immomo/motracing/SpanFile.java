package com.immomo.motracing;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m87232d2 = {"Lcom/immomo/motracing/SpanFile;", "", "Lcom/immomo/motracing/SpanRecord;", "Ljava/io/Closeable;", "", "fileName", "path", "", "_prepareFile", "(Ljava/lang/String;Ljava/lang/String;)J", "np", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "_hasNext", "(JI)Z", "_next", "(JI)Lcom/immomo/motracing/SpanRecord;", "", "_close", "(J)V", "", "iterator", "()Ljava/util/Iterator;", "close", "()V", "J", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "MoTracing_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class SpanFile implements Iterable<SpanRecord>, Closeable, KMappedMarker {
    private long np;

    @NotNull
    private final String path;

    /* JADX INFO: renamed from: com.immomo.motracing.SpanFile$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, m87232d2 = {"com/immomo/motracing/SpanFile$a", "", "Lcom/immomo/motracing/SpanRecord;", "", "hasNext", "()Z", "a", "()Lcom/immomo/motracing/SpanRecord;", "", "I", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "MoTracing_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C3921a implements Iterator<SpanRecord>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int offset;

        public C3921a() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public SpanRecord m19356a() {
            SpanFile spanFile = SpanFile.this;
            SpanFile.m19354h(spanFile, spanFile.np, this.offset);
            throw new NoSuchElementException("span record not found");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            SpanFile spanFile = SpanFile.this;
            return spanFile._hasNext(spanFile.np, this.offset);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ SpanRecord next() {
            m19356a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final native void _close(long np);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean _hasNext(long np, int offset);

    private final native SpanRecord _next(long np, int offset);

    private final native long _prepareFile(String fileName, String path);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ SpanRecord m19354h(SpanFile spanFile, long j, int i) {
        spanFile._next(j, i);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.np;
        if (j != 0) {
            _close(j);
        }
        this.np = 0L;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<SpanRecord> iterator() {
        return new C3921a();
    }
}
