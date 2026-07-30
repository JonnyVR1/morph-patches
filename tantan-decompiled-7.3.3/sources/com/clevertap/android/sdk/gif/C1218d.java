package com.clevertap.android.sdk.gif;

import com.clevertap.android.sdk.Logger;
import com.google.android.gms.common.api.Api;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p153l.wtq0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.gif.d */
/* JADX INFO: loaded from: classes.dex */
class C1218d {

    /* JADX INFO: renamed from: a */
    private final byte[] f5022a = new byte[256];

    /* JADX INFO: renamed from: b */
    private int f5023b = 0;

    /* JADX INFO: renamed from: c */
    private C1217c f5024c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f5025d;

    /* JADX INFO: renamed from: a */
    private boolean m6133a() {
        return this.f5024c.f5020l != 0;
    }

    /* JADX INFO: renamed from: c */
    private int m6134c() {
        try {
            return this.f5025d.get() & 255;
        } catch (Exception unused) {
            this.f5024c.f5020l = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6135d() {
        this.f5024c.f5011c.f5002e = m6144m();
        this.f5024c.f5011c.f5003f = m6144m();
        this.f5024c.f5011c.f5004g = m6144m();
        this.f5024c.f5011c.f5005h = m6144m();
        int iM6134c = m6134c();
        boolean z = (iM6134c & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM6134c & 7) + 1);
        C1216b c1216b = this.f5024c.f5011c;
        c1216b.f5001d = (iM6134c & 64) != 0;
        if (z) {
            c1216b.f5006i = m6137f(iPow);
        } else {
            c1216b.f5006i = null;
        }
        this.f5024c.f5011c.f4998a = this.f5025d.position();
        m6147r();
        if (m6133a()) {
            return;
        }
        C1217c c1217c = this.f5024c;
        c1217c.f5012d++;
        c1217c.f5013e.add(c1217c.f5011c);
    }

    /* JADX INFO: renamed from: e */
    private int m6136e() {
        int iM6134c = m6134c();
        this.f5023b = iM6134c;
        int i = 0;
        if (iM6134c > 0) {
            while (true) {
                try {
                    int i2 = this.f5023b;
                    if (i >= i2) {
                        break;
                    }
                    int i3 = i2 - i;
                    this.f5025d.get(this.f5022a, i, i3);
                    i += i3;
                } catch (Exception unused) {
                    this.f5024c.f5020l = 1;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    private int[] m6137f(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f5025d.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | RoundedDrawable.DEFAULT_BORDER_COLOR | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            Logger.m5921d("GifHeaderParser", "Format Error Reading Color Table", e);
            this.f5024c.f5020l = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6138g() {
        m6139h(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: h */
    private void m6139h(int i) {
        boolean z = false;
        while (!z && !m6133a() && this.f5024c.f5012d <= i) {
            int iM6134c = m6134c();
            if (iM6134c == 33) {
                int iM6134c2 = m6134c();
                if (iM6134c2 == 1) {
                    m6146q();
                } else if (iM6134c2 == 249) {
                    this.f5024c.f5011c = new C1216b();
                    m6140i();
                } else if (iM6134c2 == 254) {
                    m6146q();
                } else if (iM6134c2 != 255) {
                    m6146q();
                } else {
                    m6136e();
                    String str = "";
                    for (int i2 = 0; i2 < 11; i2++) {
                        str = str + ((char) this.f5022a[i2]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m6143l();
                    } else {
                        m6146q();
                    }
                }
            } else if (iM6134c == 44) {
                C1217c c1217c = this.f5024c;
                if (c1217c.f5011c == null) {
                    c1217c.f5011c = new C1216b();
                }
                m6135d();
            } else if (iM6134c != 59) {
                this.f5024c.f5020l = 1;
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m6140i() {
        m6134c();
        int iM6134c = m6134c();
        C1216b c1216b = this.f5024c.f5011c;
        int i = (iM6134c & 28) >> 2;
        c1216b.f5000c = i;
        if (i == 0) {
            c1216b.f5000c = 1;
        }
        c1216b.f5008k = (iM6134c & 1) != 0;
        int iM6144m = m6144m();
        if (iM6144m < 2) {
            iM6144m = 10;
        }
        C1216b c1216b2 = this.f5024c.f5011c;
        c1216b2.f4999b = iM6144m * 10;
        c1216b2.f5007j = m6134c();
        m6134c();
    }

    /* JADX INFO: renamed from: j */
    private void m6141j() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m6134c());
        }
        if (!str.startsWith("GIF")) {
            this.f5024c.f5020l = 1;
            return;
        }
        m6142k();
        if (!this.f5024c.f5015g || m6133a()) {
            return;
        }
        C1217c c1217c = this.f5024c;
        c1217c.f5014f = m6137f(c1217c.f5016h);
        C1217c c1217c2 = this.f5024c;
        c1217c2.f5009a = c1217c2.f5014f[c1217c2.f5010b];
    }

    /* JADX INFO: renamed from: k */
    private void m6142k() {
        this.f5024c.f5021m = m6144m();
        this.f5024c.f5017i = m6144m();
        int iM6134c = m6134c();
        C1217c c1217c = this.f5024c;
        c1217c.f5015g = (iM6134c & 128) != 0;
        c1217c.f5016h = 2 << (iM6134c & 7);
        c1217c.f5010b = m6134c();
        this.f5024c.f5019k = m6134c();
    }

    /* JADX INFO: renamed from: l */
    private void m6143l() {
        do {
            m6136e();
            byte[] bArr = this.f5022a;
            if (bArr[0] == 1) {
                int i = bArr[1] & 255;
                int i2 = bArr[2] & 255;
                C1217c c1217c = this.f5024c;
                int i3 = (i2 << 8) | i;
                c1217c.f5018j = i3;
                if (i3 == 0) {
                    c1217c.f5018j = -1;
                }
            }
            if (this.f5023b <= 0) {
                return;
            }
        } while (!m6133a());
    }

    /* JADX INFO: renamed from: m */
    private int m6144m() {
        return this.f5025d.getShort();
    }

    /* JADX INFO: renamed from: n */
    private void m6145n() {
        this.f5025d = null;
        Arrays.fill(this.f5022a, (byte) 0);
        this.f5024c = new C1217c();
        this.f5023b = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m6146q() {
        int iM6134c;
        do {
            try {
                iM6134c = m6134c();
                ByteBuffer byteBuffer = this.f5025d;
                byteBuffer.position(byteBuffer.position() + iM6134c);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (iM6134c > 0);
    }

    /* JADX INFO: renamed from: r */
    private void m6147r() {
        m6134c();
        m6146q();
    }

    /* JADX INFO: renamed from: b */
    public C1217c m6148b() {
        if (this.f5025d == null) {
            wtq0.m207906a("You must call setData() before parseHeader()");
            return null;
        }
        if (m6133a()) {
            return this.f5024c;
        }
        m6141j();
        if (!m6133a()) {
            m6138g();
            C1217c c1217c = this.f5024c;
            if (c1217c.f5012d < 0) {
                c1217c.f5020l = 1;
            }
        }
        return this.f5024c;
    }

    /* JADX INFO: renamed from: o */
    public C1218d m6149o(ByteBuffer byteBuffer) {
        m6145n();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f5025d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f5025d.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C1218d m6150p(byte[] bArr) {
        if (bArr != null) {
            m6149o(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f5025d = null;
        this.f5024c.f5020l = 2;
        return this;
    }
}
