package p149l;

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
public final class jky0 extends eny0 implements e1y0 {

    /* JADX INFO: renamed from: a1 */
    public final Context f118426a1;

    /* JADX INFO: renamed from: b1 */
    public final zgy0 f118427b1;

    /* JADX INFO: renamed from: c1 */
    public final eiy0 f118428c1;

    /* JADX INFO: renamed from: d1 */
    public int f118429d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f118430e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f118431f1;

    /* JADX INFO: renamed from: g1 */
    @Nullable
    public mhr0 f118432g1;

    /* JADX INFO: renamed from: h1 */
    @Nullable
    public mhr0 f118433h1;

    /* JADX INFO: renamed from: i1 */
    public long f118434i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f118435j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f118436k1;

    /* JADX INFO: renamed from: l1 */
    @Nullable
    public m5y0 f118437l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f118438m1;

    public jky0(Context context, tmy0 tmy0Var, xny0 xny0Var, boolean z, @Nullable Handler handler, @Nullable bhy0 bhy0Var, eiy0 eiy0Var) {
        super(1, tmy0Var, xny0Var, false, 44100.0f);
        this.f118426a1 = context.getApplicationContext();
        this.f118428c1 = eiy0Var;
        this.f118427b1 = new zgy0(handler, bhy0Var);
        eiy0Var.mo112323p(new iky0(this, null));
    }

