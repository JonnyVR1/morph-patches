package p153l;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzig;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzsx;
import com.google.android.gms.internal.ads.zzth;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kwy0 extends qwx0 {

    /* JADX INFO: renamed from: Z0 */
    public static final byte[] f129098Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, HttpTokens.SPACE, 0, 0, 1, 101, -120, -124, HttpTokens.CARRIAGE_RETURN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A */
    public final qty0 f129099A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public sqr0 f129100B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public sqr0 f129101C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public MediaCrypto f129102D;

    /* JADX INFO: renamed from: E */
    public boolean f129103E;

    /* JADX INFO: renamed from: E0 */
    public boolean f129104E0;

    /* JADX INFO: renamed from: F */
    public long f129105F;

    /* JADX INFO: renamed from: F0 */
    public boolean f129106F0;

    /* JADX INFO: renamed from: G */
    public float f129107G;

    /* JADX INFO: renamed from: G0 */
    public boolean f129108G0;

    /* JADX INFO: renamed from: H */
    @Nullable
    public bwy0 f129109H;

    /* JADX INFO: renamed from: H0 */
    public boolean f129110H0;

    /* JADX INFO: renamed from: I */
    @Nullable
    public sqr0 f129111I;

    /* JADX INFO: renamed from: I0 */
    public int f129112I0;

    /* JADX INFO: renamed from: J */
    @Nullable
    public MediaFormat f129113J;

    /* JADX INFO: renamed from: J0 */
    public int f129114J0;

    /* JADX INFO: renamed from: K */
    public boolean f129115K;

    /* JADX INFO: renamed from: K0 */
    public int f129116K0;

    /* JADX INFO: renamed from: L */
    public float f129117L;

    /* JADX INFO: renamed from: L0 */
    public boolean f129118L0;

    /* JADX INFO: renamed from: M */
    @Nullable
    public ArrayDeque f129119M;

    /* JADX INFO: renamed from: M0 */
    public boolean f129120M0;

    /* JADX INFO: renamed from: N */
    @Nullable
    public zzsx f129121N;

    /* JADX INFO: renamed from: N0 */
    public boolean f129122N0;

    /* JADX INFO: renamed from: O */
    @Nullable
    public hwy0 f129123O;

    /* JADX INFO: renamed from: O0 */
    public long f129124O0;

    /* JADX INFO: renamed from: P */
    public int f129125P;

    /* JADX INFO: renamed from: P0 */
    public long f129126P0;

    /* JADX INFO: renamed from: Q */
    public boolean f129127Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f129128Q0;

    /* JADX INFO: renamed from: R */
    public boolean f129129R;

    /* JADX INFO: renamed from: R0 */
    public boolean f129130R0;

    /* JADX INFO: renamed from: S */
    public boolean f129131S;

    /* JADX INFO: renamed from: S0 */
    public boolean f129132S0;

    /* JADX INFO: renamed from: T */
    public boolean f129133T;

    /* JADX INFO: renamed from: T0 */
    public vwx0 f129134T0;

    /* JADX INFO: renamed from: U */
    public boolean f129135U;

    /* JADX INFO: renamed from: U0 */
    public jwy0 f129136U0;

    /* JADX INFO: renamed from: V */
    public boolean f129137V;

    /* JADX INFO: renamed from: V0 */
    public long f129138V0;

    /* JADX INFO: renamed from: W */
    public long f129139W;

    /* JADX INFO: renamed from: W0 */
    public boolean f129140W0;

    /* JADX INFO: renamed from: X */
    public int f129141X;

    /* JADX INFO: renamed from: X0 */
    @Nullable
    public juy0 f129142X0;

    /* JADX INFO: renamed from: Y */
    public int f129143Y;

    /* JADX INFO: renamed from: Y0 */
    @Nullable
    public juy0 f129144Y0;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public ByteBuffer f129145Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f129146k0;

    /* JADX INFO: renamed from: p0 */
    public boolean f129147p0;

    /* JADX INFO: renamed from: r */
    public final zvy0 f129148r;

    /* JADX INFO: renamed from: s */
    public final dxy0 f129149s;

    /* JADX INFO: renamed from: t */
    public final float f129150t;

    /* JADX INFO: renamed from: u */
    public final evx0 f129151u;

    /* JADX INFO: renamed from: v */
    public final evx0 f129152v;

    /* JADX INFO: renamed from: w */
    public final evx0 f129153w;

    /* JADX INFO: renamed from: x */
    public final tvy0 f129154x;

    /* JADX INFO: renamed from: y */
    public final MediaCodec.BufferInfo f129155y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque f129156z;

    public kwy0(int i, zvy0 zvy0Var, dxy0 dxy0Var, boolean z, float f) {
        super(i);
        this.f129148r = zvy0Var;
        dxy0Var.getClass();
        this.f129149s = dxy0Var;
        this.f129150t = f;
        this.f129151u = new evx0(0, 0);
        this.f129152v = new evx0(0, 0);
        this.f129153w = new evx0(2, 0);
        tvy0 tvy0Var = new tvy0();
        this.f129154x = tvy0Var;
        this.f129155y = new MediaCodec.BufferInfo();
        this.f129107G = 1.0f;
        this.f129105F = -9223372036854775807L;
        this.f129156z = new ArrayDeque();
        this.f129136U0 = jwy0.f122973e;
        tvy0Var.m122859i(0);
        tvy0Var.f96057d.order(ByteOrder.nativeOrder());
        this.f129099A = new qty0();
        this.f129117L = -1.0f;
        this.f129125P = 0;
        this.f129112I0 = 0;
        this.f129141X = -1;
        this.f129143Y = -1;
        this.f129139W = -9223372036854775807L;
        this.f129124O0 = -9223372036854775807L;
        this.f129126P0 = -9223372036854775807L;
        this.f129138V0 = -9223372036854775807L;
        this.f129114J0 = 0;
        this.f129116K0 = 0;
        this.f129134T0 = new vwx0();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m151746e0(sqr0 sqr0Var) {
        return sqr0Var.f170238F == 0;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m151747h0() {
        this.f129143Y = -1;
        this.f129145Z = null;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: j0 */
    private final void m151748j0() throws zziz {
        juy0 juy0Var = this.f129144Y0;
        juy0Var.getClass();
        this.f129142X0 = juy0Var;
        this.f129114J0 = 0;
        this.f129116K0 = 0;
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: A */
    public void mo134368A() {
        try {
            m151774t0();
            m151758W();
        } finally {
            this.f129144Y0 = null;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo134369A0(String str, xvy0 xvy0Var, long j, long j2);

    /* JADX INFO: renamed from: B0 */
    public abstract void mo134371B0(String str);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo134373C0(sqr0 sqr0Var, @Nullable MediaFormat mediaFormat) throws zziz;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // p153l.qwx0
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo151749D(sqr0[] sqr0VarArr, long j, long j2, kzy0 kzy0Var) throws zziz {
        if (this.f129136U0.f122976c == -9223372036854775807L) {
            m151766i0(new jwy0(-9223372036854775807L, j, j2));
            return;
        }
        if (this.f129156z.isEmpty()) {
            long j3 = this.f129124O0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f129138V0;
                if (j4 != -9223372036854775807L) {
                }
            }
            m151766i0(new jwy0(-9223372036854775807L, j, j2));
            if (this.f129136U0.f122976c != -9223372036854775807L) {
                mo134374E0();
                return;
            }
            return;
        }
        this.f129156z.add(new jwy0(this.f129124O0, j, j2));
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0333  */
    /* JADX WARN: Code duplicated, block: B:162:0x0348  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public final void m151750D0(hwy0 hwy0Var, @Nullable MediaCrypto mediaCrypto) throws Exception {
        bwy0 qxy0Var;
        int i;
        int i2;
        sqr0 sqr0Var = this.f129100B;
        sqr0Var.getClass();
        String str = hwy0Var.f111951a;
        int i3 = mpw0.f137957a;
        float fMo134386T = i3 < 23 ? -1.0f : mo134386T(this.f129107G, sqr0Var, m178541F());
        if (fMo134386T <= this.f129150t) {
            fMo134386T = -1.0f;
        }
        mo134388V(sqr0Var);
        m178547L();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        xvy0 xvy0VarMo134402v0 = mo134402v0(hwy0Var, sqr0Var, null, fMo134386T);
        if (i3 >= 31) {
            iwy0.m142396a(xvy0VarMo134402v0, m178550O());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            int i4 = 0;
            int i5 = 1;
            if (i3 < 23 || i3 < 31) {
                try {
                    String str2 = xvy0VarMo134402v0.f196444a.f111951a;
                    Trace.beginSection("createCodec:".concat(str2));
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        mediaCodecCreateByCodecName.configure(xvy0VarMo134402v0.f196445b, xvy0VarMo134402v0.f196447d, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        mediaCodecCreateByCodecName.start();
                        Trace.endSection();
                        qxy0Var = new qxy0(mediaCodecCreateByCodecName, null);
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        mediaCodec = mediaCodecCreateByCodecName;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
            } else {
                int iM96490b = a8t0.m96490b(xvy0VarMo134402v0.f196446c.f170251l);
                y4w0.m214277e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(mpw0.m159404b(iM96490b)));
                fvy0 fvy0Var = new fvy0(iM96490b);
                fvy0Var.m127749d(true);
                qxy0Var = fvy0Var.m127748c(xvy0VarMo134402v0);
            }
            this.f129109H = qxy0Var;
            Trace.endSection();
            m178547L();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (hwy0Var.m137549e(sqr0Var)) {
                i5 = 1;
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(sqr0Var.f170240a);
                sb.append(", mimeType=");
                sb.append(sqr0Var.f170251l);
                if (sqr0Var.f170250k != null) {
                    sb.append(", container=");
                    sb.append(sqr0Var.f170250k);
                }
                if (sqr0Var.f170247h != -1) {
                    sb.append(", bitrate=");
                    sb.append(sqr0Var.f170247h);
                }
                if (sqr0Var.f170248i != null) {
                    sb.append(", codecs=");
                    sb.append(sqr0Var.f170248i);
                }
                if (sqr0Var.f170254o != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (true) {
                        zzae zzaeVar = sqr0Var.f170254o;
                        i = 2;
                        if (i4 >= zzaeVar.zzb) {
                            break;
                        }
                        UUID uuid = zzaeVar.m13590a(i4).zza;
                        if (uuid.equals(cly0.f82439b)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(cly0.f82440c)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(cly0.f82442e)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(cly0.f82441d)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(cly0.f82438a)) {
                            linkedHashSet.add("universal");
                        } else {
                            linkedHashSet.add("unknown (" + uuid.toString() + ")");
                        }
                        i4++;
                    }
                    sb.append(", drm=[");
                    fow0.m126499b(sb, linkedHashSet, Constants.SEPARATOR_COMMA);
                    sb.append(']');
                } else {
                    i = 2;
                }
                if (sqr0Var.f170256q != -1 && sqr0Var.f170257r != -1) {
                    sb.append(", res=");
                    sb.append(sqr0Var.f170256q);
                    sb.append(BaseSei.f14624X);
                    sb.append(sqr0Var.f170257r);
                }
                wwy0 wwy0Var = sqr0Var.f170263x;
                if (wwy0Var != null && (wwy0Var.m208359e() || wwy0Var.m208360f())) {
                    sb.append(", color=");
                    sb.append(sqr0Var.f170263x.m208358d());
                }
                if (sqr0Var.f170258s != -1.0f) {
                    sb.append(", fps=");
                    sb.append(sqr0Var.f170258s);
                }
                if (sqr0Var.f170264y != -1) {
                    sb.append(", channels=");
                    sb.append(sqr0Var.f170264y);
                }
                if (sqr0Var.f170265z != -1) {
                    sb.append(", sample_rate=");
                    sb.append(sqr0Var.f170265z);
                }
                if (sqr0Var.f170242c != null) {
                    sb.append(", language=");
                    sb.append(sqr0Var.f170242c);
                }
                if (sqr0Var.f170241b != null) {
                    sb.append(", label=");
                    sb.append(sqr0Var.f170241b);
                }
                if (sqr0Var.f170243d != 0) {
                    sb.append(", selectionFlags=[");
                    int i6 = sqr0Var.f170243d;
                    ArrayList arrayList = new ArrayList();
                    if ((i6 & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((i6 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    fow0.m126499b(sb, arrayList, Constants.SEPARATOR_COMMA);
                    sb.append(Constants.AES_SUFFIX);
                }
                if (sqr0Var.f170244e != 0) {
                    sb.append(", roleFlags=[");
                    int i7 = sqr0Var.f170244e;
                    ArrayList arrayList2 = new ArrayList();
                    if ((i7 & 1) != 0) {
                        arrayList2.add(BLiveTraceServerLocation.main);
                    }
                    if ((i7 & 2) != 0) {
                        arrayList2.add("alt");
                    }
                    if ((i7 & 4) != 0) {
                        arrayList2.add("supplementary");
                    }
                    if ((i7 & 8) != 0) {
                        arrayList2.add("commentary");
                    }
                    if ((i7 & 16) != 0) {
                        arrayList2.add("dub");
                    }
                    if ((i7 & 32) != 0) {
                        arrayList2.add("emergency");
                    }
                    if ((i7 & 64) != 0) {
                        arrayList2.add("caption");
                    }
                    if ((i7 & 128) != 0) {
                        arrayList2.add("subtitle");
                    }
                    if ((i7 & 256) != 0) {
                        arrayList2.add("sign");
                    }
                    if ((i7 & 512) != 0) {
                        arrayList2.add("describes-video");
                    }
                    if ((i7 & 1024) != 0) {
                        arrayList2.add("describes-music");
                    }
                    if ((i7 & 2048) != 0) {
                        arrayList2.add("enhanced-intelligibility");
                    }
                    if ((i7 & 4096) != 0) {
                        arrayList2.add("transcribes-dialog");
                    }
                    if ((i7 & 8192) != 0) {
                        arrayList2.add("easy-read");
                    }
                    if ((i7 & 16384) != 0) {
                        arrayList2.add("trick-play");
                    }
                    fow0.m126499b(sb, arrayList2, Constants.SEPARATOR_COMMA);
                    sb.append(Constants.AES_SUFFIX);
                }
                y4w0.m214278f("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", sb.toString(), str));
            }
            this.f129123O = hwy0Var;
            this.f129117L = fMo134386T;
            this.f129111I = sqr0Var;
            int i8 = mpw0.f137957a;
            if (i8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str3 = mpw0.f137960d;
                if (str3.startsWith("SM-T585") || str3.startsWith("SM-A510") || str3.startsWith("SM-A520") || str3.startsWith("SM-J700")) {
                    i2 = i;
                } else if (i8 < 24) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if (i8 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i2 = 0;
            } else {
                String str4 = mpw0.f137958b;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i2 = i5;
                } else {
                    i2 = 0;
                }
            }
            this.f129125P = i2;
            this.f129111I.getClass();
            this.f129127Q = (i8 == 29 && "c2.android.aac.decoder".equals(str)) ? i5 : 0;
            this.f129129R = (i8 > 23 || !"OMX.google.vorbis.decoder".equals(str)) ? 0 : i5;
            this.f129131S = (i8 == 21 && "OMX.google.aac.decoder".equals(str)) ? i5 : 0;
            this.f129111I.getClass();
            String str5 = hwy0Var.f111951a;
            this.f129137V = ((i8 > 25 || !"OMX.rk.video_decoder.avc".equals(str5)) && (i8 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(mpw0.f137959c) && "AFTS".equals(mpw0.f137960d) && hwy0Var.f111956f)) ? 0 : i5;
            this.f129109H.getClass();
            if (mo178561s() == i) {
                m178547L();
                this.f129139W = SystemClock.elapsedRealtime() + 1000;
            }
            this.f129134T0.f186203a++;
            mo134369A0(str, xvy0VarMo134402v0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo134374E0();

    /* JADX INFO: renamed from: G0 */
    public abstract boolean mo134375G0(long j, long j2, @Nullable bwy0 bwy0Var, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, sqr0 sqr0Var) throws zziz;

    /* JADX INFO: renamed from: H0 */
    public boolean mo151752H0(sqr0 sqr0Var) {
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public int mo134376I0(evx0 evx0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: J0 */
    public final long m151753J0() {
        return this.f129136U0.f122976c;
    }

    /* JADX INFO: renamed from: K0 */
    public final long m151754K0() {
        return this.f129136U0.f122975b;
    }

    @Nullable
    /* JADX INFO: renamed from: L0 */
    public final bwy0 m151755L0() {
        return this.f129109H;
    }

    /* JADX INFO: renamed from: M0 */
    public zzst mo134377M0(Throwable th, @Nullable hwy0 hwy0Var) {
        return new zzst(th, hwy0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: N0 */
    public final hwy0 m151756N0() {
        return this.f129123O;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m151757O0() throws zziz {
        sqr0 sqr0Var;
        if (this.f129109H != null || this.f129104E0 || (sqr0Var = this.f129100B) == null) {
            return;
        }
        if (m151763c0(sqr0Var)) {
            sqr0 sqr0Var2 = this.f129100B;
            m151774t0();
            String str = sqr0Var2.f170251l;
            if ("audio/mp4a-latm".equals(str) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str) || "audio/opus".equals(str)) {
                this.f129154x.m192842o(32);
            } else {
                this.f129154x.m192842o(1);
            }
            this.f129104E0 = true;
            return;
        }
        juy0 juy0Var = this.f129144Y0;
        this.f129142X0 = juy0Var;
        if (juy0Var != null) {
            lev0.m153958f(true);
            juy0 juy0Var2 = this.f129142X0;
            this.f129100B.getClass();
            boolean z = zuy0.f206176a;
            juy0Var2.m147000a();
        }
        try {
            sqr0 sqr0Var3 = this.f129100B;
            if (sqr0Var3 == null) {
                throw null;
            }
            if (this.f129119M == null) {
                try {
                    List listMo134404w0 = mo134404w0(this.f129149s, sqr0Var3, false);
                    listMo134404w0.isEmpty();
                    this.f129119M = new ArrayDeque();
                    if (!listMo134404w0.isEmpty()) {
                        this.f129119M.add((hwy0) listMo134404w0.get(0));
                    }
                    this.f129121N = null;
                } catch (zzth e) {
                    throw new zzsx(sqr0Var3, (Throwable) e, false, -49998);
                }
            }
            if (this.f129119M.isEmpty()) {
                throw new zzsx(sqr0Var3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.f129119M;
            if (arrayDeque == null) {
                throw null;
            }
            hwy0 hwy0Var = (hwy0) arrayDeque.peekFirst();
            while (this.f129109H == null) {
                hwy0 hwy0Var2 = (hwy0) arrayDeque.peekFirst();
                if (hwy0Var2 == null) {
                    throw null;
                }
                if (!mo134394d0(hwy0Var2)) {
                    return;
                }
                try {
                    m151750D0(hwy0Var2, null);
                } catch (Exception e2) {
                    if (hwy0Var2 != hwy0Var) {
                        throw e2;
                    }
                    try {
                        y4w0.m214278f("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        m151750D0(hwy0Var2, null);
                    } catch (Exception e3) {
                        y4w0.m214279g("MediaCodecRenderer", "Failed to initialize decoder: ".concat(hwy0Var2.f111951a), e3);
                        arrayDeque.removeFirst();
                        zzsx zzsxVar = new zzsx(sqr0Var3, (Throwable) e3, false, hwy0Var2);
                        mo134408z0(zzsxVar);
                        zzsx zzsxVar2 = this.f129121N;
                        if (zzsxVar2 == null) {
                            this.f129121N = zzsxVar;
                        } else {
                            this.f129121N = zzsx.zza(zzsxVar2, zzsxVar);
                        }
                        if (arrayDeque.isEmpty()) {
                            throw this.f129121N;
                        }
                    }
                }
            }
            this.f129119M = null;
        } catch (zzsx e4) {
            throw m178548M(e4, this.f129100B, false, 4001);
        }
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: P */
    public void mo134378P() {
        this.f129100B = null;
        m151766i0(jwy0.f122973e);
        this.f129156z.clear();
        m151761a0();
    }

    @CallSuper
    /* JADX INFO: renamed from: P0 */
    public void mo134379P0(long j) {
        this.f129138V0 = j;
        while (!this.f129156z.isEmpty() && j >= ((jwy0) this.f129156z.peek()).f122974a) {
            jwy0 jwy0Var = (jwy0) this.f129156z.poll();
            jwy0Var.getClass();
            m151766i0(jwy0Var);
            mo134374E0();
        }
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: Q */
    public void mo134380Q(boolean z, boolean z2) throws zziz {
        this.f129134T0 = new vwx0();
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: S */
    public void mo134384S(long j, boolean z) throws zziz {
        this.f129128Q0 = false;
        this.f129130R0 = false;
        if (this.f129104E0) {
            this.f129154x.mo122858b();
            this.f129153w.mo122858b();
            this.f129106F0 = false;
            this.f129099A.m178081b();
        } else {
            m151760Z();
        }
        imw0 imw0Var = this.f129136U0.f122977d;
        if (imw0Var.m140992a() > 0) {
            this.f129132S0 = true;
        }
        imw0Var.m140996e();
        this.f129156z.clear();
    }

    /* JADX INFO: renamed from: T */
    public abstract float mo134386T(float f, sqr0 sqr0Var, sqr0[] sqr0VarArr);

    /* JADX INFO: renamed from: U */
    public abstract int mo134387U(dxy0 dxy0Var, sqr0 sqr0Var) throws zzth;

    /* JADX INFO: renamed from: W */
    public final void m151758W() {
        try {
            bwy0 bwy0Var = this.f129109H;
            if (bwy0Var != null) {
                bwy0Var.zzl();
                this.f129134T0.f186204b++;
                hwy0 hwy0Var = this.f129123O;
                if (hwy0Var == null) {
                    throw null;
                }
                mo134371B0(hwy0Var.f111951a);
            }
            this.f129109H = null;
            this.f129102D = null;
            this.f129142X0 = null;
            m151759Y();
        } catch (Throwable th) {
            this.f129109H = null;
            this.f129102D = null;
            this.f129142X0 = null;
            m151759Y();
            throw th;
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: X */
    public void mo134391X() {
        m151765g0();
        m151747h0();
        this.f129139W = -9223372036854775807L;
        this.f129120M0 = false;
        this.f129118L0 = false;
        this.f129133T = false;
        this.f129135U = false;
        this.f129146k0 = false;
        this.f129147p0 = false;
        this.f129124O0 = -9223372036854775807L;
        this.f129126P0 = -9223372036854775807L;
        this.f129138V0 = -9223372036854775807L;
        this.f129114J0 = 0;
        this.f129116K0 = 0;
        this.f129112I0 = this.f129110H0 ? 1 : 0;
    }

    @CallSuper
    /* JADX INFO: renamed from: Y */
    public final void m151759Y() {
        mo134391X();
        this.f129119M = null;
        this.f129123O = null;
        this.f129111I = null;
        this.f129113J = null;
        this.f129115K = false;
        this.f129122N0 = false;
        this.f129117L = -1.0f;
        this.f129125P = 0;
        this.f129127Q = false;
        this.f129129R = false;
        this.f129131S = false;
        this.f129137V = false;
        this.f129110H0 = false;
        this.f129112I0 = 0;
        this.f129103E = false;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m151760Z() throws zziz {
        boolean zM151761a0 = m151761a0();
        if (zM151761a0) {
            m151757O0();
        }
        return zM151761a0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m151761a0() {
        if (this.f129109H == null) {
            return false;
        }
        int i = this.f129116K0;
        if (i == 3 || ((this.f129127Q && !this.f129122N0) || (this.f129129R && this.f129120M0))) {
            m151758W();
            return true;
        }
        if (i == 2) {
            int i2 = mpw0.f137957a;
            lev0.m153958f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m151748j0();
                } catch (zziz e) {
                    y4w0.m214279g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m151758W();
                    return true;
                }
            }
        }
        m151776x0();
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m151762b0() {
        return this.f129104E0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m151763c0(sqr0 sqr0Var) {
        return this.f129144Y0 == null && mo151752H0(sqr0Var);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean mo134394d0(hwy0 hwy0Var) {
        return true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: f0 */
    public final void m151764f0() throws zziz {
        int i = this.f129116K0;
        if (i == 1) {
            m151776x0();
            return;
        }
        if (i == 2) {
            m151776x0();
            m151748j0();
        } else if (i != 3) {
            this.f129130R0 = true;
            mo151751F0();
        } else {
            m151758W();
            m151757O0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m151765g0() {
        this.f129141X = -1;
        this.f129152v.f96057d = null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m151766i0(jwy0 jwy0Var) {
        this.f129136U0 = jwy0Var;
        if (jwy0Var.f122976c != -9223372036854775807L) {
            this.f129140W0 = true;
        }
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: k0 */
    public final boolean m151767k0() throws zziz {
        if (this.f129118L0) {
            this.f129114J0 = 1;
            if (this.f129129R) {
                this.f129116K0 = 3;
                return false;
            }
            this.f129116K0 = 2;
        } else {
            m151748j0();
        }
        return true;
    }

    @Override // p153l.afy0
    /* JADX INFO: renamed from: l */
    public final int mo97572l(sqr0 sqr0Var) throws zziz {
        try {
            return mo134387U(this.f129149s, sqr0Var);
        } catch (zzth e) {
            throw m178548M(e, sqr0Var, false, 4002);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m151768l0() throws zziz {
        bwy0 bwy0Var = this.f129109H;
        if (bwy0Var == null || this.f129114J0 == 2 || this.f129128Q0) {
            return false;
        }
        if (this.f129141X < 0) {
            int iZza = bwy0Var.zza();
            this.f129141X = iZza;
            if (iZza < 0) {
                return false;
            }
            this.f129152v.f96057d = bwy0Var.zzf(iZza);
            this.f129152v.mo122858b();
        }
        if (this.f129114J0 == 1) {
            if (!this.f129137V) {
                this.f129120M0 = true;
                bwy0Var.mo106814a(this.f129141X, 0, 0, 0L, 4);
                m151765g0();
            }
            this.f129114J0 = 2;
            return false;
        }
        if (this.f129133T) {
            this.f129133T = false;
            ByteBuffer byteBuffer = this.f129152v.f96057d;
            byteBuffer.getClass();
            byteBuffer.put(f129098Z0);
            bwy0Var.mo106814a(this.f129141X, 0, 38, 0L, 0);
            m151765g0();
            this.f129118L0 = true;
            return true;
        }
        if (this.f129112I0 == 1) {
            int i = 0;
            while (true) {
                sqr0 sqr0Var = this.f129111I;
                sqr0Var.getClass();
                if (i >= sqr0Var.f170253n.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f129111I.f170253n.get(i);
                ByteBuffer byteBuffer2 = this.f129152v.f96057d;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i++;
            }
            this.f129112I0 = 2;
        }
        ByteBuffer byteBuffer3 = this.f129152v.f96057d;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        l9y0 l9y0VarM178544I = m178544I();
        try {
            int iM178543H = m178543H(l9y0VarM178544I, this.f129152v, 0);
            if (iM178543H == -3) {
                if (mo178555h()) {
                    this.f129126P0 = this.f129124O0;
                }
                return false;
            }
            if (iM178543H == -5) {
                if (this.f129112I0 == 2) {
                    this.f129152v.mo122858b();
                    this.f129112I0 = 1;
                }
                mo134401s0(l9y0VarM178544I);
                return true;
            }
            evx0 evx0Var = this.f129152v;
            if (evx0Var.m127554f()) {
                this.f129126P0 = this.f129124O0;
                if (this.f129112I0 == 2) {
                    evx0Var.mo122858b();
                    this.f129112I0 = 1;
                }
                this.f129128Q0 = true;
                if (!this.f129118L0) {
                    m151764f0();
                    return false;
                }
                try {
                    if (!this.f129137V) {
                        this.f129120M0 = true;
                        bwy0Var.mo106814a(this.f129141X, 0, 0, 0L, 4);
                        m151765g0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m178548M(e, this.f129100B, false, mpw0.m159426x(e.getErrorCode()));
                }
            }
            if (!this.f129118L0 && !evx0Var.m127555g()) {
                evx0Var.mo122858b();
                if (this.f129112I0 == 2) {
                    this.f129112I0 = 1;
                }
                return true;
            }
            boolean zM122861k = evx0Var.m122861k();
            if (zM122861k) {
                evx0Var.f96056c.m192764b(iPosition);
            }
            long j = this.f129152v.f96059f;
            if (this.f129132S0) {
                if (this.f129156z.isEmpty()) {
                    imw0 imw0Var = this.f129136U0.f122977d;
                    sqr0 sqr0Var2 = this.f129100B;
                    sqr0Var2.getClass();
                    imw0Var.m140995d(j, sqr0Var2);
                } else {
                    imw0 imw0Var2 = ((jwy0) this.f129156z.peekLast()).f122977d;
                    sqr0 sqr0Var3 = this.f129100B;
                    sqr0Var3.getClass();
                    imw0Var2.m140995d(j, sqr0Var3);
                }
                this.f129132S0 = false;
            }
            long jMax = Math.max(this.f129124O0, j);
            this.f129124O0 = jMax;
            if (mo178555h() || this.f129152v.m127556h()) {
                this.f129126P0 = jMax;
            }
            this.f129152v.m122860j();
            evx0 evx0Var2 = this.f129152v;
            if (evx0Var2.m127553e()) {
                mo134406y0(evx0Var2);
            }
            mo134381Q0(this.f129152v);
            mo134376I0(this.f129152v);
            int i2 = this.f129141X;
            try {
                if (zM122861k) {
                    bwy0Var.mo106816c(i2, 0, this.f129152v.f96056c, j, 0);
                } else {
                    ByteBuffer byteBuffer4 = this.f129152v.f96057d;
                    if (byteBuffer4 == null) {
                        throw null;
                    }
                    bwy0Var.mo106814a(i2, 0, byteBuffer4.limit(), j, 0);
                }
                m151765g0();
                this.f129118L0 = true;
                this.f129112I0 = 0;
                this.f129134T0.f186205c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw m178548M(e2, this.f129100B, false, mpw0.m159426x(e2.getErrorCode()));
            }
        } catch (zzig e3) {
            mo134408z0(e3);
            m151771o0(0);
            m151776x0();
            return true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m151769m0() {
        return this.f129143Y >= 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m151770n0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        sqr0 sqr0Var = this.f129101C;
        return (sqr0Var != null && Objects.equals(sqr0Var.f170251l, "audio/opus") && xfr0.m210820f(j, j2)) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m151771o0(int i) throws zziz {
        evx0 evx0Var = this.f129151u;
        l9y0 l9y0VarM178544I = m178544I();
        evx0Var.mo122858b();
        int iM178543H = m178543H(l9y0VarM178544I, this.f129151u, i | 4);
        if (iM178543H == -5) {
            mo134401s0(l9y0VarM178544I);
            return true;
        }
        if (iM178543H != -4 || !this.f129151u.m127554f()) {
            return false;
        }
        this.f129128Q0 = true;
        m151764f0();
        return false;
    }

    @Override // p153l.qwx0, p153l.vey0
    /* JADX INFO: renamed from: p */
    public void mo134398p(float f, float f2) throws zziz {
        this.f129107G = f2;
        m151773q0(this.f129111I);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m151772p0(long j) {
        if (this.f129105F == -9223372036854775807L) {
            return true;
        }
        m178547L();
        return SystemClock.elapsedRealtime() - j < this.f129105F;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m151773q0(@Nullable sqr0 sqr0Var) throws zziz {
        if (mpw0.f137957a >= 23 && this.f129109H != null && this.f129116K0 != 3 && mo178561s() != 0) {
            float f = this.f129107G;
            sqr0Var.getClass();
            float fMo134386T = mo134386T(f, sqr0Var, m178541F());
            float f2 = this.f129117L;
            if (f2 != fMo134386T) {
                if (fMo134386T == -1.0f) {
                    m151775u0();
                    return false;
                }
                if (f2 != -1.0f || fMo134386T > this.f129150t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo134386T);
                    bwy0 bwy0Var = this.f129109H;
                    bwy0Var.getClass();
                    bwy0Var.mo106813F(bundle);
                    this.f129117L = fMo134386T;
                }
            }
        }
        return true;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: r */
    public boolean mo134399r() {
        if (this.f129100B == null) {
            return false;
        }
        if (m178540E() || m151769m0()) {
            return true;
        }
        if (this.f129139W == -9223372036854775807L) {
            return false;
        }
        m178547L();
        return SystemClock.elapsedRealtime() < this.f129139W;
    }

    /* JADX INFO: renamed from: r0 */
    public abstract zwx0 mo134400r0(hwy0 hwy0Var, sqr0 sqr0Var, sqr0 sqr0Var2);

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    @Nullable
    @CallSuper
    /* JADX INFO: renamed from: s0 */
    public zwx0 mo134401s0(l9y0 l9y0Var) throws zziz {
        boolean z = true;
        this.f129132S0 = true;
        sqr0 sqr0Var = l9y0Var.f130645a;
        sqr0Var.getClass();
        int i = 0;
        if (sqr0Var.f170251l == null) {
            throw m178548M(new IllegalArgumentException("Sample MIME type is null."), sqr0Var, false, 4005);
        }
        this.f129144Y0 = l9y0Var.f130646b;
        this.f129100B = sqr0Var;
        if (this.f129104E0) {
            this.f129108G0 = true;
            return null;
        }
        bwy0 bwy0Var = this.f129109H;
        if (bwy0Var == null) {
            this.f129119M = null;
            m151757O0();
            return null;
        }
        hwy0 hwy0Var = this.f129123O;
        hwy0Var.getClass();
        sqr0 sqr0Var2 = this.f129111I;
        sqr0Var2.getClass();
        juy0 juy0Var = this.f129142X0;
        juy0 juy0Var2 = this.f129144Y0;
        if (juy0Var != juy0Var2) {
            m151775u0();
            return new zwx0(hwy0Var.f111951a, sqr0Var2, sqr0Var, 0, 128);
        }
        boolean z2 = juy0Var2 != juy0Var;
        lev0.m153958f(!z2 || mpw0.f137957a >= 23);
        zwx0 zwx0VarMo134400r0 = mo134400r0(hwy0Var, sqr0Var2, sqr0Var);
        int i2 = zwx0VarMo134400r0.f206397d;
        if (i2 == 0) {
            m151775u0();
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (m151773q0(sqr0Var)) {
                    this.f129111I = sqr0Var;
                    if (z2 && !m151767k0()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (m151773q0(sqr0Var)) {
                this.f129110H0 = true;
                this.f129112I0 = 1;
                int i3 = this.f129125P;
                if (i3 != 2 && (i3 != 1 || sqr0Var.f170256q != sqr0Var2.f170256q || sqr0Var.f170257r != sqr0Var2.f170257r)) {
                    z = false;
                }
                this.f129133T = z;
                this.f129111I = sqr0Var;
                if (z2 && !m151767k0()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
        } else if (m151773q0(sqr0Var)) {
            this.f129111I = sqr0Var;
            if (z2) {
                if (!m151767k0()) {
                    i = 2;
                }
            } else if (this.f129118L0) {
                this.f129114J0 = 1;
                if (this.f129129R) {
                    this.f129116K0 = 3;
                    i = 2;
                } else {
                    this.f129116K0 = 1;
                }
            }
        } else {
            i = 16;
        }
        if (zwx0VarMo134400r0.f206397d == 0 || (this.f129109H == bwy0Var && this.f129116K0 != 3)) {
            return zwx0VarMo134400r0;
        }
        return new zwx0(hwy0Var.f111951a, sqr0Var2, sqr0Var, 0, i);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m151774t0() {
        this.f129108G0 = false;
        this.f129154x.mo122858b();
        this.f129153w.mo122858b();
        this.f129106F0 = false;
        this.f129104E0 = false;
        this.f129099A.m178081b();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m151775u0() throws zziz {
        if (this.f129118L0) {
            this.f129114J0 = 1;
            this.f129116K0 = 3;
        } else {
            m151758W();
            m151757O0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public abstract xvy0 mo134402v0(hwy0 hwy0Var, sqr0 sqr0Var, @Nullable MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // p153l.vey0
    /* JADX INFO: renamed from: w */
    public void mo134403w(long r21, long r23) throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.kwy0.mo134403w(long, long):void");
    }

    /* JADX INFO: renamed from: w0 */
    public abstract List mo134404w0(dxy0 dxy0Var, sqr0 sqr0Var, boolean z) throws zzth;

    /* JADX INFO: renamed from: x0 */
    public final void m151776x0() {
        try {
            bwy0 bwy0Var = this.f129109H;
            lev0.m153954b(bwy0Var);
            bwy0Var.zzi();
        } finally {
            mo134391X();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public abstract void mo134406y0(evx0 evx0Var) throws zziz;

    /* JADX INFO: renamed from: z0 */
    public abstract void mo134408z0(Exception exc);

    @Override // p153l.vey0
    public boolean zzV() {
        return this.f129130R0;
    }

    @Override // p153l.qwx0, p153l.afy0
    public final int zze() {
        return 8;
    }

    /* JADX INFO: renamed from: F0 */
    public void mo151751F0() throws zziz {
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo134381Q0(evx0 evx0Var) throws zziz {
    }

    /* JADX INFO: renamed from: V */
    public void mo134388V(sqr0 sqr0Var) throws zziz {
    }
}
