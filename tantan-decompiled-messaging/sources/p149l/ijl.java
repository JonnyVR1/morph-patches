package p149l;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.api.Api;
import com.immomo.mmhttp.model.HttpHeaders;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
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
public final class ijl {

    /* JADX INFO: renamed from: a */
    public static final hxk[] f113555a;

    /* JADX INFO: renamed from: b */
    public static final Map<ByteString, Integer> f113556b;

    static {
        hxk hxkVar = new hxk(hxk.f109880i, "");
        ByteString byteString = hxk.f109877f;
        hxk hxkVar2 = new hxk(byteString, "GET");
        hxk hxkVar3 = new hxk(byteString, "POST");
        ByteString byteString2 = hxk.f109878g;
        hxk hxkVar4 = new hxk(byteString2, "/");
        hxk hxkVar5 = new hxk(byteString2, "/index.html");
        ByteString byteString3 = hxk.f109879h;
        hxk hxkVar6 = new hxk(byteString3, "http");
        hxk hxkVar7 = new hxk(byteString3, "https");
        ByteString byteString4 = hxk.f109876e;
        f113555a = new hxk[]{hxkVar, hxkVar2, hxkVar3, hxkVar4, hxkVar5, hxkVar6, hxkVar7, new hxk(byteString4, "200"), new hxk(byteString4, "204"), new hxk(byteString4, "206"), new hxk(byteString4, "304"), new hxk(byteString4, "400"), new hxk(byteString4, "404"), new hxk(byteString4, "500"), new hxk("accept-charset", ""), new hxk("accept-encoding", HttpHeaders.HEAD_VALUE_ACCEPT_ENCODING), new hxk("accept-language", ""), new hxk("accept-ranges", ""), new hxk("accept", ""), new hxk("access-control-allow-origin", ""), new hxk(SeeTextDynamicParam.age, ""), new hxk(MomentAllowForwardState.allow, ""), new hxk("authorization", ""), new hxk("cache-control", ""), new hxk("content-disposition", ""), new hxk("content-encoding", ""), new hxk("content-language", ""), new hxk("content-length", ""), new hxk("content-location", ""), new hxk("content-range", ""), new hxk("content-type", ""), new hxk("cookie", ""), new hxk("date", ""), new hxk("etag", ""), new hxk("expect", ""), new hxk("expires", ""), new hxk("from", ""), new hxk("host", ""), new hxk("if-match", ""), new hxk("if-modified-since", ""), new hxk("if-none-match", ""), new hxk("if-range", ""), new hxk("if-unmodified-since", ""), new hxk("last-modified", ""), new hxk(Link.TYPE, ""), new hxk("location", ""), new hxk("max-forwards", ""), new hxk("proxy-authenticate", ""), new hxk("proxy-authorization", ""), new hxk("range", ""), new hxk(RequestParameters.SUBRESOURCE_REFERER, ""), new hxk(BLiveOperationActionAfterCountdown.refresh, ""), new hxk("retry-after", ""), new hxk("server", ""), new hxk("set-cookie", ""), new hxk("strict-transport-security", ""), new hxk("transfer-encoding", ""), new hxk("user-agent", ""), new hxk("vary", ""), new hxk("via", ""), new hxk("www-authenticate", "")};
        f113556b = m136627b();
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m136626a(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                hj10.m131352a("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.utf8());
                return null;
            }
        }
        return byteString;
    }

