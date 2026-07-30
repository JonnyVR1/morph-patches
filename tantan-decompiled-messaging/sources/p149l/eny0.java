package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
public abstract class eny0 extends knx0 {

    /* JADX INFO: renamed from: Z0 */
    public static final byte[] f92343Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, HttpTokens.SPACE, 0, 0, 1, 101, -120, -124, HttpTokens.CARRIAGE_RETURN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A */
    public final kky0 f92344A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public mhr0 f92345B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public mhr0 f92346C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public MediaCrypto f92347D;

    /* JADX INFO: renamed from: E */
    public boolean f92348E;

    /* JADX INFO: renamed from: E0 */
    public boolean f92349E0;

    /* JADX INFO: renamed from: F */
    public long f92350F;

    /* JADX INFO: renamed from: F0 */
    public boolean f92351F0;

    /* JADX INFO: renamed from: G */
    public float f92352G;

    /* JADX INFO: renamed from: G0 */
    public boolean f92353G0;

    /* JADX INFO: renamed from: H */
    @Nullable
    public vmy0 f92354H;

    /* JADX INFO: renamed from: H0 */
    public boolean f92355H0;

    /* JADX INFO: renamed from: I */
    @Nullable
    public mhr0 f92356I;

    /* JADX INFO: renamed from: I0 */
    public int f92357I0;

    /* JADX INFO: renamed from: J */
    @Nullable
    public MediaFormat f92358J;

    /* JADX INFO: renamed from: J0 */
    public int f92359J0;

    /* JADX INFO: renamed from: K */
    public boolean f92360K;

    /* JADX INFO: renamed from: K0 */
    public int f92361K0;

    /* JADX INFO: renamed from: L */
    public float f92362L;

    /* JADX INFO: renamed from: L0 */
    public boolean f92363L0;

    /* JADX INFO: renamed from: M */
    @Nullable
    public ArrayDeque f92364M;

    /* JADX INFO: renamed from: M0 */
    public boolean f92365M0;

    /* JADX INFO: renamed from: N */
    @Nullable
    public zzsx f92366N;

    /* JADX INFO: renamed from: N0 */
    public boolean f92367N0;

    /* JADX INFO: renamed from: O */
    @Nullable
    public bny0 f92368O;

    /* JADX INFO: renamed from: O0 */
    public long f92369O0;

    /* JADX INFO: renamed from: P */
    public int f92370P;

    /* JADX INFO: renamed from: P0 */
    public long f92371P0;

    /* JADX INFO: renamed from: Q */
    public boolean f92372Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f92373Q0;

    /* JADX INFO: renamed from: R */
    public boolean f92374R;

    /* JADX INFO: renamed from: R0 */
    public boolean f92375R0;

    /* JADX INFO: renamed from: S */
    public boolean f92376S;

    /* JADX INFO: renamed from: S0 */
    public boolean f92377S0;

    /* JADX INFO: renamed from: T */
    public boolean f92378T;

    /* JADX INFO: renamed from: T0 */
    public pnx0 f92379T0;

    /* JADX INFO: renamed from: U */
    public boolean f92380U;

    /* JADX INFO: renamed from: U0 */
    public dny0 f92381U0;

    /* JADX INFO: renamed from: V */
    public boolean f92382V;

    /* JADX INFO: renamed from: V0 */
    public long f92383V0;

    /* JADX INFO: renamed from: W */
    public long f92384W;

    /* JADX INFO: renamed from: W0 */
    public boolean f92385W0;

    /* JADX INFO: renamed from: X */
    public int f92386X;

    /* JADX INFO: renamed from: X0 */
    @Nullable
    public dly0 f92387X0;

    /* JADX INFO: renamed from: Y */
    public int f92388Y;

    /* JADX INFO: renamed from: Y0 */
    @Nullable
    public dly0 f92389Y0;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public ByteBuffer f92390Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f92391k0;

    /* JADX INFO: renamed from: p0 */
    public boolean f92392p0;

    /* JADX INFO: renamed from: r */
    public final tmy0 f92393r;

    /* JADX INFO: renamed from: s */
    public final xny0 f92394s;

    /* JADX INFO: renamed from: t */
    public final float f92395t;

    /* JADX INFO: renamed from: u */
    public final ylx0 f92396u;

    /* JADX INFO: renamed from: v */
    public final ylx0 f92397v;

    /* JADX INFO: renamed from: w */
    public final ylx0 f92398w;

    /* JADX INFO: renamed from: x */
    public final nmy0 f92399x;

    /* JADX INFO: renamed from: y */
    public final MediaCodec.BufferInfo f92400y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque f92401z;

