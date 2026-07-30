package p149l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class qyi extends utc0 {

    /* JADX INFO: renamed from: c */
    public static final hyx f156927c = hyx.m133627c(MimeTypes.FORM_ENCODED);

    /* JADX INFO: renamed from: a */
    public final List<String> f156928a;

    /* JADX INFO: renamed from: b */
    public final List<String> f156929b;

    public qyi(List<String> list, List<String> list2) {
        this.f156928a = tck0.m188019t(list);
        this.f156929b = tck0.m188019t(list2);
    }

    /* JADX INFO: renamed from: a */
    public final long m177039a(BufferedSink bufferedSink, boolean z) throws EOFException {
        Buffer buffer = z ? new Buffer() : bufferedSink.getBufferField();
        int size = this.f156928a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.f156928a.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.f156929b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p149l.utc0
    public long contentLength() {
        return m177039a(null, true);
    }

    @Override // p149l.utc0
    public hyx contentType() {
        return f156927c;
    }

    @Override // p149l.utc0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        m177039a(bufferedSink, false);
    }

    /* JADX INFO: renamed from: l.qyi$a */
    public static final class C19606a {

        /* JADX INFO: renamed from: a */
        public final List<String> f156930a;

        /* JADX INFO: renamed from: b */
        public final List<String> f156931b;

        /* JADX INFO: renamed from: c */
        public final Charset f156932c;

        public C19606a(Charset charset) {
            this.f156930a = new ArrayList();
            this.f156931b = new ArrayList();
            this.f156932c = charset;
        }

        /* JADX INFO: renamed from: a */
        public C19606a m177040a(String str, String str2) {
            if (str == null) {
                jfd0.m141176a("name == null");
                return null;
            }
            if (str2 == null) {
                jfd0.m141176a("value == null");
                return null;
            }
            this.f156930a.add(cll.m107496c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f156932c));
            this.f156931b.add(cll.m107496c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f156932c));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public qyi m177041b() {
            return new qyi(this.f156930a, this.f156931b);
        }

        public C19606a() {
            this(null);
        }
    }
}
