package p153l;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.core.glcore.util.ErrorCode;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzth;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class pty0 extends kwy0 implements kay0 {

    /* JADX INFO: renamed from: a1 */
    public final Context f154118a1;

    /* JADX INFO: renamed from: b1 */
    public final fqy0 f154119b1;

    /* JADX INFO: renamed from: c1 */
    public final kry0 f154120c1;

    /* JADX INFO: renamed from: d1 */
    public int f154121d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f154122e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f154123f1;

    /* JADX INFO: renamed from: g1 */
    @Nullable
    public sqr0 f154124g1;

    /* JADX INFO: renamed from: h1 */
    @Nullable
    public sqr0 f154125h1;

    /* JADX INFO: renamed from: i1 */
    public long f154126i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f154127j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f154128k1;

    /* JADX INFO: renamed from: l1 */
    @Nullable
    public sey0 f154129l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f154130m1;

    public pty0(Context context, zvy0 zvy0Var, dxy0 dxy0Var, boolean z, @Nullable Handler handler, @Nullable hqy0 hqy0Var, kry0 kry0Var) {
        super(1, zvy0Var, dxy0Var, false, 44100.0f);
        this.f154118a1 = context.getApplicationContext();
        this.f154120c1 = kry0Var;
        this.f154119b1 = new fqy0(handler, hqy0Var);
        kry0Var.mo146961p(new oty0(this, null));
    }

    /* JADX INFO: renamed from: S0 */
    public static List m173788S0(dxy0 dxy0Var, sqr0 sqr0Var, boolean z, kry0 kry0Var) throws zzth {
        hwy0 hwy0VarM169760b;
        if (sqr0Var.f170251l == null) {
            return zzgaa.zzl();
        }
        return (!kry0Var.mo146948c(sqr0Var) || (hwy0VarM169760b = oxy0.m169760b()) == null) ? oxy0.m169764f(dxy0Var, sqr0Var, false, false) : zzgaa.zzm(hwy0VarM169760b);
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: A */
    public final void mo134368A() {
        this.f154130m1 = false;
        try {
            super.mo134368A();
            if (this.f154128k1) {
            }
        } finally {
            if (this.f154128k1) {
                this.f154128k1 = false;
                this.f154120c1.zzk();
            }
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: A0 */
    public final void mo134369A0(String str, xvy0 xvy0Var, long j, long j2) {
        this.f154119b1.m126824e(str, j, j2);
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: B */
    public final void mo134370B() {
        this.f154120c1.zzi();
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: B0 */
    public final void mo134371B0(String str) {
        this.f154119b1.m126825f(str);
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: C */
    public final void mo134372C() {
        m173794h0();
        this.f154120c1.zzh();
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: C0 */
    public final void mo134373C0(sqr0 sqr0Var, @Nullable MediaFormat mediaFormat) throws zziz {
        int iM159428z;
        int i;
        sqr0 sqr0Var2 = this.f154125h1;
        int[] iArr = null;
        boolean z = true;
        if (sqr0Var2 != null) {
            sqr0Var = sqr0Var2;
        } else if (m151755L0() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(sqr0Var.f170251l)) {
                iM159428z = sqr0Var.f170233A;
            } else if (mpw0.f137957a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM159428z = mediaFormat.containsKey("v-bits-per-sample") ? mpw0.m159428z(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM159428z = mediaFormat.getInteger("pcm-encoding");
            }
            znr0 znr0Var = new znr0();
            znr0Var.m220672w("audio/raw");
            znr0Var.m220666q(iM159428z);
            znr0Var.m220651f(sqr0Var.f170234B);
            znr0Var.m220652g(sqr0Var.f170235C);
            znr0Var.m220665p(sqr0Var.f170249j);
            znr0Var.m220658k(sqr0Var.f170240a);
            znr0Var.m220662m(sqr0Var.f170241b);
            znr0Var.m220663n(sqr0Var.f170242c);
            znr0Var.m220674y(sqr0Var.f170243d);
            znr0Var.m220670u(sqr0Var.f170244e);
            znr0Var.m220659k0(mediaFormat.getInteger("channel-count"));
            znr0Var.m220673x(mediaFormat.getInteger("sample-rate"));
            sqr0 sqr0VarM220645D = znr0Var.m220645D();
            if (this.f154122e1 && sqr0VarM220645D.f170264y == 6 && (i = sqr0Var.f170264y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < sqr0Var.f170264y; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.f154123f1) {
                int i3 = sqr0VarM220645D.f170264y;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            sqr0Var = sqr0VarM220645D;
        }
        try {
            int i4 = mpw0.f137957a;
            if (i4 >= 29) {
                if (m151762b0()) {
                    m178549N();
                }
                if (i4 < 29) {
                    z = false;
                }
                lev0.m153958f(z);
            }
            this.f154120c1.mo146950e(sqr0Var, 0, iArr);
        } catch (zzpw e) {
            throw m178548M(e, e.zza, false, 5001);
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: E0 */
    public final void mo134374E0() {
        this.f154120c1.zzg();
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: F0 */
    public final void mo151751F0() throws zziz {
        try {
            this.f154120c1.zzj();
        } catch (zzqa e) {
            throw m178548M(e, e.zzc, e.zzb, true != m151762b0() ? 5002 : ErrorCode.EDIT_PREVIEW_FAILED);
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: G0 */
    public final boolean mo134375G0(long j, long j2, @Nullable bwy0 bwy0Var, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, sqr0 sqr0Var) throws zziz {
        byteBuffer.getClass();
        if (this.f154125h1 != null && (i2 & 2) != 0) {
            bwy0Var.getClass();
            bwy0Var.mo106818e(i, false);
            return true;
        }
        if (z) {
            if (bwy0Var != null) {
                bwy0Var.mo106818e(i, false);
            }
            this.f129134T0.f186208f += i3;
            this.f154120c1.zzg();
            return true;
        }
        try {
            if (!this.f154120c1.mo146949d(byteBuffer, j3, i3)) {
                return false;
            }
            if (bwy0Var != null) {
                bwy0Var.mo106818e(i, false);
            }
            this.f129134T0.f186207e += i3;
            return true;
        } catch (zzpx e) {
            throw m178548M(e, this.f154124g1, e.zzb, 5001);
        } catch (zzqa e2) {
            if (m151762b0()) {
                m178549N();
            }
            throw m178548M(e2, sqr0Var, e2.zzb, 5002);
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: H0 */
    public final boolean mo151752H0(sqr0 sqr0Var) {
        m178549N();
        return this.f154120c1.mo146948c(sqr0Var);
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: P */
    public final void mo134378P() {
        this.f154128k1 = true;
        this.f154124g1 = null;
        try {
            this.f154120c1.zzf();
            super.mo134378P();
        } catch (Throwable th) {
            super.mo134378P();
            throw th;
        } finally {
            this.f154119b1.m126826g(this.f129134T0);
        }
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: Q */
    public final void mo134380Q(boolean z, boolean z2) throws zziz {
        super.mo134380Q(z, z2);
        this.f154119b1.m126827h(this.f129134T0);
        m178549N();
        this.f154120c1.mo146957l(m178550O());
        this.f154120c1.mo146958m(m178547L());
    }

    /* JADX INFO: renamed from: R0 */
    public final int m173792R0(hwy0 hwy0Var, sqr0 sqr0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(hwy0Var.f111951a) || (i = mpw0.f137957a) >= 24 || (i == 23 && mpw0.m159412j(this.f154118a1))) {
            return sqr0Var.f170252m;
        }
        return -1;
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: S */
    public final void mo134384S(long j, boolean z) throws zziz {
        super.mo134384S(j, z);
        this.f154120c1.zzf();
        this.f154126i1 = j;
        this.f154130m1 = false;
        this.f154127j1 = true;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: T */
    public final float mo134386T(float f, sqr0 sqr0Var, sqr0[] sqr0VarArr) {
        int iMax = -1;
        for (sqr0 sqr0Var2 : sqr0VarArr) {
            int i = sqr0Var2.f170265z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: U */
    public final int mo134387U(dxy0 dxy0Var, sqr0 sqr0Var) throws zzth {
        int i;
        boolean z;
        if (!a8t0.m96495g(sqr0Var.f170251l)) {
            return 128;
        }
        int i2 = mpw0.f137957a;
        int i3 = sqr0Var.f170238F;
        boolean zM151746e0 = kwy0.m151746e0(sqr0Var);
        int i4 = 1;
        if (!zM151746e0 || (i3 != 0 && oxy0.m169760b() == null)) {
            i = 0;
        } else {
            fpy0 fpy0VarMo146947b = this.f154120c1.mo146947b(sqr0Var);
            if (fpy0VarMo146947b.f100231a) {
                i = true != fpy0VarMo146947b.f100232b ? 512 : 1536;
                if (fpy0VarMo146947b.f100233c) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.f154120c1.mo146948c(sqr0Var)) {
                return i | CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256;
            }
        }
        if ((!"audio/raw".equals(sqr0Var.f170251l) || this.f154120c1.mo146948c(sqr0Var)) && this.f154120c1.mo146948c(mpw0.m159401N(2, sqr0Var.f170264y, sqr0Var.f170265z))) {
            List listM173788S0 = m173788S0(dxy0Var, sqr0Var, false, this.f154120c1);
            if (!listM173788S0.isEmpty()) {
                if (zM151746e0) {
                    hwy0 hwy0Var = (hwy0) listM173788S0.get(0);
                    boolean zM137549e = hwy0Var.m137549e(sqr0Var);
                    if (!zM137549e) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= listM173788S0.size()) {
                                z = true;
                                break;
                            }
                            hwy0 hwy0Var2 = (hwy0) listM173788S0.get(i5);
                            if (hwy0Var2.m137549e(sqr0Var)) {
                                z = false;
                                zM137549e = true;
                                hwy0Var = hwy0Var2;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                    int i6 = true != zM137549e ? 3 : 4;
                    int i7 = 8;
                    if (zM137549e && hwy0Var.m137550f(sqr0Var)) {
                        i7 = 16;
                    }
                    return i6 | i7 | 32 | (true != hwy0Var.f111957g ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i4 = 2;
            }
        }
        return i4 | 128;
    }

    @CallSuper
    /* JADX INFO: renamed from: W0 */
    public final void m173793W0() {
        this.f154127j1 = true;
    }

    @Override // p153l.vey0, p153l.afy0
    /* JADX INFO: renamed from: e */
    public final String mo97571e() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p153l.kay0
    /* JADX INFO: renamed from: g */
    public final void mo148998g(iet0 iet0Var) {
        this.f154120c1.mo146960o(iet0Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m173794h0() {
        long jZzb = this.f154120c1.zzb(zzV());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.f154127j1) {
                jZzb = Math.max(this.f154126i1, jZzb);
            }
            this.f154126i1 = jZzb;
            this.f154127j1 = false;
        }
    }

    @Override // p153l.kwy0, p153l.vey0
    /* JADX INFO: renamed from: r */
    public final boolean mo134399r() {
        return this.f154120c1.mo146952g() || super.mo134399r();
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: r0 */
    public final zwx0 mo134400r0(hwy0 hwy0Var, sqr0 sqr0Var, sqr0 sqr0Var2) {
        int i;
        int i2;
        zwx0 zwx0VarM137547b = hwy0Var.m137547b(sqr0Var, sqr0Var2);
        int i3 = zwx0VarM137547b.f206398e;
        if (m151763c0(sqr0Var2)) {
            i3 |= 32768;
        }
        if (m173792R0(hwy0Var, sqr0Var2) > this.f154121d1) {
            i3 |= 64;
        }
        String str = hwy0Var.f111951a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zwx0VarM137547b.f206397d;
        }
        return new zwx0(str, sqr0Var, sqr0Var2, i2, i);
    }

    @Override // p153l.kwy0
    @Nullable
    /* JADX INFO: renamed from: s0 */
    public final zwx0 mo134401s0(l9y0 l9y0Var) throws zziz {
        sqr0 sqr0Var = l9y0Var.f130645a;
        sqr0Var.getClass();
        this.f154124g1 = sqr0Var;
        zwx0 zwx0VarMo134401s0 = super.mo134401s0(l9y0Var);
        this.f154119b1.m126828i(sqr0Var, zwx0VarMo134401s0);
        return zwx0VarMo134401s0;
    }

    @Override // p153l.qwx0, p153l.gey0
    /* JADX INFO: renamed from: u */
    public final void mo119682u(int i, @Nullable Object obj) throws zziz {
        if (i == 2) {
            kry0 kry0Var = this.f154120c1;
            obj.getClass();
            kry0Var.mo146954i(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            w3y0 w3y0Var = (w3y0) obj;
            kry0 kry0Var2 = this.f154120c1;
            w3y0Var.getClass();
            kry0Var2.mo146959n(w3y0Var);
            return;
        }
        if (i == 6) {
            z8y0 z8y0Var = (z8y0) obj;
            kry0 kry0Var3 = this.f154120c1;
            z8y0Var.getClass();
            kry0Var3.mo146956k(z8y0Var);
            return;
        }
        switch (i) {
            case 9:
                kry0 kry0Var4 = this.f154120c1;
                obj.getClass();
                kry0Var4.mo146953h(((Boolean) obj).booleanValue());
                break;
            case 10:
                kry0 kry0Var5 = this.f154120c1;
                obj.getClass();
                kry0Var5.zzm(((Integer) obj).intValue());
                break;
            case 11:
                this.f154129l1 = (sey0) obj;
                break;
            case 12:
                if (mpw0.f137957a >= 23) {
                    mty0.m160055a(this.f154120c1, obj);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    @Override // p153l.kwy0
    /* JADX INFO: renamed from: v0 */
    public final xvy0 mo134402v0(hwy0 hwy0Var, sqr0 sqr0Var, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        sqr0[] sqr0VarArrM178541F = m178541F();
        int length = sqr0VarArrM178541F.length;
        int iM173792R0 = m173792R0(hwy0Var, sqr0Var);
        if (length != 1) {
            for (sqr0 sqr0Var2 : sqr0VarArrM178541F) {
                if (hwy0Var.m137547b(sqr0Var, sqr0Var2).f206397d != 0) {
                    iM173792R0 = Math.max(iM173792R0, m173792R0(hwy0Var, sqr0Var2));
                }
            }
        }
        this.f154121d1 = iM173792R0;
        String str = hwy0Var.f111951a;
        int i = mpw0.f137957a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(mpw0.f137959c)) {
            String str2 = mpw0.f137958b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f154122e1 = z;
        String str3 = hwy0Var.f111951a;
        this.f154123f1 = str3.equals("OMX.google.opus.decoder") || str3.equals("c2.android.opus.decoder") || str3.equals("OMX.google.vorbis.decoder") || str3.equals("c2.android.vorbis.decoder");
        String str4 = hwy0Var.f111953c;
        int i2 = this.f154121d1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str4);
        mediaFormat.setInteger("channel-count", sqr0Var.f170264y);
        mediaFormat.setInteger("sample-rate", sqr0Var.f170265z);
        g8w0.m129465b(mediaFormat, sqr0Var.f170253n);
        g8w0.m129464a(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str5 = mpw0.f137960d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(sqr0Var.f170251l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24 && this.f154120c1.mo146946a(mpw0.m159401N(4, sqr0Var.f170264y, sqr0Var.f170265z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.f154125h1 = (!"audio/raw".equals(hwy0Var.f111952b) || "audio/raw".equals(sqr0Var.f170251l)) ? null : sqr0Var;
        return xvy0.m213281a(hwy0Var, mediaFormat, sqr0Var, null);
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: w0 */
    public final List mo134404w0(dxy0 dxy0Var, sqr0 sqr0Var, boolean z) throws zzth {
        return oxy0.m169765g(m173788S0(dxy0Var, sqr0Var, false, this.f154120c1), sqr0Var);
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: y0 */
    public final void mo134406y0(evx0 evx0Var) {
        sqr0 sqr0Var;
        if (mpw0.f137957a < 29 || (sqr0Var = evx0Var.f96055b) == null || !Objects.equals(sqr0Var.f170251l, "audio/opus") || !m151762b0()) {
            return;
        }
        ByteBuffer byteBuffer = evx0Var.f96060g;
        byteBuffer.getClass();
        sqr0 sqr0Var2 = evx0Var.f96055b;
        sqr0Var2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.f154120c1.mo146955j(sqr0Var2.f170234B, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: z0 */
    public final void mo134408z0(Exception exc) {
        y4w0.m214276d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f154119b1.m126820a(exc);
    }

    @Override // p153l.kwy0, p153l.vey0
    public final boolean zzV() {
        return super.zzV() && this.f154120c1.mo146962r();
    }

    @Override // p153l.kay0
    public final long zza() {
        if (mo178561s() == 2) {
            m173794h0();
        }
        return this.f154126i1;
    }

    @Override // p153l.kay0
    public final iet0 zzc() {
        return this.f154120c1.zzc();
    }

    @Override // p153l.kay0
    public final boolean zzj() {
        boolean z = this.f154130m1;
        this.f154130m1 = false;
        return z;
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: z */
    public final void mo134407z() {
    }

    @Override // p153l.qwx0, p153l.vey0
    @Nullable
    public final kay0 zzk() {
        return this;
    }
}
