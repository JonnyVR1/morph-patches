package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.api.Api;
import com.immomo.mmhttp.model.HttpHeaders;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.hj10;
import p149l.hjl;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.d */
/* JADX INFO: loaded from: classes13.dex */
public final class C13731d {

    /* JADX INFO: renamed from: a */
    public static final C13730c[] f56630a;

    /* JADX INFO: renamed from: b */
    public static final Map<ByteString, Integer> f56631b;

    static {
        C13730c c13730c = new C13730c(C13730c.f56626i, ByteString.encodeUtf8(""));
        ByteString byteString = C13730c.f56623f;
        C13730c c13730c2 = new C13730c(byteString, ByteString.encodeUtf8("GET"));
        C13730c c13730c3 = new C13730c(byteString, ByteString.encodeUtf8("POST"));
        ByteString byteString2 = C13730c.f56624g;
        C13730c c13730c4 = new C13730c(byteString2, ByteString.encodeUtf8("/"));
        C13730c c13730c5 = new C13730c(byteString2, ByteString.encodeUtf8("/index.html"));
        ByteString byteString3 = C13730c.f56625h;
        C13730c c13730c6 = new C13730c(byteString3, ByteString.encodeUtf8("http"));
        C13730c c13730c7 = new C13730c(byteString3, ByteString.encodeUtf8("https"));
        ByteString byteString4 = C13730c.f56622e;
        C13730c[] c13730cArr = {c13730c, c13730c2, c13730c3, c13730c4, c13730c5, c13730c6, c13730c7, new C13730c(byteString4, ByteString.encodeUtf8("200")), new C13730c(byteString4, ByteString.encodeUtf8("204")), new C13730c(byteString4, ByteString.encodeUtf8("206")), new C13730c(byteString4, ByteString.encodeUtf8("304")), new C13730c(byteString4, ByteString.encodeUtf8("400")), new C13730c(byteString4, ByteString.encodeUtf8("404")), new C13730c(byteString4, ByteString.encodeUtf8("500")), new C13730c("accept-charset", ""), new C13730c("accept-encoding", HttpHeaders.HEAD_VALUE_ACCEPT_ENCODING), new C13730c("accept-language", ""), new C13730c("accept-ranges", ""), new C13730c("accept", ""), new C13730c("access-control-allow-origin", ""), new C13730c(SeeTextDynamicParam.age, ""), new C13730c(MomentAllowForwardState.allow, ""), new C13730c("authorization", ""), new C13730c("cache-control", ""), new C13730c("content-disposition", ""), new C13730c("content-encoding", ""), new C13730c("content-language", ""), new C13730c("content-length", ""), new C13730c("content-location", ""), new C13730c("content-range", ""), new C13730c("content-type", ""), new C13730c("cookie", ""), new C13730c("date", ""), new C13730c("etag", ""), new C13730c("expect", ""), new C13730c("expires", ""), new C13730c("from", ""), new C13730c("host", ""), new C13730c("if-match", ""), new C13730c("if-modified-since", ""), new C13730c("if-none-match", ""), new C13730c("if-range", ""), new C13730c("if-unmodified-since", ""), new C13730c("last-modified", ""), new C13730c(Link.TYPE, ""), new C13730c("location", ""), new C13730c("max-forwards", ""), new C13730c("proxy-authenticate", ""), new C13730c("proxy-authorization", ""), new C13730c("range", ""), new C13730c(RequestParameters.SUBRESOURCE_REFERER, ""), new C13730c(BLiveOperationActionAfterCountdown.refresh, ""), new C13730c("retry-after", ""), new C13730c("server", ""), new C13730c("set-cookie", ""), new C13730c("strict-transport-security", ""), new C13730c("transfer-encoding", ""), new C13730c("user-agent", ""), new C13730c("vary", ""), new C13730c("via", ""), new C13730c("www-authenticate", "")};
        f56630a = c13730cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c13730cArr.length);
        int i = 0;
        while (true) {
            C13730c[] c13730cArr2 = f56630a;
            if (i >= c13730cArr2.length) {
                f56631b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(c13730cArr2[i].f56627a)) {
                    linkedHashMap.put(c13730cArr2[i].f56627a, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m81717a(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b2 = byteString.getByte(i);
            if (b2 >= 65 && b2 <= 90) {
                hj10.m131352a("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.utf8());
                return null;
            }
        }
        return byteString;
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C13776e f56640a;

        /* JADX INFO: renamed from: b */
        public final boolean f56641b;

        /* JADX INFO: renamed from: c */
        public int f56642c;

        /* JADX INFO: renamed from: d */
        public boolean f56643d;

        /* JADX INFO: renamed from: e */
        public int f56644e;

        /* JADX INFO: renamed from: f */
        public C13730c[] f56645f;

        /* JADX INFO: renamed from: g */
        public int f56646g;

        /* JADX INFO: renamed from: h */
        public int f56647h;

        /* JADX INFO: renamed from: i */
        public int f56648i;

        public b(int i, boolean z, C13776e c13776e) {
            this.f56642c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f56645f = new C13730c[8];
            this.f56646g = 7;
            this.f56647h = 0;
            this.f56648i = 0;
            this.f56644e = i;
            this.f56641b = z;
            this.f56640a = c13776e;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX INFO: renamed from: a */
        public void m81730a(List<C13730c> list) {
            int length;
            int length2;
            if (this.f56643d) {
                int i = this.f56642c;
                if (i < this.f56644e) {
                    m81727a(i, 31, 32);
                }
                this.f56643d = false;
                this.f56642c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m81727a(this.f56644e, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13730c c13730c = list.get(i2);
                ByteString asciiLowercase = c13730c.f56627a.toAsciiLowercase();
                ByteString byteString = c13730c.f56628b;
                Integer num = C13731d.f56631b.get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C13730c[] c13730cArr = C13731d.f56630a;
                        if (Objects.equals(c13730cArr[iIntValue].f56628b, byteString)) {
                            length = length2;
                        } else if (Objects.equals(c13730cArr[length2].f56628b, byteString)) {
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
                    int length3 = this.f56645f.length;
                    for (int i3 = this.f56646g + 1; i3 < length3; i3++) {
                        if (Objects.equals(this.f56645f[i3].f56627a, asciiLowercase)) {
                            if (Objects.equals(this.f56645f[i3].f56628b, byteString)) {
                                length2 = (i3 - this.f56646g) + C13731d.f56630a.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f56646g) + C13731d.f56630a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m81727a(length2, 127, 128);
                } else if (length == -1) {
                    this.f56640a.mo81923c(64);
                    m81729a(asciiLowercase);
                    m81729a(byteString);
                    m81728a(c13730c);
                } else if (!asciiLowercase.startsWith(C13730c.f56621d) || C13730c.f56626i.equals(asciiLowercase)) {
                    m81727a(length, 63, 64);
                    m81729a(byteString);
                    m81728a(c13730c);
                } else {
                    m81727a(length, 15, 0);
                    m81729a(byteString);
                }
            }
        }

        public b(C13776e c13776e) {
            this(4096, true, c13776e);
        }

        /* JADX INFO: renamed from: a */
        public final int m81725a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f56645f.length;
                while (true) {
                    length--;
                    i2 = this.f56646g;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f56645f[length].f56629c;
                    i -= i4;
                    this.f56648i -= i4;
                    this.f56647h--;
                    i3++;
                }
                C13730c[] c13730cArr = this.f56645f;
                int i5 = i2 + 1;
                System.arraycopy(c13730cArr, i5, c13730cArr, i5 + i3, this.f56647h);
                C13730c[] c13730cArr2 = this.f56645f;
                int i6 = this.f56646g + 1;
                Arrays.fill(c13730cArr2, i6, i6 + i3, (Object) null);
                this.f56646g += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: a */
        public final void m81728a(C13730c c13730c) {
            int i = c13730c.f56629c;
            int i2 = this.f56644e;
            if (i > i2) {
                m81726a();
                return;
            }
            m81725a((this.f56648i + i) - i2);
            int i3 = this.f56647h + 1;
            C13730c[] c13730cArr = this.f56645f;
            if (i3 > c13730cArr.length) {
                C13730c[] c13730cArr2 = new C13730c[c13730cArr.length * 2];
                System.arraycopy(c13730cArr, 0, c13730cArr2, c13730cArr.length, c13730cArr.length);
                this.f56646g = this.f56645f.length - 1;
                this.f56645f = c13730cArr2;
            }
            int i4 = this.f56646g;
            this.f56646g = i4 - 1;
            this.f56645f[i4] = c13730c;
            this.f56647h++;
            this.f56648i += i;
        }

        /* JADX INFO: renamed from: a */
        public final void m81726a() {
            Arrays.fill(this.f56645f, (Object) null);
            this.f56646g = this.f56645f.length - 1;
            this.f56647h = 0;
            this.f56648i = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m81727a(int i, int i2, int i3) {
            C13776e c13776e = this.f56640a;
            if (i < i2) {
                c13776e.mo81923c(i3 | i);
                return;
            }
            c13776e.mo81923c(i3 | i2);
            int i4 = i - i2;
            while (true) {
                C13776e c13776e2 = this.f56640a;
                if (i4 >= 128) {
                    c13776e2.mo81923c(128 | (i4 & 127));
                    i4 >>>= 7;
                } else {
                    c13776e2.mo81923c(i4);
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m81729a(ByteString byteString) {
            if (this.f56641b) {
                C13746s.f56778d.getClass();
                long j = 0;
                for (int i = 0; i < byteString.size(); i++) {
                    j += (long) C13746s.f56777c[byteString.getByte(i) & 255];
                }
                if (((int) ((j + 7) >> 3)) < byteString.size()) {
                    C13776e c13776e = new C13776e();
                    C13746s.f56778d.getClass();
                    long j2 = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < byteString.size(); i3++) {
                        int i4 = byteString.getByte(i3) & 255;
                        int i5 = C13746s.f56776b[i4];
                        byte b = C13746s.f56777c[i4];
                        j2 = (j2 << b) | ((long) i5);
                        i2 += b;
                        while (i2 >= 8) {
                            i2 -= 8;
                            c13776e.mo81923c((int) (j2 >> i2));
                        }
                    }
                    if (i2 > 0) {
                        c13776e.mo81923c((int) (((long) (255 >>> i2)) | (j2 << (8 - i2))));
                    }
                    ByteString byteStringM81946m = c13776e.m81946m();
                    m81727a(byteStringM81946m.size(), 127, 128);
                    this.f56640a.m81915b(byteStringM81946m);
                    return;
                }
            }
            m81727a(byteString.size(), 127, 0);
            this.f56640a.m81915b(byteString);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C13730c> f56632a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC13778g f56633b;

        /* JADX INFO: renamed from: c */
        public final int f56634c;

        /* JADX INFO: renamed from: d */
        public int f56635d;

        /* JADX INFO: renamed from: e */
        public C13730c[] f56636e;

        /* JADX INFO: renamed from: f */
        public int f56637f;

        /* JADX INFO: renamed from: g */
        public int f56638g;

        /* JADX INFO: renamed from: h */
        public int f56639h;

        public a(int i, int i2, InterfaceC13794w interfaceC13794w) {
            this.f56632a = new ArrayList();
            this.f56636e = new C13730c[8];
            this.f56637f = 7;
            this.f56638g = 0;
            this.f56639h = 0;
            this.f56634c = i;
            this.f56635d = i2;
            this.f56633b = C13785n.m81961a(interfaceC13794w);
        }

        /* JADX INFO: renamed from: a */
        public final void m81721a(int i, C13730c c13730c) {
            this.f56632a.add(c13730c);
            int i2 = c13730c.f56629c;
            if (i != -1) {
                i2 -= this.f56636e[(this.f56637f + 1) + i].f56629c;
            }
            int i3 = this.f56635d;
            if (i2 > i3) {
                m81720a();
                return;
            }
            int iM81722b = m81722b((this.f56639h + i2) - i3);
            if (i == -1) {
                int i4 = this.f56638g + 1;
                C13730c[] c13730cArr = this.f56636e;
                if (i4 > c13730cArr.length) {
                    C13730c[] c13730cArr2 = new C13730c[c13730cArr.length * 2];
                    System.arraycopy(c13730cArr, 0, c13730cArr2, c13730cArr.length, c13730cArr.length);
                    this.f56637f = this.f56636e.length - 1;
                    this.f56636e = c13730cArr2;
                }
                int i5 = this.f56637f;
                this.f56637f = i5 - 1;
                this.f56636e[i5] = c13730c;
                this.f56638g++;
            } else {
                this.f56636e[i + this.f56637f + 1 + i + iM81722b] = c13730c;
            }
            this.f56639h += i2;
        }

        /* JADX INFO: renamed from: b */
        public ByteString m81723b() {
            byte b = this.f56633b.readByte();
            int i = b & 255;
            boolean z = (b & 128) == 128;
            int iM81719a = m81719a(i, 127);
            if (!z) {
                return this.f56633b.mo81902a(iM81719a);
            }
            C13746s c13746s = C13746s.f56778d;
            byte[] bArrMo81936g = this.f56633b.mo81936g(iM81719a);
            c13746s.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C13746s.a aVar = c13746s.f56779a;
            int i2 = 0;
            int i3 = 0;
            for (byte b2 : bArrMo81936g) {
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    aVar = aVar.f56780a[(i2 >>> (i3 - 8)) & 255];
                    if (aVar.f56780a == null) {
                        byteArrayOutputStream.write(aVar.f56781b);
                        i3 -= aVar.f56782c;
                        aVar = c13746s.f56779a;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                C13746s.a aVar2 = aVar.f56780a[(i2 << (8 - i3)) & 255];
                if (aVar2.f56780a != null || aVar2.f56782c > i3) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f56781b);
                i3 -= aVar2.f56782c;
                aVar = c13746s.f56779a;
            }
            return ByteString.m81885of(byteArrayOutputStream.toByteArray());
        }

        /* JADX INFO: renamed from: c */
        public final ByteString m81724c(int i) throws IOException {
            if (i >= 0) {
                C13730c[] c13730cArr = C13731d.f56630a;
                if (i <= c13730cArr.length - 1) {
                    return c13730cArr[i].f56627a;
                }
            }
            int iM81718a = m81718a(i - C13731d.f56630a.length);
            if (iM81718a >= 0) {
                C13730c[] c13730cArr2 = this.f56636e;
                if (iM81718a < c13730cArr2.length) {
                    return c13730cArr2[iM81718a].f56627a;
                }
            }
            hjl.m131386a("Header index too large ", i + 1);
            return null;
        }

        public a(int i, InterfaceC13794w interfaceC13794w) {
            this(i, i, interfaceC13794w);
        }

        /* JADX INFO: renamed from: a */
        public final int m81718a(int i) {
            return this.f56637f + 1 + i;
        }

        /* JADX INFO: renamed from: a */
        public final void m81720a() {
            Arrays.fill(this.f56636e, (Object) null);
            this.f56637f = this.f56636e.length - 1;
            this.f56638g = 0;
            this.f56639h = 0;
        }

        /* JADX INFO: renamed from: a */
        public int m81719a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f56633b.readByte();
                int i5 = b & 255;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m81722b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f56636e.length;
                while (true) {
                    length--;
                    i2 = this.f56637f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f56636e[length].f56629c;
                    i -= i4;
                    this.f56639h -= i4;
                    this.f56638g--;
                    i3++;
                }
                C13730c[] c13730cArr = this.f56636e;
                int i5 = i2 + 1;
                System.arraycopy(c13730cArr, i5, c13730cArr, i5 + i3, this.f56638g);
                this.f56637f += i3;
            }
            return i3;
        }
    }
}