    /* JADX INFO: renamed from: b */
    public static Map<ByteString, Integer> m136627b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f113555a.length);
        int i = 0;
        while (true) {
            hxk[] hxkVarArr = f113555a;
            if (i >= hxkVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(hxkVarArr[i].f109881a)) {
                linkedHashMap.put(hxkVarArr[i].f109881a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l.ijl$b */
    public static final class C17566b {

        /* JADX INFO: renamed from: a */
        public final Buffer f113565a;

        /* JADX INFO: renamed from: b */
        public final boolean f113566b;

        /* JADX INFO: renamed from: c */
        public int f113567c;

        /* JADX INFO: renamed from: d */
        public boolean f113568d;

        /* JADX INFO: renamed from: e */
        public int f113569e;

        /* JADX INFO: renamed from: f */
        public int f113570f;

        /* JADX INFO: renamed from: g */
        public hxk[] f113571g;

        /* JADX INFO: renamed from: h */
        public int f113572h;

        /* JADX INFO: renamed from: i */
        public int f113573i;

        /* JADX INFO: renamed from: j */
        public int f113574j;

        public C17566b(int i, boolean z, Buffer buffer) {
            this.f113567c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            hxk[] hxkVarArr = new hxk[8];
            this.f113571g = hxkVarArr;
            this.f113572h = hxkVarArr.length - 1;
            this.f113573i = 0;
            this.f113574j = 0;
            this.f113569e = i;
            this.f113570f = i;
            this.f113566b = z;
            this.f113565a = buffer;
        }

        /* JADX INFO: renamed from: a */
        public final void m136645a() {
            int i = this.f113570f;
            int i2 = this.f113574j;
            if (i < i2) {
                if (i == 0) {
                    m136646b();
                } else {
                    m136647c(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m136646b() {
            Arrays.fill(this.f113571g, (Object) null);
            this.f113572h = this.f113571g.length - 1;
            this.f113573i = 0;
            this.f113574j = 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m136647c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f113571g.length;
                while (true) {
                    length--;
                    i2 = this.f113572h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f113571g[length].f109883c;
                    i -= i4;
                    this.f113574j -= i4;
                    this.f113573i--;
                    i3++;
                }
                hxk[] hxkVarArr = this.f113571g;
                System.arraycopy(hxkVarArr, i2 + 1, hxkVarArr, i2 + 1 + i3, this.f113573i);
                hxk[] hxkVarArr2 = this.f113571g;
                int i5 = this.f113572h;
                Arrays.fill(hxkVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f113572h += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: d */
        public final void m136648d(hxk hxkVar) {
            int i = hxkVar.f109883c;
            int i2 = this.f113570f;
            if (i > i2) {
                m136646b();
                return;
            }
            m136647c((this.f113574j + i) - i2);
            int i3 = this.f113573i + 1;
            hxk[] hxkVarArr = this.f113571g;
            if (i3 > hxkVarArr.length) {
                hxk[] hxkVarArr2 = new hxk[hxkVarArr.length * 2];
                System.arraycopy(hxkVarArr, 0, hxkVarArr2, hxkVarArr.length, hxkVarArr.length);
                this.f113572h = this.f113571g.length - 1;
                this.f113571g = hxkVarArr2;
            }
            int i4 = this.f113572h;
            this.f113572h = i4 - 1;
            this.f113571g[i4] = hxkVar;
            this.f113573i++;
            this.f113574j += i;
        }

        /* JADX INFO: renamed from: e */
        public void m136649e(int i) {
            this.f113569e = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f113570f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f113567c = Math.min(this.f113567c, iMin);
            }
            this.f113568d = true;
            this.f113570f = iMin;
            m136645a();
        }

        /* JADX INFO: renamed from: f */
        public void m136650f(ByteString byteString) throws IOException {
            if (!this.f113566b || vll.m198809f().m198814e(byteString) >= byteString.size()) {
                m136652h(byteString.size(), 127, 0);
                this.f113565a.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            vll.m198809f().m198813d(byteString, buffer);
            ByteString byteString2 = buffer.readByteString();
            m136652h(byteString2.size(), 127, 128);
            this.f113565a.write(byteString2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX INFO: renamed from: g */
        public void m136651g(List<hxk> list) throws IOException {
            int length;
            int length2;
            if (this.f113568d) {
                int i = this.f113567c;
                if (i < this.f113570f) {
                    m136652h(i, 31, 32);
                }
                this.f113568d = false;
                this.f113567c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m136652h(this.f113570f, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                hxk hxkVar = list.get(i2);
                ByteString asciiLowercase = hxkVar.f109881a.toAsciiLowercase();
                ByteString byteString = hxkVar.f109882b;
                Integer num = ijl.f113556b.get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        hxk[] hxkVarArr = ijl.f113555a;
                        if (Objects.equals(hxkVarArr[iIntValue].f109882b, byteString)) {
                            length = length2;
                        } else if (Objects.equals(hxkVarArr[length2].f109882b, byteString)) {
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
                    int length3 = this.f113571g.length;
                    for (int i3 = this.f113572h + 1; i3 < length3; i3++) {
                        if (Objects.equals(this.f113571g[i3].f109881a, asciiLowercase)) {
                            if (Objects.equals(this.f113571g[i3].f109882b, byteString)) {
                                length2 = (i3 - this.f113572h) + ijl.f113555a.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f113572h) + ijl.f113555a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m136652h(length2, 127, 128);
                } else if (length == -1) {
                    this.f113565a.writeByte(64);
                    m136650f(asciiLowercase);
                    m136650f(byteString);
                    m136648d(hxkVar);
                } else if (!asciiLowercase.startsWith(hxk.f109875d) || hxk.f109880i.equals(asciiLowercase)) {
                    m136652h(length, 63, 64);
                    m136650f(byteString);
                    m136648d(hxkVar);
                } else {
                    m136652h(length, 15, 0);
                    m136650f(byteString);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m136652h(int i, int i2, int i3) {
            Buffer buffer = this.f113565a;
            if (i < i2) {
                buffer.writeByte(i3 | i);
                return;
            }
            buffer.writeByte(i3 | i2);
            int i4 = i - i2;
            while (true) {
                Buffer buffer2 = this.f113565a;
                if (i4 < 128) {
                    buffer2.writeByte(i4);
                    return;
                } else {
                    buffer2.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
            }
        }

        public C17566b(Buffer buffer) {
            this(4096, true, buffer);
        }
    }

    /* JADX INFO: renamed from: l.ijl$a */
    public static final class C17565a {

        /* JADX INFO: renamed from: a */
        public final List<hxk> f113557a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f113558b;

        /* JADX INFO: renamed from: c */
        public final int f113559c;

        /* JADX INFO: renamed from: d */
        public int f113560d;

        /* JADX INFO: renamed from: e */
        public hxk[] f113561e;

        /* JADX INFO: renamed from: f */
        public int f113562f;

        /* JADX INFO: renamed from: g */
        public int f113563g;

        /* JADX INFO: renamed from: h */
        public int f113564h;

        public C17565a(int i, int i2, Source source) {
            this.f113557a = new ArrayList();
            hxk[] hxkVarArr = new hxk[8];
            this.f113561e = hxkVarArr;
            this.f113562f = hxkVarArr.length - 1;
            this.f113563g = 0;
            this.f113564h = 0;
            this.f113559c = i;
            this.f113560d = i2;
            this.f113558b = Okio.buffer(source);
        }

        /* JADX INFO: renamed from: a */
        public final void m136628a() {
            int i = this.f113560d;
            int i2 = this.f113564h;
            if (i < i2) {
                if (i == 0) {
                    m136629b();
                } else {
                    m136631d(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m136629b() {
            Arrays.fill(this.f113561e, (Object) null);
            this.f113562f = this.f113561e.length - 1;
            this.f113563g = 0;
            this.f113564h = 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m136630c(int i) {
            return this.f113562f + 1 + i;
        }

        /* JADX INFO: renamed from: d */
        public final int m136631d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f113561e.length;
                while (true) {
                    length--;
                    i2 = this.f113562f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f113561e[length].f109883c;
                    i -= i4;
                    this.f113564h -= i4;
                    this.f113563g--;
                    i3++;
                }
                hxk[] hxkVarArr = this.f113561e;
                System.arraycopy(hxkVarArr, i2 + 1, hxkVarArr, i2 + 1 + i3, this.f113563g);
                this.f113562f += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: e */
        public List<hxk> m136632e() {
            ArrayList arrayList = new ArrayList(this.f113557a);
            this.f113557a.clear();
            return arrayList;
        }

        /* JADX INFO: renamed from: f */
        public final ByteString m136633f(int i) throws IOException {
            if (m136635h(i)) {
                return ijl.f113555a[i].f109881a;
            }
            int iM136630c = m136630c(i - ijl.f113555a.length);
            if (iM136630c >= 0) {
                hxk[] hxkVarArr = this.f113561e;
                if (iM136630c < hxkVarArr.length) {
                    return hxkVarArr[iM136630c].f109881a;
                }
            }
            hjl.m131386a("Header index too large ", i + 1);
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final void m136634g(int i, hxk hxkVar) {
            this.f113557a.add(hxkVar);
            int i2 = hxkVar.f109883c;
            if (i != -1) {
                i2 -= this.f113561e[m136630c(i)].f109883c;
            }
            int i3 = this.f113560d;
            if (i2 > i3) {
                m136629b();
                return;
            }
            int iM136631d = m136631d((this.f113564h + i2) - i3);
            if (i == -1) {
                int i4 = this.f113563g + 1;
                hxk[] hxkVarArr = this.f113561e;
                if (i4 > hxkVarArr.length) {
                    hxk[] hxkVarArr2 = new hxk[hxkVarArr.length * 2];
                    System.arraycopy(hxkVarArr, 0, hxkVarArr2, hxkVarArr.length, hxkVarArr.length);
                    this.f113562f = this.f113561e.length - 1;
                    this.f113561e = hxkVarArr2;
                }
                int i5 = this.f113562f;
                this.f113562f = i5 - 1;
                this.f113561e[i5] = hxkVar;
                this.f113563g++;
            } else {
                this.f113561e[i + m136630c(i) + iM136631d] = hxkVar;
            }
            this.f113564h += i2;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m136635h(int i) {
            return i >= 0 && i <= ijl.f113555a.length - 1;
        }

        /* JADX INFO: renamed from: i */
        public final int m136636i() throws IOException {
            return this.f113558b.readByte() & 255;
        }

        /* JADX INFO: renamed from: j */
        public ByteString m136637j() throws IOException {
            int iM136636i = m136636i();
            boolean z = (iM136636i & 128) == 128;
            int iM136640m = m136640m(iM136636i, 127);
            return z ? ByteString.m221050of(vll.m198809f().m198812c(this.f113558b.readByteArray(iM136640m))) : this.f113558b.readByteString(iM136640m);
        }

        /* JADX INFO: renamed from: k */
        public void m136638k() throws IOException {
            while (!this.f113558b.exhausted()) {
                byte b = this.f113558b.readByte();
                int i = b & 255;
                if (i == 128) {
                    rhg0.m179353a("index == 0");
                    return;
                }
                if ((b & 128) == 128) {
                    m136639l(m136640m(i, 127) - 1);
                } else if (i == 64) {
                    m136642o();
                } else if ((b & 64) == 64) {
                    m136641n(m136640m(i, 63) - 1);
                } else if ((b & HttpTokens.SPACE) == 32) {
                    int iM136640m = m136640m(i, 31);
                    this.f113560d = iM136640m;
                    if (iM136640m < 0 || iM136640m > this.f113559c) {
                        hjl.m131386a("Invalid dynamic table size update ", this.f113560d);
                        return;
                    }
                    m136628a();
                } else if (i == 16 || i == 0) {
                    m136644q();
                } else {
                    m136643p(m136640m(i, 15) - 1);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m136639l(int i) throws IOException {
            if (m136635h(i)) {
                this.f113557a.add(ijl.f113555a[i]);
                return;
            }
            int iM136630c = m136630c(i - ijl.f113555a.length);
            if (iM136630c >= 0) {
                hxk[] hxkVarArr = this.f113561e;
                if (iM136630c < hxkVarArr.length) {
                    this.f113557a.add(hxkVarArr[iM136630c]);
                    return;
                }
            }
            hjl.m131386a("Header index too large ", i + 1);
        }

        /* JADX INFO: renamed from: m */
        public int m136640m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM136636i = m136636i();
                if ((iM136636i & 128) == 0) {
                    return i2 + (iM136636i << i4);
                }
                i2 += (iM136636i & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m136641n(int i) throws IOException {
            m136634g(-1, new hxk(m136633f(i), m136637j()));
        }

        /* JADX INFO: renamed from: o */
        public final void m136642o() throws IOException {
            m136634g(-1, new hxk(ijl.m136626a(m136637j()), m136637j()));
        }

        /* JADX INFO: renamed from: p */
        public final void m136643p(int i) throws IOException {
            this.f113557a.add(new hxk(m136633f(i), m136637j()));
        }

        /* JADX INFO: renamed from: q */
        public final void m136644q() throws IOException {
            this.f113557a.add(new hxk(ijl.m136626a(m136637j()), m136637j()));
        }

        public C17565a(int i, Source source) {
            this(i, i, source);
        }
    }
}
