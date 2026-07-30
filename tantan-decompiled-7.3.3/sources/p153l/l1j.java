package p153l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class l1j extends z1d0 {

    /* JADX INFO: renamed from: c */
    public static final e7y f129692c = e7y.m119772c(MimeTypes.FORM_ENCODED);

    /* JADX INFO: renamed from: a */
    public final List<String> f129693a;

    /* JADX INFO: renamed from: b */
    public final List<String> f129694b;

    public l1j(List<String> list, List<String> list2) {
        this.f129693a = zlk0.m220258t(list);
        this.f129694b = zlk0.m220258t(list2);
    }

    /* JADX INFO: renamed from: a */
    public final long m152496a(BufferedSink bufferedSink, boolean z) throws EOFException {
        Buffer buffer = z ? new Buffer() : bufferedSink.getBufferField();
        int size = this.f129693a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.f129693a.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.f129694b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p153l.z1d0
    public long contentLength() {
        return m152496a(null, true);
    }

    @Override // p153l.z1d0
    public e7y contentType() {
        return f129692c;
    }

    @Override // p153l.z1d0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        m152496a(bufferedSink, false);
    }

    /* JADX INFO: renamed from: l.l1j$a */
    public static final class C18332a {

        /* JADX INFO: renamed from: a */
        public final List<String> f129695a;

        /* JADX INFO: renamed from: b */
        public final List<String> f129696b;

        /* JADX INFO: renamed from: c */
        public final Charset f129697c;

        public C18332a(Charset charset) {
            this.f129695a = new ArrayList();
            this.f129696b = new ArrayList();
            this.f129697c = charset;
        }

        /* JADX INFO: renamed from: a */
        public C18332a m152497a(String str, String str2) {
            if (str == null) {
                mnd0.m159157a("name == null");
                return null;
            }
            if (str2 == null) {
                mnd0.m159157a("value == null");
                return null;
            }
            this.f129695a.add(rnl.m182260c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f129697c));
            this.f129696b.add(rnl.m182260c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f129697c));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public l1j m152498b() {
            return new l1j(this.f129695a, this.f129696b);
        }

        public C18332a() {
            this(null);
        }
    }
}
