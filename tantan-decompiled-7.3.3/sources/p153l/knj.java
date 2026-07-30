package p153l;

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
public class knj {

    /* JADX INFO: renamed from: b */
    private ByteBuffer f127605b;

    /* JADX INFO: renamed from: c */
    private jnj f127606c;

    /* JADX INFO: renamed from: a */
    private final byte[] f127604a = new byte[256];

    /* JADX INFO: renamed from: d */
    private int f127607d = 0;

    /* JADX INFO: renamed from: b */
    private boolean m150522b() {
        return this.f127606c.f121859b != 0;
    }

    /* JADX INFO: renamed from: d */
    private int m150523d() {
        try {
            return this.f127605b.get() & 255;
        } catch (Exception unused) {
            this.f127606c.f121859b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m150524e() {
        this.f127606c.f121861d.f105089a = m150533n();
        this.f127606c.f121861d.f105090b = m150533n();
        this.f127606c.f121861d.f105091c = m150533n();
        this.f127606c.f121861d.f105092d = m150533n();
        int iM150523d = m150523d();
        boolean z = (iM150523d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM150523d & 7) + 1);
        gnj gnjVar = this.f127606c.f121861d;
        gnjVar.f105093e = (iM150523d & 64) != 0;
        if (z) {
            gnjVar.f105099k = m150526g(iPow);
        } else {
            gnjVar.f105099k = null;
        }
        this.f127606c.f121861d.f105098j = this.f127605b.position();
        m150536r();
        if (m150522b()) {
            return;
        }
        jnj jnjVar = this.f127606c;
        jnjVar.f121860c++;
        jnjVar.f121862e.add(jnjVar.f121861d);
    }

    /* JADX INFO: renamed from: f */
    private void m150525f() {
        int iM150523d = m150523d();
        this.f127607d = iM150523d;
        if (iM150523d <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f127607d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f127605b.get(this.f127604a, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f127606c.f121859b = 1;
                return;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    private int[] m150526g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f127605b.get(bArr);
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
            this.f127606c.f121859b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m150527h() {
        m150528i(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: i */
    private void m150528i(int i) {
        boolean z = false;
        while (!z && !m150522b() && this.f127606c.f121860c <= i) {
            int iM150523d = m150523d();
            if (iM150523d == 33) {
                int iM150523d2 = m150523d();
                if (iM150523d2 == 1) {
                    m150535q();
                } else if (iM150523d2 == 249) {
                    this.f127606c.f121861d = new gnj();
                    m150529j();
                } else if (iM150523d2 == 254) {
                    m150535q();
                } else if (iM150523d2 != 255) {
                    m150535q();
                } else {
                    m150525f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f127604a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m150532m();
                    } else {
                        m150535q();
                    }
                }
            } else if (iM150523d == 44) {
                jnj jnjVar = this.f127606c;
                if (jnjVar.f121861d == null) {
                    jnjVar.f121861d = new gnj();
                }
                m150524e();
            } else if (iM150523d != 59) {
                this.f127606c.f121859b = 1;
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m150529j() {
        m150523d();
        int iM150523d = m150523d();
        gnj gnjVar = this.f127606c.f121861d;
        int i = (iM150523d & 28) >> 2;
        gnjVar.f105095g = i;
        if (i == 0) {
            gnjVar.f105095g = 1;
        }
        gnjVar.f105094f = (iM150523d & 1) != 0;
        int iM150533n = m150533n();
        if (iM150533n < 2) {
            iM150533n = 10;
        }
        gnj gnjVar2 = this.f127606c.f121861d;
        gnjVar2.f105097i = iM150533n * 10;
        gnjVar2.f105096h = m150523d();
        m150523d();
    }

    /* JADX INFO: renamed from: k */
    private void m150530k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m150523d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f127606c.f121859b = 1;
            return;
        }
        m150531l();
        if (!this.f127606c.f121865h || m150522b()) {
            return;
        }
        jnj jnjVar = this.f127606c;
        jnjVar.f121858a = m150526g(jnjVar.f121866i);
        jnj jnjVar2 = this.f127606c;
        jnjVar2.f121869l = jnjVar2.f121858a[jnjVar2.f121867j];
    }

    /* JADX INFO: renamed from: l */
    private void m150531l() {
        this.f127606c.f121863f = m150533n();
        this.f127606c.f121864g = m150533n();
        int iM150523d = m150523d();
        jnj jnjVar = this.f127606c;
        jnjVar.f121865h = (iM150523d & 128) != 0;
        jnjVar.f121866i = (int) Math.pow(2.0d, (iM150523d & 7) + 1);
        this.f127606c.f121867j = m150523d();
        this.f127606c.f121868k = m150523d();
    }

    /* JADX INFO: renamed from: m */
    private void m150532m() {
        do {
            m150525f();
            byte[] bArr = this.f127604a;
            if (bArr[0] == 1) {
                this.f127606c.f121870m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f127607d <= 0) {
                return;
            }
        } while (!m150522b());
    }

    /* JADX INFO: renamed from: n */
    private int m150533n() {
        return this.f127605b.getShort();
    }

    /* JADX INFO: renamed from: o */
    private void m150534o() {
        this.f127605b = null;
        Arrays.fill(this.f127604a, (byte) 0);
        this.f127606c = new jnj();
        this.f127607d = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m150535q() {
        int iM150523d;
        do {
            iM150523d = m150523d();
            this.f127605b.position(Math.min(this.f127605b.position() + iM150523d, this.f127605b.limit()));
        } while (iM150523d > 0);
    }

    /* JADX INFO: renamed from: r */
    private void m150536r() {
        m150523d();
        m150535q();
    }

    /* JADX INFO: renamed from: a */
    public void m150537a() {
        this.f127605b = null;
        this.f127606c = null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public jnj m150538c() {
        if (this.f127605b == null) {
            wtq0.m207906a("You must call setData() before parseHeader()");
            return null;
        }
        if (m150522b()) {
            return this.f127606c;
        }
        m150530k();
        if (!m150522b()) {
            m150527h();
            jnj jnjVar = this.f127606c;
            if (jnjVar.f121860c < 0) {
                jnjVar.f121859b = 1;
            }
        }
        return this.f127606c;
    }

    /* JADX INFO: renamed from: p */
    public knj m150539p(@NonNull ByteBuffer byteBuffer) {
        m150534o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f127605b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f127605b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
