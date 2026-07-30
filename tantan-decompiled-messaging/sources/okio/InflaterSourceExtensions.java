package okio;

import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m87232d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "jvm"}, m87233k = 2, m87234mv = {1, 1, 11})
@JvmName
public final class InflaterSourceExtensions {
    @NotNull
    public static final InflaterSource inflate(@NotNull Source source, @NotNull Inflater inflater) {
        source.getClass();
        inflater.getClass();
        return new InflaterSource(source, inflater);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        source.getClass();
        inflater.getClass();
        return new InflaterSource(source, inflater);
    }
}
