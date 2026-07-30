package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, m87232d2 = {HttpHeaderValues.GZIP, "Lokio/GzipSink;", "Lokio/Sink;", "jvm"}, m87233k = 2, m87234mv = {1, 1, 11})
@JvmName
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink sink) {
        sink.getClass();
        return new GzipSink(sink);
    }
}
