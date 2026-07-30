package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class ukj {

    /* JADX INFO: renamed from: b */
    private ByteBuffer f176933b;

    /* JADX INFO: renamed from: c */
    private tkj f176934c;

    /* JADX INFO: renamed from: a */
    private final byte[] f176932a = new byte[256];

    /* JADX INFO: renamed from: d */
    private int f176935d = 0;

    /* JADX INFO: renamed from: b */
    private boolean m194155b() {
        return this.f176934c.f170874b != 0;
    }

    /* JADX INFO: renamed from: d */
    private int m194156d() {
        try {
            return this.f176933b.get() & 255;
        } catch (Exception unused) {
            this.f176934c.f170874b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m194157e() {
        this.f176934c.f170876d.f155132a = m194166n();
        this.f176934c.f170876d.f155133b = m194166n();
        this.f176934c.f170876d.f155134c = m194166n();
        this.f176934c.f170876d.f155135d = m194166n();
        int iM194156d = m194156d();
        boolean z = (iM194156d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM194156d & 7) + 1);
        qkj qkjVar = this.f176934c.f170876d;
        qkjVar.f155136e = (iM194156d & 64) != 0;
        if (z) {
            qkjVar.f155142k = m194159g(iPow);
        } else {
            qkjVar.f155142k = null;
        }
        this.f176934c.f170876d.f155141j = this.f176933b.position();
        m194169r();
        if (m194155b()) {
            return;
        }
        tkj tkjVar = this.f176934c;
        tkjVar.f170875c++;
        tkjVar.f170877e.add(tkjVar.f170876d);
    }

    /* JADX INFO: renamed from: f */
    private void m194158f() {
        int iM194156d = m194156d();
        this.f176935d = iM194156d;
        if (iM194156d <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f176935d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f176933b.get(this.f176932a, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f176934c.f170874b = 1;
                return;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    private int[] m194159g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f176933b.get(bArr);
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
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f176934c.f170874b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m194160h() {
        m194161i(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: i */
    private void m194161i(int i) {
        boolean z = false;
        while (!z && !m194155b() && this.f176934c.f170875c <= i) {
            int iM194156d = m194156d();
            if (iM194156d == 33) {
                int iM194156d2 = m194156d();
                if (iM194156d2 == 1) {
                    m194168q();
                } else if (iM194156d2 == 249) {
                    this.f176934c.f170876d = new qkj();
                    m194162j();
                } else if (iM194156d2 == 254) {
                    m194168q();
                } else if (iM194156d2 != 255) {
                    m194168q();
                } else {
                    m194158f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f176932a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m194165m();
                    } else {
                        m194168q();
                    }
                }
            } else if (iM194156d == 44) {
                tkj tkjVar = this.f176934c;
                if (tkjVar.f170876d == null) {
                    tkjVar.f170876d = new qkj();
                }
                m194157e();
            } else if (iM194156d != 59) {
                this.f176934c.f170874b = 1;
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m194162j() {
        m194156d();
        int iM194156d = m194156d();
        qkj qkjVar = this.f176934c.f170876d;
        int i = (iM194156d & 28) >> 2;
        qkjVar.f155138g = i;
        if (i == 0) {
            qkjVar.f155138g = 1;
        }
        qkjVar.f155137f = (iM194156d & 1) != 0;
        int iM194166n = m194166n();
        if (iM194166n < 2) {
            iM194166n = 10;
        }
        qkj qkjVar2 = this.f176934c.f170876d;
        qkjVar2.f155140i = iM194166n * 10;
        qkjVar2.f155139h = m194156d();
        m194156d();
    }

    /* JADX INFO: renamed from: k */
    private void m194163k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m194156d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f176934c.f170874b = 1;
            return;
        }
        m194164l();
        if (!this.f176934c.f170880h || m194155b()) {
            return;
        }
        tkj tkjVar = this.f176934c;
        tkjVar.f170873a = m194159g(tkjVar.f170881i);
        tkj tkjVar2 = this.f176934c;
        tkjVar2.f170884l = tkjVar2.f170873a[tkjVar2.f170882j];
    }

    /* JADX INFO: renamed from: l */
    private void m194164l() {
        this.f176934c.f170878f = m194166n();
        this.f176934c.f170879g = m194166n();
        int iM194156d = m194156d();
        tkj tkjVar = this.f176934c;
        tkjVar.f170880h = (iM194156d & 128) != 0;
        tkjVar.f170881i = (int) Math.pow(2.0d, (iM194156d & 7) + 1);
        this.f176934c.f170882j = m194156d();
        this.f176934c.f170883k = m194156d();
    }

    /* JADX INFO: renamed from: m */
    private void m194165m() {
        do {
            m194158f();
            byte[] bArr = this.f176932a;
            if (bArr[0] == 1) {
                this.f176934c.f170885m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f176935d <= 0) {
                return;
            }
        } while (!m194155b());
    }

    /* JADX INFO: renamed from: n */
    private int m194166n() {
        return this.f176933b.getShort();
    }

    /* JADX INFO: renamed from: o */
    private void m194167o() {
        this.f176933b = null;
        Arrays.fill(this.f176932a, (byte) 0);
        this.f176934c = new tkj();
        this.f176935d = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m194168q() {
        int iM194156d;
        do {
            iM194156d = m194156d();
            this.f176933b.position(Math.min(this.f176933b.position() + iM194156d, this.f176933b.limit()));
        } while (iM194156d > 0);
    }

    /* JADX INFO: renamed from: r */
    private void m194169r() {
        m194156d();
        m194168q();
    }

    /* JADX INFO: renamed from: a */
    public void m194170a() {
        this.f176933b = null;
        this.f176934c = null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public tkj m194171c() {
        if (this.f176933b == null) {
            qkq0.m175383a("You must call setData() before parseHeader()");
            return null;
        }
        if (m194155b()) {
            return this.f176934c;
        }
        m194163k();
        if (!m194155b()) {
            m194160h();
            tkj tkjVar = this.f176934c;
            if (tkjVar.f170875c < 0) {
                tkjVar.f170874b = 1;
            }
        }
        return this.f176934c;
    }

    /* JADX INFO: renamed from: p */
    public ukj m194172p(@NonNull ByteBuffer byteBuffer) {
        m194167o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f176933b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f176933b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
