package p153l;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes2.dex */
public final class zll {

    /* JADX INFO: renamed from: a */
    public static final xzk[] f204958a;

    /* JADX INFO: renamed from: b */
    public static final Map<ByteString, Integer> f204959b;

    static {
        xzk xzkVar = new xzk(xzk.f196883i, "");
        ByteString byteString = xzk.f196880f;
        xzk xzkVar2 = new xzk(byteString, "GET");
        xzk xzkVar3 = new xzk(byteString, "POST");
        ByteString byteString2 = xzk.f196881g;
        xzk xzkVar4 = new xzk(byteString2, "/");
        xzk xzkVar5 = new xzk(byteString2, "/index.html");
        ByteString byteString3 = xzk.f196882h;
        xzk xzkVar6 = new xzk(byteString3, "http");
        xzk xzkVar7 = new xzk(byteString3, "https");
        ByteString byteString4 = xzk.f196879e;
        f204958a = new xzk[]{xzkVar, xzkVar2, xzkVar3, xzkVar4, xzkVar5, xzkVar6, xzkVar7, new xzk(byteString4, "200"), new xzk(byteString4, "204"), new xzk(byteString4, "206"), new xzk(byteString4, "304"), new xzk(byteString4, "400"), new xzk(byteString4, "404"), new xzk(byteString4, "500"), new xzk("accept-charset", ""), new xzk("accept-encoding", "gzip, deflate"), new xzk("accept-language", ""), new xzk("accept-ranges", ""), new xzk("accept", ""), new xzk("access-control-allow-origin", ""), new xzk(SeeTextDynamicParam.age, ""), new xzk(MomentAllowForwardState.allow, ""), new xzk("authorization", ""), new xzk("cache-control", ""), new xzk("content-disposition", ""), new xzk("content-encoding", ""), new xzk("content-language", ""), new xzk("content-length", ""), new xzk("content-location", ""), new xzk("content-range", ""), new xzk("content-type", ""), new xzk("cookie", ""), new xzk("date", ""), new xzk("etag", ""), new xzk("expect", ""), new xzk("expires", ""), new xzk("from", ""), new xzk("host", ""), new xzk("if-match", ""), new xzk("if-modified-since", ""), new xzk("if-none-match", ""), new xzk("if-range", ""), new xzk("if-unmodified-since", ""), new xzk("last-modified", ""), new xzk(Link.TYPE, ""), new xzk("location", ""), new xzk("max-forwards", ""), new xzk("proxy-authenticate", ""), new xzk("proxy-authorization", ""), new xzk("range", ""), new xzk(RequestParameters.SUBRESOURCE_REFERER, ""), new xzk(BLiveOperationActionAfterCountdown.refresh, ""), new xzk("retry-after", ""), new xzk("server", ""), new xzk("set-cookie", ""), new xzk("strict-transport-security", ""), new xzk("transfer-encoding", ""), new xzk("user-agent", ""), new xzk("vary", ""), new xzk("via", ""), new xzk("www-authenticate", "")};
        f204959b = m220266b();
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m220265a(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                rr10.m182681a("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.utf8());
                return null;
            }
        }
        return byteString;
    }

