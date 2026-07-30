package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.rr10;
import p153l.yll;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.d */
/* JADX INFO: loaded from: classes12.dex */
public final class C13894d {

    /* JADX INFO: renamed from: a */
    public static final C13893c[] f57478a;

    /* JADX INFO: renamed from: b */
    public static final Map<ByteString, Integer> f57479b;

    static {
        C13893c c13893c = new C13893c(C13893c.f57474i, ByteString.encodeUtf8(""));
        ByteString byteString = C13893c.f57471f;
        C13893c c13893c2 = new C13893c(byteString, ByteString.encodeUtf8("GET"));
        C13893c c13893c3 = new C13893c(byteString, ByteString.encodeUtf8("POST"));
        ByteString byteString2 = C13893c.f57472g;
        C13893c c13893c4 = new C13893c(byteString2, ByteString.encodeUtf8("/"));
        C13893c c13893c5 = new C13893c(byteString2, ByteString.encodeUtf8("/index.html"));
        ByteString byteString3 = C13893c.f57473h;
        C13893c c13893c6 = new C13893c(byteString3, ByteString.encodeUtf8("http"));
        C13893c c13893c7 = new C13893c(byteString3, ByteString.encodeUtf8("https"));
        ByteString byteString4 = C13893c.f57470e;
        C13893c[] c13893cArr = {c13893c, c13893c2, c13893c3, c13893c4, c13893c5, c13893c6, c13893c7, new C13893c(byteString4, ByteString.encodeUtf8("200")), new C13893c(byteString4, ByteString.encodeUtf8("204")), new C13893c(byteString4, ByteString.encodeUtf8("206")), new C13893c(byteString4, ByteString.encodeUtf8("304")), new C13893c(byteString4, ByteString.encodeUtf8("400")), new C13893c(byteString4, ByteString.encodeUtf8("404")), new C13893c(byteString4, ByteString.encodeUtf8("500")), new C13893c("accept-charset", ""), new C13893c("accept-encoding", "gzip, deflate"), new C13893c("accept-language", ""), new C13893c("accept-ranges", ""), new C13893c("accept", ""), new C13893c("access-control-allow-origin", ""), new C13893c(SeeTextDynamicParam.age, ""), new C13893c(MomentAllowForwardState.allow, ""), new C13893c("authorization", ""), new C13893c("cache-control", ""), new C13893c("content-disposition", ""), new C13893c("content-encoding", ""), new C13893c("content-language", ""), new C13893c("content-length", ""), new C13893c("content-location", ""), new C13893c("content-range", ""), new C13893c("content-type", ""), new C13893c("cookie", ""), new C13893c("date", ""), new C13893c("etag", ""), new C13893c("expect", ""), new C13893c("expires", ""), new C13893c("from", ""), new C13893c("host", ""), new C13893c("if-match", ""), new C13893c("if-modified-since", ""), new C13893c("if-none-match", ""), new C13893c("if-range", ""), new C13893c("if-unmodified-since", ""), new C13893c("last-modified", ""), new C13893c(Link.TYPE, ""), new C13893c("location", ""), new C13893c("max-forwards", ""), new C13893c("proxy-authenticate", ""), new C13893c("proxy-authorization", ""), new C13893c("range", ""), new C13893c(RequestParameters.SUBRESOURCE_REFERER, ""), new C13893c(BLiveOperationActionAfterCountdown.refresh, ""), new C13893c("retry-after", ""), new C13893c("server", ""), new C13893c("set-cookie", ""), new C13893c("strict-transport-security", ""), new C13893c("transfer-encoding", ""), new C13893c("user-agent", ""), new C13893c("vary", ""), new C13893c("via", ""), new C13893c("www-authenticate", "")};
        f57478a = c13893cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c13893cArr.length);
        int i = 0;
        while (true) {
            C13893c[] c13893cArr2 = f57478a;
            if (i >= c13893cArr2.length) {
                f57479b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(c13893cArr2[i].f57475a)) {
                    linkedHashMap.put(c13893cArr2[i].f57475a, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m82900a(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b2 = byteString.getByte(i);
            if (b2 >= 65 && b2 <= 90) {
                rr10.m182681a("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.utf8());
                return null;
            }
        }
        return byteString;
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C13939e f57488a;

        /* JADX INFO: renamed from: b */
        public final boolean f57489b;

        /* JADX INFO: renamed from: c */
        public int f57490c;

        /* JADX INFO: renamed from: d */
        public boolean f57491d;

        /* JADX INFO: renamed from: e */
        public int f57492e;

        /* JADX INFO: renamed from: f */
        public C13893c[] f57493f;

        /* JADX INFO: renamed from: g */
        public int f57494g;

        /* JADX INFO: renamed from: h */
        public int f57495h;

        /* JADX INFO: renamed from: i */
        public int f57496i;

        public b(int i, boolean z, C13939e c13939e) {
            this.f57490c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f57493f = new C13893c[8];
            this.f57494g = 7;
            this.f57495h = 0;
            this.f57496i = 0;
            this.f57492e = i;
            this.f57489b = z;
            this.f57488a = c13939e;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX INFO: renamed from: a */
        public void m82913a(List<C13893c> list) {
            int length;
            int length2;
            if (this.f57491d) {
                int i = this.f57490c;
                if (i < this.f57492e) {
                    m82910a(i, 31, 32);
                }
                this.f57491d = false;
                this.f57490c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m82910a(this.f57492e, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13893c c13893c = list.get(i2);
                ByteString asciiLowercase = c13893c.f57475a.toAsciiLowercase();
                ByteString byteString = c13893c.f57476b;
                Integer num = C13894d.f57479b.get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C13893c[] c13893cArr = C13894d.f57478a;
                        if (Objects.equals(c13893cArr[iIntValue].f57476b, byteString)) {
                            length = length2;
                        } else if (Objects.equals(c13893cArr[length2].f57476b, byteString)) {
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
                    int length3 = this.f57493f.length;
                    for (int i3 = this.f57494g + 1; i3 < length3; i3++) {
                        if (Objects.equals(this.f57493f[i3].f57475a, asciiLowercase)) {
                            if (Objects.equals(this.f57493f[i3].f57476b, byteString)) {
                                length2 = (i3 - this.f57494g) + C13894d.f57478a.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f57494g) + C13894d.f57478a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m82910a(length2, 127, 128);
                } else if (length == -1) {
                    this.f57488a.mo83106c(64);
                    m82912a(asciiLowercase);
                    m82912a(byteString);
                    m82911a(c13893c);
                } else if (!asciiLowercase.startsWith(C13893c.f57469d) || C13893c.f57474i.equals(asciiLowercase)) {
                    m82910a(length, 63, 64);
                    m82912a(byteString);
                    m82911a(c13893c);
                } else {
                    m82910a(length, 15, 0);
                    m82912a(byteString);
                }
            }
        }

        public b(C13939e c13939e) {
            this(4096, true, c13939e);
        }

        /* JADX INFO: renamed from: a */
        public final int m82908a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f57493f.length;
                while (true) {
                    length--;
                    i2 = this.f57494g;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f57493f[length].f57477c;
                    i -= i4;
                    this.f57496i -= i4;
                    this.f57495h--;
                    i3++;
                }
                C13893c[] c13893cArr = this.f57493f;
                int i5 = i2 + 1;
                System.arraycopy(c13893cArr, i5, c13893cArr, i5 + i3, this.f57495h);
                C13893c[] c13893cArr2 = this.f57493f;
                int i6 = this.f57494g + 1;
                Arrays.fill(c13893cArr2, i6, i6 + i3, (Object) null);
                this.f57494g += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: a */
        public final void m82911a(C13893c c13893c) {
            int i = c13893c.f57477c;
            int i2 = this.f57492e;
            if (i > i2) {
                m82909a();
                return;
            }
            m82908a((this.f57496i + i) - i2);
            int i3 = this.f57495h + 1;
            C13893c[] c13893cArr = this.f57493f;
            if (i3 > c13893cArr.length) {
                C13893c[] c13893cArr2 = new C13893c[c13893cArr.length * 2];
                System.arraycopy(c13893cArr, 0, c13893cArr2, c13893cArr.length, c13893cArr.length);
                this.f57494g = this.f57493f.length - 1;
                this.f57493f = c13893cArr2;
            }
            int i4 = this.f57494g;
            this.f57494g = i4 - 1;
            this.f57493f[i4] = c13893c;
            this.f57495h++;
            this.f57496i += i;
        }

        /* JADX INFO: renamed from: a */
        public final void m82909a() {
            Arrays.fill(this.f57493f, (Object) null);
            this.f57494g = this.f57493f.length - 1;
            this.f57495h = 0;
            this.f57496i = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m82910a(int i, int i2, int i3) {
            C13939e c13939e = this.f57488a;
            if (i < i2) {
                c13939e.mo83106c(i3 | i);
                return;
            }
            c13939e.mo83106c(i3 | i2);
            int i4 = i - i2;
            while (true) {
                C13939e c13939e2 = this.f57488a;
                if (i4 >= 128) {
                    c13939e2.mo83106c(128 | (i4 & 127));
                    i4 >>>= 7;
                } else {
                    c13939e2.mo83106c(i4);
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m82912a(ByteString byteString) {
            if (this.f57489b) {
                C13909s.f57626d.getClass();
                long j = 0;
                for (int i = 0; i < byteString.size(); i++) {
                    j += (long) C13909s.f57625c[byteString.getByte(i) & 255];
                }
                if (((int) ((j + 7) >> 3)) < byteString.size()) {
                    C13939e c13939e = new C13939e();
                    C13909s.f57626d.getClass();
                    long j2 = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < byteString.size(); i3++) {
                        int i4 = byteString.getByte(i3) & 255;
                        int i5 = C13909s.f57624b[i4];
                        byte b = C13909s.f57625c[i4];
                        j2 = (j2 << b) | ((long) i5);
                        i2 += b;
                        while (i2 >= 8) {
                            i2 -= 8;
                            c13939e.mo83106c((int) (j2 >> i2));
                        }
                    }
                    if (i2 > 0) {
                        c13939e.mo83106c((int) (((long) (255 >>> i2)) | (j2 << (8 - i2))));
                    }
                    ByteString byteStringM83129m = c13939e.m83129m();
                    m82910a(byteStringM83129m.size(), 127, 128);
                    this.f57488a.m83098b(byteStringM83129m);
                    return;
                }
            }
            m82910a(byteString.size(), 127, 0);
            this.f57488a.m83098b(byteString);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C13893c> f57480a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC13941g f57481b;

        /* JADX INFO: renamed from: c */
        public final int f57482c;

        /* JADX INFO: renamed from: d */
        public int f57483d;

        /* JADX INFO: renamed from: e */
        public C13893c[] f57484e;

        /* JADX INFO: renamed from: f */
        public int f57485f;

        /* JADX INFO: renamed from: g */
        public int f57486g;

        /* JADX INFO: renamed from: h */
        public int f57487h;

        public a(int i, int i2, InterfaceC13957w interfaceC13957w) {
            this.f57480a = new ArrayList();
            this.f57484e = new C13893c[8];
            this.f57485f = 7;
            this.f57486g = 0;
            this.f57487h = 0;
            this.f57482c = i;
            this.f57483d = i2;
            this.f57481b = C13948n.m83144a(interfaceC13957w);
        }

        /* JADX INFO: renamed from: a */
        public final void m82904a(int i, C13893c c13893c) {
            this.f57480a.add(c13893c);
            int i2 = c13893c.f57477c;
            if (i != -1) {
                i2 -= this.f57484e[(this.f57485f + 1) + i].f57477c;
            }
            int i3 = this.f57483d;
            if (i2 > i3) {
                m82903a();
                return;
            }
            int iM82905b = m82905b((this.f57487h + i2) - i3);
            if (i == -1) {
                int i4 = this.f57486g + 1;
                C13893c[] c13893cArr = this.f57484e;
                if (i4 > c13893cArr.length) {
                    C13893c[] c13893cArr2 = new C13893c[c13893cArr.length * 2];
                    System.arraycopy(c13893cArr, 0, c13893cArr2, c13893cArr.length, c13893cArr.length);
                    this.f57485f = this.f57484e.length - 1;
                    this.f57484e = c13893cArr2;
                }
                int i5 = this.f57485f;
                this.f57485f = i5 - 1;
                this.f57484e[i5] = c13893c;
                this.f57486g++;
            } else {
                this.f57484e[i + this.f57485f + 1 + i + iM82905b] = c13893c;
            }
            this.f57487h += i2;
        }

        /* JADX INFO: renamed from: b */
        public ByteString m82906b() {
            byte b = this.f57481b.readByte();
            int i = b & 255;
            boolean z = (b & 128) == 128;
            int iM82902a = m82902a(i, 127);
            if (!z) {
                return this.f57481b.mo83085a(iM82902a);
            }
            C13909s c13909s = C13909s.f57626d;
            byte[] bArrMo83119g = this.f57481b.mo83119g(iM82902a);
            c13909s.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C13909s.a aVar = c13909s.f57627a;
            int i2 = 0;
            int i3 = 0;
            for (byte b2 : bArrMo83119g) {
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    aVar = aVar.f57628a[(i2 >>> (i3 - 8)) & 255];
                    if (aVar.f57628a == null) {
                        byteArrayOutputStream.write(aVar.f57629b);
                        i3 -= aVar.f57630c;
                        aVar = c13909s.f57627a;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                C13909s.a aVar2 = aVar.f57628a[(i2 << (8 - i3)) & 255];
                if (aVar2.f57628a != null || aVar2.f57630c > i3) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f57629b);
                i3 -= aVar2.f57630c;
                aVar = c13909s.f57627a;
            }
            return ByteString.m83068of(byteArrayOutputStream.toByteArray());
        }

        /* JADX INFO: renamed from: c */
        public final ByteString m82907c(int i) throws IOException {
            if (i >= 0) {
                C13893c[] c13893cArr = C13894d.f57478a;
                if (i <= c13893cArr.length - 1) {
                    return c13893cArr[i].f57475a;
                }
            }
            int iM82901a = m82901a(i - C13894d.f57478a.length);
            if (iM82901a >= 0) {
                C13893c[] c13893cArr2 = this.f57484e;
                if (iM82901a < c13893cArr2.length) {
                    return c13893cArr2[iM82901a].f57475a;
                }
            }
            yll.m216601a("Header index too large ", i + 1);
            return null;
        }

        public a(int i, InterfaceC13957w interfaceC13957w) {
            this(i, i, interfaceC13957w);
        }

        /* JADX INFO: renamed from: a */
        public final int m82901a(int i) {
            return this.f57485f + 1 + i;
        }

        /* JADX INFO: renamed from: a */
        public final void m82903a() {
            Arrays.fill(this.f57484e, (Object) null);
            this.f57485f = this.f57484e.length - 1;
            this.f57486g = 0;
            this.f57487h = 0;
        }

        /* JADX INFO: renamed from: a */
        public int m82902a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f57481b.readByte();
                int i5 = b & 255;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m82905b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f57484e.length;
                while (true) {
                    length--;
                    i2 = this.f57485f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f57484e[length].f57477c;
                    i -= i4;
                    this.f57487h -= i4;
                    this.f57486g--;
                    i3++;
                }
                C13893c[] c13893cArr = this.f57484e;
                int i5 = i2 + 1;
                System.arraycopy(c13893cArr, i5, c13893cArr, i5 + i3, this.f57486g);
                this.f57485f += i3;
            }
            return i3;
        }
    }
}
