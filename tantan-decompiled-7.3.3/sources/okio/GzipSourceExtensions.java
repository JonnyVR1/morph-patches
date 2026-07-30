package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0082\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m88121d2 = {"FCOMMENT", "", "FEXTRA", "FHCRC", "FNAME", "SECTION_BODY", "", "SECTION_DONE", "SECTION_HEADER", "SECTION_TRAILER", "getBit", "", "bit", HttpHeaderValues.GZIP, "Lokio/GzipSource;", "Lokio/Source;", "jvm"}, m88122k = 2, m88123mv = {1, 1, 11})
@JvmName
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBit(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    @NotNull
    public static final GzipSource gzip(@NotNull Source source) {
        source.getClass();
        return new GzipSource(source);
    }
}