    /* JADX INFO: renamed from: b */
    public static Map<ByteString, Integer> m220266b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f204958a.length);
        int i = 0;
        while (true) {
            xzk[] xzkVarArr = f204958a;
            if (i >= xzkVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(xzkVarArr[i].f196884a)) {
                linkedHashMap.put(xzkVarArr[i].f196884a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l.zll$b */
    public static final class C21836b {

        /* JADX INFO: renamed from: a */
        public final Buffer f204968a;

        /* JADX INFO: renamed from: b */
        public final boolean f204969b;

        /* JADX INFO: renamed from: c */
        public int f204970c;

        /* JADX INFO: renamed from: d */
        public boolean f204971d;

        /* JADX INFO: renamed from: e */
        public int f204972e;

        /* JADX INFO: renamed from: f */
        public int f204973f;

        /* JADX INFO: renamed from: g */
        public xzk[] f204974g;

        /* JADX INFO: renamed from: h */
        public int f204975h;

        /* JADX INFO: renamed from: i */
        public int f204976i;

        /* JADX INFO: renamed from: j */
        public int f204977j;

        public C21836b(int i, boolean z, Buffer buffer) {
            this.f204970c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            xzk[] xzkVarArr = new xzk[8];
            this.f204974g = xzkVarArr;
            this.f204975h = xzkVarArr.length - 1;
            this.f204976i = 0;
            this.f204977j = 0;
            this.f204972e = i;
            this.f204973f = i;
            this.f204969b = z;
            this.f204968a = buffer;
        }

        /* JADX INFO: renamed from: a */
        public final void m220284a() {
            int i = this.f204973f;
            int i2 = this.f204977j;
            if (i < i2) {
                if (i == 0) {
                    m220285b();
                } else {
                    m220286c(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m220285b() {
            Arrays.fill(this.f204974g, (Object) null);
            this.f204975h = this.f204974g.length - 1;
            this.f204976i = 0;
            this.f204977j = 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m220286c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f204974g.length;
                while (true) {
                    length--;
                    i2 = this.f204975h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f204974g[length].f196886c;
                    i -= i4;
                    this.f204977j -= i4;
                    this.f204976i--;
                    i3++;
                }
                xzk[] xzkVarArr = this.f204974g;
                System.arraycopy(xzkVarArr, i2 + 1, xzkVarArr, i2 + 1 + i3, this.f204976i);
                xzk[] xzkVarArr2 = this.f204974g;
                int i5 = this.f204975h;
                Arrays.fill(xzkVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f204975h += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: d */
        public final void m220287d(xzk xzkVar) {
            int i = xzkVar.f196886c;
            int i2 = this.f204973f;
            if (i > i2) {
                m220285b();
                return;
            }
            m220286c((this.f204977j + i) - i2);
            int i3 = this.f204976i + 1;
            xzk[] xzkVarArr = this.f204974g;
            if (i3 > xzkVarArr.length) {
                xzk[] xzkVarArr2 = new xzk[xzkVarArr.length * 2];
                System.arraycopy(xzkVarArr, 0, xzkVarArr2, xzkVarArr.length, xzkVarArr.length);
                this.f204975h = this.f204974g.length - 1;
                this.f204974g = xzkVarArr2;
            }
            int i4 = this.f204975h;
            this.f204975h = i4 - 1;
            this.f204974g[i4] = xzkVar;
            this.f204976i++;
            this.f204977j += i;
        }

        /* JADX INFO: renamed from: e */
        public void m220288e(int i) {
            this.f204972e = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f204973f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f204970c = Math.min(this.f204970c, iMin);
            }
            this.f204971d = true;
            this.f204973f = iMin;
            m220284a();
        }

        /* JADX INFO: renamed from: f */
        public void m220289f(ByteString byteString) throws IOException {
            if (!this.f204969b || hol.m136443f().m136448e(byteString) >= byteString.size()) {
                m220291h(byteString.size(), 127, 0);
                this.f204968a.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            hol.m136443f().m136447d(byteString, buffer);
            ByteString byteString2 = buffer.readByteString();
            m220291h(byteString2.size(), 127, 128);
            this.f204968a.write(byteString2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX INFO: renamed from: g */
        public void m220290g(List<xzk> list) throws IOException {
            int length;
            int length2;
            if (this.f204971d) {
                int i = this.f204970c;
                if (i < this.f204973f) {
                    m220291h(i, 31, 32);
                }
                this.f204971d = false;
                this.f204970c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m220291h(this.f204973f, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                xzk xzkVar = list.get(i2);
                ByteString asciiLowercase = xzkVar.f196884a.toAsciiLowercase();
                ByteString byteString = xzkVar.f196885b;
                Integer num = zll.f204959b.get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        xzk[] xzkVarArr = zll.f204958a;
                        if (Objects.equals(xzkVarArr[iIntValue].f196885b, byteString)) {
                            length = length2;
                        } else if (Objects.equals(xzkVarArr[length2].f196885b, byteString)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f204974g.length;
                    for (int i3 = this.f204975h + 1; i3 < length3; i3++) {
                        if (Objects.equals(this.f204974g[i3].f196884a, asciiLowercase)) {
                            if (Objects.equals(this.f204974g[i3].f196885b, byteString)) {
                                length2 = (i3 - this.f204975h) + zll.f204958a.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f204975h) + zll.f204958a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m220291h(length2, 127, 128);
                } else if (length == -1) {
                    this.f204968a.writeByte(64);
                    m220289f(asciiLowercase);
                    m220289f(byteString);
                    m220287d(xzkVar);
                } else if (!asciiLowercase.startsWith(xzk.f196878d) || xzk.f196883i.equals(asciiLowercase)) {
                    m220291h(length, 63, 64);
                    m220289f(byteString);
                    m220287d(xzkVar);
                } else {
                    m220291h(length, 15, 0);
                    m220289f(byteString);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m220291h(int i, int i2, int i3) {
            Buffer buffer = this.f204968a;
            if (i < i2) {
                buffer.writeByte(i3 | i);
                return;
            }
            buffer.writeByte(i3 | i2);
            int i4 = i - i2;
            while (true) {
                Buffer buffer2 = this.f204968a;
                if (i4 < 128) {
                    buffer2.writeByte(i4);
                    return;
                } else {
                    buffer2.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
            }
        }

        public C21836b(Buffer buffer) {
            this(4096, true, buffer);
        }
    }

    /* JADX INFO: renamed from: l.zll$a */
    public static final class C21835a {

        /* JADX INFO: renamed from: a */
        public final List<xzk> f204960a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f204961b;

        /* JADX INFO: renamed from: c */
        public final int f204962c;

        /* JADX INFO: renamed from: d */
        public int f204963d;

        /* JADX INFO: renamed from: e */
        public xzk[] f204964e;

        /* JADX INFO: renamed from: f */
        public int f204965f;

        /* JADX INFO: renamed from: g */
        public int f204966g;

        /* JADX INFO: renamed from: h */
        public int f204967h;

        public C21835a(int i, int i2, Source source) {
            this.f204960a = new ArrayList();
            xzk[] xzkVarArr = new xzk[8];
            this.f204964e = xzkVarArr;
            this.f204965f = xzkVarArr.length - 1;
            this.f204966g = 0;
            this.f204967h = 0;
            this.f204962c = i;
            this.f204963d = i2;
            this.f204961b = Okio.buffer(source);
        }

        /* JADX INFO: renamed from: a */
        public final void m220267a() {
            int i = this.f204963d;
            int i2 = this.f204967h;
            if (i < i2) {
                if (i == 0) {
                    m220268b();
                } else {
                    m220270d(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m220268b() {
            Arrays.fill(this.f204964e, (Object) null);
            this.f204965f = this.f204964e.length - 1;
            this.f204966g = 0;
            this.f204967h = 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m220269c(int i) {
            return this.f204965f + 1 + i;
        }

        /* JADX INFO: renamed from: d */
        public final int m220270d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f204964e.length;
                while (true) {
                    length--;
                    i2 = this.f204965f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f204964e[length].f196886c;
                    i -= i4;
                    this.f204967h -= i4;
                    this.f204966g--;
                    i3++;
                }
                xzk[] xzkVarArr = this.f204964e;
                System.arraycopy(xzkVarArr, i2 + 1, xzkVarArr, i2 + 1 + i3, this.f204966g);
                this.f204965f += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: e */
        public List<xzk> m220271e() {
            ArrayList arrayList = new ArrayList(this.f204960a);
            this.f204960a.clear();
            return arrayList;
        }

        /* JADX INFO: renamed from: f */
        public final ByteString m220272f(int i) throws IOException {
            if (m220274h(i)) {
                return zll.f204958a[i].f196884a;
            }
            int iM220269c = m220269c(i - zll.f204958a.length);
            if (iM220269c >= 0) {
                xzk[] xzkVarArr = this.f204964e;
                if (iM220269c < xzkVarArr.length) {
                    return xzkVarArr[iM220269c].f196884a;
                }
            }
            yll.m216601a("Header index too large ", i + 1);
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final void m220273g(int i, xzk xzkVar) {
            this.f204960a.add(xzkVar);
            int i2 = xzkVar.f196886c;
            if (i != -1) {
                i2 -= this.f204964e[m220269c(i)].f196886c;
            }
            int i3 = this.f204963d;
            if (i2 > i3) {
                m220268b();
                return;
            }
            int iM220270d = m220270d((this.f204967h + i2) - i3);
            if (i == -1) {
                int i4 = this.f204966g + 1;
                xzk[] xzkVarArr = this.f204964e;
                if (i4 > xzkVarArr.length) {
                    xzk[] xzkVarArr2 = new xzk[xzkVarArr.length * 2];
                    System.arraycopy(xzkVarArr, 0, xzkVarArr2, xzkVarArr.length, xzkVarArr.length);
                    this.f204965f = this.f204964e.length - 1;
                    this.f204964e = xzkVarArr2;
                }
                int i5 = this.f204965f;
                this.f204965f = i5 - 1;
                this.f204964e[i5] = xzkVar;
                this.f204966g++;
            } else {
                this.f204964e[i + m220269c(i) + iM220270d] = xzkVar;
            }
            this.f204967h += i2;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m220274h(int i) {
            return i >= 0 && i <= zll.f204958a.length - 1;
        }

        /* JADX INFO: renamed from: i */
        public final int m220275i() throws IOException {
            return this.f204961b.readByte() & 255;
        }

        /* JADX INFO: renamed from: j */
        public ByteString m220276j() throws IOException {
            int iM220275i = m220275i();
            boolean z = (iM220275i & 128) == 128;
            int iM220279m = m220279m(iM220275i, 127);
            return z ? ByteString.m222317of(hol.m136443f().m136446c(this.f204961b.readByteArray(iM220279m))) : this.f204961b.readByteString(iM220279m);
        }

        /* JADX INFO: renamed from: k */
        public void m220277k() throws IOException {
            while (!this.f204961b.exhausted()) {
                byte b = this.f204961b.readByte();
                int i = b & 255;
                if (i == 128) {
                    zpg0.m220844a("index == 0");
                    return;
                }
                if ((b & 128) == 128) {
                    m220278l(m220279m(i, 127) - 1);
                } else if (i == 64) {
                    m220281o();
                } else if ((b & 64) == 64) {
                    m220280n(m220279m(i, 63) - 1);
                } else if ((b & HttpTokens.SPACE) == 32) {
                    int iM220279m = m220279m(i, 31);
                    this.f204963d = iM220279m;
                    if (iM220279m < 0 || iM220279m > this.f204962c) {
                        yll.m216601a("Invalid dynamic table size update ", this.f204963d);
                        return;
                    }
                    m220267a();
                } else if (i == 16 || i == 0) {
                    m220283q();
                } else {
                    m220282p(m220279m(i, 15) - 1);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m220278l(int i) throws IOException {
            if (m220274h(i)) {
                this.f204960a.add(zll.f204958a[i]);
                return;
            }
            int iM220269c = m220269c(i - zll.f204958a.length);
            if (iM220269c >= 0) {
                xzk[] xzkVarArr = this.f204964e;
                if (iM220269c < xzkVarArr.length) {
                    this.f204960a.add(xzkVarArr[iM220269c]);
                    return;
                }
            }
            yll.m216601a("Header index too large ", i + 1);
        }

        /* JADX INFO: renamed from: m */
        public int m220279m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM220275i = m220275i();
                if ((iM220275i & 128) == 0) {
                    return i2 + (iM220275i << i4);
                }
                i2 += (iM220275i & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m220280n(int i) throws IOException {
            m220273g(-1, new xzk(m220272f(i), m220276j()));
        }

        /* JADX INFO: renamed from: o */
        public final void m220281o() throws IOException {
            m220273g(-1, new xzk(zll.m220265a(m220276j()), m220276j()));
        }

        /* JADX INFO: renamed from: p */
        public final void m220282p(int i) throws IOException {
            this.f204960a.add(new xzk(m220272f(i), m220276j()));
        }

        /* JADX INFO: renamed from: q */
        public final void m220283q() throws IOException {
            this.f204960a.add(new xzk(zll.m220265a(m220276j()), m220276j()));
        }

        public C21835a(int i, Source source) {
            this(i, i, source);
        }
    }
}
