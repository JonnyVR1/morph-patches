package okio;

import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m87232d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "jvm"}, m87233k = 2, m87234mv = {1, 1, 11})
@JvmName
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink sink, @NotNull Deflater deflater) {
        sink.getClass();
        deflater.getClass();
        return new DeflaterSink(sink, deflater);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        sink.getClass();
        deflater.getClass();
        return new DeflaterSink(sink, deflater);
    }
}