    /* JADX INFO: renamed from: S0 */
    public static List m141918S0(xny0 xny0Var, mhr0 mhr0Var, boolean z, eiy0 eiy0Var) throws zzth {
        bny0 bny0VarM137401b;
        if (mhr0Var.f133892l == null) {
            return zzgaa.zzl();
        }
        return (!eiy0Var.mo112310c(mhr0Var) || (bny0VarM137401b = ioy0.m137401b()) == null) ? ioy0.m137405f(xny0Var, mhr0Var, false, false) : zzgaa.zzm(bny0VarM137401b);
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: A */
    public final void mo99978A() {
        this.f118438m1 = false;
        try {
            super.mo99978A();
            if (this.f118436k1) {
            }
        } finally {
            if (this.f118436k1) {
                this.f118436k1 = false;
                this.f118428c1.zzk();
            }
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: A0 */
    public final void mo99979A0(String str, rmy0 rmy0Var, long j, long j2) {
        this.f118427b1.m218729e(str, j, j2);
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: B */
    public final void mo99980B() {
        this.f118428c1.zzi();
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: B0 */
    public final void mo99981B0(String str) {
        this.f118427b1.m218730f(str);
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: C */
    public final void mo99982C() {
        m141924h0();
        this.f118428c1.zzh();
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: C0 */
    public final void mo99983C0(mhr0 mhr0Var, @Nullable MediaFormat mediaFormat) throws zziz {
        int iM126084z;
        int i;
        mhr0 mhr0Var2 = this.f118433h1;
        int[] iArr = null;
        boolean z = true;
        if (mhr0Var2 != null) {
            mhr0Var = mhr0Var2;
        } else if (m117309L0() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(mhr0Var.f133892l)) {
                iM126084z = mhr0Var.f133874A;
            } else if (ggw0.f102568a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM126084z = mediaFormat.containsKey("v-bits-per-sample") ? ggw0.m126084z(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM126084z = mediaFormat.getInteger("pcm-encoding");
            }
            ter0 ter0Var = new ter0();
            ter0Var.m188618w("audio/raw");
            ter0Var.m188612q(iM126084z);
            ter0Var.m188597f(mhr0Var.f133875B);
            ter0Var.m188598g(mhr0Var.f133876C);
            ter0Var.m188611p(mhr0Var.f133890j);
            ter0Var.m188604k(mhr0Var.f133881a);
            ter0Var.m188608m(mhr0Var.f133882b);
            ter0Var.m188609n(mhr0Var.f133883c);
            ter0Var.m188620y(mhr0Var.f133884d);
            ter0Var.m188616u(mhr0Var.f133885e);
            ter0Var.m188605k0(mediaFormat.getInteger("channel-count"));
            ter0Var.m188619x(mediaFormat.getInteger("sample-rate"));
            mhr0 mhr0VarM188591D = ter0Var.m188591D();
            if (this.f118430e1 && mhr0VarM188591D.f133905y == 6 && (i = mhr0Var.f133905y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < mhr0Var.f133905y; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.f118431f1) {
                int i3 = mhr0VarM188591D.f133905y;
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
            mhr0Var = mhr0VarM188591D;
        }
        try {
            int i4 = ggw0.f102568a;
            if (i4 >= 29) {
                if (m117316b0()) {
                    m146602N();
                }
                if (i4 < 29) {
                    z = false;
                }
                f5v0.m119535f(z);
            }
            this.f118428c1.mo112312e(mhr0Var, 0, iArr);
        } catch (zzpw e) {
            throw m146601M(e, e.zza, false, 5001);
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: E0 */
    public final void mo99984E0() {
        this.f118428c1.zzg();
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: F0 */
    public final void mo117305F0() throws zziz {
        try {
            this.f118428c1.zzj();
        } catch (zzqa e) {
            throw m146601M(e, e.zzc, e.zzb, true != m117316b0() ? 5002 : ErrorCode.EDIT_PREVIEW_FAILED);
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: G0 */
    public final boolean mo99985G0(long j, long j2, @Nullable vmy0 vmy0Var, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, mhr0 mhr0Var) throws zziz {
        byteBuffer.getClass();
        if (this.f118433h1 != null && (i2 & 2) != 0) {
            vmy0Var.getClass();
            vmy0Var.mo107727e(i, false);
            return true;
        }
        if (z) {
            if (vmy0Var != null) {
                vmy0Var.mo107727e(i, false);
            }
            this.f92379T0.f150422f += i3;
            this.f118428c1.zzg();
            return true;
        }
        try {
            if (!this.f118428c1.mo112311d(byteBuffer, j3, i3)) {
                return false;
            }
            if (vmy0Var != null) {
                vmy0Var.mo107727e(i, false);
            }
            this.f92379T0.f150421e += i3;
            return true;
        } catch (zzpx e) {
            throw m146601M(e, this.f118432g1, e.zzb, 5001);
        } catch (zzqa e2) {
            if (m117316b0()) {
                m146602N();
            }
            throw m146601M(e2, mhr0Var, e2.zzb, 5002);
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: H0 */
    public final boolean mo117306H0(mhr0 mhr0Var) {
        m146602N();
        return this.f118428c1.mo112310c(mhr0Var);
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: P */
    public final void mo99988P() {
        this.f118436k1 = true;
        this.f118432g1 = null;
        try {
            this.f118428c1.zzf();
            super.mo99988P();
        } catch (Throwable th) {
            super.mo99988P();
            throw th;
        } finally {
            this.f118427b1.m218731g(this.f92379T0);
        }
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: Q */
    public final void mo99990Q(boolean z, boolean z2) throws zziz {
        super.mo99990Q(z, z2);
        this.f118427b1.m218732h(this.f92379T0);
        m146602N();
        this.f118428c1.mo112319l(m146603O());
        this.f118428c1.mo112320m(m146600L());
    }

    /* JADX INFO: renamed from: R0 */
    public final int m141922R0(bny0 bny0Var, mhr0 mhr0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(bny0Var.f76460a) || (i = ggw0.f102568a) >= 24 || (i == 23 && ggw0.m126068j(this.f118426a1))) {
            return mhr0Var.f133893m;
        }
        return -1;
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: S */
    public final void mo99994S(long j, boolean z) throws zziz {
        super.mo99994S(j, z);
        this.f118428c1.zzf();
        this.f118434i1 = j;
        this.f118438m1 = false;
        this.f118435j1 = true;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: T */
    public final float mo99996T(float f, mhr0 mhr0Var, mhr0[] mhr0VarArr) {
        int iMax = -1;
        for (mhr0 mhr0Var2 : mhr0VarArr) {
            int i = mhr0Var2.f133906z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: U */
    public final int mo99997U(xny0 xny0Var, mhr0 mhr0Var) throws zzth {
        int i;
        boolean z;
        if (!uys0.m196370g(mhr0Var.f133892l)) {
            return 128;
        }
        int i2 = ggw0.f102568a;
        int i3 = mhr0Var.f133879F;
        boolean zM117300e0 = eny0.m117300e0(mhr0Var);
        int i4 = 1;
        if (!zM117300e0 || (i3 != 0 && ioy0.m137401b() == null)) {
            i = 0;
        } else {
            zfy0 zfy0VarMo112309b = this.f118428c1.mo112309b(mhr0Var);
            if (zfy0VarMo112309b.f202997a) {
                i = true != zfy0VarMo112309b.f202998b ? 512 : 1536;
                if (zfy0VarMo112309b.f202999c) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.f118428c1.mo112310c(mhr0Var)) {
                return i | CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256;
            }
        }
        if ((!"audio/raw".equals(mhr0Var.f133892l) || this.f118428c1.mo112310c(mhr0Var)) && this.f118428c1.mo112310c(ggw0.m126057N(2, mhr0Var.f133905y, mhr0Var.f133906z))) {
            List listM141918S0 = m141918S0(xny0Var, mhr0Var, false, this.f118428c1);
            if (!listM141918S0.isEmpty()) {
                if (zM117300e0) {
                    bny0 bny0Var = (bny0) listM141918S0.get(0);
                    boolean zM102881e = bny0Var.m102881e(mhr0Var);
                    if (!zM102881e) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= listM141918S0.size()) {
                                z = true;
                                break;
                            }
                            bny0 bny0Var2 = (bny0) listM141918S0.get(i5);
                            if (bny0Var2.m102881e(mhr0Var)) {
                                z = false;
                                zM102881e = true;
                                bny0Var = bny0Var2;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                    int i6 = true != zM102881e ? 3 : 4;
                    int i7 = 8;
                    if (zM102881e && bny0Var.m102882f(mhr0Var)) {
                        i7 = 16;
                    }
                    return i6 | i7 | 32 | (true != bny0Var.f76466g ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i4 = 2;
            }
        }
        return i4 | 128;
    }

    @CallSuper
    /* JADX INFO: renamed from: W0 */
    public final void m141923W0() {
        this.f118435j1 = true;
    }

    @Override // p149l.p5y0, p149l.u5y0
    /* JADX INFO: renamed from: e */
    public final String mo100005e() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p149l.e1y0
    /* JADX INFO: renamed from: g */
    public final void mo114455g(c5t0 c5t0Var) {
        this.f118428c1.mo112322o(c5t0Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m141924h0() {
        long jZzb = this.f118428c1.zzb(zzV());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.f118435j1) {
                jZzb = Math.max(this.f118434i1, jZzb);
            }
            this.f118434i1 = jZzb;
            this.f118435j1 = false;
        }
    }

    @Override // p149l.eny0, p149l.p5y0
    /* JADX INFO: renamed from: r */
    public final boolean mo100010r() {
        return this.f118428c1.mo112314g() || super.mo100010r();
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: r0 */
    public final tnx0 mo100011r0(bny0 bny0Var, mhr0 mhr0Var, mhr0 mhr0Var2) {
        int i;
        int i2;
        tnx0 tnx0VarM102879b = bny0Var.m102879b(mhr0Var, mhr0Var2);
        int i3 = tnx0VarM102879b.f171297e;
        if (m117317c0(mhr0Var2)) {
            i3 |= 32768;
        }
        if (m141922R0(bny0Var, mhr0Var2) > this.f118429d1) {
            i3 |= 64;
        }
        String str = bny0Var.f76460a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = tnx0VarM102879b.f171296d;
        }
        return new tnx0(str, mhr0Var, mhr0Var2, i2, i);
    }

    @Override // p149l.eny0
    @Nullable
    /* JADX INFO: renamed from: s0 */
    public final tnx0 mo100012s0(f0y0 f0y0Var) throws zziz {
        mhr0 mhr0Var = f0y0Var.f94022a;
        mhr0Var.getClass();
        this.f118432g1 = mhr0Var;
        tnx0 tnx0VarMo100012s0 = super.mo100012s0(f0y0Var);
        this.f118427b1.m218733i(mhr0Var, tnx0VarMo100012s0);
        return tnx0VarMo100012s0;
    }

    @Override // p149l.knx0, p149l.a5y0
    /* JADX INFO: renamed from: u */
    public final void mo95065u(int i, @Nullable Object obj) throws zziz {
        if (i == 2) {
            eiy0 eiy0Var = this.f118428c1;
            obj.getClass();
            eiy0Var.mo112316i(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            qux0 qux0Var = (qux0) obj;
            eiy0 eiy0Var2 = this.f118428c1;
            qux0Var.getClass();
            eiy0Var2.mo112321n(qux0Var);
            return;
        }
        if (i == 6) {
            tzx0 tzx0Var = (tzx0) obj;
            eiy0 eiy0Var3 = this.f118428c1;
            tzx0Var.getClass();
            eiy0Var3.mo112318k(tzx0Var);
            return;
        }
        switch (i) {
            case 9:
                eiy0 eiy0Var4 = this.f118428c1;
                obj.getClass();
                eiy0Var4.mo112315h(((Boolean) obj).booleanValue());
                break;
            case 10:
                eiy0 eiy0Var5 = this.f118428c1;
                obj.getClass();
                eiy0Var5.zzm(((Integer) obj).intValue());
                break;
            case 11:
                this.f118437l1 = (m5y0) obj;
                break;
            case 12:
                if (ggw0.f102568a >= 23) {
                    gky0.m126737a(this.f118428c1, obj);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    @Override // p149l.eny0
    /* JADX INFO: renamed from: v0 */
    public final rmy0 mo100013v0(bny0 bny0Var, mhr0 mhr0Var, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        mhr0[] mhr0VarArrM146594F = m146594F();
        int length = mhr0VarArrM146594F.length;
        int iM141922R0 = m141922R0(bny0Var, mhr0Var);
        if (length != 1) {
            for (mhr0 mhr0Var2 : mhr0VarArrM146594F) {
                if (bny0Var.m102879b(mhr0Var, mhr0Var2).f171296d != 0) {
                    iM141922R0 = Math.max(iM141922R0, m141922R0(bny0Var, mhr0Var2));
                }
            }
        }
        this.f118429d1 = iM141922R0;
        String str = bny0Var.f76460a;
        int i = ggw0.f102568a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(ggw0.f102570c)) {
            String str2 = ggw0.f102569b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f118430e1 = z;
        String str3 = bny0Var.f76460a;
        this.f118431f1 = str3.equals("OMX.google.opus.decoder") || str3.equals("c2.android.opus.decoder") || str3.equals("OMX.google.vorbis.decoder") || str3.equals("c2.android.vorbis.decoder");
        String str4 = bny0Var.f76462c;
        int i2 = this.f118429d1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str4);
        mediaFormat.setInteger("channel-count", mhr0Var.f133905y);
        mediaFormat.setInteger("sample-rate", mhr0Var.f133906z);
        azv0.m99731b(mediaFormat, mhr0Var.f133894n);
        azv0.m99730a(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str5 = ggw0.f102571d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(mhr0Var.f133892l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24 && this.f118428c1.mo112308a(ggw0.m126057N(4, mhr0Var.f133905y, mhr0Var.f133906z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.f118433h1 = (!"audio/raw".equals(bny0Var.f76461b) || "audio/raw".equals(mhr0Var.f133892l)) ? null : mhr0Var;
        return rmy0.m180051a(bny0Var, mediaFormat, mhr0Var, null);
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: w0 */
    public final List mo100015w0(xny0 xny0Var, mhr0 mhr0Var, boolean z) throws zzth {
        return ioy0.m137406g(m141918S0(xny0Var, mhr0Var, false, this.f118428c1), mhr0Var);
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: y0 */
    public final void mo100017y0(ylx0 ylx0Var) {
        mhr0 mhr0Var;
        if (ggw0.f102568a < 29 || (mhr0Var = ylx0Var.f198943b) == null || !Objects.equals(mhr0Var.f133892l, "audio/opus") || !m117316b0()) {
            return;
        }
        ByteBuffer byteBuffer = ylx0Var.f198948g;
        byteBuffer.getClass();
        mhr0 mhr0Var2 = ylx0Var.f198943b;
        mhr0Var2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.f118428c1.mo112317j(mhr0Var2.f133875B, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: z0 */
    public final void mo100019z0(Exception exc) {
        svv0.m186109d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f118427b1.m218725a(exc);
    }

    @Override // p149l.eny0, p149l.p5y0
    public final boolean zzV() {
        return super.zzV() && this.f118428c1.mo112324r();
    }

    @Override // p149l.e1y0
    public final long zza() {
        if (mo146615s() == 2) {
            m141924h0();
        }
        return this.f118434i1;
    }

    @Override // p149l.e1y0
    public final c5t0 zzc() {
        return this.f118428c1.zzc();
    }

    @Override // p149l.e1y0
    public final boolean zzj() {
        boolean z = this.f118438m1;
        this.f118438m1 = false;
        return z;
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: z */
    public final void mo100018z() {
    }

    @Override // p149l.knx0, p149l.p5y0
    @Nullable
    public final e1y0 zzk() {
        return this;
    }
}
