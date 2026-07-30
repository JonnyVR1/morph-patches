package com.clevertap.android.sdk.gif;

import com.clevertap.android.sdk.Logger;
import com.google.android.gms.common.api.Api;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p149l.qkq0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.gif.d */
/* JADX INFO: loaded from: classes.dex */
class C1195d {

    /* JADX INFO: renamed from: a */
    private final byte[] f4985a = new byte[256];

    /* JADX INFO: renamed from: b */
    private int f4986b = 0;

    /* JADX INFO: renamed from: c */
    private C1194c f4987c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f4988d;

    /* JADX INFO: renamed from: a */
    private boolean m6079a() {
        return this.f4987c.f4983l != 0;
    }

    /* JADX INFO: renamed from: c */
    private int m6080c() {
        try {
            return this.f4988d.get() & 255;
        } catch (Exception unused) {
            this.f4987c.f4983l = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6081d() {
        this.f4987c.f4974c.f4965e = m6090m();
        this.f4987c.f4974c.f4966f = m6090m();
        this.f4987c.f4974c.f4967g = m6090m();
        this.f4987c.f4974c.f4968h = m6090m();
        int iM6080c = m6080c();
        boolean z = (iM6080c & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM6080c & 7) + 1);
        C1193b c1193b = this.f4987c.f4974c;
        c1193b.f4964d = (iM6080c & 64) != 0;
        if (z) {
            c1193b.f4969i = m6083f(iPow);
        } else {
            c1193b.f4969i = null;
        }
        this.f4987c.f4974c.f4961a = this.f4988d.position();
        m6093r();
        if (m6079a()) {
            return;
        }
        C1194c c1194c = this.f4987c;
        c1194c.f4975d++;
        c1194c.f4976e.add(c1194c.f4974c);
    }

    /* JADX INFO: renamed from: e */
    private int m6082e() {
        int iM6080c = m6080c();
        this.f4986b = iM6080c;
        int i = 0;
        if (iM6080c > 0) {
            while (true) {
                try {
                    int i2 = this.f4986b;
                    if (i >= i2) {
                        break;
                    }
                    int i3 = i2 - i;
                    this.f4988d.get(this.f4985a, i, i3);
                    i += i3;
                } catch (Exception unused) {
                    this.f4987c.f4983l = 1;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    private int[] m6083f(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f4988d.get(bArr);
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
            Logger.m5867d("GifHeaderParser", "Format Error Reading Color Table", e);
            this.f4987c.f4983l = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6084g() {
        m6085h(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: h */
    private void m6085h(int i) {
        boolean z = false;
        while (!z && !m6079a() && this.f4987c.f4975d <= i) {
            int iM6080c = m6080c();
            if (iM6080c == 33) {
                int iM6080c2 = m6080c();
                if (iM6080c2 == 1) {
                    m6092q();
                } else if (iM6080c2 == 249) {
                    this.f4987c.f4974c = new C1193b();
                    m6086i();
                } else if (iM6080c2 == 254) {
                    m6092q();
                } else if (iM6080c2 != 255) {
                    m6092q();
                } else {
                    m6082e();
                    String str = "";
                    for (int i2 = 0; i2 < 11; i2++) {
                        str = str + ((char) this.f4985a[i2]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m6089l();
                    } else {
                        m6092q();
                    }
                }
            } else if (iM6080c == 44) {
                C1194c c1194c = this.f4987c;
                if (c1194c.f4974c == null) {
                    c1194c.f4974c = new C1193b();
                }
                m6081d();
            } else if (iM6080c != 59) {
                this.f4987c.f4983l = 1;
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m6086i() {
        m6080c();
        int iM6080c = m6080c();
        C1193b c1193b = this.f4987c.f4974c;
        int i = (iM6080c & 28) >> 2;
        c1193b.f4963c = i;
        if (i == 0) {
            c1193b.f4963c = 1;
        }
        c1193b.f4971k = (iM6080c & 1) != 0;
        int iM6090m = m6090m();
        if (iM6090m < 2) {
            iM6090m = 10;
        }
        C1193b c1193b2 = this.f4987c.f4974c;
        c1193b2.f4962b = iM6090m * 10;
        c1193b2.f4970j = m6080c();
        m6080c();
    }

    /* JADX INFO: renamed from: j */
    private void m6087j() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m6080c());
        }
        if (!str.startsWith("GIF")) {
            this.f4987c.f4983l = 1;
            return;
        }
        m6088k();
        if (!this.f4987c.f4978g || m6079a()) {
            return;
        }
        C1194c c1194c = this.f4987c;
        c1194c.f4977f = m6083f(c1194c.f4979h);
        C1194c c1194c2 = this.f4987c;
        c1194c2.f4972a = c1194c2.f4977f[c1194c2.f4973b];
    }

    /* JADX INFO: renamed from: k */
    private void m6088k() {
        this.f4987c.f4984m = m6090m();
        this.f4987c.f4980i = m6090m();
        int iM6080c = m6080c();
        C1194c c1194c = this.f4987c;
        c1194c.f4978g = (iM6080c & 128) != 0;
        c1194c.f4979h = 2 << (iM6080c & 7);
        c1194c.f4973b = m6080c();
        this.f4987c.f4982k = m6080c();
    }

    /* JADX INFO: renamed from: l */
    private void m6089l() {
        do {
            m6082e();
            byte[] bArr = this.f4985a;
            if (bArr[0] == 1) {
                int i = bArr[1] & 255;
                int i2 = bArr[2] & 255;
                C1194c c1194c = this.f4987c;
                int i3 = (i2 << 8) | i;
                c1194c.f4981j = i3;
                if (i3 == 0) {
                    c1194c.f4981j = -1;
                }
            }
            if (this.f4986b <= 0) {
                return;
            }
        } while (!m6079a());
    }

    /* JADX INFO: renamed from: m */
    private int m6090m() {
        return this.f4988d.getShort();
    }

    /* JADX INFO: renamed from: n */
    private void m6091n() {
        this.f4988d = null;
        Arrays.fill(this.f4985a, (byte) 0);
        this.f4987c = new C1194c();
        this.f4986b = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m6092q() {
        int iM6080c;
        do {
            try {
                iM6080c = m6080c();
                ByteBuffer byteBuffer = this.f4988d;
                byteBuffer.position(byteBuffer.position() + iM6080c);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (iM6080c > 0);
    }

    /* JADX INFO: renamed from: r */
    private void m6093r() {
        m6080c();
        m6092q();
    }

    /* JADX INFO: renamed from: b */
    public C1194c m6094b() {
        if (this.f4988d == null) {
            qkq0.m175383a("You must call setData() before parseHeader()");
            return null;
        }
        if (m6079a()) {
            return this.f4987c;
        }
        m6087j();
        if (!m6079a()) {
            m6084g();
            C1194c c1194c = this.f4987c;
            if (c1194c.f4975d < 0) {
                c1194c.f4983l = 1;
            }
        }
        return this.f4987c;
    }

    /* JADX INFO: renamed from: o */
    public C1195d m6095o(ByteBuffer byteBuffer) {
        m6091n();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4988d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f4988d.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C1195d m6096p(byte[] bArr) {
        if (bArr != null) {
            m6095o(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f4988d = null;
        this.f4987c.f4983l = 2;
        return this;
    }
}