    public eny0(int i, tmy0 tmy0Var, xny0 xny0Var, boolean z, float f) {
        super(i);
        this.f92393r = tmy0Var;
        xny0Var.getClass();
        this.f92394s = xny0Var;
        this.f92395t = f;
        this.f92396u = new ylx0(0, 0);
        this.f92397v = new ylx0(0, 0);
        this.f92398w = new ylx0(2, 0);
        nmy0 nmy0Var = new nmy0();
        this.f92399x = nmy0Var;
        this.f92400y = new MediaCodec.BufferInfo();
        this.f92352G = 1.0f;
        this.f92350F = -9223372036854775807L;
        this.f92401z = new ArrayDeque();
        this.f92381U0 = dny0.f87113e;
        nmy0Var.m215311i(0);
        nmy0Var.f198945d.order(ByteOrder.nativeOrder());
        this.f92344A = new kky0();
        this.f92362L = -1.0f;
        this.f92370P = 0;
        this.f92357I0 = 0;
        this.f92386X = -1;
        this.f92388Y = -1;
        this.f92384W = -9223372036854775807L;
        this.f92369O0 = -9223372036854775807L;
        this.f92371P0 = -9223372036854775807L;
        this.f92383V0 = -9223372036854775807L;
        this.f92359J0 = 0;
        this.f92361K0 = 0;
        this.f92379T0 = new pnx0();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m117300e0(mhr0 mhr0Var) {
        return mhr0Var.f133879F == 0;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m117301h0() {
        this.f92388Y = -1;
        this.f92390Z = null;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: j0 */
    private final void m117302j0() throws zziz {
        dly0 dly0Var = this.f92389Y0;
        dly0Var.getClass();
        this.f92387X0 = dly0Var;
        this.f92359J0 = 0;
        this.f92361K0 = 0;
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: A */
    public void mo99978A() {
        try {
            m117329t0();
            m117312W();
        } finally {
            this.f92389Y0 = null;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo99979A0(String str, rmy0 rmy0Var, long j, long j2);

    /* JADX INFO: renamed from: B0 */
    public abstract void mo99981B0(String str);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo99983C0(mhr0 mhr0Var, @Nullable MediaFormat mediaFormat) throws zziz;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // p149l.knx0
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo117303D(p149l.mhr0[] r13, long r14, long r16, p149l.eqy0 r18) throws com.google.android.gms.internal.ads.zziz {
        /*
            r12 = this;
            l.dny0 r13 = r12.f92381U0
            long r0 = r13.f87116c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            l.dny0 r4 = new l.dny0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.m117320i0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f92401z
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f92369O0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.f92383V0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            l.dny0 r5 = new l.dny0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m117320i0(r5)
            l.dny0 r13 = r12.f92381U0
            long r13 = r13.f87116c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.mo99984E0()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.f92401z
            l.dny0 r5 = new l.dny0
            long r6 = r12.f92369O0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.eny0.mo117303D(l.mhr0[], long, long, l.eqy0):void");
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0333  */
    /* JADX WARN: Code duplicated, block: B:162:0x0348  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public final void m117304D0(bny0 bny0Var, @Nullable MediaCrypto mediaCrypto) throws Exception {
        vmy0 koy0Var;
        int i;
        int i2;
        mhr0 mhr0Var = this.f92345B;
        mhr0Var.getClass();
        String str = bny0Var.f76460a;
        int i3 = ggw0.f102568a;
        float fMo99996T = i3 < 23 ? -1.0f : mo99996T(this.f92352G, mhr0Var, m146594F());
        if (fMo99996T <= this.f92395t) {
            fMo99996T = -1.0f;
        }
        mo99998V(mhr0Var);
        m146600L();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        rmy0 rmy0VarMo100013v0 = mo100013v0(bny0Var, mhr0Var, null, fMo99996T);
        if (i3 >= 31) {
            cny0.m107837a(rmy0VarMo100013v0, m146603O());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            int i4 = 0;
            int i5 = 1;
            if (i3 < 23 || i3 < 31) {
                try {
                    String str2 = rmy0VarMo100013v0.f160222a.f76460a;
                    Trace.beginSection("createCodec:".concat(str2));
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        mediaCodecCreateByCodecName.configure(rmy0VarMo100013v0.f160223b, rmy0VarMo100013v0.f160225d, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        mediaCodecCreateByCodecName.start();
                        Trace.endSection();
                        koy0Var = new koy0(mediaCodecCreateByCodecName, null);
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
                int iM196365b = uys0.m196365b(rmy0VarMo100013v0.f160224c.f133892l);
                svv0.m186110e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(ggw0.m126060b(iM196365b)));
                zly0 zly0Var = new zly0(iM196365b);
                zly0Var.m219301d(true);
                koy0Var = zly0Var.m219300c(rmy0VarMo100013v0);
            }
            this.f92354H = koy0Var;
            Trace.endSection();
            m146600L();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (bny0Var.m102881e(mhr0Var)) {
                i5 = 1;
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(mhr0Var.f133881a);
                sb.append(", mimeType=");
                sb.append(mhr0Var.f133892l);
                if (mhr0Var.f133891k != null) {
                    sb.append(", container=");
                    sb.append(mhr0Var.f133891k);
                }
                if (mhr0Var.f133888h != -1) {
                    sb.append(", bitrate=");
                    sb.append(mhr0Var.f133888h);
                }
                if (mhr0Var.f133889i != null) {
                    sb.append(", codecs=");
                    sb.append(mhr0Var.f133889i);
                }
                if (mhr0Var.f133895o != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (true) {
                        zzae zzaeVar = mhr0Var.f133895o;
                        i = 2;
                        if (i4 >= zzaeVar.zzb) {
                            break;
                        }
                        UUID uuid = zzaeVar.m13536a(i4).zza;
                        if (uuid.equals(wby0.f185631b)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(wby0.f185632c)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(wby0.f185634e)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(wby0.f185633d)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(wby0.f185630a)) {
                            linkedHashSet.add("universal");
                        } else {
                            linkedHashSet.add("unknown (" + uuid.toString() + ")");
                        }
                        i4++;
                    }
                    sb.append(", drm=[");
                    zew0.m218428b(sb, linkedHashSet, Constants.SEPARATOR_COMMA);
                    sb.append(']');
                } else {
                    i = 2;
                }
                if (mhr0Var.f133897q != -1 && mhr0Var.f133898r != -1) {
                    sb.append(", res=");
                    sb.append(mhr0Var.f133897q);
                    sb.append(BaseSei.f13930X);
                    sb.append(mhr0Var.f133898r);
                }
                qny0 qny0Var = mhr0Var.f133904x;
                if (qny0Var != null && (qny0Var.m175714e() || qny0Var.m175715f())) {
                    sb.append(", color=");
                    sb.append(mhr0Var.f133904x.m175713d());
                }
                if (mhr0Var.f133899s != -1.0f) {
                    sb.append(", fps=");
                    sb.append(mhr0Var.f133899s);
                }
                if (mhr0Var.f133905y != -1) {
                    sb.append(", channels=");
                    sb.append(mhr0Var.f133905y);
                }
                if (mhr0Var.f133906z != -1) {
                    sb.append(", sample_rate=");
                    sb.append(mhr0Var.f133906z);
                }
                if (mhr0Var.f133883c != null) {
                    sb.append(", language=");
                    sb.append(mhr0Var.f133883c);
                }
                if (mhr0Var.f133882b != null) {
                    sb.append(", label=");
                    sb.append(mhr0Var.f133882b);
                }
                if (mhr0Var.f133884d != 0) {
                    sb.append(", selectionFlags=[");
                    int i6 = mhr0Var.f133884d;
                    ArrayList arrayList = new ArrayList();
                    if ((i6 & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((i6 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    zew0.m218428b(sb, arrayList, Constants.SEPARATOR_COMMA);
                    sb.append(Constants.AES_SUFFIX);
                }
                if (mhr0Var.f133885e != 0) {
                    sb.append(", roleFlags=[");
                    int i7 = mhr0Var.f133885e;
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
                    zew0.m218428b(sb, arrayList2, Constants.SEPARATOR_COMMA);
                    sb.append(Constants.AES_SUFFIX);
                }
                svv0.m186111f("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", sb.toString(), str));
            }
            this.f92368O = bny0Var;
            this.f92362L = fMo99996T;
            this.f92356I = mhr0Var;
            int i8 = ggw0.f102568a;
            if (i8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str3 = ggw0.f102571d;
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
                String str4 = ggw0.f102569b;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i2 = i5;
                } else {
                    i2 = 0;
                }
            }
            this.f92370P = i2;
            this.f92356I.getClass();
            this.f92372Q = (i8 == 29 && "c2.android.aac.decoder".equals(str)) ? i5 : 0;
            this.f92374R = (i8 > 23 || !"OMX.google.vorbis.decoder".equals(str)) ? 0 : i5;
            this.f92376S = (i8 == 21 && "OMX.google.aac.decoder".equals(str)) ? i5 : 0;
            this.f92356I.getClass();
            String str5 = bny0Var.f76460a;
            this.f92382V = ((i8 > 25 || !"OMX.rk.video_decoder.avc".equals(str5)) && (i8 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(ggw0.f102570c) && "AFTS".equals(ggw0.f102571d) && bny0Var.f76465f)) ? 0 : i5;
            this.f92354H.getClass();
            if (mo146615s() == i) {
                m146600L();
                this.f92384W = SystemClock.elapsedRealtime() + 1000;
            }
            this.f92379T0.f150417a++;
            mo99979A0(str, rmy0VarMo100013v0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo99984E0();

    /* JADX INFO: renamed from: G0 */
    public abstract boolean mo99985G0(long j, long j2, @Nullable vmy0 vmy0Var, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, mhr0 mhr0Var) throws zziz;

    /* JADX INFO: renamed from: H0 */
    public boolean mo117306H0(mhr0 mhr0Var) {
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public int mo99986I0(ylx0 ylx0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: J0 */
    public final long m117307J0() {
        return this.f92381U0.f87116c;
    }

    /* JADX INFO: renamed from: K0 */
    public final long m117308K0() {
        return this.f92381U0.f87115b;
    }

    @Nullable
    /* JADX INFO: renamed from: L0 */
    public final vmy0 m117309L0() {
        return this.f92354H;
    }

    /* JADX INFO: renamed from: M0 */
    public zzst mo99987M0(Throwable th, @Nullable bny0 bny0Var) {
        return new zzst(th, bny0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: N0 */
    public final bny0 m117310N0() {
        return this.f92368O;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m117311O0() throws zziz {
        mhr0 mhr0Var;
        if (this.f92354H != null || this.f92349E0 || (mhr0Var = this.f92345B) == null) {
            return;
        }
        if (m117317c0(mhr0Var)) {
            mhr0 mhr0Var2 = this.f92345B;
            m117329t0();
            String str = mhr0Var2.f133892l;
            if ("audio/mp4a-latm".equals(str) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str) || "audio/opus".equals(str)) {
                this.f92399x.m160164o(32);
            } else {
                this.f92399x.m160164o(1);
            }
            this.f92349E0 = true;
            return;
        }
        dly0 dly0Var = this.f92389Y0;
        this.f92387X0 = dly0Var;
        if (dly0Var != null) {
            f5v0.m119535f(true);
            dly0 dly0Var2 = this.f92387X0;
            this.f92345B.getClass();
            boolean z = tly0.f171118a;
            dly0Var2.m112427a();
        }
        try {
            mhr0 mhr0Var3 = this.f92345B;
            if (mhr0Var3 == null) {
                throw null;
            }
            if (this.f92364M == null) {
                try {
                    List listMo100015w0 = mo100015w0(this.f92394s, mhr0Var3, false);
                    listMo100015w0.isEmpty();
                    this.f92364M = new ArrayDeque();
                    if (!listMo100015w0.isEmpty()) {
                        this.f92364M.add((bny0) listMo100015w0.get(0));
                    }
                    this.f92366N = null;
                } catch (zzth e) {
                    throw new zzsx(mhr0Var3, (Throwable) e, false, -49998);
                }
            }
            if (this.f92364M.isEmpty()) {
                throw new zzsx(mhr0Var3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.f92364M;
            if (arrayDeque == null) {
                throw null;
            }
            bny0 bny0Var = (bny0) arrayDeque.peekFirst();
            while (this.f92354H == null) {
                bny0 bny0Var2 = (bny0) arrayDeque.peekFirst();
                if (bny0Var2 == null) {
                    throw null;
                }
                if (!mo100004d0(bny0Var2)) {
                    return;
                }
                try {
                    m117304D0(bny0Var2, null);
                } catch (Exception e2) {
                    if (bny0Var2 != bny0Var) {
                        throw e2;
                    }
                    try {
                        svv0.m186111f("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        m117304D0(bny0Var2, null);
                    } catch (Exception e3) {
                        svv0.m186112g("MediaCodecRenderer", "Failed to initialize decoder: ".concat(bny0Var2.f76460a), e3);
                        arrayDeque.removeFirst();
                        zzsx zzsxVar = new zzsx(mhr0Var3, (Throwable) e3, false, bny0Var2);
                        mo100019z0(zzsxVar);
                        zzsx zzsxVar2 = this.f92366N;
                        if (zzsxVar2 == null) {
                            this.f92366N = zzsxVar;
                        } else {
                            this.f92366N = zzsx.zza(zzsxVar2, zzsxVar);
                        }
                        if (arrayDeque.isEmpty()) {
                            throw this.f92366N;
                        }
                    }
                }
            }
            this.f92364M = null;
        } catch (zzsx e4) {
            throw m146601M(e4, this.f92345B, false, 4001);
        }
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: P */
    public void mo99988P() {
        this.f92345B = null;
        m117320i0(dny0.f87113e);
        this.f92401z.clear();
        m117315a0();
    }

    @CallSuper
    /* JADX INFO: renamed from: P0 */
    public void mo99989P0(long j) {
        this.f92383V0 = j;
        while (!this.f92401z.isEmpty() && j >= ((dny0) this.f92401z.peek()).f87114a) {
            dny0 dny0Var = (dny0) this.f92401z.poll();
            dny0Var.getClass();
            m117320i0(dny0Var);
            mo99984E0();
        }
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: Q */
    public void mo99990Q(boolean z, boolean z2) throws zziz {
        this.f92379T0 = new pnx0();
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: S */
    public void mo99994S(long j, boolean z) throws zziz {
        this.f92373Q0 = false;
        this.f92375R0 = false;
        if (this.f92349E0) {
            this.f92399x.mo160161b();
            this.f92398w.mo160161b();
            this.f92351F0 = false;
            this.f92344A.m146361b();
        } else {
            m117314Z();
        }
        cdw0 cdw0Var = this.f92381U0.f87117d;
        if (cdw0Var.m106296a() > 0) {
            this.f92377S0 = true;
        }
        cdw0Var.m106300e();
        this.f92401z.clear();
    }

    /* JADX INFO: renamed from: T */
    public abstract float mo99996T(float f, mhr0 mhr0Var, mhr0[] mhr0VarArr);

    /* JADX INFO: renamed from: U */
    public abstract int mo99997U(xny0 xny0Var, mhr0 mhr0Var) throws zzth;

    /* JADX INFO: renamed from: W */
    public final void m117312W() {
        try {
            vmy0 vmy0Var = this.f92354H;
            if (vmy0Var != null) {
                vmy0Var.zzl();
                this.f92379T0.f150418b++;
                bny0 bny0Var = this.f92368O;
                if (bny0Var == null) {
                    throw null;
                }
                mo99981B0(bny0Var.f76460a);
            }
            this.f92354H = null;
            this.f92347D = null;
            this.f92387X0 = null;
            m117313Y();
        } catch (Throwable th) {
            this.f92354H = null;
            this.f92347D = null;
            this.f92387X0 = null;
            m117313Y();
            throw th;
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: X */
    public void mo100001X() {
        m117319g0();
        m117301h0();
        this.f92384W = -9223372036854775807L;
        this.f92365M0 = false;
        this.f92363L0 = false;
        this.f92378T = false;
        this.f92380U = false;
        this.f92391k0 = false;
        this.f92392p0 = false;
        this.f92369O0 = -9223372036854775807L;
        this.f92371P0 = -9223372036854775807L;
        this.f92383V0 = -9223372036854775807L;
        this.f92359J0 = 0;
        this.f92361K0 = 0;
        this.f92357I0 = this.f92355H0 ? 1 : 0;
    }

    @CallSuper
    /* JADX INFO: renamed from: Y */
    public final void m117313Y() {
        mo100001X();
        this.f92364M = null;
        this.f92368O = null;
        this.f92356I = null;
        this.f92358J = null;
        this.f92360K = false;
        this.f92367N0 = false;
        this.f92362L = -1.0f;
        this.f92370P = 0;
        this.f92372Q = false;
        this.f92374R = false;
        this.f92376S = false;
        this.f92382V = false;
        this.f92355H0 = false;
        this.f92357I0 = 0;
        this.f92348E = false;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m117314Z() throws zziz {
        boolean zM117315a0 = m117315a0();
        if (zM117315a0) {
            m117311O0();
        }
        return zM117315a0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m117315a0() {
        if (this.f92354H == null) {
            return false;
        }
        int i = this.f92361K0;
        if (i == 3 || ((this.f92372Q && !this.f92367N0) || (this.f92374R && this.f92365M0))) {
            m117312W();
            return true;
        }
        if (i == 2) {
            int i2 = ggw0.f102568a;
            f5v0.m119535f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m117302j0();
                } catch (zziz e) {
                    svv0.m186112g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m117312W();
                    return true;
                }
            }
        }
        m117331x0();
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m117316b0() {
        return this.f92349E0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m117317c0(mhr0 mhr0Var) {
        return this.f92389Y0 == null && mo117306H0(mhr0Var);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean mo100004d0(bny0 bny0Var) {
        return true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: f0 */
    public final void m117318f0() throws zziz {
        int i = this.f92361K0;
        if (i == 1) {
            m117331x0();
            return;
        }
        if (i == 2) {
            m117331x0();
            m117302j0();
        } else if (i != 3) {
            this.f92375R0 = true;
            mo117305F0();
        } else {
            m117312W();
            m117311O0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m117319g0() {
        this.f92386X = -1;
        this.f92397v.f198945d = null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m117320i0(dny0 dny0Var) {
        this.f92381U0 = dny0Var;
        if (dny0Var.f87116c != -9223372036854775807L) {
            this.f92385W0 = true;
        }
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: k0 */
    public final boolean m117321k0() throws zziz {
        if (this.f92363L0) {
            this.f92359J0 = 1;
            if (this.f92374R) {
                this.f92361K0 = 3;
                return false;
            }
            this.f92361K0 = 2;
        } else {
            m117302j0();
        }
        return true;
    }

    @Override // p149l.u5y0
    /* JADX INFO: renamed from: l */
    public final int mo117322l(mhr0 mhr0Var) throws zziz {
        try {
            return mo99997U(this.f92394s, mhr0Var);
        } catch (zzth e) {
            throw m146601M(e, mhr0Var, false, 4002);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m117323l0() throws zziz {
        vmy0 vmy0Var = this.f92354H;
        if (vmy0Var == null || this.f92359J0 == 2 || this.f92373Q0) {
            return false;
        }
        if (this.f92386X < 0) {
            int iZza = vmy0Var.zza();
            this.f92386X = iZza;
            if (iZza < 0) {
                return false;
            }
            this.f92397v.f198945d = vmy0Var.zzf(iZza);
            this.f92397v.mo160161b();
        }
        if (this.f92359J0 == 1) {
            if (!this.f92382V) {
                this.f92365M0 = true;
                vmy0Var.mo107723a(this.f92386X, 0, 0, 0L, 4);
                m117319g0();
            }
            this.f92359J0 = 2;
            return false;
        }
        if (this.f92378T) {
            this.f92378T = false;
            ByteBuffer byteBuffer = this.f92397v.f198945d;
            byteBuffer.getClass();
            byteBuffer.put(f92343Z0);
            vmy0Var.mo107723a(this.f92386X, 0, 38, 0L, 0);
            m117319g0();
            this.f92363L0 = true;
            return true;
        }
        if (this.f92357I0 == 1) {
            int i = 0;
            while (true) {
                mhr0 mhr0Var = this.f92356I;
                mhr0Var.getClass();
                if (i >= mhr0Var.f133894n.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f92356I.f133894n.get(i);
                ByteBuffer byteBuffer2 = this.f92397v.f198945d;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i++;
            }
            this.f92357I0 = 2;
        }
        ByteBuffer byteBuffer3 = this.f92397v.f198945d;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        f0y0 f0y0VarM146597I = m146597I();
        try {
            int iM146596H = m146596H(f0y0VarM146597I, this.f92397v, 0);
            if (iM146596H == -3) {
                if (mo146609h()) {
                    this.f92371P0 = this.f92369O0;
                }
                return false;
            }
            if (iM146596H == -5) {
                if (this.f92357I0 == 2) {
                    this.f92397v.mo160161b();
                    this.f92357I0 = 1;
                }
                mo100012s0(f0y0VarM146597I);
                return true;
            }
            ylx0 ylx0Var = this.f92397v;
            if (ylx0Var.m219213f()) {
                this.f92371P0 = this.f92369O0;
                if (this.f92357I0 == 2) {
                    ylx0Var.mo160161b();
                    this.f92357I0 = 1;
                }
                this.f92373Q0 = true;
                if (!this.f92363L0) {
                    m117318f0();
                    return false;
                }
                try {
                    if (!this.f92382V) {
                        this.f92365M0 = true;
                        vmy0Var.mo107723a(this.f92386X, 0, 0, 0L, 4);
                        m117319g0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m146601M(e, this.f92345B, false, ggw0.m126082x(e.getErrorCode()));
                }
            }
            if (!this.f92363L0 && !ylx0Var.m219214g()) {
                ylx0Var.mo160161b();
                if (this.f92357I0 == 2) {
                    this.f92357I0 = 1;
                }
                return true;
            }
            boolean zM215313k = ylx0Var.m215313k();
            if (zM215313k) {
                ylx0Var.f198944c.m160078b(iPosition);
            }
            long j = this.f92397v.f198947f;
            if (this.f92377S0) {
                if (this.f92401z.isEmpty()) {
                    cdw0 cdw0Var = this.f92381U0.f87117d;
                    mhr0 mhr0Var2 = this.f92345B;
                    mhr0Var2.getClass();
                    cdw0Var.m106299d(j, mhr0Var2);
                } else {
                    cdw0 cdw0Var2 = ((dny0) this.f92401z.peekLast()).f87117d;
                    mhr0 mhr0Var3 = this.f92345B;
                    mhr0Var3.getClass();
                    cdw0Var2.m106299d(j, mhr0Var3);
                }
                this.f92377S0 = false;
            }
            long jMax = Math.max(this.f92369O0, j);
            this.f92369O0 = jMax;
            if (mo146609h() || this.f92397v.m219215h()) {
                this.f92371P0 = jMax;
            }
            this.f92397v.m215312j();
            ylx0 ylx0Var2 = this.f92397v;
            if (ylx0Var2.m219212e()) {
                mo100017y0(ylx0Var2);
            }
            mo99991Q0(this.f92397v);
            mo99986I0(this.f92397v);
            int i2 = this.f92386X;
            try {
                if (zM215313k) {
                    vmy0Var.mo107725c(i2, 0, this.f92397v.f198944c, j, 0);
                } else {
                    ByteBuffer byteBuffer4 = this.f92397v.f198945d;
                    if (byteBuffer4 == null) {
                        throw null;
                    }
                    vmy0Var.mo107723a(i2, 0, byteBuffer4.limit(), j, 0);
                }
                m117319g0();
                this.f92363L0 = true;
                this.f92357I0 = 0;
                this.f92379T0.f150419c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw m146601M(e2, this.f92345B, false, ggw0.m126082x(e2.getErrorCode()));
            }
        } catch (zzig e3) {
            mo100019z0(e3);
            m117326o0(0);
            m117331x0();
            return true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m117324m0() {
        return this.f92388Y >= 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m117325n0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        mhr0 mhr0Var = this.f92346C;
        return (mhr0Var != null && Objects.equals(mhr0Var.f133892l, "audio/opus") && r6r0.m178091f(j, j2)) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m117326o0(int i) throws zziz {
        ylx0 ylx0Var = this.f92396u;
        f0y0 f0y0VarM146597I = m146597I();
        ylx0Var.mo160161b();
        int iM146596H = m146596H(f0y0VarM146597I, this.f92396u, i | 4);
        if (iM146596H == -5) {
            mo100012s0(f0y0VarM146597I);
            return true;
        }
        if (iM146596H != -4 || !this.f92396u.m219213f()) {
            return false;
        }
        this.f92373Q0 = true;
        m117318f0();
        return false;
    }

    @Override // p149l.knx0, p149l.p5y0
    /* JADX INFO: renamed from: p */
    public void mo100009p(float f, float f2) throws zziz {
        this.f92352G = f2;
        m117328q0(this.f92356I);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m117327p0(long j) {
        if (this.f92350F == -9223372036854775807L) {
            return true;
        }
        m146600L();
        return SystemClock.elapsedRealtime() - j < this.f92350F;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m117328q0(@Nullable mhr0 mhr0Var) throws zziz {
        if (ggw0.f102568a >= 23 && this.f92354H != null && this.f92361K0 != 3 && mo146615s() != 0) {
            float f = this.f92352G;
            mhr0Var.getClass();
            float fMo99996T = mo99996T(f, mhr0Var, m146594F());
            float f2 = this.f92362L;
            if (f2 != fMo99996T) {
                if (fMo99996T == -1.0f) {
                    m117330u0();
                    return false;
                }
                if (f2 != -1.0f || fMo99996T > this.f92395t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo99996T);
                    vmy0 vmy0Var = this.f92354H;
                    vmy0Var.getClass();
                    vmy0Var.mo107722F(bundle);
                    this.f92362L = fMo99996T;
                }
            }
        }
        return true;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: r */
    public boolean mo100010r() {
        if (this.f92345B == null) {
            return false;
        }
        if (m146593E() || m117324m0()) {
            return true;
        }
        if (this.f92384W == -9223372036854775807L) {
            return false;
        }
        m146600L();
        return SystemClock.elapsedRealtime() < this.f92384W;
    }

    /* JADX INFO: renamed from: r0 */
    public abstract tnx0 mo100011r0(bny0 bny0Var, mhr0 mhr0Var, mhr0 mhr0Var2);

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    @Nullable
    @CallSuper
    /* JADX INFO: renamed from: s0 */
    public tnx0 mo100012s0(f0y0 f0y0Var) throws zziz {
        boolean z = true;
        this.f92377S0 = true;
        mhr0 mhr0Var = f0y0Var.f94022a;
        mhr0Var.getClass();
        int i = 0;
        if (mhr0Var.f133892l == null) {
            throw m146601M(new IllegalArgumentException("Sample MIME type is null."), mhr0Var, false, 4005);
        }
        this.f92389Y0 = f0y0Var.f94023b;
        this.f92345B = mhr0Var;
        if (this.f92349E0) {
            this.f92353G0 = true;
            return null;
        }
        vmy0 vmy0Var = this.f92354H;
        if (vmy0Var == null) {
            this.f92364M = null;
            m117311O0();
            return null;
        }
        bny0 bny0Var = this.f92368O;
        bny0Var.getClass();
        mhr0 mhr0Var2 = this.f92356I;
        mhr0Var2.getClass();
        dly0 dly0Var = this.f92387X0;
        dly0 dly0Var2 = this.f92389Y0;
        if (dly0Var != dly0Var2) {
            m117330u0();
            return new tnx0(bny0Var.f76460a, mhr0Var2, mhr0Var, 0, 128);
        }
        boolean z2 = dly0Var2 != dly0Var;
        f5v0.m119535f(!z2 || ggw0.f102568a >= 23);
        tnx0 tnx0VarMo100011r0 = mo100011r0(bny0Var, mhr0Var2, mhr0Var);
        int i2 = tnx0VarMo100011r0.f171296d;
        if (i2 == 0) {
            m117330u0();
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (m117328q0(mhr0Var)) {
                    this.f92356I = mhr0Var;
                    if (z2 && !m117321k0()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (m117328q0(mhr0Var)) {
                this.f92355H0 = true;
                this.f92357I0 = 1;
                int i3 = this.f92370P;
                if (i3 != 2 && (i3 != 1 || mhr0Var.f133897q != mhr0Var2.f133897q || mhr0Var.f133898r != mhr0Var2.f133898r)) {
                    z = false;
                }
                this.f92378T = z;
                this.f92356I = mhr0Var;
                if (z2 && !m117321k0()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
        } else if (m117328q0(mhr0Var)) {
            this.f92356I = mhr0Var;
            if (z2) {
                if (!m117321k0()) {
                    i = 2;
                }
            } else if (this.f92363L0) {
                this.f92359J0 = 1;
                if (this.f92374R) {
                    this.f92361K0 = 3;
                    i = 2;
                } else {
                    this.f92361K0 = 1;
                }
            }
        } else {
            i = 16;
        }
        if (tnx0VarMo100011r0.f171296d == 0 || (this.f92354H == vmy0Var && this.f92361K0 != 3)) {
            return tnx0VarMo100011r0;
        }
        return new tnx0(bny0Var.f76460a, mhr0Var2, mhr0Var, 0, i);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m117329t0() {
        this.f92353G0 = false;
        this.f92399x.mo160161b();
        this.f92398w.mo160161b();
        this.f92351F0 = false;
        this.f92349E0 = false;
        this.f92344A.m146361b();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m117330u0() throws zziz {
        if (this.f92363L0) {
            this.f92359J0 = 1;
            this.f92361K0 = 3;
        } else {
            m117312W();
            m117311O0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public abstract rmy0 mo100013v0(bny0 bny0Var, mhr0 mhr0Var, @Nullable MediaCrypto mediaCrypto, float f);

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
    @Override // p149l.p5y0
    /* JADX INFO: renamed from: w */
    public void mo100014w(long r21, long r23) throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.eny0.mo100014w(long, long):void");
    }

    /* JADX INFO: renamed from: w0 */
    public abstract List mo100015w0(xny0 xny0Var, mhr0 mhr0Var, boolean z) throws zzth;

    /* JADX INFO: renamed from: x0 */
    public final void m117331x0() {
        try {
            vmy0 vmy0Var = this.f92354H;
            f5v0.m119531b(vmy0Var);
            vmy0Var.zzi();
        } finally {
            mo100001X();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public abstract void mo100017y0(ylx0 ylx0Var) throws zziz;

    /* JADX INFO: renamed from: z0 */
    public abstract void mo100019z0(Exception exc);

    @Override // p149l.p5y0
    public boolean zzV() {
        return this.f92375R0;
    }

    @Override // p149l.knx0, p149l.u5y0
    public final int zze() {
        return 8;
    }

    /* JADX INFO: renamed from: F0 */
    public void mo117305F0() throws zziz {
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo99991Q0(ylx0 ylx0Var) throws zziz {
    }

    /* JADX INFO: renamed from: V */
    public void mo99998V(mhr0 mhr0Var) throws zziz {
    }
}
